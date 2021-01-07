package org.threeten.bp.format;

import java.util.concurrent.ConcurrentHashMap;

public final class g {
    public static final g e = new g('0', '+', '-', '.');
    private final char a;
    private final char b;
    private final char c;
    private final char d;

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private g(char c2, char c3, char c4, char c5) {
        this.a = c2;
        this.b = c3;
        this.c = c4;
        this.d = c5;
    }

    /* access modifiers changed from: package-private */
    public String a(String str) {
        char c2 = this.a;
        if (c2 == '0') {
            return str;
        }
        int i = c2 - '0';
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            charArray[i2] = (char) (charArray[i2] + i);
        }
        return new String(charArray);
    }

    /* access modifiers changed from: package-private */
    public int b(char c2) {
        int i = c2 - this.a;
        if (i < 0 || i > 9) {
            return -1;
        }
        return i;
    }

    public char c() {
        return this.d;
    }

    public char d() {
        return this.c;
    }

    public char e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.a == gVar.a && this.b == gVar.b && this.c == gVar.c && this.d == gVar.d) {
            return true;
        }
        return false;
    }

    public char f() {
        return this.a;
    }

    public int hashCode() {
        return this.a + this.b + this.c + this.d;
    }

    public String toString() {
        StringBuilder V0 = je.V0("DecimalStyle[");
        V0.append(this.a);
        V0.append(this.b);
        V0.append(this.c);
        V0.append(this.d);
        V0.append("]");
        return V0.toString();
    }
}
