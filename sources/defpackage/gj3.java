package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.addtoplaylist.logger.c;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.exceptions.InsufficientStorageException;
import com.spotify.playlist.endpoints.i;
import com.spotify.playlist.models.f;
import com.spotify.playlist.models.j;
import com.spotify.remoteconfig.a5;
import com.spotify.rxjava2.q;
import defpackage.ij3;
import defpackage.jj3;
import io.reactivex.d0;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: gj3  reason: default package */
public class gj3 implements fj3, jj3.b {
    private final d a;
    private final i b;
    private final c c;
    private final y d;
    private final com.spotify.music.features.createplaylist.d e;
    private final l31 f;
    private final jj3 g;
    private final String h;
    private final List<String> i;
    private final fi3 j;
    private final q k = new q();
    private final CollectionStateProvider l;
    private final mj3 m;
    private wj3 n;
    private final a5 o;
    private final ih0 p;
    private final lbb q;
    private boolean r;
    private boolean s;
    private Optional<String> t = Optional.absent();

    /* renamed from: gj3$a */
    public static abstract class a {

        /* renamed from: gj3$a$a  reason: collision with other inner class name */
        public interface AbstractC0594a {
        }

        public abstract d.c a();

        public abstract List<String> b();
    }

    public gj3(d dVar, i iVar, c cVar, y yVar, com.spotify.music.features.createplaylist.d dVar2, l31 l31, ei3 ei3, fi3 fi3, di3 di3, kj3 kj3, ih0 ih0, lbb lbb, CollectionStateProvider collectionStateProvider, mj3 mj3, a5 a5Var) {
        this.h = di3.i();
        this.a = dVar;
        this.b = iVar;
        this.c = cVar;
        this.d = yVar;
        this.e = dVar2;
        this.f = l31;
        this.g = kj3.b(this);
        this.i = ei3.l();
        this.j = fi3;
        this.p = ih0;
        this.q = lbb;
        this.l = collectionStateProvider;
        this.m = mj3;
        this.o = a5Var;
    }

    public static z C(gj3 gj3, Throwable th) {
        gj3.getClass();
        if (!(th instanceof TimeoutException)) {
            return z.q(th);
        }
        Logger.d("Unable to determine duplicates in a reasonable time. Will add the content anyway.", new Object[0]);
        return gj3.f.e(gj3.i).A(new hi3(gj3)).s(dj3.a);
    }

    private void n(j jVar, List<String> list) {
        this.k.a(this.b.e(jVar.getUri(), list, this.j.d(), this.j.m()).H(1, TimeUnit.SECONDS).A(this.d).subscribe(new ki3(this, jVar), new oi3(this)));
    }

    private boolean o() {
        return this.t.isPresent();
    }

    public static void p(gj3 gj3, f fVar) {
        gj3.getClass();
        List<j> items = fVar.getItems();
        if (gj3.o.a() && MoreObjects.isNullOrEmpty(gj3.h) && fVar.getUnrangedLength() >= gj3.o.b() && !gj3.o()) {
            ((yj3) gj3.n).x();
        } else {
            ((yj3) gj3.n).g();
        }
        if (fVar.getUnrangedLength() != 0) {
            ((yj3) gj3.n).p(items);
            ((yj3) gj3.n).f();
            ((yj3) gj3.n).e();
        } else if (gj3.o()) {
            ((yj3) gj3.n).p(items);
            ((yj3) gj3.n).v();
        } else if (!MoreObjects.isNullOrEmpty(gj3.h)) {
            ((yj3) gj3.n).w();
        } else {
            ((yj3) gj3.n).c();
            gj3.e.a(gj3.i, gj3.j.d(), gj3.j.m());
        }
        ((yj3) gj3.n).z(false);
    }

    public static void q(gj3 gj3, Throwable th) {
        ((yj3) gj3.n).z(false);
        gj3.r = false;
        if (th instanceof InsufficientStorageException) {
            gj3.g.m();
        } else {
            gj3.g.n();
        }
        Logger.e(th, "Adding track to playlist failed", new Object[0]);
    }

    public /* synthetic */ void A(String str, Map map) {
        boolean b2 = ((CollectionStateProvider.a) map.get(str)).b();
        this.s = b2;
        ((yj3) this.n).s(b2);
    }

    public /* synthetic */ void B(Throwable th) {
        Logger.e(th, "Failed to subscribe to collection state", new Object[0]);
        this.s = false;
        ((yj3) this.n).s(false);
    }

    @Override // defpackage.fj3
    public void a(j jVar, int i2) {
        if (!this.r) {
            this.r = true;
            f e2 = jVar.e();
            if (!jVar.s() || e2 == null) {
                ((yj3) this.n).z(true);
                String uri = jVar.getUri();
                this.c.k(uri, i2, this.i.get(0));
                this.k.a(this.f.e(this.i).s(new ti3(this, uri)).I(5, TimeUnit.SECONDS).D(new xi3(this)).s(new si3(this, uri)).B(this.d).subscribe(new pi3(this, jVar), new ni3(this)));
                return;
            }
            ((yj3) this.n).r(e2.f(), e2.c(), this.i);
        }
    }

    @Override // defpackage.fj3
    public boolean b() {
        this.c.a();
        if (!o()) {
            return false;
        }
        j();
        return true;
    }

    @Override // defpackage.jj3.b
    public void c(j jVar, List<String> list) {
        this.c.f(jVar.getUri(), list.get(0));
        n(jVar, list);
    }

    @Override // defpackage.jj3.b
    public void d(j jVar, Optional<List<String>> optional) {
        if (!optional.isPresent()) {
            this.c.l(jVar.getUri());
            this.r = false;
        } else if (optional.get().isEmpty()) {
            this.c.l(jVar.getUri());
            ((yj3) this.n).c();
        } else {
            this.c.c(jVar.getUri(), optional.get().get(0));
            n(jVar, optional.get());
        }
    }

    @Override // defpackage.fj3
    public void e(Optional<String> optional) {
        this.t = optional;
        this.m.c(optional.or((Optional<String>) ""));
    }

    @Override // defpackage.fj3
    public void f() {
        this.c.d();
        e(Optional.of(""));
        ((yj3) this.n).i();
        ((yj3) this.n).y(this.t.or((Optional<String>) ""));
        ((yj3) this.n).d();
        ((yj3) this.n).g();
    }

    @Override // defpackage.fj3
    public boolean g() {
        if (this.i.size() != 1) {
            return false;
        }
        String str = this.i.get(0);
        if (!this.q.a() || l0.z(str).q() != LinkType.SHOW_EPISODE || !MoreObjects.isNullOrEmpty(this.h)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.fj3
    public void h(wj3 wj3) {
        this.n = wj3;
    }

    @Override // defpackage.jj3.b
    public void i(j jVar) {
        this.c.b(jVar.getUri());
        this.r = false;
    }

    @Override // defpackage.fj3
    public void j() {
        e(Optional.absent());
        ((yj3) this.n).A();
        ((yj3) this.n).h();
        ((yj3) this.n).u();
        ((yj3) this.n).x();
    }

    @Override // defpackage.fj3
    public void k() {
        this.c.h();
        ((yj3) this.n).c();
        this.e.b(this.h, this.i, this.j.d(), this.j.m());
    }

    @Override // defpackage.fj3
    public Optional<String> l() {
        return this.t;
    }

    @Override // defpackage.fj3
    public void m() {
        if (!this.r) {
            this.r = true;
            ((yj3) this.n).z(true);
            if (this.s) {
                this.k.a(this.p.c(ImmutableList.of(this.i.get(0))).A(this.d).subscribe(new wi3(this), new ji3(this)));
                this.c.j(this.i.get(0));
                return;
            }
            this.k.a(this.p.e(ImmutableList.of(this.i.get(0))).A(this.d).subscribe(new ii3(this), new ui3(this)));
            this.c.g(this.i.get(0));
        }
    }

    @Override // defpackage.fj3
    public void onStart() {
        this.r = false;
        this.k.c();
        if (o()) {
            ((yj3) this.n).i();
            ((yj3) this.n).y(this.t.or((Optional<String>) ""));
            ((yj3) this.n).d();
            ((yj3) this.n).g();
        }
        this.k.a(this.m.a().o0(this.d).subscribe(new li3(this), qi3.a));
        if (g()) {
            q qVar = this.k;
            String str = this.i.get(0);
            s<R> o0 = this.p.d(new jh0(500, new gh0(0, 0))).j0(ej3.a).r0(vi3.a).o0(this.d);
            wj3 wj3 = this.n;
            wj3.getClass();
            qVar.b(this.l.a(this.j.d(), "", str).B(this.d).subscribe(new ri3(this, str), new mi3(this)), o0.subscribe(new gi3(wj3)));
        }
    }

    @Override // defpackage.fj3
    public void onStop() {
        this.k.c();
    }

    public /* synthetic */ void r(j jVar) {
        this.g.f(jVar);
        ((yj3) this.n).c();
    }

    public /* synthetic */ void s(Throwable th) {
        if (th instanceof InsufficientStorageException) {
            this.g.m();
        } else {
            this.g.n();
        }
        Logger.e(th, "Adding track to playlist failed", new Object[0]);
    }

    public /* synthetic */ void t() {
        ((yj3) this.n).z(false);
        this.g.h();
        ((yj3) this.n).c();
    }

    public /* synthetic */ void u(Throwable th) {
        this.r = false;
        ((yj3) this.n).z(false);
        this.g.n();
        Logger.e(th, "Adding episode to Your Episodes failed", new Object[0]);
    }

    public /* synthetic */ d0 v(String str, List list) {
        return this.a.b(str, list);
    }

    public /* synthetic */ void w(j jVar, a aVar) {
        d.c a2 = aVar.a();
        if (a2 == null) {
            this.g.f(jVar);
            ((yj3) this.n).c();
            return;
        }
        if (a2.a().size() == 1) {
            this.c.i(jVar.getUri());
            this.g.j(jVar, this.i.get(0));
        } else {
            this.c.e(jVar.getUri());
            this.g.k(jVar, a2.a(), a2.d());
        }
        ((yj3) this.n).z(false);
    }

    public d0 x(String str, d.c cVar) {
        if (!cVar.c()) {
            List<String> a2 = cVar.a();
            io.reactivex.a H = this.b.e(str, a2, this.j.d(), this.j.m()).H(1, TimeUnit.SECONDS);
            ij3.b bVar = new ij3.b();
            bVar.c(a2);
            return H.h(z.z(bVar.a()));
        }
        ij3.b bVar2 = new ij3.b();
        bVar2.b(cVar);
        bVar2.c(ImmutableList.of());
        return z.z(bVar2.a());
    }

    public /* synthetic */ void y() {
        ((yj3) this.n).z(false);
        this.g.l();
        ((yj3) this.n).c();
    }

    public /* synthetic */ void z(Throwable th) {
        this.r = false;
        ((yj3) this.n).z(false);
        this.g.n();
        Logger.e(th, "Removing episode from Your Episodes failed", new Object[0]);
    }
}
