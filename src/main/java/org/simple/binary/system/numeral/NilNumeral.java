package org.simple.binary.system.numeral;

import org.simple.binary.system.value.NilValue;

final class NilNumeral {

    static final NilValue NIL = Nil.get();

    private static class Nil implements BinaryNumeral, NilValue {

        @Override
        public boolean equals(Object numeral) {
            return numeral.hashCode() == this.hashCode();
        }

        @Override
        public int hashCode() {
            return 0;
        }

        private static final class Numeral {

            public static final Nil NUMERAL = new Nil();
        }

        private static final Nil get() {
            return Numeral.NUMERAL;
        }
    }
}
