package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.zzlo;

final class b5 {
    private final zzlo a;
    private final byte[] b;

    b5(int i, y4 y4Var) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        int i2 = zzlo.d;
        this.a = new zzlo.a(bArr, i);
    }

    public final zzlb a() {
        if (this.a.N() == 0) {
            return new zzll(this.b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final zzlo b() {
        return this.a;
    }
}
