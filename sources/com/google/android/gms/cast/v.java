package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;

public final class v extends a {
    public static final Parcelable.Creator<v> CREATOR = new y();
    private final t a;
    private final t b;

    public v(t tVar, t tVar2) {
        this.a = tVar;
        this.b = tVar2;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return com.google.android.gms.cast.internal.a.d(this.a, vVar.a) && com.google.android.gms.cast.internal.a.d(this.b, vVar.b);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.S(parcel, 2, this.a, i, false);
        SafeParcelReader.S(parcel, 3, this.b, i, false);
        SafeParcelReader.m(parcel, a2);
    }
}
