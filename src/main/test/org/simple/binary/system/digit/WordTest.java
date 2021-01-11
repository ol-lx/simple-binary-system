package org.simple.binary.system.digit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.simple.binary.system.value.BinaryValue;
import org.simple.binary.system.value.NilValue;

public class WordTest {

    @Test
    public void testConstructor() {
        assertEquals(16, (new Word<BinaryValue>()).getValue().length);
    }

    @Test
    public void testConstructor2() {
        NilValue.NIL nil = new NilValue.NIL();
        NilValue.NIL nil1 = new NilValue.NIL();
        assertEquals(3, (new Word<BinaryValue>(nil, nil1, new NilValue.NIL())).getValue().length);
    }
}

