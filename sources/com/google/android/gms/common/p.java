package com.google.android.gms.common;

import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class p extends m {
    private final byte[] b;

    p(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.b = bArr;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.m
    public final byte[] E3() {
        return this.b;
    }
}
