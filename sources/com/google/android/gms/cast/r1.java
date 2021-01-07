package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class r1 implements Parcelable.Creator<CastDevice> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final CastDevice createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        byte[] bArr = null;
        String str9 = null;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
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
                    str3 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 5:
                    str4 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 6:
                    str5 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 7:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 8:
                    arrayList = SafeParcelReader.k(parcel, readInt, hr.CREATOR);
                    break;
                case 9:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 10:
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 11:
                    str6 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 12:
                    str7 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 13:
                    i4 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 14:
                    str8 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 15:
                    bArr = SafeParcelReader.c(parcel, readInt);
                    break;
                case 16:
                    str9 = SafeParcelReader.g(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        return new CastDevice(str, str2, str3, str4, str5, i, arrayList, i2, i3, str6, str7, i4, str8, bArr, str9);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CastDevice[] newArray(int i) {
        return new CastDevice[i];
    }
}
