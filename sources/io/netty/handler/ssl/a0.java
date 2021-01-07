package io.netty.handler.ssl;

import io.netty.buffer.k;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.net.ssl.SSLException;
import javax.net.ssl.X509KeyManager;
import org.apache.tomcat.jni.SSL;

class a0 {
    private static final Map<String, String> c;
    private final X509KeyManager a;
    private final String b;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("RSA", "RSA");
        hashMap.put("DHE_RSA", "RSA");
        hashMap.put("ECDHE_RSA", "RSA");
        hashMap.put("ECDHE_ECDSA", "EC");
        hashMap.put("ECDH_RSA", "EC_RSA");
        hashMap.put("ECDH_ECDSA", "EC_EC");
        hashMap.put("DH_RSA", "DH_RSA");
    }

    a0(X509KeyManager x509KeyManager, String str) {
        this.a = x509KeyManager;
        this.b = str;
    }

    private void b(long j, String str) {
        long j2;
        long j3;
        Throwable th;
        Exception e;
        Throwable th2;
        long j4 = 0;
        try {
            X509Certificate[] certificateChain = this.a.getCertificateChain(str);
            if (certificateChain != null) {
                if (certificateChain.length != 0) {
                    PrivateKey privateKey = this.a.getPrivateKey(str);
                    k kVar = k.a;
                    c0 b2 = PemX509Certificate.b(kVar, true, certificateChain);
                    try {
                        j2 = f0.A(kVar, b2.h());
                        try {
                            long A = f0.A(kVar, b2.h());
                            if (privateKey != null) {
                                try {
                                    j4 = f0.B(privateKey);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    b2.d();
                                    throw th2;
                                }
                            }
                            j3 = A;
                        } catch (Throwable th4) {
                            th2 = th4;
                            b2.d();
                            throw th2;
                        }
                        try {
                            SSL.setCertificateBio(j, j2, j4, this.b);
                            SSL.setCertificateChainBio(j, j3, true);
                            b2.d();
                            f0.r(j4);
                            f0.r(j2);
                            f0.r(j3);
                            return;
                        } catch (Throwable th5) {
                            th2 = th5;
                            b2.d();
                            throw th2;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        b2.d();
                        throw th2;
                    }
                }
            }
            f0.r(0);
            f0.r(0);
            f0.r(0);
        } catch (SSLException e2) {
            throw e2;
        } catch (Exception e3) {
            e = e3;
            j3 = 0;
            j2 = 0;
            throw new SSLException(e);
        } catch (SSLException e4) {
            throw e4;
        } catch (Exception e5) {
            e = e5;
            throw new SSLException(e);
        } catch (Throwable th7) {
            th = th7;
            f0.r(j4);
            f0.r(j2);
            f0.r(j3);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public String a(ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine, String str) {
        return this.a.chooseServerAlias(str, null, null);
    }

    /* access modifiers changed from: package-private */
    public void c(ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine) {
        String a2;
        long K = referenceCountedOpenSslEngine.K();
        String[] authenticationMethods = SSL.authenticationMethods(K);
        HashSet hashSet = new HashSet(authenticationMethods.length);
        for (String str : authenticationMethods) {
            String str2 = c.get(str);
            if (!(str2 == null || (a2 = a(referenceCountedOpenSslEngine, str2)) == null || !hashSet.add(a2))) {
                b(K, a2);
            }
        }
    }
}
