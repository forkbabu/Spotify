package com.spotify.music.features.california.feature;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

public final class f implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final int a;
    private final String b;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new f(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new f[i];
        }
    }

    public f(int i, String str) {
        h.e(str, "userName");
        this.a = i;
        this.b = str;
    }

    public final String a() {
        return this.b;
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
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && h.a(this.b, fVar.b);
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("CaliforniaParameters(luckyNumber=");
        V0.append(this.a);
        V0.append(", userName=");
        return je.I0(V0, this.b, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
    }
}
