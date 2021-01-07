package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class x9 implements Parcelable.Creator<y9> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final y9 createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 2:
                    str = SafeParcelReader.g(parcel, readInt);
                    break;
                case 3:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 4:
                    l = SafeParcelReader.y(parcel, readInt);
                    break;
                case 5:
                    f = SafeParcelReader.t(parcel, readInt);
                    break;
                case 6:
                    str2 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 8:
                    d = SafeParcelReader.r(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        return new y9(i, str, j, l, f, str2, str3, d);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y9[] newArray(int i) {
        return new y9[i];
    }
}
