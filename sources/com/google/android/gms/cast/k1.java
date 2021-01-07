package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class k1 implements Parcelable.Creator<d> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final d createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        String str5 = null;
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
                    SafeParcelReader.k(parcel, readInt, hr.CREATOR);
                    break;
                case 5:
                    arrayList = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    str3 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 7:
                    uri = (Uri) SafeParcelReader.f(parcel, readInt, Uri.CREATOR);
                    break;
                case 8:
                    str4 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 9:
                    str5 = SafeParcelReader.g(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        return new d(str, str2, arrayList, str3, uri, str4, str5);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i) {
        return new d[i];
    }
}
