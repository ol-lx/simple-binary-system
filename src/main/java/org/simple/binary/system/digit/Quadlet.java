package org.simple.binary.system.digit;

import org.simple.binary.system.value.BinaryValue;

public interface Quadlet<VALUE extends BinaryValue>
        extends MultipleDigit<VALUE> {

    /**
     * This field represents the size (count of bits) of a binary number.
     */
    int SIZE = 32;

    /**
     * This field represents the count of unibits of a binary number.
     */
    int BITS = 32;

    /**
     * This field represents the count of tetrades of a binary number.
     */
    int TETRADES = 8;

    /**
     * This field represents the count of bytes of a binary number.
     */
    int BYTES = 4;

    /**
     * This field represents the count of words of a binary number.
     */
    int WORDS = 2;
}
