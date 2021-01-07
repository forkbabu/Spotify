package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class k implements Parcelable.Creator<c> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final c createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = SafeParcelReader.g(parcel, readInt);
            } else if (i2 == 2) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (i2 != 3) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                j = SafeParcelReader.x(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new c(str, i, j);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int i) {
        return new c[i];
    }
}
