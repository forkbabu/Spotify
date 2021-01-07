package com.spotify.music.artist.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtistReleases implements Parcelable, JacksonModel {
    public static final Parcelable.Creator<ArtistReleases> CREATOR = new a();
    public final Releases releases;
    public final String uri;

    static class a implements Parcelable.Creator<ArtistReleases> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ArtistReleases createFromParcel(Parcel parcel) {
            return new ArtistReleases(parcel, (a) null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ArtistReleases[] newArray(int i) {
            return new ArtistReleases[i];
        }
    }

    /* synthetic */ ArtistReleases(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        this.releases.writeToParcel(parcel, i);
    }

    @JsonCreator
    public ArtistReleases(@JsonProperty("uri") String str, @JsonProperty("releases") Releases releases2) {
        str.getClass();
        this.uri = str;
        releases2.getClass();
        this.releases = releases2;
    }

    private ArtistReleases(Parcel parcel) {
        this.uri = parcel.readString();
        this.releases = Releases.CREATOR.createFromParcel(parcel);
    }
}
