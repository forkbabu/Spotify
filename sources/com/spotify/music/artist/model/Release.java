package com.spotify.music.artist.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Release implements Parcelable, JacksonModel {
    public static final Parcelable.Creator<Release> CREATOR = new a();
    public final Image cover;
    public final int day;
    public final int month;
    public final String name;
    public final int trackCount;
    public final String uri;
    public final int year;

    static class a implements Parcelable.Creator<Release> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public Release createFromParcel(Parcel parcel) {
            return new Release(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public Release[] newArray(int i) {
            return new Release[i];
        }
    }

    /* synthetic */ Release(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeString(this.name);
        gf0.v(parcel, this.cover, 0);
        parcel.writeInt(this.year);
        parcel.writeInt(this.month);
        parcel.writeInt(this.day);
        parcel.writeInt(this.trackCount);
    }

    @JsonCreator
    public Release(@JsonProperty("uri") String str, @JsonProperty("name") String str2, @JsonProperty("cover") Image image, @JsonProperty("year") int i, @JsonProperty("month") int i2, @JsonProperty("day") int i3, @JsonProperty("track_count") int i4) {
        str.getClass();
        this.uri = str;
        str2.getClass();
        this.name = str2;
        this.cover = image;
        this.year = i;
        this.month = i2;
        this.day = i3;
        this.trackCount = i4;
    }

    private Release(Parcel parcel) {
        this.uri = parcel.readString();
        this.name = parcel.readString();
        this.cover = (Image) gf0.n(parcel, Image.CREATOR);
        this.year = parcel.readInt();
        this.month = parcel.readInt();
        this.day = parcel.readInt();
        this.trackCount = parcel.readInt();
    }
}
