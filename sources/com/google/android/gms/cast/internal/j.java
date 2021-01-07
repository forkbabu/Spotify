package com.google.android.gms.cast.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.cast.n0;
import com.google.android.gms.internal.cast.t;

public final class j extends t implements k {
    j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastService");
    }

    @Override // com.google.android.gms.cast.internal.k
    public final void e0(e eVar, String[] strArr) {
        Parcel T = T();
        n0.b(T, eVar);
        T.writeStringArray(strArr);
        K0(6, T);
    }

    @Override // com.google.android.gms.cast.internal.k
    public final void r0(e eVar, String[] strArr) {
        Parcel T = T();
        n0.b(T, eVar);
        T.writeStringArray(strArr);
        K0(5, T);
    }
}
