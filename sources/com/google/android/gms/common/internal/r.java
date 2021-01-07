package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;
import java.util.List;

public final class r extends a {
    public static final Parcelable.Creator<r> CREATOR = new u();
    private final int a;
    private List<f0> b;

    public r(int i, List<f0> list) {
        this.a = i;
        this.b = list;
    }

    public final int I1() {
        return this.a;
    }

    public final void Q1(f0 f0Var) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(f0Var);
    }

    public final List<f0> o2() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 1, this.a);
        SafeParcelReader.X(parcel, 2, this.b, false);
        SafeParcelReader.m(parcel, a2);
    }
}
