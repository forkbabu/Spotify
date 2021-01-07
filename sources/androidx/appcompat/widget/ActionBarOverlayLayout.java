package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.app.t;
import androidx.appcompat.view.menu.m;
import com.spotify.music.C0707R;
import defpackage.b5;

public class ActionBarOverlayLayout extends ViewGroup implements o, k4, i4, j4 {
    static final int[] O = {C0707R.attr.actionBarSize, 16842841};
    private final Rect A = new Rect();
    private final Rect B = new Rect();
    private final Rect C = new Rect();
    private b5 D;
    private b5 E;
    private b5 F;
    private b5 G;
    private d H;
    private OverScroller I;
    ViewPropertyAnimator J;
    final AnimatorListenerAdapter K;
    private final Runnable L;
    private final Runnable M;
    private final l4 N;
    private int a;
    private int b = 0;
    private ContentFrameLayout c;
    ActionBarContainer f;
    private p n;
    private Drawable o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    boolean t;
    private int u;
    private int v;
    private final Rect w = new Rect();
    private final Rect x = new Rect();
    private final Rect y = new Rect();
    private final Rect z = new Rect();

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.J = null;
            actionBarOverlayLayout.t = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.J = null;
            actionBarOverlayLayout.t = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.k();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.J = actionBarOverlayLayout.f.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.K);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.k();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.J = actionBarOverlayLayout.f.animate().translationY((float) (-ActionBarOverlayLayout.this.f.getHeight())).setListener(ActionBarOverlayLayout.this.K);
        }
    }

    public interface d {
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b5 b5Var = b5.b;
        this.D = b5Var;
        this.E = b5Var;
        this.F = b5Var;
        this.G = b5Var;
        this.K = new a();
        this.L = new b();
        this.M = new c();
        l(context);
        this.N = new l4();
    }

    private boolean j(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        int i;
        int i2;
        int i3;
        int i4;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!z2 || ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin == (i4 = rect.left)) {
            z6 = false;
        } else {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i4;
            z6 = true;
        }
        if (z3 && ((ViewGroup.MarginLayoutParams) layoutParams).topMargin != (i3 = rect.top)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i3;
            z6 = true;
        }
        if (z5 && ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin != (i2 = rect.right)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i2;
            z6 = true;
        }
        if (!z4 || ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin == (i = rect.bottom)) {
            return z6;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i;
        return true;
    }

    private void l(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(O);
        boolean z2 = false;
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.o = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.p = z2;
        this.I = new OverScroller(context);
    }

    @Override // androidx.appcompat.widget.o
    public boolean a() {
        n();
        return this.n.a();
    }

    @Override // androidx.appcompat.widget.o
    public boolean b() {
        n();
        return this.n.b();
    }

    @Override // androidx.appcompat.widget.o
    public boolean c() {
        n();
        return this.n.c();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.appcompat.widget.o
    public void d(Menu menu, m.a aVar) {
        n();
        this.n.d(menu, aVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.o != null && !this.p) {
            if (this.f.getVisibility() == 0) {
                i = (int) (this.f.getTranslationY() + ((float) this.f.getBottom()) + 0.5f);
            } else {
                i = 0;
            }
            this.o.setBounds(0, i, getWidth(), this.o.getIntrinsicHeight() + i);
            this.o.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.o
    public boolean e() {
        n();
        return this.n.e();
    }

    @Override // androidx.appcompat.widget.o
    public void f() {
        n();
        this.n.f();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        n();
        boolean j = j(this.f, rect, true, true, false, true);
        this.z.set(rect);
        o0.a(this, this.z, this.w);
        if (!this.A.equals(this.z)) {
            this.A.set(this.z);
            j = true;
        }
        if (!this.x.equals(this.w)) {
            this.x.set(this.w);
            j = true;
        }
        if (j) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.o
    public boolean g() {
        n();
        return this.n.g();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.N.a();
    }

    public CharSequence getTitle() {
        n();
        return this.n.getTitle();
    }

    @Override // androidx.appcompat.widget.o
    public void h(int i) {
        n();
        if (i == 2) {
            this.n.n();
        } else if (i == 5) {
            this.n.t();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.o
    public void i() {
        n();
        this.n.p();
    }

    /* access modifiers changed from: package-private */
    public void k() {
        removeCallbacks(this.L);
        removeCallbacks(this.M);
        ViewPropertyAnimator viewPropertyAnimator = this.J;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean m() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public void n() {
        p pVar;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(C0707R.id.action_bar_activity_content);
            this.f = (ActionBarContainer) findViewById(C0707R.id.action_bar_container);
            View findViewById = findViewById(C0707R.id.action_bar);
            if (findViewById instanceof p) {
                pVar = (p) findViewById;
            } else if (findViewById instanceof Toolbar) {
                pVar = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder V0 = je.V0("Can't make a decor toolbar out of ");
                V0.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(V0.toString());
            }
            this.n = pVar;
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        n();
        b5 p2 = b5.p(windowInsets);
        boolean j = j(this.f, new Rect(p2.h(), p2.j(), p2.i(), p2.g()), true, true, false, true);
        Rect rect = this.w;
        int i = q4.g;
        if (Build.VERSION.SDK_INT >= 21) {
            WindowInsets o2 = p2.o();
            if (o2 != null) {
                b5.p(computeSystemWindowInsets(o2, rect));
            } else {
                rect.setEmpty();
            }
        }
        Rect rect2 = this.w;
        b5 l = p2.l(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.D = l;
        boolean z2 = true;
        if (!this.E.equals(l)) {
            this.E = this.D;
            j = true;
        }
        if (!this.x.equals(this.w)) {
            this.x.set(this.w);
        } else {
            z2 = j;
        }
        if (z2) {
            requestLayout();
        }
        return p2.a().c().b().o();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l(getContext());
        q4.F(this);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        n();
        measureChildWithMargins(this.f, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f.getLayoutParams();
        int max = Math.max(0, this.f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int max2 = Math.max(0, this.f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f.getMeasuredState());
        boolean z2 = (q4.t(this) & 256) != 0;
        if (z2) {
            i3 = this.a;
            if (this.r && this.f.getTabContainer() != null) {
                i3 += this.a;
            }
        } else {
            i3 = this.f.getVisibility() != 8 ? this.f.getMeasuredHeight() : 0;
        }
        this.y.set(this.w);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            this.F = this.D;
        } else {
            this.B.set(this.z);
        }
        if (!this.q && !z2) {
            Rect rect = this.y;
            rect.top += i3;
            rect.bottom += 0;
            if (i4 >= 21) {
                this.F = this.F.l(0, i3, 0, 0);
            }
        } else if (i4 >= 21) {
            t2 a2 = t2.a(this.F.h(), this.F.j() + i3, this.F.i(), this.F.g() + 0);
            b5.a aVar = new b5.a(this.F);
            aVar.c(a2);
            this.F = aVar.a();
        } else {
            Rect rect2 = this.B;
            rect2.top += i3;
            rect2.bottom += 0;
        }
        j(this.c, this.y, true, true, true, true);
        if (i4 >= 21 && !this.G.equals(this.F)) {
            b5 b5Var = this.F;
            this.G = b5Var;
            q4.d(this.c, b5Var);
        } else if (i4 < 21 && !this.C.equals(this.B)) {
            this.C.set(this.B);
            this.c.a(this.B);
        }
        measureChildWithMargins(this.c, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.c.getLayoutParams();
        int max3 = Math.max(max, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int max4 = Math.max(max2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        boolean z3 = false;
        if (!this.s || !z2) {
            return false;
        }
        this.I.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.I.getFinalY() > this.f.getHeight()) {
            z3 = true;
        }
        if (z3) {
            k();
            this.M.run();
        } else {
            k();
            this.L.run();
        }
        this.t = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.i4
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // defpackage.i4
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.i4
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.i4
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.i4
    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        int i2 = Build.VERSION.SDK_INT;
        super.onWindowSystemUiVisibilityChanged(i);
        n();
        int i3 = this.v ^ i;
        this.v = i;
        boolean z2 = false;
        boolean z3 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z2 = true;
        }
        d dVar = this.H;
        if (dVar != null) {
            ((t) dVar).r(!z2);
            if (z3 || !z2) {
                ((t) this.H).y();
            } else {
                ((t) this.H).s();
            }
        }
        if ((i3 & 256) != 0 && this.H != null) {
            q4.F(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        d dVar = this.H;
        if (dVar != null) {
            ((t) dVar).v(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        k();
        this.f.setTranslationY((float) (-Math.max(0, Math.min(i, this.f.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.H = dVar;
        if (getWindowToken() != null) {
            ((t) this.H).v(this.b);
            int i = this.v;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                q4.F(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.r = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.s) {
            this.s = z2;
            if (!z2) {
                k();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        n();
        this.n.setIcon(i);
    }

    public void setLogo(int i) {
        n();
        this.n.r(i);
    }

    public void setOverlayMode(boolean z2) {
        this.q = z2;
        this.p = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.o
    public void setWindowCallback(Window.Callback callback) {
        n();
        this.n.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.o
    public void setWindowTitle(CharSequence charSequence) {
        n();
        this.n.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // defpackage.j4
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.N.c(view, view2, i);
        this.u = getActionBarHideOffset();
        k();
        d dVar = this.H;
        if (dVar != null) {
            ((t) dVar).u();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f.getVisibility() != 0) {
            return false;
        }
        return this.s;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public void onStopNestedScroll(View view) {
        if (this.s && !this.t) {
            if (this.u <= this.f.getHeight()) {
                k();
                postDelayed(this.L, 600);
            } else {
                k();
                postDelayed(this.M, 600);
            }
        }
        d dVar = this.H;
        if (dVar != null) {
            ((t) dVar).getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.u + i2;
        this.u = i5;
        setActionBarHideOffset(i5);
    }

    public void setIcon(Drawable drawable) {
        n();
        this.n.setIcon(drawable);
    }
}
