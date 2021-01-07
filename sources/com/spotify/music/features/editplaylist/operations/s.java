package com.spotify.music.features.editplaylist.operations;

import android.os.Parcel;
import android.os.Parcelable;

final class s extends e {
    public static final Parcelable.Creator<s> CREATOR = new a();

    static class a implements Parcelable.Creator<s> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public s createFromParcel(Parcel parcel) {
            return new s(parcel.readString(), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public s[] newArray(int i) {
            return new s[i];
        }
    }

    s(String str, String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(b());
        parcel.writeString(a());
    }
}
