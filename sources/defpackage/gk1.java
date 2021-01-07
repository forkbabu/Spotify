package defpackage;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation;
import com.spotify.libs.connect.l;
import io.reactivex.disposables.b;
import io.reactivex.internal.operators.observable.e0;
import io.reactivex.s;
import io.reactivex.subjects.a;
import io.reactivex.v;

/* renamed from: gk1  reason: default package */
public class gk1 implements ik1, hg0<ConnectManager> {
    private final l a;
    private final a<ConnectManager> b = a.h1();
    private final a<Boolean> c = a.h1();
    private final com.spotify.libs.connect.volume.controllers.l f;
    private final ConnectVolumeControlInstrumentation n;
    private b o;

    public gk1(l lVar, com.spotify.libs.connect.volume.controllers.l lVar2, ConnectVolumeControlInstrumentation connectVolumeControlInstrumentation) {
        this.a = lVar;
        this.f = lVar2;
        this.n = connectVolumeControlInstrumentation;
    }

    @Override // defpackage.ik1
    public s<Boolean> a() {
        return this.b.J0(new dk1(this)).j0(yj1.a).E();
    }

    @Override // defpackage.ik1
    public void c() {
        Boolean j1 = this.c.j1();
        if (j1 != null && j1.booleanValue()) {
            float f2 = this.f.f();
            this.f.c();
            this.n.a(ConnectVolumeControlInstrumentation.SetSystemVolume.a, this.f.f(), Float.valueOf(f2));
        }
    }

    @Override // defpackage.ik1
    public void d() {
        this.a.j();
        b bVar = this.o;
        if (bVar != null && !bVar.d()) {
            this.o.dispose();
        }
    }

    @Override // defpackage.ik1
    public void e() {
        Boolean j1 = this.c.j1();
        if (j1 != null && j1.booleanValue()) {
            float f2 = this.f.f();
            this.f.e();
            this.n.a(ConnectVolumeControlInstrumentation.SetSystemVolume.a, this.f.f(), Float.valueOf(f2));
        }
    }

    @Override // defpackage.ik1
    public void f() {
        this.a.p(this);
        this.a.i();
    }

    @Override // defpackage.ik1
    public s<Float> g() {
        return this.c.J0(new zj1(this));
    }

    @Override // defpackage.ik1
    public void h() {
        this.o = this.b.T().subscribe(bk1.a, ek1.a);
    }

    @Override // defpackage.ik1
    public s<Boolean> j() {
        return this.c.J0(new ck1(this));
    }

    @Override // defpackage.ik1
    public void k(float f2) {
        Boolean j1 = this.c.j1();
        if (j1 != null && j1.booleanValue()) {
            float max = Math.max(0.0f, Math.min(1.0f, f2));
            float f3 = this.f.f();
            this.f.g(Float.valueOf(max));
            this.n.a(ConnectVolumeControlInstrumentation.SetSystemVolume.a, this.f.f(), Float.valueOf(f3));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.hg0
    public void l(ConnectManager connectManager) {
        this.b.onNext(connectManager);
        this.a.q(this);
    }

    public v n(Boolean bool) {
        if (bool.booleanValue()) {
            return this.b.J0(new ak1(this)).j0(fk1.a).E();
        }
        return e0.a;
    }

    public /* synthetic */ v o(Boolean bool) {
        if (bool.booleanValue()) {
            return this.f.a();
        }
        return e0.a;
    }

    @Override // defpackage.hg0
    public void onDisconnected() {
        this.a.q(this);
    }

    @Override // com.spotify.mobile.android.service.media.v2
    public void start() {
        this.c.onNext(Boolean.TRUE);
    }

    @Override // com.spotify.mobile.android.service.media.v2
    public void stop() {
        this.c.onNext(Boolean.FALSE);
    }
}
