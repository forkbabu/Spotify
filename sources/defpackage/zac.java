package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.libs.performance.tracking.h0;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.pageloader.NetworkErrorReason;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.o0;
import com.spotify.pageloader.t0;
import com.spotify.pageloader.y0;
import io.reactivex.s;
import io.reactivex.z;

/* renamed from: zac  reason: default package */
public class zac {
    private final t a;
    private final z<NetworkErrorReason> b;
    private final s<ng0> c;
    private final h0 d;
    private final ere e;
    private final Optional<Runnable> f;

    public zac(t tVar, z<NetworkErrorReason> zVar, s<ng0> sVar, h0 h0Var, ere ere, Optional<Runnable> optional) {
        this.a = tVar;
        this.b = zVar;
        this.c = sVar;
        this.d = h0Var;
        this.e = ere;
        this.f = optional;
    }

    public <T> t0<T> a(o0<T> o0Var) {
        return new y0(s.b1(o0Var.b().q(new xtd(10)).x0(mud.a)).q(new vtd(this.c)).q(new gud(this.b)));
    }

    public <T> PageLoaderView.a<T> b(c cVar, ij9 ij9) {
        PageLoaderView.a<T> aVar = new PageLoaderView.a<>();
        aVar.i(uac.a);
        aVar.c(new vac(this));
        aVar.d(new xac(this.e));
        aVar.f(new hbc(this.d, cVar, ij9));
        if (this.f.isPresent()) {
            aVar.h(this.f.get());
        }
        return aVar;
    }

    public /* synthetic */ void c() {
        this.a.d("spotify:internal:preferences");
    }
}
