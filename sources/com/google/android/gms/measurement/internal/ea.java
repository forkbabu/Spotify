package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class ea implements Parcelable.Creator<fa> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final fa createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        long j6 = -2147483648L;
        String str9 = "";
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
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
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 7:
                    j2 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 8:
                    str5 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 9:
                    z = SafeParcelReader.n(parcel, readInt);
                    break;
                case 10:
                    z2 = SafeParcelReader.n(parcel, readInt);
                    break;
                case 11:
                    j6 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 12:
                    str6 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 13:
                    j3 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 14:
                    j4 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 15:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 16:
                    z3 = SafeParcelReader.n(parcel, readInt);
                    break;
                case 17:
                    z4 = SafeParcelReader.n(parcel, readInt);
                    break;
                case 18:
                    z5 = SafeParcelReader.n(parcel, readInt);
                    break;
                case 19:
                    str7 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 20:
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
                case 21:
                    bool = SafeParcelReader.o(parcel, readInt);
                    break;
                case 22:
                    j5 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 23:
                    arrayList = SafeParcelReader.i(parcel, readInt);
                    break;
                case 24:
                    str8 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 25:
                    str9 = SafeParcelReader.g(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        return new fa(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, z5, str7, bool, j5, arrayList, str8, str9);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ fa[] newArray(int i) {
        return new fa[i];
    }
}
