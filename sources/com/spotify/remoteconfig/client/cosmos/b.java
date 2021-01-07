package com.spotify.remoteconfig.client.cosmos;

import io.reactivex.a;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

public final class b implements a {
    private c a;

    public b(c cVar) {
        this.a = cVar;
    }

    public a a() {
        a clearStorage;
        c cVar = this.a;
        if (cVar != null && (clearStorage = cVar.clearStorage()) != null) {
            return clearStorage.H(1500, TimeUnit.MILLISECONDS).G(io.reactivex.schedulers.a.c()).B();
        }
        a aVar = io.reactivex.internal.operators.completable.b.a;
        h.b(aVar, "Completable.complete()");
        return aVar;
    }

    public z<Boolean> b(d0e d0e) {
        a injectForBootstrap;
        h.f(d0e, "rawConfiguration");
        c cVar = this.a;
        if (cVar != null && (injectForBootstrap = cVar.injectForBootstrap(CoreConfigurationRequest.c.create(d0e.c()))) != null) {
            return injectForBootstrap.P(Boolean.TRUE);
        }
        z<Boolean> z = z.z(Boolean.FALSE);
        h.b(z, "Single.just(false)");
        return z;
    }

    public z<Boolean> c(d0e d0e) {
        a injectForNextSession;
        h.f(d0e, "rawConfiguration");
        c cVar = this.a;
        if (cVar != null && (injectForNextSession = cVar.injectForNextSession(CoreConfigurationRequest.c.create(d0e.c()))) != null) {
            return injectForNextSession.P(Boolean.TRUE);
        }
        z<Boolean> z = z.z(Boolean.FALSE);
        h.b(z, "Single.just(false)");
        return z;
    }
}
