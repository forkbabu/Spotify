package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;

public final class Scope extends a implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<Scope> CREATOR = new l();
    private final int a;
    private final String b;

    Scope(int i, String str) {
        g.h(str, "scopeUri must not be null or empty");
        this.a = i;
        this.b = str;
    }

    @RecentlyNonNull
    public final String I1() {
        return this.b;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.b.equals(((Scope) obj).b);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Object
    @RecentlyNonNull
    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 1, this.a);
        SafeParcelReader.T(parcel, 2, this.b, false);
        SafeParcelReader.m(parcel, a2);
    }

    public Scope(@RecentlyNonNull String str) {
        g.h(str, "scopeUri must not be null or empty");
        this.a = 1;
        this.b = str;
    }
}
