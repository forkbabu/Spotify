package io.netty.handler.ssl.util;

import io.netty.buffer.j;
import io.netty.buffer.j0;
import io.netty.handler.codec.base64.a;
import io.netty.util.h;
import io.netty.util.internal.logging.b;
import io.netty.util.internal.s;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Date;

public final class c {
    private static final b c = io.netty.util.internal.logging.c.b(c.class.getName());
    private static final Date d = new Date(s.d("io.netty.selfSignedCertificate.defaultNotBefore", System.currentTimeMillis() - 31536000000L));
    private static final Date e = new Date(s.d("io.netty.selfSignedCertificate.defaultNotAfter", 253402300799000L));
    private final File a;
    private final X509Certificate b;

    static {
        int i = io.netty.util.internal.logging.c.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083 A[SYNTHETIC, Splitter:B:29:0x0083] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c() {
        /*
            r9 = this;
            java.util.Date r0 = io.netty.handler.ssl.util.c.d
            java.util.Date r1 = io.netty.handler.ssl.util.c.e
            java.lang.String r2 = "example.com"
            java.security.SecureRandom r3 = io.netty.handler.ssl.util.ThreadLocalInsecureRandom.a()
            java.lang.String r4 = "Failed to close a file: "
            r9.<init>()
            java.lang.String r5 = "RSA"
            java.security.KeyPairGenerator r5 = java.security.KeyPairGenerator.getInstance(r5)     // Catch:{ NoSuchAlgorithmException -> 0x00ab }
            r6 = 1024(0x400, float:1.435E-42)
            r5.initialize(r6, r3)     // Catch:{ NoSuchAlgorithmException -> 0x00ab }
            java.security.KeyPair r5 = r5.generateKeyPair()     // Catch:{ NoSuchAlgorithmException -> 0x00ab }
            java.lang.String[] r0 = io.netty.handler.ssl.util.b.a(r2, r5, r3, r0, r1)     // Catch:{ all -> 0x0023 }
            goto L_0x002f
        L_0x0023:
            r6 = move-exception
            io.netty.util.internal.logging.b r7 = io.netty.handler.ssl.util.c.c
            java.lang.String r8 = "Failed to generate a self-signed X.509 certificate using sun.security.x509:"
            r7.t(r8, r6)
            java.lang.String[] r0 = io.netty.handler.ssl.util.a.a(r2, r5, r3, r0, r1)     // Catch:{ all -> 0x009b }
        L_0x002f:
            java.io.File r1 = new java.io.File
            r2 = 0
            r2 = r0[r2]
            r1.<init>(r2)
            r9.a = r1
            java.io.File r2 = new java.io.File
            r3 = 1
            r0 = r0[r3]
            r2.<init>(r0)
            r5.getPrivate()
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
            java.lang.String r0 = "X509"
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch:{ Exception -> 0x0072 }
            java.security.cert.Certificate r0 = r0.generateCertificate(r2)     // Catch:{ Exception -> 0x0072 }
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ Exception -> 0x0072 }
            r9.b = r0     // Catch:{ Exception -> 0x0072 }
            r2.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x006f
        L_0x005c:
            r0 = move-exception
            io.netty.util.internal.logging.b r1 = io.netty.handler.ssl.util.c.c
            java.lang.StringBuilder r2 = defpackage.je.V0(r4)
            java.io.File r3 = r9.a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.j(r2, r0)
        L_0x006f:
            return
        L_0x0070:
            r0 = move-exception
            goto L_0x007f
        L_0x0072:
            r0 = move-exception
            goto L_0x0079
        L_0x0074:
            r1 = move-exception
            goto L_0x0081
        L_0x0076:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x0079:
            java.security.cert.CertificateEncodingException r1 = new java.security.cert.CertificateEncodingException     // Catch:{ all -> 0x0070 }
            r1.<init>(r0)     // Catch:{ all -> 0x0070 }
            throw r1     // Catch:{ all -> 0x0070 }
        L_0x007f:
            r1 = r0
            r0 = r2
        L_0x0081:
            if (r0 == 0) goto L_0x009a
            r0.close()     // Catch:{ IOException -> 0x0087 }
            goto L_0x009a
        L_0x0087:
            r0 = move-exception
            io.netty.util.internal.logging.b r2 = io.netty.handler.ssl.util.c.c
            java.lang.StringBuilder r3 = defpackage.je.V0(r4)
            java.io.File r4 = r9.a
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.j(r3, r0)
        L_0x009a:
            throw r1
        L_0x009b:
            r0 = move-exception
            io.netty.util.internal.logging.b r1 = io.netty.handler.ssl.util.c.c
            java.lang.String r2 = "Failed to generate a self-signed X.509 certificate using Bouncy Castle:"
            r1.t(r2, r0)
            java.security.cert.CertificateException r0 = new java.security.cert.CertificateException
            java.lang.String r1 = "No provider succeeded to generate a self-signed certificate. See debug log for the root cause."
            r0.<init>(r1)
            throw r0
        L_0x00ab:
            r0 = move-exception
            java.lang.Error r1 = new java.lang.Error
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.util.c.<init>():void");
    }

    /* JADX INFO: finally extract failed */
    static String[] b(String str, PrivateKey privateKey, X509Certificate x509Certificate) {
        j e2 = j0.e(privateKey.getEncoded());
        try {
            j b2 = a.b(e2, true);
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("-----BEGIN PRIVATE KEY-----\n");
                Charset charset = h.f;
                sb.append(b2.L1(charset));
                sb.append("\n-----END PRIVATE KEY-----\n");
                String sb2 = sb.toString();
                b2.d();
                e2.d();
                File createTempFile = File.createTempFile("keyutil_" + str + '_', ".key");
                createTempFile.deleteOnExit();
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                try {
                    fileOutputStream.write(sb2.getBytes(charset));
                    fileOutputStream.close();
                    j e3 = j0.e(x509Certificate.getEncoded());
                    try {
                        j b3 = a.b(e3, true);
                        try {
                            String str2 = "-----BEGIN CERTIFICATE-----\n" + b3.L1(charset) + "\n-----END CERTIFICATE-----\n";
                            b3.d();
                            e3.d();
                            File createTempFile2 = File.createTempFile("keyutil_" + str + '_', ".crt");
                            createTempFile2.deleteOnExit();
                            FileOutputStream fileOutputStream2 = new FileOutputStream(createTempFile2);
                            try {
                                fileOutputStream2.write(str2.getBytes(charset));
                                fileOutputStream2.close();
                                return new String[]{createTempFile2.getPath(), createTempFile.getPath()};
                            } catch (Throwable th) {
                                c(createTempFile2, fileOutputStream2);
                                d(createTempFile2);
                                d(createTempFile);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            b3.d();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        e3.d();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    c(createTempFile, fileOutputStream);
                    d(createTempFile);
                    throw th4;
                }
            } catch (Throwable th5) {
                b2.d();
                throw th5;
            }
        } catch (Throwable th6) {
            e2.d();
            throw th6;
        }
    }

    private static void c(File file, OutputStream outputStream) {
        try {
            outputStream.close();
        } catch (IOException e2) {
            b bVar = c;
            bVar.j("Failed to close a file: " + file, e2);
        }
    }

    private static void d(File file) {
        if (!file.delete()) {
            b bVar = c;
            bVar.v("Failed to delete a file: " + file);
        }
    }

    public X509Certificate a() {
        return this.b;
    }
}
