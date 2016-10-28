package fr.itv95.mvc;

/**
 * Created by Luc on 17/10/2016.
 */
public class Student {
    private String rollNo;
    private String name;

    public String getRollNo(){
        return rollNo;
    }

    public String getName(){
        return name;
    }

    public void setRollNo(String rollNo){
        this.rollNo = rollNo;
    }

    public void setName(String name){
        this.name = name;
    }
}
