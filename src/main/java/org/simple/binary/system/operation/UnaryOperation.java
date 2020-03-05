package org.simple.binary.system.operation;


import org.simple.binary.system.digit.BinaryDigit;

public interface UnaryOperation<VALUE extends BinaryDigit>
        extends Operation<VALUE> {

    VALUE execute(VALUE value);
}
