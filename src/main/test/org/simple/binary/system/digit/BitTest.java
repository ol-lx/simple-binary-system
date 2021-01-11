package org.simple.binary.system.digit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;
import org.simple.binary.system.numeral.NumeralBase;
import org.simple.binary.system.value.BinaryValue;
import org.simple.binary.system.value.NilValue;
import org.simple.binary.system.value.UnitValue;

public class BitTest {

    @Test
    public void testConstructor() {
        assertEquals(NumeralBase.N, (new Bit<BinaryValue>(new NilValue.NIL())));
    }

    @Test
    public void testConstructor2() {
        Bit<BinaryValue> actualBit = new Bit<BinaryValue>(new NilValue.NIL());
        BinaryValue expectedValue = actualBit.value;
        assertSame(expectedValue, actualBit.getValue());
    }
}

