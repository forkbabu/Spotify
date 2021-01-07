package org.msgpack.value;

public enum ValueType {
    NIL(false, false),
    BOOLEAN(false, false),
    INTEGER(true, false),
    FLOAT(true, false),
    STRING(false, true),
    BINARY(false, true),
    ARRAY(false, false),
    MAP(false, false),
    EXTENSION(false, true);
    
    private final boolean numberType;
    private final boolean rawType;

    private ValueType(boolean z, boolean z2) {
        this.numberType = z;
        this.rawType = z2;
    }

    public boolean d() {
        return this == ARRAY;
    }

    public boolean g() {
        return this == BINARY;
    }

    public boolean h() {
        return this == BOOLEAN;
    }

    public boolean i() {
        return this == EXTENSION;
    }

    public boolean k() {
        return this == FLOAT;
    }

    public boolean l() {
        return this == INTEGER;
    }

    public boolean m() {
        return this == MAP;
    }

    public boolean n() {
        return this == NIL;
    }

    public boolean p() {
        return this.numberType;
    }

    public boolean q() {
        return this.rawType;
    }

    public boolean r() {
        return this == STRING;
    }
}
