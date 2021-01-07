package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public final class n0 extends a {
    public static final Parcelable.Creator<n0> CREATOR = new q0();
    private final int a;
    private final int b;
    private final int c;
    @Deprecated
    private final Scope[] f;

    public n0(int i, int i2) {
        this.a = 1;
        this.b = i;
        this.c = i2;
        this.f = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 1, this.a);
        SafeParcelReader.M(parcel, 2, this.b);
        SafeParcelReader.M(parcel, 3, this.c);
        SafeParcelReader.W(parcel, 4, this.f, i, false);
        SafeParcelReader.m(parcel, a2);
    }

    n0(int i, int i2, int i3, Scope[] scopeArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.f = scopeArr;
    }
}
