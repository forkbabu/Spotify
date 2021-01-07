package defpackage;

import java.nio.ByteBuffer;

/* renamed from: k50  reason: default package */
public class k50 {
    public static final k50 j = new k50(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final k50 k = new k50(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final k50 l = new k50(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final k50 m = new k50(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    double a;
    double b;
    double c;
    double d;
    double e;
    double f;
    double g;
    double h;
    double i;

    public k50(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.a = d6;
        this.b = d7;
        this.c = d8;
        this.d = d2;
        this.e = d3;
        this.f = d4;
        this.g = d5;
        this.h = d9;
        this.i = d10;
    }

    public static k50 a(ByteBuffer byteBuffer) {
        double g2 = h7.g(byteBuffer);
        double g3 = h7.g(byteBuffer);
        double f2 = h7.f(byteBuffer);
        return new k50(g2, g3, h7.g(byteBuffer), h7.g(byteBuffer), f2, h7.f(byteBuffer), h7.f(byteBuffer), h7.g(byteBuffer), h7.g(byteBuffer));
    }

    public void b(ByteBuffer byteBuffer) {
        pe.b(byteBuffer, this.d);
        pe.b(byteBuffer, this.e);
        pe.a(byteBuffer, this.a);
        pe.b(byteBuffer, this.f);
        pe.b(byteBuffer, this.g);
        pe.a(byteBuffer, this.b);
        pe.b(byteBuffer, this.h);
        pe.b(byteBuffer, this.i);
        pe.a(byteBuffer, this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k50.class != obj.getClass()) {
            return false;
        }
        k50 k50 = (k50) obj;
        return Double.compare(k50.d, this.d) == 0 && Double.compare(k50.e, this.e) == 0 && Double.compare(k50.f, this.f) == 0 && Double.compare(k50.g, this.g) == 0 && Double.compare(k50.h, this.h) == 0 && Double.compare(k50.i, this.i) == 0 && Double.compare(k50.a, this.a) == 0 && Double.compare(k50.b, this.b) == 0 && Double.compare(k50.c, this.c) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public String toString() {
        if (equals(j)) {
            return "Rotate 0°";
        }
        if (equals(k)) {
            return "Rotate 90°";
        }
        if (equals(l)) {
            return "Rotate 180°";
        }
        if (equals(m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.a + ", v=" + this.b + ", w=" + this.c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f + ", d=" + this.g + ", tx=" + this.h + ", ty=" + this.i + '}';
    }
}
