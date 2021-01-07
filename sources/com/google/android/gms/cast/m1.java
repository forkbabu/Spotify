package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class m1 implements Parcelable.Creator<q> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final q createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = SafeParcelReader.g(parcel, readInt);
            } else if (i != 3) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                str2 = SafeParcelReader.g(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new q(str, str2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q[] newArray(int i) {
        return new q[i];
    }
}
