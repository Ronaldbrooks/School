#include <iostream>

using namespace std;
void copyArr(int arr[], int copy[], int length)
{
    for(int i = 0; i < length; ++i)
    {
        copy[i] = arr[i];
    }
}

void print(int arr[], int length)
{
    for(int i = 0; i < length; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;

}

void randomArr(int arr[], int length)
{
    int random;

    for (int i = 0; i < length; i++)
    {
        random = (rand() % 1000 + 1);
        arr[i] = random;
    }
}

int partition (int arr[], int low, int high)
{
    int i = low, j = high;
    int mid = arr[low + (high - low) / 2];

    while (i <= j)
    {
        while (arr[i] < mid)
            i++;
        while (arr[j] > mid)
            j--;
        if (i <= j)
        {
            swap(arr[j],arr[i]);
            i++;
            j--;
        }
    };
}

void insertionSort(int arr[], int length)
{
    int i, j;

    for (i = 1; i < length; i++)
    {
        for (j = i; j >= 1; j--)
        {
            if (arr[j] < arr[j-1])
            {
                swap(arr[j], arr[j - 1]);
            }
        }
    }
}

void selectionSort(int arr[], int length)
{
    int i, j, min;

    for (i = 0; i < length - 1; i++)
    {
        min = i;
        for (j = i + 1; j < length; j++)
        {
            if (arr[j] < arr[min])
                min = j;
        }
        swap(arr[min], arr[i]);
    }
}

void bubbleSort(int arr[], int length)
{
    for (int i = 0; i < length; ++i)
    {
        for (int j = 0; j < length - 1; j++)
            if (arr[j] > arr[j + 1])
            {
                swap(arr[j],arr[j + 1]);
            }
    }
}

void merge(int *arr, int low, int high, int mid)
{
    int i, b, a, c[50];
    i = low;
    a = low;
    b = mid + 1;

    while (i <= mid && b <= high)
    {
        if (arr[i] < arr[b])
        {
            c[a] = arr[i];
            a++;
            i++;
        }
        else
        {
            c[a] = arr[b];
            a++;
            b++;
        }
    }
    while (i <= mid)
    {
        c[a] = arr[i];
        a++;
        i++;
    }
    while (b <= high)
    {
        c[a] = arr[b];
        a++;
        b++;
    }
    for (i = low; i < a; i++)
    {
        arr[i] = c[i];
    }
}

void mergeSort(int *arr, int low, int high)
{
    int mid;
    if (low < high)
    {
        mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr , mid + 1, high);
        merge(arr, low, high, mid);
    }
}

void quickSort(int arr[], int low, int high)
{
    int p = partition(arr, low, high);

    if (low < p - 1)
    {
        quickSort(arr, low, p - 1);
    }
    if (p + 1 < high)
    {
        quickSort(arr, p + 1, high);
    }
}
