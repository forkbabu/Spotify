package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class w0 implements Parcelable.Creator<h> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final h createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        g gVar = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                z = SafeParcelReader.n(parcel, readInt);
            } else if (i == 3) {
                str = SafeParcelReader.g(parcel, readInt);
            } else if (i == 4) {
                z2 = SafeParcelReader.n(parcel, readInt);
            } else if (i != 5) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                gVar = (g) SafeParcelReader.f(parcel, readInt, g.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new h(z, str, z2, gVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h[] newArray(int i) {
        return new h[i];
    }
}
