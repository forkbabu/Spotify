package defpackage;

import com.spotify.mobile.android.util.l0;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.v3;
import com.spotify.ubi.specification.factories.x3;
import com.spotify.ubi.specification.factories.y3;
import kotlin.jvm.internal.h;

/* renamed from: z9d  reason: default package */
public final class z9d implements x9d {
    private final v3 a = new v3();
    private final x3 b = new x3();
    private final y3 c = new y3();
    private final ImpressionLogger d;
    private final InteractionLogger e;
    private final ere f;
    private final y9d g;

    public z9d(ImpressionLogger impressionLogger, InteractionLogger interactionLogger, ere ere, y9d y9d) {
        h.e(impressionLogger, "impressionLogger");
        h.e(interactionLogger, "interactionLogger");
        h.e(ere, "ubiLogger");
        h.e(y9d, "currentJoinUriProvider");
        this.d = impressionLogger;
        this.e = interactionLogger;
        this.f = ere;
        this.g = y9d;
    }

    static void A(z9d z9d, String str, String str2, int i, int i2) {
        z9d.e.e("", null, "social-listening", str2, (i2 & 4) != 0 ? -1 : i, InteractionLogger.InteractionType.HIT, str);
    }

    static void z(z9d z9d, String str, int i, int i2) {
        z9d.e.e("", null, "social-listening", "card-view", (i2 & 2) != 0 ? -1 : i, InteractionLogger.InteractionType.HIT, str);
    }

    @Override // defpackage.x9d
    public void a() {
        A(this, "confirm-end-session", "confirm-end-session-dialog", 0, 4);
        this.f.a(this.a.b().c(this.g.a()).a());
    }

    @Override // defpackage.x9d
    public void b(String str) {
        h.e(str, "sessionToJoinUri");
        this.f.a(this.a.k().e(str).a());
    }

    @Override // defpackage.x9d
    public void c(String str) {
        h.e(str, "sessionNotToJoinUri");
        this.f.a(this.a.c().c(str).a());
    }

    @Override // defpackage.x9d
    public void d() {
        z(this, "leave-session", 0, 2);
        this.f.a(this.a.j(this.g.a()).a());
    }

    @Override // defpackage.x9d
    public void e() {
        this.f.a(this.b.b(this.g.a()).a("share-flow"));
    }

    @Override // defpackage.x9d
    public void f() {
        z(this, "end-session", 0, 2);
        this.f.a(this.a.f(this.g.a()).a());
    }

    @Override // defpackage.x9d
    public void g(String str) {
        h.e(str, "sessionNotToJoinUri");
        this.f.a(this.a.k().b(str).a());
    }

    @Override // defpackage.x9d
    public void h() {
        this.f.a(this.a.g().b());
    }

    @Override // defpackage.x9d
    public void i() {
        A(this, "cancel-leave-session", "confirm-leave-session-dialog", 0, 4);
        this.f.a(this.a.d().b(this.g.a()).a());
    }

    @Override // defpackage.x9d
    public void j(String str) {
        h.e(str, "sessionToJoinUri");
        this.f.a(this.a.k().c(str).a());
    }

    @Override // defpackage.x9d
    public void k() {
        A(this, "cancel-end-session", "confirm-end-session-dialog", 0, 4);
        this.f.a(this.a.b().b(this.g.a()).a());
    }

    @Override // defpackage.x9d
    public void l() {
        this.d.a(null, "participant-list", -1, ImpressionLogger.ImpressionType.ITEM, ImpressionLogger.RenderType.LIST);
    }

    @Override // defpackage.x9d
    public void m(String str) {
        h.e(str, "uri");
        this.f.a(this.c.b().c().a(str));
    }

    @Override // defpackage.x9d
    public void n() {
        this.f.a(this.b.d().b(this.g.a()).a("share-flow"));
    }

    @Override // defpackage.x9d
    public void o() {
        z(this, "try-again", 0, 2);
        this.f.a(this.a.g().c().a());
    }

    @Override // defpackage.x9d
    public void p() {
        this.f.a(this.a.m(this.g.a()).a("participantlist view"));
    }

    @Override // defpackage.x9d
    public void q(int i, String str) {
        h.e(str, "username");
        this.e.e("", null, "social-listening", "card-view", i, InteractionLogger.InteractionType.HIT, "navigate-to-profile");
        ere ere = this.f;
        x3.c.a b2 = this.b.c(this.g.a()).b(Integer.valueOf(i), l0.J(str).B());
        String B = l0.J(str).B();
        h.c(B);
        ere.a(b2.a(B));
    }

    @Override // defpackage.x9d
    public void r() {
        this.f.a(this.a.n(this.g.a()).a("participantlist view"));
    }

    @Override // defpackage.x9d
    public void s(String str) {
        h.e(str, "sessionToJoinUri");
        this.f.a(this.a.c().b(str).a("output mode selection dialog"));
    }

    @Override // defpackage.x9d
    public void t() {
        z(this, "navigate-to-participants", 0, 2);
        this.f.a(this.a.h(this.g.a()).a("participantlist view"));
    }

    @Override // defpackage.x9d
    public void u() {
        z(this, "scan-code", 0, 2);
        this.f.a(this.a.i().a());
    }

    @Override // defpackage.x9d
    public void v() {
        A(this, "confirm-leave-session", "confirm-leave-session-dialog", 0, 4);
        this.f.a(this.a.d().c(this.g.a()).a());
    }

    @Override // defpackage.x9d
    public void w(String str) {
        h.e(str, "sessionToJoinUri");
        this.f.a(this.a.k().d(str).a());
    }

    @Override // defpackage.x9d
    public void x() {
        this.f.a(this.c.b().b().a());
    }

    @Override // defpackage.x9d
    public void y(String str) {
        h.e(str, "uri");
        this.f.a(this.c.b().d().a(str));
    }
}
