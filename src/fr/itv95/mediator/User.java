package fr.itv95.mediator;

/**
 * Created by Luc on 17/10/2016.
 */
public class User {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public User(String name){
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this, message);
    }

}
