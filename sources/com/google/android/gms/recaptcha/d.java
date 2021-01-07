package com.google.android.gms.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;

public class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new i();
    private final String a;
    private final String b;
    private final List<String> c;

    public d(String str, String str2, List<String> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public String I1() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 1, this.a, false);
        SafeParcelReader.T(parcel, 2, this.b, false);
        SafeParcelReader.V(parcel, 3, this.c, false);
        SafeParcelReader.m(parcel, a2);
    }
}
