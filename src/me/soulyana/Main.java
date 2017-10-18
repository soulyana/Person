package me.soulyana;

import java.util.ArrayList;
import  java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String ans, nameSearch;

        Scanner scan = new Scanner(System.in);

        ArrayList<Person> personArrayList = new ArrayList<Person>();

        Person drPerson = new Doctor();
        Doctor drPerson2 = new Doctor();


        do {
            Person a = new Person();

            System.out.println("What is your first name?");
            a.setFirstName(scan.nextLine());
            System.out.println("What is your last name?");
            a.setLastName(scan.nextLine());
            System.out.println("What is your address?");
            a.setAddress(scan.nextLine());
            System.out.println("What is your phone number?");
            a.setPhone(scan.nextLine());
            System.out.println("What is your email address?");
            a.setEmail(scan.nextLine());

            personArrayList.add(a);
            personArrayList.add(drPerson2);

            do {
                System.out.println("Would you like to add a person to list? (Y/N)");
                ans = scan.nextLine();

                if (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
                    System.out.println("Invalid entry. Please only enter Y for yes & N for no!");
                }
            }while (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) ;

        }while (ans.equalsIgnoreCase("y") || !ans.equalsIgnoreCase("n"));

        System.out.println();
        for (Person eachPerson : personArrayList) {
            System.out.println();
            System.out.println("Your first name is " + eachPerson.getFirstName());
            System.out.println("Your last name is " + eachPerson.getLastName());
            System.out.println("Your address is " + eachPerson.getAddress());
            System.out.println("Your phone number is " + eachPerson.getPhone());
            System.out.println("Your email address is " + eachPerson.getEmail());
            System.out.println();
        }
        do {
            System.out.println("Would you like to search for a person on the list? (Y/N)");
            ans = scan.nextLine();

            if (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
                System.out.println("Invalid entry. Please only enter Y for yes & N for no!");
            } else if(ans.equalsIgnoreCase("y")) {
                System.out.println("Please enter name you would like to search: ");
                nameSearch = scan.nextLine();

                for(Person eachPerson : personArrayList) {
                    if(eachPerson.getFirstName().equalsIgnoreCase(nameSearch) ||
                            eachPerson.getLastName().equalsIgnoreCase(nameSearch)) {
                        System.out.println();
                        System.out.println("First name is " + eachPerson.getFirstName());
                        System.out.println("Last name is " + eachPerson.getLastName());
                        System.out.println("Address is " + eachPerson.getAddress());
                        System.out.println("Phone number is " + eachPerson.getPhone());
                        System.out.println("Email address is " + eachPerson.getEmail());
                    }
                }
            } else if(ans.equalsIgnoreCase("n")) {
                System.out.println("Thank you! Goodbye!");
            }
        } while (ans.equalsIgnoreCase("y") || !ans.equalsIgnoreCase("n"));
    }
}