package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.measurement.v;
import java.util.ArrayList;
import java.util.List;

public final class u3 extends a implements s3 {
    u3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final List<oa> B0(String str, String str2, String str3) {
        Parcel T = T();
        T.writeString(str);
        T.writeString(str2);
        T.writeString(str3);
        Parcel a0 = a0(17, T);
        ArrayList createTypedArrayList = a0.createTypedArrayList(oa.CREATOR);
        a0.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final List<oa> D0(String str, String str2, fa faVar) {
        Parcel T = T();
        T.writeString(str);
        T.writeString(str2);
        v.c(T, faVar);
        Parcel a0 = a0(16, T);
        ArrayList createTypedArrayList = a0.createTypedArrayList(oa.CREATOR);
        a0.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void E2(fa faVar) {
        Parcel T = T();
        v.c(T, faVar);
        C0(18, T);
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void J(oa oaVar, fa faVar) {
        Parcel T = T();
        v.c(T, oaVar);
        v.c(T, faVar);
        C0(12, T);
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void J0(fa faVar) {
        Parcel T = T();
        v.c(T, faVar);
        C0(4, T);
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final List<y9> O2(String str, String str2, boolean z, fa faVar) {
        Parcel T = T();
        T.writeString(str);
        T.writeString(str2);
        int i = v.b;
        T.writeInt(z ? 1 : 0);
        v.c(T, faVar);
        Parcel a0 = a0(14, T);
        ArrayList createTypedArrayList = a0.createTypedArrayList(y9.CREATOR);
        a0.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void P1(fa faVar) {
        Parcel T = T();
        v.c(T, faVar);
        C0(20, T);
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void U(y9 y9Var, fa faVar) {
        Parcel T = T();
        v.c(T, y9Var);
        v.c(T, faVar);
        C0(2, T);
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final List<y9> Y(String str, String str2, String str3, boolean z) {
        Parcel T = T();
        T.writeString(str);
        T.writeString(str2);
        T.writeString(str3);
        int i = v.b;
        T.writeInt(z ? 1 : 0);
        Parcel a0 = a0(15, T);
        ArrayList createTypedArrayList = a0.createTypedArrayList(y9.CREATOR);
        a0.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void Z0(fa faVar) {
        Parcel T = T();
        v.c(T, faVar);
        C0(6, T);
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final byte[] c1(r rVar, String str) {
        Parcel T = T();
        v.c(T, rVar);
        T.writeString(str);
        Parcel a0 = a0(9, T);
        byte[] createByteArray = a0.createByteArray();
        a0.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void d1(r rVar, fa faVar) {
        Parcel T = T();
        v.c(T, rVar);
        v.c(T, faVar);
        C0(1, T);
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final String p2(fa faVar) {
        Parcel T = T();
        v.c(T, faVar);
        Parcel a0 = a0(11, T);
        String readString = a0.readString();
        a0.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void x1(Bundle bundle, fa faVar) {
        Parcel T = T();
        v.c(T, bundle);
        v.c(T, faVar);
        C0(19, T);
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void z0(long j, String str, String str2, String str3) {
        Parcel T = T();
        T.writeLong(j);
        T.writeString(str);
        T.writeString(str2);
        T.writeString(str3);
        C0(10, T);
    }
}
