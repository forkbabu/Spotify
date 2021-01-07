package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerQueue implements JacksonModel, Parcelable {
    public static final Parcelable.Creator<PlayerQueue> CREATOR = new Parcelable.Creator<PlayerQueue>() {
        /* class com.spotify.mobile.android.cosmos.player.v2.PlayerQueue.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public PlayerQueue createFromParcel(Parcel parcel) {
            return new PlayerQueue(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlayerQueue[] newArray(int i) {
            return new PlayerQueue[i];
        }
    };
    @JsonProperty("next_tracks")
    private final PlayerTrack[] mNextTracks;
    @JsonProperty("prev_tracks")
    private final PlayerTrack[] mPrevTracks;
    @JsonProperty("revision")
    private final String mRevision;
    @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
    private final PlayerTrack mTrack;

    @JsonCreator
    public PlayerQueue(@JsonProperty("revision") String str, @JsonProperty("track") PlayerTrack playerTrack, @JsonProperty("next_tracks") PlayerTrack[] playerTrackArr, @JsonProperty("prev_tracks") PlayerTrack[] playerTrackArr2) {
        this.mRevision = str;
        this.mTrack = playerTrack;
        this.mNextTracks = playerTrackArr;
        this.mPrevTracks = playerTrackArr2;
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
        if (!(obj instanceof PlayerQueue)) {
            return false;
        }
        PlayerQueue playerQueue = (PlayerQueue) obj;
        if (!this.mRevision.equals(playerQueue.mRevision)) {
            return false;
        }
        PlayerTrack playerTrack = this.mTrack;
        if (playerTrack == null ? playerQueue.mTrack != null : !playerTrack.equals(playerQueue.mTrack)) {
            return false;
        }
        if (!Arrays.equals(this.mNextTracks, playerQueue.mNextTracks)) {
            return false;
        }
        return Arrays.equals(this.mPrevTracks, playerQueue.mPrevTracks);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return (((Arrays.hashCode(new Object[]{this.mRevision, this.mTrack}) * 31) + Arrays.hashCode(this.mNextTracks)) * 31) + Arrays.hashCode(this.mPrevTracks);
    }

    public PlayerTrack[] nextTracks() {
        return this.mNextTracks;
    }

    public PlayerTrack[] prevTracks() {
        return this.mPrevTracks;
    }

    public String revision() {
        return this.mRevision;
    }

    public PlayerTrack track() {
        return this.mTrack;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mRevision);
        gf0.v(parcel, this.mTrack, 0);
        parcel.writeTypedArray(this.mNextTracks, 0);
        parcel.writeTypedArray(this.mPrevTracks, 0);
    }

    protected PlayerQueue(Parcel parcel) {
        this.mRevision = parcel.readString();
        Parcelable.Creator<PlayerTrack> creator = PlayerTrack.CREATOR;
        this.mTrack = (PlayerTrack) gf0.n(parcel, creator);
        this.mNextTracks = (PlayerTrack[]) parcel.createTypedArray(creator);
        this.mPrevTracks = (PlayerTrack[]) parcel.createTypedArray(creator);
    }
}
