package com.google.android.gms.recaptcha;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class a extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<a> CREATOR = new g();
    private final b a;
    private final String b;
    private final Bundle c;
    private final String f;

    a(b bVar, String str, Bundle bundle, String str2) {
        this.a = bVar;
        this.b = str;
        this.c = bundle;
        this.f = str2;
    }

    @Override // java.lang.Object
    public final String toString() {
        if (!"other".equals(this.a.a) || this.b.isEmpty()) {
            return this.a.a;
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.S(parcel, 1, this.a, i, false);
        SafeParcelReader.T(parcel, 2, this.b, false);
        SafeParcelReader.E(parcel, 3, this.c, false);
        SafeParcelReader.T(parcel, 4, this.f, false);
        SafeParcelReader.m(parcel, a2);
    }

    public a(b bVar) {
        Bundle bundle = new Bundle();
        this.a = bVar;
        this.b = "";
        this.c = bundle;
        this.f = "";
    }

    public a(a aVar, String str) {
        this(aVar.a, aVar.b, aVar.c, str);
    }
}
