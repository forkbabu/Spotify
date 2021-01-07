package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.o;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.m;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    static final Handler o = new Handler(Looper.getMainLooper(), new a());
    private static final boolean p = (Build.VERSION.SDK_INT <= 19);
    private static final int[] q = {C0707R.attr.snackbarStyle};
    private static final String r = BaseTransientBottomBar.class.getSimpleName();
    private final ViewGroup a;
    private final Context b;
    protected final l c;
    private final l d;
    private int e;
    private final Runnable f = new b();
    private Rect g;
    private int h;
    private int i;
    private int j;
    private int k;
    private List<h<B>> l;
    private final AccessibilityManager m;
    m.b n = new e();

    public static class Behavior extends SwipeDismissBehavior<View> {
        private final i i = new i(this);

        static void g(Behavior behavior, BaseTransientBottomBar baseTransientBottomBar) {
            behavior.i.b(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean a(View view) {
            this.i.getClass();
            return view instanceof l;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.i.a(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    static class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).A();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).u(message.arg1);
                return true;
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.c != null && baseTransientBottomBar.b != null) {
                int b = BaseTransientBottomBar.b(BaseTransientBottomBar.this);
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                int[] iArr = new int[2];
                baseTransientBottomBar2.c.getLocationOnScreen(iArr);
                int height = (b - (baseTransientBottomBar2.c.getHeight() + iArr[1])) + ((int) BaseTransientBottomBar.this.c.getTranslationY());
                if (height < BaseTransientBottomBar.this.k) {
                    ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.c.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        String unused = BaseTransientBottomBar.r;
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = (BaseTransientBottomBar.this.k - height) + marginLayoutParams.bottomMargin;
                    BaseTransientBottomBar.this.c.requestLayout();
                }
            }
        }
    }

    class c implements m4 {
        c() {
        }

        @Override // defpackage.m4
        public b5 onApplyWindowInsets(View view, b5 b5Var) {
            BaseTransientBottomBar.this.h = b5Var.g();
            BaseTransientBottomBar.this.i = b5Var.h();
            BaseTransientBottomBar.this.j = b5Var.i();
            BaseTransientBottomBar.this.C();
            return b5Var;
        }
    }

    class d extends z3 {
        d() {
        }

        @Override // defpackage.z3
        public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
            super.onInitializeAccessibilityNodeInfo(view, d5Var);
            d5Var.a(1048576);
            d5Var.W(true);
        }

        @Override // defpackage.z3
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            BaseTransientBottomBar.this.o();
            return true;
        }
    }

    class e implements m.b {
        e() {
        }

        @Override // com.google.android.material.snackbar.m.b
        public void a() {
            Handler handler = BaseTransientBottomBar.o;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.m.b
        public void b(int i) {
            Handler handler = BaseTransientBottomBar.o;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    /* access modifiers changed from: package-private */
    public class f implements j {
        f() {
        }
    }

    /* access modifiers changed from: package-private */
    public class g implements k {
        g() {
        }
    }

    public static abstract class h<B> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        public void onDismissed(B b, int i) {
        }

        public void onShown(B b) {
        }
    }

    public static class i {
        private m.b a;

        public i(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.e(0.1f);
            swipeDismissBehavior.c(0.6f);
            swipeDismissBehavior.f(0);
        }

        public void a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    m.c().l(this.a);
                }
            } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                m.c().k(this.a);
            }
        }

        public void b(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.a = baseTransientBottomBar.n;
        }
    }

    /* access modifiers changed from: protected */
    public interface j {
    }

    /* access modifiers changed from: protected */
    public interface k {
    }

    /* access modifiers changed from: protected */
    public static class l extends FrameLayout {
        private static final View.OnTouchListener q = new a();
        private k a;
        private j b;
        private int c;
        private final float f;
        private final float n;
        private ColorStateList o;
        private PorterDuff.Mode p;

        static class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected l(Context context, AttributeSet attributeSet) {
            super(iy.a(context, attributeSet, 0, 0), attributeSet);
            Drawable drawable;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, pw.J);
            if (obtainStyledAttributes.hasValue(6)) {
                q4.N(this, (float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.c = obtainStyledAttributes.getInt(2, 0);
            this.f = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(jx.a(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(o.h(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.n = obtainStyledAttributes.getFloat(1, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(q);
            setFocusable(true);
            if (getBackground() == null) {
                float dimension = getResources().getDimension(C0707R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(rw.o(rw.m(this, C0707R.attr.colorSurface), rw.m(this, C0707R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
                if (this.o != null) {
                    drawable = androidx.core.graphics.drawable.a.l(gradientDrawable);
                    androidx.core.graphics.drawable.a.i(drawable, this.o);
                } else {
                    drawable = androidx.core.graphics.drawable.a.l(gradientDrawable);
                }
                int i = q4.g;
                int i2 = Build.VERSION.SDK_INT;
                setBackground(drawable);
            }
        }

        /* access modifiers changed from: package-private */
        public float getActionTextColorAlpha() {
            return this.n;
        }

        /* access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.c;
        }

        /* access modifiers changed from: package-private */
        public float getBackgroundOverlayColorAlpha() {
            return this.f;
        }

        /* access modifiers changed from: protected */
        @Override // android.view.View, android.view.ViewGroup
        public void onAttachedToWindow() {
            WindowInsets rootWindowInsets;
            super.onAttachedToWindow();
            j jVar = this.b;
            if (jVar != null) {
                f fVar = (f) jVar;
                fVar.getClass();
                if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = BaseTransientBottomBar.this.c.getRootWindowInsets()) != null) {
                    BaseTransientBottomBar.this.k = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                    BaseTransientBottomBar.this.C();
                }
            }
            q4.F(this);
        }

        /* access modifiers changed from: protected */
        @Override // android.view.View, android.view.ViewGroup
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            j jVar = this.b;
            if (jVar != null) {
                f fVar = (f) jVar;
                BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                baseTransientBottomBar.getClass();
                if (m.c().f(baseTransientBottomBar.n)) {
                    BaseTransientBottomBar.o.post(new i(fVar));
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            k kVar = this.a;
            if (kVar != null) {
                g gVar = (g) kVar;
                BaseTransientBottomBar.this.c.setOnLayoutChangeListener(null);
                BaseTransientBottomBar.this.B();
            }
        }

        /* access modifiers changed from: package-private */
        public void setAnimationMode(int i) {
            this.c = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.o == null)) {
                drawable = androidx.core.graphics.drawable.a.l(drawable.mutate());
                androidx.core.graphics.drawable.a.i(drawable, this.o);
                androidx.core.graphics.drawable.a.j(drawable, this.p);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.o = colorStateList;
            if (getBackground() != null) {
                Drawable l = androidx.core.graphics.drawable.a.l(getBackground().mutate());
                androidx.core.graphics.drawable.a.i(l, colorStateList);
                androidx.core.graphics.drawable.a.j(l, this.p);
                if (l != getBackground()) {
                    super.setBackgroundDrawable(l);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.p = mode;
            if (getBackground() != null) {
                Drawable l = androidx.core.graphics.drawable.a.l(getBackground().mutate());
                androidx.core.graphics.drawable.a.j(l, mode);
                if (l != getBackground()) {
                    super.setBackgroundDrawable(l);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(j jVar) {
            this.b = jVar;
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : q);
            super.setOnClickListener(onClickListener);
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(k kVar) {
            this.a = kVar;
        }
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, l lVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (lVar != null) {
            this.a = viewGroup;
            this.d = lVar;
            Context context = viewGroup.getContext();
            this.b = context;
            com.google.android.material.internal.j.a(context);
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(q);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            l lVar2 = (l) from.inflate(resourceId != -1 ? C0707R.layout.mtrl_layout_snackbar : C0707R.layout.design_layout_snackbar, viewGroup, false);
            this.c = lVar2;
            if (view instanceof SnackbarContentLayout) {
                ((SnackbarContentLayout) view).c(lVar2.getActionTextColorAlpha());
            }
            lVar2.addView(view);
            ViewGroup.LayoutParams layoutParams = lVar2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.g = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            q4.K(lVar2, 1);
            q4.O(lVar2, 1);
            lVar2.setFitsSystemWindows(true);
            q4.P(lVar2, new c());
            q4.I(lVar2, new d());
            this.m = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void B() {
        if (z()) {
            this.c.post(new k(this));
            return;
        }
        this.c.setVisibility(0);
        w();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void C() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (rect = this.g) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = rect.bottom + this.h;
            marginLayoutParams.leftMargin = rect.left + this.i;
            marginLayoutParams.rightMargin = rect.right + this.j;
            this.c.requestLayout();
            if (Build.VERSION.SDK_INT >= 29) {
                boolean z = false;
                if (this.k > 0) {
                    ViewGroup.LayoutParams layoutParams2 = this.c.getLayoutParams();
                    if ((layoutParams2 instanceof CoordinatorLayout.e) && (((CoordinatorLayout.e) layoutParams2).c() instanceof SwipeDismissBehavior)) {
                        z = true;
                    }
                }
                if (z) {
                    this.c.removeCallbacks(this.f);
                    this.c.post(this.f);
                }
            }
        }
    }

    static int b(BaseTransientBottomBar baseTransientBottomBar) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) baseTransientBottomBar.b.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    static void c(BaseTransientBottomBar baseTransientBottomBar) {
        int s = baseTransientBottomBar.s();
        if (p) {
            q4.A(baseTransientBottomBar.c, s);
        } else {
            baseTransientBottomBar.c.setTranslationY((float) s);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(s, 0);
        valueAnimator.setInterpolator(qw.b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new e(baseTransientBottomBar));
        valueAnimator.addUpdateListener(new f(baseTransientBottomBar, s));
        valueAnimator.start();
    }

    private int s() {
        int height = this.c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: package-private */
    public final void A() {
        this.c.setOnAttachStateChangeListener(new f());
        if (this.c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                CoordinatorLayout.e eVar = (CoordinatorLayout.e) layoutParams;
                Behavior behavior = new Behavior();
                Behavior.g(behavior, this);
                behavior.d(new j(this));
                eVar.j(behavior);
                eVar.g = 80;
            }
            C();
            this.c.setVisibility(4);
            this.a.addView(this.c);
        }
        if (q4.w(this.c)) {
            B();
        } else {
            this.c.setOnLayoutChangeListener(new g());
        }
    }

    public B n(h<B> hVar) {
        if (this.l == null) {
            this.l = new ArrayList();
        }
        this.l.add(hVar);
        return this;
    }

    public void o() {
        p(3);
    }

    /* access modifiers changed from: protected */
    public void p(int i2) {
        m.c().b(this.n, i2);
    }

    public Context q() {
        return this.b;
    }

    public int r() {
        return this.e;
    }

    public View t() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final void u(int i2) {
        if (!z() || this.c.getVisibility() != 0) {
            v(i2);
        } else if (this.c.getAnimationMode() == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setInterpolator(qw.a);
            ofFloat.addUpdateListener(new c(this));
            ofFloat.setDuration(75L);
            ofFloat.addListener(new b(this, i2));
            ofFloat.start();
        } else {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(0, s());
            valueAnimator.setInterpolator(qw.b);
            valueAnimator.setDuration(250L);
            valueAnimator.addListener(new g(this, i2));
            valueAnimator.addUpdateListener(new h(this));
            valueAnimator.start();
        }
    }

    /* access modifiers changed from: package-private */
    public void v(int i2) {
        m.c().i(this.n);
        List<h<B>> list = this.l;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.l.get(size).onDismissed(this, i2);
            }
        }
        ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.c);
        }
    }

    /* access modifiers changed from: package-private */
    public void w() {
        m.c().j(this.n);
        List<h<B>> list = this.l;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.l.get(size).onShown(this);
            }
        }
    }

    public B x(h<B> hVar) {
        List<h<B>> list = this.l;
        if (list == null) {
            return this;
        }
        list.remove(hVar);
        return this;
    }

    public B y(int i2) {
        this.e = i2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean z() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.m.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }
}
