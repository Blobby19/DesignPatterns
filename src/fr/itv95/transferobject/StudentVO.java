package fr.itv95.transferobject;

/**
 * Created by Luc on 17/10/2016.
 */
public class StudentVO {

    private String name;
    private int rollNo;

    public StudentVO(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getRollNo(){
        return rollNo;
    }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
}
