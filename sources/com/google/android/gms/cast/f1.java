package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class f1 implements Parcelable.Creator<m> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final m createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    mediaInfo = (MediaInfo) SafeParcelReader.f(parcel, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 4:
                    z = SafeParcelReader.n(parcel, readInt);
                    break;
                case 5:
                    d = SafeParcelReader.q(parcel, readInt);
                    break;
                case 6:
                    d2 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 7:
                    d3 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 8:
                    jArr = SafeParcelReader.e(parcel, readInt);
                    break;
                case 9:
                    str = SafeParcelReader.g(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        return new m(mediaInfo, i, z, d, d2, d3, jArr, str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m[] newArray(int i) {
        return new m[i];
    }
}
