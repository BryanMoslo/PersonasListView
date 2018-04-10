package com.tallerzapatoszxy.trabajandolistview;

import java.util.ArrayList;

public class Data {
    private static ArrayList<Person> people = new ArrayList();

    public static void savePerson(Person person){
        people.add(person);
    }

    public static ArrayList<Person> getPeople(){
        return people;
    }
}
