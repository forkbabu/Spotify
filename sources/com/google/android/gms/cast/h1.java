package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class h1 implements Parcelable.Creator<o> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final o createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        ArrayList arrayList = null;
        c cVar = null;
        r rVar = null;
        i iVar = null;
        l lVar = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    mediaInfo = (MediaInfo) SafeParcelReader.f(parcel, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 4:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 5:
                    d = SafeParcelReader.q(parcel, readInt);
                    break;
                case 6:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 7:
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 8:
                    j2 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 9:
                    j3 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 10:
                    d2 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 11:
                    z = SafeParcelReader.n(parcel, readInt);
                    break;
                case 12:
                    jArr = SafeParcelReader.e(parcel, readInt);
                    break;
                case 13:
                    i4 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 14:
                    i5 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 15:
                    str = SafeParcelReader.g(parcel, readInt);
                    break;
                case 16:
                    i6 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 17:
                    arrayList = SafeParcelReader.k(parcel, readInt, m.CREATOR);
                    break;
                case 18:
                    z2 = SafeParcelReader.n(parcel, readInt);
                    break;
                case 19:
                    cVar = (c) SafeParcelReader.f(parcel, readInt, c.CREATOR);
                    break;
                case 20:
                    rVar = (r) SafeParcelReader.f(parcel, readInt, r.CREATOR);
                    break;
                case 21:
                    iVar = (i) SafeParcelReader.f(parcel, readInt, i.CREATOR);
                    break;
                case 22:
                    lVar = (l) SafeParcelReader.f(parcel, readInt, l.CREATOR);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        return new o(mediaInfo, j, i, d, i2, i3, j2, j3, d2, z, jArr, i4, i5, str, i6, arrayList, z2, cVar, rVar, iVar, lVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o[] newArray(int i) {
        return new o[i];
    }
}
