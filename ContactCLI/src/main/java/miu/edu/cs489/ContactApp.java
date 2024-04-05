package miu.edu.cs489.model;



import java.util.Arrays;
import java.util.Comparator;

public class ContactApp {
    public static void main(String[] args) {
        // Sample contacts data
        Contact[] contacts = {
                new Contact("John", "Doe", "Acme Inc.", "Manager"),
                new Contact("Alice", "Smith", "Beta Corp", "Engineer"),
                // Add more sample contacts as needed
        };

        // Sample phone numbers and email addresses
        contacts[0].getPhoneNumbers().add(new PhoneNumber("123-456-7890", "Work"));
        contacts[0].getEmailAddresses().add(new EmailAddress("john.doe@example.com", "Work"));
        contacts[1].getPhoneNumbers().add(new PhoneNumber("987-654-3210", "Mobile"));
        contacts[1].getEmailAddresses().add(new EmailAddress("alice.smith@example.com", "Home"));

        // Sort contacts by last name
        Arrays.sort(contacts, Comparator.comparing(Contact::getLastName));

        // Print contact details
        for (Contact contact : contacts) {
            System.out.println("First Name: " + contact.getFirstName());
            System.out.println("Last Name: " + contact.getLastName());
            System.out.println("Company: " + contact.getCompany());
            System.out.println("Job Title: " + contact.getJobTitle());

            // Print phone numbers
            System.out.println("Phone Numbers:");
            for (PhoneNumber phoneNumber : contact.getPhoneNumbers()) {
                System.out.println("  " + phoneNumber.getLabel() + ": " + phoneNumber.getNumber());
            }

            // Print email addresses
            System.out.println("Email Addresses:");
            for (EmailAddress emailAddress : contact.getEmailAddresses()) {
                System.out.println("  " + emailAddress.getLabel() + ": " + emailAddress.getAddress());
            }

            System.out.println("--------------------------------------");
        }
    }
}

