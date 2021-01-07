package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: z76  reason: default package */
final class z76 implements y76 {
    private final InteractionLogger a;
    private final yj6 b;
    private final ere c;

    public z76(InteractionLogger interactionLogger, yj6 yj6, ere ere) {
        this.a = interactionLogger;
        this.b = yj6;
        this.c = ere;
    }

    @Override // defpackage.y76
    public void a(String str, boolean z) {
        this.a.a(str, "download-toggle-header", 0, InteractionLogger.InteractionType.HIT, z ? "offline-enable" : "offline-disable");
        if (z) {
            this.c.a(this.b.get().f().a(str));
        } else {
            this.c.a(this.b.get().f().b(str));
        }
    }

    @Override // defpackage.y76
    public String b(String str, String str2) {
        this.a.a(str, "download-toggle-header", 0, InteractionLogger.InteractionType.HIT, "go-to-settings");
        nqe c2 = this.b.get().f().c(str2);
        this.c.a(c2);
        return c2.b();
    }
}
