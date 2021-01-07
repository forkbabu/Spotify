package defpackage;

import android.app.Activity;

/* renamed from: vs5  reason: default package */
public final class vs5 implements fjf<Boolean> {
    private final wlf<Activity> a;

    public vs5(wlf<Activity> wlf) {
        this.a = wlf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009c, code lost:
        if (((r4 == null || r1.width() <= 0 || r1.height() <= 0) ? false : r4.intersect(r1)) != false) goto L_0x009e;
     */
    @Override // defpackage.wlf
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get() {
        /*
            r6 = this;
            wlf<android.app.Activity> r0 = r6.a
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.String r1 = "activity"
            kotlin.jvm.internal.h.e(r0, r1)
            boolean r2 = com.spotify.mobile.android.util.x.g(r0)
            r3 = 0
            if (r2 != 0) goto L_0x009e
            kotlin.jvm.internal.h.e(r0, r1)
            kotlin.jvm.internal.h.e(r0, r1)
            kotlin.jvm.internal.h.e(r0, r1)
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            java.lang.String r4 = "activity.packageManager"
            kotlin.jvm.internal.h.d(r2, r4)
            java.lang.String r4 = "com.microsoft.device.display.displaymask"
            boolean r2 = r2.hasSystemFeature(r4)
            r4 = 0
            if (r2 == 0) goto L_0x0070
            com.microsoft.device.display.DisplayMask r2 = com.microsoft.device.display.DisplayMask.fromResourcesRectApproximation(r0)
            if (r2 == 0) goto L_0x0070
            kotlin.jvm.internal.h.e(r0, r1)
            java.lang.String r4 = "window"
            java.lang.Object r4 = r0.getSystemService(r4)     // Catch:{ IllegalStateException -> 0x0058 }
            if (r4 == 0) goto L_0x0050
            android.view.WindowManager r4 = (android.view.WindowManager) r4     // Catch:{ IllegalStateException -> 0x0058 }
            android.view.Display r4 = r4.getDefaultDisplay()     // Catch:{ IllegalStateException -> 0x0058 }
            java.lang.String r5 = "wm.defaultDisplay"
            kotlin.jvm.internal.h.d(r4, r5)     // Catch:{ IllegalStateException -> 0x0058 }
            int r4 = r4.getRotation()     // Catch:{ IllegalStateException -> 0x0058 }
            goto L_0x0059
        L_0x0050:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ IllegalStateException -> 0x0058 }
            java.lang.String r5 = "null cannot be cast to non-null type android.view.WindowManager"
            r4.<init>(r5)     // Catch:{ IllegalStateException -> 0x0058 }
            throw r4     // Catch:{ IllegalStateException -> 0x0058 }
        L_0x0058:
            r4 = 0
        L_0x0059:
            java.util.List r2 = r2.getBoundingRectsForRotation(r4)
            int r4 = r2.size()
            if (r4 != 0) goto L_0x0069
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r3, r3, r3, r3)
            goto L_0x0070
        L_0x0069:
            java.lang.Object r2 = r2.get(r3)
            r4 = r2
            android.graphics.Rect r4 = (android.graphics.Rect) r4
        L_0x0070:
            kotlin.jvm.internal.h.e(r0, r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.view.WindowManager r0 = r0.getWindowManager()
            java.lang.String r2 = "activity.windowManager"
            kotlin.jvm.internal.h.d(r0, r2)
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getRectSize(r1)
            if (r4 == 0) goto L_0x009b
            int r0 = r1.width()
            if (r0 <= 0) goto L_0x009b
            int r0 = r1.height()
            if (r0 <= 0) goto L_0x009b
            boolean r0 = r4.intersect(r1)
            goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            if (r0 == 0) goto L_0x009f
        L_0x009e:
            r3 = 1
        L_0x009f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs5.get():java.lang.Object");
    }
}
