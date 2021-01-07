package android.support.wearable.view.drawer;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.wearable.view.drawer.a;
import android.support.wearable.view.drawer.b;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;

@Deprecated
public class WearableDrawerLayout extends FrameLayout implements View.OnLayoutChangeListener, k4, a.b {
    public static final /* synthetic */ int H = 0;
    private final boolean A;
    private final a B;
    private final Handler C;
    private final c D;
    private final c E;
    final b.c F;
    final b.c G;
    private final int a;
    private final l4 b;
    private final b c;
    private final b f;
    private WearableDrawerView n;
    private WearableDrawerView o;
    private View p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private MotionEvent z;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            WearableDrawerLayout.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (WearableDrawerLayout.this.t) {
                WearableDrawerLayout wearableDrawerLayout = WearableDrawerLayout.this;
                WearableDrawerLayout.m(wearableDrawerLayout, wearableDrawerLayout.o);
                WearableDrawerLayout.this.t = false;
            } else if (WearableDrawerLayout.this.v) {
                WearableDrawerLayout.this.B(80);
                WearableDrawerLayout.this.v = false;
            }
            if (WearableDrawerLayout.this.s) {
                WearableDrawerLayout wearableDrawerLayout2 = WearableDrawerLayout.this;
                WearableDrawerLayout.m(wearableDrawerLayout2, wearableDrawerLayout2.n);
                WearableDrawerLayout.this.s = false;
            } else if (WearableDrawerLayout.this.u) {
                WearableDrawerLayout.this.B(48);
                WearableDrawerLayout.this.u = false;
            }
        }
    }

    private class b extends d {
        b(a aVar) {
            super(null);
        }

        @Override // android.support.wearable.view.drawer.b.c
        public int a(View view, int i, int i2) {
            if (WearableDrawerLayout.this.o != view) {
                return 0;
            }
            int height = WearableDrawerLayout.this.getHeight();
            return Math.max(height - view.getHeight(), Math.min(i, height - WearableDrawerLayout.this.o.getPeekContainer().getHeight()));
        }

        @Override // android.support.wearable.view.drawer.b.c
        public void c(int i, int i2) {
            if (WearableDrawerLayout.this.o != null && i == 8 && !WearableDrawerLayout.this.o.e()) {
                if ((WearableDrawerLayout.this.n == null || !WearableDrawerLayout.this.n.f()) && WearableDrawerLayout.this.o.c()) {
                    WearableDrawerLayout.this.f.b(WearableDrawerLayout.this.o, i2);
                }
            }
        }

        @Override // android.support.wearable.view.drawer.b.c
        public void d(View view, int i, int i2, int i3, int i4) {
            if (view == WearableDrawerLayout.this.o) {
                int height = view.getHeight();
                WearableDrawerLayout.this.o.setOpenedPercent(((float) (WearableDrawerLayout.this.getHeight() - i2)) / ((float) height));
                WearableDrawerLayout.this.invalidate();
            }
        }

        @Override // android.support.wearable.view.drawer.b.c
        public void e(View view, float f, float f2) {
            int i;
            if (view == WearableDrawerLayout.this.o) {
                int height = WearableDrawerLayout.this.getHeight();
                float openedPercent = WearableDrawerLayout.this.o.getOpenedPercent();
                if (f2 < 0.0f || (f2 == 0.0f && openedPercent > 0.5f)) {
                    i = height - view.getHeight();
                } else {
                    WearableDrawerLayout.g(WearableDrawerLayout.this.o);
                    i = WearableDrawerLayout.this.getHeight() - WearableDrawerLayout.this.o.getPeekContainer().getHeight();
                }
                WearableDrawerLayout.this.f.v(0, i);
                WearableDrawerLayout.this.invalidate();
            }
        }

        @Override // android.support.wearable.view.drawer.WearableDrawerLayout.d
        public WearableDrawerView f() {
            return WearableDrawerLayout.this.o;
        }
    }

    /* access modifiers changed from: private */
    public class c implements Runnable {
        private final int a;

        c(int i, a aVar) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            WearableDrawerView w = WearableDrawerLayout.this.w(this.a);
            if (w != null && !w.f() && w.getDrawerState() == 0) {
                WearableDrawerLayout.this.u(this.a);
            }
        }
    }

    /* access modifiers changed from: private */
    public abstract class d extends b.c {
        d(a aVar) {
        }

        @Override // android.support.wearable.view.drawer.b.c
        public int b(View view) {
            if (view == f()) {
                return view.getHeight();
            }
            return 0;
        }

        public abstract WearableDrawerView f();
    }

    public static abstract class e {
    }

    private class f extends d {
        f(a aVar) {
            super(null);
        }

        @Override // android.support.wearable.view.drawer.b.c
        public int a(View view, int i, int i2) {
            if (WearableDrawerLayout.this.n == view) {
                return Math.max(WearableDrawerLayout.this.n.getPeekContainer().getHeight() - view.getHeight(), Math.min(i, 0));
            }
            return 0;
        }

        @Override // android.support.wearable.view.drawer.b.c
        public void c(int i, int i2) {
            if (WearableDrawerLayout.this.n != null && i == 4 && !WearableDrawerLayout.this.n.e()) {
                if ((WearableDrawerLayout.this.o == null || !WearableDrawerLayout.this.o.f()) && WearableDrawerLayout.this.n.c()) {
                    boolean z = WearableDrawerLayout.this.p == null || !WearableDrawerLayout.this.p.canScrollVertically(-1);
                    if (!WearableDrawerLayout.this.n.o() || z) {
                        WearableDrawerLayout.this.c.b(WearableDrawerLayout.this.n, i2);
                    }
                }
            }
        }

        @Override // android.support.wearable.view.drawer.b.c
        public void d(View view, int i, int i2, int i3, int i4) {
            if (view == WearableDrawerLayout.this.n) {
                int height = view.getHeight();
                WearableDrawerLayout.this.n.setOpenedPercent(((float) (i2 + height)) / ((float) height));
                WearableDrawerLayout.this.invalidate();
            }
        }

        @Override // android.support.wearable.view.drawer.b.c
        public void e(View view, float f, float f2) {
            int i;
            if (view == WearableDrawerLayout.this.n) {
                float openedPercent = WearableDrawerLayout.this.n.getOpenedPercent();
                if (f2 > 0.0f || (f2 == 0.0f && openedPercent > 0.5f)) {
                    i = 0;
                } else {
                    WearableDrawerLayout.g(WearableDrawerLayout.this.n);
                    i = WearableDrawerLayout.this.n.getPeekContainer().getHeight() - view.getHeight();
                }
                WearableDrawerLayout.this.c.v(0, i);
                WearableDrawerLayout.this.invalidate();
            }
        }

        @Override // android.support.wearable.view.drawer.WearableDrawerLayout.d
        public WearableDrawerView f() {
            return WearableDrawerLayout.this.n;
        }
    }

    public WearableDrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    public static void D(WearableDrawerView wearableDrawerView) {
        wearableDrawerView.bringToFront();
        View drawerContent = wearableDrawerView.getDrawerContent();
        if (drawerContent != null) {
            drawerContent.setVisibility(0);
        }
        if (wearableDrawerView.g()) {
            wearableDrawerView.getPeekContainer().animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(150).start();
            if (drawerContent != null) {
                drawerContent.setAlpha(0.0f);
                drawerContent.animate().setStartDelay(150).alpha(1.0f).setDuration(150).start();
                return;
            }
            return;
        }
        wearableDrawerView.getPeekContainer().setAlpha(0.0f);
        if (drawerContent != null) {
            drawerContent.setAlpha(1.0f);
        }
    }

    static boolean c(WearableDrawerLayout wearableDrawerLayout, WearableDrawerView wearableDrawerView, int i) {
        View drawerContent;
        wearableDrawerLayout.getClass();
        if (wearableDrawerView == null || (drawerContent = wearableDrawerView.getDrawerContent()) == null) {
            return false;
        }
        return drawerContent.canScrollVertically(i);
    }

    static void g(WearableDrawerView wearableDrawerView) {
        View drawerContent = wearableDrawerView.getDrawerContent();
        if (drawerContent != null) {
            drawerContent.animate().setDuration(150).alpha(0.0f).withEndAction(new d(drawerContent)).start();
        }
        ViewGroup peekContainer = wearableDrawerView.getPeekContainer();
        peekContainer.setVisibility(0);
        peekContainer.animate().setStartDelay(150).setDuration(150).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
        wearableDrawerView.setIsPeeking(true);
    }

    static void m(WearableDrawerLayout wearableDrawerLayout, WearableDrawerView wearableDrawerView) {
        int i;
        wearableDrawerLayout.getClass();
        if (wearableDrawerView != null) {
            WearableDrawerView wearableDrawerView2 = wearableDrawerLayout.n;
            if (wearableDrawerView == wearableDrawerView2) {
                i = wearableDrawerView2.getHeight();
            } else {
                WearableDrawerView wearableDrawerView3 = wearableDrawerLayout.o;
                if (wearableDrawerView == wearableDrawerView3) {
                    i = -wearableDrawerView3.getHeight();
                } else {
                    return;
                }
            }
            wearableDrawerView.offsetTopAndBottom(i);
            wearableDrawerView.setOpenedPercent(1.0f);
            wearableDrawerView.i();
            D(wearableDrawerView);
            wearableDrawerLayout.invalidate();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private WearableDrawerView w(int i) {
        if (i == 48) {
            return this.n;
        }
        if (i != 80) {
            return null;
        }
        return this.o;
    }

    private void x(WearableDrawerView wearableDrawerView) {
        ViewGroup peekContainer;
        if (wearableDrawerView != null && (peekContainer = wearableDrawerView.getPeekContainer()) != null) {
            View drawerContent = wearableDrawerView.getDrawerContent();
            int i = ((FrameLayout.LayoutParams) wearableDrawerView.getLayoutParams()).gravity;
            if (i == 0) {
                i = wearableDrawerView.m();
            }
            wearableDrawerView.setIsPeeking(true);
            peekContainer.setAlpha(1.0f);
            peekContainer.setScaleX(1.0f);
            peekContainer.setScaleY(1.0f);
            peekContainer.setVisibility(0);
            if (drawerContent != null) {
                drawerContent.setAlpha(0.0f);
                drawerContent.setVisibility(8);
            }
            if (i == 80) {
                this.f.x(wearableDrawerView, 0, getHeight() - peekContainer.getHeight());
            } else if (i == 48) {
                this.c.x(wearableDrawerView, 0, -(wearableDrawerView.getHeight() - peekContainer.getHeight()));
                if (!this.A) {
                    if (i == 48) {
                        this.C.removeCallbacks(this.D);
                        this.C.postDelayed(this.D, 1000);
                    } else if (i == 80) {
                        this.C.removeCallbacks(this.E);
                        this.C.postDelayed(this.E, 1000);
                    }
                }
            }
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void y(android.view.View r3) {
        /*
            r2 = this;
            android.view.View r0 = r2.p
            if (r3 == r0) goto L_0x001b
            r0 = r3
        L_0x0005:
            if (r0 == 0) goto L_0x0016
            if (r0 == r2) goto L_0x0016
            boolean r1 = r0 instanceof android.support.wearable.view.drawer.WearableDrawerView
            if (r1 == 0) goto L_0x000f
            r0 = 1
            goto L_0x0017
        L_0x000f:
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            goto L_0x0005
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 != 0) goto L_0x001b
            r2.p = r3
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.view.drawer.WearableDrawerLayout.y(android.view.View):void");
    }

    public void A(View view) {
        if (isLaidOut()) {
            WearableDrawerView wearableDrawerView = this.n;
            if (view == wearableDrawerView) {
                this.c.x(wearableDrawerView, 0, 0);
                D(this.n);
                invalidate();
                return;
            }
            WearableDrawerView wearableDrawerView2 = this.o;
            if (view == wearableDrawerView2) {
                this.f.x(wearableDrawerView2, 0, getHeight() - this.o.getHeight());
                D(this.o);
                invalidate();
            }
        } else if (view == this.n) {
            this.s = true;
        } else if (view == this.o) {
            this.t = true;
        }
    }

    public void B(int i) {
        if (!isLaidOut()) {
            Log.isLoggable("WearableDrawerLayout", 3);
            if (i == 48) {
                this.u = true;
            } else if (i == 80) {
                this.v = true;
            }
        } else {
            x(w(i));
        }
    }

    public void C(WearableDrawerView wearableDrawerView) {
        if (wearableDrawerView != this.n && wearableDrawerView != this.o) {
            throw new IllegalArgumentException("peekDrawer(View) received a drawer that isn't a child.");
        } else if (!isLaidOut()) {
            Log.isLoggable("WearableDrawerLayout", 3);
            if (wearableDrawerView == this.n) {
                this.u = true;
            } else if (wearableDrawerView == this.o) {
                this.v = true;
            }
        } else {
            x(wearableDrawerView);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view instanceof WearableDrawerView) {
            WearableDrawerView wearableDrawerView = (WearableDrawerView) view;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int i2 = layoutParams2.gravity;
            if (i2 == 0 || i2 == -1) {
                layoutParams2.gravity = wearableDrawerView.m();
                i2 = wearableDrawerView.m();
                wearableDrawerView.setLayoutParams(layoutParams);
            }
            if (i2 == 48) {
                this.n = wearableDrawerView;
            } else if (i2 == 80) {
                this.o = wearableDrawerView;
            } else {
                wearableDrawerView = null;
            }
            if (wearableDrawerView != null) {
                wearableDrawerView.addOnLayoutChangeListener(this);
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        boolean i = this.c.i(true);
        boolean i2 = this.f.i(true);
        if (i || i2) {
            int i3 = q4.g;
            int i4 = Build.VERSION.SDK_INT;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.b.a();
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        this.q = systemWindowInsetBottom;
        if (systemWindowInsetBottom != 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.bottomMargin = this.q;
            setLayoutParams(marginLayoutParams);
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        WearableDrawerView wearableDrawerView;
        WearableDrawerView wearableDrawerView2 = this.o;
        if ((wearableDrawerView2 == null || !wearableDrawerView2.f() || this.x) && ((wearableDrawerView = this.n) == null || !wearableDrawerView.f() || this.w)) {
            boolean w2 = this.c.w(motionEvent);
            boolean w3 = this.f.w(motionEvent);
            if (w2 || w3) {
                return true;
            }
            return false;
        }
        this.z = motionEvent;
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        if (this.v || this.u || this.s || this.t) {
            getViewTreeObserver().addOnGlobalLayoutListener(new a());
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        WearableDrawerView wearableDrawerView = this.n;
        if (view == wearableDrawerView) {
            float openedPercent = wearableDrawerView.getOpenedPercent();
            int height = view.getHeight();
            int i9 = (-height) + ((int) (((float) height) * openedPercent));
            view.layout(view.getLeft(), i9, view.getRight(), height + i9);
            return;
        }
        WearableDrawerView wearableDrawerView2 = this.o;
        if (view == wearableDrawerView2) {
            float openedPercent2 = wearableDrawerView2.getOpenedPercent();
            int height2 = view.getHeight();
            int height3 = (int) (((float) getHeight()) - (((float) height2) * openedPercent2));
            view.layout(view.getLeft(), height3, view.getRight(), height2 + height3);
        }
    }

    @Override // android.view.ViewParent, android.view.ViewGroup, defpackage.k4
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return false;
    }

    @Override // android.view.ViewParent, android.view.ViewGroup, defpackage.k4
    public boolean onNestedPreFling(View view, float f2, float f3) {
        y(view);
        this.y = true;
        View view2 = this.p;
        if (view != view2) {
            return false;
        }
        this.B.b(view2);
        return false;
    }

    @Override // android.view.ViewParent, android.view.ViewGroup, defpackage.k4
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        y(view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00d4  */
    @Override // android.view.ViewParent, android.view.ViewGroup, defpackage.k4
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNestedScroll(android.view.View r9, int r10, int r11, int r12, int r13) {
        /*
        // Method dump skipped, instructions count: 262
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.view.drawer.WearableDrawerLayout.onNestedScroll(android.view.View, int, int, int, int):void");
    }

    @Override // android.view.ViewParent, android.view.ViewGroup, defpackage.k4
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.b.c(view, view2, i);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.c.o();
        this.f.o();
    }

    @Override // android.view.ViewParent, android.view.ViewGroup, defpackage.k4
    public boolean onStartNestedScroll(View view, View view2, int i) {
        this.r = 0;
        return true;
    }

    @Override // android.view.ViewParent, android.view.ViewGroup, defpackage.k4
    public void onStopNestedScroll(View view) {
        this.b.d(0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.c.n(motionEvent);
        this.f.n(motionEvent);
        return true;
    }

    public void setDrawerStateCallback(e eVar) {
    }

    public void u(int i) {
        v(w(i));
    }

    public void v(View view) {
        if (view != null) {
            WearableDrawerView wearableDrawerView = this.n;
            if (view == wearableDrawerView) {
                this.c.x(wearableDrawerView, 0, -wearableDrawerView.getHeight());
                invalidate();
                return;
            }
            WearableDrawerView wearableDrawerView2 = this.o;
            if (view == wearableDrawerView2) {
                this.f.x(wearableDrawerView2, 0, getHeight());
                invalidate();
            }
        }
    }

    public void z(View view) {
        WearableDrawerView wearableDrawerView = this.n;
        boolean z2 = false;
        boolean z3 = wearableDrawerView != null && wearableDrawerView.a();
        WearableDrawerView wearableDrawerView2 = this.o;
        if (wearableDrawerView2 != null && wearableDrawerView2.a()) {
            z2 = true;
        }
        boolean canScrollVertically = view.canScrollVertically(-1);
        boolean canScrollVertically2 = view.canScrollVertically(1);
        if (z3 && !canScrollVertically && !this.n.g()) {
            B(48);
        }
        if (!z2) {
            return;
        }
        if ((!canScrollVertically || !canScrollVertically2) && !this.o.g()) {
            B(80);
        }
    }

    public WearableDrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.b = new l4();
        this.C = new Handler(Looper.getMainLooper());
        this.D = new c(48, null);
        this.E = new c(80, null);
        this.B = new a(this);
        f fVar = new f(null);
        this.F = fVar;
        b j = b.j(this, 1.0f, fVar);
        this.c = j;
        j.u(4);
        b bVar = new b(null);
        this.G = bVar;
        b j2 = b.j(this, 1.0f, bVar);
        this.f = j2;
        j2.u(8);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.a = Math.round(displayMetrics.density * 5.0f);
        this.A = ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }
}
