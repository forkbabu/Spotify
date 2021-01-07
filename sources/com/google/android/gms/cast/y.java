package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class y implements Parcelable.Creator<v> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final v createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        t tVar = null;
        t tVar2 = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                tVar = (t) SafeParcelReader.f(parcel, readInt, t.CREATOR);
            } else if (i != 3) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                tVar2 = (t) SafeParcelReader.f(parcel, readInt, t.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new v(tVar, tVar2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ v[] newArray(int i) {
        return new v[i];
    }
}
