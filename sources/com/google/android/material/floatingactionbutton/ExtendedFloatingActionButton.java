package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.j;
import com.spotify.music.C0707R;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    static final Property<View, Float> F = new c(Float.class, "width");
    static final Property<View, Float> G = new d(Float.class, "height");
    private final j A;
    private final j B;
    private final j C;
    private final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> D;
    private boolean E;
    private int x;
    private final a y;
    private final j z;

    class a implements i {
        a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
        public ViewGroup.LayoutParams a() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getMeasuredWidth();
        }
    }

    class b implements i {
        b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
        public ViewGroup.LayoutParams a() {
            return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.this.getCollapsedSize(), ExtendedFloatingActionButton.this.getCollapsedSize());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    static class c extends Property<View, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().width = f.intValue();
            view2.requestLayout();
        }
    }

    static class d extends Property<View, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().height = f.intValue();
            view2.requestLayout();
        }
    }

    class e extends b {
        private final i g;
        private final boolean h;

        e(a aVar, i iVar, boolean z) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.g = iVar;
            this.h = z;
        }

        @Override // com.google.android.material.floatingactionbutton.j
        public void a() {
            ExtendedFloatingActionButton.this.E = this.h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.g.a().width;
                layoutParams.height = this.g.a().height;
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        @Override // com.google.android.material.floatingactionbutton.j
        public boolean b() {
            return this.h == ExtendedFloatingActionButton.this.E || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.j
        public int d() {
            return C0707R.animator.mtrl_extended_fab_change_size_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.j
        public AnimatorSet e() {
            xw h2 = h();
            if (h2.h("width")) {
                PropertyValuesHolder[] e = h2.e("width");
                e[0].setFloatValues((float) ExtendedFloatingActionButton.this.getWidth(), (float) this.g.getWidth());
                h2.i("width", e);
            }
            if (h2.h("height")) {
                PropertyValuesHolder[] e2 = h2.e("height");
                e2[0].setFloatValues((float) ExtendedFloatingActionButton.this.getHeight(), (float) this.g.getHeight());
                h2.i("height", e2);
            }
            return g(h2);
        }

        @Override // com.google.android.material.floatingactionbutton.j
        public void f(g gVar) {
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.j
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.g.a().width;
                layoutParams.height = this.g.a().height;
            }
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.j
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.E = this.h;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    class f extends b {
        private boolean g;

        public f(a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.j
        public void a() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.j
        public boolean b() {
            return ExtendedFloatingActionButton.q(ExtendedFloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.j
        public void c() {
            super.c();
            this.g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.j
        public int d() {
            return C0707R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.j
        public void f(g gVar) {
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.j
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.x = 0;
            if (!this.g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.j
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.x = 1;
        }
    }

    public static abstract class g {
    }

    class h extends b {
        public h(a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.j
        public void a() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.j
        public boolean b() {
            return ExtendedFloatingActionButton.p(ExtendedFloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.j
        public int d() {
            return C0707R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.j
        public void f(g gVar) {
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.j
        public void onAnimationEnd() {
            super.onAnimationEnd();
            ExtendedFloatingActionButton.this.x = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.j
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.x = 2;
        }
    }

    interface i {
        ViewGroup.LayoutParams a();

        int getHeight();

        int getWidth();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.extendedFloatingActionButtonStyle);
    }

    static void j(ExtendedFloatingActionButton extendedFloatingActionButton, j jVar) {
        extendedFloatingActionButton.getClass();
        if (!jVar.b()) {
            if (!(q4.w(extendedFloatingActionButton) && !extendedFloatingActionButton.isInEditMode())) {
                jVar.a();
                jVar.f(null);
                return;
            }
            extendedFloatingActionButton.measure(0, 0);
            AnimatorSet e2 = jVar.e();
            e2.addListener(new d(extendedFloatingActionButton, jVar));
            for (Animator.AnimatorListener animatorListener : ((b) jVar).i()) {
                e2.addListener(animatorListener);
            }
            e2.start();
        }
    }

    static boolean p(ExtendedFloatingActionButton extendedFloatingActionButton) {
        if (extendedFloatingActionButton.getVisibility() != 0) {
            if (extendedFloatingActionButton.x != 2) {
                return false;
            }
        } else if (extendedFloatingActionButton.x == 1) {
            return false;
        }
        return true;
    }

    static boolean q(ExtendedFloatingActionButton extendedFloatingActionButton) {
        if (extendedFloatingActionButton.getVisibility() == 0) {
            if (extendedFloatingActionButton.x != 1) {
                return false;
            }
        } else if (extendedFloatingActionButton.x == 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.D;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedSize() {
        return getIconSize() + (Math.min(q4.r(this), q4.q(this)) * 2);
    }

    public xw getExtendMotionSpec() {
        return ((b) this.A).j();
    }

    public xw getHideMotionSpec() {
        return ((b) this.C).j();
    }

    public xw getShowMotionSpec() {
        return ((b) this.B).j();
    }

    public xw getShrinkMotionSpec() {
        return ((b) this.z).j();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.E && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.E = false;
            this.z.a();
        }
    }

    public void setExtendMotionSpec(xw xwVar) {
        ((b) this.A).k(xwVar);
    }

    public void setExtendMotionSpecResource(int i2) {
        setExtendMotionSpec(xw.b(getContext(), i2));
    }

    public void setExtended(boolean z2) {
        if (this.E != z2) {
            j jVar = z2 ? this.A : this.z;
            if (!jVar.b()) {
                jVar.a();
            }
        }
    }

    public void setHideMotionSpec(xw xwVar) {
        ((b) this.C).k(xwVar);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(xw.b(getContext(), i2));
    }

    public void setShowMotionSpec(xw xwVar) {
        ((b) this.B).k(xwVar);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(xw.b(getContext(), i2));
    }

    public void setShrinkMotionSpec(xw xwVar) {
        ((b) this.z).k(xwVar);
    }

    public void setShrinkMotionSpecResource(int i2) {
        setShrinkMotionSpec(xw.b(getContext(), i2));
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i2) {
        super(iy.a(context, attributeSet, i2, C0707R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon), attributeSet, i2);
        this.x = 0;
        a aVar = new a();
        this.y = aVar;
        h hVar = new h(aVar);
        this.B = hVar;
        f fVar = new f(aVar);
        this.C = fVar;
        this.E = true;
        Context context2 = getContext();
        this.D = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray f2 = j.f(context2, attributeSet, pw.l, i2, C0707R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, new int[0]);
        xw a2 = xw.a(context2, f2, 3);
        xw a3 = xw.a(context2, f2, 2);
        xw a4 = xw.a(context2, f2, 1);
        xw a5 = xw.a(context2, f2, 4);
        a aVar2 = new a();
        e eVar = new e(aVar2, new a(), true);
        this.A = eVar;
        e eVar2 = new e(aVar2, new b(), false);
        this.z = eVar2;
        hVar.k(a2);
        fVar.k(a3);
        eVar.k(a4);
        eVar2.k(a5);
        f2.recycle();
        setShapeAppearanceModel(dy.c(context2, attributeSet, i2, C0707R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, dy.m).m());
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        private Rect a;
        private boolean b;
        private boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }

        private static boolean a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                return ((CoordinatorLayout.e) layoutParams).c() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean b(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams();
            if ((this.b || this.c) && eVar.b() == view.getId()) {
                return true;
            }
            return false;
        }

        private boolean c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            j jVar;
            j jVar2;
            if (!b(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (this.c) {
                    jVar2 = extendedFloatingActionButton.z;
                } else {
                    jVar2 = extendedFloatingActionButton.C;
                }
                ExtendedFloatingActionButton.j(extendedFloatingActionButton, jVar2);
                return true;
            }
            if (this.c) {
                jVar = extendedFloatingActionButton.A;
            } else {
                jVar = extendedFloatingActionButton.B;
            }
            ExtendedFloatingActionButton.j(extendedFloatingActionButton, jVar);
            return true;
        }

        private boolean d(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            j jVar;
            j jVar2;
            if (!b(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                if (this.c) {
                    jVar2 = extendedFloatingActionButton.z;
                } else {
                    jVar2 = extendedFloatingActionButton.C;
                }
                ExtendedFloatingActionButton.j(extendedFloatingActionButton, jVar2);
                return true;
            }
            if (this.c) {
                jVar = extendedFloatingActionButton.A;
            } else {
                jVar = extendedFloatingActionButton.B;
            }
            ExtendedFloatingActionButton.j(extendedFloatingActionButton, jVar);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, (ExtendedFloatingActionButton) view, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(CoordinatorLayout.e eVar) {
            if (eVar.h == 0) {
                eVar.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                c(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                return false;
            } else if (!a(view2)) {
                return false;
            } else {
                d(view2, extendedFloatingActionButton);
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> j = coordinatorLayout.j(extendedFloatingActionButton);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = j.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    if (a(view2) && d(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (c(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.q(extendedFloatingActionButton, i);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pw.m);
            this.b = obtainStyledAttributes.getBoolean(0, false);
            this.c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }
    }
}
