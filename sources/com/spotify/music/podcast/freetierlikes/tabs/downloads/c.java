package com.spotify.music.podcast.freetierlikes.tabs.downloads;

import com.spotify.music.podcast.freetierlikes.tabs.episodes.EpisodeTypeViewSelector;
import com.spotify.music.podcast.freetierlikes.tabs.k;
import com.spotify.playlist.models.Episode;

public class c implements k {
    private final EpisodeTypeViewSelector a;
    private final fkc b;

    public c(EpisodeTypeViewSelector episodeTypeViewSelector, fkc fkc) {
        this.a = episodeTypeViewSelector;
        this.b = fkc;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.k
    public dsc a(Episode episode, Episode[] episodeArr, int i, boolean z) {
        int ordinal = this.a.a(episode).ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return this.b.a(episode, episodeArr, i, "", z);
        }
        return null;
    }
}
