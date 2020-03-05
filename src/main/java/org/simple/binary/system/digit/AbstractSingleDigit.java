package org.simple.binary.system.digit;

import org.simple.binary.system.value.BinaryValue;

import static org.simple.binary.system.numeral.NumeralBase.N;
import static org.simple.binary.system.numeral.NumeralBase.U;

/**
 * This class represents a binary single digit, which consist of one bit. This class implements the BinaryDigit
 * interface and define methods for the bit value manipulating.
 * @param <VALUE>
 */
public abstract class AbstractSingleDigit<VALUE extends BinaryValue>
        implements SingleDigit<VALUE> {

    /**
     * This field represents the binary single digit value (binary number).
     */
    protected VALUE value;

    @Override
    public boolean equals(Object digit) {
        return digit.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }

    @Override
    public void setValue(VALUE value) {
        this.value = value;
    }

    @Override
    public VALUE getValue() {
        return (VALUE) this.value;
    }

    @Override
    public void set() {
        this.value = (VALUE) U;
    }

    @Override
    public void reset() {
        this.value = (VALUE) N;
    }

    @Override
    public void inverse() {
        this.value = this.value.same(U)
                ? (VALUE) N
                : (VALUE) U;
    }

    /**
     * This method allows to define a new bit with specific value.
     */
    AbstractSingleDigit(VALUE value) {
        this.setValue(value);
    }

    /**
     * This method allows to define a new bit with specific value.
     * Unconditionally the nil is defined as the bit value.
     */
    AbstractSingleDigit() {
        this.reset();
    }
}
