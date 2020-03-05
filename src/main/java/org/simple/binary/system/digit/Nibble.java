package org.simple.binary.system.digit;

import org.simple.binary.system.value.BinaryValue;

public final class Nibble<VALUE extends BinaryValue>
        extends AbstractMultipleDigit<VALUE>
        implements Tetrade<VALUE> {

    /**
     * This method allows to define a new Nibble with specific value.
     */
    public Nibble(VALUE... value) {
        super(value);
    }

    /**
     * This method allows to define a new Nibble with specific value.
     * Unconditionally the nil is defined as the Nibble value.
     */
    public Nibble() {
        super(SIZE);
    }

}
