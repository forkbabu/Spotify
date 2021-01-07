package com.spotify.music.cyoa.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CyoaGameStatus implements JacksonModel {
    private static final String JSON_KEY_EPISODE_DURATION = "episode_duration";
    private static final String JSON_KEY_EPISODE_ID = "episode_id";
    private static final String JSON_KEY_GAME_ID = "game_id";
    private static final String JSON_KEY_OPTIONS = "options";
    private static final String JSON_KEY_TEXT = "text";
    private final String mAdditionalText;
    private final Long mEpisodeDuration;
    private final String mEpisodeId;
    private final int mGameId;
    private final List<CyoaGameOption> mOptions;

    @JsonCreator
    public CyoaGameStatus(@JsonProperty("game_id") int i, @JsonProperty("episode_id") String str, @JsonProperty("episode_duration") long j, @JsonProperty("options") List<CyoaGameOption> list, @JsonProperty("text") String str2) {
        this.mGameId = i;
        this.mEpisodeId = str;
        this.mEpisodeDuration = Long.valueOf(j);
        this.mOptions = list;
        this.mAdditionalText = str2;
    }

    public String getAdditionalText() {
        return this.mAdditionalText;
    }

    public long getEpisodeDuration() {
        return this.mEpisodeDuration.longValue();
    }

    public String getEpisodeId() {
        return this.mEpisodeId;
    }

    public int getGameId() {
        return this.mGameId;
    }

    public List<CyoaGameOption> getOptions() {
        return this.mOptions;
    }
}
