package com.spotify.music.features.findfriends.model;

import android.os.Parcel;
import android.os.Parcelable;

final class AutoValue_UserModel extends C$AutoValue_UserModel {
    public static final Parcelable.Creator<AutoValue_UserModel> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_UserModel> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UserModel createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new AutoValue_UserModel(readString, readString2, readString3, z);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UserModel[] newArray(int i) {
            return new AutoValue_UserModel[i];
        }
    }

    AutoValue_UserModel(String str, String str2, String str3, boolean z) {
        super(str, str2, str3, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(uri());
        parcel.writeString(title());
        parcel.writeString(image());
        parcel.writeInt(isFollowing() ? 1 : 0);
    }
}
