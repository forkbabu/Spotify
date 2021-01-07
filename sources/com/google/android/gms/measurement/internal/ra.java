package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class ra implements Parcelable.Creator<oa> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final oa createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        y9 y9Var = null;
        String str3 = null;
        r rVar = null;
        r rVar2 = null;
        r rVar3 = null;
        boolean z = false;
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
                    y9Var = (y9) SafeParcelReader.f(parcel, readInt, y9.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 6:
                    z = SafeParcelReader.n(parcel, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 8:
                    rVar = (r) SafeParcelReader.f(parcel, readInt, r.CREATOR);
                    break;
                case 9:
                    j2 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 10:
                    rVar2 = (r) SafeParcelReader.f(parcel, readInt, r.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 12:
                    rVar3 = (r) SafeParcelReader.f(parcel, readInt, r.CREATOR);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        return new oa(str, str2, y9Var, j, z, str3, rVar, j2, rVar2, j3, rVar3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ oa[] newArray(int i) {
        return new oa[i];
    }
}
