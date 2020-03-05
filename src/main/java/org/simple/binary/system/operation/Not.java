package org.simple.binary.system.operation;

import org.simple.binary.system.digit.MultipleDigit;
import org.simple.binary.system.digit.SingleDigit;

public interface Not
        extends Operation {

    static SingleDigit execute(SingleDigit operand) {
        UnaryOperation<SingleDigit> not = (digit) -> {
            operand.inverse();
            return operand;
        };
        return not.execute(operand);
    }

    static MultipleDigit execute(MultipleDigit operand) {
        MultipleOperation<MultipleDigit> not = (digit) -> {
            operand.inverse();
            return operand;
        };
        return not.execute(operand);
    }
}
