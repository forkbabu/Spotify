package io.netty.handler.ssl;

import io.netty.handler.ssl.f0;
import io.netty.util.internal.PlatformDependent;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import org.apache.tomcat.jni.CertificateRequestedCallback;
import org.apache.tomcat.jni.SSLContext;

public final class e0 extends f0 {
    private final b0 C;

    /* access modifiers changed from: private */
    public static final class a extends f0.e {
        a(x xVar, X509ExtendedTrustManager x509ExtendedTrustManager) {
            super(xVar);
        }
    }

    /* access modifiers changed from: private */
    public static final class b implements CertificateRequestedCallback {
        b(x xVar, a0 a0Var) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends b0 {
        c(f0 f0Var) {
            super(f0Var);
        }

        @Override // javax.net.ssl.SSLSessionContext
        public int getSessionCacheSize() {
            return 0;
        }

        @Override // javax.net.ssl.SSLSessionContext
        public int getSessionTimeout() {
            return 0;
        }

        @Override // javax.net.ssl.SSLSessionContext
        public void setSessionCacheSize(int i) {
            if (i < 0) {
                throw new IllegalArgumentException();
            }
        }

        @Override // javax.net.ssl.SSLSessionContext
        public void setSessionTimeout(int i) {
            if (i < 0) {
                throw new IllegalArgumentException();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final class d extends f0.e {
        d(x xVar, X509TrustManager x509TrustManager) {
            super(xVar);
        }
    }

    static {
        int i = io.netty.util.internal.logging.c.b;
        io.netty.util.internal.logging.c.b(e0.class.getName());
    }

    e0(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory, Iterable<String> iterable, d dVar, ApplicationProtocolConfig applicationProtocolConfig, long j, long j2) {
        super(iterable, dVar, applicationProtocolConfig, j, j2, 0, (Certificate[]) x509CertificateArr2, ClientAuth.NONE, false, true);
        try {
            this.C = D(this, this.c, this.u, x509CertificateArr, trustManagerFactory, x509CertificateArr2, privateKey, str, keyManagerFactory);
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    static b0 D(f0 f0Var, long j, x xVar, X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory, X509Certificate[] x509CertificateArr2, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory) {
        if ((privateKey != null || x509CertificateArr2 == null) && (privateKey == null || x509CertificateArr2 != null)) {
            synchronized (f0.class) {
                try {
                    boolean z = true;
                    if (q.h()) {
                        if (keyManagerFactory == null && x509CertificateArr2 != null) {
                            keyManagerFactory = g0.a(x509CertificateArr2, privateKey, str, keyManagerFactory);
                        }
                        if (keyManagerFactory != null) {
                            X509KeyManager p = f0.p(keyManagerFactory.getKeyManagers());
                            SSLContext.setCertRequestedCallback(j, new b(xVar, PlatformDependent.J() >= 7 && (p instanceof X509ExtendedKeyManager) ? new y((X509ExtendedKeyManager) p, str) : new a0(p, str)));
                        }
                    } else if (keyManagerFactory != null) {
                        throw new IllegalArgumentException("KeyManagerFactory not supported");
                    } else if (x509CertificateArr2 != null) {
                        f0.y(j, x509CertificateArr2, privateKey, str);
                    }
                    SSLContext.setVerify(j, 0, 10);
                    if (x509CertificateArr != null) {
                        try {
                            trustManagerFactory = g0.b(x509CertificateArr, trustManagerFactory);
                        } catch (Exception e) {
                            throw new SSLException("unable to setup trustmanager", e);
                        }
                    } else if (trustManagerFactory == null) {
                        trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                    }
                    X509TrustManager o = f0.o(trustManagerFactory.getTrustManagers());
                    if (PlatformDependent.J() < 7 || !(o instanceof X509ExtendedTrustManager)) {
                        z = false;
                    }
                    if (z) {
                        SSLContext.setCertVerifyCallback(j, new a(xVar, (X509ExtendedTrustManager) o));
                    } else {
                        SSLContext.setCertVerifyCallback(j, new d(xVar, o));
                    }
                } catch (Exception e2) {
                    throw new SSLException("failed to set certificate and key", e2);
                }
            }
            return new c(f0Var);
        }
        throw new IllegalArgumentException("Either both keyCertChain and key needs to be null or none of them");
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
