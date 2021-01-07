package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@Deprecated
public class PlayOrigin implements JacksonModel, Parcelable {
    public static final Parcelable.Creator<PlayOrigin> CREATOR = new Parcelable.Creator<PlayOrigin>() {
        /* class com.spotify.mobile.android.cosmos.player.v2.PlayOrigin.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public PlayOrigin createFromParcel(Parcel parcel) {
            return new PlayOrigin(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlayOrigin[] newArray(int i) {
            return new PlayOrigin[i];
        }
    };
    @JsonProperty("device_identifier")
    private final String mDeviceIdentifier;
    @JsonProperty("external_referrer")
    private final String mExternalReferrer;
    @JsonProperty("feature_classes")
    private final Set<String> mFeatureClasses;
    @JsonProperty("feature_identifier")
    private final String mFeatureIdentifier;
    @JsonProperty("feature_version")
    private final String mFeatureVersion;
    @JsonProperty("referrer_identifier")
    private final String mReferrerIdentifier;
    @JsonProperty("view_uri")
    private final String mViewUri;

    public PlayOrigin(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String deviceIdentifier() {
        return this.mDeviceIdentifier;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayOrigin)) {
            return false;
        }
        PlayOrigin playOrigin = (PlayOrigin) obj;
        if (!rw.equal(this.mFeatureIdentifier, playOrigin.mFeatureIdentifier) || !rw.equal(this.mFeatureVersion, playOrigin.mFeatureVersion) || !rw.equal(this.mViewUri, playOrigin.mViewUri) || !rw.equal(this.mExternalReferrer, playOrigin.mExternalReferrer) || !rw.equal(this.mReferrerIdentifier, playOrigin.mReferrerIdentifier) || !rw.equal(this.mDeviceIdentifier, playOrigin.mDeviceIdentifier) || !rw.equal(this.mFeatureClasses, playOrigin.mFeatureClasses)) {
            return false;
        }
        return true;
    }

    public String externalReferrer() {
        return this.mExternalReferrer;
    }

    public Set<String> featureClasses() {
        return this.mFeatureClasses;
    }

    public String featureIdentifier() {
        return this.mFeatureIdentifier;
    }

    public String featureVersion() {
        return this.mFeatureVersion;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int Y0 = je.Y0(this.mFeatureVersion, this.mFeatureIdentifier.hashCode() * 31, 31);
        String str = this.mViewUri;
        int i = 0;
        int hashCode = (Y0 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.mExternalReferrer;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mReferrerIdentifier;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.mDeviceIdentifier;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Set<String> set = this.mFeatureClasses;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode4 + i;
    }

    public String referrerIdentifier() {
        return this.mReferrerIdentifier;
    }

    public String viewUri() {
        return this.mViewUri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mFeatureIdentifier);
        parcel.writeString(this.mFeatureVersion);
        parcel.writeString(this.mViewUri);
        parcel.writeString(this.mExternalReferrer);
        parcel.writeString(this.mReferrerIdentifier);
        parcel.writeString(this.mDeviceIdentifier);
        parcel.writeInt(this.mFeatureClasses != null ? 1 : 0);
        Set<String> set = this.mFeatureClasses;
        if (set != null) {
            gf0.u(parcel, set);
        }
    }

    public PlayOrigin(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, str2, str3, str4, str5, str6, null);
    }

    @JsonCreator
    public PlayOrigin(@JsonProperty("feature_identifier") String str, @JsonProperty("feature_version") String str2, @JsonProperty("view_uri") String str3, @JsonProperty("external_referrer") String str4, @JsonProperty("referrer_identifier") String str5, @JsonProperty("device_identifier") String str6, @JsonProperty("feature_classes") Set<String> set) {
        this.mFeatureIdentifier = str;
        this.mFeatureVersion = str2;
        this.mViewUri = str3;
        this.mExternalReferrer = str4;
        this.mReferrerIdentifier = str5;
        this.mDeviceIdentifier = str6;
        this.mFeatureClasses = set;
    }

    protected PlayOrigin(Parcel parcel) {
        this.mFeatureIdentifier = parcel.readString();
        this.mFeatureVersion = parcel.readString();
        this.mViewUri = parcel.readString();
        this.mExternalReferrer = parcel.readString();
        this.mReferrerIdentifier = parcel.readString();
        this.mDeviceIdentifier = parcel.readString();
        this.mFeatureClasses = parcel.readInt() != 0 ? gf0.m(parcel) : null;
    }
}
