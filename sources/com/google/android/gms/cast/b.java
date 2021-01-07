package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;

public class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new n0();
    private final long a;
    private final String b;
    private final long c;
    private final boolean f;
    private String[] n;
    private final boolean o;

    public b(long j, String str, long j2, boolean z, String[] strArr, boolean z2) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.f = z;
        this.n = strArr;
        this.o = z2;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return com.google.android.gms.cast.internal.a.d(this.b, bVar.b) && this.a == bVar.a && this.c == bVar.c && this.f == bVar.f && Arrays.equals(this.n, bVar.n) && this.o == bVar.o;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.P(parcel, 2, this.a);
        SafeParcelReader.T(parcel, 3, this.b, false);
        SafeParcelReader.P(parcel, 4, this.c);
        SafeParcelReader.C(parcel, 5, this.f);
        SafeParcelReader.U(parcel, 6, this.n, false);
        SafeParcelReader.C(parcel, 7, this.o);
        SafeParcelReader.m(parcel, a2);
    }
}
