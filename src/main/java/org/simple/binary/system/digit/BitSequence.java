package org.simple.binary.system.digit;

import org.simple.binary.system.value.BinaryValue;

public class BitSequence<VALUE extends BinaryValue>
        extends AbstractMultipleDigit<VALUE> {

    /**
     * This method allows to define a new bit sequence with specific value.
     */
    public BitSequence(VALUE... value) {
        super(value);
    }
}
