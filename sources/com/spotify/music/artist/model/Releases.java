package com.spotify.music.artist.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.x;
import java.util.Collections;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Releases implements Parcelable, JacksonModel {
    public static final Parcelable.Creator<Releases> CREATOR = new a();
    public final ReleasesWithTotalCount albums;
    public final ReleasesWithTotalCount appearsOn;
    public final ReleasesWithTotalCount compilations;
    public final ReleasesWithTotalCount singles;

    static class a implements Parcelable.Creator<Releases> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public Releases createFromParcel(Parcel parcel) {
            return new Releases(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public Releases[] newArray(int i) {
            return new Releases[i];
        }
    }

    /* synthetic */ Releases(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ReleasesWithTotalCount getReleasesWithTotalCount(ReleaseType releaseType) {
        int ordinal = releaseType.ordinal();
        if (ordinal == 1) {
            return this.albums;
        }
        if (ordinal == 2) {
            return this.singles;
        }
        if (ordinal == 3 || ordinal == 4) {
            return this.appearsOn;
        }
        if (ordinal == 5) {
            return this.compilations;
        }
        throw new IllegalArgumentException("Unknown release type: " + releaseType);
    }

    public boolean hasReleasesOfType(ReleaseType releaseType) {
        return !getReleasesWithTotalCount(releaseType).releases.isEmpty();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.albums.writeToParcel(parcel, 0);
        this.singles.writeToParcel(parcel, 0);
        this.appearsOn.writeToParcel(parcel, 0);
        this.compilations.writeToParcel(parcel, 0);
    }

    @JsonCreator
    public Releases(@JsonProperty("albums") ReleasesWithTotalCount releasesWithTotalCount, @JsonProperty("singles") ReleasesWithTotalCount releasesWithTotalCount2, @JsonProperty("appears_on") ReleasesWithTotalCount releasesWithTotalCount3, @JsonProperty("compilations") ReleasesWithTotalCount releasesWithTotalCount4) {
        ReleasesWithTotalCount releasesWithTotalCount5 = new ReleasesWithTotalCount(Collections.emptyList(), 0);
        this.albums = (ReleasesWithTotalCount) x.n(releasesWithTotalCount, releasesWithTotalCount5);
        this.singles = (ReleasesWithTotalCount) x.n(releasesWithTotalCount2, releasesWithTotalCount5);
        this.appearsOn = (ReleasesWithTotalCount) x.n(releasesWithTotalCount3, releasesWithTotalCount5);
        this.compilations = (ReleasesWithTotalCount) x.n(releasesWithTotalCount4, releasesWithTotalCount5);
    }

    private Releases(Parcel parcel) {
        Parcelable.Creator<ReleasesWithTotalCount> creator = ReleasesWithTotalCount.CREATOR;
        this.albums = creator.createFromParcel(parcel);
        this.singles = creator.createFromParcel(parcel);
        this.appearsOn = creator.createFromParcel(parcel);
        this.compilations = creator.createFromParcel(parcel);
    }
}
