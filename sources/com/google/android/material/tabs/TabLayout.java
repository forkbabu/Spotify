package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.k0;
import androidx.viewpager.widget.ViewPager;
import com.comscore.streaming.ContentMediaFormat;
import com.google.android.material.internal.o;
import com.spotify.music.C0707R;
import defpackage.d5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.e
public class TabLayout extends HorizontalScrollView {
    private static final w3<g> a0 = new x3(16);
    int A;
    private final int B;
    private final int C;
    private final int D;
    private int E;
    int F;
    int G;
    int H;
    int I;
    boolean J;
    boolean K;
    boolean L;
    private c M;
    private final ArrayList<c> N;
    private c O;
    private ValueAnimator P;
    ViewPager Q;
    private androidx.viewpager.widget.a R;
    private DataSetObserver S;
    private h T;
    private b U;
    private boolean V;
    private final w3<i> W;
    private final ArrayList<g> a;
    private g b;
    private final RectF c;
    final f f;
    int n;
    int o;
    int p;
    int q;
    int r;
    ColorStateList s;
    ColorStateList t;
    ColorStateList u;
    Drawable v;
    PorterDuff.Mode w;
    float x;
    float y;
    final int z;

    /* access modifiers changed from: package-private */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* access modifiers changed from: private */
    public class b implements ViewPager.h {
        private boolean a;

        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z) {
            this.a = z;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void b(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.Q == viewPager) {
                tabLayout.n(aVar2, this.a);
            }
        }
    }

    @Deprecated
    public interface c<T extends g> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    public interface d extends c<g> {
    }

    /* access modifiers changed from: private */
    public class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.k();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.k();
        }
    }

    /* access modifiers changed from: package-private */
    public class f extends LinearLayout {
        private int a;
        private final Paint b;
        private final GradientDrawable c;
        int f = -1;
        float n;
        private int o = -1;
        int p = -1;
        int q = -1;
        ValueAnimator r;
        private int s = -1;
        private int t = -1;

        /* access modifiers changed from: package-private */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            final /* synthetic */ int a;
            final /* synthetic */ int b;

            a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                f fVar = f.this;
                int i = fVar.s;
                int i2 = this.a;
                TimeInterpolator timeInterpolator = qw.a;
                int round = Math.round(((float) (i2 - i)) * animatedFraction) + i;
                int i3 = f.this.t;
                int round2 = Math.round(animatedFraction * ((float) (this.b - i3))) + i3;
                if (round != fVar.p || round2 != fVar.q) {
                    fVar.p = round;
                    fVar.q = round2;
                    int i4 = q4.g;
                    int i5 = Build.VERSION.SDK_INT;
                    fVar.postInvalidateOnAnimation();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public class b extends AnimatorListenerAdapter {
            final /* synthetic */ int a;

            b(int i) {
                this.a = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                f fVar = f.this;
                fVar.f = this.a;
                fVar.n = 0.0f;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                f.this.f = this.a;
            }
        }

        f(Context context) {
            super(context);
            setWillNotDraw(false);
            this.b = new Paint();
            this.c = new GradientDrawable();
        }

        private void d(i iVar, RectF rectF) {
            int contentWidth = iVar.getContentWidth();
            int c2 = (int) o.c(getContext(), 24);
            if (contentWidth < c2) {
                contentWidth = c2;
            }
            int right = (iVar.getRight() + iVar.getLeft()) / 2;
            int i = contentWidth / 2;
            rectF.set((float) (right - i), 0.0f, (float) (right + i), 0.0f);
        }

        private void h() {
            int i;
            View childAt = getChildAt(this.f);
            int i2 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
            } else {
                int left = childAt.getLeft();
                int right = childAt.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.K && (childAt instanceof i)) {
                    d((i) childAt, tabLayout.c);
                    left = (int) TabLayout.this.c.left;
                    right = (int) TabLayout.this.c.right;
                }
                if (this.n <= 0.0f || this.f >= getChildCount() - 1) {
                    i2 = left;
                    i = right;
                } else {
                    View childAt2 = getChildAt(this.f + 1);
                    int left2 = childAt2.getLeft();
                    int right2 = childAt2.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.K && (childAt2 instanceof i)) {
                        d((i) childAt2, tabLayout2.c);
                        left2 = (int) TabLayout.this.c.left;
                        right2 = (int) TabLayout.this.c.right;
                    }
                    float f2 = this.n;
                    float f3 = 1.0f - f2;
                    i2 = (int) ((((float) left) * f3) + (((float) left2) * f2));
                    i = (int) ((f3 * ((float) right)) + (((float) right2) * f2));
                }
            }
            if (i2 != this.p || i != this.q) {
                this.p = i2;
                this.q = i;
                int i3 = q4.g;
                int i4 = Build.VERSION.SDK_INT;
                postInvalidateOnAnimation();
            }
        }

        private void i(boolean z, int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                h();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (!tabLayout.K && (childAt instanceof i)) {
                d((i) childAt, tabLayout.c);
                left = (int) TabLayout.this.c.left;
                right = (int) TabLayout.this.c.right;
            }
            int i3 = this.p;
            int i4 = this.q;
            if (i3 != left || i4 != right) {
                if (z) {
                    this.s = i3;
                    this.t = i4;
                }
                a aVar = new a(left, right);
                if (z) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.r = valueAnimator;
                    valueAnimator.setInterpolator(qw.b);
                    valueAnimator.setDuration((long) i2);
                    valueAnimator.setFloatValues(0.0f, 1.0f);
                    valueAnimator.addUpdateListener(aVar);
                    valueAnimator.addListener(new b(i));
                    valueAnimator.start();
                    return;
                }
                this.r.removeAllUpdateListeners();
                this.r.addUpdateListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void c(int i, int i2) {
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.r.cancel();
            }
            i(true, i, i2);
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            Drawable drawable = TabLayout.this.v;
            int i = 0;
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
            int i2 = this.a;
            if (i2 >= 0) {
                intrinsicHeight = i2;
            }
            int i3 = TabLayout.this.H;
            if (i3 == 0) {
                i = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i3 == 1) {
                i = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i3 != 2) {
                if (i3 != 3) {
                    intrinsicHeight = 0;
                } else {
                    intrinsicHeight = getHeight();
                }
            }
            int i4 = this.p;
            if (i4 >= 0 && this.q > i4) {
                Drawable drawable2 = TabLayout.this.v;
                if (drawable2 == null) {
                    drawable2 = this.c;
                }
                Drawable mutate = androidx.core.graphics.drawable.a.l(drawable2).mutate();
                mutate.setBounds(this.p, i, this.q, intrinsicHeight);
                Paint paint = this.b;
                if (paint != null) {
                    if (Build.VERSION.SDK_INT == 21) {
                        mutate.setColorFilter(paint.getColor(), PorterDuff.Mode.SRC_IN);
                    } else {
                        androidx.core.graphics.drawable.a.h(mutate, paint.getColor());
                    }
                }
                mutate.draw(canvas);
            }
            super.draw(canvas);
        }

        /* access modifiers changed from: package-private */
        public void e(int i, float f2) {
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.r.cancel();
            }
            this.f = i;
            this.n = f2;
            h();
        }

        /* access modifiers changed from: package-private */
        public void f(int i) {
            if (this.b.getColor() != i) {
                this.b.setColor(i);
                int i2 = q4.g;
                int i3 = Build.VERSION.SDK_INT;
                postInvalidateOnAnimation();
            }
        }

        /* access modifiers changed from: package-private */
        public void g(int i) {
            if (this.a != i) {
                this.a = i;
                int i2 = q4.g;
                int i3 = Build.VERSION.SDK_INT;
                postInvalidateOnAnimation();
            }
        }

        /* access modifiers changed from: protected */
        @Override // android.widget.LinearLayout, android.view.View, android.view.ViewGroup
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                h();
            } else {
                i(false, this.f, -1);
            }
        }

        /* access modifiers changed from: protected */
        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.F == 1 || tabLayout.I == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) o.c(getContext(), 16)) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.F = 0;
                            tabLayout2.s(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.o != i) {
                requestLayout();
                this.o = i;
            }
        }
    }

    public static class g {
        private Drawable a;
        private CharSequence b;
        private CharSequence c;
        private int d = -1;
        private View e;
        public TabLayout f;
        public i g;

        public View c() {
            return this.e;
        }

        public Drawable d() {
            return this.a;
        }

        public int e() {
            return this.d;
        }

        public CharSequence f() {
            return this.b;
        }

        public boolean g() {
            TabLayout tabLayout = this.f;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.d;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: package-private */
        public void h() {
            this.f = null;
            this.g = null;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = -1;
            this.e = null;
        }

        public g i(CharSequence charSequence) {
            this.c = charSequence;
            n();
            return this;
        }

        public g j(int i) {
            this.e = LayoutInflater.from(this.g.getContext()).inflate(i, (ViewGroup) this.g, false);
            n();
            return this;
        }

        public g k(Drawable drawable) {
            this.a = drawable;
            TabLayout tabLayout = this.f;
            if (tabLayout.F == 1 || tabLayout.I == 2) {
                tabLayout.s(true);
            }
            n();
            if (cx.a && this.g.h() && this.g.n.isVisible()) {
                this.g.invalidate();
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        public void l(int i) {
            this.d = i;
        }

        public g m(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(charSequence)) {
                this.g.setContentDescription(charSequence);
            }
            this.b = charSequence;
            n();
            return this;
        }

        /* access modifiers changed from: package-private */
        public void n() {
            i iVar = this.g;
            if (iVar != null) {
                iVar.m();
            }
        }
    }

    public static class h implements ViewPager.i {
        private final WeakReference<TabLayout> a;
        private int b;
        private int c;

        public h(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int i) {
            this.b = this.c;
            this.c = i;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.c = 0;
            this.b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void f(int i, float f, int i2) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                int i3 = this.c;
                boolean z = false;
                boolean z2 = i3 != 2 || this.b == 1;
                if (!(i3 == 2 && this.b == 0)) {
                    z = true;
                }
                tabLayout.o(i, f, z2, z);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void g(int i) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.c;
                tabLayout.m(tabLayout.i(i), i2 == 0 || (i2 == 2 && this.b == 0));
            }
        }
    }

    public final class i extends LinearLayout {
        private g a;
        private TextView b;
        private ImageView c;
        private View f;
        private bx n;
        private View o;
        private TextView p;
        private ImageView q;
        private Drawable r;
        private int s = 2;

        public i(Context context) {
            super(context);
            n(context);
            q4.Q(this, TabLayout.this.n, TabLayout.this.o, TabLayout.this.p, TabLayout.this.q);
            setGravity(17);
            setOrientation(!TabLayout.this.J ? 1 : 0);
            setClickable(true);
            q4.R(this, o4.b(getContext(), ContentMediaFormat.FULL_CONTENT_EPISODE));
        }

        static void c(i iVar, Canvas canvas) {
            Drawable drawable = iVar.r;
            if (drawable != null) {
                drawable.setBounds(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
                iVar.r.draw(canvas);
            }
        }

        private FrameLayout g(View view) {
            if ((view == this.c || view == this.b) && cx.a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        private bx getBadge() {
            return this.n;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private int getContentWidth() {
            View[] viewArr = {this.b, this.c, this.o};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        private bx getOrCreateBadge() {
            if (this.n == null) {
                this.n = bx.b(getContext());
            }
            k();
            bx bxVar = this.n;
            if (bxVar != null) {
                return bxVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private boolean h() {
            return this.n != null;
        }

        private void i(View view) {
            if (h() && view != null) {
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                bx bxVar = this.n;
                FrameLayout g = g(view);
                cx.c(bxVar, view, g);
                if (cx.a) {
                    g.setForeground(bxVar);
                } else {
                    view.getOverlay().add(bxVar);
                }
                this.f = view;
            }
        }

        private void j() {
            if (h()) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f;
                if (view != null) {
                    cx.b(this.n, view, g(view));
                    this.f = null;
                }
            }
        }

        private void k() {
            g gVar;
            g gVar2;
            if (h()) {
                if (this.o != null) {
                    j();
                } else if (this.c != null && (gVar2 = this.a) != null && gVar2.d() != null) {
                    View view = this.f;
                    ImageView imageView = this.c;
                    if (view != imageView) {
                        j();
                        i(this.c);
                        return;
                    }
                    l(imageView);
                } else if (this.b == null || (gVar = this.a) == null) {
                    j();
                } else {
                    gVar.getClass();
                    View view2 = this.f;
                    TextView textView = this.b;
                    if (view2 != textView) {
                        j();
                        i(this.b);
                        return;
                    }
                    l(textView);
                }
            }
        }

        /* access modifiers changed from: private */
        public void l(View view) {
            if (h() && view == this.f) {
                cx.c(this.n, view, g(view));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.material.tabs.TabLayout$i, android.widget.LinearLayout, android.view.View] */
        /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.RippleDrawable] */
        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void n(android.content.Context r7) {
            /*
                r6 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.z
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r7 = defpackage.i0.b(r7, r0)
                r6.r = r7
                if (r7 == 0) goto L_0x0021
                boolean r7 = r7.isStateful()
                if (r7 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r7 = r6.r
                int[] r0 = r6.getDrawableState()
                r7.setState(r0)
                goto L_0x0021
            L_0x001f:
                r6.r = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
                r7.<init>()
                r0 = 0
                r7.setColor(r0)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.u
                if (r2 == 0) goto L_0x0074
                android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
                r2.<init>()
                r3 = 925353388(0x3727c5ac, float:1.0E-5)
                r2.setCornerRadius(r3)
                r3 = -1
                r2.setColor(r3)
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r3 = r3.u
                android.content.res.ColorStateList r3 = defpackage.ox.a(r3)
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 21
                if (r4 < r5) goto L_0x005f
                android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.L
                if (r4 == 0) goto L_0x0056
                r7 = r1
            L_0x0056:
                if (r4 == 0) goto L_0x0059
                goto L_0x005a
            L_0x0059:
                r1 = r2
            L_0x005a:
                r0.<init>(r3, r7, r1)
                r7 = r0
                goto L_0x0074
            L_0x005f:
                android.graphics.drawable.Drawable r1 = androidx.core.graphics.drawable.a.l(r2)
                androidx.core.graphics.drawable.a.i(r1, r3)
                android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
                r3 = 2
                android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
                r3[r0] = r7
                r7 = 1
                r3[r7] = r1
                r2.<init>(r3)
                r7 = r2
            L_0x0074:
                int r0 = defpackage.q4.g
                int r0 = android.os.Build.VERSION.SDK_INT
                r6.setBackground(r7)
                com.google.android.material.tabs.TabLayout r7 = com.google.android.material.tabs.TabLayout.this
                r7.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.n(android.content.Context):void");
        }

        private void p(TextView textView, ImageView imageView) {
            g gVar = this.a;
            CharSequence charSequence = null;
            Drawable mutate = (gVar == null || gVar.d() == null) ? null : androidx.core.graphics.drawable.a.l(this.a.d()).mutate();
            g gVar2 = this.a;
            CharSequence f2 = gVar2 != null ? gVar2.f() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(f2);
            if (textView != null) {
                if (z) {
                    textView.setText(f2);
                    this.a.getClass();
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int c2 = (!z || imageView.getVisibility() != 0) ? 0 : (int) o.c(getContext(), 8);
                if (TabLayout.this.J) {
                    if (c2 != e2.j(marginLayoutParams)) {
                        e2.s(marginLayoutParams, c2);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (c2 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = c2;
                    e2.s(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.a;
            CharSequence charSequence2 = gVar3 != null ? gVar3.c : null;
            if (!z) {
                charSequence = charSequence2;
            }
            k0.b(this, charSequence);
        }

        /* access modifiers changed from: protected */
        @Override // android.view.View, android.view.ViewGroup
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.r;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.r.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public g getTab() {
            return this.a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.android.material.tabs.TabLayout$i */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public final void m() {
            FrameLayout frameLayout;
            FrameLayout frameLayout2;
            g gVar = this.a;
            Drawable drawable = null;
            View c2 = gVar != null ? gVar.c() : null;
            if (c2 != null) {
                ViewParent parent = c2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(c2);
                    }
                    addView(c2);
                }
                this.o = c2;
                TextView textView = this.b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) c2.findViewById(16908308);
                this.p = textView2;
                if (textView2 != null) {
                    this.s = androidx.core.widget.c.d(textView2);
                }
                this.q = (ImageView) c2.findViewById(16908294);
            } else {
                View view = this.o;
                if (view != null) {
                    removeView(view);
                    this.o = null;
                }
                this.p = null;
                this.q = null;
            }
            boolean z = false;
            if (this.o == null) {
                if (this.c == null) {
                    if (cx.a) {
                        frameLayout2 = new FrameLayout(getContext());
                        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        addView(frameLayout2, 0);
                    } else {
                        frameLayout2 = this;
                    }
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(C0707R.layout.design_layout_tab_icon, (ViewGroup) frameLayout2, false);
                    this.c = imageView2;
                    frameLayout2.addView(imageView2, 0);
                }
                if (!(gVar == null || gVar.d() == null)) {
                    drawable = androidx.core.graphics.drawable.a.l(gVar.d()).mutate();
                }
                if (drawable != null) {
                    androidx.core.graphics.drawable.a.i(drawable, TabLayout.this.t);
                    PorterDuff.Mode mode = TabLayout.this.w;
                    if (mode != null) {
                        androidx.core.graphics.drawable.a.j(drawable, mode);
                    }
                }
                if (this.b == null) {
                    if (cx.a) {
                        frameLayout = new FrameLayout(getContext());
                        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        addView(frameLayout);
                    } else {
                        frameLayout = this;
                    }
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(C0707R.layout.design_layout_tab_text, (ViewGroup) frameLayout, false);
                    this.b = textView3;
                    frameLayout.addView(textView3);
                    this.s = androidx.core.widget.c.d(this.b);
                }
                androidx.core.widget.c.n(this.b, TabLayout.this.r);
                ColorStateList colorStateList = TabLayout.this.s;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
                p(this.b, this.c);
                k();
                ImageView imageView3 = this.c;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new a(this, imageView3));
                }
                TextView textView4 = this.b;
                if (textView4 != null) {
                    textView4.addOnLayoutChangeListener(new a(this, textView4));
                }
            } else {
                TextView textView5 = this.p;
                if (!(textView5 == null && this.q == null)) {
                    p(textView5, this.q);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.c)) {
                setContentDescription(gVar.c);
            }
            if (gVar != null && gVar.g()) {
                z = true;
            }
            setSelected(z);
        }

        /* access modifiers changed from: package-private */
        public final void o() {
            setOrientation(!TabLayout.this.J ? 1 : 0);
            TextView textView = this.p;
            if (textView == null && this.q == null) {
                p(this.b, this.c);
            } else {
                p(textView, this.q);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            bx bxVar = this.n;
            if (bxVar != null && bxVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.n.e()));
            }
            d5 v0 = d5.v0(accessibilityNodeInfo);
            v0.U(d5.c.a(0, 1, this.a.e(), 1, false, isSelected()));
            if (isSelected()) {
                v0.S(false);
                v0.J(d5.a.g);
            }
            v0.l0("Tab");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) goto L_0x0098;
         */
        @Override // android.widget.LinearLayout, android.view.View
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMeasure(int r8, int r9) {
            /*
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r8)
                int r1 = android.view.View.MeasureSpec.getMode(r8)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r2 = r2.getTabMaxWidth()
                if (r2 <= 0) goto L_0x001e
                if (r1 == 0) goto L_0x0014
                if (r0 <= r2) goto L_0x001e
            L_0x0014:
                com.google.android.material.tabs.TabLayout r8 = com.google.android.material.tabs.TabLayout.this
                int r8 = r8.A
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L_0x001e:
                super.onMeasure(r8, r9)
                android.widget.TextView r0 = r7.b
                if (r0 == 0) goto L_0x00a8
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.x
                int r1 = r7.s
                android.widget.ImageView r2 = r7.c
                r3 = 1
                if (r2 == 0) goto L_0x0038
                int r2 = r2.getVisibility()
                if (r2 != 0) goto L_0x0038
                r1 = 1
                goto L_0x0046
            L_0x0038:
                android.widget.TextView r2 = r7.b
                if (r2 == 0) goto L_0x0046
                int r2 = r2.getLineCount()
                if (r2 <= r3) goto L_0x0046
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.y
            L_0x0046:
                android.widget.TextView r2 = r7.b
                float r2 = r2.getTextSize()
                android.widget.TextView r4 = r7.b
                int r4 = r4.getLineCount()
                android.widget.TextView r5 = r7.b
                int r5 = androidx.core.widget.c.d(r5)
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 != 0) goto L_0x0060
                if (r5 < 0) goto L_0x00a8
                if (r1 == r5) goto L_0x00a8
            L_0x0060:
                com.google.android.material.tabs.TabLayout r5 = com.google.android.material.tabs.TabLayout.this
                int r5 = r5.I
                r6 = 0
                if (r5 != r3) goto L_0x0099
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 <= 0) goto L_0x0099
                if (r4 != r3) goto L_0x0099
                android.widget.TextView r2 = r7.b
                android.text.Layout r2 = r2.getLayout()
                if (r2 == 0) goto L_0x0098
                float r4 = r2.getLineWidth(r6)
                android.text.TextPaint r2 = r2.getPaint()
                float r2 = r2.getTextSize()
                float r2 = r0 / r2
                float r2 = r2 * r4
                int r4 = r7.getMeasuredWidth()
                int r5 = r7.getPaddingLeft()
                int r4 = r4 - r5
                int r5 = r7.getPaddingRight()
                int r4 = r4 - r5
                float r4 = (float) r4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L_0x0099
            L_0x0098:
                r3 = 0
            L_0x0099:
                if (r3 == 0) goto L_0x00a8
                android.widget.TextView r2 = r7.b
                r2.setTextSize(r6, r0)
                android.widget.TextView r0 = r7.b
                r0.setMaxLines(r1)
                super.onMeasure(r8, r9)
            L_0x00a8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.onMeasure(int, int):void");
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            g gVar = this.a;
            TabLayout tabLayout = gVar.f;
            if (tabLayout != null) {
                tabLayout.m(gVar, true);
                return true;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                int i = Build.VERSION.SDK_INT;
            }
            TextView textView = this.b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.o;
            if (view != null) {
                view.setSelected(z);
            }
        }

        /* access modifiers changed from: package-private */
        public void setTab(g gVar) {
            if (gVar != this.a) {
                this.a = gVar;
                m();
            }
        }
    }

    public static class j implements d {
        private final ViewPager a;

        public j(ViewPager viewPager) {
            this.a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(g gVar) {
            this.a.setCurrentItem(gVar.e());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(g gVar) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.tabStyle);
    }

    private void d(View view) {
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            g j2 = j();
            CharSequence charSequence = tabItem.a;
            if (charSequence != null) {
                j2.m(charSequence);
            }
            Drawable drawable = tabItem.b;
            if (drawable != null) {
                j2.k(drawable);
            }
            int i2 = tabItem.c;
            if (i2 != 0) {
                j2.j(i2);
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                j2.i(tabItem.getContentDescription());
            }
            c(j2, this.a.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void e(int i2) {
        boolean z2;
        if (i2 != -1) {
            if (getWindowToken() != null && q4.w(this)) {
                f fVar = this.f;
                int childCount = fVar.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        z2 = false;
                        break;
                    } else if (fVar.getChildAt(i3).getWidth() <= 0) {
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (!z2) {
                    int scrollX = getScrollX();
                    int g2 = g(i2, 0.0f);
                    if (scrollX != g2) {
                        h();
                        this.P.setIntValues(scrollX, g2);
                        this.P.start();
                    }
                    this.f.c(i2, this.G);
                    return;
                }
            }
            o(i2, 0.0f, true, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 != 2) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
            r4 = this;
            int r0 = r4.I
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L_0x000b
            if (r0 != r1) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r0 = 0
            goto L_0x0014
        L_0x000b:
            int r0 = r4.E
            int r3 = r4.n
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L_0x0014:
            com.google.android.material.tabs.TabLayout$f r3 = r4.f
            defpackage.q4.Q(r3, r0, r2, r2, r2)
            int r0 = r4.I
            r2 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r2) goto L_0x0023
            if (r0 == r1) goto L_0x0023
            goto L_0x0042
        L_0x0023:
            int r0 = r4.F
            com.google.android.material.tabs.TabLayout$f r0 = r4.f
            r0.setGravity(r2)
            goto L_0x0042
        L_0x002b:
            int r0 = r4.F
            if (r0 == 0) goto L_0x003a
            if (r0 == r2) goto L_0x0034
            if (r0 == r1) goto L_0x003a
            goto L_0x0042
        L_0x0034:
            com.google.android.material.tabs.TabLayout$f r0 = r4.f
            r0.setGravity(r2)
            goto L_0x0042
        L_0x003a:
            com.google.android.material.tabs.TabLayout$f r0 = r4.f
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r1)
        L_0x0042:
            r4.s(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.f():void");
    }

    private int g(int i2, float f2) {
        int i3 = this.I;
        int i4 = 0;
        if (i3 != 0 && i3 != 2) {
            return 0;
        }
        View childAt = this.f.getChildAt(i2);
        int i5 = i2 + 1;
        View childAt2 = i5 < this.f.getChildCount() ? this.f.getChildAt(i5) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i4 = childAt2.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i6 = (int) (((float) (width + i4)) * 0.5f * f2);
        return q4.o(this) == 0 ? left + i6 : left - i6;
    }

    private int getDefaultHeight() {
        int size = this.a.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                g gVar = this.a.get(i2);
                if (gVar != null && gVar.d() != null && !TextUtils.isEmpty(gVar.f())) {
                    z2 = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return (!z2 || this.J) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i2 = this.B;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.I;
        if (i3 == 0 || i3 == 2) {
            return this.D;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void h() {
        if (this.P == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.P = valueAnimator;
            valueAnimator.setInterpolator(qw.b);
            this.P.setDuration((long) this.G);
            this.P.addUpdateListener(new a());
        }
    }

    private void p(ViewPager viewPager, boolean z2, boolean z3) {
        ViewPager viewPager2 = this.Q;
        if (viewPager2 != null) {
            h hVar = this.T;
            if (hVar != null) {
                viewPager2.w(hVar);
            }
            b bVar = this.U;
            if (bVar != null) {
                this.Q.v(bVar);
            }
        }
        c cVar = this.O;
        if (cVar != null) {
            this.N.remove(cVar);
            this.O = null;
        }
        if (viewPager != null) {
            this.Q = viewPager;
            if (this.T == null) {
                this.T = new h(this);
            }
            this.T.b();
            viewPager.c(this.T);
            j jVar = new j(viewPager);
            this.O = jVar;
            if (!this.N.contains(jVar)) {
                this.N.add(jVar);
            }
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                n(adapter, z2);
            }
            if (this.U == null) {
                this.U = new b();
            }
            this.U.a(z2);
            viewPager.b(this.U);
            o(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.Q = null;
            n(null, false);
        }
        this.V = z3;
    }

    private void q() {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.a.get(i2).n();
        }
    }

    private void r(LinearLayout.LayoutParams layoutParams) {
        if (this.I == 1 && this.F == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.f.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.f.getChildAt(i3);
                boolean z2 = true;
                childAt.setSelected(i3 == i2);
                if (i3 != i2) {
                    z2 = false;
                }
                childAt.setActivated(z2);
                i3++;
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        d(view);
    }

    public void b(d dVar) {
        if (!this.N.contains(dVar)) {
            this.N.add(dVar);
        }
    }

    public void c(g gVar, boolean z2) {
        int size = this.a.size();
        if (gVar.f == this) {
            gVar.l(size);
            this.a.add(size, gVar);
            int size2 = this.a.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                }
                this.a.get(size).l(size);
            }
            i iVar = gVar.g;
            iVar.setSelected(false);
            iVar.setActivated(false);
            f fVar = this.f;
            int e2 = gVar.e();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            r(layoutParams);
            fVar.addView(iVar, e2, layoutParams);
            if (z2) {
                TabLayout tabLayout = gVar.f;
                if (tabLayout != null) {
                    tabLayout.m(gVar, true);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public int getSelectedTabPosition() {
        g gVar = this.b;
        if (gVar != null) {
            return gVar.e();
        }
        return -1;
    }

    public int getTabCount() {
        return this.a.size();
    }

    public int getTabGravity() {
        return this.F;
    }

    public ColorStateList getTabIconTint() {
        return this.t;
    }

    public int getTabIndicatorGravity() {
        return this.H;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.A;
    }

    public int getTabMode() {
        return this.I;
    }

    public ColorStateList getTabRippleColor() {
        return this.u;
    }

    public Drawable getTabSelectedIndicator() {
        return this.v;
    }

    public ColorStateList getTabTextColors() {
        return this.s;
    }

    public g i(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.a.get(i2);
    }

    public g j() {
        g a2 = a0.a();
        if (a2 == null) {
            a2 = new g();
        }
        a2.f = this;
        w3<i> w3Var = this.W;
        i a3 = w3Var != null ? w3Var.a() : null;
        if (a3 == null) {
            a3 = new i(getContext());
        }
        a3.setTab(a2);
        a3.setFocusable(true);
        a3.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(a2.c)) {
            a3.setContentDescription(a2.b);
        } else {
            a3.setContentDescription(a2.c);
        }
        a2.g = a3;
        return a2;
    }

    /* access modifiers changed from: package-private */
    public void k() {
        int currentItem;
        l();
        androidx.viewpager.widget.a aVar = this.R;
        if (aVar != null) {
            int d2 = aVar.d();
            for (int i2 = 0; i2 < d2; i2++) {
                g j2 = j();
                j2.m(this.R.f(i2));
                c(j2, false);
            }
            ViewPager viewPager = this.Q;
            if (viewPager != null && d2 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                m(i(currentItem), true);
            }
        }
    }

    public void l() {
        int childCount = this.f.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            i iVar = (i) this.f.getChildAt(childCount);
            this.f.removeViewAt(childCount);
            if (iVar != null) {
                iVar.setTab(null);
                iVar.setSelected(false);
                this.W.b(iVar);
            }
            requestLayout();
        }
        Iterator<g> it = this.a.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.h();
            a0.b(next);
        }
        this.b = null;
    }

    public void m(g gVar, boolean z2) {
        g gVar2 = this.b;
        if (gVar2 != gVar) {
            int e2 = gVar != null ? gVar.e() : -1;
            if (z2) {
                if ((gVar2 == null || gVar2.e() == -1) && e2 != -1) {
                    o(e2, 0.0f, true, true);
                } else {
                    e(e2);
                }
                if (e2 != -1) {
                    setSelectedTabView(e2);
                }
            }
            this.b = gVar;
            if (gVar2 != null) {
                for (int size = this.N.size() - 1; size >= 0; size--) {
                    this.N.get(size).b(gVar2);
                }
            }
            if (gVar != null) {
                for (int size2 = this.N.size() - 1; size2 >= 0; size2--) {
                    this.N.get(size2).a(gVar);
                }
            }
        } else if (gVar2 != null) {
            for (int size3 = this.N.size() - 1; size3 >= 0; size3--) {
                this.N.get(size3).c(gVar);
            }
            e(gVar.e());
        }
    }

    /* access modifiers changed from: package-private */
    public void n(androidx.viewpager.widget.a aVar, boolean z2) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.R;
        if (!(aVar2 == null || (dataSetObserver = this.S) == null)) {
            aVar2.q(dataSetObserver);
        }
        this.R = aVar;
        if (z2 && aVar != null) {
            if (this.S == null) {
                this.S = new e();
            }
            aVar.k(this.S);
        }
        k();
    }

    public void o(int i2, float f2, boolean z2, boolean z3) {
        int round = Math.round(((float) i2) + f2);
        if (round >= 0 && round < this.f.getChildCount()) {
            if (z3) {
                this.f.e(i2, f2);
            }
            ValueAnimator valueAnimator = this.P;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.P.cancel();
            }
            scrollTo(g(i2, f2), 0);
            if (z2) {
                setSelectedTabView(round);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof yx) {
            zx.b(this, (yx) background);
        }
        if (this.Q == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                p((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.V) {
            setupWithViewPager(null);
            this.V = false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        for (int i2 = 0; i2 < this.f.getChildCount(); i2++) {
            View childAt = this.f.getChildAt(i2);
            if (childAt instanceof i) {
                i.c((i) childAt, canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d5.v0(accessibilityNodeInfo).T(d5.b.b(1, getTabCount(), false, 1));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.o.c(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.C
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.o.c(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.A = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.I
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = 1
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z2) {
        for (int i2 = 0; i2 < this.f.getChildCount(); i2++) {
            View childAt = this.f.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            r((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z2) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof yx) {
            ((yx) background).G(f2);
        }
    }

    public void setInlineLabel(boolean z2) {
        if (this.J != z2) {
            this.J = z2;
            for (int i2 = 0; i2 < this.f.getChildCount(); i2++) {
                View childAt = this.f.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).o();
                }
            }
            f();
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        h();
        this.P.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.v != drawable) {
            this.v = drawable;
            f fVar = this.f;
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            fVar.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.f.f(i2);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.H != i2) {
            this.H = i2;
            f fVar = this.f;
            int i3 = q4.g;
            int i4 = Build.VERSION.SDK_INT;
            fVar.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.f.g(i2);
    }

    public void setTabGravity(int i2) {
        if (this.F != i2) {
            this.F = i2;
            f();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.t != colorStateList) {
            this.t = colorStateList;
            q();
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(i0.a(getContext(), i2));
    }

    public void setTabIndicatorFullWidth(boolean z2) {
        this.K = z2;
        f fVar = this.f;
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        fVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i2) {
        if (i2 != this.I) {
            this.I = i2;
            f();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            for (int i2 = 0; i2 < this.f.getChildCount(); i2++) {
                View childAt = this.f.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).n(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(i0.a(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.s != colorStateList) {
            this.s = colorStateList;
            q();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        n(aVar, false);
    }

    public void setUnboundedRipple(boolean z2) {
        if (this.L != z2) {
            this.L = z2;
            for (int i2 = 0; i2 < this.f.getChildCount(); i2++) {
                View childAt = this.f.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).n(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        p(viewPager, true, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(iy.a(context, attributeSet, i2, C0707R.style.Widget_Design_TabLayout), attributeSet, i2);
        this.a = new ArrayList<>();
        this.c = new RectF();
        this.A = Integer.MAX_VALUE;
        this.N = new ArrayList<>();
        this.W = new w3<>(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.f = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray f2 = com.google.android.material.internal.j.f(context2, attributeSet, pw.M, i2, C0707R.style.Widget_Design_TabLayout, 22);
        if (getBackground() instanceof ColorDrawable) {
            yx yxVar = new yx();
            yxVar.H(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            yxVar.C(context2);
            yxVar.G(q4.k(this));
            int i3 = Build.VERSION.SDK_INT;
            setBackground(yxVar);
        }
        fVar.g(f2.getDimensionPixelSize(10, -1));
        fVar.f(f2.getColor(7, 0));
        setSelectedTabIndicator(jx.c(context2, f2, 5));
        setSelectedTabIndicatorGravity(f2.getInt(9, 0));
        setTabIndicatorFullWidth(f2.getBoolean(8, true));
        int dimensionPixelSize = f2.getDimensionPixelSize(15, 0);
        this.q = dimensionPixelSize;
        this.p = dimensionPixelSize;
        this.o = dimensionPixelSize;
        this.n = dimensionPixelSize;
        this.n = f2.getDimensionPixelSize(18, dimensionPixelSize);
        this.o = f2.getDimensionPixelSize(19, this.o);
        this.p = f2.getDimensionPixelSize(17, this.p);
        this.q = f2.getDimensionPixelSize(16, this.q);
        int resourceId = f2.getResourceId(22, C0707R.style.TextAppearance_Design_Tab);
        this.r = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, h0.y);
        try {
            this.x = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.s = jx.a(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (f2.hasValue(23)) {
                this.s = jx.a(context2, f2, 23);
            }
            if (f2.hasValue(21)) {
                this.s = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{f2.getColor(21, 0), this.s.getDefaultColor()});
            }
            this.t = jx.a(context2, f2, 3);
            this.w = o.h(f2.getInt(4, -1), null);
            this.u = jx.a(context2, f2, 20);
            this.G = f2.getInt(6, 300);
            this.B = f2.getDimensionPixelSize(13, -1);
            this.C = f2.getDimensionPixelSize(12, -1);
            this.z = f2.getResourceId(0, 0);
            this.E = f2.getDimensionPixelSize(1, 0);
            this.I = f2.getInt(14, 1);
            this.F = f2.getInt(2, 0);
            this.J = f2.getBoolean(11, false);
            this.L = f2.getBoolean(24, false);
            f2.recycle();
            Resources resources = getResources();
            this.y = (float) resources.getDimensionPixelSize(C0707R.dimen.design_tab_text_size_2line);
            this.D = resources.getDimensionPixelSize(C0707R.dimen.design_tab_scrollable_min_width);
            f();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        d(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.M;
        if (cVar2 != null) {
            this.N.remove(cVar2);
        }
        this.M = cVar;
        if (cVar != null && !this.N.contains(cVar)) {
            this.N.add(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        d(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        d(view);
    }

    public void setSelectedTabIndicator(int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(i0.b(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
