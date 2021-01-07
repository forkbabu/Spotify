package io.netty.handler.ssl;

import io.netty.buffer.j;
import io.netty.buffer.j0;
import io.netty.buffer.k;
import io.netty.util.IllegalReferenceCountException;
import io.netty.util.h;
import io.netty.util.o;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;

public final class PemX509Certificate extends X509Certificate implements c0 {
    private static final byte[] a;
    private static final byte[] b;
    private final j content;

    static {
        Charset charset = h.f;
        a = "-----BEGIN CERTIFICATE-----\n".getBytes(charset);
        b = "\n-----END CERTIFICATE-----\n".getBytes(charset);
    }

    private static j a(k kVar, boolean z, X509Certificate x509Certificate, int i, j jVar) {
        j e = j0.e(x509Certificate.getEncoded());
        try {
            j a2 = b.a(kVar, e);
            if (jVar == null) {
                try {
                    int length = (a.length + a2.m1() + b.length) * i;
                    jVar = z ? kVar.h(length) : kVar.j(length);
                } catch (Throwable th) {
                    a2.d();
                    throw th;
                }
            }
            jVar.U1(a);
            jVar.R1(a2);
            jVar.U1(b);
            a2.d();
            return jVar;
        } finally {
            e.d();
        }
    }

    static c0 b(k kVar, boolean z, X509Certificate... x509CertificateArr) {
        j jVar;
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new IllegalArgumentException("X.509 certificate chain can't be null or empty");
        }
        if (x509CertificateArr.length == 1) {
            X509Certificate x509Certificate = x509CertificateArr[0];
            if (x509Certificate instanceof c0) {
                return ((c0) x509Certificate).h();
            }
        }
        j jVar2 = null;
        try {
            for (X509Certificate x509Certificate2 : x509CertificateArr) {
                if (x509Certificate2 != null) {
                    if (x509Certificate2 instanceof c0) {
                        int length = x509CertificateArr.length;
                        j content2 = ((c0) x509Certificate2).content();
                        if (jVar2 == null) {
                            int m1 = content2.m1() * length;
                            jVar = z ? kVar.h(m1) : kVar.j(m1);
                        } else {
                            jVar = jVar2;
                        }
                        jVar.R1(content2.J1());
                        jVar2 = jVar;
                    } else {
                        jVar2 = a(kVar, z, x509Certificate2, x509CertificateArr.length, jVar2);
                    }
                } else {
                    throw new IllegalArgumentException("Null element in chain: " + Arrays.toString(x509CertificateArr));
                }
            }
            return new d0(jVar2, false);
        } catch (Throwable th) {
            if (0 != 0) {
                jVar2.d();
            }
            throw th;
        }
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() {
        throw new UnsupportedOperationException();
    }

    @Override // io.netty.buffer.l
    public j content() {
        int n = n();
        if (n > 0) {
            return this.content;
        }
        throw new IllegalReferenceCountException(n);
    }

    @Override // io.netty.util.o
    public boolean d() {
        return this.content.d();
    }

    @Override // java.security.cert.Certificate, java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PemX509Certificate)) {
            return false;
        }
        return this.content.equals(((PemX509Certificate) obj).content);
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getCriticalExtensionOIDs() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getNonCriticalExtensionOIDs() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        throw new UnsupportedOperationException();
    }

    @Override // io.netty.handler.ssl.c0
    public c0 h() {
        this.content.t1();
        return this;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.Certificate, java.lang.Object
    public int hashCode() {
        return this.content.hashCode();
    }

    @Override // io.netty.util.o
    public int n() {
        return this.content.n();
    }

    @Override // java.security.cert.Certificate, java.lang.Object
    public String toString() {
        return this.content.L1(h.d);
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey) {
        throw new UnsupportedOperationException();
    }

    @Override // io.netty.handler.ssl.c0
    public boolean x() {
        return false;
    }

    @Override // io.netty.util.o
    public o z(Object obj) {
        this.content.z(obj);
        return this;
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) {
        throw new UnsupportedOperationException();
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey, String str) {
        throw new UnsupportedOperationException();
    }
}
