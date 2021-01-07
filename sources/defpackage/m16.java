package defpackage;

import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.playlistallsongs.logging.a;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.podcastentityrow.d;
import com.spotify.music.preview.v;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.PlayabilityRestriction;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.offline.a;
import com.spotify.playlist.models.p;
import com.spotify.rxjava2.q;
import defpackage.d42;
import defpackage.j32;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.y;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: m16  reason: default package */
public class m16 implements l16 {
    private final s16 a;
    private final a b;
    private final v c;
    private final s7a d;
    private final t8a e;
    private final wec f;
    private final ExplicitContentFacade g;
    private final AgeRestrictedContentFacade h;
    private final m8a i;
    private final h32 j;
    private final c k;
    private final y l;
    private final b42 m;
    private final d n;
    private final s<k16> o;
    private final s<Boolean> p;
    private final t q;
    private final q r = new q();
    private b s = EmptyDisposable.INSTANCE;
    private boolean t;
    private z16 u;

    public m16(s16 s16, a aVar, y yVar, v vVar, s7a s7a, t8a t8a, ExplicitContentFacade explicitContentFacade, AgeRestrictedContentFacade ageRestrictedContentFacade, m8a m8a, wec wec, c cVar, h32 h32, s<Boolean> sVar, b42 b42, t tVar, d dVar, s<k16> sVar2) {
        this.a = s16;
        this.b = aVar;
        this.l = yVar;
        this.c = vVar;
        this.d = s7a;
        this.e = t8a;
        this.g = explicitContentFacade;
        this.h = ageRestrictedContentFacade;
        this.i = m8a;
        this.f = wec;
        this.k = cVar;
        this.j = h32;
        this.m = b42;
        this.q = tVar;
        this.n = dVar;
        this.o = sVar2;
        this.p = sVar;
    }

    private static String o(l lVar) {
        o g2 = lVar.g();
        if (g2 != null) {
            return g2.getPreviewId();
        }
        Episode c2 = lVar.c();
        if (c2 != null) {
            return c2.s();
        }
        return null;
    }

    private void r(l lVar) {
        Covers covers;
        PlayabilityRestriction j2 = com.spotify.playlist.models.q.j(lVar);
        if (j2 == PlayabilityRestriction.EXPLICIT_CONTENT) {
            this.g.e(lVar.getUri(), this.a.a());
        } else if (j2 == PlayabilityRestriction.AGE_RESTRICTED) {
            o g2 = lVar.g();
            Episode c2 = lVar.c();
            if (g2 != null) {
                covers = g2.getAlbum().e();
            } else {
                covers = c2 != null ? c2.c() : Covers.a().a();
            }
            this.h.d(lVar.getUri(), com.spotify.playlist.models.q.c(covers, Covers.Size.NORMAL));
        } else {
            o g3 = lVar.g();
            if (g3 == null || !g3.isBanned()) {
                String o2 = o(lVar);
                if (!MoreObjects.isNullOrEmpty(o2)) {
                    if (lVar.c() != null) {
                        this.c.b(o2, s(lVar));
                    } else {
                        this.c.i(o2, s(lVar));
                    }
                }
            }
        }
    }

    private static String s(l lVar) {
        return o(lVar) + lVar.f();
    }

    private void t() {
        if (!this.t) {
            ((a26) this.u).m();
        } else if (this.s.d()) {
            this.b.l();
            ((a26) this.u).C();
            y.c a2 = this.l.a();
            z16 z16 = this.u;
            z16.getClass();
            this.s = a2.c(new z06(z16), 1500, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.l16
    public void a(int i2, l lVar) {
        Episode c2 = lVar.c();
        if (c2 != null) {
            this.n.b(c2.getUri(), c2.F(), this.k.toString());
            this.b.d(c2.getUri(), i2, c2.F());
        }
    }

    @Override // defpackage.l16
    public void b() {
        this.b.j(this.t);
        t();
    }

    @Override // defpackage.l16
    public void c(l lVar, int i2) {
        this.b.m(lVar.getUri(), i2);
        r(lVar);
    }

    @Override // defpackage.l16
    public void d(Bundle bundle) {
        if (bundle != null) {
            this.t = bundle.getBoolean(m16.class.getName(), false);
        }
    }

    @Override // defpackage.l16
    public void e(l lVar, int i2) {
        this.b.e(lVar.getUri(), i2);
        r(lVar);
    }

    @Override // defpackage.l16
    public void f() {
        this.b.g(this.t);
        t();
    }

    @Override // defpackage.l16
    public void g(Bundle bundle) {
        bundle.putBoolean(m16.class.getName(), this.t);
    }

    @Override // defpackage.l16
    public void h(l lVar, int i2) {
        p b2 = lVar.b();
        if (b2 != null) {
            String e2 = b2.e();
            if (!MoreObjects.isNullOrEmpty(e2)) {
                this.q.b(e2, this.b.c(lVar.getUri(), i2, e2));
            }
        }
    }

    @Override // defpackage.l16
    public void i(l lVar, int i2) {
        o g2 = lVar.g();
        if (g2 != null) {
            String uri = lVar.getUri();
            boolean z = !g2.isInCollection();
            this.b.f(lVar.getUri(), i2, z);
            if (z) {
                this.e.e(uri, this.a.a());
            } else {
                this.e.b(uri);
            }
        }
    }

    @Override // defpackage.l16
    public void j(l lVar, int i2) {
        o g2 = lVar.g();
        if (g2 != null) {
            String uri = lVar.getUri();
            boolean z = !g2.isBanned();
            this.b.i(uri, i2, z);
            if (z) {
                this.d.a(uri, this.a.a(), true);
                this.c.e(s(lVar));
                return;
            }
            this.d.b(uri, this.a.a(), true);
        }
    }

    @Override // defpackage.l16
    public r3 k(t06 t06) {
        int c2 = t06.c();
        String g2 = t06.g();
        String e2 = t06.e();
        this.b.h(g2, c2);
        String a2 = this.a.a();
        LinkType q2 = l0.z(g2).q();
        boolean i2 = t06.i();
        String f2 = t06.f();
        Map<String, String> b2 = t06.b();
        boolean c3 = this.a.s().c();
        if (q2 == LinkType.TRACK) {
            d42.f d2 = this.m.b(g2, e2, a2, c3, b2).a(this.k).t(false).g(true).r(true).d(i2, f2);
            d2.i(false);
            d2.l(true);
            d2.q(false);
            d2.c(t06.h());
            d2.u(a2);
            return d2.b();
        } else if (q2 == LinkType.SHOW_EPISODE) {
            j32.b c4 = this.j.b(g2, e2, a2, c3, b2).f(t06.d() == Episode.MediaType.VIDEO).a(this.k).d(false).c(false);
            c4.g(true);
            j32.h k2 = c4.h(true).p(false).s(false).k(false);
            k2.m(i2 ? Optional.of(a2) : Optional.absent(), i2 ? Optional.fromNullable(f2) : Optional.absent());
            k2.j(i2);
            k2.l(true);
            return k2.b();
        } else {
            Assertion.p("Unsupported uri for building context menu. Only track and episode supported. was: " + g2);
            return r3.b;
        }
    }

    @Override // defpackage.l16
    public void l() {
        this.b.k();
        this.f.a(this.a.a());
    }

    @Override // defpackage.l16
    public void m(l lVar, int i2) {
        com.spotify.playlist.models.offline.a aVar;
        o g2 = lVar.g();
        Episode c2 = lVar.c();
        String uri = lVar.getUri();
        if (g2 != null) {
            aVar = g2.getOfflineState();
        } else if (c2 != null) {
            aVar = c2.o();
        } else {
            aVar = a.f.a;
        }
        aVar.getClass();
        boolean z = aVar instanceof a.f;
        if (z) {
            this.i.a(uri);
        } else {
            this.i.b(uri);
        }
        this.b.b(uri, i2, z);
    }

    @Override // defpackage.l16
    public void n(z16 z16) {
        this.u = z16;
    }

    public /* synthetic */ void p(k16 k16) {
        j b2 = k16.b();
        boolean z = false;
        boolean z2 = b2.r() || b2.w();
        List<l> a2 = k16.a();
        List<l> c2 = k16.c();
        if (b2.w()) {
            ((a26) this.u).E(!a2.isEmpty());
            ((a26) this.u).D(!c2.isEmpty());
        } else {
            ((a26) this.u).A(!a2.isEmpty() || !c2.isEmpty());
        }
        ((a26) this.u).u(b2.j());
        ((a26) this.u).s(com.spotify.playlist.models.q.c(b2.c(), Covers.Size.NORMAL));
        ((a26) this.u).t(a2);
        ((a26) this.u).w(c2);
        z16 z16 = this.u;
        if (a2.isEmpty() && c2.isEmpty()) {
            z = true;
        }
        ((a26) z16).z(z);
        ((a26) this.u).y(z2);
        boolean z3 = !z2;
        ((a26) this.u).B(z3);
        ((a26) this.u).r(z2);
        ((a26) this.u).q(z3);
        ((a26) this.u).x(b2.r() ? ItemConfiguration.AddedBy.FACE : ItemConfiguration.AddedBy.NONE);
        ((a26) this.u).v(this.a.s().g());
    }

    public /* synthetic */ void q(Boolean bool) {
        this.t = bool.booleanValue();
    }

    @Override // defpackage.l16
    public void start() {
        this.r.a(this.o.o0(this.l).subscribe(new b16(this), d16.a));
        this.r.a(this.p.o0(this.l).subscribe(new e16(this), c16.a));
    }

    @Override // defpackage.l16
    public void stop() {
        this.r.c();
    }
}
