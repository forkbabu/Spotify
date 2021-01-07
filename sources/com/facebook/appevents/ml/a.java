package com.facebook.appevents.ml;

public class a {
    private float[] a;
    private int[] b;
    private int c;

    public a(int[] iArr) {
        this.b = iArr;
        int i = 1;
        for (int i2 : iArr) {
            i *= i2;
        }
        this.c = i;
        this.a = new float[i];
    }

    public float[] a() {
        return this.a;
    }

    public int b(int i) {
        return this.b[i];
    }

    public int c() {
        return this.b.length;
    }

    public void d(int[] iArr) {
        this.b = iArr;
        int i = 1;
        for (int i2 : iArr) {
            i *= i2;
        }
        float[] fArr = new float[i];
        System.arraycopy(this.a, 0, fArr, 0, Math.min(this.c, i));
        this.a = fArr;
        this.c = i;
    }
}
