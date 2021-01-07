package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class t extends RecyclerView.x {
    protected final LinearInterpolator i = new LinearInterpolator();
    protected final DecelerateInterpolator j = new DecelerateInterpolator();
    protected PointF k;
    private final DisplayMetrics l;
    private boolean m = false;
    private float n;
    protected int o = 0;
    protected int p = 0;

    public t(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.x
    public void i(int i2, int i3, RecyclerView.y yVar, RecyclerView.x.a aVar) {
        if (b() == 0) {
            o();
            return;
        }
        int i4 = this.o;
        int i5 = i4 - i2;
        int i6 = 0;
        if (i4 * i5 <= 0) {
            i5 = 0;
        }
        this.o = i5;
        int i7 = this.p;
        int i8 = i7 - i3;
        if (i7 * i8 > 0) {
            i6 = i8;
        }
        this.p = i6;
        if (i5 == 0 && i6 == 0) {
            PointF a = a(d());
            if (a != null) {
                float f = a.x;
                if (!(f == 0.0f && a.y == 0.0f)) {
                    float f2 = a.y;
                    float sqrt = (float) Math.sqrt((double) ((f2 * f2) + (f * f)));
                    float f3 = a.x / sqrt;
                    a.x = f3;
                    float f4 = a.y / sqrt;
                    a.y = f4;
                    this.k = a;
                    this.o = (int) (f3 * 10000.0f);
                    this.p = (int) (f4 * 10000.0f);
                    aVar.d((int) (((float) this.o) * 1.2f), (int) (((float) this.p) * 1.2f), (int) (((float) s(10000)) * 1.2f), this.i);
                    return;
                }
            }
            aVar.b(d());
            o();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.x
    public void j() {
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.x
    public void k() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.x
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(android.view.View r8, androidx.recyclerview.widget.RecyclerView.y r9, androidx.recyclerview.widget.RecyclerView.x.a r10) {
        /*
            r7 = this;
            android.graphics.PointF r9 = r7.k
            r0 = 0
            if (r9 == 0) goto L_0x0017
            float r9 = r9.x
            r1 = 0
            int r2 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r2 != 0) goto L_0x000d
            goto L_0x0017
        L_0x000d:
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x0014
            r9 = 1
            r6 = 1
            goto L_0x0018
        L_0x0014:
            r9 = -1
            r6 = -1
            goto L_0x0018
        L_0x0017:
            r6 = 0
        L_0x0018:
            androidx.recyclerview.widget.RecyclerView$m r9 = r7.c()
            if (r9 == 0) goto L_0x004d
            boolean r1 = r9.B()
            if (r1 != 0) goto L_0x0025
            goto L_0x004d
        L_0x0025:
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            int r2 = r9.b0(r8)
            int r3 = r1.leftMargin
            int r2 = r2 - r3
            int r3 = r9.d0(r8)
            int r1 = r1.rightMargin
            int r3 = r3 + r1
            int r4 = r9.getPaddingLeft()
            int r1 = r9.v0()
            int r9 = r9.getPaddingRight()
            int r5 = r1 - r9
            r1 = r7
            int r9 = r1.p(r2, r3, r4, r5, r6)
            goto L_0x004e
        L_0x004d:
            r9 = 0
        L_0x004e:
            int r6 = r7.t()
            androidx.recyclerview.widget.RecyclerView$m r1 = r7.c()
            if (r1 == 0) goto L_0x0087
            boolean r2 = r1.C()
            if (r2 != 0) goto L_0x005f
            goto L_0x0087
        L_0x005f:
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            int r2 = r1.e0(r8)
            int r3 = r0.topMargin
            int r2 = r2 - r3
            int r8 = r1.a0(r8)
            int r0 = r0.bottomMargin
            int r3 = r8 + r0
            int r4 = r1.getPaddingTop()
            int r8 = r1.g0()
            int r0 = r1.getPaddingBottom()
            int r5 = r8 - r0
            r1 = r7
            int r0 = r1.p(r2, r3, r4, r5, r6)
        L_0x0087:
            int r8 = r9 * r9
            int r1 = r0 * r0
            int r1 = r1 + r8
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            int r8 = (int) r1
            int r8 = r7.r(r8)
            if (r8 <= 0) goto L_0x009f
            int r9 = -r9
            int r0 = -r0
            android.view.animation.DecelerateInterpolator r1 = r7.j
            r10.d(r9, r0, r8, r1)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.t.l(android.view.View, androidx.recyclerview.widget.RecyclerView$y, androidx.recyclerview.widget.RecyclerView$x$a):void");
    }

    public int p(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* access modifiers changed from: protected */
    public float q(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    public int r(int i2) {
        double s = (double) s(i2);
        Double.isNaN(s);
        return (int) Math.ceil(s / 0.3356d);
    }

    /* access modifiers changed from: protected */
    public int s(int i2) {
        float abs = (float) Math.abs(i2);
        if (!this.m) {
            this.n = q(this.l);
            this.m = true;
        }
        return (int) Math.ceil((double) (abs * this.n));
    }

    /* access modifiers changed from: protected */
    public int t() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
