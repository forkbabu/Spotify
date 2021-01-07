package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.j;
import com.google.android.material.internal.o;
import com.spotify.music.C0707R;
import defpackage.dy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final /* synthetic */ int r0 = 0;
    private final int W;
    private final yx a0;
    private Animator b0;
    private Animator c0;
    private int d0;
    private int e0;
    private boolean f0;
    private final boolean g0;
    private final boolean h0;
    private final boolean i0;
    private int j0;
    private boolean k0;
    private Behavior l0;
    private int m0;
    private int n0;
    private int o0;
    AnimatorListenerAdapter p0;
    ax<FloatingActionButton> q0;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.o0(bottomAppBar.d0, BottomAppBar.this.k0);
        }
    }

    class b implements ax<FloatingActionButton> {
        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
        @Override // defpackage.ax
        public void a(FloatingActionButton floatingActionButton) {
            FloatingActionButton floatingActionButton2 = floatingActionButton;
            BottomAppBar.this.a0.I(floatingActionButton2.getVisibility() == 0 ? floatingActionButton2.getScaleY() : 0.0f);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View] */
        @Override // defpackage.ax
        public void b(FloatingActionButton floatingActionButton) {
            FloatingActionButton floatingActionButton2 = floatingActionButton;
            float translationX = floatingActionButton2.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().j() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().p(translationX);
                BottomAppBar.this.a0.invalidateSelf();
            }
            float f = 0.0f;
            float max = Math.max(0.0f, -floatingActionButton2.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().d() != max) {
                BottomAppBar.this.getTopEdgeTreatment().k(max);
                BottomAppBar.this.a0.invalidateSelf();
            }
            yx yxVar = BottomAppBar.this.a0;
            if (floatingActionButton2.getVisibility() == 0) {
                f = floatingActionButton2.getScaleY();
            }
            yxVar.I(f);
        }
    }

    class c implements o.c {
        c() {
        }

        @Override // com.google.android.material.internal.o.c
        public b5 a(View view, b5 b5Var, o.d dVar) {
            boolean z;
            if (BottomAppBar.this.g0) {
                BottomAppBar.this.m0 = b5Var.g();
            }
            boolean z2 = true;
            boolean z3 = false;
            if (BottomAppBar.this.h0) {
                z = BottomAppBar.this.o0 != b5Var.h();
                BottomAppBar.this.o0 = b5Var.h();
            } else {
                z = false;
            }
            if (BottomAppBar.this.i0) {
                if (BottomAppBar.this.n0 == b5Var.i()) {
                    z2 = false;
                }
                BottomAppBar.this.n0 = b5Var.i();
                z3 = z2;
            }
            if (z || z3) {
                BottomAppBar.L(BottomAppBar.this);
                BottomAppBar.this.q0();
                BottomAppBar.this.p0();
            }
            return b5Var;
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.P(BottomAppBar.this);
            BottomAppBar.this.c0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.O(BottomAppBar.this);
        }
    }

    static class e extends l5 {
        public static final Parcelable.Creator<e> CREATOR = new a();
        int c;
        boolean f;

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
                return new e(parcel, null);
            }
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // defpackage.l5, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.f ? 1 : 0);
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.f = parcel.readInt() != 0;
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.bottomAppBarStyle);
    }

    static void L(BottomAppBar bottomAppBar) {
        Animator animator = bottomAppBar.c0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = bottomAppBar.b0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    static void O(BottomAppBar bottomAppBar) {
        bottomAppBar.j0++;
    }

    static void P(BottomAppBar bottomAppBar) {
        bottomAppBar.j0--;
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getBottomInset() {
        return this.m0;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return m0(this.d0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().d();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getLeftInset() {
        return this.o0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getRightInset() {
        return this.n0;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private e getTopEdgeTreatment() {
        return (e) this.a0.w().i();
    }

    /* access modifiers changed from: private */
    public FloatingActionButton j0() {
        View k02 = k0();
        if (k02 instanceof FloatingActionButton) {
            return (FloatingActionButton) k02;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View k0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.k(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.k0():android.view.View");
    }

    /* access modifiers changed from: private */
    public float m0(int i) {
        boolean g = o.g(this);
        int i2 = 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.W + (g ? this.o0 : this.n0));
        if (g) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    private boolean n0() {
        FloatingActionButton j02 = j0();
        return j02 != null && j02.q();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void o0(int i, boolean z) {
        if (q4.w(this)) {
            Animator animator = this.c0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!n0()) {
                i = 0;
                z = false;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if (Math.abs(actionMenuView.getTranslationX() - ((float) l0(actionMenuView, i, z))) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat2.addListener(new c(this, actionMenuView, i, z));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150L);
                    animatorSet.playSequentially(ofFloat2, ofFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.c0 = animatorSet2;
            animatorSet2.addListener(new d());
            this.c0.start();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void p0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!n0()) {
                actionMenuView.setTranslationX((float) l0(actionMenuView, 0, false));
            } else {
                actionMenuView.setTranslationX((float) l0(actionMenuView, this.d0, this.k0));
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void q0() {
        getTopEdgeTreatment().p(getFabTranslationX());
        View k02 = k0();
        this.a0.I((!this.k0 || !n0()) ? 0.0f : 1.0f);
        if (k02 != null) {
            k02.setTranslationY(getFabTranslationY());
            k02.setTranslationX(getFabTranslationX());
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.a0.y();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().d();
    }

    public int getFabAlignmentMode() {
        return this.d0;
    }

    public int getFabAnimationMode() {
        return this.e0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().e();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f();
    }

    public boolean getHideOnScroll() {
        return this.f0;
    }

    /* JADX WARN: Incorrect args count in method signature: (ILjava/util/List<Landroid/animation/Animator;>;)V */
    /* access modifiers changed from: protected */
    public void i0(int i) {
        FloatingActionButton j02 = j0();
        if (j02 != null && !j02.p()) {
            this.j0++;
            j02.n(new b(this, i));
        }
    }

    /* access modifiers changed from: protected */
    public int l0(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean g = o.g(this);
        int measuredWidth = g ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                if (g) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        return measuredWidth - ((g ? actionMenuView.getRight() : actionMenuView.getLeft()) + (g ? this.n0 : -this.o0));
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        zx.b(this, this.a0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Animator animator = this.c0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.b0;
            if (animator2 != null) {
                animator2.cancel();
            }
            q0();
        }
        p0();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.a());
        this.d0 = eVar.c;
        this.k0 = eVar.f;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.c = this.d0;
        eVar.f = this.k0;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public boolean r0(int i) {
        float f = (float) i;
        if (f == getTopEdgeTreatment().g()) {
            return false;
        }
        getTopEdgeTreatment().o(f);
        this.a0.invalidateSelf();
        return true;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.i(this.a0, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().k(f);
            this.a0.invalidateSelf();
            q0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        this.a0.G(f);
        getBehavior().c(this, this.a0.v() - this.a0.u());
    }

    public void setFabAlignmentMode(int i) {
        if (this.d0 != i && q4.w(this)) {
            Animator animator = this.b0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.e0 == 1) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(j0(), "translationX", m0(i));
                ofFloat.setDuration(300L);
                arrayList.add(ofFloat);
            } else {
                i0(i);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.b0 = animatorSet;
            animatorSet.addListener(new a(this));
            this.b0.start();
        }
        o0(i, this.k0);
        this.d0 = i;
    }

    public void setFabAnimationMode(int i) {
        this.e0 = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().m(f);
            this.a0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().n(f);
            this.a0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i) {
        super(iy.a(context, attributeSet, i, C0707R.style.Widget_MaterialComponents_BottomAppBar), attributeSet, i);
        yx yxVar = new yx();
        this.a0 = yxVar;
        this.j0 = 0;
        this.k0 = true;
        this.p0 = new a();
        this.q0 = new b();
        Context context2 = getContext();
        TypedArray f = j.f(context2, attributeSet, pw.d, i, C0707R.style.Widget_MaterialComponents_BottomAppBar, new int[0]);
        ColorStateList a2 = jx.a(context2, f, 0);
        int dimensionPixelSize = f.getDimensionPixelSize(1, 0);
        this.d0 = f.getInt(2, 0);
        this.e0 = f.getInt(3, 0);
        this.f0 = f.getBoolean(7, false);
        this.g0 = f.getBoolean(8, false);
        this.h0 = f.getBoolean(9, false);
        this.i0 = f.getBoolean(10, false);
        f.recycle();
        this.W = getResources().getDimensionPixelOffset(C0707R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        e eVar = new e((float) f.getDimensionPixelOffset(4, 0), (float) f.getDimensionPixelOffset(5, 0), (float) f.getDimensionPixelOffset(6, 0));
        dy.b bVar = new dy.b();
        bVar.x(eVar);
        yxVar.setShapeAppearanceModel(bVar.m());
        yxVar.P(2);
        yxVar.K(Paint.Style.FILL);
        yxVar.C(context2);
        setElevation((float) dimensionPixelSize);
        androidx.core.graphics.drawable.a.i(yxVar, a2);
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        setBackground(yxVar);
        o.a(this, attributeSet, i, C0707R.style.Widget_MaterialComponents_BottomAppBar, new c());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.l0 == null) {
            this.l0 = new Behavior();
        }
        return this.l0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        private final Rect e = new Rect();
        private WeakReference<BottomAppBar> f;
        private int g;
        private final View.OnLayoutChangeListener h = new a();

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.l(Behavior.this.e);
                int height = Behavior.this.e.height();
                bottomAppBar.r0(height);
                CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
                if (Behavior.this.g == 0) {
                    ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C0707R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    ((ViewGroup.MarginLayoutParams) eVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) eVar).rightMargin = bottomAppBar.getRightInset();
                    if (o.g(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin += bottomAppBar.W;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin += bottomAppBar.W;
                    }
                }
            }
        }

        public Behavior() {
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f = new WeakReference<>(bottomAppBar);
            View k0 = bottomAppBar.k0();
            if (k0 != null && !q4.w(k0)) {
                CoordinatorLayout.e eVar = (CoordinatorLayout.e) k0.getLayoutParams();
                eVar.d = 49;
                this.g = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                if (k0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) k0;
                    floatingActionButton.addOnLayoutChangeListener(this.h);
                    floatingActionButton.h(bottomAppBar.p0);
                    floatingActionButton.i(new d(bottomAppBar));
                    floatingActionButton.j(bottomAppBar.q0);
                }
                bottomAppBar.q0();
            }
            coordinatorLayout.q(bottomAppBar, i);
            return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (((BottomAppBar) view).getHideOnScroll()) {
                if (i == 2) {
                    return true;
                }
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
