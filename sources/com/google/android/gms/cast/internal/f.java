package com.google.android.gms.cast.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.h;
import com.google.android.gms.cast.t0;
import com.google.android.gms.internal.cast.n0;
import com.google.android.gms.internal.cast.t;

public final class f extends t implements g {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    @Override // com.google.android.gms.cast.internal.g
    public final void A0() {
        K0(19, T());
    }

    @Override // com.google.android.gms.cast.internal.g
    public final void R(String str) {
        Parcel T = T();
        T.writeString(str);
        K0(5, T);
    }

    @Override // com.google.android.gms.cast.internal.g
    public final void W1(String str, String str2, t0 t0Var) {
        Parcel T = T();
        T.writeString(str);
        T.writeString(str2);
        n0.c(T, t0Var);
        K0(14, T);
    }

    @Override // com.google.android.gms.cast.internal.g
    public final void Y1(String str, String str2, long j) {
        Parcel T = T();
        T.writeString(str);
        T.writeString(str2);
        T.writeLong(j);
        K0(9, T);
    }

    @Override // com.google.android.gms.cast.internal.g
    public final void d() {
        K0(1, T());
    }

    @Override // com.google.android.gms.cast.internal.g
    public final void f() {
        K0(17, T());
    }

    @Override // com.google.android.gms.cast.internal.g
    public final void o0(boolean z, double d, boolean z2) {
        Parcel T = T();
        int i = n0.a;
        T.writeInt(z ? 1 : 0);
        T.writeDouble(d);
        T.writeInt(z2 ? 1 : 0);
        K0(8, T);
    }

    @Override // com.google.android.gms.cast.internal.g
    public final void o1(String str) {
        Parcel T = T();
        T.writeString(str);
        K0(11, T);
    }

    @Override // com.google.android.gms.cast.internal.g
    public final void w0(i iVar) {
        Parcel T = T();
        n0.b(T, iVar);
        K0(18, T);
    }

    @Override // com.google.android.gms.cast.internal.g
    public final void x2(String str) {
        Parcel T = T();
        T.writeString(str);
        K0(12, T);
    }

    @Override // com.google.android.gms.cast.internal.g
    public final void x3(String str, h hVar) {
        Parcel T = T();
        T.writeString(str);
        n0.c(T, hVar);
        K0(13, T);
    }
}
