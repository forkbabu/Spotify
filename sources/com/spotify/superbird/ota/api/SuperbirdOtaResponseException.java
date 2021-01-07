package com.spotify.superbird.ota.api;

public class SuperbirdOtaResponseException extends RuntimeException {
    private static final long serialVersionUID = 1073519593726774095L;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SuperbirdOtaResponseException(com.spotify.superbird.ota.model.e r4) {
        /*
            r3 = this;
            java.lang.String r0 = "Response has errors:"
            java.lang.StringBuilder r0 = defpackage.je.V0(r0)
            r1 = 44
            com.google.common.base.Joiner r1 = com.google.common.base.Joiner.on(r1)
            java.util.List r2 = r4.errors()
            java.lang.String r1 = r1.join(r2)
            r0.append(r1)
            java.lang.String r1 = ", success:"
            r0.append(r1)
            boolean r4 = r4.success()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.superbird.ota.api.SuperbirdOtaResponseException.<init>(com.spotify.superbird.ota.model.e):void");
    }
}
