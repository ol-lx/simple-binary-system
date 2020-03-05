package org.simple.binary.system.digit;

import org.simple.binary.system.value.BinaryValue;

public interface Doublet<VALUE extends BinaryValue>
        extends MultipleDigit<VALUE> {

    /**
     * This field represents the size (count of bits) of a binary number.
     */
    int SIZE = 16;

    /**
     * This field represents the count of unibits of a binary number.
     */
    int BITS = 16;

    /**
     * This field represents the count of tetrades of a binary number.
     */
    int TETRADES = 4;

    /**
     * This field represents the count of bytes of a binary number.
     */
    int BYTES = 2;
}
