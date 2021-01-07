package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class v implements Parcelable.Creator<s> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final s createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = SafeParcelReader.g(parcel, readInt);
            } else if (i == 2) {
                z = SafeParcelReader.n(parcel, readInt);
            } else if (i == 3) {
                z2 = SafeParcelReader.n(parcel, readInt);
            } else if (i == 4) {
                iBinder = SafeParcelReader.u(parcel, readInt);
            } else if (i != 5) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                z3 = SafeParcelReader.n(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new s(str, z, z2, iBinder, z3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s[] newArray(int i) {
        return new s[i];
    }
}
