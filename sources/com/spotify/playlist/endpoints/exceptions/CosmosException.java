package com.spotify.playlist.endpoints.exceptions;

import kotlin.jvm.internal.f;

public abstract class CosmosException extends Exception {
    public static final a a = new a(null);
    private static final long serialVersionUID = 6979331231113503908L;

    public static final class a {
        public a(f fVar) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CosmosException(com.spotify.cosmos.router.Response r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.h.e(r4, r0)
            java.lang.String r0 = "description"
            kotlin.jvm.internal.h.e(r5, r0)
            byte[] r0 = r4.getBody()
            if (r0 == 0) goto L_0x0027
            int r1 = r0.length
            if (r1 != 0) goto L_0x0015
            r1 = 1
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0027
            java.nio.charset.Charset r1 = com.google.common.base.Charsets.UTF_8
            java.lang.String r2 = "Charsets.UTF_8"
            kotlin.jvm.internal.h.d(r1, r2)
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0, r1)
            goto L_0x0029
        L_0x0027:
            java.lang.String r2 = "<no error message (this is usually the case when doing a request without being logged in)>"
        L_0x0029:
            java.lang.String r0 = "Request with uri "
            java.lang.StringBuilder r0 = defpackage.je.V0(r0)
            java.lang.String r1 = r4.getUri()
            r0.append(r1)
            java.lang.String r1 = " result in "
            r0.append(r1)
            int r4 = r4.getStatus()
            r0.append(r4)
            r4 = 32
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = ": "
            java.lang.String r4 = defpackage.je.I0(r0, r4, r2)
            r3.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.playlist.endpoints.exceptions.CosmosException.<init>(com.spotify.cosmos.router.Response, java.lang.String):void");
    }
}
