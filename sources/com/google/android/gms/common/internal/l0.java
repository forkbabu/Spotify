package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public final class l0 extends a {
    public static final Parcelable.Creator<l0> CREATOR = new o0();
    private final int a;
    private IBinder b;
    private ConnectionResult c;
    private boolean f;
    private boolean n;

    l0(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = connectionResult;
        this.f = z;
        this.n = z2;
    }

    public final i I1() {
        IBinder iBinder = this.b;
        if (iBinder == null) {
            return null;
        }
        return i.a.D3(iBinder);
    }

    public final ConnectionResult Q1() {
        return this.c;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.c.equals(l0Var.c) && m.a(I1(), l0Var.I1());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 1, this.a);
        SafeParcelReader.L(parcel, 2, this.b, false);
        SafeParcelReader.S(parcel, 3, this.c, i, false);
        SafeParcelReader.C(parcel, 4, this.f);
        SafeParcelReader.C(parcel, 5, this.n);
        SafeParcelReader.m(parcel, a2);
    }
}
