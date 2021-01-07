package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.a;
import com.google.android.gms.cast.h;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class u implements Parcelable.Creator<b> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final b createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        ArrayList<String> arrayList = null;
        h hVar = null;
        a aVar = null;
        double d = 0.0d;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = SafeParcelReader.g(parcel, readInt);
                    break;
                case 3:
                    arrayList = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    z = SafeParcelReader.n(parcel, readInt);
                    break;
                case 5:
                    hVar = (h) SafeParcelReader.f(parcel, readInt, h.CREATOR);
                    break;
                case 6:
                    z2 = SafeParcelReader.n(parcel, readInt);
                    break;
                case 7:
                    aVar = (a) SafeParcelReader.f(parcel, readInt, a.CREATOR);
                    break;
                case 8:
                    z3 = SafeParcelReader.n(parcel, readInt);
                    break;
                case 9:
                    d = SafeParcelReader.q(parcel, readInt);
                    break;
                case 10:
                    z4 = SafeParcelReader.n(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        return new b(str, arrayList, z, hVar, z2, aVar, z3, d, z4);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i) {
        return new b[i];
    }
}
