class SavingsAccount extends Account{

	SavingsAccount(String name ,float balance, String gender){
		super(name , balance, gender);
	}
       
        @Override
	 void changeInterest(float i){
		interest = i;
	}
        @Override
	 void addInterest(int year){
          for(int i = 1 ; i<=year ; i++){
			
                        balance = balance + (balance * year * interest) / 100;
		}
	}
        @Override
	float deposite(int amount){
	balance = balance + amount;
		return balance;
	}
        @Override
	 void withdraw(int amount){
		if((super.balance-amount)>=100){
			balance = balance-amount;
		}
		else{
			System.out.println("Must have at least 100$ amount remaining after withdrawal \nEnter a smaller amount");
		}
	}
         
}