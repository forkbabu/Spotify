package com.spotify.music.features.editplaylist.operations;

import android.os.Parcel;
import android.os.Parcelable;

final class r extends d {
    public static final Parcelable.Creator<r> CREATOR = new a();

    static class a implements Parcelable.Creator<r> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public r createFromParcel(Parcel parcel) {
            return new r(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public r[] newArray(int i) {
            return new r[i];
        }
    }

    r(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(b());
        parcel.writeString(c());
        if (a() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(a());
    }
}
