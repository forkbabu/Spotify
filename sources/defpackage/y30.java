package defpackage;

import java.util.Date;

/* renamed from: y30  reason: default package */
public class y30 implements Cloneable {
    private String a = "eng";
    private long b;
    private Date c;
    private k50 f;
    private double n;
    private double o;
    private float p;
    private long q;
    int r;

    public y30() {
        new Date();
        this.c = new Date();
        this.f = k50.j;
        this.q = 1;
    }

    public Date b() {
        return this.c;
    }

    public double c() {
        return this.o;
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String d() {
        return this.a;
    }

    public int e() {
        return this.r;
    }

    public k50 f() {
        return this.f;
    }

    public long g() {
        return this.b;
    }

    public long j() {
        return this.q;
    }

    public float k() {
        return this.p;
    }

    public double m() {
        return this.n;
    }

    public void n(Date date) {
        this.c = date;
    }

    public void o(double d) {
        this.o = d;
    }

    public void p(String str) {
        this.a = str;
    }

    public void q(k50 k50) {
        this.f = k50;
    }

    public void r(long j) {
        this.b = j;
    }

    public void s(long j) {
        this.q = j;
    }

    public void t(float f2) {
        this.p = f2;
    }

    public void u(double d) {
        this.n = d;
    }
}
