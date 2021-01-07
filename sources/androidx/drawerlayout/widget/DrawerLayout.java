package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import com.spotify.music.C0707R;
import defpackage.d5;
import defpackage.f5;
import defpackage.o5;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup {
    private static final int[] M = {16843828};
    static final int[] N = {16842931};
    static final boolean O;
    private static final boolean P;
    private static boolean Q;
    private boolean A;
    private e B;
    private List<e> C;
    private float D;
    private float E;
    private Drawable F;
    private Object G;
    private boolean H;
    private final ArrayList<View> I;
    private Rect J;
    private Matrix K;
    private final f5 L;
    private final d a;
    private float b;
    private int c;
    private int f;
    private float n;
    private Paint o;
    private final o5 p;
    private final o5 q;
    private final g r;
    private final g s;
    private int t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private int y;
    private int z;

    class a implements f5 {
        a() {
        }

        @Override // defpackage.f5
        public boolean a(View view, f5.a aVar) {
            if (!DrawerLayout.this.m(view) || DrawerLayout.this.h(view) == 2) {
                return false;
            }
            DrawerLayout.this.c(view, true);
            return true;
        }
    }

    class b implements View.OnApplyWindowInsetsListener {
        b(DrawerLayout drawerLayout) {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).q(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class c extends z3 {
        private final Rect a = new Rect();

        c() {
        }

        @Override // defpackage.z3
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            View g = DrawerLayout.this.g();
            if (g == null) {
                return true;
            }
            int i = DrawerLayout.this.i(g);
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            e2.h(i, q4.o(drawerLayout));
            return true;
        }

        @Override // defpackage.z3
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // defpackage.z3
        public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
            if (DrawerLayout.O) {
                super.onInitializeAccessibilityNodeInfo(view, d5Var);
            } else {
                d5 G = d5.G(d5Var);
                super.onInitializeAccessibilityNodeInfo(view, G);
                d5Var.q0(view);
                int i = q4.g;
                int i2 = Build.VERSION.SDK_INT;
                ViewParent parentForAccessibility = view.getParentForAccessibility();
                if (parentForAccessibility instanceof View) {
                    d5Var.i0((View) parentForAccessibility);
                }
                Rect rect = this.a;
                G.j(rect);
                d5Var.N(rect);
                d5Var.t0(G.D());
                d5Var.g0(G.q());
                d5Var.R(G.l());
                d5Var.V(G.n());
                d5Var.X(G.v());
                d5Var.a0(G.x());
                d5Var.K(G.s());
                d5Var.o0(G.B());
                d5Var.a(G.h());
                G.I();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (DrawerLayout.k(childAt)) {
                        d5Var.c(childAt);
                    }
                }
            }
            d5Var.R("androidx.drawerlayout.widget.DrawerLayout");
            d5Var.Z(false);
            d5Var.a0(false);
            d5Var.J(d5.a.e);
            d5Var.J(d5.a.f);
        }

        @Override // defpackage.z3
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.O || DrawerLayout.k(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static final class d extends z3 {
        d() {
        }

        @Override // defpackage.z3
        public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
            super.onInitializeAccessibilityNodeInfo(view, d5Var);
            if (!DrawerLayout.k(view)) {
                d5Var.i0(null);
            }
        }
    }

    public interface e {
        void a(View view);

        void b(View view);

        void c(int i);

        void d(View view, float f);
    }

    /* access modifiers changed from: private */
    public class g extends o5.c {
        private final int a;
        private o5 b;
        private final Runnable c = new a();

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.n();
            }
        }

        g(int i) {
            this.a = i;
        }

        private void m() {
            int i = 3;
            if (this.a == 3) {
                i = 5;
            }
            View e = DrawerLayout.this.e(i);
            if (e != null) {
                DrawerLayout.this.c(e, true);
            }
        }

        @Override // defpackage.o5.c
        public int a(View view, int i, int i2) {
            if (DrawerLayout.this.b(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // defpackage.o5.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // defpackage.o5.c
        public int c(View view) {
            if (DrawerLayout.this.n(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // defpackage.o5.c
        public void e(int i, int i2) {
            View view;
            if ((i & 1) == 1) {
                view = DrawerLayout.this.e(3);
            } else {
                view = DrawerLayout.this.e(5);
            }
            if (view != null && DrawerLayout.this.h(view) == 0) {
                this.b.c(view, i2);
            }
        }

        @Override // defpackage.o5.c
        public boolean f(int i) {
            return false;
        }

        @Override // defpackage.o5.c
        public void g(int i, int i2) {
            DrawerLayout.this.postDelayed(this.c, 160);
        }

        @Override // defpackage.o5.c
        public void h(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).c = false;
            m();
        }

        @Override // defpackage.o5.c
        public void i(int i) {
            DrawerLayout.this.v(i, this.b.q());
        }

        @Override // defpackage.o5.c
        public void j(View view, int i, int i2, int i3, int i4) {
            float f;
            int width = view.getWidth();
            if (DrawerLayout.this.b(view, 3)) {
                f = (float) (i + width);
            } else {
                f = (float) (DrawerLayout.this.getWidth() - i);
            }
            float f2 = f / ((float) width);
            DrawerLayout.this.s(view, f2);
            view.setVisibility(f2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // defpackage.o5.c
        public void k(View view, float f, float f2) {
            int i;
            DrawerLayout.this.getClass();
            float f3 = ((LayoutParams) view.getLayoutParams()).b;
            int width = view.getWidth();
            if (DrawerLayout.this.b(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.b.H(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // defpackage.o5.c
        public boolean l(View view, int i) {
            return DrawerLayout.this.n(view) && DrawerLayout.this.b(view, this.a) && DrawerLayout.this.h(view) == 0;
        }

        /* access modifiers changed from: package-private */
        public void n() {
            View view;
            int i;
            int s = this.b.s();
            int i2 = 0;
            boolean z = this.a == 3;
            if (z) {
                view = DrawerLayout.this.e(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + s;
            } else {
                view = DrawerLayout.this.e(5);
                i = DrawerLayout.this.getWidth() - s;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.h(view) == 0) {
                this.b.J(view, i, view.getTop());
                ((LayoutParams) view.getLayoutParams()).c = true;
                DrawerLayout.this.invalidate();
                m();
                DrawerLayout.this.a();
            }
        }

        public void o() {
            DrawerLayout.this.removeCallbacks(this.c);
        }

        public void p(o5 o5Var) {
            this.b = o5Var;
        }
    }

    static {
        boolean z2 = true;
        int i = Build.VERSION.SDK_INT;
        O = i >= 19;
        P = i >= 21;
        if (i < 29) {
            z2 = false;
        }
        Q = z2;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.drawerLayoutStyle);
    }

    static String j(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    static boolean k(View view) {
        return (q4.n(view) == 4 || q4.n(view) == 2) ? false : true;
    }

    private void t(View view) {
        d5.a aVar = d5.a.l;
        q4.C(view, aVar.b());
        if (m(view) && h(view) != 2) {
            q4.E(view, aVar, null, this.L);
        }
    }

    private void u(View view, boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z2 || n(childAt)) && (!z2 || childAt != view)) {
                q4.O(childAt, 4);
            } else {
                q4.O(childAt, 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.A) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.A = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z2 = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!n(childAt)) {
                    this.I.add(childAt);
                } else if (m(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z2 = true;
                }
            }
            if (!z2) {
                int size = this.I.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.I.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.I.clear();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (f() != null || n(view)) {
            q4.O(view, 4);
        } else {
            q4.O(view, 1);
        }
        if (!O) {
            q4.I(view, this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(View view, int i) {
        return (i(view) & i) == i;
    }

    public void c(View view, boolean z2) {
        if (n(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.v) {
                layoutParams.b = 0.0f;
                layoutParams.d = 0;
            } else if (z2) {
                layoutParams.d |= 4;
                if (b(view, 3)) {
                    this.p.J(view, -view.getWidth(), view.getTop());
                } else {
                    this.q.J(view, getWidth(), view.getTop());
                }
            } else {
                o(view, 0.0f);
                v(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f2 = Math.max(f2, ((LayoutParams) getChildAt(i).getLayoutParams()).b);
        }
        this.n = f2;
        boolean k = this.p.k(true);
        boolean k2 = this.q.k(true);
        if (k || k2) {
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            postInvalidateOnAnimation();
        }
    }

    /* access modifiers changed from: package-private */
    public void d(boolean z2) {
        boolean z3;
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (n(childAt) && (!z2 || layoutParams.c)) {
                int width = childAt.getWidth();
                if (b(childAt, 3)) {
                    z3 = this.p.J(childAt, -width, childAt.getTop());
                } else {
                    z3 = this.q.J(childAt, getWidth(), childAt.getTop());
                }
                z4 |= z3;
                layoutParams.c = false;
            }
        }
        this.r.o();
        this.s.o();
        if (z4) {
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean z2;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.n <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.J == null) {
                this.J = new Rect();
            }
            childAt.getHitRect(this.J);
            if (this.J.contains((int) x2, (int) y2) && !l(childAt)) {
                if (!childAt.getMatrix().isIdentity()) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation((float) (getScrollX() - childAt.getLeft()), (float) (getScrollY() - childAt.getTop()));
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.K == null) {
                            this.K = new Matrix();
                        }
                        matrix.invert(this.K);
                        obtain.transform(this.K);
                    }
                    z2 = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                } else {
                    float scrollX = (float) (getScrollX() - childAt.getLeft());
                    float scrollY = (float) (getScrollY() - childAt.getTop());
                    motionEvent.offsetLocation(scrollX, scrollY);
                    z2 = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean l = l(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (l) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && n(childAt) && childAt.getHeight() >= height) {
                        if (b(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i2) {
                                i2 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f2 = this.n;
        if (f2 > 0.0f && l) {
            int i4 = this.f;
            this.o.setColor((((int) (((float) ((-16777216 & i4) >>> 24)) * f2)) << 24) | (i4 & 16777215));
            canvas.drawRect((float) i, 0.0f, (float) width, (float) getHeight(), this.o);
        }
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    public View e(int i) {
        int h = e2.h(i, q4.o(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((i(childAt) & 7) == h) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (n(childAt)) {
                if (n(childAt)) {
                    if (((LayoutParams) childAt.getLayoutParams()).b > 0.0f) {
                        return childAt;
                    }
                } else {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (P) {
            return this.b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.F;
    }

    public int h(View view) {
        if (n(view)) {
            int i = ((LayoutParams) view.getLayoutParams()).a;
            int o2 = q4.o(this);
            if (i == 3) {
                int i2 = this.w;
                if (i2 != 3) {
                    return i2;
                }
                int i3 = o2 == 0 ? this.y : this.z;
                if (i3 != 3) {
                    return i3;
                }
            } else if (i == 5) {
                int i4 = this.x;
                if (i4 != 3) {
                    return i4;
                }
                int i5 = o2 == 0 ? this.z : this.y;
                if (i5 != 3) {
                    return i5;
                }
            } else if (i == 8388611) {
                int i6 = this.y;
                if (i6 != 3) {
                    return i6;
                }
                int i7 = o2 == 0 ? this.w : this.x;
                if (i7 != 3) {
                    return i7;
                }
            } else if (i == 8388613) {
                int i8 = this.z;
                if (i8 != 3) {
                    return i8;
                }
                int i9 = o2 == 0 ? this.x : this.w;
                if (i9 != 3) {
                    return i9;
                }
            }
            return 0;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    public int i(View view) {
        return e2.h(((LayoutParams) view.getLayoutParams()).a, q4.o(this));
    }

    /* access modifiers changed from: package-private */
    public boolean l(View view) {
        return ((LayoutParams) view.getLayoutParams()).a == 0;
    }

    public boolean m(View view) {
        if (n(view)) {
            return (((LayoutParams) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    public boolean n(View view) {
        int h = e2.h(((LayoutParams) view.getLayoutParams()).a, q4.o(view));
        return ((h & 3) == 0 && (h & 5) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void o(View view, float f2) {
        float f3 = ((LayoutParams) view.getLayoutParams()).b;
        float width = (float) view.getWidth();
        int i = ((int) (width * f2)) - ((int) (f3 * width));
        if (!b(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        s(view, f2);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v = true;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object obj;
        super.onDraw(canvas);
        if (this.H && this.F != null) {
            int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || (obj = this.G) == null) ? 0 : ((WindowInsets) obj).getSystemWindowInsetTop();
            if (systemWindowInsetTop > 0) {
                this.F.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.F.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0036;
     */
    @Override // android.view.ViewGroup
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            o5 r1 = r6.p
            boolean r1 = r1.I(r7)
            o5 r2 = r6.q
            boolean r2 = r2.I(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0036
        L_0x001e:
            o5 r7 = r6.p
            boolean r7 = r7.e(r4)
            if (r7 == 0) goto L_0x0036
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.r
            r7.o()
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.s
            r7.o()
            goto L_0x0036
        L_0x0031:
            r6.d(r2)
            r6.A = r3
        L_0x0036:
            r7 = 0
            goto L_0x0060
        L_0x0038:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.D = r0
            r6.E = r7
            float r4 = r6.n
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005d
            o5 r4 = r6.p
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.o(r0, r7)
            if (r7 == 0) goto L_0x005d
            boolean r7 = r6.l(r7)
            if (r7 == 0) goto L_0x005d
            r7 = 1
            goto L_0x005e
        L_0x005d:
            r7 = 0
        L_0x005e:
            r6.A = r3
        L_0x0060:
            if (r1 != 0) goto L_0x0087
            if (r7 != 0) goto L_0x0087
            int r7 = r6.getChildCount()
            r0 = 0
        L_0x0069:
            if (r0 >= r7) goto L_0x007e
            android.view.View r1 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r1 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r1
            boolean r1 = r1.c
            if (r1 == 0) goto L_0x007b
            r7 = 1
            goto L_0x007f
        L_0x007b:
            int r0 = r0 + 1
            goto L_0x0069
        L_0x007e:
            r7 = 0
        L_0x007f:
            if (r7 != 0) goto L_0x0087
            boolean r7 = r6.A
            if (r7 == 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r2 = 0
        L_0x0087:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.KeyEvent.Callback, android.view.View
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (g() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.KeyEvent.Callback, android.view.View
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View g2 = g();
        if (g2 != null && h(g2) == 0) {
            d(false);
        }
        if (g2 != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f2;
        int i5;
        this.u = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (l(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b(childAt, 3)) {
                        float f3 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.b * f3));
                        f2 = ((float) (measuredWidth + i5)) / f3;
                    } else {
                        float f4 = (float) measuredWidth;
                        int i9 = i6 - ((int) (layoutParams.b * f4));
                        f2 = ((float) (i6 - i9)) / f4;
                        i5 = i9;
                    }
                    boolean z3 = f2 != layoutParams.b;
                    int i10 = layoutParams.a & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i14 > i11 - i15) {
                                i12 = (i11 - i15) - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i5, (i17 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z3) {
                        s(childAt, f2);
                    }
                    int i18 = layoutParams.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
        }
        if (Q && (rootWindowInsets = getRootWindowInsets()) != null) {
            t2 f5 = b5.p(rootWindowInsets).f();
            o5 o5Var = this.p;
            o5Var.E(Math.max(o5Var.r(), f5.a));
            o5 o5Var2 = this.q;
            o5Var2.E(Math.max(o5Var2.r(), f5.c));
        }
        this.u = false;
        this.v = false;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z2 = this.G != null && q4.m(this);
        int o2 = q4.o(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z2) {
                    int h = e2.h(layoutParams.a, o2);
                    if (q4.m(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.G;
                            if (h == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (h == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.G;
                        if (h == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (h == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (l(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else if (n(childAt)) {
                    if (P) {
                        float k = q4.k(childAt);
                        float f2 = this.b;
                        if (k != f2) {
                            q4.N(childAt, f2);
                        }
                    }
                    int i5 = i(childAt) & 7;
                    boolean z5 = i5 == 3;
                    if ((!z5 || !z3) && (z5 || !z4)) {
                        if (z5) {
                            z3 = true;
                        } else {
                            z4 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.c + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                        i4++;
                        i3 = 0;
                    } else {
                        StringBuilder V0 = je.V0("Child drawer has absolute gravity ");
                        V0.append(j(i5));
                        V0.append(" but this ");
                        V0.append("DrawerLayout");
                        V0.append(" already has a drawer view along that edge");
                        throw new IllegalStateException(V0.toString());
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            i4++;
            i3 = 0;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View e2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.a());
        int i = fVar.c;
        if (!(i == 0 || (e2 = e(i)) == null)) {
            p(e2);
        }
        int i2 = fVar.f;
        if (i2 != 3) {
            r(i2, 3);
        }
        int i3 = fVar.n;
        if (i3 != 3) {
            r(i3, 5);
        }
        int i4 = fVar.o;
        if (i4 != 3) {
            r(i4, 8388611);
        }
        int i5 = fVar.p;
        if (i5 != 3) {
            r(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (!P) {
            q4.o(this);
            q4.o(this);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        r1.c = r4.a;
     */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r9 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.drawerlayout.widget.DrawerLayout$f r1 = new androidx.drawerlayout.widget.DrawerLayout$f
            r1.<init>(r0)
            int r0 = r9.getChildCount()
            r2 = 0
            r3 = 0
        L_0x000f:
            if (r3 >= r0) goto L_0x0034
            android.view.View r4 = r9.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r4 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r4
            int r5 = r4.d
            r6 = 1
            if (r5 != r6) goto L_0x0022
            r7 = 1
            goto L_0x0023
        L_0x0022:
            r7 = 0
        L_0x0023:
            r8 = 2
            if (r5 != r8) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r6 = 0
        L_0x0028:
            if (r7 != 0) goto L_0x0030
            if (r6 == 0) goto L_0x002d
            goto L_0x0030
        L_0x002d:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0030:
            int r0 = r4.a
            r1.c = r0
        L_0x0034:
            int r0 = r9.w
            r1.f = r0
            int r0 = r9.x
            r1.n = r0
            int r0 = r9.y
            r1.o = r0
            int r0 = r9.z
            r1.p = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onSaveInstanceState():android.os.Parcelable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        if (h(r7) != 2) goto L_0x005e;
     */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            o5 r0 = r6.p
            r0.y(r7)
            o5 r0 = r6.q
            r0.y(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0062
            if (r0 == r2) goto L_0x0020
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x0070
        L_0x001a:
            r6.d(r2)
            r6.A = r1
            goto L_0x0070
        L_0x0020:
            float r0 = r7.getX()
            float r7 = r7.getY()
            o5 r3 = r6.p
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.o(r4, r5)
            if (r3 == 0) goto L_0x005d
            boolean r3 = r6.l(r3)
            if (r3 == 0) goto L_0x005d
            float r3 = r6.D
            float r0 = r0 - r3
            float r3 = r6.E
            float r7 = r7 - r3
            o5 r3 = r6.p
            int r3 = r3.t()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r7 = r7 + r0
            int r3 = r3 * r3
            float r0 = (float) r3
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x005d
            android.view.View r7 = r6.f()
            if (r7 == 0) goto L_0x005d
            int r7 = r6.h(r7)
            r0 = 2
            if (r7 != r0) goto L_0x005e
        L_0x005d:
            r1 = 1
        L_0x005e:
            r6.d(r1)
            goto L_0x0070
        L_0x0062:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.D = r0
            r6.E = r7
            r6.A = r1
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(View view) {
        if (n(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.v) {
                layoutParams.b = 1.0f;
                layoutParams.d = 1;
                u(view, true);
                t(view);
            } else {
                layoutParams.d |= 2;
                if (b(view, 3)) {
                    this.p.J(view, 0, view.getTop());
                } else {
                    this.q.J(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void q(Object obj, boolean z2) {
        this.G = obj;
        this.H = z2;
        setWillNotDraw(!z2 && getBackground() == null);
        requestLayout();
    }

    public void r(int i, int i2) {
        View e2;
        int h = e2.h(i2, q4.o(this));
        if (i2 == 3) {
            this.w = i;
        } else if (i2 == 5) {
            this.x = i;
        } else if (i2 == 8388611) {
            this.y = i;
        } else if (i2 == 8388613) {
            this.z = i;
        }
        if (i != 0) {
            (h == 3 ? this.p : this.q).b();
        }
        if (i == 1) {
            View e3 = e(h);
            if (e3 != null) {
                c(e3, true);
            }
        } else if (i == 2 && (e2 = e(h)) != null) {
            p(e2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2) {
            d(true);
        }
    }

    @Override // android.view.ViewParent, android.view.View
    public void requestLayout() {
        if (!this.u) {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void s(View view, float f2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f2 != layoutParams.b) {
            layoutParams.b = f2;
            List<e> list = this.C;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        this.C.get(size).d(view, f2);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setDrawerElevation(float f2) {
        this.b = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (n(childAt)) {
                q4.N(childAt, this.b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        List<e> list;
        e eVar2 = this.B;
        if (!(eVar2 == null || eVar2 == null || (list = this.C) == null)) {
            list.remove(eVar2);
        }
        if (eVar != null) {
            if (this.C == null) {
                this.C = new ArrayList();
            }
            this.C.add(eVar);
        }
        this.B = eVar;
    }

    public void setDrawerLockMode(int i) {
        r(i, 3);
        r(i, 5);
    }

    public void setScrimColor(int i) {
        this.f = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.F = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.F = new ColorDrawable(i);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void v(int i, View view) {
        View rootView;
        int u2 = this.p.u();
        int u3 = this.q.u();
        int i2 = 2;
        if (u2 == 1 || u3 == 1) {
            i2 = 1;
        } else if (!(u2 == 2 || u3 == 2)) {
            i2 = 0;
        }
        if (view != null && i == 0) {
            float f2 = ((LayoutParams) view.getLayoutParams()).b;
            if (f2 == 0.0f) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if ((layoutParams.d & 1) == 1) {
                    layoutParams.d = 0;
                    List<e> list = this.C;
                    if (list != null) {
                        for (int size = list.size() - 1; size >= 0; size--) {
                            this.C.get(size).b(view);
                        }
                    }
                    u(view, false);
                    t(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f2 == 1.0f) {
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                if ((layoutParams2.d & 1) == 0) {
                    layoutParams2.d = 1;
                    List<e> list2 = this.C;
                    if (list2 != null) {
                        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                            this.C.get(size2).a(view);
                        }
                    }
                    u(view, true);
                    t(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.t) {
            this.t = i2;
            List<e> list3 = this.C;
            if (list3 != null) {
                for (int size3 = list3.size() - 1; size3 >= 0; size3--) {
                    this.C.get(size3).c(i2);
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new d();
        this.f = -1728053248;
        this.o = new Paint();
        this.v = true;
        this.w = 3;
        this.x = 3;
        this.y = 3;
        this.z = 3;
        this.L = new a();
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.c = (int) ((64.0f * f2) + 0.5f);
        float f3 = f2 * 400.0f;
        g gVar = new g(3);
        this.r = gVar;
        g gVar2 = new g(5);
        this.s = gVar2;
        o5 l = o5.l(this, 1.0f, gVar);
        this.p = l;
        l.F(1);
        l.G(f3);
        gVar.p(l);
        o5 l2 = o5.l(this, 1.0f, gVar2);
        this.q = l2;
        l2.F(2);
        l2.G(f3);
        gVar2.p(l2);
        setFocusableInTouchMode(true);
        q4.O(this, 1);
        q4.I(this, new c());
        setMotionEventSplittingEnabled(false);
        if (q4.m(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new b(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(M);
                try {
                    this.F = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.F = null;
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p5.a, i, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.b = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.b = getResources().getDimension(C0707R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.I = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setStatusBarBackground(int i) {
        this.F = i != 0 ? androidx.core.content.a.d(getContext(), i) : null;
        invalidate();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int a = 0;
        float b;
        boolean c;
        int d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.N);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.a = layoutParams.a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected static class f extends l5 {
        public static final Parcelable.Creator<f> CREATOR = new a();
        int c = 0;
        int f;
        int n;
        int o;
        int p;

        class a implements Parcelable.ClassLoaderCreator<f> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new f[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.f = parcel.readInt();
            this.n = parcel.readInt();
            this.o = parcel.readInt();
            this.p = parcel.readInt();
        }

        @Override // defpackage.l5, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.f);
            parcel.writeInt(this.n);
            parcel.writeInt(this.o);
            parcel.writeInt(this.p);
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
