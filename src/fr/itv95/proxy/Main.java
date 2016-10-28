package fr.itv95.proxy;

/**
 * Created by Luc on 14/10/2016.
 */
public class Main {

    public static void main(String[] args){
        Image image = new ProxyImage("test_10mb.jpg");

        image.display();
        System.out.println("");

        image.display();
    }

}
