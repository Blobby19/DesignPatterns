package fr.itv95.visitor;

/**
 * Created by Luc on 17/10/2016.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
