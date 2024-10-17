package day06_lecture;

import java.util.Date;

public class Person {

    private long id;
    private String firstName;
    private String lastName;
    private double salary;
    private Date dob;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Person(long id, String firstName, String lastName, double salary, Date dob) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person {ID: %d, First Name: %s, Last Name: %s, Salary: %f, Date of Birth: %s}".formatted(this.id, this.firstName, this.lastName, this.salary, this.dob.toString());
    }
}
