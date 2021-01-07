package com.spotify.mobile.android.spotlets.appprotocol.util;

import com.spotify.mobile.android.spotlets.appprotocol.w3;

public final class b {
    private final w3 a;

    public b(w3 w3Var) {
        this.a = w3Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        if (r0 != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.cosmos.JacksonModel a(defpackage.oq1 r8, defpackage.bf2<? extends com.spotify.mobile.android.cosmos.JacksonModel, ? extends com.spotify.mobile.android.cosmos.JacksonModel> r9) {
        /*
            r7 = this;
            java.lang.String r0 = r9.getUri()
            java.lang.String r1 = "com.spotify.queue_spotify_uri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007e
            com.spotify.mobile.android.spotlets.appprotocol.w3 r0 = r7.a
            com.spotify.music.appprotocol.api.session.HelloDetailsAppProtocol$HelloDetails r0 = r0.b()
            com.spotify.music.appprotocol.api.session.HelloDetailsAppProtocol$Info r0 = r0.info
            boolean r0 = r0.isCategoryApp()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x006e
            com.spotify.mobile.android.spotlets.appprotocol.w3 r0 = r7.a
            com.spotify.music.appprotocol.api.session.HelloDetailsAppProtocol$HelloDetails r0 = r0.b()
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.extras
            if (r0 == 0) goto L_0x0042
            com.spotify.mobile.android.spotlets.appprotocol.w3 r0 = r7.a
            com.spotify.music.appprotocol.api.session.HelloDetailsAppProtocol$HelloDetails r0 = r0.b()
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.extras
            java.lang.String r3 = "scopes"
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0042
            java.lang.String r3 = "app-remote-control"
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0042
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            if (r0 == 0) goto L_0x006e
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r4 = "0.5.0"
            r3[r2] = r4
            java.lang.String r4 = "0.6.0"
            r3[r1] = r4
            r4 = 0
        L_0x0051:
            if (r4 >= r0) goto L_0x006a
            r5 = r3[r4]
            com.spotify.mobile.android.spotlets.appprotocol.w3 r6 = r7.a
            com.spotify.music.appprotocol.api.session.HelloDetailsAppProtocol$HelloDetails r6 = r6.b()
            com.spotify.music.appprotocol.api.session.HelloDetailsAppProtocol$Info r6 = r6.info
            java.lang.String r6 = r6.version
            boolean r5 = r6.startsWith(r5)
            if (r5 == 0) goto L_0x0067
            r0 = 1
            goto L_0x006b
        L_0x0067:
            int r4 = r4 + 1
            goto L_0x0051
        L_0x006a:
            r0 = 0
        L_0x006b:
            if (r0 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            if (r1 == 0) goto L_0x007e
            com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$Uri r9 = new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$Uri
            r9.<init>()
            r0 = 5
            java.lang.String r8 = r8.e(r0)
            r9.uri = r8
            return r9
        L_0x007e:
            java.lang.Class r9 = r9.c()
            com.spotify.mobile.android.cosmos.JacksonModel r8 = r8.g(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.appprotocol.util.b.a(oq1, bf2):com.spotify.mobile.android.cosmos.JacksonModel");
    }
}
