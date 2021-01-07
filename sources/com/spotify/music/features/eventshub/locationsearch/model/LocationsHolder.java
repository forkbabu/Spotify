package com.spotify.music.features.eventshub.locationsearch.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class LocationsHolder implements JacksonModel, Parcelable {
    public static final Parcelable.Creator<LocationsHolder> CREATOR = new a();
    public static final LocationsHolder EMPTY = new LocationsHolder(Collections.emptyList());
    @JsonProperty("results")
    private final List<Location> mLocations;

    static class a implements Parcelable.Creator<LocationsHolder> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public LocationsHolder createFromParcel(Parcel parcel) {
            return new LocationsHolder(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public LocationsHolder[] newArray(int i) {
            return new LocationsHolder[i];
        }
    }

    protected LocationsHolder(Parcel parcel) {
        this.mLocations = parcel.createTypedArrayList(Location.CREATOR);
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
        if (!(obj instanceof LocationsHolder)) {
            return false;
        }
        return this.mLocations.equals(((LocationsHolder) obj).mLocations);
    }

    public List<Location> getLocations() {
        return this.mLocations;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.mLocations.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.mLocations);
    }

    public LocationsHolder(@JsonProperty("results") List<Location> list) {
        this.mLocations = list == null ? Collections.unmodifiableList(Arrays.asList(new Location[0])) : list;
    }
}
