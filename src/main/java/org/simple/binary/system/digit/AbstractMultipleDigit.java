package org.simple.binary.system.digit;

import org.simple.binary.system.value.BinaryValue;

import java.util.stream.Stream;

import static org.simple.binary.system.numeral.NumeralBase.N;
import static org.simple.binary.system.numeral.NumeralBase.U;

public abstract class AbstractMultipleDigit<VALUE extends BinaryValue>
        implements MultipleDigit<VALUE> {

    protected VALUE[] value;

    @Override
    public boolean equals(Object digit) {
        if(digit.hashCode() != this.hashCode()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Stream.iterate(0, i -> i < this.value.length, i -> i + 1)
                .mapToInt(i -> (int) Math.pow(
                        2 * this.value[i].hashCode(),
                        i
                ))
                .sum();
    }

    @Override
    public void setValue(VALUE... value) {
        Stream.iterate(0, i -> i < this.value.length & i < value.length, i -> i + 1)
                .forEach((i) -> {
                    this.value[i] = (VALUE) value[i];
                });
    }

    @Override
    public VALUE[] getValue() {
        return (VALUE[]) this.value;
    }

    @Override
    public void set() {
        Stream.iterate(0, i -> i < this.value.length, i -> i + 1)
                .forEach((i) -> {
                    this.value[i] = (VALUE) U;
                });
    }

    @Override
    public void reset() {
        Stream.iterate(0, i -> i < this.value.length, i -> i + 1)
                .forEach((i) -> {
                    this.value[i] = (VALUE) N;
                });
    }

    @Override
    public void inverse() {
        Stream.iterate(0, i -> i < this.value.length, i -> i + 1)
                .forEach((i) -> {
                    this.value[i] = this.value[i].different(U)
                            ? (VALUE) U
                            : (VALUE) N;
                });
    }

    /**
     * This method allows to define a new multiple digit with specific value.
     */
    public AbstractMultipleDigit(VALUE... value) {
        if(value.length > 0) {
            this.value = (VALUE[]) new BinaryValue[value.length];
            this.setValue(value);
        }
    }

    /**
     * This method allows to define a new multiple digit with specific value.
     * Unconditionally the nil is defined as the multiple digit value.
     */
    public AbstractMultipleDigit(int size) {
        this.value = (VALUE[]) new BinaryValue[size];
        this.reset();
    }
}
