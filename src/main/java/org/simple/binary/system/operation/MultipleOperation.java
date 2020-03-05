package org.simple.binary.system.operation;

public interface MultipleOperation<VALUE extends Object>
        extends Operation<VALUE> {

    VALUE execute(VALUE... value);
}
