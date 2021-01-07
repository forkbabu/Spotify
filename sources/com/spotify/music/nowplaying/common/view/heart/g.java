package com.spotify.music.nowplaying.common.view.heart;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.nowplaying.common.view.heart.i;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;

public class g implements i.a {
    private final io.reactivex.g<PlayerState> a;
    private final t8a b;
    private final brd c;
    private final f d;
    private final p e = new p();
    private PlayerState f;
    private i g;

    public g(io.reactivex.g<PlayerState> gVar, t8a t8a, brd brd, f fVar) {
        this.a = gVar;
        this.b = t8a;
        this.c = brd;
        this.d = fVar;
    }

    public static void b(g gVar, PlayerState playerState) {
        gVar.f = playerState;
        ImmutableMap<String, String> metadata = playerState.track().get().metadata();
        boolean parseBoolean = Boolean.parseBoolean(metadata.get("collection.can_add"));
        boolean parseBoolean2 = Boolean.parseBoolean(metadata.get("collection.in_collection"));
        gVar.g.setEnabled(parseBoolean);
        gVar.g.setHeartState(parseBoolean2);
    }

    @Override // com.spotify.music.nowplaying.common.view.heart.i.a
    public void a() {
        ContextTrack contextTrack = this.f.track().get();
        String uri = contextTrack.uri();
        String contextUri = this.f.contextUri();
        boolean parseBoolean = Boolean.parseBoolean(contextTrack.metadata().get("collection.in_collection"));
        this.c.x(uri, parseBoolean);
        if (parseBoolean) {
            this.b.f(uri, this.d.b());
        } else {
            this.b.a(uri, contextUri, this.d.b());
        }
    }

    public void c(i iVar) {
        iVar.getClass();
        this.g = iVar;
        iVar.setListener(this);
        this.g.b(this.d.a());
        this.e.b(this.a.subscribe(new d(this)));
    }

    public void d() {
        this.g.setListener(null);
        this.e.a();
    }
}
