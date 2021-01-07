package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: qh6  reason: default package */
final class qh6 implements ph6, kh6 {
    private final ImpressionLogger a;
    private final InteractionLogger b;
    private final yj6 c;
    private final ere d;

    public qh6(ImpressionLogger impressionLogger, InteractionLogger interactionLogger, yj6 yj6, ere ere) {
        this.a = impressionLogger;
        this.b = interactionLogger;
        this.c = yj6;
        this.d = ere;
    }

    @Override // defpackage.kh6
    public void a(String str, int i) {
        this.d.a(this.c.get().k().b(Integer.valueOf(i), str).j());
        this.a.a(str, "item-list", i, ImpressionLogger.ImpressionType.ITEM, ImpressionLogger.RenderType.LIST);
    }

    @Override // defpackage.ph6
    public void b(String str, int i, boolean z) {
        this.b.a(str, "item-list", i, InteractionLogger.InteractionType.HIT, "item-download-clicked");
        if (z) {
            this.d.a(this.c.get().k().b(Integer.valueOf(i), str).e().a(str));
        } else {
            this.d.a(this.c.get().k().b(Integer.valueOf(i), str).e().b(str));
        }
    }

    @Override // defpackage.ph6
    public String c(String str, int i, String str2) {
        nqe a2 = this.c.get().k().b(Integer.valueOf(i), str).l().a(str2);
        this.d.a(a2);
        return a2.b();
    }

    @Override // defpackage.ph6
    public String d(String str, int i) {
        this.b.a(str, "item-list", i, InteractionLogger.InteractionType.HIT, "item-play-paused-clicked");
        nqe a2 = this.c.get().k().b(Integer.valueOf(i), str).k().a(str);
        this.d.a(a2);
        return a2.b();
    }

    @Override // defpackage.ph6
    public void e(String str, int i, boolean z) {
        if (z) {
            this.d.a(this.c.get().k().b(Integer.valueOf(i), str).b().b(ViewUris.T0.toString()));
        } else {
            this.d.a(this.c.get().k().b(Integer.valueOf(i), str).b().a(str));
        }
    }

    @Override // defpackage.ph6
    public String f(String str, int i) {
        nqe i2 = this.c.get().k().b(Integer.valueOf(i), str).i(str);
        this.d.a(i2);
        return i2.b();
    }

    @Override // defpackage.ph6
    public void g() {
        this.d.a(this.c.get().k().d().b());
    }

    @Override // defpackage.ph6
    public void h(String str, int i) {
        this.b.a(str, "item-list", i, InteractionLogger.InteractionType.HIT, "item-context-menu-clicked");
        this.d.a(this.c.get().k().b(Integer.valueOf(i), str).d().a());
    }

    @Override // defpackage.ph6
    public void i(String str, int i, boolean z) {
        this.b.a(str, "item-list", i, InteractionLogger.InteractionType.HIT, z ? "like-disable" : "like-enable");
        if (z) {
            this.d.a(this.c.get().k().b(Integer.valueOf(i), str).g().b(str));
        } else {
            this.d.a(this.c.get().k().b(Integer.valueOf(i), str).g().a(str));
        }
    }

    @Override // defpackage.ph6
    public String j(String str, int i, boolean z) {
        nqe nqe;
        this.b.a(str, "item-list", i, InteractionLogger.InteractionType.HIT, z ? "ban-disable" : "ban-enable");
        if (z) {
            nqe = this.c.get().k().b(Integer.valueOf(i), str).c().b(str);
        } else {
            nqe = this.c.get().k().b(Integer.valueOf(i), str).c().a(str);
        }
        this.d.a(nqe);
        return nqe.b();
    }

    @Override // defpackage.ph6
    public String k(String str, int i) {
        this.b.a(str, "item-list", i, InteractionLogger.InteractionType.HIT, "item-clicked");
        nqe h = this.c.get().k().b(Integer.valueOf(i), str).h(str);
        this.d.a(h);
        return h.b();
    }

    @Override // defpackage.ph6
    public void l(String str, int i) {
        this.b.a(str, "item-list", i, InteractionLogger.InteractionType.HIT, "education-footer-clicked");
        this.d.a(this.c.get().k().b(Integer.valueOf(i), str).f().a());
    }

    @Override // defpackage.ph6
    public void m() {
        this.d.a(this.c.get().k().d().c().a());
    }

    @Override // defpackage.ph6
    public void n() {
        this.b.a(null, "item-list", 0, InteractionLogger.InteractionType.HIT, "education-row-dismissed");
        this.d.a(this.c.get().k().c().a());
    }
}
