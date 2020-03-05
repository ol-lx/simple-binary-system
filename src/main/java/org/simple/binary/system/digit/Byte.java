package org.simple.binary.system.digit;

import org.simple.binary.system.value.BinaryValue;

public final class Byte<VALUE extends BinaryValue>
        extends AbstractMultipleDigit<VALUE>
        implements Octet<VALUE> {

    /**
     * This method allows to define a new byte with specific value.
     */
    public Byte(VALUE... value) {
        super(value);
    }

    /**
     * This method allows to define a new byte with specific value.
     * Unconditionally the nil is defined as the byte value.
     */
    public Byte() {
        super(SIZE);
    }
}
