package org.simple.binary.system.digit;

import org.simple.binary.system.value.BinaryValue;

public interface MultipleDigit<VALUE extends BinaryValue>
        extends BinaryDigit {

    /**
     * This method allows to set the binary digit value (binary number). The binary number is set according to the
     * following rules:
     * Unconditionally passed parameter (binary values) is defined as the binary number.
     * @param value
     */
    void setValue(VALUE... value);

    /**
     * This method allows to set the binary digit value (binary number). The binary number is get according to the
     * following rules:
     * Unconditionally the binary number (binary values) are returned.
     * @return
     */
    VALUE[] getValue();
}
