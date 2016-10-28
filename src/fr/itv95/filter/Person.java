package fr.itv95.filter;

/**
 * Created by Luc on 13/10/2016.
 */
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus){
        this.gender = gender;
        this.name = name;
        this.maritalStatus = maritalStatus;
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public String getMaritalStatus(){
        return maritalStatus;
    }
}

