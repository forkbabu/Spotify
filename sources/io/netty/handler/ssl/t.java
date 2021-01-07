package io.netty.handler.ssl;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManagerFactory;

public final class t extends u {
    private final b0 C;

    t(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, d dVar, ApplicationProtocolConfig applicationProtocolConfig, long j, long j2) {
        super(iterable, dVar, applicationProtocolConfig, j, j2, 0, x509CertificateArr2, ClientAuth.NONE, false);
        try {
            this.C = e0.D(this, this.c, this.u, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory);
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // io.netty.handler.ssl.f0
    public a0 s() {
        return null;
    }

    @Override // io.netty.handler.ssl.f0
    public b0 w() {
        return this.C;
    }
}
