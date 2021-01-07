package com.spotify.music.features.playlistentity.trackcloud;

import com.spotify.music.loggers.InteractionLogger;

final class t implements s {
    private final InteractionLogger a;
    private final yj6 b;
    private final ere c;

    t(InteractionLogger interactionLogger, yj6 yj6, ere ere) {
        this.a = interactionLogger;
        this.b = yj6;
        this.c = ere;
    }

    @Override // com.spotify.music.features.playlistentity.trackcloud.s
    public void a() {
        this.a.a(null, "seeds-track-cloud", 0, InteractionLogger.InteractionType.HIT, "track-cloud-clicked");
        this.c.a(this.b.get().o().a());
    }
}
