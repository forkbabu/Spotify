package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.adjust.sdk.Constants;
import java.util.Arrays;

/* renamed from: o5  reason: default package */
public class o5 {
    private static final Interpolator x = new a();
    private int a;
    private int b;
    private int c = -1;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private final int p;
    private int q;
    private OverScroller r;
    private final c s;
    private View t;
    private boolean u;
    private final ViewGroup v;
    private final Runnable w = new b();

    /* renamed from: o5$a */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: o5$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o5.this.D(0);
        }
    }

    /* renamed from: o5$c */
    public static abstract class c {
        public int a(View view, int i, int i2) {
            return 0;
        }

        public abstract int b(View view, int i, int i2);

        public int c(View view) {
            return 0;
        }

        public int d(View view) {
            return 0;
        }

        public void e(int i, int i2) {
        }

        public boolean f(int i) {
            return false;
        }

        public void g(int i, int i2) {
        }

        public void h(View view, int i) {
        }

        public abstract void i(int i);

        public abstract void j(View view, int i, int i2, int i3, int i4);

        public abstract void k(View view, float f, float f2);

        public abstract boolean l(View view, int i);
    }

    private o5(Context context, ViewGroup viewGroup, c cVar) {
        if (cVar != null) {
            this.v = viewGroup;
            this.s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i2 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.p = i2;
            this.o = i2;
            this.b = viewConfiguration.getScaledTouchSlop();
            this.m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.r = new OverScroller(context, x);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    private void A(float f2, float f3, int i2) {
        int i3 = 1;
        if (!d(f2, f3, i2, 1)) {
            i3 = 0;
        }
        if (d(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (d(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (d(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.i;
            iArr[i2] = iArr[i2] | i3;
            this.s.e(i3, i2);
        }
    }

    private void B(float f2, float f3, int i2) {
        float[] fArr = this.d;
        int i3 = 0;
        if (fArr == null || fArr.length <= i2) {
            int i4 = i2 + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f[i2] = f2;
        fArr9[i2] = f2;
        float[] fArr10 = this.e;
        this.g[i2] = f3;
        fArr10[i2] = f3;
        int[] iArr7 = this.h;
        int i5 = (int) f2;
        int i6 = (int) f3;
        if (i5 < this.v.getLeft() + this.o) {
            i3 = 1;
        }
        if (i6 < this.v.getTop() + this.o) {
            i3 |= 4;
        }
        if (i5 > this.v.getRight() - this.o) {
            i3 |= 2;
        }
        if (i6 > this.v.getBottom() - this.o) {
            i3 |= 8;
        }
        iArr7[i2] = i3;
        this.k |= 1 << i2;
    }

    private void C(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (w(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f[pointerId] = x2;
                this.g[pointerId] = y;
            }
        }
    }

    private boolean d(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.h[i2] & i3) != i3 || (this.q & i3) == 0 || (this.j[i2] & i3) == i3 || (this.i[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.b;
        if (abs <= ((float) i4) && abs2 <= ((float) i4)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.s.f(i3)) {
            int[] iArr = this.j;
            iArr[i2] = iArr[i2] | i3;
            return false;
        } else if ((this.i[i2] & i3) != 0 || abs <= ((float) this.b)) {
            return false;
        } else {
            return true;
        }
    }

    private boolean f(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.s.c(view) > 0;
        boolean z2 = this.s.d(view) > 0;
        if (z && z2) {
            float f4 = f3 * f3;
            int i2 = this.b;
            if (f4 + (f2 * f2) > ((float) (i2 * i2))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f2) > ((float) this.b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f3) <= ((float) this.b)) {
            return false;
        } else {
            return true;
        }
    }

    private float g(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        if (abs > f4) {
            return f2 > 0.0f ? f4 : -f4;
        }
        return f2;
    }

    private int h(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        if (abs > i4) {
            return i2 > 0 ? i4 : -i4;
        }
        return i2;
    }

    private void i(int i2) {
        if (this.d != null && v(i2)) {
            this.d[i2] = 0.0f;
            this.e[i2] = 0.0f;
            this.f[i2] = 0.0f;
            this.g[i2] = 0.0f;
            this.h[i2] = 0;
            this.i[i2] = 0;
            this.j[i2] = 0;
            this.k = ((1 << i2) ^ -1) & this.k;
        }
    }

    private int j(int i2, int i3, int i4) {
        int i5;
        if (i2 == 0) {
            return 0;
        }
        int width = this.v.getWidth();
        float f2 = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width)) - 0.5f) * 0.47123894f))) * f2) + f2;
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f);
        }
        return Math.min(i5, 600);
    }

    public static o5 l(ViewGroup viewGroup, float f2, c cVar) {
        o5 o5Var = new o5(viewGroup.getContext(), viewGroup, cVar);
        o5Var.b = (int) ((1.0f / f2) * ((float) o5Var.b));
        return o5Var;
    }

    public static o5 m(ViewGroup viewGroup, c cVar) {
        return new o5(viewGroup.getContext(), viewGroup, cVar);
    }

    private void n(float f2, float f3) {
        this.u = true;
        this.s.k(this.t, f2, f3);
        this.u = false;
        if (this.a == 1) {
            D(0);
        }
    }

    private boolean p(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.r.abortAnimation();
            D(0);
            return false;
        }
        View view = this.t;
        int h2 = h(i4, (int) this.n, (int) this.m);
        int h3 = h(i5, (int) this.n, (int) this.m);
        int abs = Math.abs(i6);
        int abs2 = Math.abs(i7);
        int abs3 = Math.abs(h2);
        int abs4 = Math.abs(h3);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (h2 != 0) {
            f2 = (float) abs3;
            f3 = (float) i8;
        } else {
            f2 = (float) abs;
            f3 = (float) i9;
        }
        float f6 = f2 / f3;
        if (h3 != 0) {
            f5 = (float) abs4;
            f4 = (float) i8;
        } else {
            f5 = (float) abs2;
            f4 = (float) i9;
        }
        int j2 = j(i6, h2, this.s.c(view));
        float j3 = ((float) j(i7, h3, this.s.d(view))) * (f5 / f4);
        this.r.startScroll(left, top, i6, i7, (int) (j3 + (((float) j2) * f6)));
        D(2);
        return true;
    }

    private boolean w(int i2) {
        if (v(i2)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void z() {
        this.l.computeCurrentVelocity(Constants.ONE_SECOND, this.m);
        n(g(this.l.getXVelocity(this.c), this.n, this.m), g(this.l.getYVelocity(this.c), this.n, this.m));
    }

    /* access modifiers changed from: package-private */
    public void D(int i2) {
        this.v.removeCallbacks(this.w);
        if (this.a != i2) {
            this.a = i2;
            this.s.i(i2);
            if (this.a == 0) {
                this.t = null;
            }
        }
    }

    public void E(int i2) {
        this.o = i2;
    }

    public void F(int i2) {
        this.q = i2;
    }

    public void G(float f2) {
        this.n = f2;
    }

    public boolean H(int i2, int i3) {
        if (this.u) {
            return p(i2, i3, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean I(android.view.MotionEvent r17) {
        /*
        // Method dump skipped, instructions count: 315
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o5.I(android.view.MotionEvent):boolean");
    }

    public boolean J(View view, int i2, int i3) {
        this.t = view;
        this.c = -1;
        boolean p2 = p(i2, i3, 0, 0);
        if (!p2 && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return p2;
    }

    /* access modifiers changed from: package-private */
    public boolean K(View view, int i2) {
        if (view == this.t && this.c == i2) {
            return true;
        }
        if (view == null || !this.s.l(view, i2)) {
            return false;
        }
        this.c = i2;
        c(view, i2);
        return true;
    }

    public void a() {
        b();
        if (this.a == 2) {
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            this.r.abortAnimation();
            int currX2 = this.r.getCurrX();
            int currY2 = this.r.getCurrY();
            this.s.j(this.t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        D(0);
    }

    public void b() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public void c(View view, int i2) {
        if (view.getParent() == this.v) {
            this.t = view;
            this.c = i2;
            this.s.h(view, i2);
            D(1);
            return;
        }
        StringBuilder V0 = je.V0("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        V0.append(this.v);
        V0.append(")");
        throw new IllegalArgumentException(V0.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if ((r7 + (r6 * r6)) > ((float) (r3 * r3))) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065 A[LOOP:0: B:1:0x0005->B:27:0x0065, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(int r10) {
        /*
            r9 = this;
            float[] r0 = r9.d
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r2 >= r0) goto L_0x0068
            boolean r3 = r9.v(r2)
            r4 = 1
            if (r3 != 0) goto L_0x000f
            goto L_0x0044
        L_0x000f:
            r3 = r10 & 1
            if (r3 != r4) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            r5 = 2
            r6 = r10 & 2
            if (r6 != r5) goto L_0x001d
            r5 = 1
            goto L_0x001e
        L_0x001d:
            r5 = 0
        L_0x001e:
            float[] r6 = r9.f
            r6 = r6[r2]
            float[] r7 = r9.d
            r7 = r7[r2]
            float r6 = r6 - r7
            float[] r7 = r9.g
            r7 = r7[r2]
            float[] r8 = r9.e
            r8 = r8[r2]
            float r7 = r7 - r8
            if (r3 == 0) goto L_0x0046
            if (r5 == 0) goto L_0x0046
            float r6 = r6 * r6
            float r7 = r7 * r7
            float r7 = r7 + r6
            int r3 = r9.b
            int r3 = r3 * r3
            float r3 = (float) r3
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0044
        L_0x0042:
            r3 = 1
            goto L_0x0062
        L_0x0044:
            r3 = 0
            goto L_0x0062
        L_0x0046:
            if (r3 == 0) goto L_0x0054
            float r3 = java.lang.Math.abs(r6)
            int r5 = r9.b
            float r5 = (float) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0044
            goto L_0x0042
        L_0x0054:
            if (r5 == 0) goto L_0x0044
            float r3 = java.lang.Math.abs(r7)
            int r5 = r9.b
            float r5 = (float) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0044
            goto L_0x0042
        L_0x0062:
            if (r3 == 0) goto L_0x0065
            return r4
        L_0x0065:
            int r2 = r2 + 1
            goto L_0x0005
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o5.e(int):boolean");
    }

    public boolean k(boolean z) {
        if (this.a == 2) {
            boolean computeScrollOffset = this.r.computeScrollOffset();
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                q4.z(this.t, left);
            }
            if (top != 0) {
                q4.A(this.t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.s.j(this.t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.r.getFinalX() && currY == this.r.getFinalY()) {
                this.r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.v.post(this.w);
                } else {
                    D(0);
                }
            }
        }
        if (this.a == 2) {
            return true;
        }
        return false;
    }

    public View o(int i2, int i3) {
        for (int childCount = this.v.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.v;
            this.s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View q() {
        return this.t;
    }

    public int r() {
        return this.p;
    }

    public int s() {
        return this.o;
    }

    public int t() {
        return this.b;
    }

    public int u() {
        return this.a;
    }

    public boolean v(int i2) {
        return ((1 << i2) & this.k) != 0;
    }

    public boolean x(View view, int i2, int i3) {
        if (view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom()) {
            return true;
        }
        return false;
    }

    public void y(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View o2 = o((int) x2, (int) y);
            B(x2, y, pointerId);
            K(o2, pointerId);
            int i4 = this.h[pointerId];
            int i5 = this.q;
            if ((i4 & i5) != 0) {
                this.s.g(i4 & i5, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.a == 1) {
                z();
            }
            b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.a == 1) {
                    n(0.0f, 0.0f);
                }
                b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                B(x3, y2, pointerId2);
                if (this.a == 0) {
                    K(o((int) x3, (int) y2), pointerId2);
                    int i6 = this.h[pointerId2];
                    int i7 = this.q;
                    if ((i6 & i7) != 0) {
                        this.s.g(i6 & i7, pointerId2);
                        return;
                    }
                    return;
                }
                if (x(this.t, (int) x3, (int) y2)) {
                    K(this.t, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.a == 1 && pointerId3 == this.c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i3 >= pointerCount) {
                            i2 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i3);
                        if (pointerId4 != this.c) {
                            View o3 = o((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                            View view = this.t;
                            if (o3 == view && K(view, pointerId4)) {
                                i2 = this.c;
                                break;
                            }
                        }
                        i3++;
                    }
                    if (i2 == -1) {
                        z();
                    }
                }
                i(pointerId3);
            }
        } else if (this.a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i3 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i3);
                if (w(pointerId5)) {
                    float x4 = motionEvent.getX(i3);
                    float y3 = motionEvent.getY(i3);
                    float f2 = x4 - this.d[pointerId5];
                    float f3 = y3 - this.e[pointerId5];
                    A(f2, f3, pointerId5);
                    if (this.a != 1) {
                        View o4 = o((int) x4, (int) y3);
                        if (f(o4, f2, f3) && K(o4, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i3++;
            }
            C(motionEvent);
        } else if (w(this.c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.c);
            float x5 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f;
            int i8 = this.c;
            int i9 = (int) (x5 - fArr[i8]);
            int i10 = (int) (y4 - this.g[i8]);
            int left = this.t.getLeft() + i9;
            int top = this.t.getTop() + i10;
            int left2 = this.t.getLeft();
            int top2 = this.t.getTop();
            if (i9 != 0) {
                left = this.s.a(this.t, left, i9);
                q4.z(this.t, left - left2);
            }
            if (i10 != 0) {
                top = this.s.b(this.t, top, i10);
                q4.A(this.t, top - top2);
            }
            if (!(i9 == 0 && i10 == 0)) {
                this.s.j(this.t, left, top, left - left2, top - top2);
            }
            C(motionEvent);
        }
    }
}
