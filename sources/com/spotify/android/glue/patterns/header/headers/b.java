package com.spotify.android.glue.patterns.header.headers;

/* access modifiers changed from: package-private */
public class b {
    boolean a;
    int b;
    int c;
    int d;
    final int e;
    private float f;
    private final int g;
    private final a h;
    public int i;

    /* access modifiers changed from: package-private */
    public interface a {
    }

    public b(a aVar, float f2, int i2, int i3) {
        this.h = aVar;
        this.f = f2;
        this.e = i2;
        this.g = i3;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        float f2 = this.f;
        int i2 = 0;
        if (f2 == -1.0f) {
            return 0;
        }
        int i3 = (int) (((float) this.g) * f2);
        int i4 = this.e;
        if (!this.a) {
            i2 = this.c;
        }
        return i3 - (i4 + i2);
    }

    public float b() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public void c(int i2) {
        GlueHeaderView.c(this.e + (this.a ? 0 : this.c) + i2 + this.i, GlueHeaderView.this.b.b);
        GlueHeaderView.c(i2 + this.e, GlueHeaderView.this.b.c);
    }

    public void d(float f2) {
        this.f = f2;
    }
}
