package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z;
import defpackage.d5;
import defpackage.f5;

public final class ViewPager2 extends ViewGroup {
    private boolean A = true;
    private int B = -1;
    d C;
    private final Rect a = new Rect();
    private final Rect b = new Rect();
    private c c = new c(3);
    int f;
    boolean n = false;
    private RecyclerView.g o = new a();
    private LinearLayoutManager p;
    private int q = -1;
    private Parcelable r;
    RecyclerView s;
    private z t;
    g u;
    private c v;
    private e w;
    private f x;
    private RecyclerView.j y = null;
    private boolean z = false;

    class a extends e {
        a() {
            super(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.n = true;
            viewPager2.u.k();
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends g {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void a(int i) {
            if (i == 0) {
                ViewPager2.this.k();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f != i) {
                viewPager2.f = i;
                viewPager2.C.d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends g {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void c(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.s.requestFocus(2);
            }
        }
    }

    /* access modifiers changed from: private */
    public abstract class d {
        d(ViewPager2 viewPager2, a aVar) {
        }

        /* access modifiers changed from: package-private */
        public abstract void a(RecyclerView.e<?> eVar);

        /* access modifiers changed from: package-private */
        public abstract void b(RecyclerView.e<?> eVar);

        /* access modifiers changed from: package-private */
        public abstract void c(c cVar, RecyclerView recyclerView);

        /* access modifiers changed from: package-private */
        public abstract void d();
    }

    private static abstract class e extends RecyclerView.g {
        e(a aVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i, int i2, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i, int i2, int i3) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i, int i2) {
            a();
        }
    }

    /* access modifiers changed from: private */
    public class f extends LinearLayoutManager {
        f(Context context) {
            super(1, false);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void M1(RecyclerView.y yVar, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.M1(yVar, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public void S0(RecyclerView.s sVar, RecyclerView.y yVar, d5 d5Var) {
            super.S0(sVar, yVar, d5Var);
            ViewPager2.this.C.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public boolean k1(RecyclerView.s sVar, RecyclerView.y yVar, int i, Bundle bundle) {
            ViewPager2.this.C.getClass();
            return super.k1(sVar, yVar, i, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    public static abstract class g {
        public void a(int i) {
        }

        public void b(int i, float f, int i2) {
        }

        public void c(int i) {
        }
    }

    /* access modifiers changed from: package-private */
    public class h extends d {
        private final f5 a = new a();
        private final f5 b = new b();
        private RecyclerView.g c;

        class a implements f5 {
            a() {
            }

            @Override // defpackage.f5
            public boolean a(View view, f5.a aVar) {
                h.this.e(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        class b implements f5 {
            b() {
            }

            @Override // defpackage.f5
            public boolean a(View view, f5.a aVar) {
                h.this.e(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        class c extends e {
            c() {
                super(null);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.g
            public void a() {
                h.this.f();
            }
        }

        h() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.d
        public void a(RecyclerView.e<?> eVar) {
            f();
            if (eVar != null) {
                eVar.T(this.c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.d
        public void b(RecyclerView.e<?> eVar) {
            if (eVar != null) {
                eVar.W(this.c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.d
        public void c(c cVar, RecyclerView recyclerView) {
            q4.O(recyclerView, 2);
            this.c = new c();
            if (q4.n(ViewPager2.this) == 0) {
                q4.O(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.d
        public void d() {
            f();
        }

        /* access modifiers changed from: package-private */
        public void e(int i) {
            if (ViewPager2.this.d()) {
                ViewPager2.this.i(i, true);
            }
        }

        /* access modifiers changed from: package-private */
        public void f() {
            int u;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = 16908360;
            q4.C(viewPager2, 16908360);
            q4.C(viewPager2, 16908361);
            q4.C(viewPager2, 16908358);
            q4.C(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() != null && (u = ViewPager2.this.getAdapter().u()) != 0 && ViewPager2.this.d()) {
                if (ViewPager2.this.getOrientation() == 0) {
                    boolean c2 = ViewPager2.this.c();
                    int i2 = c2 ? 16908360 : 16908361;
                    if (c2) {
                        i = 16908361;
                    }
                    if (ViewPager2.this.f < u - 1) {
                        q4.E(viewPager2, new d5.a(i2, null), null, this.a);
                    }
                    if (ViewPager2.this.f > 0) {
                        q4.E(viewPager2, new d5.a(i, null), null, this.b);
                        return;
                    }
                    return;
                }
                if (ViewPager2.this.f < u - 1) {
                    q4.E(viewPager2, new d5.a(16908359, null), null, this.a);
                }
                if (ViewPager2.this.f > 0) {
                    q4.E(viewPager2, new d5.a(16908358, null), null, this.b);
                }
            }
        }
    }

    public interface i {
        void a(View view, float f);
    }

    /* access modifiers changed from: private */
    public class j extends z {
        j() {
        }

        @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.f0
        public View f(RecyclerView.m mVar) {
            if (ViewPager2.this.b()) {
                return null;
            }
            return super.f(mVar);
        }
    }

    /* access modifiers changed from: private */
    public class k extends RecyclerView {
        k(Context context) {
            super(context, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            ViewPager2.this.C.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f);
            accessibilityEvent.setToIndex(ViewPager2.this.f);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.d() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.d() && super.onTouchEvent(motionEvent);
        }
    }

    /* access modifiers changed from: private */
    public static class m implements Runnable {
        private final int a;
        private final RecyclerView b;

        m(int i, RecyclerView recyclerView) {
            this.a = i;
            this.b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.N0(this.a);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    /* JADX INFO: finally extract failed */
    private void a(Context context, AttributeSet attributeSet) {
        this.C = new h();
        k kVar = new k(context);
        this.s = kVar;
        kVar.setId(q4.f());
        this.s.setDescendantFocusability(131072);
        f fVar = new f(context);
        this.p = fVar;
        this.s.setLayoutManager(fVar);
        this.s.setScrollingTouchSlop(1);
        int[] iArr = k8.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.s.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.s.l(new h(this));
            g gVar = new g(this);
            this.u = gVar;
            this.w = new e(this, gVar, this.s);
            j jVar = new j();
            this.t = jVar;
            jVar.a(this.s);
            this.s.n(this.u);
            c cVar = new c(3);
            this.v = cVar;
            this.u.o(cVar);
            b bVar = new b();
            c cVar2 = new c();
            this.v.d(bVar);
            this.v.d(cVar2);
            this.C.c(this.v, this.s);
            this.v.d(this.c);
            f fVar2 = new f(this.p);
            this.x = fVar2;
            this.v.d(fVar2);
            RecyclerView recyclerView = this.s;
            attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void g() {
        RecyclerView.e adapter;
        if (this.q != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.r;
            if (parcelable != null) {
                if (adapter instanceof androidx.viewpager2.adapter.e) {
                    ((androidx.viewpager2.adapter.e) adapter).b(parcelable);
                }
                this.r = null;
            }
            int max = Math.max(0, Math.min(this.q, adapter.u() - 1));
            this.f = max;
            this.q = -1;
            this.s.I0(max);
            ((h) this.C).f();
        }
    }

    public boolean b() {
        return this.w.a();
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.p.k0() == 1;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        return this.s.canScrollHorizontally(i2);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        return this.s.canScrollVertically(i2);
    }

    public boolean d() {
        return this.A;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof l) {
            int i2 = ((l) parcelable).a;
            sparseArray.put(this.s.getId(), sparseArray.get(i2));
            sparseArray.remove(i2);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        g();
    }

    public void e(g gVar) {
        this.c.d(gVar);
    }

    public void f() {
        if (this.x.d() != null) {
            double g2 = this.u.g();
            int i2 = (int) g2;
            double d2 = (double) i2;
            Double.isNaN(d2);
            float f2 = (float) (g2 - d2);
            this.x.b(i2, f2, Math.round(((float) getPageSize()) * f2));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.C.getClass();
        this.C.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.e getAdapter() {
        return this.s.getAdapter();
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getItemDecorationCount() {
        return this.s.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.B;
    }

    public int getOrientation() {
        return this.p.j2();
    }

    /* access modifiers changed from: package-private */
    public int getPageSize() {
        int i2;
        int i3;
        RecyclerView recyclerView = this.s;
        if (getOrientation() == 0) {
            i2 = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i3 = recyclerView.getPaddingRight();
        } else {
            i2 = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i3 = recyclerView.getPaddingBottom();
        }
        return i2 - i3;
    }

    public int getScrollState() {
        return this.u.h();
    }

    public void h(int i2, boolean z2) {
        if (!this.w.a()) {
            i(i2, z2);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    /* access modifiers changed from: package-private */
    public void i(int i2, boolean z2) {
        RecyclerView.e adapter = getAdapter();
        if (adapter == null) {
            if (this.q != -1) {
                this.q = Math.max(i2, 0);
            }
        } else if (adapter.u() > 0) {
            int min = Math.min(Math.max(i2, 0), adapter.u() - 1);
            if (min != this.f || !this.u.j()) {
                int i3 = this.f;
                if (min != i3 || !z2) {
                    double d2 = (double) i3;
                    this.f = min;
                    ((h) this.C).f();
                    if (!this.u.j()) {
                        d2 = this.u.g();
                    }
                    this.u.m(min, z2);
                    if (!z2) {
                        this.s.I0(min);
                        return;
                    }
                    double d3 = (double) min;
                    Double.isNaN(d3);
                    if (Math.abs(d3 - d2) > 3.0d) {
                        this.s.I0(d3 > d2 ? min - 3 : min + 3);
                        RecyclerView recyclerView = this.s;
                        recyclerView.post(new m(min, recyclerView));
                        return;
                    }
                    this.s.N0(min);
                }
            }
        }
    }

    public void j(g gVar) {
        this.c.e(gVar);
    }

    /* access modifiers changed from: package-private */
    public void k() {
        z zVar = this.t;
        if (zVar != null) {
            View f2 = zVar.f(this.p);
            if (f2 != null) {
                int o0 = this.p.o0(f2);
                if (o0 != this.f && getScrollState() == 0) {
                    this.v.c(o0);
                }
                this.n = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r7) {
        /*
            r6 = this;
            super.onInitializeAccessibilityNodeInfo(r7)
            androidx.viewpager2.widget.ViewPager2$d r0 = r6.C
            androidx.viewpager2.widget.ViewPager2$h r0 = (androidx.viewpager2.widget.ViewPager2.h) r0
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0031
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            int r1 = r1.getOrientation()
            if (r1 != r2) goto L_0x0024
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            int r1 = r1.u()
            goto L_0x0032
        L_0x0024:
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            int r1 = r1.u()
            r4 = r1
            r1 = 0
            goto L_0x0033
        L_0x0031:
            r1 = 0
        L_0x0032:
            r4 = 0
        L_0x0033:
            d5 r5 = defpackage.d5.v0(r7)
            d5$b r1 = defpackage.d5.b.b(r1, r4, r3, r3)
            r5.T(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            if (r1 != 0) goto L_0x0049
            goto L_0x0072
        L_0x0049:
            int r1 = r1.u()
            if (r1 == 0) goto L_0x0072
            androidx.viewpager2.widget.ViewPager2 r3 = androidx.viewpager2.widget.ViewPager2.this
            boolean r3 = r3.d()
            if (r3 != 0) goto L_0x0058
            goto L_0x0072
        L_0x0058:
            androidx.viewpager2.widget.ViewPager2 r3 = androidx.viewpager2.widget.ViewPager2.this
            int r3 = r3.f
            if (r3 <= 0) goto L_0x0063
            r3 = 8192(0x2000, float:1.14794E-41)
            r7.addAction(r3)
        L_0x0063:
            androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
            int r0 = r0.f
            int r1 = r1 - r2
            if (r0 >= r1) goto L_0x006f
            r0 = 4096(0x1000, float:5.74E-42)
            r7.addAction(r0)
        L_0x006f:
            r7.setScrollable(r2)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ViewPager2.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = this.s.getMeasuredWidth();
        int measuredHeight = this.s.getMeasuredHeight();
        this.a.left = getPaddingLeft();
        this.a.right = (i4 - i2) - getPaddingRight();
        this.a.top = getPaddingTop();
        this.a.bottom = (i5 - i3) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.a, this.b);
        RecyclerView recyclerView = this.s;
        Rect rect = this.b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.n) {
            k();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        measureChild(this.s, i2, i3);
        int measuredWidth = this.s.getMeasuredWidth();
        int measuredHeight = this.s.getMeasuredHeight();
        int measuredState = this.s.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, measuredState), ViewGroup.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        this.q = lVar.b;
        this.r = lVar.c;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.a = this.s.getId();
        int i2 = this.q;
        if (i2 == -1) {
            i2 = this.f;
        }
        lVar.b = i2;
        Parcelable parcelable = this.r;
        if (parcelable != null) {
            lVar.c = parcelable;
        } else {
            RecyclerView.e adapter = this.s.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.e) {
                lVar.c = ((androidx.viewpager2.adapter.e) adapter).a();
            }
        }
        return lVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(je.m0(ViewPager2.class, new StringBuilder(), " does not support direct child views"));
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i2, Bundle bundle) {
        int i3;
        ((h) this.C).getClass();
        boolean z2 = false;
        if (!(i2 == 8192 || i2 == 4096)) {
            return super.performAccessibilityAction(i2, bundle);
        }
        h hVar = (h) this.C;
        hVar.getClass();
        if (i2 == 8192 || i2 == 4096) {
            z2 = true;
        }
        if (z2) {
            if (i2 == 8192) {
                i3 = ViewPager2.this.getCurrentItem() - 1;
            } else {
                i3 = ViewPager2.this.getCurrentItem() + 1;
            }
            hVar.e(i3);
            return true;
        }
        throw new IllegalStateException();
    }

    public void setAdapter(RecyclerView.e eVar) {
        RecyclerView.e<?> adapter = this.s.getAdapter();
        this.C.b(adapter);
        if (adapter != null) {
            adapter.W(this.o);
        }
        this.s.setAdapter(eVar);
        this.f = 0;
        g();
        this.C.a(eVar);
        if (eVar != null) {
            eVar.T(this.o);
        }
    }

    public void setCurrentItem(int i2) {
        h(i2, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        ((h) this.C).f();
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 >= 1 || i2 == -1) {
            this.B = i2;
            this.s.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i2) {
        this.p.u2(i2);
        ((h) this.C).f();
    }

    public void setPageTransformer(i iVar) {
        if (iVar != null) {
            if (!this.z) {
                this.y = this.s.getItemAnimator();
                this.z = true;
            }
            this.s.setItemAnimator(null);
        } else if (this.z) {
            this.s.setItemAnimator(this.y);
            this.y = null;
            this.z = false;
        }
        if (iVar != this.x.d()) {
            this.x.e(iVar);
            f();
        }
    }

    public void setUserInputEnabled(boolean z2) {
        this.A = z2;
        h hVar = (h) this.C;
        hVar.f();
        if (Build.VERSION.SDK_INT < 21) {
            ViewPager2.this.sendAccessibilityEvent(2048);
        }
    }

    static class l extends View.BaseSavedState {
        public static final Parcelable.Creator<l> CREATOR = new a();
        int a;
        int b;
        Parcelable c;

        static class a implements Parcelable.ClassLoaderCreator<l> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return Build.VERSION.SDK_INT >= 24 ? new l(parcel, null) : new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new l[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new l(parcel, classLoader) : new l(parcel);
            }
        }

        l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, i);
        }

        l(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readParcelable(null);
        }

        l(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context, attributeSet);
    }
}
