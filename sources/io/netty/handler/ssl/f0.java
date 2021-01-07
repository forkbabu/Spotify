package io.netty.handler.ssl;

import io.netty.buffer.j;
import io.netty.buffer.k;
import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.util.ResourceLeakDetector;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.s;
import io.netty.util.o;
import io.netty.util.p;
import io.netty.util.q;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import org.apache.tomcat.jni.CertificateVerifier;
import org.apache.tomcat.jni.Pool;
import org.apache.tomcat.jni.SSL;
import org.apache.tomcat.jni.SSLContext;

public abstract class f0 extends g0 implements o {
    private static final ResourceLeakDetector<f0> A = q.b().c(f0.class, 128, Long.MAX_VALUE);
    static final s B = new c();
    private static final io.netty.util.internal.logging.b w;
    private static final boolean x = ((Boolean) AccessController.doPrivileged(new a())).booleanValue();
    private static final List<String> y;
    private static final Integer z;
    protected volatile long c;
    long f;
    private final List<String> n;
    private final s o;
    private final int p;
    private final p q;
    private final io.netty.util.b r;
    final Certificate[] s;
    final ClientAuth t;
    final x u;
    volatile boolean v;

    static class a implements PrivilegedAction<Boolean> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.security.PrivilegedAction
        public Boolean run() {
            return Boolean.valueOf(s.b("jdk.tls.rejectClientInitiatedRenegotiation", false));
        }
    }

    class b extends io.netty.util.b {
        b() {
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.util.b
        public void a() {
            f0.this.q();
            if (f0.this.q != null) {
                f0.this.q.close();
            }
        }

        @Override // io.netty.util.o
        public o z(Object obj) {
            if (f0.this.q != null) {
                f0.this.q.a(obj);
            }
            return f0.this;
        }
    }

    static class c implements s {
        c() {
        }

        @Override // io.netty.handler.ssl.s
        public ApplicationProtocolConfig.SelectorFailureBehavior a() {
            return ApplicationProtocolConfig.SelectorFailureBehavior.CHOOSE_MY_LAST_PROTOCOL;
        }

        @Override // io.netty.handler.ssl.s
        public ApplicationProtocolConfig.Protocol b() {
            return ApplicationProtocolConfig.Protocol.NONE;
        }

        @Override // io.netty.handler.ssl.a
        public List<String> c() {
            return Collections.emptyList();
        }

        @Override // io.netty.handler.ssl.s
        public ApplicationProtocolConfig.SelectedListenerFailureBehavior e() {
            return ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT;
        }
    }

    static class d implements PrivilegedAction<String> {
        d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.security.PrivilegedAction
        public String run() {
            return s.a("jdk.tls.ephemeralDHKeySize", null);
        }
    }

    static abstract class e implements CertificateVerifier {
        e(x xVar) {
        }
    }

    static {
        int i = io.netty.util.internal.logging.c.b;
        io.netty.util.internal.logging.b b2 = io.netty.util.internal.logging.c.b(f0.class.getName());
        w = b2;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, "ECDHE-ECDSA-AES256-GCM-SHA384", "ECDHE-ECDSA-AES128-GCM-SHA256", "ECDHE-RSA-AES128-GCM-SHA256", "ECDHE-RSA-AES128-SHA", "ECDHE-RSA-AES256-SHA", "AES128-GCM-SHA256", "AES128-SHA", "AES256-SHA");
        y = Collections.unmodifiableList(arrayList);
        if (b2.c()) {
            b2.p("Default cipher suite (OpenSSL): " + arrayList);
        }
        Integer num = null;
        try {
            String str = (String) AccessController.doPrivileged(new d());
            if (str != null) {
                try {
                    num = Integer.valueOf(str);
                } catch (NumberFormatException unused) {
                    io.netty.util.internal.logging.b bVar = w;
                    bVar.p("ReferenceCountedOpenSslContext supports -Djdk.tls.ephemeralDHKeySize={int}, but got: " + str);
                }
            }
        } catch (Throwable unused2) {
        }
        z = num;
    }

    f0(Iterable<String> iterable, d dVar, ApplicationProtocolConfig applicationProtocolConfig, long j, long j2, int i, Certificate[] certificateArr, ClientAuth clientAuth, boolean z2, boolean z3) {
        this(iterable, dVar, C(applicationProtocolConfig), j, j2, i, certificateArr, clientAuth, z2, z3);
    }

    static long A(k kVar, c0 c0Var) {
        c0 c0Var2;
        try {
            j content = c0Var2.content();
            if (content.I0()) {
                return t(content.u1());
            }
            c0Var2 = kVar.h(content.m1());
            try {
                c0Var2.S1(content, content.n1(), content.m1());
                long t2 = t(c0Var2.u1());
                try {
                    if (c0Var2.x()) {
                        b.b(c0Var2);
                    }
                    c0Var2.d();
                    return t2;
                } finally {
                    c0Var2.d();
                }
            } catch (Throwable th) {
                if (c0Var2.x()) {
                    b.b(c0Var2);
                }
                throw th;
            } finally {
                c0Var2.d();
            }
        } finally {
            c0Var2.d();
        }
    }

    static long B(PrivateKey privateKey) {
        k kVar = k.a;
        c0 f2 = PemPrivateKey.f(kVar, true, privateKey);
        try {
            return A(kVar, f2.h());
        } finally {
            f2.d();
        }
    }

    static s C(ApplicationProtocolConfig applicationProtocolConfig) {
        if (applicationProtocolConfig == null) {
            return B;
        }
        int ordinal = applicationProtocolConfig.a().ordinal();
        if (ordinal == 0) {
            return B;
        }
        if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            int ordinal2 = applicationProtocolConfig.b().ordinal();
            if (ordinal2 == 0 || ordinal2 == 2) {
                int ordinal3 = applicationProtocolConfig.c().ordinal();
                if (ordinal3 == 1 || ordinal3 == 2) {
                    return new v(applicationProtocolConfig);
                }
                throw new UnsupportedOperationException("OpenSSL provider does not support " + applicationProtocolConfig.c() + " behavior");
            }
            throw new UnsupportedOperationException("OpenSSL provider does not support " + applicationProtocolConfig.b() + " behavior");
        }
        throw new Error();
    }

    protected static X509TrustManager o(TrustManager[] trustManagerArr) {
        for (TrustManager trustManager : trustManagerArr) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        throw new IllegalStateException("no X509TrustManager found");
    }

    protected static X509KeyManager p(KeyManager[] keyManagerArr) {
        for (KeyManager keyManager : keyManagerArr) {
            if (keyManager instanceof X509KeyManager) {
                return (X509KeyManager) keyManager;
            }
        }
        throw new IllegalStateException("no X509KeyManager found");
    }

    static void r(long j) {
        if (j != 0) {
            SSL.freeBIO(j);
        }
    }

    private static long t(j jVar) {
        try {
            long newMemBIO = SSL.newMemBIO();
            int m1 = jVar.m1();
            if (SSL.writeToBIO(newMemBIO, q.g(jVar) + ((long) jVar.n1()), m1) == m1) {
                return newMemBIO;
            }
            SSL.freeBIO(newMemBIO);
            throw new IllegalStateException("Could not write data to memory BIO");
        } finally {
            jVar.d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void y(long r15, java.security.cert.X509Certificate[] r17, java.security.PrivateKey r18, java.lang.String r19) {
        /*
            r1 = 0
            r3 = 0
            io.netty.buffer.k r0 = io.netty.buffer.k.a     // Catch:{ SSLException -> 0x006b, Exception -> 0x0060, all -> 0x005c }
            r4 = 1
            r5 = r17
            io.netty.handler.ssl.c0 r3 = io.netty.handler.ssl.PemX509Certificate.b(r0, r4, r5)     // Catch:{ SSLException -> 0x006b, Exception -> 0x0060, all -> 0x005c }
            io.netty.handler.ssl.c0 r5 = r3.h()     // Catch:{ SSLException -> 0x006b, Exception -> 0x0060, all -> 0x005c }
            long r13 = A(r0, r5)     // Catch:{ SSLException -> 0x006b, Exception -> 0x0060, all -> 0x005c }
            io.netty.handler.ssl.c0 r5 = r3.h()     // Catch:{ SSLException -> 0x0059, Exception -> 0x0056, all -> 0x0053 }
            long r10 = A(r0, r5)     // Catch:{ SSLException -> 0x0059, Exception -> 0x0056, all -> 0x0053 }
            if (r18 == 0) goto L_0x0029
            long r1 = B(r18)     // Catch:{ SSLException -> 0x0027, Exception -> 0x0025, all -> 0x0023 }
            goto L_0x0029
        L_0x0023:
            r0 = move-exception
            goto L_0x002f
        L_0x0025:
            r0 = move-exception
            goto L_0x0031
        L_0x0027:
            r0 = move-exception
            goto L_0x0033
        L_0x0029:
            if (r19 != 0) goto L_0x0035
            java.lang.String r0 = ""
            r12 = r0
            goto L_0x0037
        L_0x002f:
            r4 = r10
            goto L_0x0070
        L_0x0031:
            r4 = r10
            goto L_0x0063
        L_0x0033:
            r4 = r10
            goto L_0x006e
        L_0x0035:
            r12 = r19
        L_0x0037:
            r6 = r15
            r8 = r13
            r4 = r10
            r10 = r1
            org.apache.tomcat.jni.SSLContext.setCertificateBio(r6, r8, r10, r12)     // Catch:{ SSLException -> 0x0051, Exception -> 0x004f }
            r0 = 1
            org.apache.tomcat.jni.SSLContext.setCertificateChainBio(r6, r4, r0)     // Catch:{ SSLException -> 0x0051, Exception -> 0x004f }
            r(r1)
            r(r13)
            r(r4)
            r3.d()
            return
        L_0x004f:
            r0 = move-exception
            goto L_0x0063
        L_0x0051:
            r0 = move-exception
            goto L_0x006e
        L_0x0053:
            r0 = move-exception
            r4 = r1
            goto L_0x0070
        L_0x0056:
            r0 = move-exception
            r4 = r1
            goto L_0x0063
        L_0x0059:
            r0 = move-exception
            r4 = r1
            goto L_0x006e
        L_0x005c:
            r0 = move-exception
            r4 = r1
            r13 = r4
            goto L_0x0070
        L_0x0060:
            r0 = move-exception
            r4 = r1
            r13 = r4
        L_0x0063:
            javax.net.ssl.SSLException r6 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x006f }
            java.lang.String r7 = "failed to set certificate and key"
            r6.<init>(r7, r0)     // Catch:{ all -> 0x006f }
            throw r6     // Catch:{ all -> 0x006f }
        L_0x006b:
            r0 = move-exception
            r4 = r1
            r13 = r4
        L_0x006e:
            throw r0     // Catch:{ all -> 0x006f }
        L_0x006f:
            r0 = move-exception
        L_0x0070:
            r(r1)
            r(r13)
            r(r4)
            if (r3 == 0) goto L_0x007e
            r3.d()
        L_0x007e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.f0.y(long, java.security.cert.X509Certificate[], java.security.PrivateKey, java.lang.String):void");
    }

    @Override // io.netty.handler.ssl.g0
    public final boolean c() {
        return this.p == 0;
    }

    @Override // io.netty.util.o
    public final boolean d() {
        return this.r.d();
    }

    @Override // io.netty.handler.ssl.g0
    public final SSLEngine f(k kVar, String str, int i) {
        return v(kVar, str, i);
    }

    public a m() {
        return this.o;
    }

    @Override // io.netty.util.o
    public final int n() {
        return this.r.n();
    }

    /* access modifiers changed from: package-private */
    public final void q() {
        synchronized (f0.class) {
            if (this.c != 0) {
                SSLContext.free(this.c);
                this.c = 0;
            }
            long j = this.f;
            if (j != 0) {
                Pool.destroy(j);
                this.f = 0;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract a0 s();

    /* access modifiers changed from: package-private */
    public SSLEngine v(k kVar, String str, int i) {
        return new ReferenceCountedOpenSslEngine(this, kVar, str, i, true);
    }

    public abstract b0 w();

    @Override // io.netty.util.o
    public final o z(Object obj) {
        this.r.z(obj);
        return this;
    }

    /* access modifiers changed from: private */
    public static final class f implements x {
        private final Map<Long, ReferenceCountedOpenSslEngine> a = PlatformDependent.P();

        private f() {
        }

        public void a(ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine) {
            this.a.put(Long.valueOf(referenceCountedOpenSslEngine.K()), referenceCountedOpenSslEngine);
        }

        public ReferenceCountedOpenSslEngine b(long j) {
            return this.a.remove(Long.valueOf(j));
        }

        f(a aVar) {
        }
    }

    f0(Iterable<String> iterable, d dVar, s sVar, long j, long j2, int i, Certificate[] certificateArr, ClientAuth clientAuth, boolean z2, boolean z3) {
        super(z2);
        ClientAuth clientAuth2;
        Certificate[] certificateArr2;
        int i2;
        String next;
        this.r = new b();
        ArrayList arrayList = null;
        this.u = new f(null);
        q.b();
        if (i == 1 || i == 0) {
            this.q = z3 ? A.i(this) : null;
            this.p = i;
            if (!e()) {
                clientAuth2 = ClientAuth.NONE;
            } else if (clientAuth != null) {
                clientAuth2 = clientAuth;
            } else {
                throw new NullPointerException("clientAuth");
            }
            this.t = clientAuth2;
            if (i == 1) {
                this.v = x;
            }
            if (certificateArr == null) {
                certificateArr2 = null;
            } else {
                certificateArr2 = (Certificate[]) certificateArr.clone();
            }
            this.s = certificateArr2;
            if (iterable != null) {
                arrayList = new ArrayList();
                Iterator<String> it = iterable.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    String c2 = c.c(next);
                    if (c2 != null) {
                        next = c2;
                    }
                    arrayList.add(next);
                }
            }
            if (dVar != null) {
                List<String> asList = Arrays.asList(dVar.a(arrayList, y, q.a()));
                this.n = asList;
                if (sVar != null) {
                    this.o = sVar;
                    this.f = Pool.create(0);
                    try {
                        synchronized (f0.class) {
                            try {
                                this.c = SSLContext.make(this.f, 31, i);
                                SSLContext.setOptions(this.c, 4095);
                                SSLContext.setOptions(this.c, 16777216);
                                SSLContext.setOptions(this.c, 33554432);
                                SSLContext.setOptions(this.c, 4194304);
                                SSLContext.setOptions(this.c, 524288);
                                SSLContext.setOptions(this.c, 1048576);
                                SSLContext.setOptions(this.c, 65536);
                                SSLContext.setOptions(this.c, 16384);
                                SSLContext.setMode(this.c, SSLContext.getMode(this.c) | 2);
                                Integer num = z;
                                if (num != null) {
                                    SSLContext.setTmpDHLength(this.c, num.intValue());
                                }
                                try {
                                    SSLContext.setCipherSuite(this.c, c.b(asList));
                                    List<String> c3 = sVar.c();
                                    if (!c3.isEmpty()) {
                                        String[] strArr = (String[]) c3.toArray(new String[c3.size()]);
                                        int ordinal = sVar.a().ordinal();
                                        if (ordinal == 1) {
                                            i2 = 0;
                                        } else if (ordinal == 2) {
                                            i2 = 1;
                                        } else {
                                            throw new Error();
                                        }
                                        int ordinal2 = sVar.b().ordinal();
                                        if (ordinal2 == 1) {
                                            SSLContext.setNpnProtos(this.c, strArr, i2);
                                        } else if (ordinal2 == 2) {
                                            SSLContext.setAlpnProtos(this.c, strArr, i2);
                                        } else if (ordinal2 == 3) {
                                            SSLContext.setNpnProtos(this.c, strArr, i2);
                                            SSLContext.setAlpnProtos(this.c, strArr, i2);
                                        } else {
                                            throw new Error();
                                        }
                                    }
                                    if (j > 0) {
                                        SSLContext.setSessionCacheSize(this.c, j);
                                    } else {
                                        SSLContext.setSessionCacheSize(this.c, SSLContext.setSessionCacheSize(this.c, 20480));
                                    }
                                    if (j2 > 0) {
                                        SSLContext.setSessionCacheTimeout(this.c, j2);
                                    } else {
                                        SSLContext.setSessionCacheTimeout(this.c, SSLContext.setSessionCacheTimeout(this.c, 300));
                                    }
                                } catch (SSLException e2) {
                                    throw e2;
                                } catch (Exception e3) {
                                    throw new SSLException("failed to set cipher suite: " + this.n, e3);
                                }
                            } catch (Exception e4) {
                                throw new SSLException("failed to create an SSL_CTX", e4);
                            }
                        }
                    } catch (Throwable th) {
                        d();
                        throw th;
                    }
                } else {
                    throw new NullPointerException("apn");
                }
            } else {
                throw new NullPointerException("cipherFilter");
            }
        } else {
            throw new IllegalArgumentException("mode most be either SSL.SSL_MODE_SERVER or SSL.SSL_MODE_CLIENT");
        }
    }
}
