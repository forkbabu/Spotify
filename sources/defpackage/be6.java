package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.models.HomeMix;
import com.spotify.music.features.playlistentity.homemix.models.i;
import com.spotify.music.features.playlistentity.homemix.q;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.playlist.ui.d0;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;
import com.spotify.rxjava2.p;
import defpackage.ao6;
import defpackage.lh6;
import defpackage.xd6;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.subjects.CompletableSubject;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: be6  reason: default package */
public final class be6 implements d0, b4<ContextMenuItem> {
    private final io.reactivex.disposables.a a = new io.reactivex.disposables.a();
    private ao6 b;
    private final ao6.a c;
    private final lh6 f;
    private final HomeMixFormatListAttributesHelper n;
    private final yn1 o;
    private final ItemListConfiguration p;
    private final te6 q;
    private final me6 r;
    private final q s;
    private final CompletableSubject t = CompletableSubject.R();
    private final io.reactivex.subjects.a<a> u = io.reactivex.subjects.a.h1();
    private final p v = new p();
    private HomeMix w;
    private ee6 x;
    private i y;

    /* access modifiers changed from: package-private */
    /* renamed from: be6$a */
    public static abstract class a {

        /* access modifiers changed from: package-private */
        /* renamed from: be6$a$a  reason: collision with other inner class name */
        public static abstract class AbstractC0059a {
            AbstractC0059a() {
            }

            /* access modifiers changed from: package-private */
            public abstract a a();

            /* access modifiers changed from: package-private */
            public abstract AbstractC0059a b(HomeMix homeMix);

            /* access modifiers changed from: package-private */
            public abstract AbstractC0059a c(List<l> list);

            /* access modifiers changed from: package-private */
            public abstract AbstractC0059a d(j jVar);

            /* access modifiers changed from: package-private */
            public abstract AbstractC0059a e(ve6 ve6);
        }

        a() {
        }

        /* access modifiers changed from: package-private */
        public abstract HomeMix a();

        /* access modifiers changed from: package-private */
        public abstract List<l> b();

        /* access modifiers changed from: package-private */
        public abstract j c();

        /* access modifiers changed from: package-private */
        public abstract ve6 d();
    }

    public be6(ao6.a aVar, lh6.a aVar2, HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper, te6 te6, yn1 yn1, me6 me6, q qVar, ItemListConfiguration itemListConfiguration) {
        this.c = aVar;
        this.n = homeMixFormatListAttributesHelper;
        this.o = yn1;
        this.p = itemListConfiguration;
        this.f = aVar2.a(itemListConfiguration);
        this.q = te6;
        this.r = me6;
        this.s = qVar;
    }

    public static void l(be6 be6, a aVar) {
        be6.x.z(aVar);
        be6.a.b(be6.b.a(aVar.b(), be6.p.c(), be6.p.b(), be6.p.h()).subscribe(new pd6(be6), md6.a));
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void a(int i, l lVar) {
        this.f.a(i, lVar);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void b(int i, l lVar) {
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void c(int i, l lVar, boolean z) {
        this.f.c(i, lVar, z);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void d(int i, l lVar) {
        this.f.d(i, lVar);
        this.r.c(lVar.getUri(), i);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void f(int i, l lVar) {
        this.f.f(i, lVar);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void g(int i, l lVar) {
        o g = lVar.g();
        if (g != null) {
            this.f.j(i, lVar, g.isBanned(), true);
        }
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void h(int i, l lVar) {
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void i(int i, l lVar) {
        o g = lVar.g();
        if (g != null) {
            this.f.m(i, lVar, g.isInCollection(), true);
        }
    }

    public void j(ee6 ee6) {
        this.x = ee6;
        this.f.i(ee6);
        if (ee6 != null) {
            this.v.b(this.u.subscribe(new od6(this)));
        } else {
            this.v.a();
        }
    }

    public io.reactivex.a k() {
        return io.reactivex.a.y(ImmutableList.of((io.reactivex.a) this.t, this.f.g()));
    }

    public /* synthetic */ void m(Optional optional) {
        ee6 ee6;
        if (optional.isPresent() && (ee6 = this.x) != null) {
            ee6.y(((Integer) optional.get()).intValue());
        }
    }

    public /* synthetic */ a.AbstractC0059a n(h76 h76, SessionState sessionState, a.AbstractC0059a aVar) {
        this.w = this.n.c(h76.l());
        this.y = this.n.a(h76.l());
        aVar.d(h76.l());
        aVar.e(this.q.a(h76, sessionState));
        aVar.b(this.w);
        return aVar;
    }

    public /* synthetic */ void o(a aVar) {
        this.u.onNext(aVar);
        this.t.onComplete();
    }

    public void p() {
        q qVar = this.s;
        i iVar = this.y;
        iVar.getClass();
        qVar.d(iVar, this.w.planType());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.mobile.android.ui.contextmenu.b4
    public r3 p0(ContextMenuItem contextMenuItem) {
        ContextMenuItem contextMenuItem2 = contextMenuItem;
        me6 me6 = this.r;
        contextMenuItem2.g();
        me6.getClass();
        return this.f.l(contextMenuItem2);
    }

    public void q(t.b bVar) {
        this.b = this.c.a(bVar.b());
        this.a.f();
        io.reactivex.disposables.a aVar = this.a;
        s<h76> b2 = bVar.a().b();
        g<SessionState> a2 = this.o.a();
        a2.getClass();
        s o0 = s.n(s.m(b2, new v(a2), s.i0(new xd6.b()), new nd6(this)), bVar.a().h().j0(jd6.a), kd6.a).j0(vd6.a).o0(io.reactivex.android.schedulers.a.b());
        qd6 qd6 = new qd6(this);
        CompletableSubject completableSubject = this.t;
        completableSubject.getClass();
        aVar.b(o0.subscribe(qd6, new wd6(completableSubject)));
        this.f.k(bVar);
    }

    public void r() {
        this.a.f();
        this.f.stop();
        this.s.e();
    }
}
