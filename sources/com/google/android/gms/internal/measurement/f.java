package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new i();
    public final long a;
    public final long b;
    public final boolean c;
    public final String f;
    public final String n;
    public final String o;
    public final Bundle p;

    public f(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.f = str;
        this.n = str2;
        this.o = str3;
        this.p = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.P(parcel, 1, this.a);
        SafeParcelReader.P(parcel, 2, this.b);
        SafeParcelReader.C(parcel, 3, this.c);
        SafeParcelReader.T(parcel, 4, this.f, false);
        SafeParcelReader.T(parcel, 5, this.n, false);
        SafeParcelReader.T(parcel, 6, this.o, false);
        SafeParcelReader.E(parcel, 7, this.p, false);
        SafeParcelReader.m(parcel, a2);
    }
}
