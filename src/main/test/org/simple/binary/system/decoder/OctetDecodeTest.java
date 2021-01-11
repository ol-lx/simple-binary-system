package org.simple.binary.system.decoder;

import org.junit.jupiter.api.Test;
import org.simple.binary.system.digit.Byte;
import org.simple.binary.system.digit.Octet;
import org.simple.binary.system.numeral.NumeralBase;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OctetDecodeTest {

    private final Logger log = Logger.getAnonymousLogger();

    @Test
    void toDecViaDigitTest() {
        Byte xx = new Byte(NumeralBase.U, NumeralBase.N, NumeralBase.U);
        Byte x = (Byte) Octet.decode(5);
        log.info(Integer.toString(BinaryDecoder.toDec(x), 2));
        log.info(Integer.toString(BinaryDecoder.toDec(xx), 2));

        assertEquals(x, Octet.decode(5), "Декодер провалился");
    }
}