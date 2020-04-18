abstract class Account{
	String name,gender;
	float balance;
	float interest = (float)3.75;
	Account(String name , float balance,String gender){
		this.name = name;
		this.balance = balance;
                this.gender = gender;
	}

	abstract float deposite(int amount);

	abstract void withdraw(int amount);

	abstract void changeInterest(float interest);

	abstract void addInterest(int year);
}