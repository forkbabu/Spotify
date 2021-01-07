package com.spotify.remoteconfig.client.network;

import com.spotify.rcs.resolver.grpc.v0.Configuration;
import com.spotify.rcs.resolver.grpc.v0.ResolveResponse;
import com.spotify.remoteconfig.client.logging.EventLogger;
import com.spotify.remoteconfig.client.logging.a;
import com.spotify.remoteconfig.client.model.resolve.FetchType;
import com.spotify.ucs.proto.v0.UcsResponseWrapper;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;
import retrofit2.v;

/* access modifiers changed from: package-private */
public final class e<T> implements g<v<UcsResponseWrapper>> {
    final /* synthetic */ i a;
    final /* synthetic */ FetchType b;

    e(i iVar, FetchType fetchType) {
        this.a = iVar;
        this.b = fetchType;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(v<UcsResponseWrapper> vVar) {
        String str;
        ResolveResponse l;
        Configuration h;
        v<UcsResponseWrapper> vVar2 = vVar;
        h.f(vVar2, "response");
        this.a.g.getClass();
        long currentTimeMillis = System.currentTimeMillis() - this.a.a;
        trf.d("UCS responded in %d ms with code %d ", Long.valueOf(currentTimeMillis), Integer.valueOf(this.a.j(vVar2)));
        trf.e("UCS body %s", vVar2.a());
        UcsResponseWrapper a2 = vVar2.a();
        if (!vVar2.f() || a2 == null) {
            i.h(this.a, currentTimeMillis, this.b, vVar2);
        } else if (a2.i() == UcsResponseWrapper.ResultCase.ERROR) {
            EventLogger eventLogger = this.a.f;
            FetchType fetchType = this.b;
            c0e c0e = this.a.d;
            EventLogger.FetchErrorReason fetchErrorReason = EventLogger.FetchErrorReason.UCS_RESPONSE_WRAPPER_ERROR;
            UcsResponseWrapper.Error h2 = a2.h();
            h.b(h2, "responseBody.error");
            String l2 = h2.l();
            UcsResponseWrapper.Error h3 = a2.h();
            h.b(h3, "responseBody.error");
            ((a) eventLogger).c(fetchType, currentTimeMillis, c0e, fetchErrorReason, l2, h3.i());
        } else {
            UcsResponseWrapper.UcsResponse l3 = a2.l();
            if (l3 == null || (l = l3.l()) == null || (h = l.h()) == null || (str = h.i()) == null) {
                str = "";
            }
            UcsResponseWrapper.UcsResponse l4 = a2.l();
            ((a) this.a.f).d(this.b, currentTimeMillis, a2.getSerializedSize(), this.a.d, str, l4 != null ? Long.valueOf(l4.i()) : null);
        }
    }
}
