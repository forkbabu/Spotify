package com.spotify.libs.onboarding.allboarding.room;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

public final class c implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new c(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new c[i];
        }
    }

    public c(String str) {
        h.e(str, "color");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && h.a(this.a, ((c) obj).a);
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.I0(je.V0("ArtistMore(color="), this.a, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
    }
}
