package org.simple.binary.system.digit;

import org.simple.binary.system.value.BinaryValue;

/**
 * This interface represents a bit type for storing binary single digit, which consist of one bit. This interface
 * extends the SingleDigit interface and define a count of bit's of binary digit.
 * @param <VALUE>
 */
public interface Unibit<VALUE extends BinaryValue>
        extends SingleDigit<VALUE> {

    /**
     * This field represents the length (count of bits) of a binary number.
     */
    int SIZE = 1;
}
