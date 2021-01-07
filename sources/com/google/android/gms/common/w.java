package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class w implements Parcelable.Creator<u> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final u createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        boolean z = false;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                z = SafeParcelReader.n(parcel, readInt);
            } else if (i2 == 2) {
                str = SafeParcelReader.g(parcel, readInt);
            } else if (i2 != 3) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                i = SafeParcelReader.v(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new u(z, str, i);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u[] newArray(int i) {
        return new u[i];
    }
}
