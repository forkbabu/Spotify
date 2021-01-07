package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new e0();
    private final int a;
    private final int b;
    private final int c;

    public b(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public int I1() {
        return this.c;
    }

    public int Q1() {
        return this.b;
    }

    public int getType() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 2, this.a);
        SafeParcelReader.M(parcel, 3, this.b);
        SafeParcelReader.M(parcel, 4, this.c);
        SafeParcelReader.m(parcel, a2);
    }
}
