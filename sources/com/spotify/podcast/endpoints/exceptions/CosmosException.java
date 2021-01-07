package com.spotify.podcast.endpoints.exceptions;

abstract class CosmosException extends Exception {
    private static final long serialVersionUID = 8794526037928569115L;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    CosmosException(java.lang.String r5, com.spotify.cosmos.router.Response r6, java.lang.String r7) {
        /*
            r4 = this;
            byte[] r0 = r6.getBody()
            if (r0 == 0) goto L_0x0011
            int r1 = r0.length
            if (r1 <= 0) goto L_0x0011
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = com.google.common.base.Charsets.UTF_8
            r1.<init>(r0, r2)
            goto L_0x0013
        L_0x0011:
            java.lang.String r1 = ""
        L_0x0013:
            java.util.Locale r0 = java.util.Locale.US
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            int r6 = r6.getStatus()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r5] = r6
            r5 = 2
            r2[r5] = r7
            r5 = 3
            r2[r5] = r1
            java.lang.String r5 = "Request with uri %s result in %d %s: %s"
            java.lang.String r5 = java.lang.String.format(r0, r5, r2)
            r4.<init>(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.podcast.endpoints.exceptions.CosmosException.<init>(java.lang.String, com.spotify.cosmos.router.Response, java.lang.String):void");
    }
}
