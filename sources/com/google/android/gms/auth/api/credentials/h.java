package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class h implements Parcelable.Creator<Credential> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final Credential createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = SafeParcelReader.g(parcel, readInt);
                    break;
                case 2:
                    str2 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 3:
                    uri = (Uri) SafeParcelReader.f(parcel, readInt, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = SafeParcelReader.k(parcel, readInt, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 7:
                case 8:
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
                case 9:
                    str5 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 10:
                    str6 = SafeParcelReader.g(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        return new Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Credential[] newArray(int i) {
        return new Credential[i];
    }
}
