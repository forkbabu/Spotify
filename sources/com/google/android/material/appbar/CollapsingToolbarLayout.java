package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.j;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.music.C0707R;

public class CollapsingToolbarLayout extends FrameLayout {
    private ValueAnimator A;
    private long B;
    private int C;
    private AppBarLayout.c D;
    int E;
    b5 F;
    private boolean a;
    private int b;
    private Toolbar c;
    private View f;
    private View n;
    private int o;
    private int p;
    private int q;
    private int r;
    private final Rect s;
    final com.google.android.material.internal.a t;
    private boolean u;
    private boolean v;
    private Drawable w;
    Drawable x;
    private int y;
    private boolean z;

    class a implements m4 {
        a() {
        }

        @Override // defpackage.m4
        public b5 onApplyWindowInsets(View view, b5 b5Var) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.getClass();
            b5 b5Var2 = q4.m(collapsingToolbarLayout) ? b5Var : null;
            if (!e2.g(collapsingToolbarLayout.F, b5Var2)) {
                collapsingToolbarLayout.F = b5Var2;
                collapsingToolbarLayout.requestLayout();
            }
            return b5Var.c();
        }
    }

    private class b implements AppBarLayout.c {
        b() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.E = i;
            b5 b5Var = collapsingToolbarLayout.F;
            int j = b5Var != null ? b5Var.j() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                f d = CollapsingToolbarLayout.d(childAt);
                int i3 = layoutParams.a;
                if (i3 == 1) {
                    d.e(e2.f(-i, 0, CollapsingToolbarLayout.this.c(childAt)));
                } else if (i3 == 2) {
                    d.e(Math.round(((float) (-i)) * layoutParams.b));
                }
            }
            CollapsingToolbarLayout.this.f();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.x != null && j > 0) {
                int i4 = q4.g;
                int i5 = Build.VERSION.SDK_INT;
                collapsingToolbarLayout2.postInvalidateOnAnimation();
            }
            CollapsingToolbarLayout.this.t.L(((float) Math.abs(i)) / ((float) ((CollapsingToolbarLayout.this.getHeight() - q4.p(CollapsingToolbarLayout.this)) - j)));
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0028 */
    private void a() {
        if (this.a) {
            Toolbar toolbar = null;
            this.c = null;
            this.f = null;
            int i = this.b;
            if (i != -1) {
                Toolbar toolbar2 = (Toolbar) findViewById(i);
                this.c = toolbar2;
                if (toolbar2 != null) {
                    ViewParent parent = toolbar2.getParent();
                    View view = toolbar2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.f = view;
                }
            }
            if (this.c == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    i2++;
                }
                this.c = toolbar;
            }
            e();
            this.a = false;
        }
    }

    private static int b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    static f d(View view) {
        f fVar = (f) view.getTag(C0707R.id.view_offset_helper);
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(view);
        view.setTag(C0707R.id.view_offset_helper, fVar2);
        return fVar2;
    }

    private void e() {
        View view;
        if (!this.u && (view = this.n) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.n);
            }
        }
        if (this.u && this.c != null) {
            if (this.n == null) {
                this.n = new View(getContext());
            }
            if (this.n.getParent() == null) {
                this.c.addView(this.n, -1, -1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int c(View view) {
        return ((getHeight() - d(view).b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.c == null && (drawable = this.w) != null && this.y > 0) {
            drawable.mutate().setAlpha(this.y);
            this.w.draw(canvas);
        }
        if (this.u && this.v) {
            this.t.g(canvas);
        }
        if (this.x != null && this.y > 0) {
            b5 b5Var = this.F;
            int j = b5Var != null ? b5Var.j() : 0;
            if (j > 0) {
                this.x.setBounds(0, -this.E, getWidth(), j - this.E);
                this.x.mutate().setAlpha(this.y);
                this.x.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r3 = true;
     */
    @Override // android.view.ViewGroup
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean drawChild(android.graphics.Canvas r5, android.view.View r6, long r7) {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.w
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002d
            int r3 = r4.y
            if (r3 <= 0) goto L_0x002d
            android.view.View r3 = r4.f
            if (r3 == 0) goto L_0x0014
            if (r3 != r4) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            if (r6 != r3) goto L_0x001a
            goto L_0x0018
        L_0x0014:
            androidx.appcompat.widget.Toolbar r3 = r4.c
            if (r6 != r3) goto L_0x001a
        L_0x0018:
            r3 = 1
            goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = r4.y
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r4.w
            r0.draw(r5)
            r0 = 1
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            boolean r5 = super.drawChild(r5, r6, r7)
            if (r5 != 0) goto L_0x0038
            if (r0 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.x;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.w;
        if (drawable2 != null && drawable2.isStateful()) {
            z2 |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.a aVar = this.t;
        if (aVar != null) {
            z2 |= aVar.P(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        if (this.w != null || this.x != null) {
            setScrimsShown(getHeight() + this.E < getScrimVisibleHeightTrigger());
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public int getCollapsedTitleGravity() {
        return this.t.j();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.t.l();
    }

    public Drawable getContentScrim() {
        return this.w;
    }

    public int getExpandedTitleGravity() {
        return this.t.o();
    }

    public int getExpandedTitleMarginBottom() {
        return this.r;
    }

    public int getExpandedTitleMarginEnd() {
        return this.q;
    }

    public int getExpandedTitleMarginStart() {
        return this.o;
    }

    public int getExpandedTitleMarginTop() {
        return this.p;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.t.q();
    }

    public int getMaxLines() {
        return this.t.s();
    }

    /* access modifiers changed from: package-private */
    public int getScrimAlpha() {
        return this.y;
    }

    public long getScrimAnimationDuration() {
        return this.B;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.C;
        if (i >= 0) {
            return i;
        }
        b5 b5Var = this.F;
        int j = b5Var != null ? b5Var.j() : 0;
        int p2 = q4.p(this);
        if (p2 > 0) {
            return Math.min((p2 * 2) + j, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.x;
    }

    public CharSequence getTitle() {
        if (this.u) {
            return this.t.t();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            setFitsSystemWindows(q4.m((View) parent));
            if (this.D == null) {
                this.D = new b();
            }
            ((AppBarLayout) parent).a(this.D);
            q4.F(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.c cVar = this.D;
        if (cVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).g(cVar);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        View view;
        super.onLayout(z2, i, i2, i3, i4);
        b5 b5Var = this.F;
        if (b5Var != null) {
            int j = b5Var.j();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!q4.m(childAt) && childAt.getTop() < j) {
                    q4.A(childAt, j);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            d(getChildAt(i6)).d();
        }
        if (this.u && (view = this.n) != null) {
            boolean z3 = true;
            boolean z4 = q4.v(view) && this.n.getVisibility() == 0;
            this.v = z4;
            if (z4) {
                if (q4.o(this) != 1) {
                    z3 = false;
                }
                View view2 = this.f;
                if (view2 == null) {
                    view2 = this.c;
                }
                int c2 = c(view2);
                com.google.android.material.internal.b.a(this, this.n, this.s);
                this.t.y(this.s.left + (z3 ? this.c.getTitleMarginEnd() : this.c.getTitleMarginStart()), this.c.getTitleMarginTop() + this.s.top + c2, this.s.right - (z3 ? this.c.getTitleMarginStart() : this.c.getTitleMarginEnd()), (this.s.bottom + c2) - this.c.getTitleMarginBottom());
                this.t.E(z3 ? this.q : this.o, this.s.top + this.p, (i3 - i) - (z3 ? this.o : this.q), (i4 - i2) - this.r);
                this.t.w();
            }
        }
        if (this.c != null) {
            if (this.u && TextUtils.isEmpty(this.t.t())) {
                setTitle(this.c.getTitle());
            }
            View view3 = this.f;
            if (view3 == null || view3 == this) {
                setMinimumHeight(b(this.c));
            } else {
                setMinimumHeight(b(view3));
            }
        }
        f();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            d(getChildAt(i7)).a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        b5 b5Var = this.F;
        int j = b5Var != null ? b5Var.j() : 0;
        if (mode == 0 && j > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + j, 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.t.C(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.t.A(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.t.D(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.w;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.w = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getWidth(), getHeight());
                this.w.setCallback(this);
                this.w.setAlpha(this.y);
            }
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(androidx.core.content.a.d(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.t.I(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.r = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.q = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.o = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.p = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.t.G(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.t.H(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.t.K(typeface);
    }

    public void setMaxLines(int i) {
        this.t.N(i);
    }

    /* access modifiers changed from: package-private */
    public void setScrimAlpha(int i) {
        Toolbar toolbar;
        if (i != this.y) {
            if (!(this.w == null || (toolbar = this.c) == null)) {
                int i2 = q4.g;
                int i3 = Build.VERSION.SDK_INT;
                toolbar.postInvalidateOnAnimation();
            }
            this.y = i;
            int i4 = q4.g;
            int i5 = Build.VERSION.SDK_INT;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.B = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.C != i) {
            this.C = i;
            f();
        }
    }

    public void setScrimsShown(boolean z2) {
        int i = 0;
        boolean z3 = q4.w(this) && !isInEditMode();
        if (this.z != z2) {
            int i2 = BitmapRenderer.ALPHA_VISIBLE;
            if (z3) {
                if (!z2) {
                    i2 = 0;
                }
                a();
                ValueAnimator valueAnimator = this.A;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.A = valueAnimator2;
                    valueAnimator2.setDuration(this.B);
                    this.A.setInterpolator(i2 > this.y ? qw.c : qw.d);
                    this.A.addUpdateListener(new e(this));
                } else if (valueAnimator.isRunning()) {
                    this.A.cancel();
                }
                this.A.setIntValues(this.y, i2);
                this.A.start();
            } else {
                if (z2) {
                    i = BitmapRenderer.ALPHA_VISIBLE;
                }
                setScrimAlpha(i);
            }
            this.z = z2;
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.x;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.x = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.x.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.g(this.x, q4.o(this));
                this.x.setVisible(getVisibility() == 0, false);
                this.x.setCallback(this);
                this.x.setAlpha(this.y);
            }
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(androidx.core.content.a.d(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.t.Q(charSequence);
        setContentDescription(getTitle());
    }

    public void setTitleEnabled(boolean z2) {
        if (z2 != this.u) {
            this.u = z2;
            setContentDescription(getTitle());
            e();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.x;
        if (!(drawable == null || drawable.isVisible() == z2)) {
            this.x.setVisible(z2, false);
        }
        Drawable drawable2 = this.w;
        if (drawable2 != null && drawable2.isVisible() != z2) {
            this.w.setVisible(z2, false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.w || drawable == this.x;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(iy.a(context, attributeSet, i, C0707R.style.Widget_Design_CollapsingToolbar), attributeSet, i);
        this.a = true;
        this.s = new Rect();
        this.C = -1;
        Context context2 = getContext();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.t = aVar;
        aVar.R(qw.e);
        TypedArray f2 = j.f(context2, attributeSet, pw.j, i, C0707R.style.Widget_Design_CollapsingToolbar, new int[0]);
        aVar.I(f2.getInt(3, 8388691));
        aVar.C(f2.getInt(0, 8388627));
        int dimensionPixelSize = f2.getDimensionPixelSize(4, 0);
        this.r = dimensionPixelSize;
        this.q = dimensionPixelSize;
        this.p = dimensionPixelSize;
        this.o = dimensionPixelSize;
        if (f2.hasValue(7)) {
            this.o = f2.getDimensionPixelSize(7, 0);
        }
        if (f2.hasValue(6)) {
            this.q = f2.getDimensionPixelSize(6, 0);
        }
        if (f2.hasValue(8)) {
            this.p = f2.getDimensionPixelSize(8, 0);
        }
        if (f2.hasValue(5)) {
            this.r = f2.getDimensionPixelSize(5, 0);
        }
        this.u = f2.getBoolean(15, true);
        setTitle(f2.getText(14));
        aVar.G(C0707R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        aVar.A(C0707R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (f2.hasValue(9)) {
            aVar.G(f2.getResourceId(9, 0));
        }
        if (f2.hasValue(1)) {
            aVar.A(f2.getResourceId(1, 0));
        }
        this.C = f2.getDimensionPixelSize(12, -1);
        if (f2.hasValue(10)) {
            aVar.N(f2.getInt(10, 1));
        }
        this.B = (long) f2.getInt(11, 600);
        setContentScrim(f2.getDrawable(2));
        setStatusBarScrim(f2.getDrawable(13));
        this.b = f2.getResourceId(16, -1);
        f2.recycle();
        setWillNotDraw(false);
        q4.P(this, new a());
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public FrameLayout.LayoutParams mo24generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.t.B(colorStateList);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {
        int a = 0;
        float b = 0.5f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pw.k);
            this.a = obtainStyledAttributes.getInt(0, 0);
            this.b = obtainStyledAttributes.getFloat(1, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
