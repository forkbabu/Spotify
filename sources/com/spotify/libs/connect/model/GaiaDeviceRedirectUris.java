package com.spotify.libs.connect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GaiaDeviceRedirectUris implements JacksonModel, Parcelable {
    public static final Parcelable.Creator<GaiaDeviceRedirectUris> CREATOR = new a();
    private final GaiaDeviceRedirectUrisAndroid mAndroidUris;

    static class a implements Parcelable.Creator<GaiaDeviceRedirectUris> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public GaiaDeviceRedirectUris createFromParcel(Parcel parcel) {
            return new GaiaDeviceRedirectUris(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public GaiaDeviceRedirectUris[] newArray(int i) {
            return new GaiaDeviceRedirectUris[i];
        }
    }

    /* synthetic */ GaiaDeviceRedirectUris(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @JsonGetter("android")
    public GaiaDeviceRedirectUrisAndroid getAndroidUris() {
        return this.mAndroidUris;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        gf0.v(parcel, this.mAndroidUris, i);
    }

    @JsonCreator
    public GaiaDeviceRedirectUris(@JsonProperty("android") GaiaDeviceRedirectUrisAndroid gaiaDeviceRedirectUrisAndroid) {
        this.mAndroidUris = gaiaDeviceRedirectUrisAndroid;
    }

    private GaiaDeviceRedirectUris(Parcel parcel) {
        GaiaDeviceRedirectUrisAndroid gaiaDeviceRedirectUrisAndroid = (GaiaDeviceRedirectUrisAndroid) gf0.n(parcel, GaiaDeviceRedirectUrisAndroid.CREATOR);
        this.mAndroidUris = gaiaDeviceRedirectUrisAndroid == null ? new GaiaDeviceRedirectUrisAndroid("", "", "", "") : gaiaDeviceRedirectUrisAndroid;
    }
}
