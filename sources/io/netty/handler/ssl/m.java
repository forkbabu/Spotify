package io.netty.handler.ssl;

@Deprecated
public final class m extends n {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    m(java.security.cert.X509Certificate[] r16, javax.net.ssl.TrustManagerFactory r17, java.security.cert.X509Certificate[] r18, java.security.PrivateKey r19, java.lang.String r20, javax.net.ssl.KeyManagerFactory r21, java.lang.Iterable<java.lang.String> r22, io.netty.handler.ssl.d r23, io.netty.handler.ssl.ApplicationProtocolConfig r24, long r25, long r27) {
        /*
            r15 = this;
            r0 = r25
            r2 = r27
            if (r16 == 0) goto L_0x000d
            javax.net.ssl.TrustManagerFactory r4 = io.netty.handler.ssl.g0.b(r16, r17)     // Catch:{ Exception -> 0x000b }
            goto L_0x000f
        L_0x000b:
            r0 = move-exception
            goto L_0x0067
        L_0x000d:
            r4 = r17
        L_0x000f:
            if (r18 == 0) goto L_0x0016
            javax.net.ssl.KeyManagerFactory r5 = io.netty.handler.ssl.g0.a(r18, r19, r20, r21)     // Catch:{ Exception -> 0x000b }
            goto L_0x0018
        L_0x0016:
            r5 = r21
        L_0x0018:
            java.lang.String r6 = "TLS"
            javax.net.ssl.SSLContext r8 = javax.net.ssl.SSLContext.getInstance(r6)     // Catch:{ Exception -> 0x000b }
            r6 = 0
            if (r5 != 0) goto L_0x0023
            r5 = r6
            goto L_0x0027
        L_0x0023:
            javax.net.ssl.KeyManager[] r5 = r5.getKeyManagers()     // Catch:{ Exception -> 0x000b }
        L_0x0027:
            if (r4 != 0) goto L_0x002b
            r4 = r6
            goto L_0x002f
        L_0x002b:
            javax.net.ssl.TrustManager[] r4 = r4.getTrustManagers()     // Catch:{ Exception -> 0x000b }
        L_0x002f:
            r8.init(r5, r4, r6)     // Catch:{ Exception -> 0x000b }
            javax.net.ssl.SSLSessionContext r4 = r8.getClientSessionContext()     // Catch:{ Exception -> 0x000b }
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r9 = 0
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0047
            long r0 = java.lang.Math.min(r0, r5)     // Catch:{ Exception -> 0x000b }
            int r1 = (int) r0     // Catch:{ Exception -> 0x000b }
            r4.setSessionCacheSize(r1)     // Catch:{ Exception -> 0x000b }
        L_0x0047:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0053
            long r0 = java.lang.Math.min(r2, r5)     // Catch:{ Exception -> 0x000b }
            int r1 = (int) r0     // Catch:{ Exception -> 0x000b }
            r4.setSessionTimeout(r1)     // Catch:{ Exception -> 0x000b }
        L_0x0053:
            r9 = 1
            r0 = 0
            r1 = r24
            io.netty.handler.ssl.h r12 = io.netty.handler.ssl.n.m(r1, r0)
            io.netty.handler.ssl.ClientAuth r13 = io.netty.handler.ssl.ClientAuth.NONE
            r14 = 0
            r7 = r15
            r10 = r22
            r11 = r23
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0067:
            boolean r1 = r0 instanceof javax.net.ssl.SSLException
            if (r1 == 0) goto L_0x006e
            javax.net.ssl.SSLException r0 = (javax.net.ssl.SSLException) r0
            throw r0
        L_0x006e:
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            java.lang.String r2 = "failed to initialize the client-side SSL context"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.ssl.m.<init>(java.security.cert.X509Certificate[], javax.net.ssl.TrustManagerFactory, java.security.cert.X509Certificate[], java.security.PrivateKey, java.lang.String, javax.net.ssl.KeyManagerFactory, java.lang.Iterable, io.netty.handler.ssl.d, io.netty.handler.ssl.ApplicationProtocolConfig, long, long):void");
    }
}
