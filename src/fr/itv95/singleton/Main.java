package fr.itv95.singleton;

/**
 * Created by Luc on 11/10/2016.
 */
public class Main {

    public static void main(String[] args){
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }

}
