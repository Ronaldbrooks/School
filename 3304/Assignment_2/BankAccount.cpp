#include <iostream>
#include <string>
#include "BankAccount.h"

using namespace std;

BankAccount::BankAccount()
{
Balance = 0;
Interest = 0;
Time = 0;
    
}

int main() 
{
    double Amount;
    double rate;
    double timee;
    int loop = 1;
    int  option = 1;
    
    BankAccount call;
    call.setBalance(0.0);
    
    while (loop != 0)
    {
    
    cout<<"Here are your options: "<<endl<<endl;
    cout<<"1: Depost  \t"<<"2: Withdraw"<<endl;
    cout<<"3: Balance  \t"<<"4: Interest"<<endl;     
    cout<<"The exit press 0:"<<endl;
    cout<<":";
    
    cin >> option; 
    if (option==1)
     {
        cout << "Enter deposit amount: " << endl;
        cin >> Amount;
        call.Deposit(Amount);
     }
    if (option==2)
     {
         cout << "Enter withdraw amount: " << endl;
         cin >> Amount;
         call.Withdraw(Amount);    
     }
    if (option==3)
     {
        double balance = call.getBalance();
        cout << balance << endl;
     }
    
    if (option==4)
     {
        cout << "Enter your Interest Rate: " << endl <<endl;
        cin >> rate;
        call.setInterestRate(rate);
        cout << "Enter your time period in years: " << endl <<endl;
        cin >> timee;
        call.setTime(timee);
        double adjustedRate = call.InterestRate(); 
        cout << "Your Interest for " << timee << " years " << "at a rate of " << rate << " is " << adjustedRate << endl << endl; 
     }
            
    }
return 0;
}

    
    
//------------------------------------------------------------------    
void BankAccount::Deposit(double amount)
    {
            Balance = Balance + amount;
    }
void BankAccount::Withdraw(double amount)
    {
            Balance = Balance - amount;
    }
double BankAccount::getBalance() const
    {
            return Balance;
    }
void BankAccount::setBalance(double newBalance)
    {
            Balance = newBalance;
    }
void BankAccount::setTime(double newTime)
    {
            Time = newTime;
    }
void BankAccount::setInterestRate(double newRate)
    {
            Interest = newRate;
    }    
double BankAccount::InterestRate() const
    {
           double AdjustedRate = Balance * (1+ Time * Interest);
    }
    