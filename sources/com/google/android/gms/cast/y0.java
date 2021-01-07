package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class y0 implements Parcelable.Creator<MediaInfo> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final MediaInfo createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        j jVar = null;
        ArrayList arrayList = null;
        p pVar = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str4 = null;
        q qVar = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = SafeParcelReader.g(parcel, readInt);
                    break;
                case 3:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 5:
                    jVar = (j) SafeParcelReader.f(parcel, readInt, j.CREATOR);
                    break;
                case 6:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 7:
                    arrayList = SafeParcelReader.k(parcel, readInt, MediaTrack.CREATOR);
                    break;
                case 8:
                    pVar = (p) SafeParcelReader.f(parcel, readInt, p.CREATOR);
                    break;
                case 9:
                    str3 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 10:
                    arrayList2 = SafeParcelReader.k(parcel, readInt, b.CREATOR);
                    break;
                case 11:
                    arrayList3 = SafeParcelReader.k(parcel, readInt, a.CREATOR);
                    break;
                case 12:
                    str4 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 13:
                    qVar = (q) SafeParcelReader.f(parcel, readInt, q.CREATOR);
                    break;
                case 14:
                    j2 = SafeParcelReader.x(parcel, readInt);
                    break;
                case 15:
                    str5 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 16:
                    str6 = SafeParcelReader.g(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        return new MediaInfo(str, i, str2, jVar, j, arrayList, pVar, str3, arrayList2, arrayList3, str4, qVar, j2, str5, str6);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaInfo[] newArray(int i) {
        return new MediaInfo[i];
    }
}
