#include <iostream>

using namespace std;

int main()
{
    double num;

    cout << "Enter a number: ";
    cin >> num;
    
    int sum = 0;
    for(int n = 0; n <= num; n++)
    {
      sum+=n;   
    }
    
    cout << sum;
    return 0;
}