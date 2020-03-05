package org.simple.binary.system.decoder;

import org.simple.binary.system.digit.MultipleDigit;
import org.simple.binary.system.numeral.BinaryNumeral;
import org.simple.binary.system.value.BinaryValue;

import java.util.stream.Stream;

import static org.simple.binary.system.numeral.NumeralBase.N;
import static org.simple.binary.system.numeral.NumeralBase.U;

public interface BinaryDecoder<FROM extends Object, TO extends Object> {

    static int toDec(BinaryValue... value) {
        return Stream.iterate(0, i -> i < value.length, i -> i + 1)
                .mapToInt(i -> value[i].same(U)
                        ? (int) Math.pow(2, i)
                        : 0)
                .sum();
    }

    static int toDec(MultipleDigit value) {
        return toDec(value.getValue());
    }

    static BinaryValue[] toBin(int value) {
        return Stream.iterate(value, i -> i > 0 , i -> i / BinaryNumeral.RADIX)
                .map(i -> i % BinaryNumeral.RADIX != 0
                        ? U
                        : N)
                .toArray(BinaryValue[]::new);
    }

    TO decode(FROM digit);
}
