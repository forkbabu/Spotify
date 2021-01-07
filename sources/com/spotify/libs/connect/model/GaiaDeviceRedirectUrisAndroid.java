package com.spotify.libs.connect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GaiaDeviceRedirectUrisAndroid implements JacksonModel, Parcelable {
    public static final Parcelable.Creator<GaiaDeviceRedirectUrisAndroid> CREATOR = new a();
    private final String mDeviceNameParam;
    private final String mFallbackUrl;
    private final String mRedirectBackAppParam;
    private final String mUri;

    static class a implements Parcelable.Creator<GaiaDeviceRedirectUrisAndroid> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public GaiaDeviceRedirectUrisAndroid createFromParcel(Parcel parcel) {
            return new GaiaDeviceRedirectUrisAndroid(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public GaiaDeviceRedirectUrisAndroid[] newArray(int i) {
            return new GaiaDeviceRedirectUrisAndroid[i];
        }
    }

    /* synthetic */ GaiaDeviceRedirectUrisAndroid(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @JsonGetter("deviceNameParam")
    public String getDeviceNameParam() {
        return this.mDeviceNameParam;
    }

    @JsonGetter("fallbackUrl")
    public String getFallbackUrl() {
        return this.mFallbackUrl;
    }

    @JsonGetter("redirectBackAppParam")
    public String getRedirectBackAppParam() {
        return this.mRedirectBackAppParam;
    }

    @JsonGetter("uri")
    public String getUri() {
        return this.mUri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        gf0.s(parcel, this.mUri);
        gf0.s(parcel, this.mRedirectBackAppParam);
        gf0.s(parcel, this.mDeviceNameParam);
        gf0.s(parcel, this.mFallbackUrl);
    }

    @JsonCreator
    public GaiaDeviceRedirectUrisAndroid(@JsonProperty("uri") String str, @JsonProperty("redirectBackAppParam") String str2, @JsonProperty("deviceNameParam") String str3, @JsonProperty("fallbackUrl") String str4) {
        this.mUri = str == null ? "" : str;
        this.mRedirectBackAppParam = str2;
        this.mDeviceNameParam = str3;
        this.mFallbackUrl = str4;
    }

    private GaiaDeviceRedirectUrisAndroid(Parcel parcel) {
        String l = gf0.l(parcel);
        this.mUri = l == null ? "" : l;
        this.mRedirectBackAppParam = gf0.l(parcel);
        this.mDeviceNameParam = gf0.l(parcel);
        this.mFallbackUrl = gf0.l(parcel);
    }
}
