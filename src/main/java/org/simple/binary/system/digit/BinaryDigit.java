package org.simple.binary.system.digit;

import org.simple.binary.system.Binary;

/**
 * This interface represents an abstraction of binary digit. This interface extends the Binary
 * interface. This interface define three methods of binary digit.
 */
public interface BinaryDigit
        extends Binary {

    /**
     * This method allows to set the bit. The bit is setted according to the following rules:
     * Unconditionally the unit is defined as the bit value.
     */
    void set();

    /**
     * This method allows to reset the bit. The bit is resetted according to the following rules:
     * Unconditionally the nil is defined as the bit value.
     */
    void reset();

    /**
     * This method allows to invert the bit. The bit is inverted according to the
     * following rules:
     * a) if the bit value is zero, then the bit is setted (one is setted as the bit value);
     * b) if the bit value is one, the bit is reset (zero is setted as the bit value).
     */
    void inverse();

}
