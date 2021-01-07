package com.spotify.music.features.playlistentity.story.header;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.ubi.interactions.InteractionAction;
import com.spotify.player.model.ContextTrack;
import com.spotify.ubi.specification.factories.o2;

public final class i0 implements h0 {
    private final ImpressionLogger a;
    private final InteractionLogger b;
    private final yj6 c;
    private final o2 d = new o2();
    private final ere e;

    public i0(ImpressionLogger impressionLogger, InteractionLogger interactionLogger, yj6 yj6, ere ere) {
        this.a = impressionLogger;
        this.b = interactionLogger;
        this.c = yj6;
        this.e = ere;
    }

    @Override // com.spotify.music.features.playlistentity.story.header.h0
    public String a(String str) {
        this.b.a(str, "play-button", 0, InteractionLogger.InteractionType.HIT, ContextTrack.TrackAction.PAUSE);
        nqe a2 = this.c.get().l().a(str);
        this.e.a(a2);
        return a2.b();
    }

    @Override // com.spotify.music.features.playlistentity.story.header.h0
    public String b(String str) {
        this.b.a(str, "play-button", 0, InteractionLogger.InteractionType.HIT, "play");
        nqe b2 = this.c.get().l().b(str);
        this.e.a(b2);
        return b2.b();
    }

    @Override // com.spotify.music.features.playlistentity.story.header.h0
    public void c(String str, boolean z) {
        this.b.b(str, "header", 0, InteractionLogger.InteractionType.HIT, z ? "like-disable" : "like-enable", z ? InteractionAction.UNLIKE : InteractionAction.LIKE);
        if (z) {
            this.e.a(this.c.get().j().d().b(str));
        } else {
            this.e.a(this.c.get().j().d().a(str));
        }
    }

    @Override // com.spotify.music.features.playlistentity.story.header.h0
    public void d(String str) {
        this.a.a("header-view-story-shown", str, -1, ImpressionLogger.ImpressionType.ITEM, ImpressionLogger.RenderType.PAGE);
        this.e.a(this.d.b(str).a());
    }
}
