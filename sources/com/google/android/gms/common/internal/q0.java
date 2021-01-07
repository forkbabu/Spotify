package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class q0 implements Parcelable.Creator<n0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final n0 createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        Scope[] scopeArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (i4 == 2) {
                i2 = SafeParcelReader.v(parcel, readInt);
            } else if (i4 == 3) {
                i3 = SafeParcelReader.v(parcel, readInt);
            } else if (i4 != 4) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                scopeArr = (Scope[]) SafeParcelReader.j(parcel, readInt, Scope.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new n0(i, i2, i3, scopeArr);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n0[] newArray(int i) {
        return new n0[i];
    }
}
