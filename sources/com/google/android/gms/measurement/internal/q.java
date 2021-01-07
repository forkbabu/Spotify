package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class q implements Parcelable.Creator<r> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final r createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        m mVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = SafeParcelReader.g(parcel, readInt);
            } else if (i == 3) {
                mVar = (m) SafeParcelReader.f(parcel, readInt, m.CREATOR);
            } else if (i == 4) {
                str2 = SafeParcelReader.g(parcel, readInt);
            } else if (i != 5) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                j = SafeParcelReader.x(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new r(str, mVar, str2, j);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r[] newArray(int i) {
        return new r[i];
    }
}
