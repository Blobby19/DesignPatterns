package fr.itv95.mediator;

/**
 * Created by Luc on 17/10/2016.
 */
public class Main {

    public static void main(String[] args){
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John");
        john.sendMessage("Hello! Robert!");
    }

}
