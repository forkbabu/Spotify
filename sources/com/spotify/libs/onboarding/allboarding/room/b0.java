package com.spotify.libs.onboarding.allboarding.room;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

public final class b0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;
    private final boolean b;
    private final int c;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new b0(parcel.readString(), parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new b0[i];
        }
    }

    public b0(String str, boolean z, int i) {
        h.e(str, "color");
        this.a = str;
        this.b = z;
        this.c = i;
    }

    public final boolean a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return h.a(this.a, b0Var.a) && this.b == b0Var.b && this.c == b0Var.c;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return ((hashCode + i) * 31) + this.c;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ShowMore(color=");
        V0.append(this.a);
        V0.append(", canExpandMultipleTimes=");
        V0.append(this.b);
        V0.append(", expansionOffset=");
        return je.B0(V0, this.c, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c);
    }
}
