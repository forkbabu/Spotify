package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class u0 implements Parcelable.Creator<d> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final d createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        p pVar = null;
        int[] iArr = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                pVar = (p) SafeParcelReader.f(parcel, readInt, p.CREATOR);
            } else if (i2 == 2) {
                z = SafeParcelReader.n(parcel, readInt);
            } else if (i2 == 3) {
                z2 = SafeParcelReader.n(parcel, readInt);
            } else if (i2 == 4) {
                iArr = SafeParcelReader.d(parcel, readInt);
            } else if (i2 != 5) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                i = SafeParcelReader.v(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new d(pVar, z, z2, iArr, i);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i) {
        return new d[i];
    }
}
