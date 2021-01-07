package com.spotify.remoteconfig.client.network;

import com.google.protobuf.GeneratedMessageLite;
import com.spotify.remoteconfig.client.logging.EventLogger;
import com.spotify.remoteconfig.client.logging.a;
import com.spotify.remoteconfig.client.model.resolve.FetchType;
import com.spotify.ucs.proto.v0.UcsRequest;
import com.spotify.ucs.proto.v0.UcsResponseWrapper;
import io.reactivex.disposables.b;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;
import okhttp3.e0;
import retrofit2.v;

public final class i implements b {
    private long a;
    private final g<b> b = new g(this);
    private final g<v<UcsResponseWrapper>> c = new h(this);
    private final c0e d;
    private final j e;
    private final EventLogger f;
    private final a g;

    public i(c0e c0e, j jVar, EventLogger eventLogger, a aVar) {
        h.f(c0e, "clientAttributes");
        h.f(jVar, "service");
        h.f(eventLogger, "logger");
        h.f(aVar, "clock");
        this.d = c0e;
        this.e = jVar;
        this.f = eventLogger;
        this.g = aVar;
    }

    public static final void h(i iVar, long j, FetchType fetchType, v vVar) {
        String str;
        e0 d2;
        iVar.getClass();
        h.f(vVar, "$this$getErrorMessage");
        String c2 = vVar.e().c("grpc-message");
        if (c2 == null && ((d2 = vVar.d()) == null || (c2 = d2.m()) == null || !(!h.a(c2, "")))) {
            c2 = null;
        }
        if (c2 == null) {
            c2 = vVar.g();
        }
        if (c2 != null) {
            str = c2;
        } else {
            str = "";
        }
        trf.b("There was an error returned from UCS. code: %d body: %s", Integer.valueOf(iVar.j(vVar)), str);
        ((a) iVar.f).c(fetchType, j, iVar.d, EventLogger.FetchErrorReason.SERVER_ERROR, str, iVar.j(vVar));
    }

    /* access modifiers changed from: private */
    public final int j(v<UcsResponseWrapper> vVar) {
        if (vVar != null) {
            return vVar.b();
        }
        return -1;
    }

    @Override // com.spotify.remoteconfig.client.network.b
    public io.reactivex.a a(FetchType fetchType, g0e g0e) {
        h.f(fetchType, "fetchType");
        h.f(g0e, "sdkProperties");
        c0e c0e = this.d;
        boolean a2 = g0e.a();
        UcsRequest.b m = UcsRequest.m();
        UcsRequest.CallerInfo.a m2 = UcsRequest.CallerInfo.m();
        m2.o(c0e.a());
        m2.n(c0e.b());
        m2.m(fetchType.name());
        m.n(m2);
        m.o(d.h(c0e, fetchType));
        if (a2) {
            m.m(UcsRequest.AccountAttributesRequest.h());
        }
        GeneratedMessageLite build = m.build();
        h.b(build, "requestBuilder.build()");
        io.reactivex.a B = new io.reactivex.internal.operators.completable.i(this.e.a((UcsRequest) build).o(this.b).p(this.c).f(new m(3, 500)).p(new e(this, fetchType)).m(new f(this, fetchType))).B();
        h.b(B, "service.resolve(request)…       .onErrorComplete()");
        return B;
    }

    @Override // com.spotify.remoteconfig.client.network.b
    public io.reactivex.a b(FetchType fetchType) {
        h.f(fetchType, "fetchType");
        trf.d("Making UCS request with default property values", new Object[0]);
        return a(fetchType, new g0e(false, 1));
    }
}
