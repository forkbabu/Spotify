package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new j();
    @Deprecated
    private String a;
    private GoogleSignInAccount b;
    @Deprecated
    private String c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        g.h(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        g.h(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    public final GoogleSignInAccount d0() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 4, this.a, false);
        SafeParcelReader.S(parcel, 7, this.b, i, false);
        SafeParcelReader.T(parcel, 8, this.c, false);
        SafeParcelReader.m(parcel, a2);
    }
}
