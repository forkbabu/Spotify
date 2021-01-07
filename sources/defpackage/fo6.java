package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: fo6  reason: default package */
final class fo6 implements eo6 {
    private final InteractionLogger a;
    private final yj6 b;
    private final ere c;

    fo6(InteractionLogger interactionLogger, yj6 yj6, ere ere) {
        this.a = interactionLogger;
        this.b = yj6;
        this.c = ere;
    }

    @Override // defpackage.eo6
    public String a(String str, int i) {
        this.a.a(str, "auto-play", i, InteractionLogger.InteractionType.DEFERRED, "auto-play");
        nqe a2 = this.b.get().e().a(str);
        this.c.a(a2);
        return a2.b();
    }

    @Override // defpackage.eo6
    public String b() {
        this.a.a(null, "auto-play", 0, InteractionLogger.InteractionType.DEFERRED, "auto-play");
        nqe a2 = this.b.get().e().a("");
        this.c.a(a2);
        return a2.b();
    }
}
