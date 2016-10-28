package fr.itv95.strategy;

/**
 * Created by Luc on 17/10/2016.
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
