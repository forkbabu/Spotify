package com.spotify.music.features.editplaylist.operations;

import android.os.Parcel;
import android.os.Parcelable;

final class p extends b {
    public static final Parcelable.Creator<p> CREATOR = new a();

    static class a implements Parcelable.Creator<p> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public p createFromParcel(Parcel parcel) {
            return new p(parcel.readString(), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public p[] newArray(int i) {
            return new p[i];
        }
    }

    p(String str, String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(a());
        parcel.writeString(b());
    }
}
