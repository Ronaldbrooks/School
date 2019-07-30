#include <iostream>
#include <iomanip>
#include <time.h>
#include <conio.h>
#include "implementations.h"

using namespace std;

int main()
{
    int length = 100000;

    int a[length] = {};
    int b[length] = {};
    int c[length] = {};
    int d[length] = {};
    int e[length] = {};

    randomArr(a,length);

    copyArr(a, b, length);
    copyArr(a, c, length);
    copyArr(a, d, length);
    copyArr(a, e, length);

    clock_t t,t2,t3,t4,t5;


//insertion sort
    t = clock();
    cout << "Running insertion sort... ";
    insertionSort(a, length);
    t = clock() - t;
    cout << "Time: " << setprecision(5) << (float)t / CLOCKS_PER_SEC  << "s"  << endl;
    cout << "Enter to continue" << endl;
    getch();

//selection sort
    t2 = clock();
    cout << "Running selection sort... ";
    selectionSort(b, length);
    t2 = clock() - t2;
    cout << "Time: " << setprecision(5) << (float)t2 / CLOCKS_PER_SEC  << "s"  << endl;
    cout << "Enter to continue" << endl;
    getch();

//bubble sort
    t3 = clock();
    cout << "Running bubble sort... ";
    bubbleSort(c, length);
    t3 = clock() - t3;
    cout << "Time: " << setprecision(5) << (float)t3 / CLOCKS_PER_SEC  << "s"  << endl;
    cout << "Enter to continue" << endl;
    getch();

//merge sort
    t4 = clock();
    cout << "Running merge sort... ";
    mergeSort(d, 0,length - 1);
    t4 = clock() - t4;
    cout << "Time: " << setprecision(5) << (float)t4 / CLOCKS_PER_SEC  << "s"  << endl;
    cout << "Enter to continue" << endl;
    getch();

//quick sort
    t5 = clock();
    cout << "Running quick sort... ";
    quickSort(e, 0, length - 1);
    t5 = clock() - t5;
    cout << "Time: " << setprecision(5) << (float)t5 / CLOCKS_PER_SEC  << "s"  << endl;
    cout << "Done";

}


//5.1 Implement Insertion Sort.

//5.2 Implement Selection Sort.

//5.3 Implement Bubble Sort.

//5.4 Implement Merge Sort.

//5.5 Implement Quick Sort.

//5.6 -5.8 Compare the run times of the sorting algorithms on the same inputs and
//explain why or why not the Big-O Estimates for each algorithm is consistent with
//the run times that you observed.
