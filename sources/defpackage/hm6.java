package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.connection.l;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.limitedofflineendpoints.api.UserMixDataSource;
import com.spotify.music.offlinetrials.limited.logging.OfflineUserMixInteractionLogger;
import com.spotify.music.offlinetrials.limited.logging.c;
import com.spotify.music.playlist.ui.d0;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.offline.a;
import com.spotify.rxjava2.p;
import defpackage.ao6;
import defpackage.lh6;
import io.reactivex.s;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.y;
import java.util.List;

/* renamed from: hm6  reason: default package */
public class hm6 implements d0, b4<ContextMenuItem> {
    private final io.reactivex.disposables.a a = new io.reactivex.disposables.a();
    private final y b;
    private final ao6.a c;
    private final lh6 f;
    private final ItemListConfiguration n;
    private final UserMixDataSource o;
    private final OfflineUserMixInteractionLogger p;
    private final l q;
    private final com.spotify.music.offlinetrials.limited.uicomponents.y r;
    private final CompletableSubject s = CompletableSubject.R();
    private final io.reactivex.subjects.a<u3<g76, h76>> t = io.reactivex.subjects.a.h1();
    private final p u = new p();
    private ao6 v;
    private lm6 w;
    boolean x;

    /* renamed from: hm6$a */
    public interface a {
        hm6 a(ItemListConfiguration itemListConfiguration);
    }

    public hm6(ao6.a aVar, lh6.a aVar2, UserMixDataSource userMixDataSource, y yVar, c cVar, l lVar, com.spotify.music.offlinetrials.limited.uicomponents.y yVar2, ItemListConfiguration itemListConfiguration) {
        this.f = aVar2.a(itemListConfiguration);
        this.c = aVar;
        this.b = yVar;
        this.n = itemListConfiguration;
        this.o = userMixDataSource;
        this.p = cVar.b(ViewUris.b0, PageIdentifiers.OFFLINE_MIX_ENTITY);
        this.q = lVar;
        this.r = yVar2;
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void a(int i, com.spotify.playlist.models.l lVar) {
        this.f.a(i, lVar);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void b(int i, com.spotify.playlist.models.l lVar) {
        this.f.b(i, lVar);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void c(int i, com.spotify.playlist.models.l lVar, boolean z) {
        this.f.c(i, lVar, z);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void d(int i, com.spotify.playlist.models.l lVar) {
        if (!this.x) {
            this.r.a();
            return;
        }
        this.f.d(i, lVar);
        o g = lVar.g();
        if (g != null) {
            this.p.e(g.getUri(), i, g.isCurrentlyPlayable());
        }
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void f(int i, com.spotify.playlist.models.l lVar) {
        o g = lVar.g();
        if (g != null) {
            com.spotify.playlist.models.offline.a offlineState = g.getOfflineState();
            offlineState.getClass();
            boolean z = offlineState instanceof a.f;
            if (z) {
                this.a.b(this.o.a(g.getUri()).subscribe());
            } else {
                this.a.b(this.o.c(g.getUri()).subscribe());
            }
            this.p.d(g.getUri(), i, z);
        }
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void g(int i, com.spotify.playlist.models.l lVar) {
        o g = lVar.g();
        if (g != null) {
            this.f.j(i, lVar, g.isBanned(), true);
        }
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void h(int i, com.spotify.playlist.models.l lVar) {
        this.f.h(i, lVar);
    }

    @Override // com.spotify.music.playlist.ui.d0
    public void i(int i, com.spotify.playlist.models.l lVar) {
        o g = lVar.g();
        if (g != null) {
            this.f.m(i, lVar, g.isInCollection(), true);
        }
    }

    public void j(lm6 lm6) {
        this.w = lm6;
        if (lm6 != null) {
            lm6.y(this.x);
            this.u.b(this.t.subscribe(new yl6(this)));
        } else {
            this.u.a();
        }
        this.f.i(lm6);
    }

    public io.reactivex.a k() {
        return io.reactivex.a.y(ImmutableList.of((io.reactivex.a) this.s, this.f.g()));
    }

    public void l(u3 u3Var) {
        F f2 = u3Var.a;
        f2.getClass();
        S s2 = u3Var.b;
        s2.getClass();
        List<com.spotify.playlist.models.l> a2 = f2.a();
        this.w.w(s2.l(), a2);
        this.a.b(this.v.a(a2, this.n.c(), this.n.b(), this.n.h()).subscribe(new xl6(this)));
    }

    public /* synthetic */ void m(Optional optional) {
        lm6 lm6;
        if (optional.isPresent() && (lm6 = this.w) != null) {
            lm6.u(((Integer) optional.get()).intValue());
        }
    }

    public /* synthetic */ void n(u3 u3Var) {
        this.t.onNext(u3Var);
        this.s.onComplete();
    }

    public void o(t.b bVar) {
        this.v = this.c.a(bVar.b());
        this.a.f();
        this.a.b(this.q.b().subscribe(new wl6(this)));
        io.reactivex.disposables.a aVar = this.a;
        s o0 = s.n(bVar.a().h(), bVar.a().b(), fm6.a).o0(this.b);
        vl6 vl6 = new vl6(this);
        CompletableSubject completableSubject = this.s;
        completableSubject.getClass();
        aVar.b(o0.subscribe(vl6, new gm6(completableSubject)));
        this.f.k(bVar);
    }

    public void p() {
        this.a.f();
        this.f.stop();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.mobile.android.ui.contextmenu.b4
    public r3 p0(ContextMenuItem contextMenuItem) {
        return this.f.l(contextMenuItem);
    }
}
