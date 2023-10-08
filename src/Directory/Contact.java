package Directory;
public class Contact {
    private String name;
    private String phoneNumber;
    private String email;    
    private String company;
    private String jobTitle;
    private Contact next;
    
    //Constructor
    public Contact(String name, String phoneNumber, String email, String company, String jobTitle){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.company = company;
        this.jobTitle = jobTitle;
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Contact getNext() {
        return next;
    }

    public void setNext(Contact next) {
        this.next = next;
    }

    @Override
    public String toString() {
        String data = "Name: " + this.getName() + "\nPhone Number: " + this.getPhoneNumber() + "\nEmail: " + this.getEmail() + "\nCompany: " + this.getCompany() + "\nJob title: " + this.getJobTitle() + "\n--------------------------"; 
        return data;
    }
}