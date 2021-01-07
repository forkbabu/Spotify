package com.google.android.exoplayer2.audio;

import com.adjust.sdk.Constants;
import com.comscore.streaming.ContentMediaFormat;
import com.comscore.streaming.WindowState;
import com.google.android.exoplayer2.util.v;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.encore.mobile.snackbar.SnackbarUtilsKt;

public final class h {
    private static final int[] a = {2002, SnackbarUtilsKt.SNACKBAR_ACTION_DURATION, 1920, 1601, 1600, ContentMediaFormat.FULL_CONTENT_GENERIC, Constants.ONE_SECOND, 960, 800, 800, 480, WindowState.NORMAL, WindowState.NORMAL, 2048};

    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        b(int i, int i2, int i3, int i4, int i5, a aVar) {
            this.a = i3;
            this.b = i4;
            this.c = i5;
        }
    }

    public static void a(int i, v vVar) {
        vVar.G(7);
        byte[] bArr = vVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & BitmapRenderer.ALPHA_VISIBLE);
        bArr[5] = (byte) ((i >> 8) & BitmapRenderer.ALPHA_VISIBLE);
        bArr[6] = (byte) (i & BitmapRenderer.ALPHA_VISIBLE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
        if (r11 != 11) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0096, code lost:
        if (r11 != 11) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009b, code lost:
        if (r11 != 8) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.audio.h.b b(com.google.android.exoplayer2.util.u r11) {
        /*
            int[] r0 = com.google.android.exoplayer2.audio.h.a
            r1 = 16
            int r2 = r11.h(r1)
            int r1 = r11.h(r1)
            r3 = 4
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r4) goto L_0x001a
            r1 = 24
            int r1 = r11.h(r1)
            r4 = 7
            goto L_0x001b
        L_0x001a:
            r4 = 4
        L_0x001b:
            int r1 = r1 + r4
            r4 = 44097(0xac41, float:6.1793E-41)
            if (r2 != r4) goto L_0x0023
            int r1 = r1 + 2
        L_0x0023:
            r8 = r1
            r1 = 2
            int r2 = r11.h(r1)
            r4 = 0
            r5 = 3
            if (r2 != r5) goto L_0x0040
            r6 = 0
        L_0x002e:
            int r7 = r11.h(r1)
            int r7 = r7 + r6
            boolean r6 = r11.g()
            if (r6 != 0) goto L_0x003b
            int r2 = r2 + r7
            goto L_0x0040
        L_0x003b:
            int r7 = r7 + 1
            int r6 = r7 << 2
            goto L_0x002e
        L_0x0040:
            r6 = 10
            int r6 = r11.h(r6)
            boolean r7 = r11.g()
            if (r7 == 0) goto L_0x0055
            int r7 = r11.h(r5)
            if (r7 <= 0) goto L_0x0055
            r11.o(r1)
        L_0x0055:
            boolean r7 = r11.g()
            r9 = 48000(0xbb80, float:6.7262E-41)
            r10 = 44100(0xac44, float:6.1797E-41)
            if (r7 == 0) goto L_0x0065
            r7 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x0068
        L_0x0065:
            r7 = 44100(0xac44, float:6.1797E-41)
        L_0x0068:
            int r11 = r11.h(r3)
            if (r7 != r10) goto L_0x0076
            r10 = 13
            if (r11 != r10) goto L_0x0076
            r11 = r0[r11]
            r9 = r11
            goto L_0x00a4
        L_0x0076:
            if (r7 != r9) goto L_0x00a3
            int r9 = r0.length
            if (r11 >= r9) goto L_0x00a3
            r0 = r0[r11]
            int r6 = r6 % 5
            r4 = 8
            r9 = 1
            if (r6 == r9) goto L_0x0099
            r9 = 11
            if (r6 == r1) goto L_0x0094
            if (r6 == r5) goto L_0x0099
            if (r6 == r3) goto L_0x008d
            goto L_0x009e
        L_0x008d:
            if (r11 == r5) goto L_0x00a0
            if (r11 == r4) goto L_0x00a0
            if (r11 != r9) goto L_0x009e
            goto L_0x00a0
        L_0x0094:
            if (r11 == r4) goto L_0x00a0
            if (r11 != r9) goto L_0x009e
            goto L_0x00a0
        L_0x0099:
            if (r11 == r5) goto L_0x00a0
            if (r11 != r4) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r9 = r0
            goto L_0x00a4
        L_0x00a0:
            int r0 = r0 + 1
            goto L_0x009e
        L_0x00a3:
            r9 = 0
        L_0x00a4:
            com.google.android.exoplayer2.audio.h$b r11 = new com.google.android.exoplayer2.audio.h$b
            r6 = 2
            r10 = 0
            r4 = r11
            r5 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.h.b(com.google.android.exoplayer2.util.u):com.google.android.exoplayer2.audio.h$b");
    }
}
