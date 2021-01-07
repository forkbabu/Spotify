package com.spotify.loginflow.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

public final class a implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0169a();
    private final String a;
    private final String b;
    private final String c;
    private final String f;
    private final String n;

    /* renamed from: com.spotify.loginflow.navigation.a$a  reason: collision with other inner class name */
    public static class C0169a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public a(String str, String str2, String str3, String str4, String str5) {
        h.e(str, "id");
        h.e(str2, "accessToken");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.n = str5;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.n;
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.f, aVar.f) && h.a(this.n, aVar.n);
    }

    public final String getName() {
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
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.n;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("FacebookUser(id=");
        V0.append(this.a);
        V0.append(", accessToken=");
        V0.append(this.b);
        V0.append(", firstName=");
        V0.append(this.c);
        V0.append(", name=");
        V0.append(this.f);
        V0.append(", email=");
        return je.I0(V0, this.n, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
        parcel.writeString(this.n);
    }
}
