package org.simple.binary.system.digit;

import org.simple.binary.system.value.BinaryValue;

public class AbstractUniBit<VALUE extends BinaryValue>
        extends AbstractSingleDigit<VALUE>
        implements Unibit<VALUE> {

    /**
     * This method allows to define a new bit with specific value.
     */
    AbstractUniBit(VALUE value) {
        super(value);
    }

    /**
     * This method allows to define a new bit with specific value.
     * Unconditionally the nil is defined as the bit value.
     */
    AbstractUniBit() {
        super();
    }
}
