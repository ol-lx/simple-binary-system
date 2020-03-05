package org.simple.binary.system.operation;

import org.simple.binary.system.digit.Bit;
import org.simple.binary.system.digit.BitSequence;
import org.simple.binary.system.digit.MultipleDigit;
import org.simple.binary.system.digit.SingleDigit;
import org.simple.binary.system.value.BinaryValue;

import java.util.stream.Stream;

import static org.simple.binary.system.numeral.NumeralBase.N;
import static org.simple.binary.system.numeral.NumeralBase.U;

public interface And extends Operation {

    static SingleDigit execute(SingleDigit operand1, SingleDigit operand2) {
        BinaryOperation<SingleDigit> and = (digit, digit2) -> {
            return new Bit(
                    digit.getValue().same(U)
                    && digit2.getValue().same(U)
                    ? U
                    : N
            );
        };
        return and.execute(operand1, operand2);
    }

    static MultipleDigit execute(MultipleDigit operand1, MultipleDigit operand2) {
        BinaryOperation<MultipleDigit> and = (digit, digit2) -> {
            return new BitSequence(
                    Stream.iterate(0, i -> i < digit.getValue().length, i -> i + 1)
                            .map(i -> And.execute(new Bit(digit.getValue()[i]), new Bit(digit2.getValue()[i])).getValue())
                            .toArray(BinaryValue[]::new)
            );
        };
        return and.execute(operand1, operand2);
    }
}
