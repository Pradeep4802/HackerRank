package com.Bank.project;

public class Banks {
	static User us[] = new User[5];
	static CurrentAccount ca[] = new CurrentAccount[5];
	static FixedDeposit fd[] = new FixedDeposit[5];
	
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static int countUser1 = 1;
	public static int countUser2 = 0;
	
	// method for checking balance
	public static void checkBalance(double b) {
		System.out.println("------------------CHECK BALANCE---------------------");
		double bal = b;
		System.out.println("Balance: " + bal);
		System.out.println("------------------BALANCE CHECKED---------------------");
	}
	
	// method for registering user
	public void registerUser() {
		int id=0,acc;
		String name,email,pass;
		long contact;
		
		
		System.out.println("-----------------Registration Page------------------");
		System.out.println("Enter ID, NAME, CONTACT, EMAIL, PASSWORD");
		id = sc.nextInt();
		name = sc.next();
		contact = sc.nextLong();
		email = sc.next();
		pass = sc.next();
		acc = generateAccountUser();
		us[countUser2++] = new User(id,name,contact,email,acc,pass,"Saving");
		System.out.println("Account Number: " + acc);
		System.out.println("-----------------Registered Successfully------------------");
	}
	
	// method for generating account number to the user 
	public static int generateAccountUser() {
		return countUser1++;
	}
	
	//method for displaying user details
	public static void userDetail(int id) {
		System.out.println();
		System.out.println("-----------------------USER DETAILS-------------------");
		for(User u : us) {
			if(u != null) {
				if(u.getId() == id) {
					System.out.println(u);
				}
			}
		}
		System.out.println("--------------------------------------------------------");
	}
	
	// method for depositing amount to the bank account
	public static double depositBal() {
		System.out.println();
		
		System.out.println();
		System.out.println("------------------Enter the Amount TO DEPOSIT----------------");
		double depositAmount = sc.nextDouble();
		return depositAmount;
	}
	
	// method for withdrawing amount from the bank
	public static double withdrawBal() {
		System.out.println("------------------Enter the Amount TO WITHDRAW----------------");
		double withdrawAmount = sc.nextDouble();
		return withdrawAmount;
	}
	
	// entry point of the program main() method
	public static void main(String args[]) {
		
		int innerLoginChoice = 0;
		int choice = 0;
//		int loginChoice = 0;
		
		// creating an object of banks class.
		Banks bk = new Banks();
		
		do {
			// starting point of the program
			System.out.println("EnTer 1 For Register.");
			System.out.println("      2 For Login.");
			
			// taking input from user
			choice = sc.nextInt();
			
			// switch case was initialized
			switch(choice) {
			
			case 1:
				// when case 1 was selected for register the user
				bk.registerUser();
				break;
				
			case 2:
				// when case 2 was selected to login  into the bank user account.
				System.out.println("-----------------Login Page------------------");
				
				// Enter the account number to verify the user
				System.out.println("-------------Enter Account Number-----------------");
				int accNum1 = sc.nextInt();
				
				// Enter the password to verify the user
				System.out.println("-------------Enter Password-----------------");
				String password = sc.next();
				
				// using enhance for loop for every user verification if the user found then login into that account
				for(User s : us) {
					
					// if statement to check the any array is not NULL or not.
					if(s != null) {
						
						// nested if statement for verifying the user that he was entering correct information or not.
						if(s.getAccount() == accNum1 && s.getPassword().equals(password)) {
							System.out.println("--------------------Login Successfully-----------------");
							
							// using do-while loop to repeat the process until user enter incorrect details.
							do {
								
								// entering point after user login successfully
								System.out.println();
								System.out.println("Enter 1 Check User Details.");
								System.out.println("      2 Check Balance.");
								System.out.println("      3 Deposit.");
								System.out.println("      4 Withdraw.");
								System.out.println("      5 Exit.");
								
								// Taking input for switch case for showing list of function for user
								innerLoginChoice = sc.nextInt();
								
								// inner switch case started
								switch(innerLoginChoice) {
								
								// case 1 for displaying user details at screen
								case 1:
									userDetail(s.getId());
									break;
								
								// case 2 for checking the balance of the user
								case 2:
									checkBalance(s.getBalance());
									break;
									
								// case 3 for deposit the amount into the account
								case 3:
									double amount = depositBal();
									s.setBalance(amount);
									break;
									
								// case 4 for withdrawing the amount from the account
								case 4:
									double with = withdrawBal();
									if(with <= s.getBalance()) {
										s.setWithdraw(with);
									}
									else {
										System.out.println("----------Amount is not sufficient----------");
									}
									break;
								
								// case 5 for exiting
								case 5:
									System.out.println("----------------------Exit----------------------");
									break;
									
								// default for wrong input.
								default: 
									System.out.println("Enter Correct details: ");
									break;
								}	
								
							// checking for user condition that exiting from the account.
							}while(innerLoginChoice != 5);
							break;
						}
						
					}
					
					// printing message when credential is wrong that entered by the user
					else {
						System.out.println("----------------------Credential is WRONG!!!---------------------------");
						System.out.println("LOGIN Again!!!");	
					}
					
				}
				break;
				
			default:
				System.out.println("-------------------Wrong Option!!!-----------------------------");
				break;
			}
				
				
		}while(choice != 0);
	
	}
}
