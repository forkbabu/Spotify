package com.google.android.gms.internal.measurement;

import java.util.Arrays;

final class j3 implements k3 {
    j3(i3 i3Var) {
    }

    @Override // com.google.android.gms.internal.measurement.k3
    public final byte[] a(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }
}
