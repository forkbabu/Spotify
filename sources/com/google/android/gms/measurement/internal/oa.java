package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public final class oa extends a {
    public static final Parcelable.Creator<oa> CREATOR = new ra();
    public String a;
    public String b;
    public y9 c;
    public long f;
    public boolean n;
    public String o;
    public r p;
    public long q;
    public r r;
    public long s;
    public r t;

    oa(oa oaVar) {
        this.a = oaVar.a;
        this.b = oaVar.b;
        this.c = oaVar.c;
        this.f = oaVar.f;
        this.n = oaVar.n;
        this.o = oaVar.o;
        this.p = oaVar.p;
        this.q = oaVar.q;
        this.r = oaVar.r;
        this.s = oaVar.s;
        this.t = oaVar.t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 2, this.a, false);
        SafeParcelReader.T(parcel, 3, this.b, false);
        SafeParcelReader.S(parcel, 4, this.c, i, false);
        SafeParcelReader.P(parcel, 5, this.f);
        SafeParcelReader.C(parcel, 6, this.n);
        SafeParcelReader.T(parcel, 7, this.o, false);
        SafeParcelReader.S(parcel, 8, this.p, i, false);
        SafeParcelReader.P(parcel, 9, this.q);
        SafeParcelReader.S(parcel, 10, this.r, i, false);
        SafeParcelReader.P(parcel, 11, this.s);
        SafeParcelReader.S(parcel, 12, this.t, i, false);
        SafeParcelReader.m(parcel, a2);
    }

    oa(String str, String str2, y9 y9Var, long j, boolean z, String str3, r rVar, long j2, r rVar2, long j3, r rVar3) {
        this.a = str;
        this.b = str2;
        this.c = y9Var;
        this.f = j;
        this.n = z;
        this.o = str3;
        this.p = rVar;
        this.q = j2;
        this.r = rVar2;
        this.s = j3;
        this.t = rVar3;
    }
}
