package defpackage;

import androidx.constraintlayout.motion.widget.n;

/* renamed from: b2  reason: default package */
public class b2 extends n {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private int j;
    private boolean k = false;
    private float l;
    private float m;

    private void d(float f2, float f3, float f4, float f5, float f6) {
        if (f2 == 0.0f) {
            f2 = 1.0E-4f;
        }
        this.a = f2;
        float f7 = f2 / f4;
        float f8 = (f7 * f2) / 2.0f;
        if (f2 < 0.0f) {
            float sqrt = (float) Math.sqrt((double) ((f3 - ((((-f2) / f4) * f2) / 2.0f)) * f4));
            if (sqrt < f5) {
                this.j = 2;
                this.a = f2;
                this.b = sqrt;
                this.c = 0.0f;
                float f9 = (sqrt - f2) / f4;
                this.d = f9;
                this.e = sqrt / f4;
                this.g = ((f2 + sqrt) * f9) / 2.0f;
                this.h = f3;
                this.i = f3;
                return;
            }
            this.j = 3;
            this.a = f2;
            this.b = f5;
            this.c = f5;
            float f10 = (f5 - f2) / f4;
            this.d = f10;
            float f11 = f5 / f4;
            this.f = f11;
            float f12 = ((f2 + f5) * f10) / 2.0f;
            float f13 = (f11 * f5) / 2.0f;
            this.e = ((f3 - f12) - f13) / f5;
            this.g = f12;
            this.h = f3 - f13;
            this.i = f3;
        } else if (f8 >= f3) {
            this.j = 1;
            this.a = f2;
            this.b = 0.0f;
            this.g = f3;
            this.d = (2.0f * f3) / f2;
        } else {
            float f14 = f3 - f8;
            float f15 = f14 / f2;
            if (f15 + f7 < f6) {
                this.j = 2;
                this.a = f2;
                this.b = f2;
                this.c = 0.0f;
                this.g = f14;
                this.h = f3;
                this.d = f15;
                this.e = f7;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) (((f2 * f2) / 2.0f) + (f4 * f3)));
            float f16 = (sqrt2 - f2) / f4;
            this.d = f16;
            float f17 = sqrt2 / f4;
            this.e = f17;
            if (sqrt2 < f5) {
                this.j = 2;
                this.a = f2;
                this.b = sqrt2;
                this.c = 0.0f;
                this.d = f16;
                this.e = f17;
                this.g = ((f2 + sqrt2) * f16) / 2.0f;
                this.h = f3;
                return;
            }
            this.j = 3;
            this.a = f2;
            this.b = f5;
            this.c = f5;
            float f18 = (f5 - f2) / f4;
            this.d = f18;
            float f19 = f5 / f4;
            this.f = f19;
            float f20 = ((f2 + f5) * f18) / 2.0f;
            float f21 = (f19 * f5) / 2.0f;
            this.e = ((f3 - f20) - f21) / f5;
            this.g = f20;
            this.h = f3 - f21;
            this.i = f3;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.n
    public float a() {
        return this.k ? -c(this.m) : c(this.m);
    }

    public void b(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.l = f2;
        boolean z = f2 > f3;
        this.k = z;
        if (z) {
            d(-f4, f2 - f3, f6, f7, f5);
        } else {
            d(f4, f3 - f2, f6, f7, f5);
        }
    }

    public float c(float f2) {
        float f3;
        float f4;
        float f5 = this.d;
        if (f2 <= f5) {
            f3 = this.a;
            f4 = this.b;
        } else {
            int i2 = this.j;
            if (i2 == 1) {
                return 0.0f;
            }
            f2 -= f5;
            f5 = this.e;
            if (f2 < f5) {
                f3 = this.b;
                f4 = this.c;
            } else if (i2 == 2) {
                return this.h;
            } else {
                float f6 = f2 - f5;
                float f7 = this.f;
                if (f6 >= f7) {
                    return this.i;
                }
                float f8 = this.c;
                return f8 - ((f6 * f8) / f7);
            }
        }
        return (((f4 - f3) * f2) / f5) + f3;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        float f3;
        float f4 = this.d;
        if (f2 <= f4) {
            float f5 = this.a;
            f3 = ((((this.b - f5) * f2) * f2) / (f4 * 2.0f)) + (f5 * f2);
        } else {
            int i2 = this.j;
            if (i2 == 1) {
                f3 = this.g;
            } else {
                float f6 = f2 - f4;
                float f7 = this.e;
                if (f6 < f7) {
                    float f8 = this.g;
                    float f9 = this.b;
                    f3 = ((((this.c - f9) * f6) * f6) / (f7 * 2.0f)) + (f9 * f6) + f8;
                } else if (i2 == 2) {
                    f3 = this.h;
                } else {
                    float f10 = f6 - f7;
                    float f11 = this.f;
                    if (f10 < f11) {
                        float f12 = this.h;
                        float f13 = this.c * f10;
                        f3 = (f12 + f13) - ((f13 * f10) / (f11 * 2.0f));
                    } else {
                        f3 = this.i;
                    }
                }
            }
        }
        this.m = f2;
        return this.k ? this.l - f3 : this.l + f3;
    }
}
