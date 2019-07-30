//WRITTEN IN C
# include <stdio.h>

int main ()
{
  const int SIZE = 0;
  int numbers[SIZE];
  int numAMT = 0;
  int done = 0;

// Obtain user input/amount of numbers
  printf("How many numbers? ");
  scanf("%d", &SIZE);

// while loop for specific number of inputs
  while (!done)
  {
    printf("enter a number: ");
    int number;
    scanf("%d", &number);
    
    if (number < 0)
        done = 1;
// numAMT to prevent infinite loop
    else if (number >= 0)
     {
         numbers[numAMT] = number;
         numAMT++;
         if (numAMT == SIZE)
                done = 1;
     }
     else
         printf("Not a number. Try again.\n");
  } 
// Calculate the average
        int sum =0;
        int i;
        for(i = 0; i < numAMT; i++)
                sum += numbers[i];
        float ave = (float)sum / numAMT;
        printf ("average: %f\n", ave);
  return 0;
}
