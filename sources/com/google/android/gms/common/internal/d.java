package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public class d extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<d> CREATOR = new u0();
    private final p a;
    private final boolean b;
    private final boolean c;
    private final int[] f;
    private final int n;

    public d(@RecentlyNonNull p pVar, boolean z, boolean z2, int[] iArr, int i) {
        this.a = pVar;
        this.b = z;
        this.c = z2;
        this.f = iArr;
        this.n = i;
    }

    public int I1() {
        return this.n;
    }

    @RecentlyNullable
    public int[] Q1() {
        return this.f;
    }

    public boolean o2() {
        return this.b;
    }

    public boolean p2() {
        return this.c;
    }

    @RecentlyNonNull
    public p q2() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.S(parcel, 1, this.a, i, false);
        SafeParcelReader.C(parcel, 2, this.b);
        SafeParcelReader.C(parcel, 3, this.c);
        SafeParcelReader.N(parcel, 4, this.f, false);
        SafeParcelReader.M(parcel, 5, this.n);
        SafeParcelReader.m(parcel, a2);
    }
}
