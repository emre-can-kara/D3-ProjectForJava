package org.example;

public class Person {
    // defining three instance variables .DONE :)
    String firstName;
    String lastName;
    int age;
   // defining my prefered instance variables .DONE :)
    String address;
    int height;
    int salary;

    // defined the first constructor as the assignment had me to write .DONE :)
    public Person(String firstName, String lastName, int age) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age = age;
    }
    //I had written my constructor .DONE :)
    public Person(int age, String address, int height, int salary) {
        this("Unknown", "Unkown", age); // Constructor chaining is done by "Unknown" to the firstName and lastName! .DONE
        this.address=address;
        this.height=height;
        this.salary=salary;

    }
// Four methods has been .DONE
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen() {
        if (age >= 13 && age <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
