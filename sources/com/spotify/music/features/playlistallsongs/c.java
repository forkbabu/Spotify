package com.spotify.music.features.playlistallsongs;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

public final class c implements Parcelable {
    public static final Parcelable.Creator CREATOR = new b();
    private final boolean a;
    private final boolean b;
    private final Boolean c;
    private final boolean f;
    private final Integer n;

    public interface a {
    }

    public static class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            h.e(parcel, "in");
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            Integer num = null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new c(z, z2, bool, z3, num);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new c[i];
        }
    }

    public c(boolean z, boolean z2, Boolean bool, boolean z3, Integer num) {
        this.a = z;
        this.b = z2;
        this.c = bool;
        this.f = z3;
        this.n = num;
    }

    public static final a a() {
        return new d();
    }

    public final Boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.f;
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b && h.a(this.c, cVar.c) && this.f == cVar.f && h.a(this.n, cVar.n);
    }

    public final Integer f() {
        return this.n;
    }

    public final boolean g() {
        return this.b;
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
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        Boolean bool = this.c;
        int i10 = 0;
        int hashCode = (i9 + (bool != null ? bool.hashCode() : 0)) * 31;
        boolean z3 = this.f;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        int i11 = (hashCode + i) * 31;
        Integer num = this.n;
        if (num != null) {
            i10 = num.hashCode();
        }
        return i11 + i10;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("AllSongsConfiguration(includeEpisodes=");
        V0.append(this.a);
        V0.append(", showRankingNumbers=");
        V0.append(this.b);
        V0.append(", availableItemsOnly=");
        V0.append(this.c);
        V0.append(", contextAwareSharing=");
        V0.append(this.f);
        V0.append(", limitRangeTo=");
        V0.append(this.n);
        V0.append(")");
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        Boolean bool = this.c;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f ? 1 : 0);
        Integer num = this.n;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
            return;
        }
        parcel.writeInt(0);
    }

    public c() {
        this(false, false, null, false, null);
    }
}
