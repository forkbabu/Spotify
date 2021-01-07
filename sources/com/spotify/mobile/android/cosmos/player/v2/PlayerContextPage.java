package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerContextPage implements JacksonModel, Parcelable {
    public static final Parcelable.Creator<PlayerContextPage> CREATOR = new Parcelable.Creator<PlayerContextPage>() {
        /* class com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public PlayerContextPage createFromParcel(Parcel parcel) {
            return new PlayerContextPage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlayerContextPage[] newArray(int i) {
            return new PlayerContextPage[i];
        }
    };
    @JsonProperty("metadata")
    private final ImmutableMap<String, String> mMetadata;
    @JsonProperty("next_page_url")
    private final String mNextPageUrl;
    @JsonProperty("page_url")
    private final String mPageUrl;
    @JsonProperty("tracks")
    private final PlayerTrack[] mTracks;

    @JsonCreator
    public PlayerContextPage(@JsonProperty("page_url") String str, @JsonProperty("next_page_url") String str2, @JsonProperty("tracks") PlayerTrack[] playerTrackArr, @JsonProperty("metadata") Map<String, String> map) {
        this.mPageUrl = str;
        this.mNextPageUrl = str2;
        this.mTracks = playerTrackArr;
        if (map == null || map.isEmpty()) {
            this.mMetadata = ImmutableMap.of();
        } else {
            this.mMetadata = ImmutableMap.copyOf(map);
        }
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
        if (!(obj instanceof PlayerContextPage)) {
            return false;
        }
        PlayerContextPage playerContextPage = (PlayerContextPage) obj;
        String str = this.mPageUrl;
        if (str == null ? playerContextPage.mPageUrl != null : !str.equals(playerContextPage.mPageUrl)) {
            return false;
        }
        String str2 = this.mNextPageUrl;
        if (str2 == null ? playerContextPage.mNextPageUrl != null : !str2.equals(playerContextPage.mNextPageUrl)) {
            return false;
        }
        if (!Arrays.equals(this.mTracks, playerContextPage.mTracks)) {
            return false;
        }
        return this.mMetadata.equals(playerContextPage.mMetadata);
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.mPageUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mNextPageUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.mMetadata.hashCode() + ((((hashCode + i) * 31) + Arrays.hashCode(this.mTracks)) * 31);
    }

    public Map<String, String> metadata() {
        return this.mMetadata;
    }

    public String nextPageUrl() {
        return this.mNextPageUrl;
    }

    public String pageUrl() {
        return this.mPageUrl;
    }

    public PlayerTrack[] tracks() {
        return this.mTracks;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        gf0.t(parcel, this.mMetadata);
        parcel.writeString(this.mPageUrl);
        parcel.writeString(this.mNextPageUrl);
        parcel.writeTypedArray(this.mTracks, i);
    }

    protected PlayerContextPage(Parcel parcel) {
        this.mMetadata = gf0.k(parcel, zf0.b());
        this.mPageUrl = parcel.readString();
        this.mNextPageUrl = parcel.readString();
        this.mTracks = (PlayerTrack[]) parcel.createTypedArray(PlayerTrack.CREATOR);
    }
}
