package com.spotify.music.lyrics.core.experience.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class ProviderAndroidIntent implements JacksonModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String action;
    private final String contentType;
    private final String data;
    private final String providerAndroidPackage;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new ProviderAndroidIntent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProviderAndroidIntent[i];
        }
    }

    public ProviderAndroidIntent(@JsonProperty("providerAndroidAppId") String str, @JsonProperty("action") String str2, @JsonProperty("data") String str3, @JsonProperty("contentType") String str4) {
        h.e(str, "providerAndroidPackage");
        this.providerAndroidPackage = str;
        this.action = str2;
        this.data = str3;
        this.contentType = str4;
    }

    public static /* synthetic */ ProviderAndroidIntent copy$default(ProviderAndroidIntent providerAndroidIntent, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = providerAndroidIntent.providerAndroidPackage;
        }
        if ((i & 2) != 0) {
            str2 = providerAndroidIntent.action;
        }
        if ((i & 4) != 0) {
            str3 = providerAndroidIntent.data;
        }
        if ((i & 8) != 0) {
            str4 = providerAndroidIntent.contentType;
        }
        return providerAndroidIntent.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.providerAndroidPackage;
    }

    public final String component2() {
        return this.action;
    }

    public final String component3() {
        return this.data;
    }

    public final String component4() {
        return this.contentType;
    }

    public final ProviderAndroidIntent copy(@JsonProperty("providerAndroidAppId") String str, @JsonProperty("action") String str2, @JsonProperty("data") String str3, @JsonProperty("contentType") String str4) {
        h.e(str, "providerAndroidPackage");
        return new ProviderAndroidIntent(str, str2, str3, str4);
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
        if (!(obj instanceof ProviderAndroidIntent)) {
            return false;
        }
        ProviderAndroidIntent providerAndroidIntent = (ProviderAndroidIntent) obj;
        return h.a(this.providerAndroidPackage, providerAndroidIntent.providerAndroidPackage) && h.a(this.action, providerAndroidIntent.action) && h.a(this.data, providerAndroidIntent.data) && h.a(this.contentType, providerAndroidIntent.contentType);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getData() {
        return this.data;
    }

    public final String getProviderAndroidPackage() {
        return this.providerAndroidPackage;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.providerAndroidPackage;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.action;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.data;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.contentType;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ProviderAndroidIntent(providerAndroidPackage=");
        V0.append(this.providerAndroidPackage);
        V0.append(", action=");
        V0.append(this.action);
        V0.append(", data=");
        V0.append(this.data);
        V0.append(", contentType=");
        return je.I0(V0, this.contentType, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.providerAndroidPackage);
        parcel.writeString(this.action);
        parcel.writeString(this.data);
        parcel.writeString(this.contentType);
    }
}
