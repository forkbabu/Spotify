package com.spotify.music.features.playlistentity.empty;

import com.spotify.music.loggers.InteractionLogger;

final class g implements f {
    private final InteractionLogger a;
    private final yj6 b;
    private final ere c;

    g(InteractionLogger interactionLogger, yj6 yj6, ere ere) {
        this.a = interactionLogger;
        this.b = yj6;
        this.c = ere;
    }

    @Override // com.spotify.music.features.playlistentity.empty.f
    public void a() {
        this.a.a(null, "add-songs-button-in-empty-view", 0, InteractionLogger.InteractionType.HIT, "add-songs-clicked");
        this.c.a(this.b.get().h().b().a());
    }

    @Override // com.spotify.music.features.playlistentity.empty.f
    public void b() {
        this.c.a(this.b.get().h().e());
    }

    @Override // com.spotify.music.features.playlistentity.empty.f
    public String c(String str) {
        this.a.a(null, "home-button", 0, InteractionLogger.InteractionType.HIT, "home-clicked");
        nqe a2 = this.b.get().h().d().a(str);
        this.c.a(a2);
        return a2.b();
    }
}
