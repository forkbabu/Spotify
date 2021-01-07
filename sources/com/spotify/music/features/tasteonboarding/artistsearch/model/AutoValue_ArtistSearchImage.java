package com.spotify.music.features.tasteonboarding.artistsearch.model;

import android.os.Parcel;
import android.os.Parcelable;

final class AutoValue_ArtistSearchImage extends C$AutoValue_ArtistSearchImage {
    public static final Parcelable.Creator<AutoValue_ArtistSearchImage> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_ArtistSearchImage> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ArtistSearchImage createFromParcel(Parcel parcel) {
            return new AutoValue_ArtistSearchImage(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ArtistSearchImage[] newArray(int i) {
            return new AutoValue_ArtistSearchImage[i];
        }
    }

    AutoValue_ArtistSearchImage(String str, int i, int i2) {
        super(str, i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(uri());
        parcel.writeInt(height());
        parcel.writeInt(width());
    }
}
