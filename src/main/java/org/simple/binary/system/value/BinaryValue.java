package org.simple.binary.system.value;

import org.simple.binary.system.Binary;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * This interface represents an abstraction of binary value. This interface extends the Binary
 * interface. This interface define a value type and six methods of binary value.
 */
public interface BinaryValue<VALUE extends BinaryValue>
        extends Binary {

    /**
     * This field represents the value type (classes name) of a binary value.
     */
    Class<?> VALUE = BinaryValue.class;

    /**
     * This method allows to extract a binary value from some object if it's possible. The value is
     * extracted according to the following rules:
     * a) if an object is realized the binary value interface, then the binary value is returned;
     * b) if an object isn't realized the binary value interface, then the object class is returned
     * as a binary value.
     * @param value
     * @return
     */
    static Class<?> extract(Object value) {
        return extract(value.getClass());
    }

    /**
     * This method allows to extract a binary value from the value object.
     * @return
     */
    default Class<?> extract() {
        return extract(this);
    }

    /**
     * This method allows to check a binary value type of the value object.
     * @return
     */
    default boolean is(Class<?> value) {
        return extract(this) == extract(value)
                && extract(this).equals(extract(value));
    }

    /**
     * This method allows to compare a binary value with other binary value by binary value type.
     * This method returns true if binary values are realized the same binary value interfaces.
     * @return
     */
    default boolean same(VALUE value) {
        return extract(this) == extract(value)
                && extract(this).equals(extract(value));
    }

    /**
     * This method allows to compare a binary value with other binary value by binary value type.
     * This method returns true if binary values aren't realized the same binary value interfaces.
     * @return
     */
    default boolean different(VALUE value) {
        return !this.same(value);
    }

    /**
     * This method allows to extract a binary value from some class or interface if it's possible.
     * The value is extracted according to the following rules:
     * a) if an object is realized the binary value interface, then the binary value is returned;
     * b) if an object isn't realized the binary value interface, then the object class is returned
     * as a binary value.
     * @return
     */
    static Class<?> extract(Class<?> valueType) {
        return new ArrayList<Class<?>>() {
            {
                Stream.concat(Stream.of(valueType.getInterfaces()),
                        Stream.of(valueType.getSuperclass()))
                        .filter(valueSuperType -> valueSuperType != null)
                        .forEach((valueSuperType) -> {
                            if(valueSuperType == VALUE
                                    || valueSuperType.equals(VALUE)) {
                                add(valueType);
                            } else {
                                if((valueSuperType = extract(valueSuperType)) != null) {
                                    add(valueSuperType);
                                }
                            }
                        });
            }
        }.stream()
         .findAny()
         .orElse(null);
    }
}
