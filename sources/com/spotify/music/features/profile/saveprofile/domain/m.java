package com.spotify.music.features.profile.saveprofile.domain;

import android.os.Parcel;
import android.os.Parcelable;

final class m extends a {
    public static final Parcelable.Creator<m> CREATOR = new a();

    static class a implements Parcelable.Creator<m> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public m createFromParcel(Parcel parcel) {
            return new m((SaveProfileState) Enum.valueOf(SaveProfileState.class, parcel.readString()), parcel.readFloat());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public m[] newArray(int i) {
            return new m[i];
        }
    }

    m(SaveProfileState saveProfileState, float f) {
        super(saveProfileState, f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(c().name());
        parcel.writeFloat(b());
    }
}
