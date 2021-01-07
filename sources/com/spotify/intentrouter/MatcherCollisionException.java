package com.spotify.intentrouter;

public class MatcherCollisionException extends RuntimeException {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> MatcherCollisionException(java.util.List<com.spotify.intentrouter.m<T>> r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Collision between the following routes:"
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L_0x000b:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0024
            java.lang.Object r1 = r4.next()
            com.spotify.intentrouter.m r1 = (com.spotify.intentrouter.m) r1
            java.lang.String r2 = "\n    "
            r0.append(r2)
            java.lang.String r1 = r1.description()
            r0.append(r1)
            goto L_0x000b
        L_0x0024:
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.intentrouter.MatcherCollisionException.<init>(java.util.List):void");
    }
}
