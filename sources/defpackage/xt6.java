package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.ubi.interactions.InteractionAction;

/* renamed from: xt6  reason: default package */
final class xt6 implements wt6 {
    private final ere a;
    private final InteractionLogger b;
    private final yj6 c;

    xt6(InteractionLogger interactionLogger, yj6 yj6, ere ere) {
        this.a = ere;
        this.b = interactionLogger;
        this.c = yj6;
    }

    @Override // defpackage.wt6
    public void A(String str, boolean z) {
        if (z) {
            this.a.a(this.c.get().n().d().b(str));
        } else {
            this.a.a(this.c.get().n().d().a(str));
        }
    }

    @Override // defpackage.wt6
    public void B() {
        this.b.a(null, "toolbar", 0, InteractionLogger.InteractionType.HIT, "find");
        this.a.a(this.c.get().n().c().i().a());
    }

    @Override // defpackage.wt6
    public String a(String str) {
        nqe a2 = this.c.get().l().a(str);
        this.a.a(a2);
        return a2.b();
    }

    @Override // defpackage.wt6
    public String b(String str) {
        nqe b2 = this.c.get().l().b(str);
        this.a.a(b2);
        return b2.b();
    }

    @Override // defpackage.wt6
    public void c() {
        this.b.a(null, "toolbar", 0, InteractionLogger.InteractionType.HIT, "back-navigation");
        this.a.a(this.c.get().n().b().a());
    }

    @Override // defpackage.wt6
    public void d() {
        this.a.a(this.c.get().n().c().l().a());
    }

    @Override // defpackage.wt6
    public void e(String str) {
        this.b.a(str, "delete-playlist-dialog", 0, InteractionLogger.InteractionType.HIT, "cancel");
        this.a.a(this.c.get().n().c().e().b().a());
    }

    @Override // defpackage.wt6
    public void f() {
        this.a.a(this.c.get().n().f().d().a());
    }

    @Override // defpackage.wt6
    public void g() {
        this.b.a(null, "toolbar", 0, InteractionLogger.InteractionType.HIT, "add-to-home-screen");
        this.a.a(this.c.get().n().c().c().a());
    }

    @Override // defpackage.wt6
    public void h(String str) {
        this.a.a(this.c.get().n().f().c().a(str));
    }

    @Override // defpackage.wt6
    public void i() {
        this.a.a(this.c.get().n().e().a());
    }

    @Override // defpackage.wt6
    public void j(String str, boolean z) {
        this.b.a(str, "download-toggle-toolbar-menu", 0, InteractionLogger.InteractionType.HIT, z ? "offline-enable" : "offline-disable");
        if (z) {
            this.a.a(this.c.get().n().c().g().a(str));
        } else {
            this.a.a(this.c.get().n().c().g().b(str));
        }
    }

    @Override // defpackage.wt6
    public void k(String str, boolean z) {
        this.b.a(str, "toolbar", 0, InteractionLogger.InteractionType.HIT, z ? "collaborative-disable" : "collaborative-enable");
        if (z) {
            this.a.a(this.c.get().n().c().d().b(str));
        } else {
            this.a.a(this.c.get().n().c().d().a(str));
        }
    }

    @Override // defpackage.wt6
    public void l() {
        this.b.a(null, "toolbar", 0, InteractionLogger.InteractionType.HIT, "go-to-playlist-radio");
        this.a.a(this.c.get().n().c().n().a());
    }

    @Override // defpackage.wt6
    public void m() {
        this.b.a(null, "toolbar", 0, InteractionLogger.InteractionType.HIT, "report-abuse");
        this.a.a(this.c.get().n().c().q().a());
    }

    @Override // defpackage.wt6
    public void n(String str) {
        this.b.a(str, "toolbar", 0, InteractionLogger.InteractionType.HIT, "rename-playlist");
        this.a.a(this.c.get().n().c().p().a());
    }

    @Override // defpackage.wt6
    public void o() {
        this.b.a(null, "toolbar", 0, InteractionLogger.InteractionType.HIT, "menu-clicked");
        this.a.a(this.c.get().n().c().k());
    }

    @Override // defpackage.wt6
    public void p() {
        this.b.a(null, "toolbar", 0, InteractionLogger.InteractionType.HIT, "share");
        this.a.a(this.c.get().n().c().r().a());
    }

    @Override // defpackage.wt6
    public void q(String str) {
        this.b.a(str, "toolbar", 0, InteractionLogger.InteractionType.HIT, "delete-playlist");
        this.a.a(this.c.get().n().c().e().d());
    }

    @Override // defpackage.wt6
    public void r(String str, boolean z) {
        this.b.b(str, "toolbar", 0, InteractionLogger.InteractionType.HIT, z ? "like-disable" : "like-enable", z ? InteractionAction.UNLIKE : InteractionAction.LIKE);
        if (z) {
            this.a.a(this.c.get().n().c().j().b(str));
        } else {
            this.a.a(this.c.get().n().c().j().a(str));
        }
    }

    @Override // defpackage.wt6
    public void s(String str, boolean z) {
        this.b.a(str, "toolbar", 0, InteractionLogger.InteractionType.HIT, z ? "published-disable" : "published-enable");
        if (z) {
            this.a.a(this.c.get().n().c().m().b(str));
        } else {
            this.a.a(this.c.get().n().c().m().a(str));
        }
    }

    @Override // defpackage.wt6
    public void t() {
        this.b.a(null, "toolbar", 0, InteractionLogger.InteractionType.HIT, "sort");
        this.a.a(this.c.get().n().c().s().a());
    }

    @Override // defpackage.wt6
    public void u() {
        this.a.a(this.c.get().n().c().o().a());
    }

    @Override // defpackage.wt6
    public void v(String str) {
        this.b.a(str, "delete-playlist-dialog", 0, InteractionLogger.InteractionType.HIT, "delete");
        this.a.a(this.c.get().n().c().e().c().a(str));
    }

    @Override // defpackage.wt6
    public void w() {
        this.a.a(this.c.get().n().c().f().a());
    }

    @Override // defpackage.wt6
    public void x() {
        this.a.a(this.c.get().n().f().b());
    }

    @Override // defpackage.wt6
    public void y(String str) {
        this.b.a(str, "toolbar", 0, InteractionLogger.InteractionType.HIT, "edit-playlist");
        this.a.a(this.c.get().n().c().h().a());
    }

    @Override // defpackage.wt6
    public void z(String str) {
        this.b.a(str, "toolbar", 0, InteractionLogger.InteractionType.HIT, "add-songs-to-playlist");
        this.a.a(this.c.get().n().c().b().a());
    }
}
