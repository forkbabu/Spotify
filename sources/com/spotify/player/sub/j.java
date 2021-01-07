package com.spotify.player.sub;

import com.spotify.cosmos.router.RxRouter;
import com.spotify.player.esperanto.proto.k;
import com.spotify.remoteconfig.rj;
import kotlin.jvm.internal.h;

public final class j {

    static final class a<T> implements ajf<k.b> {
        final /* synthetic */ RxRouter a;

        a(RxRouter rxRouter) {
            this.a = rxRouter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.ajf
        public k.b get() {
            return k.a(new xj0(new k(new ImmediatePlayerSubscriptionsKt$createImmediatePlayerSubscriptions$1$1(this.a))));
        }
    }

    public static final l a(RxRouter rxRouter, ajf<pxd> ajf, rj rjVar) {
        h.e(rxRouter, "rxRouter");
        h.e(ajf, "serializer");
        h.e(rjVar, "libsPlayerCosmosProperties");
        a aVar = new a(rxRouter);
        h.e(rxRouter, "rxRouter");
        h.e(ajf, "serializer");
        h.e(aVar, "playerClient");
        h.e(rjVar, "libsPlayerCosmosProperties");
        if (!rjVar.a()) {
            return new h(rxRouter, ajf.get());
        }
        Object obj = aVar.get();
        h.d(obj, "playerClient.get()");
        return new EsperantoPlayerSubscriptions((k.b) obj);
    }
}
