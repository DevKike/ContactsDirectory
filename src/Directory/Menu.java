package Directory;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args){
        LinkedListOfContacts contactList = new LinkedListOfContacts();
        int op;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Option menu:");
            System.out.println("1. View contact list");
            System.out.println("2. Add contact");
            System.out.println("3. Delete contact by name");
            System.out.println("4. Search contact by name");
            System.out.println("5. View contacts by company");
            System.out.println("6. View contacts by job title");
            System.out.println("0. Exit");
            System.out.print("\nChoose a option: ");
            op = sc.nextInt();
            switch(op){
                case 1:
                    contactList.viewContactList();
                    break;
                case 2:
                    System.out.println("Add new contact: ");
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Phone number: ");
                    String phoneNumber = sc.next();
                    System.out.print("Email: ");
                    String email = sc.next();
                    System.out.print("Company: ");
                    String company = sc.next();
                    System.out.print("Job title: ");
                    String jobTitle = sc.next();
                    System.out.print("\nSuccessfully added!");
                    System.out.println("\n");
                    
                    Contact newContact = new Contact(name, phoneNumber, email, company, jobTitle);
                    contactList.addContact(newContact);
                    break;
                case 3:
                    contactList.deleteContactByName();
                    System.out.println("Succesfully deleted!");
                    System.out.println("\n");
                    break;
                case 4:
                    contactList.searchContact();
                    break;
                case 5:
                    contactList.viewContactsByCompany();
                    break;
                case 6:
                    contactList.viewContactsByJobTitle();
                    break;
            }
        }while(op != 0);
    }
}
