package com.spotify.libs.connect.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class d implements Parcelable {
    public static final a CREATOR = new a(null);
    private final String a;
    private final String b;
    private final String c;
    private final boolean f;
    private final String n;

    public static final class a implements Parcelable.Creator<d> {
        public a(f fVar) {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public d createFromParcel(Parcel parcel) {
            h.e(parcel, "parcel");
            h.e(parcel, "parcel");
            String readString = parcel.readString();
            h.c(readString);
            h.d(readString, "parcel.readString()!!");
            String readString2 = parcel.readString();
            h.c(readString2);
            h.d(readString2, "parcel.readString()!!");
            String readString3 = parcel.readString();
            boolean z = false;
            if (parcel.readByte() != ((byte) 0)) {
                z = true;
            }
            String readString4 = parcel.readString();
            h.c(readString4);
            h.d(readString4, "parcel.readString()!!");
            return new d(readString, readString2, readString3, z, readString4);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public d[] newArray(int i) {
            return new d[i];
        }
    }

    public d(String str, String str2, String str3, boolean z, String str4) {
        je.x(str, "id", str2, "displayName", str4, "userName");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = z;
        this.n = str4;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.n;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.a(this.a, dVar.a) && h.a(this.b, dVar.b) && h.a(this.c, dVar.c) && this.f == dVar.f && h.a(this.n, dVar.n);
    }

    public final boolean f() {
        return this.f;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.f;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode3 + i2) * 31;
        String str4 = this.n;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i5 + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Participant(id=");
        V0.append(this.a);
        V0.append(", displayName=");
        V0.append(this.b);
        V0.append(", imageUrl=");
        V0.append(this.c);
        V0.append(", isHost=");
        V0.append(this.f);
        V0.append(", userName=");
        return je.I0(V0, this.n, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByte(this.f ? (byte) 1 : 0);
        parcel.writeString(this.n);
    }
}
