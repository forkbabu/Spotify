package com.spotify.music.features.profile.profilelist;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

public final class u implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;
    private final String b;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new u(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new u[i];
        }
    }

    public u(String str, String str2) {
        h.e(str, "uri");
        h.e(str2, "currentUserUsername");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getUri() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
