package io.netty.handler.ssl;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.util.Date;
import javax.security.cert.CertificateException;
import javax.security.cert.X509Certificate;

final class z extends X509Certificate {
    private final byte[] a;
    private X509Certificate b;

    public z(byte[] bArr) {
        this.a = bArr;
    }

    private X509Certificate a() {
        X509Certificate x509Certificate = this.b;
        if (x509Certificate != null) {
            return x509Certificate;
        }
        try {
            X509Certificate instance = X509Certificate.getInstance(this.a);
            this.b = instance;
            return instance;
        } catch (CertificateException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // javax.security.cert.X509Certificate
    public void checkValidity() {
        a().checkValidity();
    }

    @Override // javax.security.cert.Certificate
    public byte[] getEncoded() {
        return (byte[]) this.a.clone();
    }

    @Override // javax.security.cert.X509Certificate
    public Principal getIssuerDN() {
        return a().getIssuerDN();
    }

    @Override // javax.security.cert.X509Certificate
    public Date getNotAfter() {
        return a().getNotAfter();
    }

    @Override // javax.security.cert.X509Certificate
    public Date getNotBefore() {
        return a().getNotBefore();
    }

    @Override // javax.security.cert.Certificate
    public PublicKey getPublicKey() {
        return a().getPublicKey();
    }

    @Override // javax.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return a().getSerialNumber();
    }

    @Override // javax.security.cert.X509Certificate
    public String getSigAlgName() {
        return a().getSigAlgName();
    }

    @Override // javax.security.cert.X509Certificate
    public String getSigAlgOID() {
        return a().getSigAlgOID();
    }

    @Override // javax.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        return a().getSigAlgParams();
    }

    @Override // javax.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return a().getSubjectDN();
    }

    @Override // javax.security.cert.X509Certificate
    public int getVersion() {
        return a().getVersion();
    }

    @Override // java.lang.Object, javax.security.cert.Certificate
    public String toString() {
        return a().toString();
    }

    @Override // javax.security.cert.Certificate
    public void verify(PublicKey publicKey) {
        a().verify(publicKey);
    }

    @Override // javax.security.cert.X509Certificate
    public void checkValidity(Date date) {
        a().checkValidity(date);
    }

    @Override // javax.security.cert.Certificate
    public void verify(PublicKey publicKey, String str) {
        a().verify(publicKey, str);
    }
}
