package com.spotify.zero.tracker.eventsender;

import com.google.protobuf.u;
import com.spotify.messages.ZeroFrictionAuthentication;
import java.util.Iterator;
import kotlin.jvm.internal.h;

public final class g implements f {
    private final gl0<u> a;
    private final a b;

    public g(gl0<u> gl0, a aVar) {
        h.e(gl0, "eventPublisherAdapter");
        h.e(aVar, "messages");
        this.a = gl0;
        this.b = aVar;
    }

    @Override // com.spotify.zero.tracker.eventsender.f
    public void a() {
        Iterator<T> it = this.b.remove().iterator();
        while (it.hasNext()) {
            this.a.c(it.next());
        }
    }

    @Override // com.spotify.zero.tracker.eventsender.f
    public void b(ZeroFrictionAuthentication zeroFrictionAuthentication) {
        h.e(zeroFrictionAuthentication, "message");
        this.b.a(zeroFrictionAuthentication);
    }

    @Override // com.spotify.zero.tracker.eventsender.f
    public void c(u uVar) {
        h.e(uVar, "message");
        this.a.d(uVar);
    }
}
