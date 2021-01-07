package com.spotify.offline;

import io.reactivex.a;
import kotlin.jvm.internal.h;

public final class OfflineUtilImpl implements b {
    private final f a;
    private final e b;

    public OfflineUtilImpl(f fVar, e eVar) {
        h.e(fVar, "endpointV2");
        h.e(eVar, "endpointV1");
        this.a = fVar;
        this.b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.spotify.offline.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.reactivex.z<com.spotify.offline.data.b> a() {
        /*
            r3 = this;
            com.spotify.offline.e r0 = r3.b
            io.reactivex.z r0 = r0.c()
            com.spotify.offline.OfflineUtilImpl$getAllOfflineResources$1 r1 = com.spotify.offline.OfflineUtilImpl$getAllOfflineResources$1.a
            if (r1 == 0) goto L_0x0010
            com.spotify.offline.c r2 = new com.spotify.offline.c
            r2.<init>(r1)
            r1 = r2
        L_0x0010:
            io.reactivex.functions.l r1 = (io.reactivex.functions.l) r1
            io.reactivex.z r0 = r0.A(r1)
            java.lang.String r1 = "endpointV1\n            .…onse::toOfflineResources)"
            kotlin.jvm.internal.h.d(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.offline.OfflineUtilImpl.a():io.reactivex.z");
    }

    public a b(String str) {
        h.e(str, "uri");
        return this.b.a(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.spotify.offline.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.reactivex.s<com.spotify.offline.data.b> c(boolean r3) {
        /*
            r2 = this;
            com.spotify.offline.e r0 = r2.b
            if (r3 == 0) goto L_0x0007
            java.lang.String r3 = "true"
            goto L_0x0009
        L_0x0007:
            java.lang.String r3 = "false"
        L_0x0009:
            io.reactivex.s r3 = r0.b(r3)
            com.spotify.offline.OfflineUtilImpl$subscribeAllOfflineResources$1 r0 = com.spotify.offline.OfflineUtilImpl$subscribeAllOfflineResources$1.a
            if (r0 == 0) goto L_0x0017
            com.spotify.offline.c r1 = new com.spotify.offline.c
            r1.<init>(r0)
            r0 = r1
        L_0x0017:
            io.reactivex.functions.l r0 = (io.reactivex.functions.l) r0
            io.reactivex.s r3 = r3.j0(r0)
            java.lang.String r0 = "endpointV1\n            .…onse::toOfflineResources)"
            kotlin.jvm.internal.h.d(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.offline.OfflineUtilImpl.c(boolean):io.reactivex.s");
    }
}
