package org.simple.binary.system.digit;

import org.simple.binary.system.decoder.BinaryDecoder;
import org.simple.binary.system.value.BinaryValue;

public interface Octet<VALUE extends BinaryValue>
        extends MultipleDigit<VALUE> {

    /**
     * This field represents the size (count of bits) of a binary number.
     */
    int SIZE = 8;

    /**
     * This field represents the count of unibits of a binary number.
     */
    int BITS = 8;

    /**
     * This field represents the count of tetrades of a binary number.
     */
    int TETRADES = 2;

    static Octet decode(int digit) {
        BinaryDecoder<Integer, Octet> to = (d) -> {
            return new Byte(BinaryDecoder.toBin(d));
        };
        return to.decode(digit);
    }
}
