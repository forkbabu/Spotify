package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public class a extends com.google.android.gms.common.internal.safeparcel.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<a> CREATOR = new d();
    private final int a;
    private int b;
    private Bundle c;

    a(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    public int getType() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 1, this.a);
        SafeParcelReader.M(parcel, 2, this.b);
        SafeParcelReader.E(parcel, 3, this.c, false);
        SafeParcelReader.m(parcel, a2);
    }
}
