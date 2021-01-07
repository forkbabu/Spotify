package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import android.text.Layout;

public class a {
    public static final a n = new a("");
    public final CharSequence a;
    public final float b;
    public final float c;
    public final int f;

    public a(Bitmap bitmap, float f2, int i, float f3, int i2, float f4, float f5) {
        this(null, null, bitmap, f3, 0, i2, f2, i, Integer.MIN_VALUE, -3.4028235E38f, f4, f5, false, -16777216);
    }

    public a(CharSequence charSequence) {
        this.a = charSequence;
        this.b = -3.4028235E38f;
        this.c = -3.4028235E38f;
        this.f = Integer.MIN_VALUE;
    }

    public a(CharSequence charSequence, Layout.Alignment alignment, float f2, int i, int i2, float f3, int i3, float f4) {
        this.a = charSequence;
        this.b = f2;
        this.c = f3;
        this.f = i3;
    }

    public a(CharSequence charSequence, Layout.Alignment alignment, float f2, int i, int i2, float f3, int i3, float f4, int i4, float f5) {
        this.a = charSequence;
        this.b = f2;
        this.c = f3;
        this.f = i3;
    }

    public a(CharSequence charSequence, Layout.Alignment alignment, float f2, int i, int i2, float f3, int i3, float f4, boolean z, int i4) {
        this.a = charSequence;
        this.b = f2;
        this.c = f3;
        this.f = i3;
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f2, int i, int i2, float f3, int i3, int i4, float f4, float f5, float f6, boolean z, int i5) {
        this.a = null;
        this.b = f2;
        this.c = f3;
        this.f = i3;
    }
}
