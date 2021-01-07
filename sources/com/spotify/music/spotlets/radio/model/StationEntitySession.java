package com.spotify.music.spotlets.radio.model;

import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = StationEntitySession_Deserializer.class)
public class StationEntitySession implements JacksonModel {
    private int mIndex;
    private long mLastUpdateTime;
    private RadioStationModel mRadioStationModel;

    @JsonCreator
    public StationEntitySession(@JsonProperty("radioStationModel") RadioStationModel radioStationModel, @JsonProperty("index") int i, @JsonProperty("lastUpdateTime") long j) {
        radioStationModel.getClass();
        this.mRadioStationModel = radioStationModel;
        this.mIndex = i;
        this.mLastUpdateTime = j;
    }

    @JsonIgnore
    public PlayerTrack getCurrentTrack() {
        int i = this.mIndex;
        if (i >= 0) {
            PlayerTrack[] playerTrackArr = this.mRadioStationModel.tracks;
            if (i < playerTrackArr.length) {
                return playerTrackArr[i];
            }
        }
        return null;
    }

    @JsonProperty("index")
    public int getIndex() {
        return this.mIndex;
    }

    @JsonProperty("lastUpdateTime")
    public long getLastUpdateTime() {
        return this.mLastUpdateTime;
    }

    @JsonProperty("radioStationModel")
    public RadioStationModel getRadioStationModel() {
        return this.mRadioStationModel;
    }

    public void updateFollowing(boolean z) {
        RadioStationModel radioStationModel = this.mRadioStationModel;
        int i = agd.b;
        if (radioStationModel.explicitSave != z) {
            radioStationModel = new RadioStationModel(radioStationModel.uri, radioStationModel.title, radioStationModel.titleUri, radioStationModel.imageUri, radioStationModel.playlistUri, radioStationModel.subtitle, radioStationModel.subtitleUri, radioStationModel.seeds, radioStationModel.relatedArtists, radioStationModel.tracks, radioStationModel.nextPageUrl, z);
        }
        this.mRadioStationModel = radioStationModel;
    }

    public void updateStationModel(RadioStationModel radioStationModel) {
        this.mRadioStationModel = radioStationModel;
        this.mLastUpdateTime = System.currentTimeMillis();
    }

    public void updateTracks(LegacyPlayerState legacyPlayerState) {
        if (TextUtils.equals(this.mRadioStationModel.getPlayerContextUri(), legacyPlayerState.entityUri())) {
            PlayerTrack currentTrack = getCurrentTrack();
            PlayerTrack track = legacyPlayerState.track();
            if (track == null) {
                return;
            }
            if (currentTrack == null || !TextUtils.equals(currentTrack.uid(), track.uid())) {
                PlayerTrack[] reverse = legacyPlayerState.reverse();
                PlayerTrack[] future = legacyPlayerState.future();
                PlayerTrack[] playerTrackArr = new PlayerTrack[(legacyPlayerState.reverse().length + legacyPlayerState.future().length + 1)];
                System.arraycopy(reverse, 0, playerTrackArr, 0, reverse.length);
                playerTrackArr[reverse.length] = track;
                System.arraycopy(future, 0, playerTrackArr, reverse.length + 1, future.length);
                String j = agd.j(this.mRadioStationModel.nextPageUrl, playerTrackArr);
                RadioStationModel radioStationModel = this.mRadioStationModel;
                this.mRadioStationModel = new RadioStationModel(radioStationModel.uri, radioStationModel.title, radioStationModel.titleUri, radioStationModel.imageUri, radioStationModel.playlistUri, radioStationModel.subtitle, radioStationModel.subtitleUri, radioStationModel.seeds, radioStationModel.relatedArtists, playerTrackArr, j, radioStationModel.explicitSave);
                this.mIndex = reverse.length;
                this.mLastUpdateTime = System.currentTimeMillis();
            }
        }
    }
}
