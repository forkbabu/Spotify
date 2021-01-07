package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class l implements Parcelable.Creator<HintRequest> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final HintRequest createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 != 1000) {
                switch (i2) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.f(parcel, readInt, CredentialPickerConfig.CREATOR);
                        continue;
                    case 2:
                        z = SafeParcelReader.n(parcel, readInt);
                        continue;
                    case 3:
                        z2 = SafeParcelReader.n(parcel, readInt);
                        continue;
                    case 4:
                        strArr = SafeParcelReader.h(parcel, readInt);
                        continue;
                    case 5:
                        z3 = SafeParcelReader.n(parcel, readInt);
                        continue;
                    case 6:
                        str = SafeParcelReader.g(parcel, readInt);
                        continue;
                    case 7:
                        str2 = SafeParcelReader.g(parcel, readInt);
                        continue;
                    default:
                        SafeParcelReader.A(parcel, readInt);
                        continue;
                }
            } else {
                i = SafeParcelReader.v(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str, str2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ HintRequest[] newArray(int i) {
        return new HintRequest[i];
    }
}
