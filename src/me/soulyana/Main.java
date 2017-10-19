package me.soulyana;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String ans, nameSearch;

        Scanner scan = new Scanner(System.in);

        ArrayList<Person> personArrayList = new ArrayList<Person>();
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        ArrayList<Teacher> teacherArrayList = new ArrayList<Teacher>();

        do {
            System.out.println("Would you like to add a (S)tudent or a (T)eacher?");
            ans = scan.nextLine();

            if (ans.equalsIgnoreCase("s")) {
                Student s = new Student();

                System.out.println("What is your first name?");
                s.setFirstName(scan.nextLine());
                System.out.println("What is your last name?");
                s.setLastName(scan.nextLine());
                System.out.println("What is your address?");
                s.setAddress(scan.nextLine());
                System.out.println("What is your phone number?");
                s.setPhone(scan.nextLine());
                System.out.println("What is your email address?");
                s.setEmail(scan.nextLine());

                personArrayList.add(s);
                studentArrayList.add(s);

                do {
                   System.out.println("Would you like to enter your courses: (Q to quit)");
                   ans = scan.nextLine();

                   Course course = new Course();
                   System.out.println("Enter the course ID: ");
                   course.setCourseID(scan.nextLine());
                   System.out.println("Enter the course title: ");
                   course.setName(scan.nextLine());
                   System.out.println("Enter the course description: ");
                   course.setDescription(scan.nextLine());

                   s.addCourse(course);

                } while(!ans.equalsIgnoreCase("q"));

            }

            if (ans.equalsIgnoreCase("t")) {
                Teacher t = new Teacher();

                System.out.println("What is your first name?");
                t.setFirstName(scan.nextLine());
                System.out.println("What is your last name?");
                t.setLastName(scan.nextLine());
                System.out.println("What is your address?");
                t.setAddress(scan.nextLine());
                System.out.println("What is your phone number?");
                t.setPhone(scan.nextLine());
                System.out.println("What is your email address?");
                t.setEmail(scan.nextLine());

                personArrayList.add(t);
                teacherArrayList.add(t);

                System.out.println("Do you want to enter the courses you're teaching? (Y)es or (N)o");
                ans = scan.nextLine();
                while(ans.equalsIgnoreCase("y")) {
                    Course course = new Course();

                    System.out.println("Enter the course ID: ");
                    course.setCourseID(scan.nextLine());
                    System.out.println("Enter the course title: ");
                    course.setName(scan.nextLine());
                    System.out.println("Enter the course description: ");
                    course.setDescription(scan.nextLine());

                    t.addCourse(course);
                    System.out.println("Would you like to add another course? (Y)es or (N)no");
                    ans = scan.nextLine();
                }
            }

            do {
                System.out.println("Would you like to add another person to your address book? (Y/N)");
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

        System.out.println();
        for (Student eachStudent : studentArrayList){
            for (Course eachCourse : eachStudent.getCoursesTakenArrayList()) {
                System.out.println();
                System.out.println("Course ID: " + eachCourse.getCourseID());
                System.out.println("Course Title: " + eachCourse.getName());
                System.out.println("Course Description: " + eachCourse.getDescription());
            }
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
                        System.out.println();
                    }
                }
            } else if(ans.equalsIgnoreCase("n")) {
                System.out.println("Thank you! Goodbye!");
            }
        } while (ans.equalsIgnoreCase("y") || !ans.equalsIgnoreCase("n"));
    }
}