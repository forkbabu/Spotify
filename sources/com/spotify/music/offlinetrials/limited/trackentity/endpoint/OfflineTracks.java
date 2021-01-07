package com.spotify.music.offlinetrials.limited.trackentity.endpoint;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class OfflineTracks implements JacksonModel {
    @JsonCreator
    public static OfflineTracks create(@JsonProperty("resources") List<OfflineTrack> list) {
        return new AutoValue_OfflineTracks(list);
    }

    public abstract List<OfflineTrack> getTracks();
}
