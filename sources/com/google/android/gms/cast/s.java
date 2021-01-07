package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class s implements Parcelable.Creator<a> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final a createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        q qVar = null;
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
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 7:
                    str5 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 8:
                    str6 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 9:
                    str7 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 10:
                    str8 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 11:
                    j2 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 12:
                    str9 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 13:
                    qVar = (q) SafeParcelReader.f(parcel, readInt, q.CREATOR);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        return new a(str, str2, j, str3, str4, str5, str6, str7, str8, j2, str9, qVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i) {
        return new a[i];
    }
}
