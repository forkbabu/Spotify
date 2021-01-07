package defpackage;

import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.music.libs.podcast.download.a0;
import com.spotify.music.libs.podcast.download.c0;
import com.spotify.music.libs.podcast.download.d0;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.podcastentityrow.d;
import com.spotify.music.preview.v;
import com.spotify.music.preview.z;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.PlayabilityRestriction;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.offline.a;
import com.spotify.rxjava2.p;
import com.spotify.rxjava2.q;
import defpackage.d42;
import defpackage.j32;
import io.reactivex.e;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.s;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.subjects.a;
import io.reactivex.y;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: mh6  reason: default package */
final class mh6 implements lh6 {
    private boolean A;
    private boolean B;
    private boolean C;
    private String D;
    private boolean E;
    private boolean F;
    private String G;
    private c76 H;
    private wh6 I;
    private Optional<String> J = Optional.absent();
    private ItemConfiguration K = ItemConfiguration.a().build();
    private final c a;
    private final String b;
    private final t c;
    private final ph6 d;
    private final t8a e;
    private final s7a f;
    private final v g;
    private final y h;
    private final a0 i;
    private final d0 j;
    private final ExplicitContentFacade k;
    private final ItemListConfiguration l;
    private final ai6 m;
    private final b42 n;
    private final nsb o;
    private final m8a p;
    private final h32 q;
    private final AgeRestrictedContentFacade r;
    private final bec s;
    private final d t;
    private final q u = new q();
    private final q v = new q();
    private final p w = new p();
    private final CompletableSubject x = CompletableSubject.R();
    private final a<h76> y = a.h1();
    private oo6 z;

    public mh6(c cVar, String str, t tVar, ph6 ph6, y yVar, s7a s7a, v vVar, t8a t8a, b42 b42, h32 h32, ExplicitContentFacade explicitContentFacade, AgeRestrictedContentFacade ageRestrictedContentFacade, ItemListConfiguration itemListConfiguration, ai6 ai6, nsb nsb, m8a m8a, a0 a0Var, d0 d0Var, bec bec, d dVar) {
        this.a = cVar;
        this.b = str;
        this.c = tVar;
        this.d = ph6;
        this.e = t8a;
        this.f = s7a;
        this.g = vVar;
        this.h = yVar;
        this.i = a0Var;
        this.j = d0Var;
        this.k = explicitContentFacade;
        this.l = itemListConfiguration;
        this.m = ai6;
        this.n = b42;
        this.o = nsb;
        this.p = m8a;
        this.q = h32;
        this.r = ageRestrictedContentFacade;
        this.s = bec;
        this.t = dVar;
    }

    private void A(l lVar, String str) {
        this.u.a(this.s.a(lVar.getUri()).subscribe(new ug6(this, lVar, str)));
    }

    private static String B(l lVar) {
        return e(lVar) + lVar.f();
    }

    private static String e(l lVar) {
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

    private static boolean o(l lVar) {
        Episode c2 = lVar.c();
        return c2 != null && c2.l() == Episode.MediaType.VIDEO;
    }

    public static void z(mh6 mh6, h76 h76) {
        ItemConfiguration.LongClickAction longClickAction;
        ItemConfiguration.a m2 = mh6.K.m();
        ItemListConfiguration.AddedByAttribution a2 = mh6.l.a();
        boolean r2 = h76.l().r();
        ItemConfiguration.AddedBy addedBy = ItemConfiguration.AddedBy.FACE;
        if (a2 != ItemListConfiguration.AddedByAttribution.AS_FACE_ALWAYS && (!r2 || a2 != ItemListConfiguration.AddedByAttribution.AS_FACE_WHEN_COLLABORATIVE)) {
            addedBy = ItemConfiguration.AddedBy.NONE;
        }
        m2.l(addedBy);
        m2.a(mh6.l.k());
        m2.j(mh6.l.p() ? ItemConfiguration.HeartAndBan.HEART_AND_BAN : ItemConfiguration.HeartAndBan.NO_HEART_OR_BAN);
        if (mh6.l.g() == ItemListConfiguration.LongClickAction.SHOW_CONTEXT_MENU) {
            longClickAction = ItemConfiguration.LongClickAction.SHOW_CONTEXT_MENU;
        } else {
            longClickAction = ItemConfiguration.LongClickAction.DO_NOTHING;
        }
        m2.f(longClickAction);
        m2.c(mh6.l.q());
        m2.b(mh6.l.u() ? ItemConfiguration.PreviewOverlay.WITHOUT_PLAY_ICON : ItemConfiguration.PreviewOverlay.NONE);
        m2.g(mh6.l.v());
        m2.h(mh6.l.f());
        m2.d(mh6.l.d());
        m2.i(mh6.l.r());
        ItemConfiguration build = m2.build();
        mh6.K = build;
        mh6.I.i(build);
        mh6.C = h76.a();
    }

    @Override // defpackage.lh6
    public void a(int i2, l lVar) {
        Episode c2 = lVar.c();
        if (c2 != null) {
            String uri = c2.getUri();
            boolean F2 = c2.F();
            this.t.b(uri, F2, this.a.toString());
            this.d.e(uri, i2, F2);
        }
    }

    @Override // defpackage.lh6
    public void b(int i2, l lVar) {
        com.spotify.playlist.models.p b2 = lVar.b();
        if (b2 != null) {
            String e2 = b2.e();
            if (!MoreObjects.isNullOrEmpty(e2)) {
                this.c.b(e2, this.d.c(lVar.getUri(), i2, e2));
            }
        }
    }

    @Override // defpackage.lh6
    public void c(int i2, l lVar, boolean z2) {
        String d2 = this.d.d(lVar.getUri(), i2);
        if (z2) {
            this.u.a(this.z.d(d2).subscribe(fh6.a, wg6.a));
        } else {
            A(lVar, d2);
        }
    }

    @Override // defpackage.lh6
    public void d(int i2, l lVar) {
        String str;
        boolean z2 = false;
        boolean z3 = lVar.g() != null && this.l.u();
        if (z3) {
            str = this.d.f(lVar.getUri(), i2);
        } else {
            str = this.d.k(lVar.getUri(), i2);
        }
        PlayabilityRestriction j2 = com.spotify.playlist.models.q.j(lVar);
        if (j2 == PlayabilityRestriction.EXPLICIT_CONTENT) {
            this.k.e(lVar.getUri(), this.b);
        } else if (j2 == PlayabilityRestriction.AGE_RESTRICTED) {
            this.r.d(lVar.getUri(), com.spotify.playlist.models.q.d(lVar, Covers.Size.LARGE));
        } else if (z3) {
            String e2 = e(lVar);
            if (!MoreObjects.isNullOrEmpty(e2)) {
                ItemListConfiguration.PreviewToast i3 = this.l.i();
                if ((!e2.equals(this.G)) && (i3 == ItemListConfiguration.PreviewToast.SHOW_ON_EVERY_PLAYBACK || (i3 == ItemListConfiguration.PreviewToast.SHOW_ONCE_PER_PLAYLIST_SESSION && !this.E))) {
                    this.m.b();
                    this.E = true;
                }
                this.u.a(this.z.k().N0(1).subscribe(new bh6(this, str, e2, lVar)));
            }
        } else {
            if (lVar.c() != null && !o(lVar)) {
                z2 = true;
            }
            if (z2) {
                this.u.a(this.H.a().subscribe(new zg6(this, lVar, str), tg6.a));
            } else {
                A(lVar, str);
            }
        }
    }

    @Override // defpackage.lh6
    public void f(int i2, l lVar) {
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
        this.w.b(this.j.a(uri).o0(this.h).subscribe(new mg6(this, aVar, uri)));
        this.d.b(uri, i2, aVar instanceof a.f);
    }

    @Override // defpackage.lh6
    public io.reactivex.a g() {
        return this.x;
    }

    @Override // defpackage.lh6
    public void h(int i2, l lVar) {
        this.d.l(lVar.getUri(), i2);
        this.m.a();
    }

    @Override // defpackage.lh6
    public void i(wh6 wh6) {
        this.I = wh6;
        if (wh6 != null) {
            this.v.c();
            this.v.a(this.y.subscribe(new eh6(this)));
            if (this.l.u()) {
                this.u.a(this.g.g().o0(this.h).Y(new pg6(this)).subscribe(yg6.a, ch6.a));
                this.v.a(this.g.g().o0(this.h).subscribe(new xg6(this), ah6.a));
            }
            this.v.a(this.z.k().o0(this.h).subscribe(new gh6(this)));
            return;
        }
        this.v.c();
    }

    @Override // defpackage.lh6
    public void j(int i2, l lVar, boolean z2, boolean z3) {
        String uri = lVar.getUri();
        String j2 = this.d.j(uri, i2, z2);
        if (z2) {
            this.f.b(uri, this.b, z3);
            return;
        }
        this.f.a(uri, this.b, z3);
        if (lVar.g() == null || !this.l.u()) {
            this.u.a(this.z.e(uri, j2).subscribe(qg6.a, og6.a));
        } else {
            this.g.e(B(lVar));
        }
    }

    @Override // defpackage.lh6
    public void k(t.b bVar) {
        this.z = bVar.b();
        this.H = bVar.a();
        this.u.c();
        q qVar = this.u;
        s<h76> o0 = bVar.a().b().o0(this.h);
        dh6 dh6 = new dh6(this);
        CompletableSubject completableSubject = this.x;
        completableSubject.getClass();
        qVar.a(o0.subscribe(dh6, new ih6(completableSubject)));
    }

    @Override // defpackage.lh6
    public r3 l(ContextMenuItem contextMenuItem) {
        return n(contextMenuItem, this.C);
    }

    @Override // defpackage.lh6
    public void m(int i2, l lVar, boolean z2, boolean z3) {
        String uri = lVar.getUri();
        this.d.i(uri, i2, z2);
        if (z2) {
            this.e.f(uri, z3);
        } else {
            this.e.a(uri, this.b, z3);
        }
    }

    @Override // defpackage.lh6
    public r3 n(ContextMenuItem contextMenuItem, boolean z2) {
        boolean z3;
        Optional<String> optional;
        int c2 = contextMenuItem.c();
        String g2 = contextMenuItem.g();
        String d2 = contextMenuItem.d();
        this.d.h(g2, c2);
        LinkType q2 = l0.z(g2).q();
        String e2 = contextMenuItem.e();
        boolean z4 = false;
        if (q2 == LinkType.TRACK) {
            d42.f d3 = this.n.b(g2, d2, this.b, this.l.e(), contextMenuItem.b()).a(this.a).t(this.l.m()).g(true).r(true).d(z2, e2);
            d3.i(false);
            d3.l(!this.l.j());
            d3.f(!this.l.n());
            if (this.l.l() && !z2) {
                z4 = true;
            }
            d3.c(z4);
            d3.j(z2);
            d3.u(this.b);
            return d3.b();
        } else if (q2 == LinkType.SHOW_EPISODE) {
            Map<String, String> b2 = contextMenuItem.b();
            boolean z5 = contextMenuItem.f() == ContextMenuItem.Type.VIDEO_EPISODE;
            j32.g a2 = this.q.b(g2, d2, this.b, this.l.e(), b2).f(z5).a(this.a);
            ItemListConfiguration itemListConfiguration = this.l;
            int ordinal = contextMenuItem.f().ordinal();
            if (ordinal != 2) {
                z3 = ordinal != 3;
            } else {
                z3 = itemListConfiguration.d();
            }
            j32.b c3 = a2.d(z3).c(!z5 || this.l.o());
            c3.g(true);
            j32.h k2 = c3.h(this.l.m()).p(false).s(!z5).k(false);
            if (z2) {
                optional = Optional.fromNullable(this.b);
            } else {
                optional = Optional.absent();
            }
            k2.m(optional, z2 ? Optional.fromNullable(e2) : Optional.absent());
            k2.j(z2);
            k2.l(!this.l.j());
            return k2.b();
        } else {
            Assertion.p("Unsupported uri for building context menu. Only track and episode supported. was: " + g2);
            return r3.b;
        }
    }

    public /* synthetic */ e p(z zVar) {
        if (!this.B && zVar.b()) {
            this.B = true;
        } else if (this.B) {
            this.B = false;
            if (this.J.isPresent()) {
                this.J = Optional.absent();
                return this.z.j(this.J.get());
            }
        }
        return b.a;
    }

    public /* synthetic */ void q(z zVar) {
        boolean e2 = zVar.e();
        this.A = e2;
        this.G = e2 ? zVar.g() : null;
        this.I.j(zVar.h(), this.A);
        if (!this.A) {
            this.I.j(this.D, this.F);
        }
    }

    public /* synthetic */ void r(uo6 uo6) {
        String b2 = uo6.b();
        Boolean valueOf = Boolean.valueOf(uo6.a());
        if (!this.A) {
            this.I.j(b2, valueOf.booleanValue());
        }
        this.D = b2;
        this.F = valueOf.booleanValue();
    }

    public /* synthetic */ void s(String str) {
        this.p.a(str);
    }

    @Override // defpackage.lh6
    public void stop() {
        this.u.c();
        this.w.b(io.reactivex.disposables.c.a());
    }

    public /* synthetic */ void t(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.p.b((String) it.next());
        }
        this.p.b(str);
    }

    public void u(l lVar, String str, Boolean bool) {
        if (bool.booleanValue()) {
            q qVar = this.u;
            oo6 oo6 = this.z;
            String f2 = lVar.f();
            f2.getClass();
            qVar.a(oo6.l(f2, str).subscribe(rg6.a, sg6.a));
            PlayabilityRestriction j2 = com.spotify.playlist.models.q.j(lVar);
            boolean z2 = true;
            boolean z3 = (j2 == PlayabilityRestriction.UNKNOWN || j2 == PlayabilityRestriction.NO_RESTRICTION) ? false : true;
            o g2 = lVar.g();
            if ((g2 == null || !g2.isBanned()) && !z3) {
                z2 = false;
            }
            if (!z2 && o(lVar) && this.l.h()) {
                this.o.a();
            }
        }
    }

    public /* synthetic */ void v(String str, String str2, l lVar, uo6 uo6) {
        boolean z2 = !uo6.a();
        if (!this.J.isPresent() && z2) {
            this.J = Optional.of(str);
        }
        this.g.b(str2, B(lVar));
    }

    public void w(com.spotify.playlist.models.offline.a aVar, String str, c0 c0Var) {
        this.i.f(aVar, c0Var, new ng6(this, str), new vg6(this, str));
    }

    public /* synthetic */ void x(l lVar, String str, d.b bVar) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_playback_context_uri", this.b);
        bundle.putString("extra_playback_row_id", lVar.f());
        bundle.putParcelable("extra_playback_playlist_endpoint_configuration", bVar);
        this.c.c(lVar.getUri(), str, bundle);
    }

    public /* synthetic */ void y(h76 h76) {
        this.y.onNext(h76);
        this.x.onComplete();
    }
}
