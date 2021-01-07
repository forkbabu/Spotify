package com.google.android.exoplayer2.util;

public final class n {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public n(byte[] bArr, int i) {
        u uVar = new u(bArr);
        uVar.m(i * 8);
        uVar.h(16);
        uVar.h(16);
        uVar.h(24);
        this.a = uVar.h(24);
        this.b = uVar.h(20);
        this.c = uVar.h(3) + 1;
        this.d = uVar.h(5) + 1;
        this.e = ((((long) uVar.h(4)) & 15) << 32) | (((long) uVar.h(32)) & 4294967295L);
    }
}
