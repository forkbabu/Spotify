package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.cast.t;

public final class n0 extends t implements k0 {
    n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    @Override // com.google.android.gms.cast.framework.k0
    public final a F1() {
        Parcel a0 = a0(1, T());
        a D3 = a.AbstractBinderC0099a.D3(a0.readStrongBinder());
        a0.recycle();
        return D3;
    }

    @Override // com.google.android.gms.cast.framework.k0
    public final void L(boolean z, boolean z2) {
        Parcel T = T();
        int i = com.google.android.gms.internal.cast.n0.a;
        T.writeInt(1);
        T.writeInt(z2 ? 1 : 0);
        C0(6, T);
    }

    @Override // com.google.android.gms.cast.framework.k0
    public final void O(d0 d0Var) {
        Parcel T = T();
        com.google.android.gms.internal.cast.n0.b(T, d0Var);
        C0(4, T);
    }

    @Override // com.google.android.gms.cast.framework.k0
    public final void f2(m0 m0Var) {
        Parcel T = T();
        com.google.android.gms.internal.cast.n0.b(T, m0Var);
        C0(2, T);
    }

    @Override // com.google.android.gms.cast.framework.k0
    public final void q2(m0 m0Var) {
        Parcel T = T();
        com.google.android.gms.internal.cast.n0.b(T, m0Var);
        C0(3, T);
    }

    @Override // com.google.android.gms.cast.framework.k0
    public final a w() {
        Parcel a0 = a0(7, T());
        a D3 = a.AbstractBinderC0099a.D3(a0.readStrongBinder());
        a0.recycle();
        return D3;
    }
}
