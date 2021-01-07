package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class o extends m {
    private static final WeakReference<byte[]> c = new WeakReference<>(null);
    private WeakReference<byte[]> b = c;

    o(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.m
    public final byte[] E3() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.b.get();
            if (bArr == null) {
                bArr = G3();
                this.b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] G3();
}
