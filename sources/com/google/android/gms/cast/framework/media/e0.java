package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class e0 implements Parcelable.Creator<b> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final b createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 2) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (i4 == 3) {
                i2 = SafeParcelReader.v(parcel, readInt);
            } else if (i4 != 4) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                i3 = SafeParcelReader.v(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new b(i, i2, i3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i) {
        return new b[i];
    }
}
