package Nine;

import java.util.Scanner;
import java.util.*;
public class addressBookSystem 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		PhoneBook objmain=new PhoneBook();
		while(i==0)
		{
			System.out.println("Menu"
					+ "\n1.Add Contact"
					+ "\n2.Display all contacts"
					+ "\n3.Remove contact"
					+ "\n4.Exit");
			System.out.println("Enter your choice: ");
			int n=Integer.parseInt(sc.nextLine());
			if(n==1)
			{
				Contact obj=new Contact();
				System.out.println("Add a contact: ");
				System.out.println("Enter the First Name: ");
				obj.setFirstName(sc.nextLine());
				System.out.println("Enter the Last Name: ");
				obj.setLastName(sc.nextLine());
				System.out.println("Enter the Address: ");
				obj.setAddress(sc.nextLine());
				System.out.println("Enter the City: ");
				obj.setCity(sc.nextLine());
				System.out.println("Enter the State: ");
				obj.setState(sc.nextLine());
				System.out.println("Enter the Zip Code: ");
				obj.setZip(sc.nextLine());
				System.out.println("Enter the Phone No. : ");
				obj.setPhoneNumber(Long.parseLong(sc.nextLine()));
				System.out.println("Enter the Email: ");
				obj.setEmailId(sc.nextLine());
				objmain.addContact(obj);
			}
			if(n==2)
			{
				System.out.println("The contacts in the List are:");
				List<Contact>obj=objmain.viewAllContacts();
				for(Contact temp:obj)
				{
					System.out.println("First Name:"+temp.getFirstName());
					System.out.println("Last Name:"+temp.getLastName());
					System.out.println("Address:"+temp.getAddress());
					System.out.println("City:"+temp.getCity());
					System.out.println("State:"+temp.getState());
					System.out.println("Zip Code:"+temp.getZip());
					System.out.println("Phone No.:"+temp.getPhoneNumber());
					System.out.println("Email:"+temp.getEmailId());
				}
			}
			if(n==3)
			{
				System.out.println("Enter the name to remove:");
				String n1= sc.nextLine();   
				System.out.println("Do you want to remove the name(Y/N):");
				char ch=sc.nextLine().charAt(0);
				if(ch=='Y')
				{
					boolean f1=objmain.removeName(n1);
					if(f1)
						System.out.println("The name is successfully deleted");
					else
						System.out.println("name is not found");
				}
				if(ch=='N')
				{
					System.out.println("ok");
				}
			}
			if(n==4)
			{
				System.exit(0);
			}
		}
	}

}
