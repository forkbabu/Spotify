package com.google.android.gms.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class j implements Parcelable.Creator<e> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final e createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = "";
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                str = SafeParcelReader.g(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new e(str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e[] newArray(int i) {
        return new e[i];
    }
}
