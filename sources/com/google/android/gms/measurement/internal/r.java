package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public final class r extends a {
    public static final Parcelable.Creator<r> CREATOR = new q();
    public final String a;
    public final m b;
    public final String c;
    public final long f;

    public r(String str, m mVar, String str2, long j) {
        this.a = str;
        this.b = mVar;
        this.c = str2;
        this.f = j;
    }

    @Override // java.lang.Object
    public final String toString() {
        String str = this.c;
        String str2 = this.a;
        String valueOf = String.valueOf(this.b);
        return je.I0(je.U0(valueOf.length() + je.N0(str2, je.N0(str, 21)), "origin=", str, ",name=", str2), ",params=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 2, this.a, false);
        SafeParcelReader.S(parcel, 3, this.b, i, false);
        SafeParcelReader.T(parcel, 4, this.c, false);
        SafeParcelReader.P(parcel, 5, this.f);
        SafeParcelReader.m(parcel, a2);
    }

    r(r rVar, long j) {
        if (rVar != null) {
            this.a = rVar.a;
            this.b = rVar.b;
            this.c = rVar.c;
            this.f = j;
            return;
        }
        throw new NullPointerException("null reference");
    }
}
