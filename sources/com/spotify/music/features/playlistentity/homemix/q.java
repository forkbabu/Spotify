package com.spotify.music.features.playlistentity.homemix;

import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.connection.l;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixPlanType;
import com.spotify.playlist.endpoints.i;
import com.spotify.rxjava2.p;
import io.reactivex.android.schedulers.a;
import io.reactivex.d0;
import io.reactivex.z;
import retrofit2.v;

public class q {
    private final String a;
    private final af6 b;
    private final i c;
    private final vb6 d;
    private final ye6<v<Void>> e;
    private final p f = new p();

    public q(af6 af6, String str, i iVar, l lVar, vb6 vb6) {
        this.a = str;
        this.b = af6;
        this.c = iVar;
        this.d = vb6;
        this.e = new ye6<>(lVar, c.a);
    }

    public /* synthetic */ d0 a(xe6 xe6) {
        if (xe6.i()) {
            return this.c.d(this.a).h(z.z(xe6));
        }
        return z.z(xe6);
    }

    public /* synthetic */ void b(boolean z, HomeMixPlanType homeMixPlanType, xe6 xe6) {
        Logger.b(xe6.toString(), new Object[0]);
        if (xe6.g()) {
            return;
        }
        if (xe6.f()) {
            this.b.b();
        } else if (xe6.h()) {
            this.b.f();
        } else if (z) {
            this.b.h(homeMixPlanType.i());
        } else {
            this.b.i(homeMixPlanType.i());
        }
    }

    public /* synthetic */ void c(Throwable th) {
        Logger.d(th.getMessage(), new Object[0]);
        this.b.b();
    }

    public void d(com.spotify.music.features.playlistentity.homemix.models.i iVar, HomeMixPlanType homeMixPlanType) {
        iVar.getClass();
        boolean z = !iVar.d();
        this.f.b(this.d.a(ImmutableMap.of("enabled", Boolean.valueOf(z))).f(this.e).s(new d(this)).P().G0((R) xe6.j()).o0(a.b()).subscribe(new a(this, z, homeMixPlanType), new b(this)));
    }

    public void e() {
        this.f.a();
    }
}
