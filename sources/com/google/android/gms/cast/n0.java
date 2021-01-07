package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class n0 implements Parcelable.Creator<b> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final b createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String[] strArr = null;
        long j = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 3:
                    str = SafeParcelReader.g(parcel, readInt);
                    break;
                case 4:
                    j2 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 5:
                    z = SafeParcelReader.n(parcel, readInt);
                    break;
                case 6:
                    strArr = SafeParcelReader.h(parcel, readInt);
                    break;
                case 7:
                    z2 = SafeParcelReader.n(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        return new b(j, str, j2, z, strArr, z2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i) {
        return new b[i];
    }
}
