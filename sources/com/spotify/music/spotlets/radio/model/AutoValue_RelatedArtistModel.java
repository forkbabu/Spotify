package com.spotify.music.spotlets.radio.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_RelatedArtistModel extends C$AutoValue_RelatedArtistModel {
    public static final Parcelable.Creator<AutoValue_RelatedArtistModel> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_RelatedArtistModel> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_RelatedArtistModel createFromParcel(Parcel parcel) {
            return new AutoValue_RelatedArtistModel(parcel.readString(), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_RelatedArtistModel[] newArray(int i) {
            return new AutoValue_RelatedArtistModel[i];
        }
    }

    AutoValue_RelatedArtistModel(String str, String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(artistName());
        parcel.writeString(artistUri());
    }
}
