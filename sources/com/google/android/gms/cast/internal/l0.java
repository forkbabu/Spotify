package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.d;
import com.google.android.gms.cast.v;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class l0 implements Parcelable.Creator<m0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final m0 createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        d dVar = null;
        v vVar = null;
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    d = SafeParcelReader.q(parcel, readInt);
                    break;
                case 3:
                    z = SafeParcelReader.n(parcel, readInt);
                    break;
                case 4:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 5:
                    dVar = (d) SafeParcelReader.f(parcel, readInt, d.CREATOR);
                    break;
                case 6:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 7:
                    vVar = (v) SafeParcelReader.f(parcel, readInt, v.CREATOR);
                    break;
                case 8:
                    d2 = SafeParcelReader.q(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        return new m0(d, z, i, dVar, i2, vVar, d2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m0[] newArray(int i) {
        return new m0[i];
    }
}
