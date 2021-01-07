package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: z86  reason: default package */
final class z86 implements fi9 {
    private final InteractionLogger a;
    private final yj6 b;
    private final ere c;

    public z86(InteractionLogger interactionLogger, yj6 yj6, ere ere) {
        this.a = interactionLogger;
        this.b = yj6;
        this.c = ere;
    }

    @Override // defpackage.fi9
    public void a() {
        this.a.a(null, "filter-and-sort-view", 0, InteractionLogger.InteractionType.HIT, "text-filter-changed");
        this.c.a(this.b.get().i().g().b());
    }

    @Override // defpackage.fi9
    public void b() {
        this.a.a(null, "filter-and-sort-view", 0, InteractionLogger.InteractionType.HIT, "text-filter-cleared");
        this.c.a(this.b.get().i().h().a());
    }

    @Override // defpackage.fi9
    public void c() {
        this.a.a(null, "filter-and-sort-view", 0, InteractionLogger.InteractionType.HIT, "sort-or-filter-button-clicked");
        this.c.a(this.b.get().i().e().a());
    }

    @Override // defpackage.fi9
    public void d(String str, int i, boolean z) {
        this.a.a(null, "filter-and-sort-view", i, InteractionLogger.InteractionType.HIT, "filter-state-changed");
        this.c.a(this.b.get().i().d().a());
    }

    @Override // defpackage.fi9
    public void e() {
        this.a.a(null, "filter-and-sort-view-menu", 0, InteractionLogger.InteractionType.HIT, "back-navigation");
        this.c.a(this.b.get().i().c().a());
    }

    @Override // defpackage.fi9
    public void f() {
        this.a.a(null, "filter-and-sort-view", 0, InteractionLogger.InteractionType.HIT, "text-filter-canceled");
        this.c.a(this.b.get().i().b().a());
    }

    @Override // defpackage.fi9
    public void g() {
        this.a.a(null, "filter-and-sort-view", 0, InteractionLogger.InteractionType.HIT, "filter-selected");
        this.c.a(this.b.get().i().g().a());
    }

    @Override // defpackage.fi9
    public void h(String str, int i) {
        this.a.a(null, "filter-and-sort-view", i, InteractionLogger.InteractionType.HIT, "sort-order-changed");
        this.c.a(this.b.get().i().f().a());
    }
}
