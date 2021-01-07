package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class m implements Parcelable.Creator<Status> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final Status createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = SafeParcelReader.v(parcel, readInt);
            } else if (i3 == 2) {
                str = SafeParcelReader.g(parcel, readInt);
            } else if (i3 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.f(parcel, readInt, PendingIntent.CREATOR);
            } else if (i3 == 4) {
                connectionResult = (ConnectionResult) SafeParcelReader.f(parcel, readInt, ConnectionResult.CREATOR);
            } else if (i3 != 1000) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                i = SafeParcelReader.v(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new Status(i, i2, str, pendingIntent, connectionResult);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}
