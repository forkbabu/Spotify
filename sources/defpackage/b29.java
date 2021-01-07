package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.q4;

/* renamed from: b29  reason: default package */
public class b29 {
    private final InteractionLogger a;
    private final ere b;
    private final q4 c;

    public b29(InteractionLogger interactionLogger, ere ere, q4 q4Var) {
        this.a = interactionLogger;
        this.b = ere;
        this.c = q4Var;
    }

    public void a(int i, String str) {
        this.a.a(str, "group-navigation", i, InteractionLogger.InteractionType.HIT, "group-selected");
        this.b.a(this.c.b().b().c().b(Integer.valueOf(i)).a(str));
    }

    public void b(String str) {
        this.b.a(this.c.c().b(str).a());
    }

    public void c() {
        this.b.a(this.c.b().b().b().a());
    }

    public void d(String str) {
        this.b.a(this.c.c().c(str));
    }

    public void e(int i, int i2, String str) {
        this.a.a(str, je.p0("tab-navigation-", i), i2, InteractionLogger.InteractionType.HIT, "tab-selected");
        this.b.a(this.c.b().c().b(Integer.valueOf(i)).b(Integer.valueOf(i2), str).a(str));
    }
}
