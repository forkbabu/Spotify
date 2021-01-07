package com.spotify.libs.onboarding.allboarding.room;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

public final class a0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new a0(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new a0[i];
        }
    }

    public a0(String str) {
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
            return (obj instanceof a0) && h.a(this.a, ((a0) obj).a);
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
        return je.I0(je.V0("Show(imageUrl="), this.a, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
    }
}
