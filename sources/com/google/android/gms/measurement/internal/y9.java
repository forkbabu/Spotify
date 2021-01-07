package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public final class y9 extends a {
    public static final Parcelable.Creator<y9> CREATOR = new x9();
    private final int a;
    public final String b;
    public final long c;
    public final Long f;
    public final String n;
    public final String o;
    public final Double p;

    y9(aa aaVar) {
        this(aaVar.c, aaVar.d, aaVar.e, aaVar.b);
    }

    public final Object I1() {
        Long l = this.f;
        if (l != null) {
            return l;
        }
        Double d = this.p;
        if (d != null) {
            return d;
        }
        String str = this.n;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 1, this.a);
        SafeParcelReader.T(parcel, 2, this.b, false);
        SafeParcelReader.P(parcel, 3, this.c);
        SafeParcelReader.R(parcel, 4, this.f, false);
        SafeParcelReader.K(parcel, 5, null, false);
        SafeParcelReader.T(parcel, 6, this.n, false);
        SafeParcelReader.T(parcel, 7, this.o, false);
        SafeParcelReader.I(parcel, 8, this.p, false);
        SafeParcelReader.m(parcel, a2);
    }

    y9(String str, long j, Object obj, String str2) {
        g.i(str);
        this.a = 2;
        this.b = str;
        this.c = j;
        this.o = str2;
        if (obj == null) {
            this.f = null;
            this.p = null;
            this.n = null;
        } else if (obj instanceof Long) {
            this.f = (Long) obj;
            this.p = null;
            this.n = null;
        } else if (obj instanceof String) {
            this.f = null;
            this.p = null;
            this.n = (String) obj;
        } else if (obj instanceof Double) {
            this.f = null;
            this.p = (Double) obj;
            this.n = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    y9(int i, String str, long j, Long l, Float f2, String str2, String str3, Double d) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.f = l;
        if (i == 1) {
            this.p = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
        } else {
            this.p = d;
        }
        this.n = str2;
        this.o = str3;
    }
}
