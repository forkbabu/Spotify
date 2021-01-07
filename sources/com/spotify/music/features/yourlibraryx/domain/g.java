package com.spotify.music.features.yourlibraryx.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

public final class g implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;
    private final String b;
    private final String c;
    private final boolean f;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new g(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new g[i];
        }
    }

    public g(String str, String str2, String str3, boolean z) {
        h.e(str, "username");
        h.e(str2, "displayName");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = z;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.f;
    }

    public final String c() {
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
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return h.a(this.a, gVar.a) && h.a(this.b, gVar.b) && h.a(this.c, gVar.c) && this.f == gVar.f;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("YourLibraryXProfileData(username=");
        V0.append(this.a);
        V0.append(", displayName=");
        V0.append(this.b);
        V0.append(", profilePictureUrl=");
        V0.append(this.c);
        V0.append(", loaded=");
        return je.P0(V0, this.f, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
