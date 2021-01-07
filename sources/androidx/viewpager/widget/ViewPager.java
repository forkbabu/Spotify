package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.adjust.sdk.Constants;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import defpackage.b5;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    static final int[] j0 = {16842931};
    private static final Comparator<f> k0 = new a();
    private static final Interpolator l0 = new b();
    private static final m m0 = new m();
    private float A = Float.MAX_VALUE;
    private int B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F = 1;
    private boolean G;
    private boolean H;
    private int I;
    private int J;
    private int K;
    private float L;
    private float M;
    private float N;
    private float O;
    private int P = -1;
    private VelocityTracker Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private EdgeEffect V;
    private EdgeEffect W;
    private int a;
    private boolean a0 = true;
    private final ArrayList<f> b = new ArrayList<>();
    private boolean b0;
    private final f c = new f();
    private int c0;
    private List<i> d0;
    private i e0;
    private final Rect f = new Rect();
    private i f0;
    private List<h> g0;
    private final Runnable h0 = new c();
    private int i0 = 0;
    a n;
    int o;
    private int p = -1;
    private Parcelable q = null;
    private ClassLoader r = null;
    private Scroller s;
    private boolean t;
    private j u;
    private int v;
    private Drawable w;
    private int x;
    private int y;
    private float z = -3.4028235E38f;

    static class a implements Comparator<f> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(f fVar, f fVar2) {
            return fVar.b - fVar2.b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager viewPager = ViewPager.this;
            viewPager.t(viewPager.o);
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements m4 {
        private final Rect a = new Rect();

        d() {
        }

        @Override // defpackage.m4
        public b5 onApplyWindowInsets(View view, b5 b5Var) {
            b5 B = q4.B(view, b5Var);
            if (B.n()) {
                return B;
            }
            Rect rect = this.a;
            rect.left = B.h();
            rect.top = B.j();
            rect.right = B.i();
            rect.bottom = B.g();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                b5 d = q4.d(ViewPager.this.getChildAt(i), B);
                rect.left = Math.min(d.h(), rect.left);
                rect.top = Math.min(d.j(), rect.top);
                rect.right = Math.min(d.i(), rect.right);
                rect.bottom = Math.min(d.g(), rect.bottom);
            }
            int i2 = rect.left;
            int i3 = rect.top;
            int i4 = rect.right;
            int i5 = rect.bottom;
            b5.a aVar = new b5.a(B);
            aVar.c(t2.a(i2, i3, i4, i5));
            return aVar.a();
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    /* access modifiers changed from: package-private */
    public static class f {
        Object a;
        int b;
        boolean c;
        float d;
        float e;

        f() {
        }
    }

    /* access modifiers changed from: package-private */
    public class g extends z3 {
        g() {
        }

        @Override // defpackage.z3
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            a aVar;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            a aVar2 = ViewPager.this.n;
            boolean z = true;
            if (aVar2 == null || aVar2.d() <= 1) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.n) != null) {
                accessibilityEvent.setItemCount(aVar.d());
                accessibilityEvent.setFromIndex(ViewPager.this.o);
                accessibilityEvent.setToIndex(ViewPager.this.o);
            }
        }

        @Override // defpackage.z3
        public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
            super.onInitializeAccessibilityNodeInfo(view, d5Var);
            d5Var.R(ViewPager.class.getName());
            a aVar = ViewPager.this.n;
            d5Var.n0(aVar != null && aVar.d() > 1);
            if (ViewPager.this.canScrollHorizontally(1)) {
                d5Var.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                d5Var.a(8192);
            }
        }

        @Override // defpackage.z3
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.o - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.o + 1);
                return true;
            }
        }
    }

    public interface h {
        void b(ViewPager viewPager, a aVar, a aVar2);
    }

    public interface i {
        void a(int i);

        void f(int i, float f, int i2);

        void g(int i);
    }

    private class j extends DataSetObserver {
        j() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.g();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.g();
        }
    }

    public static class k extends l5 {
        public static final Parcelable.Creator<k> CREATOR = new a();
        int c;
        Parcelable f;
        ClassLoader n;

        static class a implements Parcelable.ClassLoaderCreator<k> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public k createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new k(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new k[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new k(parcel, null);
            }
        }

        public k(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("FragmentPager.SavedState{");
            V0.append(Integer.toHexString(System.identityHashCode(this)));
            V0.append(" position=");
            return je.B0(V0, this.c, "}");
        }

        @Override // defpackage.l5, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeParcelable(this.f, i);
        }

        k(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? k.class.getClassLoader() : classLoader;
            this.c = parcel.readInt();
            this.f = parcel.readParcelable(classLoader);
            this.n = classLoader;
        }
    }

    public static class l implements i {
        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void f(int i, float f, int i2) {
        }
    }

    static class m implements Comparator<View> {
        m() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.a;
            if (z != layoutParams2.a) {
                return z ? 1 : -1;
            }
            return layoutParams.e - layoutParams2.e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        m();
    }

    private void f(boolean z2) {
        boolean z3 = this.i0 == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.s.isFinished()) {
                this.s.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.s.getCurrX();
                int currY = this.s.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        r(currX);
                    }
                }
            }
        }
        this.E = false;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            f fVar = this.b.get(i2);
            if (fVar.c) {
                fVar.c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z2) {
            Runnable runnable = this.h0;
            int i3 = q4.g;
            int i4 = Build.VERSION.SDK_INT;
            postOnAnimation(runnable);
            return;
        }
        this.h0.run();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h(int i2) {
        i iVar = this.e0;
        if (iVar != null) {
            iVar.g(i2);
        }
        List<i> list = this.d0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar2 = this.d0.get(i3);
                if (iVar2 != null) {
                    iVar2.g(i2);
                }
            }
        }
        i iVar3 = this.f0;
        if (iVar3 != null) {
            iVar3.g(i2);
        }
    }

    private Rect i(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private f k() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f3 = clientWidth > 0 ? ((float) this.v) / ((float) clientWidth) : 0.0f;
        f fVar = null;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        while (i4 < this.b.size()) {
            f fVar2 = this.b.get(i4);
            if (!z2 && fVar2.b != (i2 = i3 + 1)) {
                fVar2 = this.c;
                fVar2.e = f2 + f4 + f3;
                fVar2.b = i2;
                fVar2.d = this.n.g(i2);
                i4--;
            }
            f2 = fVar2.e;
            float f5 = fVar2.d + f2 + f3;
            if (!z2 && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i4 == this.b.size() - 1) {
                return fVar2;
            }
            i3 = fVar2.b;
            f4 = fVar2.d;
            i4++;
            fVar = fVar2;
            z2 = false;
        }
        return fVar;
    }

    private void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.P) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.L = motionEvent.getX(i2);
            this.P = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.Q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean r(int i2) {
        if (this.b.size() != 0) {
            f k2 = k();
            int clientWidth = getClientWidth();
            int i3 = this.v;
            int i4 = clientWidth + i3;
            float f2 = (float) clientWidth;
            int i5 = k2.b;
            float f3 = ((((float) i2) / f2) - k2.e) / (k2.d + (((float) i3) / f2));
            this.b0 = false;
            n(i5, f3, (int) (((float) i4) * f3));
            if (this.b0) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.a0) {
            return false;
        } else {
            this.b0 = false;
            n(0, 0.0f, 0);
            if (this.b0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private boolean s(float f2) {
        boolean z2;
        boolean z3;
        float f3 = this.L - f2;
        this.L = f2;
        float scrollX = ((float) getScrollX()) + f3;
        float clientWidth = (float) getClientWidth();
        float f4 = this.z * clientWidth;
        float f5 = this.A * clientWidth;
        boolean z4 = false;
        f fVar = this.b.get(0);
        ArrayList<f> arrayList = this.b;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.b != 0) {
            f4 = fVar.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (fVar2.b != this.n.d() - 1) {
            f5 = fVar2.e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f4) {
            if (z2) {
                this.V.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z3) {
                this.W.onPull(Math.abs(scrollX - f5) / clientWidth);
                z4 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.L = (scrollX - ((float) i2)) + this.L;
        scrollTo(i2, getScrollY());
        r(i2);
        return z4;
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.D != z2) {
            this.D = z2;
        }
    }

    private void u(int i2, int i3, int i4, int i5) {
        if (i3 <= 0 || this.b.isEmpty()) {
            f l2 = l(this.o);
            int min = (int) ((l2 != null ? Math.min(l2.e, this.A) : 0.0f) * ((float) ((i2 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                f(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.s.isFinished()) {
            this.s.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + i5))) * ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))), getScrollY());
        }
    }

    private void x(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    private boolean y() {
        this.P = -1;
        this.G = false;
        this.H = false;
        VelocityTracker velocityTracker = this.Q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.Q = null;
        }
        this.V.onRelease();
        this.W.onRelease();
        if (this.V.isFinished() || this.W.isFinished()) {
            return true;
        }
        return false;
    }

    private void z(int i2, boolean z2, int i3, boolean z3) {
        int i4;
        int i5;
        f l2 = l(i2);
        int max = l2 != null ? (int) (Math.max(this.z, Math.min(l2.e, this.A)) * ((float) getClientWidth())) : 0;
        if (z2) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.s;
                if (scroller != null && !scroller.isFinished()) {
                    i4 = this.t ? this.s.getCurrX() : this.s.getStartX();
                    this.s.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    i4 = getScrollX();
                }
                int scrollY = getScrollY();
                int i6 = max - i4;
                int i7 = 0 - scrollY;
                if (i6 == 0 && i7 == 0) {
                    f(false);
                    t(this.o);
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i8 = clientWidth / 2;
                    float f2 = (float) clientWidth;
                    float f3 = (float) i8;
                    float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) Math.abs(i6)) * 1.0f) / f2) - 0.5f) * 0.47123894f))) * f3) + f3;
                    int abs = Math.abs(i3);
                    if (abs > 0) {
                        i5 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
                    } else {
                        i5 = (int) (((((float) Math.abs(i6)) / ((this.n.g(this.o) * f2) + ((float) this.v))) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(i5, 600);
                    this.t = false;
                    this.s.startScroll(i4, scrollY, i6, i7, min);
                    int i9 = q4.g;
                    int i10 = Build.VERSION.SDK_INT;
                    postInvalidateOnAnimation();
                }
            }
            if (z3) {
                h(i2);
                return;
            }
            return;
        }
        if (z3) {
            h(i2);
        }
        f(false);
        scrollTo(max, 0);
        r(max);
    }

    public void A(int i2, boolean z2) {
        this.E = false;
        B(i2, z2, false, 0);
    }

    /* access modifiers changed from: package-private */
    public void B(int i2, boolean z2, boolean z3, int i3) {
        a aVar = this.n;
        boolean z4 = false;
        if (aVar == null || aVar.d() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.o != i2 || this.b.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.n.d()) {
                i2 = this.n.d() - 1;
            }
            int i4 = this.F;
            int i5 = this.o;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.b.size(); i6++) {
                    this.b.get(i6).c = true;
                }
            }
            if (this.o != i2) {
                z4 = true;
            }
            if (this.a0) {
                this.o = i2;
                if (z4) {
                    h(i2);
                }
                requestLayout();
                return;
            }
            t(i2);
            z(i2, z2, i3, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* access modifiers changed from: package-private */
    public i C(i iVar) {
        i iVar2 = this.f0;
        this.f0 = iVar;
        return iVar2;
    }

    /* access modifiers changed from: package-private */
    public f a(int i2, int i3) {
        f fVar = new f();
        fVar.b = i2;
        fVar.a = this.n.h(this, i2);
        fVar.d = this.n.g(i2);
        if (i3 < 0 || i3 >= this.b.size()) {
            this.b.add(fVar);
        } else {
            this.b.add(i3, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f j2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (j2 = j(childAt)) != null && j2.b == this.o) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f j2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (j2 = j(childAt)) != null && j2.b == this.o) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z2 = layoutParams2.a | (view.getClass().getAnnotation(e.class) != null);
        layoutParams2.a = z2;
        if (!this.C) {
            super.addView(view, i2, layoutParams);
        } else if (!z2) {
            layoutParams2.d = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void b(h hVar) {
        if (this.g0 == null) {
            this.g0 = new ArrayList();
        }
        this.g0.add(hVar);
    }

    public void c(i iVar) {
        if (this.d0 == null) {
            this.d0 = new ArrayList();
        }
        this.d0.add(iVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.n == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i2 < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.z))) {
                return true;
            }
            return false;
        } else if (i2 <= 0 || scrollX >= ((int) (((float) clientWidth) * this.A))) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.t = true;
        if (this.s.isFinished() || !this.s.computeScrollOffset()) {
            f(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.s.getCurrX();
        int currY = this.s.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!r(currX)) {
                this.s.abortAnimation();
                scrollTo(0, currY);
            }
        }
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        postInvalidateOnAnimation();
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000a
            goto L_0x0063
        L_0x000a:
            if (r0 == 0) goto L_0x0064
            android.view.ViewParent r4 = r0.getParent()
        L_0x0010:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001d
            if (r4 != r6) goto L_0x0018
            r4 = 1
            goto L_0x001e
        L_0x0018:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0010
        L_0x001d:
            r4 = 0
        L_0x001e:
            if (r4 != 0) goto L_0x0064
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0034:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004d
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0034
        L_0x004d:
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.StringBuilder r0 = defpackage.je.V0(r0)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
        L_0x0063:
            r0 = r3
        L_0x0064:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00b5
            if (r3 == r0) goto L_0x00b5
            if (r7 != r5) goto L_0x0095
            android.graphics.Rect r1 = r6.f
            android.graphics.Rect r1 = r6.i(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f
            android.graphics.Rect r2 = r6.i(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x008f
            if (r1 < r2) goto L_0x008f
            boolean r0 = r6.p()
            goto L_0x0093
        L_0x008f:
            boolean r0 = r3.requestFocus()
        L_0x0093:
            r2 = r0
            goto L_0x00c8
        L_0x0095:
            if (r7 != r4) goto L_0x00c8
            android.graphics.Rect r1 = r6.f
            android.graphics.Rect r1 = r6.i(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f
            android.graphics.Rect r2 = r6.i(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x00b0
            if (r1 > r2) goto L_0x00b0
            boolean r0 = r6.q()
            goto L_0x0093
        L_0x00b0:
            boolean r0 = r3.requestFocus()
            goto L_0x0093
        L_0x00b5:
            if (r7 == r5) goto L_0x00c4
            if (r7 != r1) goto L_0x00ba
            goto L_0x00c4
        L_0x00ba:
            if (r7 == r4) goto L_0x00bf
            r0 = 2
            if (r7 != r0) goto L_0x00c8
        L_0x00bf:
            boolean r2 = r6.q()
            goto L_0x00c8
        L_0x00c4:
            boolean r2 = r6.p()
        L_0x00c8:
            if (r2 == 0) goto L_0x00d1
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00d1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.d(int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x005d
            int r0 = r6.getAction()
            if (r0 != 0) goto L_0x005a
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L_0x0048
            r3 = 22
            if (r0 == r3) goto L_0x0036
            r3 = 61
            if (r0 == r3) goto L_0x0020
            goto L_0x005a
        L_0x0020:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L_0x002b
            boolean r6 = r5.d(r4)
            goto L_0x005b
        L_0x002b:
            boolean r6 = r6.hasModifiers(r2)
            if (r6 == 0) goto L_0x005a
            boolean r6 = r5.d(r2)
            goto L_0x005b
        L_0x0036:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0041
            boolean r6 = r5.q()
            goto L_0x005b
        L_0x0041:
            r6 = 66
            boolean r6 = r5.d(r6)
            goto L_0x005b
        L_0x0048:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0053
            boolean r6 = r5.p()
            goto L_0x005b
        L_0x0053:
            r6 = 17
            boolean r6 = r5.d(r6)
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            if (r6 == 0) goto L_0x005e
        L_0x005d:
            r1 = 1
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f j2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (j2 = j(childAt)) != null && j2.b == this.o && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z2 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.n) != null && aVar.d() > 1)) {
            if (!this.V.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) (getPaddingTop() + (-height)), this.z * ((float) width));
                this.V.setSize(height, width);
                z2 = false | this.V.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.W.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.A + 1.0f)) * ((float) width2));
                this.W.setSize(height2, width2);
                z2 |= this.W.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.V.finish();
            this.W.finish();
        }
        if (z2) {
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            postInvalidateOnAnimation();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.w;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public boolean e(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && e(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z2 || !view.canScrollHorizontally(-i2)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        int d2 = this.n.d();
        this.a = d2;
        boolean z2 = this.b.size() < (this.F * 2) + 1 && this.b.size() < d2;
        int i2 = this.o;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < this.b.size()) {
            f fVar = this.b.get(i3);
            int e2 = this.n.e(fVar.a);
            if (e2 != -1) {
                if (e2 == -2) {
                    this.b.remove(i3);
                    i3--;
                    if (!z3) {
                        this.n.p(this);
                        z3 = true;
                    }
                    this.n.b(this, fVar.b, fVar.a);
                    int i4 = this.o;
                    if (i4 == fVar.b) {
                        i2 = Math.max(0, Math.min(i4, d2 - 1));
                    }
                } else {
                    int i5 = fVar.b;
                    if (i5 != e2) {
                        if (i5 == this.o) {
                            i2 = e2;
                        }
                        fVar.b = e2;
                    }
                }
                z2 = true;
            }
            i3++;
        }
        if (z3) {
            this.n.c(this);
        }
        Collections.sort(this.b, k0);
        if (z2) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i6).getLayoutParams();
                if (!layoutParams.a) {
                    layoutParams.c = 0.0f;
                }
            }
            B(i2, false, true, 0);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        throw null;
    }

    public int getCurrentItem() {
        return this.o;
    }

    public int getOffscreenPageLimit() {
        return this.F;
    }

    public int getPageMargin() {
        return this.v;
    }

    /* access modifiers changed from: package-private */
    public f j(View view) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            f fVar = this.b.get(i2);
            if (this.n.i(view, fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public f l(int i2) {
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            f fVar = this.b.get(i3);
            if (fVar.b == i2) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.s = new Scroller(context, l0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.K = viewConfiguration.getScaledPagingTouchSlop();
        this.R = (int) (400.0f * f2);
        this.S = viewConfiguration.getScaledMaximumFlingVelocity();
        this.V = new EdgeEffect(context);
        this.W = new EdgeEffect(context);
        this.T = (int) (25.0f * f2);
        this.U = (int) (2.0f * f2);
        this.I = (int) (f2 * 16.0f);
        q4.I(this, new g());
        if (q4.n(this) == 0) {
            q4.O(this, 1);
        }
        q4.P(this, new d());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.c0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            androidx.viewpager.widget.ViewPager$i r0 = r12.e0
            if (r0 == 0) goto L_0x0072
            r0.f(r13, r14, r15)
        L_0x0072:
            java.util.List<androidx.viewpager.widget.ViewPager$i> r0 = r12.d0
            if (r0 == 0) goto L_0x008c
            int r0 = r0.size()
        L_0x007a:
            if (r1 >= r0) goto L_0x008c
            java.util.List<androidx.viewpager.widget.ViewPager$i> r3 = r12.d0
            java.lang.Object r3 = r3.get(r1)
            androidx.viewpager.widget.ViewPager$i r3 = (androidx.viewpager.widget.ViewPager.i) r3
            if (r3 == 0) goto L_0x0089
            r3.f(r13, r14, r15)
        L_0x0089:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x008c:
            androidx.viewpager.widget.ViewPager$i r0 = r12.f0
            if (r0 == 0) goto L_0x0093
            r0.f(r13, r14, r15)
        L_0x0093:
            r12.b0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.n(int, float, int):void");
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a0 = true;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.h0);
        Scroller scroller = this.s;
        if (scroller != null && !scroller.isFinished()) {
            this.s.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.v > 0 && this.w != null && this.b.size() > 0 && this.n != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f4 = (float) width;
            float f5 = ((float) this.v) / f4;
            int i3 = 0;
            f fVar = this.b.get(0);
            float f6 = fVar.e;
            int size = this.b.size();
            int i4 = fVar.b;
            int i5 = this.b.get(size - 1).b;
            while (i4 < i5) {
                while (true) {
                    i2 = fVar.b;
                    if (i4 <= i2 || i3 >= size) {
                        break;
                    }
                    i3++;
                    fVar = this.b.get(i3);
                }
                if (i4 == i2) {
                    float f7 = fVar.e;
                    float f8 = fVar.d;
                    f2 = (f7 + f8) * f4;
                    f6 = f7 + f8 + f5;
                } else {
                    float g2 = this.n.g(i4);
                    f2 = (f6 + g2) * f4;
                    f6 = g2 + f5 + f6;
                }
                if (((float) this.v) + f2 > ((float) scrollX)) {
                    f3 = f5;
                    this.w.setBounds(Math.round(f2), this.x, Math.round(((float) this.v) + f2), this.y);
                    this.w.draw(canvas);
                } else {
                    f3 = f5;
                }
                if (f2 <= ((float) (scrollX + width))) {
                    i4++;
                    f5 = f3;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & BitmapRenderer.ALPHA_VISIBLE;
        if (action == 3 || action == 1) {
            y();
            return false;
        }
        if (action != 0) {
            if (this.G) {
                return true;
            }
            if (this.H) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent.getX();
            this.N = x2;
            this.L = x2;
            float y2 = motionEvent.getY();
            this.O = y2;
            this.M = y2;
            this.P = motionEvent.getPointerId(0);
            this.H = false;
            this.t = true;
            this.s.computeScrollOffset();
            if (this.i0 != 2 || Math.abs(this.s.getFinalX() - this.s.getCurrX()) <= this.U) {
                f(false);
                this.G = false;
            } else {
                this.s.abortAnimation();
                this.E = false;
                t(this.o);
                this.G = true;
                x(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.P;
            if (i2 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float x3 = motionEvent.getX(findPointerIndex);
                float f2 = x3 - this.L;
                float abs = Math.abs(f2);
                float y3 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y3 - this.O);
                if (f2 != 0.0f) {
                    float f3 = this.L;
                    if (!((f3 < ((float) this.J) && f2 > 0.0f) || (f3 > ((float) (getWidth() - this.J)) && f2 < 0.0f)) && e(this, false, (int) f2, (int) x3, (int) y3)) {
                        this.L = x3;
                        this.M = y3;
                        this.H = true;
                        return false;
                    }
                }
                int i3 = this.K;
                if (abs > ((float) i3) && abs * 0.5f > abs2) {
                    this.G = true;
                    x(true);
                    setScrollState(1);
                    this.L = f2 > 0.0f ? this.N + ((float) this.K) : this.N - ((float) this.K);
                    this.M = y3;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i3)) {
                    this.H = true;
                }
                if (this.G && s(x3)) {
                    int i4 = q4.g;
                    int i5 = Build.VERSION.SDK_INT;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            o(motionEvent);
        }
        if (this.Q == null) {
            this.Q = VelocityTracker.obtain();
        }
        this.Q.addMovement(motionEvent);
        return this.G;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        f j2;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = childCount - 1;
            i3 = -1;
        }
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (j2 = j(childAt)) != null && j2.b == this.o && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i4 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.a());
        a aVar = this.n;
        if (aVar != null) {
            aVar.l(kVar.f, kVar.n);
            B(kVar.c, false, true, 0);
            return;
        }
        this.p = kVar.c;
        this.q = kVar.f;
        this.r = kVar.n;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.c = this.o;
        a aVar = this.n;
        if (aVar != null) {
            kVar.f = aVar.m();
        }
        return kVar;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.v;
            u(i2, i4, i6, i6);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        boolean z2 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.n) == null || aVar.d() == 0) {
            return false;
        }
        if (this.Q == null) {
            this.Q = VelocityTracker.obtain();
        }
        this.Q.addMovement(motionEvent);
        int action = motionEvent.getAction() & BitmapRenderer.ALPHA_VISIBLE;
        if (action == 0) {
            this.s.abortAnimation();
            this.E = false;
            t(this.o);
            float x2 = motionEvent.getX();
            this.N = x2;
            this.L = x2;
            float y2 = motionEvent.getY();
            this.O = y2;
            this.M = y2;
            this.P = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.G) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.P);
                    if (findPointerIndex == -1) {
                        z2 = y();
                    } else {
                        float x3 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x3 - this.L);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y3 - this.M);
                        if (abs > ((float) this.K) && abs > abs2) {
                            this.G = true;
                            x(true);
                            float f2 = this.N;
                            this.L = x3 - f2 > 0.0f ? f2 + ((float) this.K) : f2 - ((float) this.K);
                            this.M = y3;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.G) {
                    z2 = false | s(motionEvent.getX(motionEvent.findPointerIndex(this.P)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.L = motionEvent.getX(actionIndex);
                    this.P = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    o(motionEvent);
                    this.L = motionEvent.getX(motionEvent.findPointerIndex(this.P));
                }
            } else if (this.G) {
                z(this.o, true, 0, false);
                z2 = y();
            }
        } else if (this.G) {
            VelocityTracker velocityTracker = this.Q;
            velocityTracker.computeCurrentVelocity(Constants.ONE_SECOND, (float) this.S);
            int xVelocity = (int) velocityTracker.getXVelocity(this.P);
            this.E = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f k2 = k();
            float f3 = (float) clientWidth;
            float f4 = ((float) this.v) / f3;
            int i2 = k2.b;
            float f5 = ((((float) scrollX) / f3) - k2.e) / (k2.d + f4);
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.P)) - this.N)) <= this.T || Math.abs(xVelocity) <= this.R) {
                i2 += (int) (f5 + (i2 >= this.o ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                i2++;
            }
            if (this.b.size() > 0) {
                ArrayList<f> arrayList = this.b;
                i2 = Math.max(this.b.get(0).b, Math.min(i2, arrayList.get(arrayList.size() - 1).b));
            }
            B(i2, true, true, xVelocity);
            z2 = y();
        }
        if (z2) {
            int i3 = q4.g;
            int i4 = Build.VERSION.SDK_INT;
            postInvalidateOnAnimation();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        int i2 = this.o;
        if (i2 <= 0) {
            return false;
        }
        A(i2 - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        a aVar = this.n;
        if (aVar == null || this.o >= aVar.d() - 1) {
            return false;
        }
        A(this.o + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.C) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(a aVar) {
        a aVar2 = this.n;
        if (aVar2 != null) {
            aVar2.o(null);
            this.n.p(this);
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                f fVar = this.b.get(i2);
                this.n.b(this, fVar.b, fVar.a);
            }
            this.n.c(this);
            this.b.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i3).getLayoutParams()).a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.o = 0;
            scrollTo(0, 0);
        }
        a aVar3 = this.n;
        this.n = aVar;
        this.a = 0;
        if (aVar != null) {
            if (this.u == null) {
                this.u = new j();
            }
            this.n.o(this.u);
            this.E = false;
            boolean z2 = this.a0;
            this.a0 = true;
            this.a = this.n.d();
            if (this.p >= 0) {
                this.n.l(this.q, this.r);
                B(this.p, false, true, 0);
                this.p = -1;
                this.q = null;
                this.r = null;
            } else if (!z2) {
                t(this.o);
            } else {
                requestLayout();
            }
        }
        List<h> list = this.g0;
        if (!(list == null || list.isEmpty())) {
            int size = this.g0.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.g0.get(i4).b(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i2) {
        this.E = false;
        B(i2, !this.a0, false, 0);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            i2 = 1;
        }
        if (i2 != this.F) {
            this.F = i2;
            t(this.o);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.e0 = iVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.v;
        this.v = i2;
        int width = getWidth();
        u(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.w = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i2) {
        if (this.i0 != i2) {
            this.i0 = i2;
            i iVar = this.e0;
            if (iVar != null) {
                iVar.a(i2);
            }
            List<i> list = this.d0;
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    i iVar2 = this.d0.get(i3);
                    if (iVar2 != null) {
                        iVar2.a(i2);
                    }
                }
            }
            i iVar3 = this.f0;
            if (iVar3 != null) {
                iVar3.a(i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r5 == r6) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t(int r15) {
        /*
        // Method dump skipped, instructions count: 918
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.t(int):void");
    }

    public void v(h hVar) {
        List<h> list = this.g0;
        if (list != null) {
            list.remove(hVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.w;
    }

    public void w(i iVar) {
        List<i> list = this.d0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        float c = 0.0f;
        boolean d;
        int e;
        int f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.j0);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(androidx.core.content.a.d(getContext(), i2));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m();
    }
}
