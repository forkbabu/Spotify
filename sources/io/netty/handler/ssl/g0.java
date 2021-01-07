package io.netty.handler.ssl;

import io.netty.buffer.k;
import io.netty.util.internal.c;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManagerFactory;

public abstract class g0 {
    static final CertificateFactory b;
    private final boolean a;

    static {
        try {
            b = CertificateFactory.getInstance("X.509");
        } catch (CertificateException e) {
            throw new IllegalStateException("unable to instance X.509 CertificateFactory", e);
        }
    }

    protected g0() {
        this.a = false;
    }

    static KeyManagerFactory a(X509Certificate[] x509CertificateArr, PrivateKey privateKey, String str, KeyManagerFactory keyManagerFactory) {
        String property = Security.getProperty("ssl.KeyManagerFactory.algorithm");
        if (property == null) {
            property = "SunX509";
        }
        char[] charArray = str == null ? c.b : str.toCharArray();
        KeyStore instance = KeyStore.getInstance("JKS");
        instance.load(null, null);
        instance.setKeyEntry("key", privateKey, charArray, x509CertificateArr);
        if (keyManagerFactory == null) {
            keyManagerFactory = KeyManagerFactory.getInstance(property);
        }
        keyManagerFactory.init(instance, charArray);
        return keyManagerFactory;
    }

    static TrustManagerFactory b(X509Certificate[] x509CertificateArr, TrustManagerFactory trustManagerFactory) {
        KeyStore instance = KeyStore.getInstance("JKS");
        instance.load(null, null);
        int i = 1;
        for (X509Certificate x509Certificate : x509CertificateArr) {
            instance.setCertificateEntry(Integer.toString(i), x509Certificate);
            i++;
        }
        if (trustManagerFactory == null) {
            trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        }
        trustManagerFactory.init(instance);
        return trustManagerFactory;
    }

    public abstract boolean c();

    public final boolean e() {
        return !c();
    }

    public abstract SSLEngine f(k kVar, String str, int i);

    public final j0 g(k kVar, String str, int i) {
        return new j0(f(kVar, str, i), this.a);
    }

    protected g0(boolean z) {
        this.a = z;
    }
}
