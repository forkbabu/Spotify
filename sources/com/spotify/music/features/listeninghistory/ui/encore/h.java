package com.spotify.music.features.listeninghistory.ui.encore;

import androidx.lifecycle.n;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class h implements fjf<EncoreTrackRowComponent> {
    private final wlf<y> a;
    private final wlf<n> b;
    private final wlf<TrackRow> c;
    private final wlf<vd3> d;
    private final wlf<g<PlayerState>> e;

    public h(wlf<y> wlf, wlf<n> wlf2, wlf<TrackRow> wlf3, wlf<vd3> wlf4, wlf<g<PlayerState>> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new EncoreTrackRowComponent(this.a.get(), this.b.get(), this.c, this.d.get(), this.e.get());
    }
}
