package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook
{
        private List<Contact> contacts;

        public AddressBook() {
            this.contacts = new ArrayList<>();
        }

        public void addContact(Contact contact) {
            this.contacts.add(contact);
        }

        public void printContacts() {
            for (Contact contact : this.contacts) {
                System.out.println(contact.toString());
            }
        }

        public static void main(String[] args) {
            AddressBook addressBook = new AddressBook();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter address: ");
            String address = scanner.nextLine();

            System.out.print("Enter city: ");
            String city = scanner.nextLine();

            System.out.print("Enter state: ");
            String state = scanner.nextLine();

            System.out.print("Enter zip code: ");
            String zip = scanner.nextLine();

            System.out.print("Enter phone number: ");
            String phone = scanner.nextLine();

            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            Contact contact = new Contact(firstName, lastName, address, city, state, zip, phone, email);
            addressBook.addContact(contact);
            addressBook.printContacts();
        }
    }

    class Contact {
        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private String zip;
        private String phone;
        private String email;

        public Contact(String firstName, String lastName, String address, String city, String state, String zip, String phone, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phone = phone;
            this.email = email;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAddress() {
            return address;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }

        public String getZip() {
            return zip;
        }

        public String getPhone() {
            return phone;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", address='" + address + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", zip='" + zip + '\'' +
                    ", phone='" + phone + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }


