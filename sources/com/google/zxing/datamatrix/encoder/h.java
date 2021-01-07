package com.google.zxing.datamatrix.encoder;

import com.google.zxing.a;
import java.nio.charset.StandardCharsets;

/* access modifiers changed from: package-private */
public final class h {
    private final String a;
    private SymbolShapeHint b;
    private a c;
    private a d;
    private final StringBuilder e;
    int f;
    private int g;
    private k h;
    private int i;

    h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i2 = 0; i2 < length; i2++) {
            char c2 = (char) (bytes[i2] & 255);
            if (c2 != '?' || str.charAt(i2) == '?') {
                sb.append(c2);
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.a = sb.toString();
        this.b = SymbolShapeHint.FORCE_NONE;
        this.e = new StringBuilder(str.length());
        this.g = -1;
    }

    public int a() {
        return this.e.length();
    }

    public StringBuilder b() {
        return this.e;
    }

    public char c() {
        return this.a.charAt(this.f);
    }

    public String d() {
        return this.a;
    }

    public int e() {
        return this.g;
    }

    public int f() {
        return (this.a.length() - this.i) - this.f;
    }

    public k g() {
        return this.h;
    }

    public boolean h() {
        return this.f < this.a.length() - this.i;
    }

    public void i() {
        this.g = -1;
    }

    public void j() {
        this.h = null;
    }

    public void k(a aVar, a aVar2) {
        this.c = aVar;
        this.d = aVar2;
    }

    public void l(int i2) {
        this.i = i2;
    }

    public void m(SymbolShapeHint symbolShapeHint) {
        this.b = symbolShapeHint;
    }

    public void n(int i2) {
        this.g = i2;
    }

    public void o() {
        p(a());
    }

    public void p(int i2) {
        k kVar = this.h;
        if (kVar == null || i2 > kVar.a()) {
            this.h = k.l(i2, this.b, this.c, this.d, true);
        }
    }

    public void q(char c2) {
        this.e.append(c2);
    }

    public void r(String str) {
        this.e.append(str);
    }
}
