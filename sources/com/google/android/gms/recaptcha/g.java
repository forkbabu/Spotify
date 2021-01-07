package com.google.android.gms.recaptcha;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class g implements Parcelable.Creator<a> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final a createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        b bVar = new b("other");
        Bundle bundle = new Bundle();
        String str = "";
        String str2 = str;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                bVar = (b) SafeParcelReader.f(parcel, readInt, b.CREATOR);
            } else if (i == 2) {
                str = SafeParcelReader.g(parcel, readInt);
            } else if (i == 3) {
                bundle = SafeParcelReader.b(parcel, readInt);
            } else if (i != 4) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                str2 = SafeParcelReader.g(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new a(bVar, str, bundle, str2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i) {
        return new a[i];
    }
}
