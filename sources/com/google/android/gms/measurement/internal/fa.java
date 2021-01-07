package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;

public final class fa extends a {
    public static final Parcelable.Creator<fa> CREATOR = new ea();
    public final String A;
    public final Boolean B;
    public final long C;
    public final List<String> D;
    public final String E;
    public final String F;
    public final String a;
    public final String b;
    public final String c;
    public final String f;
    public final long n;
    public final long o;
    public final String p;
    public final boolean q;
    public final boolean r;
    public final long s;
    public final String t;
    public final long u;
    public final long v;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    fa(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z2, boolean z3, String str6, long j4, long j5, int i, boolean z4, boolean z5, boolean z6, String str7, Boolean bool, long j6, List<String> list, String str8, String str9) {
        g.i(str);
        this.a = str;
        this.b = TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.s = j;
        this.f = str4;
        this.n = j2;
        this.o = j3;
        this.p = str5;
        this.q = z2;
        this.r = z3;
        this.t = str6;
        this.u = j4;
        this.v = j5;
        this.w = i;
        this.x = z4;
        this.y = z5;
        this.z = z6;
        this.A = str7;
        this.B = bool;
        this.C = j6;
        this.D = list;
        this.E = str8;
        this.F = str9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 2, this.a, false);
        SafeParcelReader.T(parcel, 3, this.b, false);
        SafeParcelReader.T(parcel, 4, this.c, false);
        SafeParcelReader.T(parcel, 5, this.f, false);
        SafeParcelReader.P(parcel, 6, this.n);
        SafeParcelReader.P(parcel, 7, this.o);
        SafeParcelReader.T(parcel, 8, this.p, false);
        SafeParcelReader.C(parcel, 9, this.q);
        SafeParcelReader.C(parcel, 10, this.r);
        SafeParcelReader.P(parcel, 11, this.s);
        SafeParcelReader.T(parcel, 12, this.t, false);
        SafeParcelReader.P(parcel, 13, this.u);
        SafeParcelReader.P(parcel, 14, this.v);
        SafeParcelReader.M(parcel, 15, this.w);
        SafeParcelReader.C(parcel, 16, this.x);
        SafeParcelReader.C(parcel, 17, this.y);
        SafeParcelReader.C(parcel, 18, this.z);
        SafeParcelReader.T(parcel, 19, this.A, false);
        SafeParcelReader.D(parcel, 21, this.B, false);
        SafeParcelReader.P(parcel, 22, this.C);
        SafeParcelReader.V(parcel, 23, this.D, false);
        SafeParcelReader.T(parcel, 24, this.E, false);
        SafeParcelReader.T(parcel, 25, this.F, false);
        SafeParcelReader.m(parcel, a2);
    }

    fa(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z2, boolean z3, long j3, String str6, long j4, long j5, int i, boolean z4, boolean z5, boolean z6, String str7, Boolean bool, long j6, List<String> list, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.s = j3;
        this.f = str4;
        this.n = j;
        this.o = j2;
        this.p = str5;
        this.q = z2;
        this.r = z3;
        this.t = str6;
        this.u = j4;
        this.v = j5;
        this.w = i;
        this.x = z4;
        this.y = z5;
        this.z = z6;
        this.A = str7;
        this.B = bool;
        this.C = j6;
        this.D = list;
        this.E = str8;
        this.F = str9;
    }
}
