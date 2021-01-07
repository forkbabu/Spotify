package com.spotify.music.artist.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReleasesWithTotalCount implements Parcelable, JacksonModel {
    public static final Parcelable.Creator<ReleasesWithTotalCount> CREATOR = new a();
    public final List<Release> releases;
    public final int totalCount;

    static class a implements Parcelable.Creator<ReleasesWithTotalCount> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ReleasesWithTotalCount createFromParcel(Parcel parcel) {
            return new ReleasesWithTotalCount(parcel, (a) null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ReleasesWithTotalCount[] newArray(int i) {
            return new ReleasesWithTotalCount[i];
        }
    }

    /* synthetic */ ReleasesWithTotalCount(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean hasAllReleases() {
        return this.releases.size() == this.totalCount;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.releases);
        parcel.writeInt(this.totalCount);
    }

    @JsonCreator
    public ReleasesWithTotalCount(@JsonProperty("releases") List<Release> list, @JsonProperty("total_count") int i) {
        this.releases = gf0.a(list);
        this.totalCount = i;
    }

    private ReleasesWithTotalCount(Parcel parcel) {
        this.releases = parcel.createTypedArrayList(Release.CREATOR);
        this.totalCount = parcel.readInt();
    }
}
