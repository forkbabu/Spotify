package com.spotify.music.cyoa.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CyoaGamesResponse implements JacksonModel {
    private static final String JSON_KEY_ALL_GAMES = "allGames";
    private static final String JSON_KEY_ONGOING_GAMES = "ongoingGames";
    private final List<CyoaGame> mAllGames;
    private final List<CyoaGame> mOngoingGames;

    @JsonCreator
    public CyoaGamesResponse(@JsonProperty("allGames") List<CyoaGame> list, @JsonProperty("ongoingGames") List<CyoaGame> list2) {
        this.mAllGames = list;
        this.mOngoingGames = list2;
    }

    public static CyoaGamesResponse empty() {
        return new CyoaGamesResponse(ImmutableList.of(), ImmutableList.of());
    }

    public List<CyoaGame> getAllGames() {
        List<CyoaGame> list = this.mAllGames;
        return list == null ? Collections.emptyList() : list;
    }

    public List<CyoaGame> getOngoingGames() {
        List<CyoaGame> list = this.mOngoingGames;
        return list == null ? Collections.emptyList() : list;
    }
}
