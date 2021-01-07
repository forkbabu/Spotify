package com.google.android.gms.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new j();
    private final String a;

    public e(String str) {
        this.a = str;
    }

    public String I1() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 1, this.a, false);
        SafeParcelReader.m(parcel, a2);
    }
}
