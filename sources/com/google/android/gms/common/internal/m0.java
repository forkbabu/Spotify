package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class m0 implements Parcelable.Creator<k0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final k0 createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = SafeParcelReader.v(parcel, readInt);
            } else if (i3 == 2) {
                account = (Account) SafeParcelReader.f(parcel, readInt, Account.CREATOR);
            } else if (i3 == 3) {
                i2 = SafeParcelReader.v(parcel, readInt);
            } else if (i3 != 4) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.f(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new k0(i, account, i2, googleSignInAccount);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k0[] newArray(int i) {
        return new k0[i];
    }
}
