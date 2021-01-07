package android.support.wearable.view.drawer;

import android.content.Context;
import android.content.res.Resources;
import android.support.wearable.view.drawer.WearableDrawerLayout;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.adjust.sdk.Constants;
import com.spotify.music.C0707R;
import java.util.Arrays;

@Deprecated
public class b {
    private static final Interpolator z = new a();
    private int a;
    private int b;
    private final int c;
    private int d = -1;
    private float[] e;
    private float[] f;
    private float[] g;
    private float[] h;
    private int[] i;
    private int[] j;
    private int[] k;
    private int l;
    private VelocityTracker m;
    private final float n;
    private float o;
    private int p;
    private int q;
    private final OverScroller r;
    private final c s;
    private View t;
    private boolean u;
    private final ViewGroup v;
    private final float w;
    private final boolean x;
    private final Runnable y = new RunnableC0013b();

    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: android.support.wearable.view.drawer.b$b  reason: collision with other inner class name */
    class RunnableC0013b implements Runnable {
        RunnableC0013b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.t(0);
        }
    }

    public static abstract class c {
        public abstract int a(View view, int i, int i2);

        public abstract int b(View view);

        public abstract void c(int i, int i2);

        public abstract void d(View view, int i, int i2, int i3, int i4);

        public abstract void e(View view, float f, float f2);
    }

    private b(Context context, ViewGroup viewGroup, c cVar) {
        if (cVar != null) {
            this.v = viewGroup;
            this.s = cVar;
            Resources resources = context.getResources();
            this.w = resources.getDisplayMetrics().density;
            this.x = (resources.getConfiguration().uiMode & 15) == 6;
            o();
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.c = resources.getDimensionPixelSize(C0707R.dimen.drawer_view_edge_size);
            this.n = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.o = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.r = new OverScroller(context, z);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    private boolean c(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.i[i2] & i3) != i3 || (this.q & i3) == 0 || (this.k[i2] & i3) == i3 || (this.j[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.b;
        if (abs <= ((float) i4) && abs2 <= ((float) i4)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.s.getClass();
        }
        if ((this.j[i2] & i3) != 0 || abs <= ((float) this.b)) {
            return false;
        }
        return true;
    }

    private boolean d(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        this.s.getClass();
        if (!(this.s.b(view) > 0) || Math.abs(f3) <= ((float) this.b)) {
            return false;
        }
        return true;
    }

    private float e(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        if (abs > f4) {
            return f2 > 0.0f ? f4 : -f4;
        }
        return f2;
    }

    private int f(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        if (abs > i4) {
            return i2 > 0 ? i4 : -i4;
        }
        return i2;
    }

    private void g(int i2) {
        float[] fArr = this.e;
        if (fArr != null) {
            fArr[i2] = 0.0f;
            this.f[i2] = 0.0f;
            this.g[i2] = 0.0f;
            this.h[i2] = 0.0f;
            this.i[i2] = 0;
            this.j[i2] = 0;
            this.k[i2] = 0;
            this.l = ((1 << i2) ^ -1) & this.l;
        }
    }

    private int h(int i2, int i3, int i4) {
        int i5;
        if (i2 == 0) {
            return 0;
        }
        int width = this.v.getWidth();
        float f2 = (float) (width / 2);
        double min = (double) (Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width)) - 0.5f);
        Double.isNaN(min);
        Double.isNaN(min);
        float sin = (((float) Math.sin((double) ((float) (min * 0.4712389167638204d)))) * f2) + f2;
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f);
        }
        return Math.min(i5, 600);
    }

    public static b j(ViewGroup viewGroup, float f2, c cVar) {
        b bVar = new b(viewGroup.getContext(), viewGroup, cVar);
        bVar.b = (int) ((1.0f / f2) * ((float) bVar.b));
        return bVar;
    }

    private void k(float f2, float f3) {
        this.u = true;
        this.s.e(this.t, f2, f3);
        this.u = false;
        if (this.a == 1) {
            t(0);
        }
    }

    private boolean m(int i2, int i3, int i4, int i5) {
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
            t(0);
            return false;
        }
        View view = this.t;
        int f6 = f(i4, (int) this.o, (int) this.n);
        int f7 = f(i5, (int) this.o, (int) this.n);
        int abs = Math.abs(i6);
        int abs2 = Math.abs(i7);
        int abs3 = Math.abs(f6);
        int abs4 = Math.abs(f7);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (f6 != 0) {
            f3 = (float) abs3;
            f2 = (float) i8;
        } else {
            f3 = (float) abs;
            f2 = (float) i9;
        }
        float f8 = f3 / f2;
        if (f7 != 0) {
            f5 = (float) abs4;
            f4 = (float) i8;
        } else {
            f5 = (float) abs2;
            f4 = (float) i9;
        }
        this.s.getClass();
        int h2 = h(i6, f6, 0);
        float h3 = ((float) h(i7, f7, this.s.b(view))) * (f5 / f4);
        this.r.startScroll(left, top, i6, i7, (int) (h3 + (((float) h2) * f8)));
        t(2);
        return true;
    }

    private void p() {
        this.m.computeCurrentVelocity(Constants.ONE_SECOND, this.n);
        k(e(this.m.getXVelocity(this.d), this.o, this.n), e(this.m.getYVelocity(this.d), this.o, this.n));
    }

    private void q(float f2, float f3, int i2) {
        int i3 = 1;
        if (!c(f2, f3, i2, 1)) {
            i3 = 0;
        }
        if (c(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (c(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (c(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.j;
            iArr[i2] = iArr[i2] | i3;
            this.s.c(i3, i2);
        }
    }

    private void r(float f2, float f3, int i2) {
        float[] fArr = this.e;
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
                float[] fArr6 = this.f;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.g;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.h;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.e = fArr2;
            this.f = fArr3;
            this.g = fArr4;
            this.h = fArr5;
            this.i = iArr;
            this.j = iArr2;
            this.k = iArr3;
        }
        float[] fArr9 = this.e;
        this.g[i2] = f2;
        fArr9[i2] = f2;
        float[] fArr10 = this.f;
        this.h[i2] = f3;
        fArr10[i2] = f3;
        int[] iArr7 = this.i;
        int i5 = (int) f2;
        int i6 = (int) f3;
        if (i5 < this.v.getLeft() + this.p) {
            i3 = 1;
        }
        if (i6 < this.v.getTop() + this.p) {
            i3 |= 4;
        }
        if (i5 > this.v.getRight() - this.p) {
            i3 |= 2;
        }
        if (i6 > this.v.getBottom() - this.p) {
            i3 |= 8;
        }
        iArr7[i2] = i3;
        this.l |= 1 << i2;
    }

    private void s(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            float x2 = motionEvent.getX(i2);
            float y2 = motionEvent.getY(i2);
            this.g[pointerId] = x2;
            this.h[pointerId] = y2;
        }
    }

    public void a() {
        this.d = -1;
        float[] fArr = this.e;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0.0f);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            Arrays.fill(this.k, 0);
            this.l = 0;
        }
        VelocityTracker velocityTracker = this.m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.m = null;
        }
    }

    public void b(View view, int i2) {
        if (view.getParent() == this.v) {
            this.t = view;
            this.d = i2;
            ((WearableDrawerLayout.d) this.s).getClass();
            WearableDrawerLayout.a((WearableDrawerView) view);
            t(1);
            return;
        }
        String valueOf = String.valueOf(this.v);
        throw new IllegalArgumentException(je.j0(valueOf.length() + 95, "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", valueOf, ")"));
    }

    public boolean i(boolean z2) {
        if (this.a == 2) {
            boolean computeScrollOffset = this.r.computeScrollOffset();
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                this.t.offsetLeftAndRight(left);
            }
            if (top != 0) {
                this.t.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.s.d(this.t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.r.getFinalX() && currY == this.r.getFinalY()) {
                this.r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z2) {
                    this.v.post(this.y);
                } else {
                    t(0);
                }
            }
        }
        if (this.a == 2) {
            return true;
        }
        return false;
    }

    public View l(int i2, int i3) {
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

    public void n(MotionEvent motionEvent) {
        int i2;
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.m == null) {
            this.m = VelocityTracker.obtain();
        }
        this.m.addMovement(motionEvent);
        int i4 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View l2 = l((int) x2, (int) y2);
            r(x2, y2, pointerId);
            y(l2, pointerId);
            if ((this.i[pointerId] & this.q) != 0) {
                this.s.getClass();
            }
        } else if (actionMasked == 1) {
            if (this.a == 1) {
                p();
            }
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.a == 1) {
                    k(0.0f, 0.0f);
                }
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y3 = motionEvent.getY(actionIndex);
                r(x3, y3, pointerId2);
                if (this.a == 0) {
                    y(l((int) x3, (int) y3), pointerId2);
                    if ((this.i[pointerId2] & this.q) != 0) {
                        this.s.getClass();
                        return;
                    }
                    return;
                }
                int i5 = (int) x3;
                int i6 = (int) y3;
                View view = this.t;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    i4 = 1;
                }
                if (i4 != 0) {
                    y(this.t, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.a == 1 && pointerId3 == this.d) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i4 >= pointerCount) {
                            i3 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i4);
                        if (pointerId4 != this.d) {
                            View l3 = l((int) motionEvent.getX(i4), (int) motionEvent.getY(i4));
                            View view2 = this.t;
                            if (l3 == view2 && y(view2, pointerId4)) {
                                i3 = this.d;
                                break;
                            }
                        }
                        i4++;
                    }
                    if (i3 == -1) {
                        p();
                    }
                }
                g(pointerId3);
            }
        } else if (this.a == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.d);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.g;
            int i7 = this.d;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.h[i7]);
            int left = this.t.getLeft() + i8;
            int top = this.t.getTop() + i9;
            int left2 = this.t.getLeft();
            int top2 = this.t.getTop();
            if (i8 != 0) {
                this.s.getClass();
                this.t.offsetLeftAndRight(0 - left2);
                i2 = 0;
            } else {
                i2 = left;
            }
            if (i9 != 0) {
                top = this.s.a(this.t, top, i9);
                this.t.offsetTopAndBottom(top - top2);
            }
            if (!(i8 == 0 && i9 == 0)) {
                this.s.d(this.t, i2, top, i2 - left2, top - top2);
            }
            s(motionEvent);
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i4 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i4);
                float x5 = motionEvent.getX(i4);
                float y5 = motionEvent.getY(i4);
                float f2 = x5 - this.e[pointerId5];
                float f3 = y5 - this.f[pointerId5];
                q(f2, f3, pointerId5);
                if (this.a != 1) {
                    View l4 = l((int) x5, (int) y5);
                    if (d(l4, f2, f3) && y(l4, pointerId5)) {
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
            s(motionEvent);
        }
    }

    public void o() {
        if (this.x) {
            this.p = Math.min((int) (((float) this.v.getHeight()) * 0.2f), this.c);
        } else {
            this.p = (int) ((this.w * 20.0f) + 0.5f);
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int i2) {
        this.v.removeCallbacks(this.y);
        if (this.a != i2) {
            this.a = i2;
            WearableDrawerLayout.d dVar = (WearableDrawerLayout.d) this.s;
            WearableDrawerView f2 = dVar.f();
            if (i2 == 0) {
                boolean z2 = true;
                if (f2.f()) {
                    f2.i();
                    WearableDrawerLayout wearableDrawerLayout = WearableDrawerLayout.this;
                    int i3 = WearableDrawerLayout.H;
                    wearableDrawerLayout.getClass();
                    WearableDrawerLayout wearableDrawerLayout2 = WearableDrawerLayout.this;
                    WearableDrawerLayout.b(wearableDrawerLayout2, !WearableDrawerLayout.c(wearableDrawerLayout2, WearableDrawerLayout.r(wearableDrawerLayout2), 1));
                    WearableDrawerLayout wearableDrawerLayout3 = WearableDrawerLayout.this;
                    WearableDrawerLayout.d(wearableDrawerLayout3, !WearableDrawerLayout.c(wearableDrawerLayout3, WearableDrawerLayout.l(wearableDrawerLayout3), -1));
                } else if (f2.d()) {
                    f2.h();
                    WearableDrawerLayout wearableDrawerLayout4 = WearableDrawerLayout.this;
                    int i4 = WearableDrawerLayout.H;
                    wearableDrawerLayout4.getClass();
                } else {
                    z2 = false;
                }
                if (z2 && f2.g()) {
                    f2.setIsPeeking(false);
                    f2.getPeekContainer().setVisibility(4);
                }
            }
            if (f2.getDrawerState() != i2) {
                f2.setDrawerState(i2);
                f2.j();
                WearableDrawerLayout wearableDrawerLayout5 = WearableDrawerLayout.this;
                int i5 = WearableDrawerLayout.H;
                wearableDrawerLayout5.getClass();
            }
            if (this.a == 0) {
                this.t = null;
            }
        }
    }

    public void u(int i2) {
        this.q = i2;
    }

    public boolean v(int i2, int i3) {
        if (this.u) {
            return m(i2, i3, (int) this.m.getXVelocity(this.d), (int) this.m.getYVelocity(this.d));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public boolean w(MotionEvent motionEvent) {
        View l2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.m == null) {
            this.m = VelocityTracker.obtain();
        }
        this.m.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x2 = motionEvent.getX(actionIndex);
                            float y2 = motionEvent.getY(actionIndex);
                            r(x2, y2, pointerId);
                            int i2 = this.a;
                            if (i2 == 0) {
                                if ((this.i[pointerId] & this.q) != 0) {
                                    this.s.getClass();
                                }
                            } else if (i2 == 2 && (l2 = l((int) x2, (int) y2)) == this.t) {
                                y(l2, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            g(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (!(this.e == null || this.f == null)) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i3 = 0; i3 < pointerCount; i3++) {
                        int pointerId2 = motionEvent.getPointerId(i3);
                        float x3 = motionEvent.getX(i3);
                        float y3 = motionEvent.getY(i3);
                        float f2 = x3 - this.e[pointerId2];
                        float f3 = y3 - this.f[pointerId2];
                        View l3 = l((int) x3, (int) y3);
                        boolean z2 = l3 != null && d(l3, f2, f3);
                        if (z2) {
                            l3.getLeft();
                            this.s.getClass();
                            int top = l3.getTop();
                            int i4 = (int) f3;
                            int a2 = this.s.a(l3, top + i4, i4);
                            this.s.getClass();
                            int b2 = this.s.b(l3);
                            if (b2 != 0) {
                                if (b2 > 0 && a2 == top) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        q(f2, f3, pointerId2);
                        if (this.a == 1 || (z2 && y(l3, pointerId2))) {
                            break;
                        }
                    }
                    s(motionEvent);
                }
            }
            a();
        } else {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            r(x4, y4, pointerId3);
            View l4 = l((int) x4, (int) y4);
            if (l4 == this.t && this.a == 2) {
                y(l4, pointerId3);
            }
            if ((this.i[pointerId3] & this.q) != 0) {
                this.s.getClass();
            }
        }
        if (this.a == 1) {
            return true;
        }
        return false;
    }

    public boolean x(View view, int i2, int i3) {
        this.t = view;
        this.d = -1;
        boolean m2 = m(i2, i3, 0, 0);
        if (!m2 && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return m2;
    }

    /* access modifiers changed from: package-private */
    public boolean y(View view, int i2) {
        if (view == this.t && this.d == i2) {
            return true;
        }
        if (view != null) {
            WearableDrawerView f2 = ((WearableDrawerLayout.d) this.s).f();
            if (view == f2 && !f2.e() && f2.c()) {
                this.d = i2;
                b(view, i2);
                return true;
            }
        }
        return false;
    }
}
