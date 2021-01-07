package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Iterator;

public final class m extends a implements Iterable<String> {
    public static final Parcelable.Creator<m> CREATOR = new o();
    private final Bundle a;

    m(Bundle bundle) {
        this.a = bundle;
    }

    public final int I1() {
        return this.a.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new p(this);
    }

    /* access modifiers changed from: package-private */
    public final Object o2(String str) {
        return this.a.get(str);
    }

    public final Bundle p2() {
        return new Bundle(this.a);
    }

    /* access modifiers changed from: package-private */
    public final Long q2(String str) {
        return Long.valueOf(this.a.getLong(str));
    }

    /* access modifiers changed from: package-private */
    public final Double r2(String str) {
        return Double.valueOf(this.a.getDouble(str));
    }

    /* access modifiers changed from: package-private */
    public final String s2(String str) {
        return this.a.getString(str);
    }

    @Override // java.lang.Object
    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.E(parcel, 2, p2(), false);
        SafeParcelReader.m(parcel, a2);
    }
}
