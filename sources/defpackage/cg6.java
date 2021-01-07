package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.player.model.ContextTrack;

/* renamed from: cg6  reason: default package */
final class cg6 implements bg6 {
    private final ere a;
    private final InteractionLogger b;
    private final yj6 c;

    cg6(InteractionLogger interactionLogger, yj6 yj6, ere ere) {
        this.a = ere;
        this.b = interactionLogger;
        this.c = yj6;
    }

    @Override // defpackage.bg6
    public String a(String str) {
        this.b.a(str, "play-button", 0, InteractionLogger.InteractionType.HIT, ContextTrack.TrackAction.PAUSE);
        nqe a2 = this.c.get().l().a(str);
        this.a.a(a2);
        return a2.b();
    }

    @Override // defpackage.bg6
    public String b(String str) {
        this.b.a(str, "play-button", 0, InteractionLogger.InteractionType.HIT, "play");
        nqe b2 = this.c.get().l().b(str);
        this.a.a(b2);
        return b2.b();
    }
}
