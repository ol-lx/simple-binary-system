package org.simple.binary.system.value;

/**
 * This interface represents an abstraction of binary nil value. This interface extends the
 * BinaryValue interface. This interface define a value nil type.
 */
public interface NilValue<VALUE extends NilValue>
        extends BinaryValue<VALUE> {

    /**
     * This field represents the nil value type (NilValue classes name) of a binary value.
     */
    Class<?> VALUE = NilValue.class;

    class NIL implements NilValue {

        @Override
        public boolean equals(Object numeral) {
            return numeral.hashCode() == this.hashCode();
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }

    NilValue NIL = new NIL();
}
