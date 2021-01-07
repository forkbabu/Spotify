package com.spotify.music.features.findfriends.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

final class AutoValue_FindFriendsModel extends C$AutoValue_FindFriendsModel {
    public static final Parcelable.Creator<AutoValue_FindFriendsModel> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_FindFriendsModel> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_FindFriendsModel createFromParcel(Parcel parcel) {
            return new AutoValue_FindFriendsModel(parcel.readArrayList(FindFriendsModel.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_FindFriendsModel[] newArray(int i) {
            return new AutoValue_FindFriendsModel[i];
        }
    }

    AutoValue_FindFriendsModel(List<UserModel> list) {
        super(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(results());
    }
}
