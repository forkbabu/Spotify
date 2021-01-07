package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class m extends t implements n {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    @Override // com.google.android.gms.internal.cast.n
    public final void I1(String str, Bundle bundle) {
        Parcel T = T();
        T.writeString(str);
        n0.c(T, bundle);
        C0(2, T);
    }

    @Override // com.google.android.gms.internal.cast.n
    public final void N2(String str, Bundle bundle, int i) {
        Parcel T = T();
        T.writeString(str);
        n0.c(T, bundle);
        T.writeInt(i);
        C0(6, T);
    }

    @Override // com.google.android.gms.internal.cast.n
    public final void T1(String str, Bundle bundle) {
        Parcel T = T();
        T.writeString(str);
        n0.c(T, bundle);
        C0(1, T);
    }

    @Override // com.google.android.gms.internal.cast.n
    public final void g1(String str, Bundle bundle) {
        Parcel T = T();
        T.writeString(str);
        n0.c(T, bundle);
        C0(4, T);
    }

    @Override // com.google.android.gms.internal.cast.n
    public final void z1(String str, Bundle bundle) {
        Parcel T = T();
        T.writeString(str);
        n0.c(T, bundle);
        C0(3, T);
    }
}
