package org.simple.binary.system.operation;

public interface BinaryOperation<VALUE extends Object>
        extends Operation<VALUE> {

    VALUE execute(VALUE value1, VALUE value2);
}
