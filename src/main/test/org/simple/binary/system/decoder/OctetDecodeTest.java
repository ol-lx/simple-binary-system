package org.simple.binary.system.decoder;

import org.junit.jupiter.api.Test;
import org.simple.binary.system.digit.Byte;
import org.simple.binary.system.digit.Octet;
<<<<<<< HEAD
import org.simple.binary.system.digit.SingleDigit;
import org.simple.binary.system.value.NilValue;
import org.simple.binary.system.value.UnitValue;
=======
import org.simple.binary.system.numeral.NumeralBase;
>>>>>>> 425beba699e4c6c1c6b7907d49c41544dab51403

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class OctetDecodeTest {

    private final Logger log = Logger.getAnonymousLogger();

    @Test
    void toDecViaDigitTest() {
<<<<<<< HEAD
        Byte x = (Byte) decode(5);
        log.info(Integer.toString(BinaryDecoder.toDec(x), 2));
        assertEquals(x, decode(5), "Декодер провалился");

        NilValue x1 = NilValue.NIL;
        NilValue x2 = NilValue.NIL;
        UnitValue x3 = UnitValue.UNIT;

        assertEquals(x1, x2, "Декодер провалился");
=======
        Byte xx = new Byte(NumeralBase.U, NumeralBase.N, NumeralBase.U);
        Byte x = (Byte) Octet.decode(5);
        log.info(Integer.toString(BinaryDecoder.toDec(x), 2));
        log.info(Integer.toString(BinaryDecoder.toDec(xx), 2));

        assertEquals(x, Octet.decode(5), "Декодер провалился");
>>>>>>> 425beba699e4c6c1c6b7907d49c41544dab51403
    }
}