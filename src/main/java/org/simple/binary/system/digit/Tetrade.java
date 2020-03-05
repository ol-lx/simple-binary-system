package org.simple.binary.system.digit;

import org.simple.binary.system.value.BinaryValue;

public interface Tetrade<VALUE extends BinaryValue>
        extends MultipleDigit<VALUE> {

    /**
     * This field represents the length (count of bits) of a binary number.
     */
    int SIZE = 4;

    /**
     * This field represents the count of unibits of a binary number.
     */
    int BITS = 4;
}
