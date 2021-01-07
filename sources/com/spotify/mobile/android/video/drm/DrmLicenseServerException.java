package com.spotify.mobile.android.video.drm;

public class DrmLicenseServerException extends Exception {
    private static final long serialVersionUID = 98547385991L;
    public final int mHttpStatusCode;
    public final String mMessage;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DrmLicenseServerException(int r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "HTTP status: "
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = defpackage.je.W0(r0, r3, r1)
            java.lang.String r1 = "<null>"
            java.lang.Object r1 = com.spotify.mobile.android.util.x.n(r4, r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.mHttpStatusCode = r3
            r2.mMessage = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.drm.DrmLicenseServerException.<init>(int, java.lang.String):void");
    }
}
