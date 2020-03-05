package org.simple.binary.system.digit;

import org.simple.binary.system.value.BinaryValue;

public final class Bit<VALUE extends BinaryValue>
        extends AbstractUniBit<VALUE>
        implements Unibit<VALUE> {

    /**
     * This method allows to define a new bit with specific value.
     */
    public Bit(VALUE value) {
        super(value);
    }

    /**
     * This method allows to define a new bit with specific value.
     * Unconditionally the nil is defined as the bit value.
     */
    public Bit() {
        super();
    }
}
