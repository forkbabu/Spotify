package com.spotify.music.features.editplaylist.operations;

import android.os.Parcel;
import android.os.Parcelable;

final class q extends c {
    public static final Parcelable.Creator<q> CREATOR = new a();

    static class a implements Parcelable.Creator<q> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public q createFromParcel(Parcel parcel) {
            return new q(parcel.readString(), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public q[] newArray(int i) {
            return new q[i];
        }
    }

    q(String str, String str2) {
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
