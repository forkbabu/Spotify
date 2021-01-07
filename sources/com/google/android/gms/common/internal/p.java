package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public class p extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<p> CREATOR = new l1();
    private final int a;
    private final boolean b;
    private final boolean c;
    private final int f;
    private final int n;

    public p(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.f = i2;
        this.n = i3;
    }

    public int I1() {
        return this.f;
    }

    public int Q1() {
        return this.n;
    }

    public boolean o2() {
        return this.b;
    }

    public boolean p2() {
        return this.c;
    }

    public int q2() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 1, this.a);
        SafeParcelReader.C(parcel, 2, this.b);
        SafeParcelReader.C(parcel, 3, this.c);
        SafeParcelReader.M(parcel, 4, this.f);
        SafeParcelReader.M(parcel, 5, this.n);
        SafeParcelReader.m(parcel, a2);
    }
}
