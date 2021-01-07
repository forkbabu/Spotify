package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.ubi.interactions.InteractionAction;
import com.spotify.ubi.specification.factories.s;

/* renamed from: m75  reason: default package */
public class m75 {
    private final InteractionLogger a;
    private final s b;
    private final ere c;

    public m75(InteractionLogger interactionLogger, s sVar, ere ere) {
        this.a = interactionLogger;
        this.b = sVar;
        this.c = ere;
    }

    private void a(String str, boolean z) {
        this.a.b(str, "follow-button", -1, InteractionLogger.InteractionType.HIT, z ? "follow" : "unfollow", z ? InteractionAction.FOLLOW : InteractionAction.UNFOLLOW);
    }

    public void b(String str) {
        this.c.a(this.b.c().b().b().a());
        this.a.a(str, "toolbar-menu", -1, InteractionLogger.InteractionType.HIT, "open_context_menu");
    }

    public void c(String str) {
        this.c.a(this.b.c().b().c().a(str));
        a(str, true);
    }

    public void d(String str) {
        this.c.a(this.b.c().b().c().b(str));
        a(str, false);
    }
}
