package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new n0();
    private final String a;
    private final int b;
    private final String c;

    e(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public String I1() {
        return this.a;
    }

    public String Q1() {
        return this.c;
    }

    public int o2() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 2, this.a, false);
        SafeParcelReader.M(parcel, 3, this.b);
        SafeParcelReader.T(parcel, 4, this.c, false);
        SafeParcelReader.m(parcel, a2);
    }
}
