package com.spotify.music.podcast.freetierlikes.tabs.followed;

import com.spotify.playlist.models.Show;

public class t implements s {
    private final com.spotify.music.navigation.t a;

    public t(com.spotify.music.navigation.t tVar) {
        this.a = tVar;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.s
    public void a(Show show) {
        this.a.d(show.getUri());
    }
}
