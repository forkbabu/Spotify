package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.video.model.PlayerError;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayOptionsSkipTo implements JacksonModel, Parcelable {
    public static final Parcelable.Creator<PlayOptionsSkipTo> CREATOR = new Parcelable.Creator<PlayOptionsSkipTo>() {
        /* class com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public PlayOptionsSkipTo createFromParcel(Parcel parcel) {
            return new PlayOptionsSkipTo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlayOptionsSkipTo[] newArray(int i) {
            return new PlayOptionsSkipTo[i];
        }
    };
    @JsonProperty("page_index")
    private final Integer mPageIndex;
    @JsonProperty("page_url")
    private final String mPageUrl;
    @JsonProperty("track_index")
    private final int mTrackIndex;
    @JsonProperty("track_uid")
    private final String mTrackUid;
    @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY)
    private final String mTrackUri;

    @JsonCreator
    public PlayOptionsSkipTo(@JsonProperty("page_url") String str, @JsonProperty("page_index") Integer num, @JsonProperty("track_uid") String str2, @JsonProperty("track_uri") String str3, @JsonProperty("track_index") int i) {
        this.mPageUrl = str;
        this.mPageIndex = num;
        this.mTrackUid = str2;
        this.mTrackUri = str3;
        this.mTrackIndex = i;
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
        if (!(obj instanceof PlayOptionsSkipTo)) {
            return false;
        }
        PlayOptionsSkipTo playOptionsSkipTo = (PlayOptionsSkipTo) obj;
        return rw.equal(this.mPageUrl, playOptionsSkipTo.mPageUrl) && rw.equal(this.mPageIndex, playOptionsSkipTo.mPageIndex) && rw.equal(this.mTrackUid, playOptionsSkipTo.mTrackUid) && rw.equal(this.mTrackUri, playOptionsSkipTo.mTrackUri) && this.mTrackIndex == playOptionsSkipTo.mTrackIndex;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.mPageUrl, this.mPageIndex, this.mTrackUid, this.mTrackUri, Integer.valueOf(this.mTrackIndex)});
    }

    @JsonProperty("page_index")
    public Integer pageIndex() {
        return this.mPageIndex;
    }

    @JsonProperty("page_url")
    public String pageUrl() {
        return this.mPageUrl;
    }

    @JsonProperty("track_index")
    public int trackIndex() {
        return this.mTrackIndex;
    }

    @JsonProperty("track_uid")
    public String trackUid() {
        return this.mTrackUid;
    }

    @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY)
    public String trackUri() {
        return this.mTrackUri;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mPageUrl);
        parcel.writeSerializable(this.mPageIndex);
        parcel.writeString(this.mTrackUid);
        parcel.writeString(this.mTrackUri);
        parcel.writeInt(this.mTrackIndex);
    }

    protected PlayOptionsSkipTo(Parcel parcel) {
        this.mPageUrl = parcel.readString();
        this.mPageIndex = (Integer) parcel.readSerializable();
        this.mTrackUid = parcel.readString();
        this.mTrackUri = parcel.readString();
        this.mTrackIndex = parcel.readInt();
    }
}
