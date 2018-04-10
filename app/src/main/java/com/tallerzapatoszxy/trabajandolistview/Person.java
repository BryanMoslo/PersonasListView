package com.tallerzapatoszxy.trabajandolistview;

public class Person {
    private String DNI;
    private String firstName;
    private String lastName;

    public Person(String DNI, String firstName, String lastName) {
        this.DNI = DNI;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getDNI() {
        return DNI;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void save(){
        Data.savePerson(this);
    }
}
