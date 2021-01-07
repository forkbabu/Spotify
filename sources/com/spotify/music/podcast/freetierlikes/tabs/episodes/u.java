package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.spotify.music.podcast.freetierlikes.tabs.k;
import com.spotify.playlist.models.Episode;
import defpackage.rfc;
import defpackage.wgc;

public class u implements k {
    private final EpisodeTypeViewSelector a;
    private final fkc b;

    public u(EpisodeTypeViewSelector episodeTypeViewSelector, fkc fkc) {
        this.a = episodeTypeViewSelector;
        this.b = fkc;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.k
    public dsc a(Episode episode, Episode[] episodeArr, int i, boolean z) {
        int ordinal = this.a.a(episode).ordinal();
        if (ordinal == 0) {
            rfc.a aVar = new rfc.a();
            aVar.f(episode);
            return aVar;
        } else if (ordinal == 1) {
            wgc.a aVar2 = new wgc.a();
            aVar2.j(episode);
            aVar2.k(episodeArr);
            aVar2.l(b(episode));
            aVar2.i(z);
            return aVar2;
        } else if (ordinal != 2) {
            return null;
        } else {
            return this.b.a(episode, episodeArr, i, b(episode), z);
        }
    }

    public String b(Episode episode) {
        int ordinal = this.a.a(episode).ordinal();
        if (ordinal != 1) {
            return ordinal != 2 ? "" : "unplayed";
        }
        return "unfinished";
    }
}
