package io.netty.handler.ssl;

import io.netty.buffer.k;
import io.netty.util.n;
import java.security.cert.Certificate;
import java.util.Set;
import javax.net.ssl.SSLEngine;

public abstract class u extends f0 {
    u(Iterable<String> iterable, d dVar, ApplicationProtocolConfig applicationProtocolConfig, long j, long j2, int i, Certificate[] certificateArr, ClientAuth clientAuth, boolean z) {
        super(iterable, dVar, applicationProtocolConfig, j, j2, i, certificateArr, clientAuth, z, false);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        super.finalize();
        Set<String> set = q.c;
        if (n() > 0) {
            n.b(this);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // io.netty.handler.ssl.f0
    public final SSLEngine v(k kVar, String str, int i) {
        return new w(this, kVar, str, i);
    }
}
