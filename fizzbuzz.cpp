// Example program
#include <iostream>
#include <string>
using namespace std;


int main()
{

    int x;
    for(x= 1; x <=100; x++)
    {
        if(x % 3 == 0)
        {
           cout << "fizz ";
        }
        if(x % 5 == 0)
        {
            cout << "buzz ";
        }
        else if (x % 5 != 0 && x % 3 != 0)
        {
            cout << x << " ";
        }
        cout <<endl;
    }
}
