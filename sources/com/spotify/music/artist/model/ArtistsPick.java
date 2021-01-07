package com.spotify.music.artist.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtistsPick implements Parcelable, JacksonModel {
    public static final Parcelable.Creator<ArtistsPick> CREATOR = new a();
    public final String description;
    public final Optional<String> imageUri;
    public final String name;
    public final String uri;

    static class a implements Parcelable.Creator<ArtistsPick> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ArtistsPick createFromParcel(Parcel parcel) {
            return new ArtistsPick(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ArtistsPick[] newArray(int i) {
            return new ArtistsPick[i];
        }
    }

    @JsonCreator
    public ArtistsPick(@JsonProperty("title") String str, @JsonProperty("subtitle") String str2, @JsonProperty("uri") String str3, @JsonProperty("image") String str4) {
        this.name = str;
        this.description = str2;
        this.uri = str3;
        this.imageUri = Optional.fromNullable(str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArtistsPick)) {
            return false;
        }
        ArtistsPick artistsPick = (ArtistsPick) obj;
        if (this.name.equals(artistsPick.name) && this.description.equals(artistsPick.description) && this.uri.equals(artistsPick.uri)) {
            return this.imageUri.equals(artistsPick.imageUri);
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.imageUri.hashCode() + je.Y0(this.uri, je.Y0(this.description, this.name.hashCode() * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.uri);
        parcel.writeString(this.imageUri.orNull());
    }

    protected ArtistsPick(Parcel parcel) {
        this.name = parcel.readString();
        this.description = parcel.readString();
        this.uri = parcel.readString();
        this.imageUri = Optional.fromNullable(parcel.readString());
    }
}
