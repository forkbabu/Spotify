package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhf;

final class l3 {
    private final zzhf a;
    private final byte[] b;

    l3(int i, i3 i3Var) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        int i2 = zzhf.d;
        this.a = new zzhf.a(bArr, i);
    }

    public final zzgm a() {
        if (this.a.b() == 0) {
            return new zzgw(this.b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final zzhf b() {
        return this.a;
    }
}
