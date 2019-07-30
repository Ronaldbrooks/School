#ifndef BANKACCOUNT_H
#define BANKACCOUNT_H

using namespace std;

class BankAccount
{
private:
    double Balance;
    double Interest;
    double Time;
    
public:
    BankAccount();
    BankAccount(double bal, double Rate, double time){Balance = bal; Interest = Rate; Time = time;}
    void Deposit(double amount);
    void Withdraw(double amount);
    double getBalance() const;
    void setBalance(double newBalance);
    double InterestRate() const;
    void setInterestRate(double newRate);
    void setTime(double newTime);

};

#endif // BANKACCOUNT_H