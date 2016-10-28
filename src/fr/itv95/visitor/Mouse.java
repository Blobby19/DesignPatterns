package fr.itv95.visitor;

/**
 * Created by Luc on 17/10/2016.
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
