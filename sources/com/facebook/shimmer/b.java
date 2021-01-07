package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;

public class b {
    final float[] a = new float[4];
    final int[] b = new int[4];
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    float i;
    float j;
    float k;
    float l;
    float m;
    boolean n;
    boolean o;
    boolean p;
    int q;
    int r;
    long s;
    long t;

    public static class a extends AbstractC0080b<a> {
        public a() {
            this.a.p = true;
        }

        /* Return type fixed from 'com.facebook.shimmer.b$b' to match base method */
        /* access modifiers changed from: protected */
        @Override // com.facebook.shimmer.b.AbstractC0080b
        public a c() {
            return this;
        }
    }

    /* renamed from: com.facebook.shimmer.b$b  reason: collision with other inner class name */
    public static abstract class AbstractC0080b<T extends AbstractC0080b<T>> {
        final b a = new b();

        public b a() {
            b bVar = this.a;
            int i = bVar.f;
            if (i != 1) {
                int[] iArr = bVar.b;
                int i2 = bVar.e;
                iArr[0] = i2;
                int i3 = bVar.d;
                iArr[1] = i3;
                iArr[2] = i3;
                iArr[3] = i2;
            } else {
                int[] iArr2 = bVar.b;
                int i4 = bVar.d;
                iArr2[0] = i4;
                iArr2[1] = i4;
                int i5 = bVar.e;
                iArr2[2] = i5;
                iArr2[3] = i5;
            }
            if (i != 1) {
                bVar.a[0] = Math.max(((1.0f - bVar.k) - bVar.l) / 2.0f, 0.0f);
                bVar.a[1] = Math.max(((1.0f - bVar.k) - 0.001f) / 2.0f, 0.0f);
                bVar.a[2] = Math.min(((bVar.k + 1.0f) + 0.001f) / 2.0f, 1.0f);
                bVar.a[3] = Math.min(((bVar.k + 1.0f) + bVar.l) / 2.0f, 1.0f);
            } else {
                float[] fArr = bVar.a;
                fArr[0] = 0.0f;
                fArr[1] = Math.min(bVar.k, 1.0f);
                bVar.a[2] = Math.min(bVar.k + bVar.l, 1.0f);
                bVar.a[3] = 1.0f;
            }
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public T b(TypedArray typedArray) {
            if (typedArray.hasValue(3)) {
                this.a.n = typedArray.getBoolean(3, this.a.n);
                c();
            }
            if (typedArray.hasValue(0)) {
                this.a.o = typedArray.getBoolean(0, this.a.o);
                c();
            }
            if (typedArray.hasValue(1)) {
                b bVar = this.a;
                bVar.e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (bVar.e & 16777215);
                c();
            }
            if (typedArray.hasValue(11)) {
                b bVar2 = this.a;
                bVar2.d = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(11, 1.0f))) * 255.0f)) << 24) | (16777215 & bVar2.d);
                c();
            }
            if (typedArray.hasValue(7)) {
                long j = (long) typedArray.getInt(7, (int) this.a.s);
                if (j >= 0) {
                    this.a.s = j;
                    c();
                } else {
                    throw new IllegalArgumentException(je.t0("Given a negative duration: ", j));
                }
            }
            if (typedArray.hasValue(14)) {
                this.a.q = typedArray.getInt(14, this.a.q);
                c();
            }
            if (typedArray.hasValue(15)) {
                long j2 = (long) typedArray.getInt(15, (int) this.a.t);
                if (j2 >= 0) {
                    this.a.t = j2;
                    c();
                } else {
                    throw new IllegalArgumentException(je.t0("Given a negative repeat delay: ", j2));
                }
            }
            if (typedArray.hasValue(16)) {
                this.a.r = typedArray.getInt(16, this.a.r);
                c();
            }
            if (typedArray.hasValue(5)) {
                int i = typedArray.getInt(5, this.a.c);
                if (i == 1) {
                    d(1);
                } else if (i == 2) {
                    d(2);
                } else if (i != 3) {
                    d(0);
                } else {
                    d(3);
                }
            }
            if (typedArray.hasValue(17)) {
                if (typedArray.getInt(17, this.a.f) != 1) {
                    this.a.f = 0;
                    c();
                } else {
                    this.a.f = 1;
                    c();
                }
            }
            if (typedArray.hasValue(6)) {
                float f = typedArray.getFloat(6, this.a.l);
                if (f >= 0.0f) {
                    this.a.l = f;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid dropoff value: " + f);
                }
            }
            if (typedArray.hasValue(9)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(9, this.a.g);
                if (dimensionPixelSize >= 0) {
                    this.a.g = dimensionPixelSize;
                    c();
                } else {
                    throw new IllegalArgumentException(je.p0("Given invalid width: ", dimensionPixelSize));
                }
            }
            if (typedArray.hasValue(8)) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, this.a.h);
                if (dimensionPixelSize2 >= 0) {
                    this.a.h = dimensionPixelSize2;
                    c();
                } else {
                    throw new IllegalArgumentException(je.p0("Given invalid height: ", dimensionPixelSize2));
                }
            }
            if (typedArray.hasValue(13)) {
                float f2 = typedArray.getFloat(13, this.a.k);
                if (f2 >= 0.0f) {
                    this.a.k = f2;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid intensity value: " + f2);
                }
            }
            if (typedArray.hasValue(19)) {
                float f3 = typedArray.getFloat(19, this.a.i);
                if (f3 >= 0.0f) {
                    this.a.i = f3;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid width ratio: " + f3);
                }
            }
            if (typedArray.hasValue(10)) {
                float f4 = typedArray.getFloat(10, this.a.j);
                if (f4 >= 0.0f) {
                    this.a.j = f4;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid height ratio: " + f4);
                }
            }
            if (typedArray.hasValue(18)) {
                this.a.m = typedArray.getFloat(18, this.a.m);
                c();
            }
            return c();
        }

        /* access modifiers changed from: protected */
        public abstract T c();

        public T d(int i) {
            this.a.c = i;
            return c();
        }
    }

    public static class c extends AbstractC0080b<c> {
        public c() {
            this.a.p = false;
        }

        /* Return type fixed from 'com.facebook.shimmer.b$b' to match base method */
        /* access modifiers changed from: package-private */
        @Override // com.facebook.shimmer.b.AbstractC0080b
        public c b(TypedArray typedArray) {
            super.b(typedArray);
            if (typedArray.hasValue(2)) {
                int color = typedArray.getColor(2, this.a.e);
                b bVar = this.a;
                bVar.e = (color & 16777215) | (bVar.e & -16777216);
            }
            if (typedArray.hasValue(12)) {
                this.a.d = typedArray.getColor(12, this.a.d);
            }
            return this;
        }

        /* Return type fixed from 'com.facebook.shimmer.b$b' to match base method */
        /* access modifiers changed from: protected */
        @Override // com.facebook.shimmer.b.AbstractC0080b
        public c c() {
            return this;
        }
    }

    b() {
        new RectF();
        this.c = 0;
        this.d = -1;
        this.e = 1291845631;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 1.0f;
        this.j = 1.0f;
        this.k = 0.0f;
        this.l = 0.5f;
        this.m = 20.0f;
        this.n = true;
        this.o = true;
        this.p = true;
        this.q = -1;
        this.r = 1;
        this.s = 1000;
    }
}
