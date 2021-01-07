package com.spotify.music.features.profile.entity;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

public final class t implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;
    private final String b;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new t(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new t[i];
        }
    }

    public t(String str, String str2) {
        h.e(str, "profileUri");
        h.e(str2, "currentUserUsername");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
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
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return h.a(this.a, tVar.a) && h.a(this.b, tVar.b);
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ProfileEntityPageParameters(profileUri=");
        V0.append(this.a);
        V0.append(", currentUserUsername=");
        return je.I0(V0, this.b, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
