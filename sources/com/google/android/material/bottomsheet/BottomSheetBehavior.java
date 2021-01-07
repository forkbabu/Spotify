package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.adjust.sdk.Constants;
import com.google.android.material.internal.o;
import com.spotify.music.C0707R;
import defpackage.d5;
import defpackage.f5;
import defpackage.o5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private boolean A;
    private int B;
    private boolean C;
    private int D;
    int E;
    int F;
    WeakReference<V> G;
    WeakReference<View> H;
    private final ArrayList<d> I = new ArrayList<>();
    private VelocityTracker J;
    int K;
    private int L;
    boolean M;
    private Map<View, Integer> N;
    private final o5.c O = new b();
    private int a = 0;
    private boolean b = true;
    private float c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private boolean h;
    private yx i;
    private int j;
    private boolean k;
    private dy l;
    private boolean m;
    private BottomSheetBehavior<V>.f n = null;
    private ValueAnimator o;
    int p;
    int q;
    int r;
    float s = 0.5f;
    int t;
    float u = -1.0f;
    boolean v;
    private boolean w;
    private boolean x = true;
    int y = 4;
    o5 z;

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ int b;

        a(View view, int i) {
            this.a = view;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.z(this.a, this.b);
        }
    }

    class b extends o5.c {
        b() {
        }

        @Override // defpackage.o5.c
        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // defpackage.o5.c
        public int b(View view, int i, int i2) {
            int p = BottomSheetBehavior.this.p();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return e2.f(i, p, bottomSheetBehavior.v ? bottomSheetBehavior.F : bottomSheetBehavior.t);
        }

        @Override // defpackage.o5.c
        public int d(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.v) {
                return bottomSheetBehavior.F;
            }
            return bottomSheetBehavior.t;
        }

        @Override // defpackage.o5.c
        public void i(int i) {
            if (i == 1 && BottomSheetBehavior.this.x) {
                BottomSheetBehavior.this.y(1);
            }
        }

        @Override // defpackage.o5.c
        public void j(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.m(i2);
        }

        @Override // defpackage.o5.c
        public void k(View view, float f, float f2) {
            int i;
            int i2 = 4;
            if (f2 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.v && bottomSheetBehavior.B(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                        int top = view.getTop();
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        if (!(top > (bottomSheetBehavior2.p() + bottomSheetBehavior2.F) / 2)) {
                            if (BottomSheetBehavior.this.b) {
                                i = BottomSheetBehavior.this.q;
                            } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.p) < Math.abs(view.getTop() - BottomSheetBehavior.this.r)) {
                                i = BottomSheetBehavior.this.p;
                            } else {
                                i = BottomSheetBehavior.this.r;
                                i2 = 6;
                                BottomSheetBehavior.this.C(view, i2, i, true);
                            }
                        }
                    }
                    i = BottomSheetBehavior.this.F;
                    i2 = 5;
                    BottomSheetBehavior.this.C(view, i2, i, true);
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (!BottomSheetBehavior.this.b) {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        int i3 = bottomSheetBehavior3.r;
                        if (top2 < i3) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior3.t)) {
                                i = BottomSheetBehavior.this.p;
                            } else {
                                i = BottomSheetBehavior.this.r;
                            }
                        } else if (Math.abs(top2 - i3) < Math.abs(top2 - BottomSheetBehavior.this.t)) {
                            i = BottomSheetBehavior.this.r;
                        } else {
                            i = BottomSheetBehavior.this.t;
                            BottomSheetBehavior.this.C(view, i2, i, true);
                        }
                        i2 = 6;
                        BottomSheetBehavior.this.C(view, i2, i, true);
                    } else if (Math.abs(top2 - BottomSheetBehavior.this.q) < Math.abs(top2 - BottomSheetBehavior.this.t)) {
                        i = BottomSheetBehavior.this.q;
                    } else {
                        i = BottomSheetBehavior.this.t;
                        BottomSheetBehavior.this.C(view, i2, i, true);
                    }
                } else {
                    if (BottomSheetBehavior.this.b) {
                        i = BottomSheetBehavior.this.t;
                    } else {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - BottomSheetBehavior.this.r) < Math.abs(top3 - BottomSheetBehavior.this.t)) {
                            i = BottomSheetBehavior.this.r;
                            i2 = 6;
                        } else {
                            i = BottomSheetBehavior.this.t;
                        }
                    }
                    BottomSheetBehavior.this.C(view, i2, i, true);
                }
            } else if (BottomSheetBehavior.this.b) {
                i = BottomSheetBehavior.this.q;
            } else {
                int top4 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                int i4 = bottomSheetBehavior4.r;
                if (top4 > i4) {
                    i = i4;
                    i2 = 6;
                    BottomSheetBehavior.this.C(view, i2, i, true);
                }
                i = bottomSheetBehavior4.p;
            }
            i2 = 3;
            BottomSheetBehavior.this.C(view, i2, i, true);
        }

        @Override // defpackage.o5.c
        public boolean l(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.y;
            if (i2 == 1 || bottomSheetBehavior.M) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.K == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.H;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.G;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements f5 {
        final /* synthetic */ int a;

        c(int i) {
            this.a = i;
        }

        @Override // defpackage.f5
        public boolean a(View view, f5.a aVar) {
            BottomSheetBehavior.this.x(this.a);
            return true;
        }
    }

    public static abstract class d {
        public abstract void a(View view, float f);

        public abstract void b(View view, int i);
    }

    /* access modifiers changed from: private */
    public class f implements Runnable {
        private final View a;
        private boolean b;
        int c;

        f(View view, int i) {
            this.a = view;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            o5 o5Var = BottomSheetBehavior.this.z;
            if (o5Var == null || !o5Var.k(true)) {
                BottomSheetBehavior.this.y(this.c);
            } else {
                View view = this.a;
                int i = q4.g;
                int i2 = Build.VERSION.SDK_INT;
                view.postOnAnimation(this);
            }
            this.b = false;
        }
    }

    public BottomSheetBehavior() {
    }

    private void A(int i2) {
        V v2 = this.G.get();
        if (v2 != null) {
            ViewParent parent = v2.getParent();
            if (parent == null || !parent.isLayoutRequested() || !q4.v(v2)) {
                z(v2, i2);
            } else {
                v2.post(new a(v2, i2));
            }
        }
    }

    private void D() {
        V v2;
        WeakReference<V> weakReference = this.G;
        if (weakReference != null && (v2 = weakReference.get()) != null) {
            q4.C(v2, 524288);
            q4.C(v2, 262144);
            q4.C(v2, 1048576);
            if (this.v && this.y != 5) {
                h(v2, d5.a.l, 5);
            }
            int i2 = this.y;
            int i3 = 6;
            if (i2 == 3) {
                if (this.b) {
                    i3 = 4;
                }
                h(v2, d5.a.k, i3);
            } else if (i2 == 4) {
                if (this.b) {
                    i3 = 3;
                }
                h(v2, d5.a.j, i3);
            } else if (i2 == 6) {
                h(v2, d5.a.k, 4);
                h(v2, d5.a.j, 3);
            }
        }
    }

    private void E(int i2) {
        ValueAnimator valueAnimator;
        if (i2 != 2) {
            boolean z2 = i2 == 3;
            if (this.m != z2) {
                this.m = z2;
                if (this.i != null && (valueAnimator = this.o) != null) {
                    if (valueAnimator.isRunning()) {
                        this.o.reverse();
                        return;
                    }
                    float f2 = z2 ? 0.0f : 1.0f;
                    this.o.setFloatValues(1.0f - f2, f2);
                    this.o.start();
                }
            }
        }
    }

    private void F(boolean z2) {
        WeakReference<V> weakReference = this.G;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                int i2 = Build.VERSION.SDK_INT;
                if (z2) {
                    if (this.N == null) {
                        this.N = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = coordinatorLayout.getChildAt(i3);
                    if (childAt != this.G.get() && z2) {
                        int i4 = Build.VERSION.SDK_INT;
                        this.N.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z2) {
                    this.N = null;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void G(boolean z2) {
        V v2;
        if (this.G != null) {
            j();
            if (this.y == 4 && (v2 = this.G.get()) != null) {
                if (z2) {
                    A(this.y);
                } else {
                    v2.requestLayout();
                }
            }
        }
    }

    private void h(V v2, d5.a aVar, int i2) {
        q4.E(v2, aVar, null, new c(i2));
    }

    private void j() {
        int k2 = k();
        if (this.b) {
            this.t = Math.max(this.F - k2, this.q);
        } else {
            this.t = this.F - k2;
        }
    }

    private int k() {
        int i2;
        if (this.e) {
            return Math.min(Math.max(this.f, this.F - ((this.E * 9) / 16)), this.D);
        }
        if (this.k || (i2 = this.j) <= 0) {
            return this.d;
        }
        return Math.max(this.d, i2 + this.g);
    }

    private void l(Context context, AttributeSet attributeSet, boolean z2, ColorStateList colorStateList) {
        if (this.h) {
            this.l = dy.c(context, attributeSet, C0707R.attr.bottomSheetStyle, C0707R.style.Widget_Design_BottomSheet_Modal, new rx((float) 0)).m();
            yx yxVar = new yx(this.l);
            this.i = yxVar;
            yxVar.C(context);
            if (!z2 || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.i.setTint(typedValue.data);
                return;
            }
            this.i.H(colorStateList);
        }
    }

    public static <V extends View> BottomSheetBehavior<V> o(V v2) {
        ViewGroup.LayoutParams layoutParams = v2.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.e) {
            CoordinatorLayout.Behavior c2 = ((CoordinatorLayout.e) layoutParams).c();
            if (c2 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) c2;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* access modifiers changed from: package-private */
    public boolean B(View view, float f2) {
        if (this.w) {
            return true;
        }
        if (view.getTop() < this.t) {
            return false;
        }
        if (Math.abs(((f2 * 0.1f) + ((float) view.getTop())) - ((float) this.t)) / ((float) k()) > 0.5f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void C(View view, int i2, int i3, boolean z2) {
        o5 o5Var = this.z;
        if (o5Var != null && (!z2 ? o5Var.J(view, view.getLeft(), i3) : o5Var.H(view.getLeft(), i3))) {
            y(2);
            E(i2);
            if (this.n == null) {
                this.n = new f(view, i2);
            }
            if (!((f) this.n).b) {
                BottomSheetBehavior<V>.f fVar = this.n;
                fVar.c = i2;
                int i4 = q4.g;
                int i5 = Build.VERSION.SDK_INT;
                view.postOnAnimation(fVar);
                ((f) this.n).b = true;
                return;
            }
            this.n.c = i2;
            return;
        }
        y(i2);
    }

    public void i(d dVar) {
        if (!this.I.contains(dVar)) {
            this.I.add(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void m(int i2) {
        float f2;
        float f3;
        V v2 = this.G.get();
        if (!(v2 == null || this.I.isEmpty())) {
            int i3 = this.t;
            if (i2 > i3 || i3 == p()) {
                int i4 = this.t;
                f2 = (float) (i4 - i2);
                f3 = (float) (this.F - i4);
            } else {
                int i5 = this.t;
                f2 = (float) (i5 - i2);
                f3 = (float) (i5 - p());
            }
            float f4 = f2 / f3;
            for (int i6 = 0; i6 < this.I.size(); i6++) {
                this.I.get(i6).a(v2, f4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public View n(View view) {
        if (q4.x(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View n2 = n(viewGroup.getChildAt(i2));
            if (n2 != null) {
                return n2;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(CoordinatorLayout.e eVar) {
        super.onAttachedToLayoutParams(eVar);
        this.G = null;
        this.z = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.G = null;
        this.z = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        o5 o5Var;
        if (!v2.isShown() || !this.x) {
            this.A = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view = null;
        if (actionMasked == 0) {
            this.K = -1;
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.J = null;
            }
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.L = (int) motionEvent.getY();
            if (this.y != 2) {
                WeakReference<View> weakReference = this.H;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x2, this.L)) {
                    this.K = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.M = true;
                }
            }
            this.A = this.K == -1 && !coordinatorLayout.o(v2, x2, this.L);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.M = false;
            this.K = -1;
            if (this.A) {
                this.A = false;
                return false;
            }
        }
        if (!this.A && (o5Var = this.z) != null && o5Var.I(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.H;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        if (actionMasked != 2 || view == null || this.A || this.y == 1 || coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.z == null || Math.abs(((float) this.L) - motionEvent.getY()) <= ((float) this.z.t())) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        yx yxVar;
        if (q4.m(coordinatorLayout) && !q4.m(v2)) {
            v2.setFitsSystemWindows(true);
        }
        if (this.G == null) {
            this.f = coordinatorLayout.getResources().getDimensionPixelSize(C0707R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.k && !this.e) {
                o.b(v2, new b(this));
            }
            this.G = new WeakReference<>(v2);
            if (this.h && (yxVar = this.i) != null) {
                v2.setBackground(yxVar);
            }
            yx yxVar2 = this.i;
            if (yxVar2 != null) {
                float f2 = this.u;
                if (f2 == -1.0f) {
                    f2 = q4.k(v2);
                }
                yxVar2.G(f2);
                boolean z2 = this.y == 3;
                this.m = z2;
                this.i.I(z2 ? 0.0f : 1.0f);
            }
            D();
            if (q4.n(v2) == 0) {
                q4.O(v2, 1);
            }
        }
        if (this.z == null) {
            this.z = o5.m(coordinatorLayout, this.O);
        }
        int top = v2.getTop();
        coordinatorLayout.q(v2, i2);
        this.E = coordinatorLayout.getWidth();
        this.F = coordinatorLayout.getHeight();
        int height = v2.getHeight();
        this.D = height;
        this.q = Math.max(0, this.F - height);
        this.r = (int) ((1.0f - this.s) * ((float) this.F));
        j();
        int i3 = this.y;
        if (i3 == 3) {
            q4.A(v2, p());
        } else if (i3 == 6) {
            q4.A(v2, this.r);
        } else if (this.v && i3 == 5) {
            q4.A(v2, this.F);
        } else if (i3 == 4) {
            q4.A(v2, this.t);
        } else if (i3 == 1 || i3 == 2) {
            q4.A(v2, top - v2.getTop());
        }
        this.H = new WeakReference<>(n(v2));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.H;
        return weakReference != null && view == weakReference.get() && (this.y != 3 || super.onNestedPreFling(coordinatorLayout, v2, view, f2, f3));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 != 1) {
            WeakReference<View> weakReference = this.H;
            if (view == (weakReference != null ? weakReference.get() : null)) {
                int top = v2.getTop();
                int i5 = top - i3;
                if (i3 > 0) {
                    if (i5 < p()) {
                        iArr[1] = top - p();
                        q4.A(v2, -iArr[1]);
                        y(3);
                    } else if (this.x) {
                        iArr[1] = i3;
                        q4.A(v2, -i3);
                        y(1);
                    } else {
                        return;
                    }
                } else if (i3 < 0 && !view.canScrollVertically(-1)) {
                    int i6 = this.t;
                    if (i5 > i6 && !this.v) {
                        iArr[1] = top - i6;
                        q4.A(v2, -iArr[1]);
                        y(4);
                    } else if (this.x) {
                        iArr[1] = i3;
                        q4.A(v2, -i3);
                        y(1);
                    } else {
                        return;
                    }
                }
                m(v2.getTop());
                this.B = i3;
                this.C = true;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v2, eVar.a());
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.d = eVar.f;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.b = eVar.n;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.v = eVar.o;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.w = eVar.p;
            }
        }
        int i3 = eVar.c;
        if (i3 == 1 || i3 == 2) {
            this.y = 4;
        } else {
            this.y = i3;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v2) {
        return new e(super.onSaveInstanceState(coordinatorLayout, v2), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.B = 0;
        this.C = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v2, View view, int i2) {
        int i3;
        float f2;
        int i4 = 3;
        if (v2.getTop() == p()) {
            y(3);
            return;
        }
        WeakReference<View> weakReference = this.H;
        if (weakReference != null && view == weakReference.get() && this.C) {
            if (this.B > 0) {
                if (this.b) {
                    i3 = this.q;
                } else {
                    int top = v2.getTop();
                    int i5 = this.r;
                    if (top > i5) {
                        i3 = i5;
                    } else {
                        i3 = this.p;
                    }
                }
                C(v2, i4, i3, false);
                this.C = false;
            }
            if (this.v) {
                VelocityTracker velocityTracker = this.J;
                if (velocityTracker == null) {
                    f2 = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(Constants.ONE_SECOND, this.c);
                    f2 = this.J.getYVelocity(this.K);
                }
                if (B(v2, f2)) {
                    i3 = this.F;
                    i4 = 5;
                    C(v2, i4, i3, false);
                    this.C = false;
                }
            }
            if (this.B == 0) {
                int top2 = v2.getTop();
                if (!this.b) {
                    int i6 = this.r;
                    if (top2 < i6) {
                        if (top2 < Math.abs(top2 - this.t)) {
                            i3 = this.p;
                            C(v2, i4, i3, false);
                            this.C = false;
                        }
                        i3 = this.r;
                    } else if (Math.abs(top2 - i6) < Math.abs(top2 - this.t)) {
                        i3 = this.r;
                    } else {
                        i3 = this.t;
                    }
                } else if (Math.abs(top2 - this.q) < Math.abs(top2 - this.t)) {
                    i3 = this.q;
                    C(v2, i4, i3, false);
                    this.C = false;
                } else {
                    i3 = this.t;
                }
            } else if (this.b) {
                i3 = this.t;
            } else {
                int top3 = v2.getTop();
                if (Math.abs(top3 - this.r) < Math.abs(top3 - this.t)) {
                    i3 = this.r;
                } else {
                    i3 = this.t;
                }
            }
            i4 = 4;
            C(v2, i4, i3, false);
            this.C = false;
            i4 = 6;
            C(v2, i4, i3, false);
            this.C = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.y == 1 && actionMasked == 0) {
            return true;
        }
        o5 o5Var = this.z;
        if (o5Var != null) {
            o5Var.y(motionEvent);
        }
        if (actionMasked == 0) {
            this.K = -1;
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.J = null;
            }
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        if (this.z != null && actionMasked == 2 && !this.A && Math.abs(((float) this.L) - motionEvent.getY()) > ((float) this.z.t())) {
            this.z.c(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.A;
    }

    public int p() {
        return this.b ? this.q : this.p;
    }

    public int q() {
        return this.y;
    }

    public void r(d dVar) {
        this.I.remove(dVar);
    }

    @Deprecated
    public void s(d dVar) {
        this.I.clear();
        this.I.add(dVar);
    }

    public void t(boolean z2) {
        this.x = z2;
    }

    public void u(boolean z2) {
        if (this.v != z2) {
            this.v = z2;
            if (!z2 && this.y == 5) {
                x(4);
            }
            D();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = -1
            r2 = 0
            if (r4 != r1) goto L_0x000c
            boolean r4 = r3.e
            if (r4 != 0) goto L_0x0015
            r3.e = r0
            goto L_0x001f
        L_0x000c:
            boolean r1 = r3.e
            if (r1 != 0) goto L_0x0017
            int r1 = r3.d
            if (r1 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.e = r2
            int r4 = java.lang.Math.max(r2, r4)
            r3.d = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.G(r2)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.v(int):void");
    }

    public void w(boolean z2) {
        this.w = z2;
    }

    public void x(int i2) {
        if (i2 != this.y) {
            if (this.G != null) {
                A(i2);
            } else if (i2 == 4 || i2 == 3 || i2 == 6 || (this.v && i2 == 5)) {
                this.y = i2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void y(int i2) {
        V v2;
        if (this.y != i2) {
            this.y = i2;
            WeakReference<V> weakReference = this.G;
            if (!(weakReference == null || (v2 = weakReference.get()) == null)) {
                if (i2 == 3) {
                    F(true);
                } else if (i2 == 6 || i2 == 5 || i2 == 4) {
                    F(false);
                }
                E(i2);
                for (int i3 = 0; i3 < this.I.size(); i3++) {
                    this.I.get(i3).b(v2, i2);
                }
                D();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void z(View view, int i2) {
        int i3;
        int i4;
        if (i2 == 4) {
            i3 = this.t;
        } else if (i2 == 6) {
            i3 = this.r;
            if (this.b && i3 <= (i4 = this.q)) {
                i2 = 3;
                i3 = i4;
            }
        } else if (i2 == 3) {
            i3 = p();
        } else if (!this.v || i2 != 5) {
            throw new IllegalArgumentException(je.p0("Illegal state argument: ", i2));
        } else {
            i3 = this.F;
        }
        C(view, i2, i3, false);
    }

    protected static class e extends l5 {
        public static final Parcelable.Creator<e> CREATOR = new a();
        final int c;
        int f;
        boolean n;
        boolean o;
        boolean p;

        static class a implements Parcelable.ClassLoaderCreator<e> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new e[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new e(parcel, (ClassLoader) null);
            }
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.f = parcel.readInt();
            boolean z = false;
            this.n = parcel.readInt() == 1;
            this.o = parcel.readInt() == 1;
            this.p = parcel.readInt() == 1 ? true : z;
        }

        @Override // defpackage.l5, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.f);
            parcel.writeInt(this.n ? 1 : 0);
            parcel.writeInt(this.o ? 1 : 0);
            parcel.writeInt(this.p ? 1 : 0);
        }

        public e(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.c = bottomSheetBehavior.y;
            this.f = ((BottomSheetBehavior) bottomSheetBehavior).d;
            this.n = ((BottomSheetBehavior) bottomSheetBehavior).b;
            this.o = bottomSheetBehavior.v;
            this.p = ((BottomSheetBehavior) bottomSheetBehavior).w;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        this.g = context.getResources().getDimensionPixelSize(C0707R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pw.f);
        this.h = obtainStyledAttributes.hasValue(11);
        boolean hasValue = obtainStyledAttributes.hasValue(1);
        if (hasValue) {
            l(context, attributeSet, hasValue, jx.a(context, obtainStyledAttributes, 1));
        } else {
            l(context, attributeSet, hasValue, null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.o = ofFloat;
        ofFloat.setDuration(500L);
        this.o.addUpdateListener(new a(this));
        if (Build.VERSION.SDK_INT >= 21) {
            this.u = obtainStyledAttributes.getDimension(0, -1.0f);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(7);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            v(obtainStyledAttributes.getDimensionPixelSize(7, -1));
        } else {
            v(i2);
        }
        u(obtainStyledAttributes.getBoolean(6, false));
        this.k = obtainStyledAttributes.getBoolean(10, false);
        boolean z2 = obtainStyledAttributes.getBoolean(4, true);
        if (this.b != z2) {
            this.b = z2;
            if (this.G != null) {
                j();
            }
            y((!this.b || this.y != 6) ? this.y : 3);
            D();
        }
        this.w = obtainStyledAttributes.getBoolean(9, false);
        this.x = obtainStyledAttributes.getBoolean(2, true);
        this.a = obtainStyledAttributes.getInt(8, 0);
        float f2 = obtainStyledAttributes.getFloat(5, 0.5f);
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.s = f2;
        if (this.G != null) {
            this.r = (int) ((1.0f - f2) * ((float) this.F));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(3);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            if (dimensionPixelOffset >= 0) {
                this.p = dimensionPixelOffset;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            int i3 = peekValue2.data;
            if (i3 >= 0) {
                this.p = i3;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        obtainStyledAttributes.recycle();
        this.c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
