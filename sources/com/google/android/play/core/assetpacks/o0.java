package com.google.android.play.core.assetpacks;

import java.io.InputStream;

/* access modifiers changed from: package-private */
public final class o0 extends k1 {
    final int c;
    final long d;
    final String e;
    final int f;
    final int g;
    final int h;
    final long i;
    final int j;
    final InputStream k;

    o0(int i2, String str, int i3, long j2, String str2, int i4, int i5, int i6, long j3, int i7, InputStream inputStream) {
        super(i2, str);
        this.c = i3;
        this.d = j2;
        this.e = str2;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = j3;
        this.j = i7;
        this.k = inputStream;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.g + 1 == this.h;
    }
}
