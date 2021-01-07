package com.spotify.libs.onboarding.allboarding.room;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

public final class e implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;
    private final int b;
    private final int c;
    private final boolean f;
    private final boolean n;
    private final boolean o;
    private final int p;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new e(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new e[i];
        }
    }

    public e(String str, int i, int i2, boolean z, boolean z2, boolean z3, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.f = z;
        this.n = z2;
        this.o = z3;
        this.p = i3;
    }

    public final boolean a() {
        return this.f;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return h.a(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && this.f == eVar.f && this.n == eVar.n && this.o == eVar.o && this.p == eVar.p;
    }

    public final int f() {
        return this.p;
    }

    public final boolean g() {
        return this.o;
    }

    public final boolean h() {
        return this.n;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.b) * 31) + this.c) * 31;
        boolean z = this.f;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        boolean z2 = this.n;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.o;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        return ((i9 + i) * 31) + this.p;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Expandable(moreUri=");
        V0.append(this.a);
        V0.append(", expansionLimit=");
        V0.append(this.b);
        V0.append(", expansionOffset=");
        V0.append(this.c);
        V0.append(", canExpandMultipleTimes=");
        V0.append(this.f);
        V0.append(", removeItemOnExpansion=");
        V0.append(this.n);
        V0.append(", prependsItemsOnExpansion=");
        V0.append(this.o);
        V0.append(", numberOfTimesExpanded=");
        return je.B0(V0, this.p, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.p);
    }
}
