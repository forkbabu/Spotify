package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class o0 implements Parcelable.Creator<l0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final l0 createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (i2 == 2) {
                iBinder = SafeParcelReader.u(parcel, readInt);
            } else if (i2 == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.f(parcel, readInt, ConnectionResult.CREATOR);
            } else if (i2 == 4) {
                z = SafeParcelReader.n(parcel, readInt);
            } else if (i2 != 5) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                z2 = SafeParcelReader.n(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new l0(i, iBinder, connectionResult, z, z2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l0[] newArray(int i) {
        return new l0[i];
    }
}
