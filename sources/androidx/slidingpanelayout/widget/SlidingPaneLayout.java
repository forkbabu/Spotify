package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import defpackage.o5;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {
    private boolean A;
    private final Rect B;
    final ArrayList<b> C;
    private Method D;
    private Field E;
    private boolean F;
    private int a;
    private int b;
    private Drawable c;
    private Drawable f;
    private final int n;
    private boolean o;
    View p;
    float q;
    private float r;
    int s;
    boolean t;
    private int u;
    private float v;
    private float w;
    private d x;
    final o5 y;
    boolean z;

    class a extends z3 {
        private final Rect a = new Rect();

        a() {
        }

        @Override // defpackage.z3
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // defpackage.z3
        public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
            d5 G = d5.G(d5Var);
            super.onInitializeAccessibilityNodeInfo(view, G);
            Rect rect = this.a;
            G.i(rect);
            d5Var.M(rect);
            G.j(rect);
            d5Var.N(rect);
            d5Var.t0(G.D());
            d5Var.g0(G.q());
            d5Var.R(G.l());
            d5Var.V(G.n());
            d5Var.X(G.v());
            d5Var.S(G.u());
            d5Var.Z(G.w());
            d5Var.a0(G.x());
            d5Var.K(G.s());
            d5Var.o0(G.B());
            d5Var.d0(G.y());
            d5Var.a(G.h());
            d5Var.f0(G.p());
            G.I();
            d5Var.R(SlidingPaneLayout.class.getName());
            d5Var.q0(view);
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            ViewParent parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                d5Var.i0((View) parentForAccessibility);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i3);
                if (!SlidingPaneLayout.this.f(childAt) && childAt.getVisibility() == 0) {
                    q4.O(childAt, 1);
                    d5Var.c(childAt);
                }
            }
        }

        @Override // defpackage.z3
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!SlidingPaneLayout.this.f(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    public class b implements Runnable {
        final View a;

        b(View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.getParent() == SlidingPaneLayout.this) {
                this.a.setLayerType(0, null);
                SlidingPaneLayout.this.e(this.a);
            }
            SlidingPaneLayout.this.C.remove(this);
        }
    }

    private class c extends o5.c {
        c() {
        }

        @Override // defpackage.o5.c
        public int a(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.p.getLayoutParams();
            if (SlidingPaneLayout.this.g()) {
                int width = SlidingPaneLayout.this.getWidth() - (SlidingPaneLayout.this.p.getWidth() + (SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.s);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.s + paddingLeft);
        }

        @Override // defpackage.o5.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // defpackage.o5.c
        public int c(View view) {
            return SlidingPaneLayout.this.s;
        }

        @Override // defpackage.o5.c
        public void e(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.y.c(slidingPaneLayout.p, i2);
        }

        @Override // defpackage.o5.c
        public void h(View view, int i) {
            SlidingPaneLayout.this.j();
        }

        @Override // defpackage.o5.c
        public void i(int i) {
            if (SlidingPaneLayout.this.y.u() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.q == 0.0f) {
                    slidingPaneLayout.l(slidingPaneLayout.p);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.c(slidingPaneLayout2.p);
                    SlidingPaneLayout.this.z = false;
                    return;
                }
                slidingPaneLayout.d(slidingPaneLayout.p);
                SlidingPaneLayout.this.z = true;
            }
        }

        @Override // defpackage.o5.c
        public void j(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.h(i);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // defpackage.o5.c
        public void k(View view, float f, float f2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.g()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.q > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.s;
                }
                i = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.p.getWidth();
            } else {
                i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && SlidingPaneLayout.this.q > 0.5f)) {
                    i += SlidingPaneLayout.this.s;
                }
            }
            SlidingPaneLayout.this.y.H(i, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // defpackage.o5.c
        public boolean l(View view, int i) {
            if (SlidingPaneLayout.this.t) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).b;
        }
    }

    public interface d {
        void a(View view);

        void b(View view);

        void c(View view, float f);
    }

    static class e extends l5 {
        public static final Parcelable.Creator<e> CREATOR = new a();
        boolean c;

        static class a implements Parcelable.ClassLoaderCreator<e> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, null);
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

        e(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // defpackage.l5, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
        }

        e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, null);
            this.c = parcel.readInt() != 0;
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean a(int i) {
        if (!this.A && !k(0.0f)) {
            return false;
        }
        this.z = false;
        return true;
    }

    private void b(View view, float f2, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f2 > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f2)) << 24) | (i & 16777215);
            if (layoutParams.d == null) {
                layoutParams.d = new Paint();
            }
            layoutParams.d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.d);
            }
            e(view);
        } else if (view.getLayerType() != 0) {
            Paint paint = layoutParams.d;
            if (paint != null) {
                paint.setColorFilter(null);
            }
            b bVar = new b(view);
            this.C.add(bVar);
            int i3 = q4.g;
            int i4 = Build.VERSION.SDK_INT;
            postOnAnimation(bVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.g()
            android.view.View r1 = r9.p
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.c
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x0059
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.p
            if (r4 != r5) goto L_0x002c
            goto L_0x0056
        L_0x002c:
            float r5 = r9.r
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.u
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.r = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0044
            int r5 = -r5
        L_0x0044:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0056
            float r5 = r9.r
            if (r0 == 0) goto L_0x004f
            float r5 = r5 - r6
            goto L_0x0051
        L_0x004f:
            float r5 = r6 - r5
        L_0x0051:
            int r6 = r9.b
            r9.b(r4, r5, r6)
        L_0x0056:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.i(float):void");
    }

    /* access modifiers changed from: package-private */
    public void c(View view) {
        d dVar = this.x;
        if (dVar != null) {
            dVar.b(view);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (!this.y.k(true)) {
            return;
        }
        if (!this.o) {
            this.y.a();
            return;
        }
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        postInvalidateOnAnimation();
    }

    /* access modifiers changed from: package-private */
    public void d(View view) {
        d dVar = this.x;
        if (dVar != null) {
            dVar.a(view);
        }
        sendAccessibilityEvent(32);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        int i;
        int i2;
        super.draw(canvas);
        if (g()) {
            drawable = this.f;
        } else {
            drawable = this.c;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (g()) {
                i2 = childAt.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = childAt.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.o && !layoutParams.b && this.p != null) {
            canvas.getClipBounds(this.B);
            if (g()) {
                Rect rect = this.B;
                rect.left = Math.max(rect.left, this.p.getRight());
            } else {
                Rect rect2 = this.B;
                rect2.right = Math.min(rect2.right, this.p.getLeft());
            }
            canvas.clipRect(this.B);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    public void e(View view) {
        Field field;
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            Paint paint = ((LayoutParams) view.getLayoutParams()).d;
            int i2 = q4.g;
            if (i >= 17) {
                view.setLayerPaint(paint);
                return;
            }
            view.setLayerType(view.getLayerType(), paint);
            view.invalidate();
            return;
        }
        if (!this.F) {
            try {
                this.D = View.class.getDeclaredMethod("getDisplayList", null);
            } catch (NoSuchMethodException e2) {
                Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", e2);
            }
            try {
                Field declaredField = View.class.getDeclaredField("mRecreateDisplayList");
                this.E = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e3);
            }
            this.F = true;
        }
        if (this.D == null || (field = this.E) == null) {
            view.invalidate();
            return;
        }
        try {
            field.setBoolean(view, true);
            this.D.invoke(view, null);
        } catch (Exception e4) {
            Log.e("SlidingPaneLayout", "Error refreshing display list state", e4);
        }
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        int i3 = q4.g;
        int i4 = Build.VERSION.SDK_INT;
        postInvalidateOnAnimation(left, top, right, bottom);
    }

    /* access modifiers changed from: package-private */
    public boolean f(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.o || !layoutParams.c || this.q <= 0.0f) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return q4.o(this) == 1;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.b;
    }

    public int getParallaxDistance() {
        return this.u;
    }

    public int getSliderFadeColor() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public void h(int i) {
        if (this.p == null) {
            this.q = 0.0f;
            return;
        }
        boolean g = g();
        LayoutParams layoutParams = (LayoutParams) this.p.getLayoutParams();
        int width = this.p.getWidth();
        if (g) {
            i = (getWidth() - i) - width;
        }
        float paddingRight = ((float) (i - ((g ? getPaddingRight() : getPaddingLeft()) + (g ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin)))) / ((float) this.s);
        this.q = paddingRight;
        if (this.u != 0) {
            i(paddingRight);
        }
        if (layoutParams.c) {
            b(this.p, this.q, this.a);
        }
        View view = this.p;
        d dVar = this.x;
        if (dVar != null) {
            dVar.c(view, this.q);
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean k(float f2) {
        int i;
        if (!this.o) {
            return false;
        }
        boolean g = g();
        LayoutParams layoutParams = (LayoutParams) this.p.getLayoutParams();
        if (g) {
            int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            int width = this.p.getWidth();
            i = (int) (((float) getWidth()) - (((f2 * ((float) this.s)) + ((float) paddingRight)) + ((float) width)));
        } else {
            i = (int) ((f2 * ((float) this.s)) + ((float) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin)));
        }
        o5 o5Var = this.y;
        View view = this.p;
        if (!o5Var.J(view, i, view.getTop())) {
            return false;
        }
        j();
        int i2 = Build.VERSION.SDK_INT;
        postInvalidateOnAnimation();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(android.view.View r18) {
        /*
            r17 = this;
            r0 = r18
            boolean r1 = r17.g()
            if (r1 == 0) goto L_0x0012
            int r2 = r17.getWidth()
            int r3 = r17.getPaddingRight()
            int r2 = r2 - r3
            goto L_0x0016
        L_0x0012:
            int r2 = r17.getPaddingLeft()
        L_0x0016:
            if (r1 == 0) goto L_0x001d
            int r3 = r17.getPaddingLeft()
            goto L_0x0026
        L_0x001d:
            int r3 = r17.getWidth()
            int r4 = r17.getPaddingRight()
            int r3 = r3 - r4
        L_0x0026:
            int r4 = r17.getPaddingTop()
            int r5 = r17.getHeight()
            int r6 = r17.getPaddingBottom()
            int r5 = r5 - r6
            if (r0 == 0) goto L_0x0066
            boolean r7 = r18.isOpaque()
            r8 = 1
            if (r7 == 0) goto L_0x003d
            goto L_0x0053
        L_0x003d:
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 18
            if (r7 < r9) goto L_0x0044
            goto L_0x0052
        L_0x0044:
            android.graphics.drawable.Drawable r7 = r18.getBackground()
            if (r7 == 0) goto L_0x0052
            int r7 = r7.getOpacity()
            r9 = -1
            if (r7 != r9) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r8 = 0
        L_0x0053:
            if (r8 == 0) goto L_0x0066
            int r7 = r18.getLeft()
            int r8 = r18.getRight()
            int r9 = r18.getTop()
            int r10 = r18.getBottom()
            goto L_0x006a
        L_0x0066:
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x006a:
            int r11 = r17.getChildCount()
            r12 = 0
        L_0x006f:
            r13 = r17
            if (r12 >= r11) goto L_0x00c6
            android.view.View r14 = r13.getChildAt(r12)
            if (r14 != r0) goto L_0x007a
            goto L_0x00c6
        L_0x007a:
            int r15 = r14.getVisibility()
            r6 = 8
            if (r15 != r6) goto L_0x0085
            r16 = r1
            goto L_0x00bf
        L_0x0085:
            if (r1 == 0) goto L_0x0089
            r6 = r3
            goto L_0x008a
        L_0x0089:
            r6 = r2
        L_0x008a:
            int r15 = r14.getLeft()
            int r6 = java.lang.Math.max(r6, r15)
            int r15 = r14.getTop()
            int r15 = java.lang.Math.max(r4, r15)
            r16 = r1
            if (r1 == 0) goto L_0x00a0
            r0 = r2
            goto L_0x00a1
        L_0x00a0:
            r0 = r3
        L_0x00a1:
            int r1 = r14.getRight()
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r14.getBottom()
            int r1 = java.lang.Math.min(r5, r1)
            if (r6 < r7) goto L_0x00bb
            if (r15 < r9) goto L_0x00bb
            if (r0 > r8) goto L_0x00bb
            if (r1 > r10) goto L_0x00bb
            r0 = 4
            goto L_0x00bc
        L_0x00bb:
            r0 = 0
        L_0x00bc:
            r14.setVisibility(r0)
        L_0x00bf:
            int r12 = r12 + 1
            r0 = r18
            r1 = r16
            goto L_0x006f
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.l(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A = true;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A = true;
        int size = this.C.size();
        for (int i = 0; i < size; i++) {
            this.C.get(i).run();
        }
        this.C.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.o && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.z = !this.y.x(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.o || (this.t && actionMasked != 0)) {
            this.y.b();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.y.b();
            return false;
        } else {
            if (actionMasked == 0) {
                this.t = false;
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                this.v = x2;
                this.w = y2;
                if (this.y.x(this.p, (int) x2, (int) y2) && f(this.p)) {
                    z2 = true;
                    if (this.y.I(motionEvent) && !z2) {
                        return false;
                    }
                }
            } else if (actionMasked == 2) {
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                float abs = Math.abs(x3 - this.v);
                float abs2 = Math.abs(y3 - this.w);
                if (abs > ((float) this.y.t()) && abs2 > abs) {
                    this.y.b();
                    this.t = true;
                    return false;
                }
            }
            z2 = false;
            return this.y.I(motionEvent) ? true : true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean g = g();
        if (g) {
            this.y.F(2);
        } else {
            this.y.F(1);
        }
        int i10 = i3 - i;
        int paddingRight = g ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = g ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.A) {
            this.q = (!this.o || !this.z) ? 0.0f : 1.0f;
        }
        int i11 = paddingRight;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.b) {
                    int i13 = i10 - paddingLeft;
                    int min = (Math.min(paddingRight, i13 - this.n) - i11) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.s = min;
                    int i14 = g ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.c = (measuredWidth / 2) + ((i11 + i14) + min) > i13;
                    int i15 = (int) (((float) min) * this.q);
                    i6 = i14 + i15 + i11;
                    this.q = ((float) i15) / ((float) min);
                    i5 = 0;
                } else if (!this.o || (i9 = this.u) == 0) {
                    i6 = paddingRight;
                    i5 = 0;
                } else {
                    i5 = (int) ((1.0f - this.q) * ((float) i9));
                    i6 = paddingRight;
                }
                if (g) {
                    i7 = (i10 - i6) + i5;
                    i8 = i7 - measuredWidth;
                } else {
                    i8 = i6 - i5;
                    i7 = i8 + measuredWidth;
                }
                childAt.layout(i8, paddingTop, i7, childAt.getMeasuredHeight() + paddingTop);
                i11 = i6;
                paddingRight = childAt.getWidth() + paddingRight;
            }
        }
        if (this.A) {
            if (this.o) {
                if (this.u != 0) {
                    i(this.q);
                }
                if (((LayoutParams) this.p.getLayoutParams()).c) {
                    b(this.p, this.q, this.a);
                }
            } else {
                for (int i16 = 0; i16 < childCount; i16++) {
                    b(getChildAt(i16), 0.0f, this.a);
                }
            }
            l(this.p);
        }
        this.A = false;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        int i12;
        int i13;
        int i14;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            } else if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            } else if (mode2 == 0) {
                mode2 = Integer.MIN_VALUE;
                size2 = 300;
            }
        }
        boolean z2 = false;
        if (mode2 == Integer.MIN_VALUE) {
            i3 = (size2 - getPaddingTop()) - getPaddingBottom();
            i4 = 0;
        } else if (mode2 != 1073741824) {
            i4 = 0;
            i3 = 0;
        } else {
            i4 = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = i4;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.p = null;
        int i15 = paddingLeft;
        int i16 = 0;
        boolean z3 = false;
        float f3 = 0.0f;
        while (true) {
            i5 = 8;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.c = z2;
            } else {
                float f4 = layoutParams.a;
                if (f4 > 0.0f) {
                    f3 += f4;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width == 0) {
                    }
                }
                int i17 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int i18 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                if (i18 == -2) {
                    i11 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i17, Integer.MIN_VALUE);
                    f2 = f3;
                    i12 = Integer.MIN_VALUE;
                } else {
                    f2 = f3;
                    i12 = Integer.MIN_VALUE;
                    if (i18 == -1) {
                        i11 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i17, 1073741824);
                    } else {
                        i11 = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                    }
                }
                int i19 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                if (i19 == -2) {
                    i13 = View.MeasureSpec.makeMeasureSpec(i3, i12);
                } else {
                    if (i19 == -1) {
                        i14 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    } else {
                        i14 = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                    }
                    i13 = i14;
                }
                childAt.measure(i11, i13);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == i12 && measuredHeight > i4) {
                    i4 = Math.min(measuredHeight, i3);
                }
                i15 -= measuredWidth;
                boolean z4 = i15 < 0;
                layoutParams.b = z4;
                z3 |= z4;
                if (z4) {
                    this.p = childAt;
                }
                f3 = f2;
            }
            i16++;
            z2 = false;
        }
        if (z3 || f3 > 0.0f) {
            int i20 = paddingLeft - this.n;
            int i21 = 0;
            while (i21 < childCount) {
                View childAt2 = getChildAt(i21);
                if (childAt2.getVisibility() != i5) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i5) {
                        boolean z5 = ((ViewGroup.MarginLayoutParams) layoutParams2).width == 0 && layoutParams2.a > 0.0f;
                        if (z5) {
                            i7 = 0;
                        } else {
                            i7 = childAt2.getMeasuredWidth();
                        }
                        if (!z3 || childAt2 == this.p) {
                            if (layoutParams2.a > 0.0f) {
                                if (((ViewGroup.MarginLayoutParams) layoutParams2).width == 0) {
                                    int i22 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                    if (i22 == -2) {
                                        i8 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                    } else if (i22 == -1) {
                                        i8 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                    } else {
                                        i8 = View.MeasureSpec.makeMeasureSpec(i22, 1073741824);
                                    }
                                } else {
                                    i8 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                if (z3) {
                                    int i23 = paddingLeft - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                                    i6 = i20;
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i23, 1073741824);
                                    if (i7 != i23) {
                                        childAt2.measure(makeMeasureSpec, i8);
                                    }
                                    i21++;
                                    i20 = i6;
                                    i5 = 8;
                                } else {
                                    i6 = i20;
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i7 + ((int) ((layoutParams2.a * ((float) Math.max(0, i15))) / f3)), 1073741824), i8);
                                    i21++;
                                    i20 = i6;
                                    i5 = 8;
                                }
                            }
                        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).width < 0 && (i7 > i20 || layoutParams2.a > 0.0f)) {
                            if (z5) {
                                int i24 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                if (i24 == -2) {
                                    i10 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                    i9 = 1073741824;
                                } else if (i24 == -1) {
                                    i9 = 1073741824;
                                    i10 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                } else {
                                    i9 = 1073741824;
                                    i10 = View.MeasureSpec.makeMeasureSpec(i24, 1073741824);
                                }
                            } else {
                                i9 = 1073741824;
                                i10 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i20, i9), i10);
                        }
                    }
                }
                i6 = i20;
                i21++;
                i20 = i6;
                i5 = 8;
            }
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + i4);
        this.o = z3;
        if (this.y.u() != 0 && !z3) {
            this.y.a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.a());
        if (!eVar.c) {
            a(0);
        } else if (this.A || k(1.0f)) {
            this.z = true;
        }
        this.z = eVar.c;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z2;
        e eVar = new e(super.onSaveInstanceState());
        boolean z3 = this.o;
        if (z3) {
            z2 = !z3 || this.q == 1.0f;
        } else {
            z2 = this.z;
        }
        eVar.c = z2;
        return eVar;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.A = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.o) {
            return super.onTouchEvent(motionEvent);
        }
        this.y.y(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.v = x2;
            this.w = y2;
        } else if (actionMasked == 1 && f(this.p)) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float f2 = x3 - this.v;
            float f3 = y3 - this.w;
            int t2 = this.y.t();
            if ((f3 * f3) + (f2 * f2) < ((float) (t2 * t2)) && this.y.x(this.p, (int) x3, (int) y3)) {
                a(0);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.o) {
            this.z = view == this.p;
        }
    }

    public void setCoveredFadeColor(int i) {
        this.b = i;
    }

    public void setPanelSlideListener(d dVar) {
        this.x = dVar;
    }

    public void setParallaxDistance(int i) {
        this.u = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.c = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(androidx.core.content.a.d(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(androidx.core.content.a.d(getContext(), i));
    }

    public void setSliderFadeColor(int i) {
        this.a = i;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int[] e = {16843137};
        public float a = 0.0f;
        boolean b;
        boolean c;
        Paint d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e);
            this.a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -858993460;
        this.A = true;
        this.B = new Rect();
        this.C = new ArrayList<>();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.n = (int) ((32.0f * f2) + 0.5f);
        setWillNotDraw(false);
        q4.I(this, new a());
        q4.O(this, 1);
        o5 l = o5.l(this, 0.5f, new c());
        this.y = l;
        l.G(f2 * 400.0f);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
