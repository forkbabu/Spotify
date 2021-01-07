package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class s extends a {
    public static final Parcelable.Creator<s> CREATOR = new v();
    private final String a;
    private final boolean b;
    private final boolean c;
    private final Context f;
    private final boolean n;

    s(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.f = (Context) b.E3(a.AbstractBinderC0099a.D3(iBinder));
        this.n = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 1, this.a, false);
        SafeParcelReader.C(parcel, 2, this.b);
        SafeParcelReader.C(parcel, 3, this.c);
        SafeParcelReader.L(parcel, 4, (rt) b.F3(this.f), false);
        SafeParcelReader.C(parcel, 5, this.n);
        SafeParcelReader.m(parcel, a2);
    }
}
