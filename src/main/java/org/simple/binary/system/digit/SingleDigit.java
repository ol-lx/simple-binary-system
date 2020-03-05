package org.simple.binary.system.digit;

import org.simple.binary.system.value.BinaryValue;

/**
 * This interface represents an abstraction of binary single digit, which consist of one bit. This interface extends the BinaryDigit
 * interface and define methods for the bit value manipulating.
 * @param <VALUE>
 */
public interface SingleDigit<VALUE extends BinaryValue>
        extends BinaryDigit {

    /**
     * This method allows to set the binary digit value (binary number). The binary number is setted according to the
     * following rules:
     * Unconditionally passed parameter (binary values) is defined as the binary number.
     * @param value
     */
    void setValue(VALUE value);

    /**
     * This method allows to get the binary digit value (binary number). The binary number is getted according to the
     * following rules:
     * Unconditionally the binary number (binary values) are returned.
     * @return
     */
    VALUE getValue();
}
