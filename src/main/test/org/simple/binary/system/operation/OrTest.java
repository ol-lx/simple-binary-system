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
import org.simple.binary.system.value.UnitValue;

public class OrTest {

    @Test
    public void testExecute() {
        Byte<BinaryValue> operand1 = new Byte<BinaryValue>();
        assertEquals(8, Or.execute(operand1, new Byte<BinaryValue>()).getValue().length);
    }

    @Test
    public void testExecute2() {
        DoubleWord<BinaryValue> operand1 = new DoubleWord<BinaryValue>();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Or.execute(operand1, new Byte<BinaryValue>()));
    }

    @Test
    public void testExecute3() {
        Bit<BinaryValue> operand1 = new Bit<BinaryValue>();
        assertTrue(Or.execute(operand1, new Bit<BinaryValue>()) instanceof Bit);
    }

    @Test
    public void testExecute4() {
        assertTrue(Or.execute(new Bit<BinaryValue>(new UnitValue.Unit()), (SingleDigit) null)
                .getValue() instanceof UnitValue.Unit);
    }

    @Test
    public void testExecute5() {
        Bit<BinaryValue> operand2 = new Bit<BinaryValue>(new UnitValue.Unit());
        assertTrue(Or.execute(new Bit<BinaryValue>(), operand2).getValue() instanceof UnitValue.Unit);
    }

    @Test
    public void testExecute6() {
        Bit<BinaryValue> operand1 = new Bit<BinaryValue>(new UnitValue.Unit());
        assertTrue(Or.execute(operand1, new Bit<BinaryValue>(null)).getValue() instanceof UnitValue.Unit);
    }
}

