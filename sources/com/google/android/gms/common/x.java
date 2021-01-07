package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class x implements Parcelable.Creator<y> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final y createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = SafeParcelReader.g(parcel, readInt);
            } else if (i == 2) {
                iBinder = SafeParcelReader.u(parcel, readInt);
            } else if (i == 3) {
                z = SafeParcelReader.n(parcel, readInt);
            } else if (i != 4) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                z2 = SafeParcelReader.n(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new y(str, iBinder, z, z2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y[] newArray(int i) {
        return new y[i];
    }
}
