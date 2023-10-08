package Directory;
import java.util.Scanner;
public class LinkedListOfContacts {
    Scanner sc = new Scanner(System.in);
    private Contact first;
    public LinkedListOfContacts(){
        first = null;
    }
    
    public void viewContactList(){
        Contact contact = first;
        if(contact == null){
            System.out.println("Contact list is empty!");
        }else{
            while(contact != null){
                System.out.println(contact.toString());
                contact = contact.getNext();
            }
        }
    }
    
    public void addContact(Contact newContact){
        if(this.first == null){
            this.first = newContact;
        }else{
            Contact contact = this.first;
            while(contact.getNext() != null){
                contact = contact.getNext();
            }
            contact.setNext(newContact);
        }
    }
    
    public void deleteContactByName(){
        System.out.println("Contact name to delete: ");
        String referentName = sc.next();   
        if(this.first == null){
            System.out.println("Contact list is empty!");
            return;
        }
        
        if(this.first.getName().equals(referentName)){
            this.first = this.first.getNext();
            return;
        }
        
        Contact priorContact = this.first;
        Contact contact = this.first.getNext();
        
        while(contact != null){
            if(contact.getName().equals(referentName)){
               priorContact.setNext(contact.getNext());
               return;
            }
            priorContact = contact;
            contact = contact.getNext();
        }
        System.out.println("Contact's name " + referentName + " isn't found in the list!");
    }
    
    public void searchContact() {
        System.out.println("Contact name to search: ");
        String nameToSearch = sc.next();
    
        if (this.first == null) {
            System.out.println("Contact list is empty");
            return;
        }
    
        Contact currentContact = this.first;
    
        while (currentContact != null) {
            if (currentContact.getName().equals(nameToSearch)) {
                System.out.println("Name: " + currentContact.getName() + "\nPhoneNumber: " + currentContact.getPhoneNumber() + "\nEmail: " 
                        + currentContact.getEmail() + "\nCompany: " + currentContact.getCompany() + "\nJob title: " + currentContact.getJobTitle());
                return;
            }
            currentContact = currentContact.getNext();
        }
        System.out.println("Contact's name " + nameToSearch + " isn't found in the list!");
    }
    
    public void viewContactsByCompany(){
        System.out.println("Company name to search: ");
        String companyToSearch = sc.next();
        
        if(this.first == null){
            System.out.println("Contact list is empty");
            return;
        }
        
        Contact currentContact = this.first;
        boolean found = false;
        String contactsWithCompany = "";
        
        while(currentContact != null){
            if(currentContact.getCompany().equals(companyToSearch)){
                if (!contactsWithCompany.isEmpty()) {
                    contactsWithCompany += ", ";
                }
                contactsWithCompany += currentContact.getName();
                found = true;
            }
            currentContact = currentContact.getNext();
        }
        if(found){
            System.out.println("Contacts with company " + companyToSearch + ": " + contactsWithCompany);
        }else{
            System.out.println("No contacts with company " + companyToSearch + " found in the list!");
        }
    }
    
    public void viewContactsByJobTitle(){
        System.out.println("Job title to search: ");
        String jobTitleToSearch = sc.next();
        
        if(this.first == null){
            System.out.println("Contact list is empty");
            return;
        }
        
        Contact currentContact = this.first;
        boolean found = false;
        String contactsWithJobTitle = "";
        
        while(currentContact != null){
            if(currentContact.getJobTitle().equals(jobTitleToSearch)){
                if (!contactsWithJobTitle.isEmpty()) {
                    contactsWithJobTitle += ", ";
                }
                contactsWithJobTitle += currentContact.getName();
                found = true;
            }
            currentContact = currentContact.getNext();
        }
        if(found){
        System.out.println("Contacts with this job title: " + contactsWithJobTitle);
        }else{
        System.out.println("No contacts with this job were title found in the list!");
        }
    }
}

