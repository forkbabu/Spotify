package com.spotify.music.artist.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Image implements Parcelable, JacksonModel {
    public static final Parcelable.Creator<Image> CREATOR = new a();
    public final int height;
    public final String uri;
    public final int width;

    static class a implements Parcelable.Creator<Image> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public Image createFromParcel(Parcel parcel) {
            return new Image(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public Image[] newArray(int i) {
            return new Image[i];
        }
    }

    /* synthetic */ Image(Parcel parcel, a aVar) {
        this(parcel);
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
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        if (this.width == image.width && this.height == image.height && rw.equal(this.uri, image.uri)) {
            return true;
        }
        return false;
    }

    @JsonIgnore
    public Uri getUri() {
        return !TextUtils.isEmpty(this.uri) ? Uri.parse(this.uri) : Uri.EMPTY;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.uri, Integer.valueOf(this.width), Integer.valueOf(this.height)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    @JsonCreator
    public Image(@JsonProperty("uri") String str, @JsonProperty("width") int i, @JsonProperty("height") int i2) {
        str.getClass();
        this.uri = str;
        this.width = i;
        this.height = i2;
    }

    private Image(Parcel parcel) {
        this.uri = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }
}
