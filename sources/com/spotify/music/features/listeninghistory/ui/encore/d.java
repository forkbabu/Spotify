package com.spotify.music.features.listeninghistory.ui.encore;

import androidx.lifecycle.n;
import com.spotify.encore.consumer.components.listeninghistory.api.episoderow.EpisodeRowListeningHistory;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class d implements fjf<EncoreEpisodeRowComponent> {
    private final wlf<n> a;
    private final wlf<cqe> b;
    private final wlf<y> c;
    private final wlf<y> d;
    private final wlf<EpisodeRowListeningHistory> e;
    private final wlf<vd3> f;
    private final wlf<g<PlayerState>> g;

    public d(wlf<n> wlf, wlf<cqe> wlf2, wlf<y> wlf3, wlf<y> wlf4, wlf<EpisodeRowListeningHistory> wlf5, wlf<vd3> wlf6, wlf<g<PlayerState>> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new EncoreEpisodeRowComponent(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e, this.f.get(), this.g.get());
    }
}
