package com.spotify.music.features.wrapped2020.stories.templates.summary.sharecard;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class InterceptTouchLayout extends ConstraintLayout {
    private boolean a;
    private boolean b;
    private float c;
    private float f;
    private cmf<f> n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InterceptTouchLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
    }

    public final cmf<f> getUserLeftClickListener$apps_music_features_wrapped_2020() {
        return this.n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a5, code lost:
        if (r0 <= ((float) (r6 * 0.5d))) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a9, code lost:
        if (r2 != false) goto L_0x00ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
    @Override // android.view.ViewGroup
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.h.e(r9, r0)
            boolean r0 = r8.a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0022
            r0 = 2
            int r3 = r9.getAction()
            if (r0 != r3) goto L_0x0022
            r8.b = r2
            r8.a = r1
            float r0 = r9.getX()
            r8.c = r0
            float r0 = r9.getY()
            r8.f = r0
        L_0x0022:
            boolean r0 = r8.a
            if (r0 != 0) goto L_0x003a
            int r0 = r9.getAction()
            if (r0 != 0) goto L_0x003a
            float r0 = r9.getX()
            r8.c = r0
            float r0 = r9.getY()
            r8.f = r0
            r8.a = r2
        L_0x003a:
            int r0 = r9.getAction()
            if (r2 != r0) goto L_0x00b9
            float r0 = r9.getX()
            float r3 = r8.c
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0076
            float r0 = r9.getY()
            float r3 = r8.f
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0076
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            double r6 = (double) r3
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r6)
            double r6 = r6 * r4
            float r3 = (float) r6
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0076
            boolean r0 = r8.a
            if (r0 == 0) goto L_0x0076
            boolean r0 = r8.b
            if (r0 != 0) goto L_0x0076
            r0 = 1
            goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            if (r0 != 0) goto L_0x00ab
            float r0 = r9.getX()
            float r3 = r8.c
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00a8
            float r0 = r9.getY()
            float r3 = r8.f
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r8.b
            if (r0 == 0) goto L_0x00a8
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            double r6 = (double) r3
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r6)
            double r6 = r6 * r4
            float r3 = (float) r6
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r2 = 0
        L_0x00a9:
            if (r2 == 0) goto L_0x00b5
        L_0x00ab:
            cmf<kotlin.f> r0 = r8.n
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r0 = r0.invoke()
            kotlin.f r0 = (kotlin.f) r0
        L_0x00b5:
            r8.a = r1
            r8.b = r1
        L_0x00b9:
            boolean r9 = super.onInterceptTouchEvent(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.wrapped2020.stories.templates.summary.sharecard.InterceptTouchLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setUserLeftClickListener$apps_music_features_wrapped_2020(cmf<f> cmf) {
        this.n = cmf;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InterceptTouchLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
    }
}
