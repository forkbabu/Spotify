package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.ubi.interactions.InteractionAction;
import com.spotify.player.model.ContextTrack;

/* renamed from: ca6  reason: default package */
final class ca6 implements ba6 {
    private final InteractionLogger a;
    private final yj6 b;
    private final ere c;

    ca6(InteractionLogger interactionLogger, yj6 yj6, ere ere) {
        this.a = interactionLogger;
        this.b = yj6;
        this.c = ere;
    }

    @Override // defpackage.ba6
    public String a(String str) {
        this.a.a(str, "play-button", 0, InteractionLogger.InteractionType.HIT, ContextTrack.TrackAction.PAUSE);
        nqe a2 = this.b.get().l().a(str);
        this.c.a(a2);
        return a2.b();
    }

    @Override // defpackage.ba6
    public String b(String str) {
        this.a.a(str, "play-button", 0, InteractionLogger.InteractionType.HIT, "play");
        nqe b2 = this.b.get().l().b(str);
        this.c.a(b2);
        return b2.b();
    }

    @Override // defpackage.ba6
    public void c(String str, boolean z) {
        this.a.b(str, "header", 0, InteractionLogger.InteractionType.HIT, z ? "like-disable" : "like-enable", z ? InteractionAction.UNLIKE : InteractionAction.LIKE);
        if (z) {
            this.c.a(this.b.get().j().d().b(str));
        } else {
            this.c.a(this.b.get().j().d().a(str));
        }
    }
}
