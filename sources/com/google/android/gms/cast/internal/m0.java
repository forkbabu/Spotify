package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.d;
import com.google.android.gms.cast.v;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;

public final class m0 extends a {
    public static final Parcelable.Creator<m0> CREATOR = new l0();
    private double a;
    private boolean b;
    private int c;
    private d f;
    private int n;
    private v o;
    private double p;

    public m0() {
        this.a = Double.NaN;
        this.b = false;
        this.c = -1;
        this.f = null;
        this.n = -1;
        this.o = null;
        this.p = Double.NaN;
    }

    public final int I1() {
        return this.c;
    }

    public final int Q1() {
        return this.n;
    }

    public final d U0() {
        return this.f;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (this.a == m0Var.a && this.b == m0Var.b && this.c == m0Var.c && a.d(this.f, m0Var.f) && this.n == m0Var.n) {
            v vVar = this.o;
            if (a.d(vVar, vVar) && this.p == m0Var.p) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.f, Integer.valueOf(this.n), this.o, Double.valueOf(this.p)});
    }

    public final double o2() {
        return this.a;
    }

    public final boolean p2() {
        return this.b;
    }

    public final v q2() {
        return this.o;
    }

    public final double r2() {
        return this.p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.H(parcel, 2, this.a);
        SafeParcelReader.C(parcel, 3, this.b);
        SafeParcelReader.M(parcel, 4, this.c);
        SafeParcelReader.S(parcel, 5, this.f, i, false);
        SafeParcelReader.M(parcel, 6, this.n);
        SafeParcelReader.S(parcel, 7, this.o, i, false);
        SafeParcelReader.H(parcel, 8, this.p);
        SafeParcelReader.m(parcel, a2);
    }

    m0(double d, boolean z, int i, d dVar, int i2, v vVar, double d2) {
        this.a = d;
        this.b = z;
        this.c = i;
        this.f = dVar;
        this.n = i2;
        this.o = vVar;
        this.p = d2;
    }
}
