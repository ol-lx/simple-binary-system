package org.simple.binary.system.operation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.simple.binary.system.digit.Bit;
import org.simple.binary.system.digit.Byte;
import org.simple.binary.system.digit.DoubleWord;
import org.simple.binary.system.digit.SingleDigit;
import org.simple.binary.system.value.BinaryValue;
import org.simple.binary.system.value.NilValue;
import org.simple.binary.system.value.UnitValue;

public class AndTest {

    @Test
    public void testExecute() {
        Byte<BinaryValue> operand1 = new Byte<BinaryValue>();
        assertEquals(8, And.execute(operand1, new Byte<BinaryValue>()).getValue().length);
    }

    @Test
    public void testExecute2() {
        DoubleWord<BinaryValue> operand1 = new DoubleWord<BinaryValue>();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> And.execute(operand1, new Byte<BinaryValue>()));
    }

    @Test
    public void testExecute3() {
        Bit<BinaryValue> operand1 = new Bit<BinaryValue>();
        assertTrue(And.execute(operand1, new Bit<BinaryValue>()) instanceof Bit);
    }

    @Test
    public void testExecute4() {
        Bit<BinaryValue> operand1 = new Bit<BinaryValue>(new UnitValue.Unit());
        assertTrue(And.execute(operand1, new Bit<BinaryValue>()) instanceof Bit);
    }

    @Test
    public void testExecute5() {
        assertTrue(And.execute(new Bit<BinaryValue>(new NilValue.NIL()), (SingleDigit) null) instanceof Bit);
    }

    @Test
    public void testExecute6() {
        Bit<BinaryValue> operand1 = new Bit<BinaryValue>(new UnitValue.Unit());
        assertTrue(And.execute(operand1, new Bit<BinaryValue>(new UnitValue.Unit())).getValue() instanceof UnitValue.Unit);
    }

    @Test
    public void testExecute7() {
        Bit<BinaryValue> bit = new Bit<BinaryValue>(new UnitValue.Unit());
        bit.setValue(new NilValue.NIL());
        assertTrue(And.execute(bit, new Bit<BinaryValue>(null)) instanceof Bit);
    }
}

