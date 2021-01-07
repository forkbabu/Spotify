package defpackage;

import androidx.fragment.app.Fragment;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.partnerapps.PartnerType;
import com.spotify.music.libs.partnerapps.api.c;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.i;
import com.spotify.music.navigation.t;
import io.reactivex.disposables.a;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: es5  reason: default package */
class es5 {
    private final hla a;
    private final c b;
    private final xr5 c;
    private final fla d;
    private final a e = new a();
    private final y f;
    private final vla g;
    private final t h;
    private final i i;
    private final boolean j;
    private zr5 k;
    private boolean l;
    private s<Integer> m;

    es5(hla hla, c cVar, fla fla, xr5 xr5, y yVar, vla vla, t tVar, i iVar, boolean z) {
        this.a = hla;
        this.b = cVar;
        this.c = xr5;
        this.d = fla;
        this.f = yVar;
        this.g = vla;
        this.h = tVar;
        this.i = iVar;
        this.j = z;
    }

    public static void c(es5 es5, ImmutableMap immutableMap) {
        boolean z;
        PartnerType partnerType = PartnerType.WAZE;
        PartnerType partnerType2 = PartnerType.GOOGLE_MAPS;
        zr5 zr5 = es5.k;
        zr5.getClass();
        UnmodifiableIterator it = immutableMap.values().iterator();
        while (true) {
            if (it.hasNext()) {
                if (o((bla) it.next())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            zr5.o();
            zr5.l(o((bla) immutableMap.get(partnerType2)));
            zr5.q(o((bla) immutableMap.get(partnerType)));
        } else {
            zr5.j(new kr5(es5));
        }
        es5.g.k(o((bla) immutableMap.get(partnerType)), o((bla) immutableMap.get(partnerType2)));
    }

    public static void d(es5 es5) {
        zr5 zr5 = es5.k;
        zr5.getClass();
        zr5.setVisible(false);
        if (es5.d.a(PartnerType.GOOGLE_MAPS.d())) {
            es5.g.n();
            es5.a.d();
            return;
        }
        es5.a.a();
    }

    public static void e(es5 es5, int i2) {
        if (i2 == 360) {
            zr5 zr5 = es5.k;
            zr5.getClass();
            if (zr5.isVisible()) {
                es5.g.l();
            }
            zr5 zr52 = es5.k;
            zr52.getClass();
            zr52.setVisible(false);
            return;
        }
        zr5 zr53 = es5.k;
        zr53.getClass();
        zr53.r(i2);
    }

    public static void f(es5 es5) {
        zr5 zr5 = es5.k;
        zr5.getClass();
        zr5.setVisible(false);
        if (es5.d.a(PartnerType.WAZE.d())) {
            es5.g.a();
            es5.a.e();
            return;
        }
        es5.a.b();
    }

    public static void g(es5 es5) {
        es5.j();
        zr5 zr5 = es5.k;
        zr5.getClass();
        zr5.setVisible(false);
    }

    public static void h(es5 es5, Throwable th) {
        zr5 zr5 = es5.k;
        zr5.getClass();
        zr5.setVisible(false);
        Logger.e(th, "Error getting integrations", new Object[0]);
    }

    public static void i(es5 es5) {
        zr5 zr5 = es5.k;
        zr5.getClass();
        zr5.setVisible(false);
        es5.l = true;
        es5.g.b();
    }

    /* access modifiers changed from: private */
    public void j() {
        Fragment u = this.i.u();
        s52 a2 = t52.a(LinkType.NAVIGATION_APPS_SETTINGS);
        a2.getClass();
        String str = a2.a().get(0);
        if (!(u instanceof c.a) || !((c.a) u).getViewUri().b(str)) {
            this.g.d();
            this.h.d(str);
        }
    }

    private static boolean o(bla bla) {
        return bla != null && bla.b() && bla.c();
    }

    public boolean a() {
        return this.l;
    }

    public void k() {
        this.e.b(this.b.b().B(this.f).subscribe(new mr5(this), new rr5(this)));
        this.e.b(this.m.o0(this.f).subscribe(new or5(this), lr5.a));
    }

    public void l(zr5 zr5) {
        this.k = zr5;
        zr5.k(new nr5(this));
        zr5.p(new pr5(this));
        zr5.n(new qr5(this));
        zr5.i(new sr5(this));
        if (this.j) {
            this.m = this.c.a().C0(1);
        } else {
            this.m = this.c.a();
        }
    }

    public void m() {
        this.e.f();
    }

    public void n(boolean z) {
        this.l = z;
    }
}
