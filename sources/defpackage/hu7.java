package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.spotify.http.u;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.music.features.profile.saveprofile.domain.SaveProfileState;
import com.spotify.music.features.profile.saveprofile.domain.n;
import com.spotify.music.features.profile.saveprofile.domain.o;
import com.spotify.music.features.profile.saveprofile.domain.q;
import com.spotify.music.features.profile.saveprofile.domain.r;
import com.spotify.music.features.profile.saveprofile.effecthandlers.f;
import com.spotify.music.features.profile.saveprofile.effecthandlers.h;
import com.spotify.music.features.profile.saveprofile.effecthandlers.k;
import com.spotify.music.features.profile.saveprofile.effecthandlers.p;
import com.spotify.music.features.profile.saveprofile.effecthandlers.t;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.e0;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.a;
import io.reactivex.y;

/* renamed from: hu7  reason: default package */
public class hu7 implements gu7 {
    private final y a;
    private final y b;
    private final y c;
    private final bqa d;
    private final g<SessionState> e;
    private final u f;
    private b g = EmptyDisposable.INSTANCE;
    private final PublishSubject<o> h = PublishSubject.h1();
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private final a<r> m = a.i1(r.a);
    private final Supplier<s<r>> n = MoreObjects.memoize(new cu7(this));

    public hu7(y yVar, y yVar2, y yVar3, bqa bqa, g<SessionState> gVar, u uVar) {
        this.a = yVar;
        this.b = yVar2;
        this.c = yVar3;
        this.e = gVar;
        this.d = bqa;
        this.f = uVar;
    }

    private void k() {
        if (!this.i || (!this.l && !this.j)) {
            if (!this.g.d()) {
                this.g.dispose();
            }
        } else if (this.g.d()) {
            s<Object> sVar = e0.a;
            PublishSubject<o> publishSubject = this.h;
            fu7 fu7 = fu7.a;
            y yVar = this.b;
            g<SessionState> gVar = this.e;
            bqa bqa = this.d;
            u uVar = this.f;
            m f2 = i.f();
            f2.h(n.c.class, new k(gVar));
            f2.h(n.b.class, new f(bqa));
            f2.h(n.g.class, new com.spotify.music.features.profile.saveprofile.effecthandlers.u(uVar));
            f2.h(n.f.class, new p(uVar));
            f2.h(n.d.class, new t(uVar));
            f2.h(n.e.class, new com.spotify.music.features.profile.saveprofile.effecthandlers.o(bqa));
            f2.h(n.a.class, new h(yVar));
            this.g = sVar.q(i.d(i.c(fu7, f2.i()).b(new du7(this)).d(new bu7(this)).h(i.a(publishSubject)).f(com.spotify.mobius.extras.b.g("save profile")), q.a)).I0(this.a).o0(this.a).subscribe(new yt7(this));
        }
    }

    @Override // defpackage.gu7
    public void a(boolean z) {
        this.i = z;
        k();
    }

    @Override // defpackage.gu7
    public s<r> b() {
        return this.n.get();
    }

    @Override // defpackage.gu7
    public void c(Optional<String> optional, Optional<String> optional2) {
        this.j = true;
        k();
        this.a.b(new zt7(this, optional, optional2));
    }

    @Override // defpackage.gu7
    public void cancel() {
        this.h.onNext(o.a.a);
    }

    public /* synthetic */ ia2 d() {
        return new com.spotify.mobius.rx2.o(this.b);
    }

    public /* synthetic */ ia2 e() {
        return new com.spotify.mobius.rx2.o(this.c);
    }

    public s f() {
        return this.m.M(new au7(this), Functions.c).M(Functions.f(), new eu7(this)).v0(1).h1().E();
    }

    public void g(b bVar) {
        this.l = true;
        k();
    }

    public void h() {
        this.l = false;
        k();
    }

    public void i(Optional optional, Optional optional2) {
        PublishSubject<o> publishSubject = this.h;
        kotlin.jvm.internal.h.e(optional, "displayName");
        kotlin.jvm.internal.h.e(optional2, "imagePath");
        publishSubject.onNext(new o.e(optional, optional2));
    }

    public void j(q qVar) {
        SaveProfileState i2 = qVar.i();
        if (i2 == SaveProfileState.SAVING) {
            this.k = true;
        }
        if (i2 == SaveProfileState.IDLE && this.k) {
            this.k = false;
            this.j = false;
            k();
        }
        a<r> aVar = this.m;
        r.a a2 = r.a();
        a2.c(qVar.i());
        a2.b(qVar.h());
        aVar.onNext(a2.a());
    }
}
