package defpackage;

import defpackage.r5;

/* renamed from: u5  reason: default package */
public final class u5 {
    double a = Math.sqrt(1500.0d);
    double b = 0.5d;
    private boolean c = false;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i = Double.MAX_VALUE;
    private final r5.j j = new r5.j();

    public u5() {
    }

    public float a() {
        return (float) this.i;
    }

    public boolean b(float f2, float f3) {
        return ((double) Math.abs(f3)) < this.e && ((double) Math.abs(f2 - ((float) this.i))) < this.d;
    }

    public u5 c(float f2) {
        if (f2 >= 0.0f) {
            this.b = (double) f2;
            this.c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public u5 d(float f2) {
        this.i = (double) f2;
        return this;
    }

    public u5 e(float f2) {
        if (f2 > 0.0f) {
            this.a = Math.sqrt((double) f2);
            this.c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* access modifiers changed from: package-private */
    public void f(double d2) {
        double abs = Math.abs(d2);
        this.d = abs;
        this.e = abs * 62.5d;
    }

    /* access modifiers changed from: package-private */
    public r5.j g(double d2, double d3, long j2) {
        double d4;
        double d5;
        if (!this.c) {
            if (this.i != Double.MAX_VALUE) {
                double d6 = this.b;
                if (d6 > 1.0d) {
                    double d7 = this.a;
                    this.f = (Math.sqrt((d6 * d6) - 1.0d) * d7) + ((-d6) * d7);
                    double d8 = this.b;
                    double d9 = this.a;
                    this.g = ((-d8) * d9) - (Math.sqrt((d8 * d8) - 1.0d) * d9);
                } else if (d6 >= 0.0d && d6 < 1.0d) {
                    this.h = Math.sqrt(1.0d - (d6 * d6)) * this.a;
                }
                this.c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d10 = (double) j2;
        Double.isNaN(d10);
        double d11 = d10 / 1000.0d;
        double d12 = d2 - this.i;
        double d13 = this.b;
        if (d13 > 1.0d) {
            double d14 = this.g;
            double d15 = this.f;
            double d16 = d12 - (((d14 * d12) - d3) / (d14 - d15));
            double d17 = ((d12 * d14) - d3) / (d14 - d15);
            d4 = (Math.pow(2.718281828459045d, this.f * d11) * d17) + (Math.pow(2.718281828459045d, d14 * d11) * d16);
            double d18 = this.g;
            double pow = Math.pow(2.718281828459045d, d18 * d11) * d16 * d18;
            double d19 = this.f;
            d5 = (Math.pow(2.718281828459045d, d19 * d11) * d17 * d19) + pow;
        } else if (d13 == 1.0d) {
            double d20 = this.a;
            double d21 = (d20 * d12) + d3;
            double d22 = (d21 * d11) + d12;
            double pow2 = Math.pow(2.718281828459045d, (-d20) * d11) * d22;
            double pow3 = Math.pow(2.718281828459045d, (-this.a) * d11) * d22;
            double d23 = this.a;
            d5 = (Math.pow(2.718281828459045d, (-d23) * d11) * d21) + (pow3 * (-d23));
            d4 = pow2;
        } else {
            double d24 = 1.0d / this.h;
            double d25 = this.a;
            double d26 = ((d13 * d25 * d12) + d3) * d24;
            double sin = ((Math.sin(this.h * d11) * d26) + (Math.cos(this.h * d11) * d12)) * Math.pow(2.718281828459045d, (-d13) * d25 * d11);
            double d27 = this.a;
            double d28 = this.b;
            double d29 = (-d27) * sin * d28;
            double pow4 = Math.pow(2.718281828459045d, (-d28) * d27 * d11);
            double d30 = this.h;
            double d31 = (-d30) * d12;
            double d32 = this.h;
            d5 = (((Math.cos(d32 * d11) * d26 * d32) + (Math.sin(d30 * d11) * d31)) * pow4) + d29;
            d4 = sin;
        }
        r5.j jVar = this.j;
        jVar.a = (float) (d4 + this.i);
        jVar.b = (float) d5;
        return jVar;
    }

    public u5(float f2) {
        this.i = (double) f2;
    }
}
