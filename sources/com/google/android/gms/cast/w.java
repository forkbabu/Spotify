package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class w implements Parcelable.Creator<t> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final t createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                f = SafeParcelReader.s(parcel, readInt);
            } else if (i == 3) {
                f2 = SafeParcelReader.s(parcel, readInt);
            } else if (i != 4) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                f3 = SafeParcelReader.s(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new t(f, f2, f3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t[] newArray(int i) {
        return new t[i];
    }
}
