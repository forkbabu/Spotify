package com.spotify.music.libs.search.hubs.component;

public enum SearchComponent implements q81 {
    EPISODE_ROW("search:podcastEpisodeRow", "row"),
    MUSIC_AND_TALK_ROW("search:musicAndTalkEpisodeRow", "row"),
    SHOW_ROW("search:podcastShowRow", "row"),
    TOPIC("search:topicRow", "row"),
    TRACK_WITH_LYRICS("search:trackWithLyrics", "row");
    
    private final String mCategory;
    private final String mId;

    private SearchComponent(String str, String str2) {
        this.mId = str;
        this.mCategory = str2;
    }

    @Override // defpackage.q81
    public String category() {
        return this.mCategory;
    }

    @Override // defpackage.q81
    public String id() {
        return this.mId;
    }
}
