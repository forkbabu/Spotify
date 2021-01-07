package io.netty.handler.ssl;

import io.netty.buffer.k;
import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

public class n extends g0 {
    private static final b r = c.b(n.class.getName());
    static final String[] s;
    static final List<String> t;
    static final Set<String> u;
    private final String[] c;
    private final List<String> f;
    private final h n;
    private final ClientAuth o;
    private final SSLContext p;
    private final boolean q;

    static {
        int i = c.b;
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, null, null);
            SSLEngine createSSLEngine = instance.createSSLEngine();
            String[] supportedProtocols = createSSLEngine.getSupportedProtocols();
            HashSet hashSet = new HashSet(supportedProtocols.length);
            for (String str : supportedProtocols) {
                hashSet.add(str);
            }
            ArrayList arrayList = new ArrayList();
            j(hashSet, arrayList, "TLSv1.2", "TLSv1.1", "TLSv1");
            if (!arrayList.isEmpty()) {
                s = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } else {
                s = createSSLEngine.getEnabledProtocols();
            }
            String[] supportedCipherSuites = createSSLEngine.getSupportedCipherSuites();
            u = new HashSet(supportedCipherSuites.length);
            for (String str2 : supportedCipherSuites) {
                u.add(str2);
            }
            ArrayList arrayList2 = new ArrayList();
            j(u, arrayList2, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA");
            if (arrayList2.isEmpty()) {
                String[] enabledCipherSuites = createSSLEngine.getEnabledCipherSuites();
                for (String str3 : enabledCipherSuites) {
                    if (!str3.contains("_RC4_")) {
                        arrayList2.add(str3);
                    }
                }
            }
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList2);
            t = unmodifiableList;
            b bVar = r;
            if (bVar.c()) {
                bVar.r("Default protocols (JDK): {} ", Arrays.asList(s));
                bVar.r("Default cipher suites (JDK): {}", unmodifiableList);
            }
        } catch (Exception e) {
            throw new Error("failed to initialize the default SSL context", e);
        }
    }

    n(SSLContext sSLContext, boolean z, Iterable<String> iterable, d dVar, h hVar, ClientAuth clientAuth, boolean z2) {
        super(z2);
        this.n = hVar;
        if (clientAuth != null) {
            this.o = clientAuth;
            if (dVar != null) {
                String[] a = dVar.a(iterable, t, u);
                this.c = a;
                this.f = Collections.unmodifiableList(Arrays.asList(a));
                this.p = sSLContext;
                this.q = z;
                return;
            }
            throw new NullPointerException("cipherFilter");
        }
        throw new NullPointerException("clientAuth");
    }

    private static void j(Set<String> set, List<String> list, String... strArr) {
        for (String str : strArr) {
            if (set.contains(str)) {
                list.add(str);
            }
        }
    }

    static h m(ApplicationProtocolConfig applicationProtocolConfig, boolean z) {
        int ordinal;
        j jVar = j.a;
        if (applicationProtocolConfig == null || (ordinal = applicationProtocolConfig.a().ordinal()) == 0) {
            return jVar;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                throw new UnsupportedOperationException("JDK provider does not support " + applicationProtocolConfig.a() + " protocol");
            } else if (z) {
                int ordinal2 = applicationProtocolConfig.c().ordinal();
                if (ordinal2 == 0) {
                    return new f(true, applicationProtocolConfig.d());
                }
                if (ordinal2 == 1) {
                    return new f(false, applicationProtocolConfig.d());
                }
                throw new UnsupportedOperationException("JDK provider does not support " + applicationProtocolConfig.c() + " failure behavior");
            } else {
                int ordinal3 = applicationProtocolConfig.b().ordinal();
                if (ordinal3 == 0) {
                    return new f(false, applicationProtocolConfig.d());
                }
                if (ordinal3 == 1) {
                    return new f(true, applicationProtocolConfig.d());
                }
                throw new UnsupportedOperationException("JDK provider does not support " + applicationProtocolConfig.b() + " failure behavior");
            }
        } else if (z) {
            int ordinal4 = applicationProtocolConfig.b().ordinal();
            if (ordinal4 == 0) {
                return new k(false, applicationProtocolConfig.d());
            }
            if (ordinal4 == 1) {
                return new k(true, applicationProtocolConfig.d());
            }
            throw new UnsupportedOperationException("JDK provider does not support " + applicationProtocolConfig.b() + " failure behavior");
        } else {
            int ordinal5 = applicationProtocolConfig.c().ordinal();
            if (ordinal5 == 0) {
                return new k(true, applicationProtocolConfig.d());
            }
            if (ordinal5 == 1) {
                return new k(false, applicationProtocolConfig.d());
            }
            throw new UnsupportedOperationException("JDK provider does not support " + applicationProtocolConfig.c() + " failure behavior");
        }
    }

    @Override // io.netty.handler.ssl.g0
    public final boolean c() {
        return this.q;
    }

    @Override // io.netty.handler.ssl.g0
    public final SSLEngine f(k kVar, String str, int i) {
        SSLEngine createSSLEngine = this.p.createSSLEngine(str, i);
        createSSLEngine.setEnabledCipherSuites(this.c);
        createSSLEngine.setEnabledProtocols(s);
        createSSLEngine.setUseClientMode(this.q);
        if (e()) {
            int ordinal = this.o.ordinal();
            if (ordinal == 1) {
                createSSLEngine.setWantClientAuth(true);
            } else if (ordinal == 2) {
                createSSLEngine.setNeedClientAuth(true);
            }
        }
        return this.n.g().a(createSSLEngine, this.n, e());
    }
}
