package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public final class t0 extends a {
    public static final Parcelable.Creator<t0> CREATOR = new s0();
    Bundle a;
    c[] b;
    private int c;
    d f;

    t0(Bundle bundle, c[] cVarArr, int i, d dVar) {
        this.a = bundle;
        this.b = cVarArr;
        this.c = i;
        this.f = dVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.E(parcel, 1, this.a, false);
        SafeParcelReader.W(parcel, 2, this.b, i, false);
        SafeParcelReader.M(parcel, 3, this.c);
        SafeParcelReader.S(parcel, 4, this.f, i, false);
        SafeParcelReader.m(parcel, a2);
    }

    public t0() {
    }
}
