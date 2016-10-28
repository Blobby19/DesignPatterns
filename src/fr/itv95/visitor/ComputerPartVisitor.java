package fr.itv95.visitor;

/**
 * Created by Luc on 17/10/2016.
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);

}
