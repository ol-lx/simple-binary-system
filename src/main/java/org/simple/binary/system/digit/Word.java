package org.simple.binary.system.digit;

import org.simple.binary.system.value.BinaryValue;

public final class Word<VALUE extends BinaryValue>
        extends AbstractMultipleDigit<VALUE>
        implements Doublet<VALUE> {

    /**
     * This method allows to define a new word with specific value.
     */
    public Word(VALUE... value) {
        super(value);
    }

    /**
     * This method allows to define a new word with specific value.
     * Unconditionally the nil is defined as the word value.
     */
    public Word() {
        super(SIZE);
    }
}
