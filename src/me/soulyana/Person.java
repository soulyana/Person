package me.soulyana;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;

    //default constructor
    public Person() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.address = "123 Dream St., Dreamville, USA";
        this.phone = "1234567890";
        this.email = "John.Doe@gmail.com";
    }


    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
