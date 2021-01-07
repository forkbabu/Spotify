package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.j;
import com.spotify.music.C0707R;
import defpackage.d5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    private int a;
    private int b;
    private int c;
    private int f;
    private boolean n;
    private int o;
    private b5 p;
    private List<b> q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private WeakReference<View> v;
    private ValueAnimator w;
    private int[] x;
    private Drawable y;

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class a extends BaseBehavior.a<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return onStartNestedScroll(coordinatorLayout, (AppBarLayout) view, view2, view3, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public float f(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.Behavior c = ((CoordinatorLayout.e) appBarLayout.getLayoutParams()).c();
                int g = c instanceof BaseBehavior ? ((BaseBehavior) c).g() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + g > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) g) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public int h(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return view.getMeasuredHeight();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public AppBarLayout d(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.Behavior c = ((CoordinatorLayout.e) view2.getLayoutParams()).c();
            if (c instanceof BaseBehavior) {
                q4.A(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) c).j) + i()) - e(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.d()) {
                return false;
            }
            appBarLayout.k(appBarLayout.l(view));
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                q4.C(coordinatorLayout, d5.a.h.b());
                q4.C(coordinatorLayout, d5.a.i.b());
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout k = d(coordinatorLayout.j(view));
            if (k != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    k.i(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pw.F);
            j(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    class a implements m4 {
        a() {
        }

        @Override // defpackage.m4
        public b5 onApplyWindowInsets(View view, b5 b5Var) {
            AppBarLayout.this.f(b5Var);
            return b5Var;
        }
    }

    public interface b<T extends AppBarLayout> {
        void onOffsetChanged(T t, int i);
    }

    public interface c extends b<AppBarLayout> {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.appBarLayoutStyle);
    }

    private void j(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.o = i2 | i;
        requestLayout();
    }

    private boolean m() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || q4.m(childAt)) {
            return false;
        }
        return true;
    }

    private void n() {
        setWillNotDraw(!(this.y != null && getTopInset() > 0));
    }

    public void a(c cVar) {
        if (this.q == null) {
            this.q = new ArrayList();
        }
        if (cVar != null && !this.q.contains(cVar)) {
            this.q.add(cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public boolean d() {
        return this.t;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.y != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.a));
            this.y.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.y;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(int i) {
        this.a = i;
        if (!willNotDraw()) {
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            postInvalidateOnAnimation();
        }
        List<b> list = this.q;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                b bVar = this.q.get(i4);
                if (bVar != null) {
                    bVar.onOffsetChanged(this, i);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public b5 f(b5 b5Var) {
        b5 b5Var2 = q4.m(this) ? b5Var : null;
        if (!e2.g(this.p, b5Var2)) {
            this.p = b5Var2;
            n();
            requestLayout();
        }
        return b5Var;
    }

    public void g(c cVar) {
        List<b> list = this.q;
        if (list != null && cVar != null) {
            list.remove(cVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i;
        int p2;
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.a;
            if ((i4 & 5) == 5) {
                int i5 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if ((i4 & 8) != 0) {
                    p2 = q4.p(childAt);
                } else if ((i4 & 2) != 0) {
                    p2 = measuredHeight - q4.p(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && q4.m(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = p2 + i5;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.c = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i = this.f;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
            int i4 = layoutParams.a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= q4.p(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.u;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int p2 = q4.p(this);
        if (p2 == 0) {
            int childCount = getChildCount();
            p2 = childCount >= 1 ? q4.p(getChildAt(childCount - 1)) : 0;
            if (p2 == 0) {
                return getHeight() / 3;
            }
        }
        return (p2 * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.o;
    }

    public Drawable getStatusBarForeground() {
        return this.y;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        b5 b5Var = this.p;
        if (b5Var != null) {
            return b5Var.j();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.a;
            if ((i4 & 1) == 0) {
                break;
            }
            int i5 = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i3;
            if (i2 == 0 && q4.m(childAt)) {
                i5 -= getTopInset();
            }
            i3 = i5;
            if ((i4 & 2) != 0) {
                i3 -= q4.p(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.b = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.o = 0;
    }

    public void i(boolean z, boolean z2) {
        j(z, z2, true);
    }

    /* access modifiers changed from: package-private */
    public boolean k(boolean z) {
        if (this.s == z) {
            return false;
        }
        this.s = z;
        refreshDrawableState();
        if (this.t && (getBackground() instanceof yx)) {
            yx yxVar = (yx) getBackground();
            float dimension = getResources().getDimension(C0707R.dimen.design_appbar_elevation);
            float f2 = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, dimension);
            this.w = ofFloat;
            ofFloat.setDuration((long) getResources().getInteger(C0707R.integer.app_bar_elevation_anim_duration));
            this.w.setInterpolator(qw.a);
            this.w.addUpdateListener(new a(this, yxVar));
            this.w.start();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean l(View view) {
        int i;
        View view2 = null;
        if (this.v == null && (i = this.u) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.u);
            }
            if (findViewById != null) {
                this.v = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.v;
        if (weakReference != null) {
            view2 = weakReference.get();
        }
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof yx) {
            zx.b(this, (yx) background);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public int[] onCreateDrawableState(int i) {
        if (this.x == null) {
            this.x = new int[4];
        }
        int[] iArr = this.x;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.r;
        iArr[0] = z ? C0707R.attr.state_liftable : -2130969983;
        iArr[1] = (!z || !this.s) ? -2130969984 : C0707R.attr.state_lifted;
        iArr[2] = z ? C0707R.attr.state_collapsible : -2130969981;
        iArr[3] = (!z || !this.s) ? -2130969980 : C0707R.attr.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.v;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.v = null;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        boolean z3 = true;
        if (q4.m(this) && m()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                q4.A(getChildAt(childCount), topInset);
            }
        }
        this.b = -1;
        this.c = -1;
        this.f = -1;
        this.n = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((LayoutParams) getChildAt(i5).getLayoutParams()).b != null) {
                this.n = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.t) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((LayoutParams) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i6++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.r != z3) {
            this.r = z3;
            refreshDrawableState();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && q4.m(this) && m()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = e2.f(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        this.b = -1;
        this.c = -1;
        this.f = -1;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof yx) {
            ((yx) background).G(f2);
        }
    }

    public void setExpanded(boolean z) {
        j(z, q4.w(this), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.t = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.u = i;
        WeakReference<View> weakReference = this.v;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.v = null;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.y;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.y = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.y.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.g(this.y, q4.o(this));
                this.y.setVisible(getVisibility() == 0, false);
                this.y.setCallback(this);
            }
            n();
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(i0.b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            g.a(this, f2);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.y;
    }

    protected static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        private int j;
        private int k;
        private ValueAnimator l;
        private int m = -1;
        private boolean n;
        private float o;
        private WeakReference<View> p;
        private a q;

        public static abstract class a<T extends AppBarLayout> {
            public abstract boolean a(T t);
        }

        public BaseBehavior() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void A(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = 0
            L_0x000a:
                if (r3 >= r1) goto L_0x0020
                android.view.View r4 = r8.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L_0x001d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L_0x001d
                goto L_0x0021
            L_0x001d:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0020:
                r4 = 0
            L_0x0021:
                if (r4 == 0) goto L_0x00a3
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r0
                int r0 = r0.a
                r1 = r0 & 1
                r3 = 1
                if (r1 == 0) goto L_0x005b
                int r1 = defpackage.q4.p(r4)
                if (r10 <= 0) goto L_0x0048
                r10 = r0 & 12
                if (r10 == 0) goto L_0x0048
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L_0x005b
                goto L_0x0059
            L_0x0048:
                r10 = r0 & 2
                if (r10 == 0) goto L_0x005b
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L_0x005b
            L_0x0059:
                r9 = 1
                goto L_0x005c
            L_0x005b:
                r9 = 0
            L_0x005c:
                boolean r10 = r8.d()
                if (r10 == 0) goto L_0x006a
                android.view.View r9 = r6.o(r7)
                boolean r9 = r8.l(r9)
            L_0x006a:
                boolean r9 = r8.k(r9)
                if (r11 != 0) goto L_0x00a0
                if (r9 == 0) goto L_0x00a3
                java.util.List r7 = r7.k(r8)
                int r9 = r7.size()
                r10 = 0
            L_0x007b:
                if (r10 >= r9) goto L_0x009e
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$e r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r11 = r11.c()
                boolean r0 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r0 == 0) goto L_0x009b
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.g()
                if (r7 == 0) goto L_0x009e
                r2 = 1
                goto L_0x009e
            L_0x009b:
                int r10 = r10 + 1
                goto L_0x007b
            L_0x009e:
                if (r2 == 0) goto L_0x00a3
            L_0x00a0:
                r8.jumpDrawablesToCurrentState()
            L_0x00a3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.A(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        private void m(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int i2;
            int abs = Math.abs(g() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            int g = g();
            if (g == i) {
                ValueAnimator valueAnimator = this.l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.l = valueAnimator3;
                valueAnimator3.setInterpolator(qw.e);
                this.l.addUpdateListener(new b(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.l.setDuration((long) Math.min(i2, 600));
            this.l.setIntValues(g, i);
            this.l.start();
        }

        private static boolean n(int i, int i2) {
            return (i & i2) == i2;
        }

        private View o(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof g4) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private void y(CoordinatorLayout coordinatorLayout, T t) {
            int g = g();
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (n(layoutParams.a, 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i2 = -g;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int i3 = layoutParams2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == t.getChildCount() - 1) {
                        i5 += t.getTopInset();
                    }
                    if (n(i3, 2)) {
                        i5 += q4.p(childAt2);
                    } else if (n(i3, 5)) {
                        int p2 = q4.p(childAt2) + i5;
                        if (g < p2) {
                            i4 = p2;
                        } else {
                            i5 = p2;
                        }
                    }
                    if (n(i3, 32)) {
                        i4 += ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                        i5 -= ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    }
                    if (g < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    m(coordinatorLayout, t, e2.f(i4, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void z(CoordinatorLayout coordinatorLayout, T t) {
            d5.a aVar = d5.a.h;
            q4.C(coordinatorLayout, aVar.b());
            d5.a aVar2 = d5.a.i;
            q4.C(coordinatorLayout, aVar2.b());
            View o2 = o(coordinatorLayout);
            if (o2 != null && t.getTotalScrollRange() != 0 && (((CoordinatorLayout.e) o2.getLayoutParams()).c() instanceof ScrollingViewBehavior)) {
                if (g() != (-t.getTotalScrollRange()) && o2.canScrollVertically(1)) {
                    q4.E(coordinatorLayout, aVar, null, new d(this, t, false));
                }
                if (g() == 0) {
                    return;
                }
                if (o2.canScrollVertically(-1)) {
                    int i = -t.getDownNestedPreScrollRange();
                    if (i != 0) {
                        q4.E(coordinatorLayout, aVar2, null, new c(this, coordinatorLayout, t, o2, i));
                        return;
                    }
                    return;
                }
                q4.E(coordinatorLayout, aVar2, null, new d(this, t, true));
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public boolean d(View view) {
            View view2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            a aVar = this.q;
            if (aVar != 0) {
                return aVar.a(appBarLayout);
            }
            WeakReference<View> weakReference = this.p;
            return weakReference == null || ((view2 = weakReference.get()) != null && view2.isShown() && !view2.canScrollVertically(-1));
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int e(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int f(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int g() {
            return a() + this.j;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.material.appbar.AppBarLayout$BaseBehavior<T extends com.google.android.material.appbar.AppBarLayout> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public void h(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            y(coordinatorLayout, appBarLayout);
            if (appBarLayout.d()) {
                appBarLayout.k(appBarLayout.l(o(coordinatorLayout)));
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.material.appbar.AppBarLayout$BaseBehavior<T extends com.google.android.material.appbar.AppBarLayout> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int k(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                com.google.android.material.appbar.AppBarLayout r9 = (com.google.android.material.appbar.AppBarLayout) r9
                int r0 = r7.g()
                r1 = 0
                if (r11 == 0) goto L_0x00b3
                if (r0 < r11) goto L_0x00b3
                if (r0 > r12) goto L_0x00b3
                int r3 = defpackage.e2.f(r10, r11, r12)
                if (r0 == r3) goto L_0x00b5
                boolean r10 = r9.c()
                if (r10 == 0) goto L_0x0086
                int r10 = java.lang.Math.abs(r3)
                int r11 = r9.getChildCount()
                r12 = 0
            L_0x0022:
                if (r12 >= r11) goto L_0x0086
                android.view.View r2 = r9.getChildAt(r12)
                android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r4 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r4
                android.view.animation.Interpolator r5 = r4.b
                int r6 = r2.getTop()
                if (r10 < r6) goto L_0x0083
                int r6 = r2.getBottom()
                if (r10 > r6) goto L_0x0083
                if (r5 == 0) goto L_0x0086
                int r11 = r4.a
                r12 = r11 & 1
                if (r12 == 0) goto L_0x0058
                int r12 = r2.getHeight()
                int r6 = r4.topMargin
                int r12 = r12 + r6
                int r4 = r4.bottomMargin
                int r12 = r12 + r4
                int r1 = r1 + r12
                r11 = r11 & 2
                if (r11 == 0) goto L_0x0058
                int r11 = defpackage.q4.p(r2)
                int r1 = r1 - r11
            L_0x0058:
                boolean r11 = defpackage.q4.m(r2)
                if (r11 == 0) goto L_0x0063
                int r11 = r9.getTopInset()
                int r1 = r1 - r11
            L_0x0063:
                if (r1 <= 0) goto L_0x0086
                int r11 = r2.getTop()
                int r10 = r10 - r11
                float r11 = (float) r1
                float r10 = (float) r10
                float r10 = r10 / r11
                float r10 = r5.getInterpolation(r10)
                float r10 = r10 * r11
                int r10 = java.lang.Math.round(r10)
                int r11 = java.lang.Integer.signum(r3)
                int r12 = r2.getTop()
                int r12 = r12 + r10
                int r12 = r12 * r11
                goto L_0x0087
            L_0x0083:
                int r12 = r12 + 1
                goto L_0x0022
            L_0x0086:
                r12 = r3
            L_0x0087:
                boolean r10 = r7.c(r12)
                int r11 = r0 - r3
                int r12 = r3 - r12
                r7.j = r12
                if (r10 != 0) goto L_0x009c
                boolean r10 = r9.c()
                if (r10 == 0) goto L_0x009c
                r8.f(r9)
            L_0x009c:
                int r10 = r7.a()
                r9.e(r10)
                if (r3 >= r0) goto L_0x00a8
                r10 = -1
                r4 = -1
                goto L_0x00aa
            L_0x00a8:
                r10 = 1
                r4 = 1
            L_0x00aa:
                r5 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                r0.A(r1, r2, r3, r4, r5)
                r1 = r11
                goto L_0x00b5
            L_0x00b3:
                r7.j = r1
            L_0x00b5:
                r7.z(r8, r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        /* renamed from: p */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            super.onLayoutChild(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i3 = this.m;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.n) {
                    i2 = q4.p(childAt) + t.getTopInset();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.o);
                }
                j(coordinatorLayout, t, i2 + i4);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m(coordinatorLayout, t, i5, 0.0f);
                    } else {
                        j(coordinatorLayout, t, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        j(coordinatorLayout, t, 0);
                    }
                }
            }
            t.h();
            this.m = -1;
            c(e2.f(a(), -t.getTotalScrollRange(), 0));
            A(coordinatorLayout, t, a(), 0, true);
            t.e(a());
            z(coordinatorLayout, t);
            return true;
        }

        /* renamed from: q */
        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) t.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.r(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: r */
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = i(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.d()) {
                t.k(t.l(view));
            }
        }

        /* renamed from: s */
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = i(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                z(coordinatorLayout, t);
            }
        }

        /* renamed from: t */
        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof b) {
                b bVar = (b) parcelable;
                super.onRestoreInstanceState(coordinatorLayout, t, bVar.a());
                this.m = bVar.c;
                this.o = bVar.f;
                this.n = bVar.n;
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, t, parcelable);
            this.m = -1;
        }

        /* renamed from: u */
        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, t);
            int a2 = a();
            int childCount = t.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + a2;
                if (childAt.getTop() + a2 <= 0 && bottom >= 0) {
                    b bVar = new b(onSaveInstanceState);
                    bVar.c = i;
                    if (bottom == q4.p(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    bVar.n = z;
                    bVar.f = ((float) bottom) / ((float) childAt.getHeight());
                    return bVar;
                }
            }
            return onSaveInstanceState;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
            if (((r3.getTotalScrollRange() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L_0x002d;
         */
        /* renamed from: v */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r2, T r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L_0x002c
                boolean r5 = r3.d()
                if (r5 != 0) goto L_0x002d
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L_0x0014
                r5 = 1
                goto L_0x0015
            L_0x0014:
                r5 = 0
            L_0x0015:
                if (r5 == 0) goto L_0x0028
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0028
                r2 = 1
                goto L_0x0029
            L_0x0028:
                r2 = 0
            L_0x0029:
                if (r2 == 0) goto L_0x002c
                goto L_0x002d
            L_0x002c:
                r6 = 0
            L_0x002d:
                if (r6 == 0) goto L_0x0036
                android.animation.ValueAnimator r2 = r1.l
                if (r2 == 0) goto L_0x0036
                r2.cancel()
            L_0x0036:
                r2 = 0
                r1.p = r2
                r1.k = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, android.view.View, int, int):boolean");
        }

        /* renamed from: w */
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.k == 0 || i == 1) {
                y(coordinatorLayout, t);
                if (t.d()) {
                    t.k(t.l(view));
                }
            }
            this.p = new WeakReference<>(view);
        }

        public void x(a aVar) {
            this.q = aVar;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public static class b extends l5 {
            public static final Parcelable.Creator<b> CREATOR = new a();
            int c;
            float f;
            boolean n;

            static class a implements Parcelable.ClassLoaderCreator<b> {
                a() {
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // android.os.Parcelable.ClassLoaderCreator
                public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public Object[] newArray(int i) {
                    return new b[i];
                }

                @Override // android.os.Parcelable.Creator
                public Object createFromParcel(Parcel parcel) {
                    return new b(parcel, null);
                }
            }

            public b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.c = parcel.readInt();
                this.f = parcel.readFloat();
                this.n = parcel.readByte() != 0;
            }

            @Override // defpackage.l5, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.c);
                parcel.writeFloat(this.f);
                parcel.writeByte(this.n ? (byte) 1 : 0);
            }

            public b(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(iy.a(context, attributeSet, i, C0707R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.b = -1;
        this.c = -1;
        this.f = -1;
        this.o = 0;
        Context context2 = getContext();
        setOrientation(1);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
            g.b(this, attributeSet, i, C0707R.style.Widget_Design_AppBarLayout);
        }
        TypedArray f2 = j.f(context2, attributeSet, pw.a, i, C0707R.style.Widget_Design_AppBarLayout, new int[0]);
        Drawable drawable = f2.getDrawable(0);
        int i3 = q4.g;
        setBackground(drawable);
        if (getBackground() instanceof ColorDrawable) {
            yx yxVar = new yx();
            yxVar.H(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            yxVar.C(context2);
            setBackground(yxVar);
        }
        if (f2.hasValue(4)) {
            j(f2.getBoolean(4, false), false, false);
        }
        if (i2 >= 21 && f2.hasValue(3)) {
            g.a(this, (float) f2.getDimensionPixelSize(3, 0));
        }
        if (i2 >= 26) {
            if (f2.hasValue(2)) {
                setKeyboardNavigationCluster(f2.getBoolean(2, false));
            }
            if (f2.hasValue(1)) {
                setTouchscreenBlocksFocus(f2.getBoolean(1, false));
            }
        }
        this.t = f2.getBoolean(5, false);
        this.u = f2.getResourceId(6, -1);
        setStatusBarForeground(f2.getDrawable(7));
        f2.recycle();
        q4.P(this, new a());
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams mo22generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams mo23generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        int a = 1;
        Interpolator b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pw.b);
            this.a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public void a(int i) {
            this.a = i;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
