package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class z0 implements Parcelable.Creator<i> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final i createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                j = SafeParcelReader.x(parcel, readInt);
            } else if (i == 3) {
                j2 = SafeParcelReader.x(parcel, readInt);
            } else if (i == 4) {
                z = SafeParcelReader.n(parcel, readInt);
            } else if (i != 5) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                z2 = SafeParcelReader.n(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new i(j, j2, z, z2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i[] newArray(int i) {
        return new i[i];
    }
}
