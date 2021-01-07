package com.spotify.music.features.editplaylist.operations;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

final class t extends f {
    public static final Parcelable.Creator<t> CREATOR = new a();

    static class a implements Parcelable.Creator<t> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public t createFromParcel(Parcel parcel) {
            return new t(parcel.readString(), (Uri) parcel.readParcelable(o0.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public t[] newArray(int i) {
            return new t[i];
        }
    }

    t(String str, Uri uri) {
        super(str, uri);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(b());
        parcel.writeParcelable(a(), i);
    }
}
