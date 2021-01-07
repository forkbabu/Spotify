package android.support.wearable.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class WearableListView extends RecyclerView {
    private final int O0;
    private final int P0;
    private boolean Q0;
    private boolean R0;
    private boolean S0;
    private int T0;
    private int U0;
    private f V0;
    private Animator W0;
    private int X0;
    private final m Y0;
    private final List<l> Z0;
    private final List<i> a1;
    private k b1;
    private boolean c1;
    private float d1;
    private float e1;
    private float f1;
    private final int g1;
    private boolean h1;
    private int i1;
    private Scroller j1;
    private final float[] k1;
    private boolean l1;
    private int m1;
    private int n1;
    private final int[] o1;
    private View p1;
    private final Runnable q1;
    private final Runnable r1;
    private final Runnable s1;
    private final j t1;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (WearableListView.this.getChildCount() > 0) {
                WearableListView wearableListView = WearableListView.this;
                wearableListView.p1 = wearableListView.getChildAt(wearableListView.n1());
                WearableListView.this.p1.setPressed(true);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WearableListView.this.t1();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WearableListView.this.s1(false);
        }
    }

    class d extends RecyclerView.q {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0 && WearableListView.this.getChildCount() > 0) {
                WearableListView.this.r1(null, i);
            }
            for (l lVar : WearableListView.this.Z0) {
                lVar.c(i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void c(RecyclerView recyclerView, int i, int i2) {
            WearableListView.j1(WearableListView.this, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public class e extends i {
        e() {
        }

        @Override // android.support.wearable.view.i, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!b()) {
                WearableListView.this.R0 = true;
            }
        }
    }

    public interface f {
        void a();

        void b(o oVar);
    }

    /* access modifiers changed from: private */
    public class g extends RecyclerView.m {
        private int B;
        private boolean C;
        private int D;
        private boolean E = true;
        private boolean F = false;
        private RecyclerView.x G;

        g(a aVar) {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private int N1() {
            int W = W();
            int o1 = WearableListView.o1(WearableListView.this);
            int i = Integer.MAX_VALUE;
            int i2 = -1;
            for (int i3 = 0; i3 < W; i3++) {
                int abs = Math.abs(o1 - (WearableListView.this.getTop() + WearableListView.o1(WearableListView.this.getLayoutManager().V(i3))));
                if (abs < i) {
                    i2 = i3;
                    i = abs;
                }
            }
            if (i2 != -1) {
                return i2;
            }
            throw new IllegalStateException("Can't find central view.");
        }

        private void P1(View view) {
            Q1(view, (g0() / 3) + 1);
        }

        private void Q1(View view, int i) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            view.measure(RecyclerView.m.Y(v0(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width, false), RecyclerView.m.Y(g0(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, i, C()));
        }

        private void R1(int i) {
            this.D = i;
            for (l lVar : WearableListView.this.Z0) {
                lVar.b(this.D);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public boolean C() {
            return i0() != 1 || !this.F;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public void I1(RecyclerView recyclerView, RecyclerView.y yVar, int i) {
            if (this.G == null) {
                this.G = new n(recyclerView.getContext(), this);
            }
            RecyclerView.x xVar = this.G;
            xVar.m(i);
            J1(xVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public void K0(RecyclerView.e eVar, RecyclerView.e eVar2) {
            m1();
        }

        public int O1() {
            return this.B;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public RecyclerView.LayoutParams R() {
            return new RecyclerView.LayoutParams(-1, -2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
            r2 = r8;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c1(androidx.recyclerview.widget.RecyclerView.s r11, androidx.recyclerview.widget.RecyclerView.y r12) {
            /*
            // Method dump skipped, instructions count: 358
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.view.WearableListView.g.c1(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$y):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public void v1(int i) {
            this.E = false;
            if (i > 0) {
                this.B = i - 1;
                this.C = true;
            } else {
                this.B = i;
                this.C = false;
            }
            t1();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f5, code lost:
            r13 = r5;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int w1(int r11, androidx.recyclerview.widget.RecyclerView.s r12, androidx.recyclerview.widget.RecyclerView.y r13) {
            /*
            // Method dump skipped, instructions count: 352
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.view.WearableListView.g.w1(int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$y):int");
        }
    }

    public interface h {
        void a(boolean z);

        void b(boolean z);
    }

    public interface i {
        void a(int i);
    }

    private static class j extends RecyclerView.g implements View.OnLayoutChangeListener {
        private WeakReference<WearableListView> a;
        private RecyclerView.e b;
        private boolean c;
        private boolean f;

        j(a aVar) {
        }

        private void i() {
            if (this.f) {
                WeakReference<WearableListView> weakReference = this.a;
                WearableListView wearableListView = weakReference == null ? null : weakReference.get();
                if (wearableListView != null) {
                    wearableListView.removeOnLayoutChangeListener(this);
                }
                this.f = false;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void a() {
            WeakReference<WearableListView> weakReference = this.a;
            WearableListView wearableListView = weakReference == null ? null : weakReference.get();
            if (!this.f && wearableListView != null) {
                wearableListView.addOnLayoutChangeListener(this);
                this.f = true;
            }
        }

        public void g(RecyclerView.e eVar) {
            i();
            if (this.c) {
                this.b.W(this);
                this.c = false;
            }
            this.b = eVar;
            if (eVar != null) {
                eVar.T(this);
                this.c = true;
            }
        }

        public void h(WearableListView wearableListView) {
            i();
            this.a = new WeakReference<>(wearableListView);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            WearableListView wearableListView = this.a.get();
            if (wearableListView != null) {
                i();
                if (wearableListView.getChildCount() > 0) {
                    wearableListView.l1();
                }
            }
        }
    }

    public interface k {
        void a();
    }

    public interface l {
        void a(int i);

        @Deprecated
        void b(int i);

        void c(int i);

        void d(int i);
    }

    /* access modifiers changed from: private */
    public static class m extends Property<WearableListView, Integer> {
        public m() {
            super(Integer.class, "scrollVertically");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public Integer get(WearableListView wearableListView) {
            return Integer.valueOf(wearableListView.X0);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(WearableListView wearableListView, Integer num) {
            wearableListView.setScrollVertically(num.intValue());
        }
    }

    private static class n extends t {
        private final g q;

        public n(Context context, g gVar) {
            super(context);
            this.q = gVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.x
        public PointF a(int i) {
            if (i < this.q.O1()) {
                return new PointF(0.0f, -1.0f);
            }
            return new PointF(0.0f, 1.0f);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.t, androidx.recyclerview.widget.RecyclerView.x
        public void j() {
        }

        @Override // androidx.recyclerview.widget.t
        public int p(int i, int i2, int i3, int i4, int i5) {
            return ((i3 + i4) / 2) - ((i + i2) / 2);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.t
        public float q(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public static class o extends RecyclerView.b0 {
    }

    public WearableListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getAdjustedHeight() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getItemHeight() {
        return (getAdjustedHeight() / 3) + 1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getTopViewMaxTop() {
        return getHeight() / 2;
    }

    static void j1(WearableListView wearableListView, int i2) {
        for (l lVar : wearableListView.Z0) {
            lVar.d(i2);
        }
        wearableListView.s1(true);
    }

    private void m1(float[] fArr) {
        int[] iArr = this.o1;
        iArr[1] = 0;
        iArr[0] = 0;
        getLocationOnScreen(iArr);
        float f2 = (float) this.o1[1];
        float height = (float) getHeight();
        fArr[0] = (0.33f * height) + f2;
        fArr[1] = (height * 0.66999996f) + f2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int n1() {
        int childCount = getChildCount();
        int o12 = o1(this);
        int i2 = Integer.MAX_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < childCount; i4++) {
            int abs = Math.abs(o12 - (getTop() + o1(getChildAt(i4))));
            if (abs < i2) {
                i3 = i4;
                i2 = abs;
            }
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalStateException("Can't find central view.");
    }

    /* access modifiers changed from: private */
    public static int o1(View view) {
        return (((view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop()) / 2) + view.getPaddingTop() + view.getTop();
    }

    private boolean q1(MotionEvent motionEvent) {
        if (this.l1) {
            return this.h1;
        }
        float abs = Math.abs(this.d1 - motionEvent.getX());
        float abs2 = Math.abs(this.e1 - motionEvent.getY());
        float f2 = (abs2 * abs2) + (abs * abs);
        int i2 = this.g1;
        if (f2 > ((float) (i2 * i2))) {
            if (abs > abs2) {
                this.h1 = false;
            }
            this.l1 = true;
        }
        return this.h1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r1(android.view.MotionEvent r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5.R0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x005f
            if (r6 == 0) goto L_0x005f
            boolean r0 = r5.isEnabled()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r6 = 0
            goto L_0x004c
        L_0x0010:
            float r0 = r6.getX()
            float r3 = r6.getY()
            int r4 = r5.n1()
            android.view.View r0 = r5.M(r0, r3)
            if (r0 != 0) goto L_0x0023
            goto L_0x000e
        L_0x0023:
            androidx.recyclerview.widget.RecyclerView$b0 r0 = super.a0(r0)
            android.support.wearable.view.WearableListView$o r0 = (android.support.wearable.view.WearableListView.o) r0
            float[] r3 = r5.k1
            r5.m1(r3)
            if (r4 != 0) goto L_0x0044
            float r6 = r6.getRawY()
            float[] r3 = r5.k1
            r3 = r3[r2]
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x0044
            android.support.wearable.view.WearableListView$f r6 = r5.V0
            if (r6 == 0) goto L_0x0044
            r6.a()
            goto L_0x004b
        L_0x0044:
            android.support.wearable.view.WearableListView$f r6 = r5.V0
            if (r6 == 0) goto L_0x004b
            r6.b(r0)
        L_0x004b:
            r6 = 1
        L_0x004c:
            if (r6 == 0) goto L_0x005f
            android.os.Handler r6 = r5.getHandler()
            if (r6 == 0) goto L_0x005e
            java.lang.Runnable r7 = r5.r1
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            long r0 = (long) r0
            r6.postDelayed(r7, r0)
        L_0x005e:
            return
        L_0x005f:
            if (r7 == 0) goto L_0x0062
            return
        L_0x0062:
            int r6 = r5.getChildCount()
            if (r6 <= 0) goto L_0x0086
            float r6 = r5.f1
            int r7 = r5.getCentralViewTop()
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x0086
            android.view.View r6 = r5.getChildAt(r2)
            int r6 = r6.getTop()
            int r7 = r5.getTopViewMaxTop()
            if (r6 < r7) goto L_0x0086
            android.support.wearable.view.WearableListView$k r6 = r5.b1
            if (r6 == 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r1 = 0
        L_0x0087:
            if (r1 == 0) goto L_0x008f
            android.support.wearable.view.WearableListView$k r6 = r5.b1
            r6.a()
            goto L_0x0092
        L_0x008f:
            r5.l1()
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.view.WearableListView.r1(android.view.MotionEvent, int):void");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void s1(boolean z) {
        g gVar = (g) getLayoutManager();
        int W = gVar.W();
        if (W != 0) {
            int N1 = gVar.N1();
            int i2 = 0;
            while (i2 < W) {
                o p12 = p1(gVar.V(i2));
                boolean z2 = i2 == N1;
                View view = p12.a;
                if (view instanceof h) {
                    h hVar = (h) view;
                    if (z2) {
                        hVar.a(z);
                    } else {
                        hVar.b(z);
                    }
                }
                i2++;
            }
            int B = p1(getChildAt(N1)).B();
            if (B != this.m1) {
                int baseline = getBaseline();
                if (this.n1 != baseline) {
                    this.n1 = baseline;
                    requestLayout();
                }
                for (l lVar : this.Z0) {
                    lVar.a(B);
                }
                for (i iVar : this.a1) {
                    iVar.a(B);
                }
                this.m1 = B;
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setScrollVertically(int i2) {
        scrollBy(0, i2 - this.X0);
        this.X0 = i2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void t1() {
        View view = this.p1;
        if (view != null) {
            view.setPressed(false);
            this.p1 = null;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.q1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean U(int i2, int i3) {
        if (getChildCount() == 0) {
            return false;
        }
        int X = X(getChildAt(n1()));
        if ((X == 0 && i3 < 0) || (X == getAdapter().u() - 1 && i3 > 0)) {
            return super.U(i2, i3);
        }
        if (Math.abs(i3) < this.O0) {
            return false;
        }
        int max = Math.max(Math.min(i3, this.P0), -this.P0);
        if (this.j1 == null) {
            this.j1 = new Scroller(getContext(), null, true);
        }
        this.j1.fling(0, 0, 0, max, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int finalY = this.j1.getFinalY() / ((getAdjustedHeight() / 2) + getPaddingTop());
        if (finalY == 0) {
            finalY = max > 0 ? 1 : -1;
        }
        N0(Math.max(0, Math.min(getAdapter().u() - 1, X + finalY)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public RecyclerView.b0 a0(View view) {
        return (o) super.a0(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public int getBaseline() {
        if (getChildCount() == 0) {
            return super.getBaseline();
        }
        int baseline = getChildAt(n1()).getBaseline();
        if (baseline == -1) {
            return super.getBaseline();
        }
        return getCentralViewTop() + baseline;
    }

    public int getCentralViewTop() {
        return getPaddingTop() + getItemHeight();
    }

    public boolean getMaximizeSingleItem() {
        return this.Q0;
    }

    public void l1() {
        if (getChildCount() != 0) {
            int centralViewTop = getCentralViewTop() - getChildAt(n1()).getTop();
            e eVar = new e();
            Animator animator = this.W0;
            if (animator != null) {
                animator.cancel();
            }
            this.X0 = 0;
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, this.Y0, 0, -centralViewTop);
            this.W0 = ofInt;
            ofInt.setDuration(150L);
            this.W0.addListener(eVar);
            this.W0.start();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t1.h(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.t1.h(null);
        super.onDetachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!z.c(motionEvent) || motionEvent.getAction() != 8) {
            super.onGenericMotionEvent(motionEvent);
            return false;
        }
        scrollBy(0, Math.round(z.b(getContext()) * (-z.a(motionEvent))));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.c1 && getChildCount() > 0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.d1 = motionEvent.getX();
                this.e1 = motionEvent.getY();
                this.f1 = getChildCount() > 0 ? (float) getChildAt(0).getTop() : 0.0f;
                this.h1 = true;
                this.l1 = false;
            } else if (actionMasked == 2 && this.h1) {
                q1(motionEvent);
            }
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(this.h1);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.KeyEvent.Callback, android.view.View
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.S0) {
            switch (i2) {
                case 260:
                    U(0, -this.O0);
                    return true;
                case 261:
                    U(0, this.O0);
                    return true;
                case 262:
                    if (isEnabled() && getVisibility() == 0 && getChildCount() >= 1) {
                        View childAt = getChildAt(n1());
                        o p12 = p1(childAt);
                        if (childAt.performClick()) {
                            return true;
                        }
                        f fVar = this.V0;
                        if (fVar != null) {
                            fVar.b(p12);
                            return true;
                        }
                    }
                    return false;
                case 263:
                    return false;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Handler handler;
        if (!isEnabled()) {
            return false;
        }
        int scrollState = getScrollState();
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (getChildCount() > 0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (this.R0) {
                    this.T0 = (int) motionEvent.getX();
                    this.U0 = (int) motionEvent.getY();
                    float rawY = motionEvent.getRawY();
                    m1(this.k1);
                    float[] fArr = this.k1;
                    if (rawY > fArr[0] && rawY < fArr[1] && (getChildAt(n1()) instanceof h) && (handler = getHandler()) != null) {
                        handler.removeCallbacks(this.r1);
                        handler.postDelayed(this.q1, (long) ViewConfiguration.getTapTimeout());
                    }
                }
            } else if (actionMasked == 1) {
                r1(motionEvent, scrollState);
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            } else if (actionMasked == 2) {
                if (Math.abs(this.T0 - ((int) motionEvent.getX())) >= this.g1 || Math.abs(this.U0 - ((int) motionEvent.getY())) >= this.g1) {
                    t1();
                    this.R0 = false;
                }
                onTouchEvent |= q1(motionEvent);
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(this.h1);
                }
            } else if (actionMasked == 3) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                this.R0 = true;
            }
        }
        return onTouchEvent;
    }

    public o p1(View view) {
        return (o) super.a0(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.e eVar) {
        this.t1.g(eVar);
        super.setAdapter(eVar);
    }

    public void setClickListener(f fVar) {
        this.V0 = fVar;
    }

    public void setEnableGestureNavigation(boolean z) {
        this.S0 = z;
    }

    public void setGreedyTouchMode(boolean z) {
        this.c1 = z;
    }

    public void setInitialOffset(int i2) {
        this.i1 = i2;
    }

    public void setMaximizeSingleItem(boolean z) {
        this.Q0 = z;
    }

    public void setOverScrollListener(k kVar) {
        this.b1 = kVar;
    }

    public WearableListView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.R0 = true;
        this.S0 = true;
        this.Y0 = new m();
        this.Z0 = new ArrayList();
        this.a1 = new ArrayList();
        this.i1 = 0;
        this.k1 = new float[2];
        this.m1 = -1;
        this.n1 = -1;
        this.o1 = new int[2];
        this.p1 = null;
        this.q1 = new a();
        this.r1 = new b();
        this.s1 = new c();
        this.t1 = new j(null);
        setHasFixedSize(true);
        setOverScrollMode(2);
        setLayoutManager(new g(null));
        setOnScrollListener(new d());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.g1 = viewConfiguration.getScaledTouchSlop();
        this.O0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.P0 = viewConfiguration.getScaledMaximumFlingVelocity();
    }
}
