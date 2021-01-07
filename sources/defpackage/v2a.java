package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.rcs.model.proto.Bootstrap$BootstrapRequest;
import com.spotify.rcs.model.proto.Bootstrap$BootstrapResponse;
import com.spotify.rcs.model.proto.Bootstrap$RemoteConfigRequestV1;
import com.spotify.rcs.model.proto.Bootstrap$RemoteConfigResponseV1;
import com.spotify.rcs.model.proto.Platform;
import io.reactivex.b0;
import io.reactivex.disposables.b;
import io.reactivex.y;
import io.reactivex.z;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import okhttp3.e;
import retrofit2.adapter.rxjava2.g;
import retrofit2.c;
import retrofit2.v;
import retrofit2.w;

/* renamed from: v2a  reason: default package */
public class v2a implements u2a {
    private final x2a a;
    private final y b;
    private final w c;
    private final e0e d;
    private final cqe e;
    private final q2a f;
    private final o2a g;
    private long h;

    public v2a(x2a x2a, y yVar, w wVar, e0e e0e, cqe cqe, q2a q2a, o2a o2a) {
        this.a = x2a;
        this.b = yVar;
        this.c = wVar;
        this.d = e0e;
        this.e = cqe;
        this.f = q2a;
        this.g = o2a;
    }

    public static void c(v2a v2a, b0 b0Var) {
        long d2 = v2a.e.d() - v2a.h;
        Logger.n("The Observable for Bootstrap timed out after %d ms. Will default to BootstrapDataDefault", Long.valueOf(d2));
        v2a.f.b(d2, null);
        b0Var.onSuccess(new z2a());
    }

    public static void d(v2a v2a, v vVar, Throwable th) {
        long d2 = v2a.e.d() - v2a.h;
        Logger.l("Bootstrap took %d ms", Long.valueOf(d2));
        if (th != null) {
            Logger.e(th, "There was an error when calling the bootstrap service.", new Object[0]);
            if (th instanceof SocketTimeoutException) {
                v2a.f.b(d2, null);
            } else {
                v2a.f.c(d2, vVar != null ? vVar.b() : -1, -1, "unknown", th.getMessage());
            }
        } else if (vVar != null) {
            int serializedSize = vVar.a() != null ? ((Bootstrap$BootstrapResponse) vVar.a()).getSerializedSize() : -1;
            Logger.g("Bootstrap responded with code=%d and payload size=%d", Integer.valueOf(vVar.b()), Integer.valueOf(serializedSize));
            Logger.l("Bootstrap body: %s", vVar.a());
            if (!vVar.f()) {
                Logger.d("There was an error returned from Bootstrap. code: %d", Integer.valueOf(vVar.b()));
                if (vVar.b() == 504 || vVar.b() == 408) {
                    v2a.f.b(d2, Integer.valueOf(vVar.b()));
                } else {
                    v2a.f.c(d2, vVar.b(), serializedSize, "invalid_bootstrap_response", vVar.g());
                }
            } else if (vVar.a() == null || ((Bootstrap$BootstrapResponse) vVar.a()).i().l() == Bootstrap$RemoteConfigResponseV1.ResultCase.SUCCESS) {
                v2a.f.a(d2, vVar.b(), serializedSize);
            } else {
                v2a.f.c(d2, vVar.b(), serializedSize, ((Bootstrap$BootstrapResponse) vVar.a()).i().i().i() == 404 ? "no_properties_published" : "invalid_rcs_payload", ((Bootstrap$BootstrapResponse) vVar.a()).i().i().l());
            }
        }
    }

    private z<y2a> h(e.a aVar) {
        w.b bVar = new w.b();
        bVar.d(this.c.a());
        bVar.f(aVar);
        bVar.b(gqf.c());
        boolean z = false;
        for (c.a aVar2 : this.c.c()) {
            if (aVar2 instanceof g) {
                z = true;
            }
            bVar.a(aVar2);
        }
        if (!z) {
            bVar.a(g.e());
        }
        Bootstrap$BootstrapRequest.a i = Bootstrap$BootstrapRequest.i();
        Bootstrap$RemoteConfigRequestV1.a o = Bootstrap$RemoteConfigRequestV1.o();
        o.m(this.a.c());
        o.n(this.a.d());
        o.o(Platform.ANDROID);
        o.p(this.a.f());
        o.q(this.a.b());
        i.m((Bootstrap$RemoteConfigRequestV1) o.build());
        return ((b3a) bVar.e().d(b3a.class)).a((Bootstrap$BootstrapRequest) i.build()).o(new m2a(this)).n(new l2a(this)).A(new p2a());
    }

    @Override // defpackage.u2a
    public z<y2a> a(e.a aVar) {
        return h(aVar).P().V(new j2a(this), h2a.a).T();
    }

    @Override // defpackage.u2a
    public z<y2a> b(e.a aVar, boolean z) {
        return h(aVar).K((long) this.g.a(), TimeUnit.MILLISECONDS, this.b, new k2a(this)).P().V(new g2a(this, z), i2a.a).s0((R) new z2a()).T();
    }

    public /* synthetic */ io.reactivex.v e(boolean z, y2a y2a) {
        return this.d.j(y2a.c(), z).P();
    }

    public /* synthetic */ io.reactivex.v f(y2a y2a) {
        return this.d.i(y2a.c()).P();
    }

    public void g(b bVar) {
        this.h = this.e.d();
        Logger.l("Bootstrap latency timer started", new Object[0]);
    }
}
