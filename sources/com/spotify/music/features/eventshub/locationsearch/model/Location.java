package com.spotify.music.features.eventshub.locationsearch.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Location implements JacksonModel, Parcelable {
    public static final Parcelable.Creator<Location> CREATOR = new a();
    public static final Location EMPTY = new Location(-1, "");
    public static final int EMPTY_GEONAMEID = -1;
    @JsonProperty("geonameId")
    public final int mGeonameId;
    @JsonProperty("location")
    public final String mLocationName;

    static class a implements Parcelable.Creator<Location> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public Location createFromParcel(Parcel parcel) {
            return new Location(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public Location[] newArray(int i) {
            return new Location[i];
        }
    }

    public Location(@JsonProperty("geonameId") int i, @JsonProperty("location") String str) {
        this.mGeonameId = i;
        this.mLocationName = str == null ? "" : str;
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
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        if (this.mGeonameId != location.mGeonameId) {
            return false;
        }
        return this.mLocationName.equals(location.mLocationName);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.mLocationName.hashCode() + (this.mGeonameId * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mGeonameId);
        parcel.writeString(this.mLocationName);
    }

    protected Location(Parcel parcel) {
        this.mGeonameId = parcel.readInt();
        this.mLocationName = parcel.readString();
    }
}
