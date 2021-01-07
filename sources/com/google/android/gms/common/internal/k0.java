package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public final class k0 extends a {
    public static final Parcelable.Creator<k0> CREATOR = new m0();
    private final int a;
    private final Account b;
    private final int c;
    private final GoogleSignInAccount f;

    k0(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.f = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 1, this.a);
        SafeParcelReader.S(parcel, 2, this.b, i, false);
        SafeParcelReader.M(parcel, 3, this.c);
        SafeParcelReader.S(parcel, 4, this.f, i, false);
        SafeParcelReader.m(parcel, a2);
    }

    public k0(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this.a = 2;
        this.b = account;
        this.c = i;
        this.f = googleSignInAccount;
    }
}
