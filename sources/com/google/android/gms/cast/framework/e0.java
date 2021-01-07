package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.cast.n0;
import com.google.android.gms.internal.cast.t;

public final class e0 extends t implements c0 {
    e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    @Override // com.google.android.gms.cast.framework.c0
    public final void C(d dVar, String str, String str2, boolean z) {
        Parcel T = T();
        n0.c(T, dVar);
        T.writeString(str);
        T.writeString(str2);
        T.writeInt(z ? 1 : 0);
        C0(4, T);
    }

    @Override // com.google.android.gms.cast.framework.c0
    public final void H0(boolean z, int i) {
        Parcel T = T();
        int i2 = n0.a;
        T.writeInt(z ? 1 : 0);
        T.writeInt(0);
        C0(6, T);
    }

    @Override // com.google.android.gms.cast.framework.c0
    public final void g(Bundle bundle) {
        Parcel T = T();
        n0.c(T, null);
        C0(1, T);
    }

    @Override // com.google.android.gms.cast.framework.c0
    public final void i(int i) {
        Parcel T = T();
        T.writeInt(i);
        C0(2, T);
    }

    @Override // com.google.android.gms.cast.framework.c0
    public final void n(ConnectionResult connectionResult) {
        Parcel T = T();
        n0.c(T, connectionResult);
        C0(3, T);
    }

    @Override // com.google.android.gms.cast.framework.c0
    public final void z(int i) {
        Parcel T = T();
        T.writeInt(i);
        C0(5, T);
    }
}
