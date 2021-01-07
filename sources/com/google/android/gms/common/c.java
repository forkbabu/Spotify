package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;

public class c extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<c> CREATOR = new k();
    private final String a;
    @Deprecated
    private final int b;
    private final long c;

    public c(@RecentlyNonNull String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }

    public long I1() {
        long j = this.c;
        return j == -1 ? (long) this.b : j;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = this.a;
            if (((str != null && str.equals(cVar.a)) || (this.a == null && cVar.a == null)) && I1() == cVar.I1()) {
                return true;
            }
        }
        return false;
    }

    @RecentlyNonNull
    public String getName() {
        return this.a;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(I1())});
    }

    @Override // java.lang.Object
    @RecentlyNonNull
    public String toString() {
        m.a b2 = m.b(this);
        b2.a("name", this.a);
        b2.a("version", Long.valueOf(I1()));
        return b2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 1, this.a, false);
        SafeParcelReader.M(parcel, 2, this.b);
        SafeParcelReader.P(parcel, 3, I1());
        SafeParcelReader.m(parcel, a2);
    }

    public c(@RecentlyNonNull String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }
}
