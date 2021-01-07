package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class j1 implements Parcelable.Creator<c> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final c createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                j = SafeParcelReader.x(parcel, readInt);
            } else if (i == 3) {
                j2 = SafeParcelReader.x(parcel, readInt);
            } else if (i == 4) {
                str = SafeParcelReader.g(parcel, readInt);
            } else if (i == 5) {
                str2 = SafeParcelReader.g(parcel, readInt);
            } else if (i != 6) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                j3 = SafeParcelReader.x(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new c(j, j2, str, str2, j3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int i) {
        return new c[i];
    }
}
