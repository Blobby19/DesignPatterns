package fr.itv95.singleton;

/**
 * Created by Luc on 11/10/2016.
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject(){

    }

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}
