package org.simple.binary.system.operation;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.simple.binary.system.digit.Bit;
import org.simple.binary.system.digit.Byte;
import org.simple.binary.system.digit.SingleDigit;
import org.simple.binary.system.value.BinaryValue;
import org.simple.binary.system.value.NilValue;
import org.simple.binary.system.value.UnitValue;

public class NotTest {

    @Test
    public void testExecute() {
        Byte<BinaryValue> resultByte = new Byte<BinaryValue>();
        assertSame(resultByte, Not.execute(resultByte));
    }

    @Test
    public void testExecute2() {
        UnitValue.Unit unit = new UnitValue.Unit();
        NilValue.NIL nil = new NilValue.NIL();
        Byte<BinaryValue> resultByte = new Byte<BinaryValue>(unit, nil, new NilValue.NIL());
        assertSame(resultByte, Not.execute(resultByte));
    }

    @Test
    public void testExecute3() {
        Bit<BinaryValue> bit = new Bit<BinaryValue>();
        SingleDigit actualExecuteResult = Not.execute(bit);
        assertSame(bit, actualExecuteResult);
        assertTrue(actualExecuteResult.getValue() instanceof org.simple.binary.system.value.UnitValue.Unit);
    }

    @Test
    public void testExecute4() {
        Bit<BinaryValue> bit = new Bit<BinaryValue>();
        bit.setValue(new NilValue.NIL());
        SingleDigit actualExecuteResult = Not.execute(bit);
        assertSame(bit, actualExecuteResult);
        assertTrue(actualExecuteResult.getValue() instanceof org.simple.binary.system.value.UnitValue.Unit);
    }
}

