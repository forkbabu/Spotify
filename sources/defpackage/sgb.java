package defpackage;

import com.spotify.music.libs.facebook.q;

/* renamed from: sgb  reason: default package */
public class sgb {
    private final q a;
    private final jz1 b;

    sgb(q qVar, jz1 jz1) {
        qVar.getClass();
        this.a = qVar;
        this.b = jz1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r0 != null) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Intent r5, com.spotify.mobile.android.util.l0 r6) {
        /*
            r4 = this;
            com.spotify.mobile.android.util.Assertion.e(r5)
            com.spotify.mobile.android.util.Assertion.e(r6)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L_0x0034
            java.lang.String r1 = "android.intent.extra.REFERRER"
            boolean r2 = r5.hasExtra(r1)
            if (r2 == 0) goto L_0x0021
            android.os.Parcelable r1 = r5.getParcelableExtra(r1)
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto L_0x0021
            java.lang.String r0 = r1.toString()
            goto L_0x0036
        L_0x0021:
            r1 = 22
            if (r0 < r1) goto L_0x0034
            java.lang.String r0 = "android.intent.extra.REFERRER_NAME"
            boolean r1 = r5.hasExtra(r0)
            if (r1 == 0) goto L_0x0034
            java.lang.String r0 = r5.getStringExtra(r0)
            if (r0 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            java.lang.String r0 = ""
        L_0x0036:
            boolean r1 = com.google.common.base.MoreObjects.isNullOrEmpty(r0)
            if (r1 == 0) goto L_0x0046
            com.spotify.music.libs.facebook.q r1 = r4.a
            boolean r1 = r1.b(r5)
            if (r1 == 0) goto L_0x0046
            java.lang.String r0 = "com.facebook.katana"
        L_0x0046:
            boolean r1 = com.google.common.base.MoreObjects.isNullOrEmpty(r0)
            if (r1 == 0) goto L_0x0052
            java.lang.String r0 = "com.spotify.music.intent.extra.EXTRA_SPOTIFY_INTERNAL_REFERRER_NAME"
            java.lang.String r0 = r5.getStringExtra(r0)
        L_0x0052:
            boolean r5 = com.google.common.base.MoreObjects.isNullOrEmpty(r0)
            if (r5 == 0) goto L_0x006b
            boolean r5 = r6.w()
            if (r5 != 0) goto L_0x006b
            boolean r5 = r6.v()
            if (r5 != 0) goto L_0x006b
            boolean r5 = r6.u()
            if (r5 != 0) goto L_0x006b
            return
        L_0x006b:
            jz1 r5 = r4.b
            u91 r1 = new u91
            java.lang.String r2 = "https://open.spotify.com/"
            java.lang.StringBuilder r2 = defpackage.je.V0(r2)
            android.net.Uri r3 = r6.a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = r6.B()
            r1.<init>(r0, r2, r6)
            r5.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sgb.a(android.content.Intent, com.spotify.mobile.android.util.l0):void");
    }
}
