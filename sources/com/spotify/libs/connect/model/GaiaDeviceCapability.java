package com.spotify.libs.connect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collections;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GaiaDeviceCapability implements JacksonModel, Parcelable {
    public static final Parcelable.Creator<GaiaDeviceCapability> CREATOR = new a();
    private final String mDefaultTitle;
    private final GaiaDeviceRedirectUris mGaiaDeviceRedirectUris;
    private final String mIconUrl;
    private final String mId;
    private final Map<String, String> mLocalizedTitles;

    static class a implements Parcelable.Creator<GaiaDeviceCapability> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public GaiaDeviceCapability createFromParcel(Parcel parcel) {
            return new GaiaDeviceCapability(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public GaiaDeviceCapability[] newArray(int i) {
            return new GaiaDeviceCapability[i];
        }
    }

    /* synthetic */ GaiaDeviceCapability(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @JsonGetter("defaultTitle")
    public String getDefaultTitle() {
        return this.mDefaultTitle;
    }

    @JsonGetter("redirectUris")
    public GaiaDeviceRedirectUris getGaiaDeviceRedirectUris() {
        return this.mGaiaDeviceRedirectUris;
    }

    @JsonGetter("iconUrl")
    public String getIconUrl() {
        return this.mIconUrl;
    }

    @JsonGetter("id")
    public String getId() {
        return this.mId;
    }

    @JsonGetter("localizedTitle")
    public Map<String, String> getLocalizedTitles() {
        return this.mLocalizedTitles;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        gf0.s(parcel, this.mId);
        gf0.s(parcel, this.mDefaultTitle);
        gf0.s(parcel, this.mIconUrl);
        gf0.v(parcel, this.mGaiaDeviceRedirectUris, i);
        gf0.t(parcel, this.mLocalizedTitles);
    }

    @JsonCreator
    public GaiaDeviceCapability(@JsonProperty("id") String str, @JsonProperty("defaultTitle") String str2, @JsonProperty("iconUrl") String str3, @JsonProperty("redirectUris") GaiaDeviceRedirectUris gaiaDeviceRedirectUris, @JsonProperty("localizedTitle") Map<String, String> map) {
        this.mId = str;
        this.mDefaultTitle = str2;
        this.mIconUrl = str3;
        this.mGaiaDeviceRedirectUris = gaiaDeviceRedirectUris;
        this.mLocalizedTitles = map == null ? Collections.emptyMap() : map;
    }

    private GaiaDeviceCapability(Parcel parcel) {
        String l = gf0.l(parcel);
        String l2 = gf0.l(parcel);
        String l3 = gf0.l(parcel);
        GaiaDeviceRedirectUris gaiaDeviceRedirectUris = (GaiaDeviceRedirectUris) gf0.n(parcel, GaiaDeviceRedirectUris.CREATOR);
        this.mId = l == null ? "" : l;
        this.mDefaultTitle = l2 == null ? "" : l2;
        this.mIconUrl = l3 == null ? "" : l3;
        this.mGaiaDeviceRedirectUris = gaiaDeviceRedirectUris == null ? new GaiaDeviceRedirectUris(new GaiaDeviceRedirectUrisAndroid("", "", "", "")) : gaiaDeviceRedirectUris;
        this.mLocalizedTitles = gf0.k(parcel, zf0.b());
    }
}
