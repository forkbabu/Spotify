package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;

@JsonIgnoreProperties(ignoreUnknown = true)
@Deprecated
public class PlayerContextIndex implements JacksonModel, Parcelable {
    public static final Parcelable.Creator<PlayerContextIndex> CREATOR = new Parcelable.Creator<PlayerContextIndex>() {
        /* class com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public PlayerContextIndex createFromParcel(Parcel parcel) {
            return new PlayerContextIndex(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlayerContextIndex[] newArray(int i) {
            return new PlayerContextIndex[i];
        }
    };
    @JsonProperty("page")
    private final int mPage;
    @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
    private final int mTrack;

    @JsonCreator
    public PlayerContextIndex(@JsonProperty("page") int i, @JsonProperty("track") int i2) {
        this.mPage = i;
        this.mTrack = i2;
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
        if (!(obj instanceof PlayerContextIndex)) {
            return false;
        }
        PlayerContextIndex playerContextIndex = (PlayerContextIndex) obj;
        return this.mPage == playerContextIndex.mPage && this.mTrack == playerContextIndex.mTrack;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return (this.mPage * 31) + this.mTrack;
    }

    @JsonProperty("page")
    public int page() {
        return this.mPage;
    }

    @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
    public int track() {
        return this.mTrack;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mPage);
        parcel.writeInt(this.mTrack);
    }

    protected PlayerContextIndex(Parcel parcel) {
        this.mPage = parcel.readInt();
        this.mTrack = parcel.readInt();
    }
}
