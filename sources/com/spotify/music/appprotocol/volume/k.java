package com.spotify.music.appprotocol.volume;

import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.appprotocol.api.a;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import io.reactivex.g;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.s;
import io.reactivex.z;

public class k implements a {
    private final v1 a;
    private final g<SessionState> b;
    private final tg0<yda> c;
    private final pea d;

    public k(v1 v1Var, g<SessionState> gVar, tg0<yda> tg0, pea pea) {
        this.a = v1Var;
        this.b = gVar;
        this.c = tg0;
        this.d = pea;
    }

    private io.reactivex.a b() {
        return this.b.E().t(d.a);
    }

    @Override // com.spotify.music.appprotocol.api.a
    public void a(qg0<bf2<?, ?>> qg0) {
        cf2 b2 = cf2.b(AppProtocolBase.Empty.class, AppProtocolBase.Empty.class);
        b2.d("com.spotify.volume.increase_volume");
        b2.c(64);
        b2.e(new b(this));
        qg0.accept(b2.a());
        cf2 b3 = cf2.b(AppProtocolBase.Empty.class, AppProtocolBase.Empty.class);
        b3.d("com.spotify.volume.decrease_volume");
        b3.c(64);
        b3.e(new e(this));
        qg0.accept(b3.a());
        cf2 b4 = cf2.b(VolumeLevel.class, AppProtocolBase.Empty.class);
        b4.d("com.spotify.volume.set_volume");
        b4.c(64);
        b4.e(new c(this));
        qg0.accept(b4.a());
    }

    public /* synthetic */ void c() {
        this.a.A3().c();
    }

    public /* synthetic */ void d() {
        this.a.A3().e();
    }

    public /* synthetic */ void e(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new VolumeOutOfRangeException();
        }
        this.a.A3().k(f);
    }

    public s f(AppProtocolBase.Empty empty) {
        s g = b().d(io.reactivex.a.u(new g(this))).g(s.i0(AppProtocolBase.a));
        z<String> b2 = this.d.b(this.c.get());
        b2.getClass();
        return g.E0(new i(b2).N());
    }

    public s g(AppProtocolBase.Empty empty) {
        s g = b().d(io.reactivex.a.u(new f(this))).g(s.i0(AppProtocolBase.a));
        z<String> d2 = this.d.d(this.c.get());
        d2.getClass();
        return g.E0(new i(d2).N());
    }

    public s h(VolumeLevel volumeLevel) {
        float volume = volumeLevel.volume();
        s g = b().g(io.reactivex.a.u(new a(this, volume)).g(s.i0(AppProtocolBase.a)));
        z<String> e = this.d.e(this.c.get(), volume);
        e.getClass();
        return g.E0(new i(e).N());
    }
}
