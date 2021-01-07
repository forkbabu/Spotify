package com.spotify.music.features.profile.model;

import android.os.Parcel;
import android.os.Parcelable;

final class f implements Parcelable.Creator<ProfileListItem> {
    f() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public ProfileListItem createFromParcel(Parcel parcel) {
        return d.CREATOR.createFromParcel(parcel);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public ProfileListItem[] newArray(int i) {
        return new d[i];
    }
}
