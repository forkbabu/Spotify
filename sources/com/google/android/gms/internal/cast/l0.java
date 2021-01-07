package com.google.android.gms.internal.cast;

import android.widget.TextView;

public final class l0 extends vq {
    private final TextView b;

    public l0(TextView textView) {
        this.b = textView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r2 != 4) goto L_0x0051;
     */
    @Override // defpackage.vq
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r7 = this;
            com.google.android.gms.cast.framework.media.h r0 = r7.b()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.google.android.gms.cast.MediaInfo r0 = r0.h()
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            com.google.android.gms.cast.j r0 = r0.Q1()
            if (r0 != 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.String r1 = "com.google.android.gms.cast.metadata.SUBTITLE"
            boolean r2 = r0.I1(r1)
            java.lang.String r3 = "com.google.android.gms.cast.metadata.COMPOSER"
            java.lang.String r4 = "com.google.android.gms.cast.metadata.ALBUM_ARTIST"
            java.lang.String r5 = "com.google.android.gms.cast.metadata.ARTIST"
            if (r2 != 0) goto L_0x0051
            int r2 = r0.p2()
            r6 = 1
            if (r2 == r6) goto L_0x004f
            r6 = 2
            if (r2 == r6) goto L_0x004c
            r6 = 3
            if (r2 == r6) goto L_0x0034
            r3 = 4
            if (r2 == r3) goto L_0x004a
            goto L_0x0051
        L_0x0034:
            boolean r2 = r0.I1(r5)
            if (r2 != 0) goto L_0x004a
            boolean r2 = r0.I1(r4)
            if (r2 == 0) goto L_0x0042
            r1 = r4
            goto L_0x0051
        L_0x0042:
            boolean r2 = r0.I1(r3)
            if (r2 == 0) goto L_0x0051
            r1 = r3
            goto L_0x0051
        L_0x004a:
            r1 = r5
            goto L_0x0051
        L_0x004c:
            java.lang.String r1 = "com.google.android.gms.cast.metadata.SERIES_TITLE"
            goto L_0x0051
        L_0x004f:
            java.lang.String r1 = "com.google.android.gms.cast.metadata.STUDIO"
        L_0x0051:
            java.lang.String r0 = r0.q2(r1)
            if (r0 == 0) goto L_0x005c
            android.widget.TextView r1 = r7.b
            r1.setText(r0)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.l0.c():void");
    }
}
