package org.msgpack.core;

public class a {
    private final byte a;
    private final int b;

    public a(byte b2, int i) {
        yif.e(i >= 0, "length must be >= 0");
        this.a = b2;
        this.b = i;
    }

    public int a() {
        return this.b;
    }

    public byte b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && this.b == aVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a + 31) * 31) + this.b;
    }

    public String toString() {
        return String.format("ExtensionTypeHeader(type:%d, length:%,d)", Byte.valueOf(this.a), Integer.valueOf(this.b));
    }
}
