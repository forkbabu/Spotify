package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class e0 implements Parcelable.Creator<f0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final f0 createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (i4 == 2) {
                i2 = SafeParcelReader.v(parcel, readInt);
            } else if (i4 == 3) {
                i3 = SafeParcelReader.v(parcel, readInt);
            } else if (i4 == 4) {
                j = SafeParcelReader.x(parcel, readInt);
            } else if (i4 != 5) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                j2 = SafeParcelReader.x(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new f0(i, i2, i3, j, j2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f0[] newArray(int i) {
        return new f0[i];
    }
}
