package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class i implements Parcelable.Creator<CredentialPickerConfig> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final CredentialPickerConfig createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                z = SafeParcelReader.n(parcel, readInt);
            } else if (i3 == 2) {
                z2 = SafeParcelReader.n(parcel, readInt);
            } else if (i3 == 3) {
                z3 = SafeParcelReader.n(parcel, readInt);
            } else if (i3 == 4) {
                i2 = SafeParcelReader.v(parcel, readInt);
            } else if (i3 != 1000) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                i = SafeParcelReader.v(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new CredentialPickerConfig(i, z, z2, z3, i2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialPickerConfig[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
