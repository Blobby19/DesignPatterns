package fr.itv95.visitor;

/**
 * Created by Luc on 17/10/2016.
 */
public class Main {

    public static void main(String[] args){
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
