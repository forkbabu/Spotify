package com.spotify.libs.onboarding.allboarding.room;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

public final class z implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final boolean a;
    private final boolean b;
    private final long c;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new z(z2, z, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new z[i];
        }
    }

    public z(boolean z, boolean z2, long j) {
        this.a = z;
        this.b = z2;
        this.c = j;
    }

    public static z a(z zVar, boolean z, boolean z2, long j, int i) {
        if ((i & 1) != 0) {
            z = zVar.a;
        }
        if ((i & 2) != 0) {
            z2 = zVar.b;
        }
        if ((i & 4) != 0) {
            j = zVar.c;
        }
        zVar.getClass();
        return new z(z, z2, j);
    }

    public final boolean b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.a == zVar.a && this.b == zVar.b && this.c == zVar.c;
    }

    @Override // java.lang.Object
    public int hashCode() {
        boolean z = this.a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.b;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return ((i5 + i) * 31) + e.a(this.c);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Selectable(isSelected=");
        V0.append(this.a);
        V0.append(", shouldFollowOnSelection=");
        V0.append(this.b);
        V0.append(", timestamp=");
        return je.E0(V0, this.c, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeLong(this.c);
    }

    public z(boolean z, boolean z2, long j, int i) {
        j = (i & 4) != 0 ? 0 : j;
        this.a = z;
        this.b = z2;
        this.c = j;
    }
}
