package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class e1 implements Parcelable.Creator<l> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final l createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        k kVar = null;
        ArrayList arrayList = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = SafeParcelReader.g(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 4:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 6:
                    kVar = (k) SafeParcelReader.f(parcel, readInt, k.CREATOR);
                    break;
                case 7:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 8:
                    arrayList = SafeParcelReader.k(parcel, readInt, m.CREATOR);
                    break;
                case 9:
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 10:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        return new l(str, str2, i, str3, kVar, i2, arrayList, i3, j);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int i) {
        return new l[i];
    }
}
