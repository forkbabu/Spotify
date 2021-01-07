package com.spotify.music.features.playlistentity.header;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.ubi.interactions.InteractionAction;
import com.spotify.player.model.ContextTrack;

final class p0 implements o0 {
    private final InteractionLogger a;
    private final yj6 b;
    private final ere c;

    public p0(InteractionLogger interactionLogger, yj6 yj6, ere ere) {
        this.a = interactionLogger;
        this.b = yj6;
        this.c = ere;
    }

    @Override // com.spotify.music.features.playlistentity.header.o0
    public String a(String str) {
        this.a.a(str, "play-button", 0, InteractionLogger.InteractionType.HIT, ContextTrack.TrackAction.PAUSE);
        nqe a2 = this.b.get().l().a(str);
        this.c.a(a2);
        return a2.b();
    }

    @Override // com.spotify.music.features.playlistentity.header.o0
    public String b(String str) {
        this.a.a(str, "play-button", 0, InteractionLogger.InteractionType.HIT, "play");
        nqe b2 = this.b.get().l().b(str);
        this.c.a(b2);
        return b2.b();
    }

    @Override // com.spotify.music.features.playlistentity.header.o0
    public void c(String str, boolean z) {
        this.a.b(str, "header", 0, InteractionLogger.InteractionType.HIT, z ? "like-disable" : "like-enable", z ? InteractionAction.UNLIKE : InteractionAction.LIKE);
        if (z) {
            this.c.a(this.b.get().j().d().b(str));
        } else {
            this.c.a(this.b.get().j().d().a(str));
        }
    }

    @Override // com.spotify.music.features.playlistentity.header.o0
    public void d(String str) {
        this.a.a(str, "cover-art", 0, InteractionLogger.InteractionType.HIT, "cover-art-clicked");
        this.c.a(this.b.get().j().c().a());
    }

    @Override // com.spotify.music.features.playlistentity.header.o0
    public String e() {
        nqe a2 = this.b.get().j().b().a();
        this.c.a(a2);
        return a2.b();
    }

    @Override // com.spotify.music.features.playlistentity.header.o0
    public String f(String str, String str2) {
        this.a.a(str, "header-second-page", 0, InteractionLogger.InteractionType.HIT, "owner-clicked");
        nqe a2 = this.b.get().j().e().a(str2);
        this.c.a(a2);
        return a2.b();
    }
}
