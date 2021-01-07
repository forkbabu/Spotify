package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;

public final class t0 extends a {
    public static final Parcelable.Creator<t0> CREATOR = new v0();
    private int a;

    public t0() {
        this.a = 0;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof t0) && this.a == ((t0) obj).a;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // java.lang.Object
    public final String toString() {
        int i = this.a;
        return String.format("joinOptions(connectionType=%s)", i != 0 ? i != 2 ? "UNKNOWN" : "INVISIBLE" : "STRONG");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 2, this.a);
        SafeParcelReader.m(parcel, a2);
    }

    t0(int i) {
        this.a = i;
    }
}
