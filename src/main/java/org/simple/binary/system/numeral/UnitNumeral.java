package org.simple.binary.system.numeral;

import org.simple.binary.system.value.UnitValue;

final class UnitNumeral {

    static final UnitValue UNIT = Unit.get();

    private static final class Unit implements BinaryNumeral, UnitValue {

        @Override
        public boolean equals(Object numeral) {
            return numeral.hashCode() == this.hashCode();
        }

        @Override
        public int hashCode() {
            return 1;
        }

        private static final class Numeral {

            public static final Unit NUMERAL = new Unit();
        }

        private static final Unit get() {
            return Numeral.NUMERAL;
        }
    }
}
