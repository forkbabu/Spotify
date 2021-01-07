package com.fasterxml.jackson.core.util;

import java.io.Serializable;

public class Separators implements Serializable {
    private static final long serialVersionUID = 1;
    private final char arrayValueSeparator = ',';
    private final char objectEntrySeparator = ',';
    private final char objectFieldValueSeparator = ':';

    public char getArrayValueSeparator() {
        return this.arrayValueSeparator;
    }

    public char getObjectEntrySeparator() {
        return this.objectEntrySeparator;
    }

    public char getObjectFieldValueSeparator() {
        return this.objectFieldValueSeparator;
    }
}
