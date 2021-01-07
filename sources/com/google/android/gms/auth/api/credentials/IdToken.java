package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public final class IdToken extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new m();
    private final String a;
    private final String b;

    public IdToken(String str, String str2) {
        g.d(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        g.d(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return m.a(this.a, idToken.a) && m.a(this.b, idToken.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 1, this.a, false);
        SafeParcelReader.T(parcel, 2, this.b, false);
        SafeParcelReader.m(parcel, a2);
    }
}
