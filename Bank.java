class InsufficientFundsException extends Exception
{
	int needs;
	InsufficientFundsException(int needs)
	{
		this.needs = needs;
	}
	int getNeeds()
	{
	return this.needs;
	}
}
class Account
{
int balance;
Account(int amount)
{
	this.balance = amount;
}
int getBalance()
{
	return this.balance;
}
void withdraw(int amount) throws InsufficientFundsException
{
	System.out.println("trying to withdraw ... : " + amount);
	System.out.println("balance in account : "+ this.balance);
if(amount <= this.balance)
{
	System.out.println("pls collect the cash :"+amount);
	this.balance = this.balance-amount;
}
else
{
	int needs = amount - this.balance;
	throw new InsufficientFundsException(needs);
}
}
}
class Bank
{
public static void main(String[] args)
{
	Account acc = new Account(6000);
System.out.println("initial balance : "+acc.getBalance());
try
{
	acc.withdraw(4000);
	System.out.println("balance : "+acc.getBalance());
	acc.withdraw(3000);
	System.out.println("balance : "+acc.getBalance());
}
catch(InsufficientFundsException ife)
{
	System.out.println("transaction failed due to less amount in the account : "+ife.getNeeds());
}
System.out.println("end");
}
}