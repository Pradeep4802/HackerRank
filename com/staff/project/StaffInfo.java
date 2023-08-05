package com.staff.project;
import java.util.*;

public class StaffInfo {
	
	
	public static void main(String args[]) {
		int id,choice=0;
		String name,email,contact;
		Scanner sc=new Scanner(System.in);
		Staff staf[]=new Staff[10];
		int count=0;

		do {
			System.out.println("EnTer 1 For Insert.");
			System.out.println("      2 For UPdate.");
			System.out.println("      3 For Delete.");
			System.out.println("      4 For SelectByID.");
			System.out.println("      5 For SelectAll.");
			System.out.println("      0 For Exit.");
			choice=sc.nextInt();
			switch (choice) {
			case 1: 

				System.out.println("Enter ID   Name   Email   Contact ");
				id=sc.nextInt();
				name=sc.next();
				email=sc.next();
				contact=sc.next();
				staf[count++]=new Staff(id, name, email, contact);

				System.out.println("-------------Inserted SuccessFully------------------");
				break;
			case 2: 
				System.out.println();
				System.out.println("--------------Enter the ID For UPDATE-----------------");
				int id2 = sc.nextInt();
				
				for(Staff stf : staf) {
					if(stf!=null) {
						if(stf.getId()==id2) {
							System.out.println("Enter the NAME, EMAIL, CONTACT: ");
							name=sc.next();
							email=sc.next();
							contact=sc.next();
							stf.setName(name);
							stf.setEmail(email);
							stf.setContact(contact);
							System.out.println("-------------Updated SuccessFully------------------");
						}
					}
				}
				break;
			case 3: 
				System.out.println("-----------------Enter the ID For DELETE------------------------------");
				System.out.println("Enter the ID: ");
				int id3 = sc.nextInt();  
				for(int i=0;i<staf.length;i++) {
					if(staf[i]!=null) {
						if(staf[i].getId()==id3) {
							staf[i] = null;
						}
					}
				}
				System.out.println("------   --------Deleted SuccessFully--------------------");
				break;
			case 4: 
				System.out.println("-------------------Selected By ID---------------------");
				System.out.println("Enter the ID: ");
				int id1 = sc.nextInt();
				for(Staff stf : staf) {
					if(stf!=null) {
						if(stf.getId()==id1)
						System.out.println(stf);
					}
				}
				System.out.println("------------------------------------------------------");
				break;
			case 5:
				System.out.println("---------------------Select All-----------------------");
				for(Staff st:staf) {
					if(st!=null) {
						System.out.println(st);
					}
				}
				System.out.println("------------------------------------------------------");
				break;
				
			case 0:
				System.out.println("-----------------------Exited-------------------------");
			default:
				System.out.println("Please Select valid Choice.......");
			}
		}while(choice!=0);
	}
}
