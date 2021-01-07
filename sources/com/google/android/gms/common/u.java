package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public final class u extends a {
    public static final Parcelable.Creator<u> CREATOR = new w();
    private final boolean a;
    private final String b;
    private final int c;

    u(boolean z, String str, int i) {
        this.a = z;
        this.b = str;
        this.c = zzo.d(i).zzb;
    }

    public final String I1() {
        return this.b;
    }

    public final zzo Q1() {
        return zzo.d(this.c);
    }

    public final boolean a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.C(parcel, 1, this.a);
        SafeParcelReader.T(parcel, 2, this.b, false);
        SafeParcelReader.M(parcel, 3, this.c);
        SafeParcelReader.m(parcel, a2);
    }
}
