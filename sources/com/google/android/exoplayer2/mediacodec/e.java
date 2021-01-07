package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.f0;

public final class e {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    private final boolean h;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        if ((com.google.android.exoplayer2.util.f0.a >= 21 && r4.isFeatureSupported("secure-playback")) != false) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private e(java.lang.String r1, java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10) {
        /*
            r0 = this;
            r0.<init>()
            r1.getClass()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.g = r5
            r1 = 1
            r3 = 0
            if (r9 != 0) goto L_0x002b
            if (r4 == 0) goto L_0x002b
            int r5 = com.google.android.exoplayer2.util.f0.a
            r6 = 19
            if (r5 < r6) goto L_0x0026
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r4.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x0026
            r5 = 1
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            if (r5 == 0) goto L_0x002b
            r5 = 1
            goto L_0x002c
        L_0x002b:
            r5 = 0
        L_0x002c:
            r0.e = r5
            r5 = 21
            if (r4 == 0) goto L_0x0041
            int r6 = com.google.android.exoplayer2.util.f0.a
            if (r6 < r5) goto L_0x0040
            java.lang.String r6 = "tunneled-playback"
            boolean r6 = r4.isFeatureSupported(r6)
            if (r6 == 0) goto L_0x0040
            r6 = 1
            goto L_0x0041
        L_0x0040:
            r6 = 0
        L_0x0041:
            if (r10 != 0) goto L_0x0058
            if (r4 == 0) goto L_0x0057
            int r6 = com.google.android.exoplayer2.util.f0.a
            if (r6 < r5) goto L_0x0053
            java.lang.String r5 = "secure-playback"
            boolean r4 = r4.isFeatureSupported(r5)
            if (r4 == 0) goto L_0x0053
            r4 = 1
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            if (r4 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            r0.f = r1
            boolean r1 = com.google.android.exoplayer2.util.s.j(r2)
            r0.h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.e.<init>(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    private static Point b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(f0.e(i, widthAlignment) * widthAlignment, f0.e(i2, heightAlignment) * heightAlignment);
    }

    private static boolean c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d2) {
        Point b2 = b(videoCapabilities, i, i2);
        int i3 = b2.x;
        int i4 = b2.y;
        if (d2 == -1.0d || d2 <= 0.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d2));
    }

    public static e i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new e(str, str2, str3, codecCapabilities, false, z, z2, z3, z4, z5);
    }

    public static e j(String str) {
        return new e(str, null, null, null, true, false, true, false, false, false);
    }

    public Point a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return b(videoCapabilities, i, i2);
    }

    public MediaCodecInfo.CodecProfileLevel[] d() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(com.google.android.exoplayer2.d0 r10) {
        /*
        // Method dump skipped, instructions count: 332
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.e.e(com.google.android.exoplayer2.d0):boolean");
    }

    public boolean f(d0 d0Var) {
        if (this.h) {
            return this.e;
        }
        Pair<Integer, Integer> c2 = MediaCodecUtil.c(d0Var);
        return c2 != null && ((Integer) c2.first).intValue() == 42;
    }

    public boolean g(d0 d0Var, d0 d0Var2, boolean z) {
        if (!this.h) {
            if ("audio/mp4a-latm".equals(this.b) && d0Var.r.equals(d0Var2.r) && d0Var.E == d0Var2.E && d0Var.F == d0Var2.F) {
                Pair<Integer, Integer> c2 = MediaCodecUtil.c(d0Var);
                Pair<Integer, Integer> c3 = MediaCodecUtil.c(d0Var2);
                if (!(c2 == null || c3 == null)) {
                    int intValue = ((Integer) c2.first).intValue();
                    int intValue2 = ((Integer) c3.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } else if (!d0Var.r.equals(d0Var2.r) || d0Var.z != d0Var2.z || ((!this.e && (d0Var.w != d0Var2.w || d0Var.x != d0Var2.x)) || ((z || d0Var2.D != null) && !f0.a(d0Var.D, d0Var2.D)))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean h(int i, int i2, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            String str = f0.e;
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            String str2 = f0.e;
            return false;
        }
        if (!c(videoCapabilities, i, i2, d2)) {
            if (i < i2) {
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.a) || !"mcv5a".equals(f0.b)) && c(videoCapabilities, i2, i, d2)) {
                    String str3 = f0.e;
                }
            }
            String str4 = f0.e;
            return false;
        }
        return true;
    }

    public String toString() {
        return this.a;
    }
}
