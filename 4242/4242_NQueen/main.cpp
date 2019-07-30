#include <iostream>
#include <math.h>
#include <cstdlib>
#include <time.h>

using namespace std;

// N queen size
int N = 8;

// inital population size
int popSize;

// takes the top 'SurvivalRate'
double SurvivalRate = 0.05;

// determines to percentage of random queen positions in a board to alter
double MutationRate;

class Board
{
public:
    int* queens;

    Board()
    {
        queens = new int[N];

        srand((unsigned)time(0));
        for(int j = 0; j < N; j++) {
            queens[j] = (rand()%N);
        }
    }

    void Print()
    {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < queens[i]; j++) {
                cout << "| ";
            }
            cout << "|Q";
            for(int j = 0; j < N - queens[i] - 1; j++) {
                cout << "| ";
            }
            cout << "|\n";
        }
    }

    int Conflicts()
    {
        int colCount[N] = {0};
        int upperDiagCount[(2*N) - 1] = {0};
        int lowerDiagCount[(2*N) - 1] = {0};

        for(int i = 0; i < N; i++) {
            colCount[queens[i]] += 1;
            upperDiagCount[queens[i] + i] +=1;
            lowerDiagCount[(N - queens[i]) + i - 1] +=1;
        }
        int conflicts = 0;
        for(int i = 0; i < 2 * N - 1; i++) {
            if(i < N) {
                conflicts += ((colCount[i] - 1) * colCount[i]) / 2;
            }
            conflicts += ((upperDiagCount[i] - 1) * upperDiagCount[i]) / 2;
            conflicts += ((lowerDiagCount[i] - 1) * lowerDiagCount[i]) / 2;
        }
        return conflicts;
    }

    void Mutate()
    {
        int mutationCount = max(min((int)floor(MutationRate*N), N), 1);
        for(int i = 0; i < mutationCount; i++)
        {
            //random position
            int j = (rand()%N);
            //random value
            char v = (rand()%N);
            queens[j] = v;
        }
    }

    Board Mate(Board Parent)
    {
        Board Child;
        //random position between 1 and N-1
        int r = (rand()%(N-1))+1;
        for(int i = 0; i < r; i++) {
            Child.queens[i] = queens[i];
        }
        for(int i = r; i < N; i++) {
            Child.queens[i] = Parent.queens[i];
        }
        return Child;
    }
};

// the population of boards
Board* Population;

void generatePopulation()
{
    Population = new Board[popSize];
    for(int i = 0; i < popSize; i++) {
        Population[i] = Board();
    }
}

void sortPopulation(int L, int R)
{
    int i = L, j = R;
    Board tmp;
    int pivot = Population[(L+R) / 2].Conflicts();
    while(i <= j) {
        while(Population[i].Conflicts() < pivot) {
            i++;
        }

        while(Population[j].Conflicts() > pivot) {
            j--;
        }

        if(i <= j) {
            tmp = Population[i];
            Population[i] = Population[j];
            Population[j] = tmp;
            i++;
            j--;
        }
    };

    if(L < j) {
        sortPopulation(L, j);
    }
    if(i < R) {
        sortPopulation(i, R);
    }
}

int Genetic()
{
    int numberOfMoves = 0;

    int lastNumberOfConflictsInPopulation = -1;
    while(true)
    {
        // sort population by fitness level
        sortPopulation(0, popSize - 1);
        int fewestConflictsInPopulation = Population[0].Conflicts();
        if(lastNumberOfConflictsInPopulation != fewestConflictsInPopulation)
        {
            lastNumberOfConflictsInPopulation = fewestConflictsInPopulation;
        }
        if(fewestConflictsInPopulation == 0)
        {
            break;
        }

        // mate the top 'SurvivalRate' of the population
        // each board will mate with '1-SurvivalRate' others of the 'SurvivalRate' population
        // the childern will replace the other '1-SurvivalRate' of the population
        int cut = min(popSize - 1, max((int)floor(popSize*SurvivalRate), 1));
        int numberOfKids = floor(1/SurvivalRate)-1;
        for(int i=cut, j=0; i < popSize; i+=numberOfKids, j++)
        {
            for(int k=0; k<numberOfKids; k++)
            {
                Population[i + k] = Population[j].Mate(Population[(j + k)%cut]);
            }
        }

        // mutate every board with the mutation rate
        for(int i = 0; i < popSize; i++)
        {
            Population[i].Mutate();
        }

        // now that we have a new generation incrment the number of moves
        numberOfMoves++;
    }

    return numberOfMoves;
}

int main(int argc, const char *argv[])
{
    if(argc == 5)
    {
        N = atoi(argv[1]);
        popSize = atoi(argv[2]);
        SurvivalRate = atof(argv[3]);
        MutationRate = atof(argv[4]);
    } else if(argc > 2) {
        cerr << "Usage:\n\t" << argv[0] << endl;
        cerr << "\t" << argv[0] << " [Number of Queens]" << endl;
        cerr << "\t" << argv[0] << " [Number of Queens] [Population Size] [Survival Rate] [Mutation Rate]" << endl;
        exit(1);
    } else {
        if(argc == 2)
        {
            N = atoi(argv[1]);
        }

        popSize = max(min(N*N, 10240), 512);
        MutationRate = 1.0/(double)N;
    }
    if(N < 4)
    {
        cerr << "No solutions. The number of Queens is less than 4." << endl;
        exit(2);
    }

    popSize = max(min(popSize, 10240), 512);
    SurvivalRate = max(min(SurvivalRate, 1.0), 0.0);
    MutationRate = max(min(MutationRate, 1.0), 0.0);

    generatePopulation();

    cout << "Number of Moves: " << Genetic() << endl;

    if(N<=20)
    {
        Population[0].Print();
    }

    return 0;
}