package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.g;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.f;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.internal.j;
import com.google.android.material.internal.o;
import com.spotify.music.C0707R;
import java.util.List;

public class FloatingActionButton extends VisibilityAwareImageButton implements p4, h, fx, gy, CoordinatorLayout.b {
    private ColorStateList b;
    private PorterDuff.Mode c;
    private ColorStateList f;
    private PorterDuff.Mode n;
    private ColorStateList o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    boolean u;
    final Rect v;
    private final Rect w;
    private final androidx.appcompat.widget.h x;
    private final gx y;
    private f z;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    /* access modifiers changed from: private */
    public class b implements qx {
        b() {
        }
    }

    class c<T extends FloatingActionButton> implements f.g {
        private final ax<T> a;

        c(ax<T> axVar) {
            this.a = axVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: ax<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.f.g
        public void a() {
            this.a.b(FloatingActionButton.this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: ax<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.f.g
        public void b() {
            this.a.a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && ((c) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.floatingActionButtonStyle);
    }

    private f getImpl() {
        f fVar;
        if (this.z == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                fVar = new i(this, new b());
            } else {
                fVar = new f(this, new b());
            }
            this.z = fVar;
        }
        return this.z;
    }

    private int m(int i) {
        int i2 = this.r;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(C0707R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(C0707R.dimen.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return m(1);
        } else {
            return m(0);
        }
    }

    private void r(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.v;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void s() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f;
            if (colorStateList == null) {
                androidx.core.graphics.drawable.a.a(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.n;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(g.e(colorForState, mode));
        }
    }

    private static int t(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.fx
    public boolean d() {
        return this.y.b();
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().w(getDrawableState());
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().k();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().e;
    }

    public int getCustomSize() {
        return this.r;
    }

    public int getExpandedComponentIdHint() {
        return this.y.a();
    }

    public xw getHideMotionSpec() {
        return getImpl().l();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.o;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.o;
    }

    public dy getShapeAppearanceModel() {
        dy dyVar = getImpl().a;
        dyVar.getClass();
        return dyVar;
    }

    public xw getShowMotionSpec() {
        return getImpl().n();
    }

    public int getSize() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m(this.q);
    }

    @Override // defpackage.p4
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // defpackage.p4
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.h
    public ColorStateList getSupportImageTintList() {
        return this.f;
    }

    @Override // androidx.core.widget.h
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.n;
    }

    public boolean getUseCompatPadding() {
        return this.u;
    }

    public void h(Animator.AnimatorListener animatorListener) {
        getImpl().d(animatorListener);
    }

    public void i(Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void j(ax<? extends FloatingActionButton> axVar) {
        getImpl().f(new c(axVar));
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().s();
    }

    @Deprecated
    public boolean k(Rect rect) {
        if (!q4.w(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        r(rect);
        return true;
    }

    public void l(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        r(rect);
    }

    public void n(a aVar) {
        o(aVar, true);
    }

    /* access modifiers changed from: package-private */
    public void o(a aVar, boolean z2) {
        e eVar;
        f impl = getImpl();
        if (aVar == null) {
            eVar = null;
        } else {
            eVar = new e(this, aVar);
        }
        impl.o(eVar, z2);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().t();
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().v();
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.s = (sizeDimension - this.t) / 2;
        getImpl().O();
        int min = Math.min(t(sizeDimension, i), t(sizeDimension, i2));
        Rect rect = this.v;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof hy)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        hy hyVar = (hy) parcelable;
        super.onRestoreInstanceState(hyVar.a());
        gx gxVar = this.y;
        Bundle orDefault = hyVar.c.getOrDefault("expandableWidgetHelper", null);
        orDefault.getClass();
        gxVar.c(orDefault);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        hy hyVar = new hy(onSaveInstanceState);
        hyVar.c.put("expandableWidgetHelper", this.y.d());
        return hyVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !k(this.w) || this.w.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean p() {
        return getImpl().q();
    }

    public boolean q() {
        return getImpl().r();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.b != colorStateList) {
            this.b = colorStateList;
            f impl = getImpl();
            yx yxVar = impl.b;
            if (yxVar != null) {
                yxVar.setTintList(colorStateList);
            }
            c cVar = impl.d;
            if (cVar != null) {
                cVar.b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.c != mode) {
            this.c = mode;
            yx yxVar = getImpl().b;
            if (yxVar != null) {
                yxVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f2) {
        f impl = getImpl();
        if (impl.h != f2) {
            impl.h = f2;
            impl.x(f2, impl.i, impl.j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        f impl = getImpl();
        if (impl.i != f2) {
            impl.i = f2;
            impl.x(impl.h, f2, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f2) {
        f impl = getImpl();
        if (impl.j != f2) {
            impl.j = f2;
            impl.x(impl.h, impl.i, f2);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.r) {
            this.r = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        yx yxVar = getImpl().b;
        if (yxVar != null) {
            yxVar.G(f2);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        if (z2 != getImpl().f) {
            getImpl().f = z2;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.y.e(i);
    }

    public void setHideMotionSpec(xw xwVar) {
        getImpl().C(xwVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(xw.b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().N();
            if (this.f != null) {
                s();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.x.f(i);
        s();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().z();
    }

    @Override // android.view.View
    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().z();
    }

    public void setShadowPaddingEnabled(boolean z2) {
        f impl = getImpl();
        impl.g = z2;
        impl.O();
    }

    @Override // defpackage.gy
    public void setShapeAppearanceModel(dy dyVar) {
        getImpl().G(dyVar);
    }

    public void setShowMotionSpec(xw xwVar) {
        getImpl().H(xwVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(xw.b(getContext(), i));
    }

    public void setSize(int i) {
        this.r = 0;
        if (i != this.q) {
            this.q = i;
            requestLayout();
        }
    }

    @Override // defpackage.p4
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // defpackage.p4
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.h
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            s();
        }
    }

    @Override // androidx.core.widget.h
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.n != mode) {
            this.n = mode;
            s();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().A();
    }

    @Override // android.view.View
    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().A();
    }

    @Override // android.view.View
    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().A();
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.u != z2) {
            this.u = z2;
            getImpl().u();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public void u(a aVar) {
        v(aVar, true);
    }

    /* access modifiers changed from: package-private */
    public void v(a aVar, boolean z2) {
        e eVar;
        f impl = getImpl();
        if (aVar == null) {
            eVar = null;
        } else {
            eVar = new e(this, aVar);
        }
        impl.L(eVar, z2);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        private Rect a;
        private boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        private static boolean b(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                return ((CoordinatorLayout.e) layoutParams).c() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean e(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) floatingActionButton.getLayoutParams();
            if (this.b && eVar.b() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        private boolean f(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!e(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.o(null, false);
                return true;
            }
            floatingActionButton.v(null, false);
            return true;
        }

        private boolean g(View view, FloatingActionButton floatingActionButton) {
            if (!e(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.o(null, false);
                return true;
            }
            floatingActionButton.v(null, false);
            return true;
        }

        /* renamed from: a */
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.v;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: c */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                f(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!b(view)) {
                return false;
            } else {
                g(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: d */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            int i2;
            List<View> j = coordinatorLayout.j(floatingActionButton);
            int size = j.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view = j.get(i4);
                if (!(view instanceof AppBarLayout)) {
                    if (b(view) && g(view, floatingActionButton)) {
                        break;
                    }
                } else if (f(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.q(floatingActionButton, i);
            Rect rect = floatingActionButton.v;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) eVar).rightMargin) {
                i2 = rect.right;
            } else {
                i2 = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) eVar).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) {
                i3 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) eVar).topMargin) {
                i3 = -rect.top;
            }
            if (i3 != 0) {
                q4.A(floatingActionButton, i3);
            }
            if (i2 == 0) {
                return true;
            }
            q4.z(floatingActionButton, i2);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(CoordinatorLayout.e eVar) {
            if (eVar.h == 0) {
                eVar.h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pw.o);
            this.b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(iy.a(context, attributeSet, i, C0707R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        this.v = new Rect();
        this.w = new Rect();
        Context context2 = getContext();
        TypedArray f2 = j.f(context2, attributeSet, pw.n, i, C0707R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.b = jx.a(context2, f2, 1);
        this.c = o.h(f2.getInt(2, -1), null);
        this.o = jx.a(context2, f2, 12);
        this.q = f2.getInt(7, -1);
        this.r = f2.getDimensionPixelSize(6, 0);
        this.p = f2.getDimensionPixelSize(3, 0);
        float dimension = f2.getDimension(4, 0.0f);
        float dimension2 = f2.getDimension(9, 0.0f);
        float dimension3 = f2.getDimension(11, 0.0f);
        this.u = f2.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0707R.dimen.mtrl_fab_min_touch_target);
        this.t = f2.getDimensionPixelSize(10, 0);
        xw a2 = xw.a(context2, f2, 15);
        xw a3 = xw.a(context2, f2, 8);
        dy m = dy.c(context2, attributeSet, i, C0707R.style.Widget_Design_FloatingActionButton, dy.m).m();
        boolean z2 = f2.getBoolean(5, false);
        setEnabled(f2.getBoolean(0, true));
        f2.recycle();
        androidx.appcompat.widget.h hVar = new androidx.appcompat.widget.h(this);
        this.x = hVar;
        hVar.e(attributeSet, i);
        this.y = new gx(this);
        getImpl().G(m);
        getImpl().p(this.b, this.c, this.o, this.p);
        getImpl().k = dimensionPixelSize;
        f impl = getImpl();
        if (impl.h != dimension) {
            impl.h = dimension;
            impl.x(dimension, impl.i, impl.j);
        }
        f impl2 = getImpl();
        if (impl2.i != dimension2) {
            impl2.i = dimension2;
            impl2.x(impl2.h, dimension2, impl2.j);
        }
        f impl3 = getImpl();
        if (impl3.j != dimension3) {
            impl3.j = dimension3;
            impl3.x(impl3.h, impl3.i, dimension3);
        }
        getImpl().E(this.t);
        getImpl().H(a2);
        getImpl().C(a3);
        getImpl().f = z2;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.o != colorStateList) {
            this.o = colorStateList;
            getImpl().F(this.o);
        }
    }
}
