package org.simple.binary.system.value;

/**
 * This interface represents an abstraction of binary unit value. This interface extends the
 * BinaryValue interface. This interface define a value unit type.
 */
public interface UnitValue<VALUE extends UnitValue> extends BinaryValue<VALUE> {

    /**
     * This field represents the unit value type (UnitValue classes name) of a binary value.
     */
    Class<?> VALUE = UnitValue.class;

    class Unit implements UnitValue {

        @Override
        public boolean equals(Object numeral) {
            return numeral.hashCode() == this.hashCode();
        }

        @Override
        public int hashCode() {
            return 1;
        }
    }

    Unit UNIT = new Unit();
}
