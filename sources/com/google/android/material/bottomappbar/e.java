package com.google.android.material.bottomappbar;

public class e extends wx implements Cloneable {
    private float a;
    private float b;
    private float c;
    private float f;
    private float n = 0.0f;

    public e(float f2, float f3, float f4) {
        this.b = f2;
        this.a = f3;
        k(f4);
    }

    @Override // defpackage.wx
    public void c(float f2, float f3, float f4, fy fyVar) {
        float f5 = this.c;
        if (f5 == 0.0f) {
            fyVar.e(f2, 0.0f);
            return;
        }
        float f6 = ((this.b * 2.0f) + f5) / 2.0f;
        float f7 = f4 * this.a;
        float f8 = f3 + this.n;
        float a2 = je.a(1.0f, f4, f6, this.f * f4);
        if (a2 / f6 >= 1.0f) {
            fyVar.e(f2, 0.0f);
            return;
        }
        float f9 = f6 + f7;
        float f10 = a2 + f7;
        float sqrt = (float) Math.sqrt((double) ((f9 * f9) - (f10 * f10)));
        float f11 = f8 - sqrt;
        float f12 = f8 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f10)));
        float f13 = 90.0f - degrees;
        fyVar.e(f11, 0.0f);
        float f14 = f7 * 2.0f;
        fyVar.a(f11 - f7, 0.0f, f11 + f7, f14, 270.0f, degrees);
        fyVar.a(f8 - f6, (-f6) - a2, f8 + f6, f6 - a2, 180.0f - f13, (f13 * 2.0f) - 180.0f);
        fyVar.a(f12 - f7, 0.0f, f12 + f7, f14, 270.0f - degrees, degrees);
        fyVar.e(f2, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public float d() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public float e() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.a;
    }

    public float g() {
        return this.c;
    }

    public float j() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public void k(float f2) {
        if (f2 >= 0.0f) {
            this.f = f2;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* access modifiers changed from: package-private */
    public void m(float f2) {
        this.b = f2;
    }

    /* access modifiers changed from: package-private */
    public void n(float f2) {
        this.a = f2;
    }

    public void o(float f2) {
        this.c = f2;
    }

    /* access modifiers changed from: package-private */
    public void p(float f2) {
        this.n = f2;
    }
}
