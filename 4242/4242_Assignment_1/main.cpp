//Course:       CS4242
//Student name: Ronald Brooks
//Student ID:   000467751
//Assignment #: #1
//Due Date:     02/20/2018
//Signature:    _______________
//Score:        _______________


#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

int main()
{
    srand(time(0));
    int i = 0, j, x = 0, y = 0;

    const int SIZE = 5;
    int direction[] = {1, -1};
    int lower_limit[] = {0, SIZE - 1};
    int count = 0;
    int k = 0;

    //5x5 array
    int array[5][5];
    int dirt, total = 0, num = 0;

    //initiate random array
    for (x = 0; x < 5; x++)
    {
        for (y = 0; y < 5; y++)
        {
            array[x][y] = rand() % 2;
            if (array[x][y] == 1)
            {
                total++;
            }
        }
    }

    //for every row
    for (int i = 0; i < SIZE; i++)
    {
        //search the row from left to right
        int j = lower_limit[k];
        for(int l = 0; l < SIZE; ++l)
        {
            //find dirt and clean it
            if (array[i][j])
            {
                cout << "found dirt in row: " << i << " column: " << j << '\n';
                ++count;
            }
            j += direction[k];
        }
        k = ( k == 0 ) ? 1 : 0;
    }
}