package org.simple.binary.system.numeral;

import org.simple.binary.system.value.NilValue;
import org.simple.binary.system.value.UnitValue;

public final class NumeralBase {

    public static UnitValue U;

    public static NilValue N;

    static {
        U = UnitNumeral.UNIT;
        N = NilNumeral.NIL;
    }

    public static final void setUnitNumeral(UnitValue unitNumeral) {
        NumeralBase.U = unitNumeral;
    }

    public static final void setNilNumeral(NilValue nilNumeral) {
        NumeralBase.N = nilNumeral;
    }

    public static final void setNumerals(UnitValue unitNumeral, NilValue nilNumeral) {
        NumeralBase.setUnitNumeral(unitNumeral);
        NumeralBase.setNilNumeral(nilNumeral);
    }
}
