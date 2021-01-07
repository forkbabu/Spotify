package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public final class f0 extends a {
    public static final Parcelable.Creator<f0> CREATOR = new e0();
    private final int a;
    private final int b;
    private final int c;
    private final long f;
    private final long n;

    public f0(int i, int i2, int i3, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.f = j;
        this.n = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 1, this.a);
        SafeParcelReader.M(parcel, 2, this.b);
        SafeParcelReader.M(parcel, 3, this.c);
        SafeParcelReader.P(parcel, 4, this.f);
        SafeParcelReader.P(parcel, 5, this.n);
        SafeParcelReader.m(parcel, a2);
    }
}
