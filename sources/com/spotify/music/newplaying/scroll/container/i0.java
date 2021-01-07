package com.spotify.music.newplaying.scroll.container;

import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.a;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import java.util.Map;

public final class i0 implements fjf<h0> {
    private final wlf<g<PlayerState>> a;
    private final wlf<wlb> b;
    private final wlf<g<com.spotify.music.connection.g>> c;
    private final wlf<Map<NowPlayingWidget.Type, a>> d;
    private final wlf<Map<NowPlayingWidget.Type, NowPlayingWidget>> e;

    public i0(wlf<g<PlayerState>> wlf, wlf<wlb> wlf2, wlf<g<com.spotify.music.connection.g>> wlf3, wlf<Map<NowPlayingWidget.Type, a>> wlf4, wlf<Map<NowPlayingWidget.Type, NowPlayingWidget>> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static i0 a(wlf<g<PlayerState>> wlf, wlf<wlb> wlf2, wlf<g<com.spotify.music.connection.g>> wlf3, wlf<Map<NowPlayingWidget.Type, a>> wlf4, wlf<Map<NowPlayingWidget.Type, NowPlayingWidget>> wlf5) {
        return new i0(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h0(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
