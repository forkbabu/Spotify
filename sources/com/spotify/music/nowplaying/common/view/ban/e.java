package com.spotify.music.nowplaying.common.view.ban;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.nowplaying.common.view.ban.g;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;

public class e implements g.a {
    private final io.reactivex.g<PlayerState> a;
    private final s7a b;
    private final hqd c;
    private final d d;
    private final p e = new p();
    private PlayerState f;
    private g g;

    public e(io.reactivex.g<PlayerState> gVar, s7a s7a, hqd hqd, d dVar) {
        this.a = gVar;
        this.b = s7a;
        this.c = hqd;
        this.d = dVar;
    }

    public static void a(e eVar, PlayerState playerState) {
        eVar.f = playerState;
        ImmutableMap<String, String> metadata = playerState.track().get().metadata();
        boolean parseBoolean = Boolean.parseBoolean(metadata.get("collection.is_banned"));
        eVar.g.setEnabled(Boolean.parseBoolean(metadata.get("collection.can_ban")));
        eVar.g.setBanState(parseBoolean);
    }

    public void b() {
        ContextTrack contextTrack = this.f.track().get();
        String uri = contextTrack.uri();
        String contextUri = this.f.contextUri();
        boolean parseBoolean = Boolean.parseBoolean(contextTrack.metadata().get("collection.is_banned"));
        this.c.c(uri, parseBoolean);
        if (parseBoolean) {
            this.b.b(uri, contextUri, false);
        } else {
            this.b.a(uri, contextUri, this.d.a());
        }
    }

    public void c(g gVar) {
        gVar.getClass();
        this.g = gVar;
        gVar.setListener(this);
        this.e.b(this.a.subscribe(new b(this)));
    }

    public void d() {
        this.g.setListener(null);
        this.e.a();
    }
}
