import java.util.Scanner;
import java.util.HashMap;
public class MainFile {
 static void SavingsAccount(int accNum, String name, float balance, String gender, HashMap hm){
	    SavingsAccount sa = new SavingsAccount(name , balance, gender);
            hm.put(accNum,new SavingsAccount(name , balance, gender));
        
                 if( "male".equals(gender)){
                     System.out.println("\nHello ! Sir");}
                 else if("female".equals(gender)){
                          System.out.println("\nHello ! Ma'am");}
                          System.out.println("Your Account Has Been Created successfully.\nName : "+name+"\nAccount Number : "+accNum+"\nGender : "+gender);
                          System.out.println("Your Balance is Now : "+balance);    
               
	}
	static void CurrentAccount(int accNum, String name, float balance, String gender, HashMap hm){
		CurrentAccount obj = new CurrentAccount(name , balance, gender);
		hm.put(accNum, new CurrentAccount(name , balance, gender));
                
                   if( "male".equals(gender)){
                     System.out.println("\nHello ! Sir");}
                 else if("female".equals(gender)){
                          System.out.println("\nHello ! Ma'am");}
                          System.out.println(" Your Account Has Been Created successfully.\n Name : "+name+"\nAccount Number : "+accNum+"\nGender : "+gender);
                          System.out.println("\n Your Balance is Now : "+balance);    
               
	}
   
    public static void main(String[] args) {
     int a, m, r, s, yr, accNum = 1, ac;
            float bal,rate;
            String name,gender;
	         	Scanner input = new Scanner(System.in);
            HashMap<Integer, SavingsAccount> sav = new HashMap<>();
            HashMap<Integer, CurrentAccount> cur = new HashMap<>();
            while (true){
                try{
                    System.out.println("\n HI ! I AM A BANK INFO BOT...HOW CAN I HELP YOU?");
                System.out.println("\n M E N U :\n\n 1) CREATE ACCOUNT\n\n 2) CHANGE INTEREST RATE\n\n 3) ADD INTEREST \n\n 4) DEPOSIT MONEY \n");
                System.out.print(" 5) WITHDRAW MONEY\n\n 6) MONEY TRANSFER\n\n 7) ACCOUNT INFO\n\n 8) EXIT\n \n---> ");
                m = input.nextInt();
                    OUTER:
                    OUTER_1:
                    OUTER_2:
                    OUTER_3:
                    switch (m) {
                        case 1 : //Creating new account
                            System.out.print(" 1) Create SavingsAccount\n 2) Create CurrentAccount \n---> ");
                            m = input.nextInt();
                            input.nextLine();
                            System.out.print("\nEnter Name : ");
                            name = input.nextLine();
                            System.out.print("\nEnter Balance : ");
                            bal = input.nextFloat();
                            input.nextLine();
                            System.out.print("\nGender : ");
                            gender = input.nextLine();
                            switch (m) {
                                case 1:
                                   
                                    SavingsAccount(accNum , name , bal ,gender, sav );
                                    accNum++;                                
                                    break;
                                case 2:
                                    CurrentAccount(accNum, name, bal,gender, cur);
                                    accNum++;
                                           }
                            break;
                        case 2:
                            System.out.print(" 1) Savings Account Rate \n 2) Current Account Rate \n--->");
                            m = input.nextInt();
                            switch (m) {
                                case 1:
                                    System.out.print("Enter Your Account Number : ");
                                    accNum = input.nextInt();
                                    System.out.print("Enter Interest rate : ");
                                    rate = input.nextFloat();
                                    sav.get(accNum).changeInterest(rate);
                                    System.out.println("Change Interest Rate Successfully");
                                    break OUTER;
                                case 2:
                                    System.out.print("Enter Your Account Number : ");
                                    accNum = input.nextInt();
                                    System.out.print("Enter Interest rate : ");
                                    rate = input.nextFloat();
                                    cur.get(accNum).changeInterest(rate);
                                    System.out.println("Change Interest Rate Successfully");
                                    break OUTER;
                                default:
                                    System.out.println("Wrong Option !!!");
                                    break;
                            }
                        case 3:
                            System.out.print("\n 1) Savings Account Update \n 2) Current Account Update \n---> ");
                            m = input.nextInt();
                            System.out.print("Enter Account number : ");
                            ac = input.nextInt();
                            System.out.print("Enter year of interest : ");
                            yr = input.nextInt();
                            switch (m) {
                                case 1:
                                    sav.get(ac).addInterest(yr);
                                    System.out.print("\n Balance Updated Successfully\n New Balance - " + sav.get(ac).balance);
                                    break OUTER_1;
                                case 2:
                                    cur.get(ac).addInterest(yr);
                                    System.out.print("\n Balance Updated Successfully\n New Balance - " + cur.get(ac).balance);
                                    break OUTER_1;
                                default:
                                    System.out.println("Wrong Option !!!");
                                    break;
                            }
                        case 4:
                            System.out.print("\n 1) To Savings Account \n 2) To Current Account \n---> ");
                            m = input.nextInt();
                            System.out.print("\n Enter Account Number : ");
                            ac = input.nextInt();
                            System.out.print("\n Enter Amount : ");
                            a = input.nextInt() ;
                            switch (m) {
                                case 1:
                                    sav.get(ac).deposite(a);
                                    System.out.print("\n Current Balance - " + sav.get(ac).balance);
                                    break OUTER_2;
                                case 2:
                                    cur.get(ac).deposite(a);
                                    System.out.print("\n Current Balance - " + cur.get(ac).balance);
                                    break OUTER_2;
                                default:
                                    System.out.println("Wrong Option!!!");
                                    break;
                            }
                            break;
                        case 5:
                            System.out.print("\n 1) From Savings Account \n 2) From Current Account \n---> ");
                            m = input.nextInt();
                            System.out.print("\n Enter Account Number : ");
                            ac = input.nextInt();
                            System.out.print("\n Enter Amount : ");
                            a = input.nextInt();
                            switch (m) {
                                case 1:
                                    sav.get(ac).withdraw(a);
                                    System.out.print("\n Current Balance- " + sav.get(ac).balance);
                                    break OUTER_3;
                                case 2:
                                    cur.get(ac).withdraw(a);
                                    System.out.print("\n Current Balance - " + cur.get(ac).balance);
                                    break OUTER_3;
                                default:
                                    System.out.println("Wrong Option!!!");
                                    break;
                            }
                            break;
                        case 6 : //Transfer Amount
                            System.out.println(" 1) From Savings to Saving Account");
                            System.out.println(" 2) From Savings to Current Account");
                            System.out.println(" 3) From Current to Savings Account");
                            System.out.println(" 4) From Current to Current Account \n --->");
                            m = input.nextInt();
                            System.out.print("\n Enter Sender Account Number : ");
                            s = input.nextInt();
                            System.out.print("\n Enter Reciever Account Number : ");
                            r = input.nextInt();
                            System.out.print(" Enter Amount : ");
                            a = input.nextInt();
                            
                    switch (m) {
                        case 1:
                            sav.get(s).withdraw(a);
                            sav.get(r).deposite(a);
                            System.out.println(" Recievers Current Balance " + sav.get(r).balance );
                            break;
                        case 2:
                            sav.get(s).withdraw(a);
                            cur.get(r).deposite(a);
                            System.out.println(" Recievers Current Balance " + cur.get(r).balance );
                            break;
                        case 3:
                            cur.get(s).withdraw(a);
                            sav.get(r).deposite(a);
                            System.out.println(" Recievers Current Balance " + sav.get(r).balance );
                            break;
                        case 4:
                            cur.get(s).withdraw(a);
                            cur.get(r).deposite(a);
                            System.out.println(" Recievers Current Balance " + cur.get(r).balance );
                            break;
                        default:
                            System.out.println(" Wrong option !");
                            break;
                    }
                            break;
                        case 7 : //Show Account Info
                            System.out.print(" 1) Savings Account Info \n 2) Current Account Info \n---> ");
                            m = input.nextInt();
                            System.out.print("Enter Account number : ");
                            accNum = input.nextInt();
                    switch (m) {
                        case 1:
                            System.out.println("Name : " + sav.get(accNum).name);
                            System.out.print("Balance : " + sav.get(accNum).balance);
                            System.out.println("Gender : "+sav.get(accNum).gender);
                            break;
                        case 2:
                            System.out.println("Name : " + cur.get(accNum).name);
                            System.out.println("Balance : " + cur.get(accNum).balance);
                            System.out.println("Gender : "+sav.get(accNum).gender);
                            break;
                        default:
                            System.out.println(" Wrong Option!!!");
                            break;
                    }
                            break;
                        case 8 : //Exit
                            break;
                        default : //Invalid Option
                            System.out.println(" Invalid Option!!!");
                    }
            }
            catch(Exception e){
                System.out.println(e);
               
                    
            }
            }
	}
 
    }