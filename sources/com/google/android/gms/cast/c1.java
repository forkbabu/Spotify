package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class c1 implements Parcelable.Creator<k> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final k createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        double d = 0.0d;
        int i = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (i2 == 3) {
                str = SafeParcelReader.g(parcel, readInt);
            } else if (i2 == 4) {
                arrayList = SafeParcelReader.k(parcel, readInt, j.CREATOR);
            } else if (i2 == 5) {
                arrayList2 = SafeParcelReader.k(parcel, readInt, hr.CREATOR);
            } else if (i2 != 6) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                d = SafeParcelReader.q(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new k(i, str, arrayList, arrayList2, d);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k[] newArray(int i) {
        return new k[i];
    }
}
