package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class s0 implements Parcelable.Creator<t0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final t0 createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        Bundle bundle = null;
        c[] cVarArr = null;
        d dVar = null;
        int i = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                bundle = SafeParcelReader.b(parcel, readInt);
            } else if (i2 == 2) {
                cVarArr = (c[]) SafeParcelReader.j(parcel, readInt, c.CREATOR);
            } else if (i2 == 3) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (i2 != 4) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                dVar = (d) SafeParcelReader.f(parcel, readInt, d.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new t0(bundle, cVarArr, i, dVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t0[] newArray(int i) {
        return new t0[i];
    }
}
