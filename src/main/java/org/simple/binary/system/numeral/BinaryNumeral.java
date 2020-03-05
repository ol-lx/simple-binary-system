package org.simple.binary.system.numeral;

import org.simple.binary.system.Binary;
import org.simple.binary.system.value.BinaryValue;
import org.simple.binary.system.value.UnitValue;

public interface BinaryNumeral extends Binary {

    //TODO: Перенести в нужный интерфейс
    int RADIX = 2;

    default int representation() {
        return BinaryValue.extract(this) == UnitValue.VALUE
                ? 1
                : 0;
    }
}
