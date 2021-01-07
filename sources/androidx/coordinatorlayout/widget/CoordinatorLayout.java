package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.music.C0707R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements i4, j4 {
    static final String D;
    static final Class<?>[] E = {Context.class, AttributeSet.class};
    static final ThreadLocal<Map<String, Constructor<Behavior>>> F = new ThreadLocal<>();
    static final Comparator<View> G;
    private static final w3<Rect> H = new x3(12);
    ViewGroup.OnHierarchyChangeListener A;
    private m4 B;
    private final l4 C;
    private final List<View> a;
    private final a<View> b;
    private final List<View> c;
    private final List<View> f;
    private Paint n;
    private final int[] o;
    private final int[] p;
    private boolean q;
    private boolean r;
    private int[] s;
    private View t;
    private View u;
    private f v;
    private boolean w;
    private b5 x;
    private boolean y;
    private Drawable z;

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public static Object getTag(View view) {
            return ((e) view.getLayoutParams()).r;
        }

        public static void setTag(View view, Object obj) {
            ((e) view.getLayoutParams()).r = obj;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v) {
            return getScrimOpacity(coordinatorLayout, v) > 0.0f;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public b5 onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v, b5 b5Var) {
            return b5Var;
        }

        public void onAttachedToLayoutParams(e eVar) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements m4 {
        a() {
        }

        @Override // defpackage.m4
        public b5 onApplyWindowInsets(View view, b5 b5Var) {
            return CoordinatorLayout.this.x(b5Var);
        }
    }

    public interface b {
        Behavior getBehavior();
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
        Class<? extends Behavior> value();
    }

    private class d implements ViewGroup.OnHierarchyChangeListener {
        d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.A;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.p(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.A;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.p(0);
            return true;
        }
    }

    static class h implements Comparator<View> {
        h() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            float u = q4.u(view);
            float u2 = q4.u(view2);
            if (u > u2) {
                return -1;
            }
            return u < u2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        D = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            G = new h();
        } else {
            G = null;
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.coordinatorLayoutStyle);
    }

    private static Rect a() {
        Rect a2 = H.a();
        return a2 == null ? new Rect() : a2;
    }

    private void c(e eVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    private void l(int i, Rect rect, Rect rect2, e eVar, int i2, int i3) {
        int i4;
        int i5;
        int i6 = eVar.c;
        if (i6 == 0) {
            i6 = 17;
        }
        int h2 = e2.h(i6, i);
        int i7 = eVar.d;
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        if ((i7 & 112) == 0) {
            i7 |= 48;
        }
        int h3 = e2.h(i7, i);
        int i8 = h2 & 7;
        int i9 = h2 & 112;
        int i10 = h3 & 7;
        int i11 = h3 & 112;
        if (i10 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i10 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i11 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i11 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i8 == 1) {
            i4 -= i2 / 2;
        } else if (i8 != 5) {
            i4 -= i2;
        }
        if (i9 == 16) {
            i5 -= i3 / 2;
        } else if (i9 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    private int m(int i) {
        int[] iArr = this.s;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    private boolean s(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.c;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = G;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            e eVar = (e) view.getLayoutParams();
            Behavior behavior = eVar.a;
            if (!(z2 || z3) || actionMasked == 0) {
                if (!z2 && behavior != null) {
                    if (i == 0) {
                        z2 = behavior.onInterceptTouchEvent(this, view, motionEvent);
                    } else if (i == 1) {
                        z2 = behavior.onTouchEvent(this, view, motionEvent);
                    }
                    if (z2) {
                        this.t = view;
                    }
                }
                boolean a2 = eVar.a();
                boolean e2 = eVar.e(this, view);
                z3 = e2 && !a2;
                if (e2 && !z3) {
                    break;
                }
            } else if (behavior != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    behavior.onInterceptTouchEvent(this, view, motionEvent2);
                } else if (i == 1) {
                    behavior.onTouchEvent(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r4 != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
        r3.l = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0100 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t() {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.t():void");
    }

    private void u(boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behavior = ((e) childAt.getLayoutParams()).a;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    behavior.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    behavior.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((e) getChildAt(i2).getLayoutParams()).h();
        }
        this.t = null;
        this.q = false;
    }

    private void v(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int i2 = eVar.i;
        if (i2 != i) {
            q4.z(view, i - i2);
            eVar.i = i;
        }
    }

    private void w(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int i2 = eVar.j;
        if (i2 != i) {
            q4.A(view, i - i2);
            eVar.j = i;
        }
    }

    private void y() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (q4.m(this)) {
                if (this.B == null) {
                    this.B = new a();
                }
                q4.P(this, this.B);
                setSystemUiVisibility(1280);
                return;
            }
            q4.P(this, null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        e eVar = (e) view.getLayoutParams();
        Behavior behavior = eVar.a;
        if (behavior != null) {
            float scrimOpacity = behavior.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.n == null) {
                    this.n = new Paint();
                }
                this.n.setColor(eVar.a.getScrimColor(this, view));
                Paint paint = this.n;
                int round = Math.round(scrimOpacity * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = BitmapRenderer.ALPHA_VISIBLE;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.n);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.z;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public void f(View view) {
        List f2 = this.b.f(view);
        if (!(f2 == null || f2.isEmpty())) {
            for (int i = 0; i < f2.size(); i++) {
                View view2 = (View) f2.get(i);
                Behavior behavior = ((e) view2.getLayoutParams()).a;
                if (behavior != null) {
                    behavior.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        t();
        return Collections.unmodifiableList(this.a);
    }

    public final b5 getLastWindowInsets() {
        return this.x;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.C.a();
    }

    public Drawable getStatusBarBackground() {
        return this.z;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* access modifiers changed from: package-private */
    public void h(View view, boolean z2, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            b.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> j(View view) {
        List<View> g2 = this.b.g(view);
        this.f.clear();
        if (g2 != null) {
            this.f.addAll(g2);
        }
        return this.f;
    }

    public List<View> k(View view) {
        List f2 = this.b.f(view);
        this.f.clear();
        if (f2 != null) {
            this.f.addAll(f2);
        }
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public e n(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.b) {
            if (view instanceof b) {
                Behavior behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                eVar.j(behavior);
                eVar.b = true;
            } else {
                c cVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    cVar = (c) cls.getAnnotation(c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        eVar.j((Behavior) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        StringBuilder V0 = je.V0("Default behavior class ");
                        V0.append(cVar.value().getName());
                        V0.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", V0.toString(), e2);
                    }
                }
                eVar.b = true;
            }
        }
        return eVar;
    }

    public boolean o(View view, int i, int i2) {
        Rect a2 = a();
        b.a(this, view, a2);
        try {
            return a2.contains(i, i2);
        } finally {
            a2.setEmpty();
            H.b(a2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(false);
        if (this.w) {
            if (this.v == null) {
                this.v = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.v);
        }
        if (this.x == null && q4.m(this)) {
            q4.F(this);
        }
        this.r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        if (this.w && this.v != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.v);
        }
        View view = this.u;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.r = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.y && this.z != null) {
            b5 b5Var = this.x;
            int j = b5Var != null ? b5Var.j() : 0;
            if (j > 0) {
                this.z.setBounds(0, 0, getWidth(), j);
                this.z.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u(true);
        }
        boolean s2 = s(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            u(true);
        }
        return s2;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        Behavior behavior;
        int o2 = q4.o(this);
        int size = this.a.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.a.get(i5);
            if (view.getVisibility() != 8 && ((behavior = ((e) view.getLayoutParams()).a) == null || !behavior.onLayoutChild(this, view, o2))) {
                q(view, o2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0165, code lost:
        if (r0.onMeasureChild(r30, r20, r8, r21, r23, 0) == false) goto L_0x0175;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0168  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
        // Method dump skipped, instructions count: 467
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f(0) && (behavior = eVar.a) != null) {
                    z3 |= behavior.onNestedFling(this, childAt, view, f2, f3, z2);
                }
            }
        }
        if (z3) {
            p(1);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public boolean onNestedPreFling(View view, float f2, float f3) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f(0) && (behavior = eVar.a) != null) {
                    z2 |= behavior.onNestedPreFling(this, childAt, view, f2, f3);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.p);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        SparseArray<Parcelable> sparseArray = gVar.c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = n(childAt).a;
            if (!(id == -1 || behavior == null || (parcelable2 = sparseArray.get(id)) == null)) {
                behavior.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        g gVar = new g(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((e) childAt.getLayoutParams()).a;
            if (!(id == -1 || behavior == null || (onSaveInstanceState = behavior.onSaveInstanceState(this, childAt)) == null)) {
                sparseArray.append(id, onSaveInstanceState);
            }
        }
        gVar.c = sparseArray;
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.t
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.s(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.t
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.t
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            android.view.View r7 = r0.t
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.u(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public final void p(int i) {
        int i2;
        Rect rect;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        Rect rect2;
        int i10;
        int i11;
        int i12;
        e eVar;
        Behavior behavior;
        int o2 = q4.o(this);
        int size = this.a.size();
        Rect a2 = a();
        Rect a3 = a();
        Rect a4 = a();
        int i13 = 0;
        while (i13 < size) {
            View view = this.a.get(i13);
            e eVar2 = (e) view.getLayoutParams();
            if (i == 0 && view.getVisibility() == 8) {
                i3 = size;
                rect = a4;
                i2 = i13;
            } else {
                int i14 = 0;
                while (i14 < i13) {
                    if (eVar2.l == this.a.get(i14)) {
                        e eVar3 = (e) view.getLayoutParams();
                        if (eVar3.k != null) {
                            Rect a5 = a();
                            Rect a6 = a();
                            Rect a7 = a();
                            b.a(this, eVar3.k, a5);
                            h(view, false, a6);
                            int measuredWidth = view.getMeasuredWidth();
                            i12 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            i11 = i13;
                            i10 = i14;
                            rect2 = a4;
                            eVar = eVar2;
                            l(o2, a5, a7, eVar3, measuredWidth, measuredHeight);
                            boolean z5 = (a7.left == a6.left && a7.top == a6.top) ? false : true;
                            c(eVar3, a7, measuredWidth, measuredHeight);
                            int i15 = a7.left - a6.left;
                            int i16 = a7.top - a6.top;
                            if (i15 != 0) {
                                q4.z(view, i15);
                            }
                            if (i16 != 0) {
                                q4.A(view, i16);
                            }
                            if (z5 && (behavior = eVar3.a) != null) {
                                behavior.onDependentViewChanged(this, view, eVar3.k);
                            }
                            a5.setEmpty();
                            w3<Rect> w3Var = H;
                            w3Var.b(a5);
                            a6.setEmpty();
                            w3Var.b(a6);
                            a7.setEmpty();
                            w3Var.b(a7);
                            i14 = i10 + 1;
                            eVar2 = eVar;
                            size = i12;
                            i13 = i11;
                            a4 = rect2;
                        }
                    }
                    i10 = i14;
                    i12 = size;
                    rect2 = a4;
                    i11 = i13;
                    eVar = eVar2;
                    i14 = i10 + 1;
                    eVar2 = eVar;
                    size = i12;
                    i13 = i11;
                    a4 = rect2;
                }
                i2 = i13;
                h(view, true, a3);
                if (eVar2.g != 0 && !a3.isEmpty()) {
                    int h2 = e2.h(eVar2.g, o2);
                    int i17 = h2 & 112;
                    if (i17 == 48) {
                        a2.top = Math.max(a2.top, a3.bottom);
                    } else if (i17 == 80) {
                        a2.bottom = Math.max(a2.bottom, getHeight() - a3.top);
                    }
                    int i18 = h2 & 7;
                    if (i18 == 3) {
                        a2.left = Math.max(a2.left, a3.right);
                    } else if (i18 == 5) {
                        a2.right = Math.max(a2.right, getWidth() - a3.left);
                    }
                }
                if (eVar2.h != 0 && view.getVisibility() == 0 && q4.w(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    e eVar4 = (e) view.getLayoutParams();
                    Behavior behavior2 = eVar4.a;
                    Rect a8 = a();
                    Rect a9 = a();
                    a9.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (behavior2 == null || !behavior2.getInsetDodgeRect(this, view, a8)) {
                        a8.set(a9);
                    } else if (!a9.contains(a8)) {
                        StringBuilder V0 = je.V0("Rect should be within the child's bounds. Rect:");
                        V0.append(a8.toShortString());
                        V0.append(" | Bounds:");
                        V0.append(a9.toShortString());
                        throw new IllegalArgumentException(V0.toString());
                    }
                    a9.setEmpty();
                    w3<Rect> w3Var2 = H;
                    w3Var2.b(a9);
                    if (a8.isEmpty()) {
                        a8.setEmpty();
                        w3Var2.b(a8);
                    } else {
                        int h3 = e2.h(eVar4.h, o2);
                        if ((h3 & 48) != 48 || (i8 = (a8.top - ((ViewGroup.MarginLayoutParams) eVar4).topMargin) - eVar4.j) >= (i9 = a2.top)) {
                            z3 = false;
                        } else {
                            w(view, i9 - i8);
                            z3 = true;
                        }
                        if ((h3 & 80) == 80 && (height = ((getHeight() - a8.bottom) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin) + eVar4.j) < (i7 = a2.bottom)) {
                            w(view, height - i7);
                            z3 = true;
                        }
                        if (!z3) {
                            w(view, 0);
                        }
                        if ((h3 & 3) != 3 || (i5 = (a8.left - ((ViewGroup.MarginLayoutParams) eVar4).leftMargin) - eVar4.i) >= (i6 = a2.left)) {
                            z4 = false;
                        } else {
                            v(view, i6 - i5);
                            z4 = true;
                        }
                        if ((h3 & 5) == 5 && (width = ((getWidth() - a8.right) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin) + eVar4.i) < (i4 = a2.right)) {
                            v(view, width - i4);
                            z4 = true;
                        }
                        if (!z4) {
                            v(view, 0);
                        }
                        a8.setEmpty();
                        w3Var2.b(a8);
                    }
                }
                if (i != 2) {
                    rect = a4;
                    rect.set(((e) view.getLayoutParams()).q);
                    if (rect.equals(a3)) {
                        i3 = size;
                    } else {
                        ((e) view.getLayoutParams()).q.set(a3);
                    }
                } else {
                    rect = a4;
                }
                i3 = size;
                for (int i19 = i2 + 1; i19 < i3; i19++) {
                    View view2 = this.a.get(i19);
                    e eVar5 = (e) view2.getLayoutParams();
                    Behavior behavior3 = eVar5.a;
                    if (behavior3 != null && behavior3.layoutDependsOn(this, view2, view)) {
                        if (i != 0 || !eVar5.d()) {
                            if (i != 2) {
                                z2 = behavior3.onDependentViewChanged(this, view2, view);
                            } else {
                                behavior3.onDependentViewRemoved(this, view2, view);
                                z2 = true;
                            }
                            if (i == 1) {
                                eVar5.k(z2);
                            }
                        } else {
                            eVar5.g();
                        }
                    }
                }
            }
            i13 = i2 + 1;
            size = i3;
            a4 = rect;
        }
        a2.setEmpty();
        w3<Rect> w3Var3 = H;
        w3Var3.b(a2);
        a3.setEmpty();
        w3Var3.b(a3);
        a4.setEmpty();
        w3Var3.b(a4);
    }

    public void q(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.k;
        int i2 = 0;
        if (view2 == null && eVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            Rect a2 = a();
            Rect a3 = a();
            try {
                b.a(this, view2, a2);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, a2, a3, eVar2, measuredWidth, measuredHeight);
                c(eVar2, a3, measuredWidth, measuredHeight);
                view.layout(a3.left, a3.top, a3.right, a3.bottom);
            } finally {
                a2.setEmpty();
                w3<Rect> w3Var = H;
                w3Var.b(a2);
                a3.setEmpty();
                w3Var.b(a3);
            }
        } else {
            int i3 = eVar.e;
            if (i3 >= 0) {
                e eVar3 = (e) view.getLayoutParams();
                int i4 = eVar3.c;
                if (i4 == 0) {
                    i4 = 8388661;
                }
                int h2 = e2.h(i4, i);
                int i5 = h2 & 7;
                int i6 = h2 & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i3 = width - i3;
                }
                int m = m(i3) - measuredWidth2;
                if (i5 == 1) {
                    m += measuredWidth2 / 2;
                } else if (i5 == 5) {
                    m += measuredWidth2;
                }
                if (i6 == 16) {
                    i2 = 0 + (measuredHeight2 / 2);
                } else if (i6 == 80) {
                    i2 = measuredHeight2 + 0;
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, Math.min(m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            e eVar4 = (e) view.getLayoutParams();
            Rect a4 = a();
            a4.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin);
            if (this.x != null && q4.m(this) && !q4.m(view)) {
                a4.left = this.x.h() + a4.left;
                a4.top = this.x.j() + a4.top;
                a4.right -= this.x.i();
                a4.bottom -= this.x.g();
            }
            Rect a5 = a();
            int i7 = eVar4.c;
            if ((i7 & 7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            int measuredWidth3 = view.getMeasuredWidth();
            int measuredHeight3 = view.getMeasuredHeight();
            if (Build.VERSION.SDK_INT >= 17) {
                Gravity.apply(i7, measuredWidth3, measuredHeight3, a4, a5, i);
            } else {
                Gravity.apply(i7, measuredWidth3, measuredHeight3, a4, a5);
            }
            view.layout(a5.left, a5.top, a5.right, a5.bottom);
            a4.setEmpty();
            w3<Rect> w3Var2 = H;
            w3Var2.b(a4);
            a5.setEmpty();
            w3Var2.b(a5);
        }
    }

    public void r(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        Behavior behavior = ((e) view.getLayoutParams()).a;
        if (behavior == null || !behavior.onRequestChildRectangleOnScreen(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2 && !this.q) {
            u(false);
            this.q = true;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.z;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.z = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.z.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.g(this.z, q4.o(this));
                this.z.setVisible(getVisibility() == 0, false);
                this.z.setCallback(this);
            }
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? androidx.core.content.a.d(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.z;
        if (drawable != null && drawable.isVisible() != z2) {
            this.z.setVisible(z2, false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.z;
    }

    /* access modifiers changed from: package-private */
    public final b5 x(b5 b5Var) {
        Behavior behavior;
        if (!e2.g(this.x, b5Var)) {
            this.x = b5Var;
            boolean z2 = true;
            boolean z3 = b5Var != null && b5Var.j() > 0;
            this.y = z3;
            if (z3 || getBackground() != null) {
                z2 = false;
            }
            setWillNotDraw(z2);
            if (!b5Var.n()) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (q4.m(childAt) && (behavior = ((e) childAt.getLayoutParams()).a) != null) {
                        b5Var = behavior.onApplyWindowInsets(this, childAt, b5Var);
                        if (b5Var.n()) {
                            break;
                        }
                    }
                }
            }
            requestLayout();
        }
        return b5Var;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        int[] iArr = d2.a;
        this.a = new ArrayList();
        this.b = new a<>();
        this.c = new ArrayList();
        this.f = new ArrayList();
        this.o = new int[2];
        this.p = new int[2];
        this.C = new l4();
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, iArr, 0, C0707R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, 0, C0707R.style.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, 0);
            }
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.s = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.s.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = this.s;
                iArr2[i2] = (int) (((float) iArr2[i2]) * f2);
            }
        }
        this.z = typedArray.getDrawable(1);
        typedArray.recycle();
        y();
        super.setOnHierarchyChangeListener(new d());
        if (q4.n(this) == 0) {
            q4.O(this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // defpackage.i4
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        Behavior behavior;
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f(i3) && (behavior = eVar.a) != null) {
                    int[] iArr2 = this.o;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.o;
                    if (i > 0) {
                        i4 = Math.max(i6, iArr3[0]);
                    } else {
                        i4 = Math.min(i6, iArr3[0]);
                    }
                    i6 = i4;
                    int[] iArr4 = this.o;
                    if (i2 > 0) {
                        i5 = Math.max(i7, iArr4[1]);
                    } else {
                        i5 = Math.min(i7, iArr4[1]);
                    }
                    i7 = i5;
                    z2 = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z2) {
            p(1);
        }
    }

    @Override // defpackage.i4
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.p);
    }

    @Override // defpackage.i4
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        Behavior behavior;
        this.C.b(i, i2);
        this.u = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.f(i2) && (behavior = eVar.a) != null) {
                behavior.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // defpackage.i4
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                Behavior behavior = eVar.a;
                if (behavior != null) {
                    boolean onStartNestedScroll = behavior.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z2 |= onStartNestedScroll;
                    eVar.l(i2, onStartNestedScroll);
                } else {
                    eVar.l(i2, false);
                }
            }
        }
        return z2;
    }

    @Override // defpackage.i4
    public void onStopNestedScroll(View view, int i) {
        this.C.d(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.f(i)) {
                Behavior behavior = eVar.a;
                if (behavior != null) {
                    behavior.onStopNestedScroll(this, childAt, view, i);
                }
                eVar.l(i, false);
                eVar.g();
            }
        }
        this.u = null;
    }

    @Override // defpackage.j4
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Behavior behavior;
        int i6;
        int i7;
        int childCount = getChildCount();
        boolean z2 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f(i5) && (behavior = eVar.a) != null) {
                    int[] iArr2 = this.o;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.o;
                    if (i3 > 0) {
                        i6 = Math.max(i8, iArr3[0]);
                    } else {
                        i6 = Math.min(i8, iArr3[0]);
                    }
                    i8 = i6;
                    if (i4 > 0) {
                        i7 = Math.max(i9, this.o[1]);
                    } else {
                        i7 = Math.min(i9, this.o[1]);
                    }
                    i9 = i7;
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z2) {
            p(1);
        }
    }

    /* access modifiers changed from: protected */
    public static class g extends l5 {
        public static final Parcelable.Creator<g> CREATOR = new a();
        SparseArray<Parcelable> c;

        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new g[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.c = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.c.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // defpackage.l5, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.c.keyAt(i2);
                parcelableArr[i2] = this.c.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        Behavior a;
        boolean b = false;
        public int c = 0;
        public int d = 0;
        public int e = -1;
        int f = -1;
        public int g = 0;
        public int h = 0;
        int i;
        int j;
        View k;
        View l;
        private boolean m;
        private boolean n;
        private boolean o;
        private boolean p;
        final Rect q = new Rect();
        Object r;

        public e(int i2, int i3) {
            super(i2, i3);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            if (this.a == null) {
                this.m = false;
            }
            return this.m;
        }

        public int b() {
            return this.f;
        }

        public Behavior c() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            return this.p;
        }

        /* access modifiers changed from: package-private */
        public boolean e(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.m;
            if (z) {
                return true;
            }
            Behavior behavior = this.a;
            boolean blocksInteractionBelow = (behavior != null ? behavior.blocksInteractionBelow(coordinatorLayout, view) : false) | z;
            this.m = blocksInteractionBelow;
            return blocksInteractionBelow;
        }

        /* access modifiers changed from: package-private */
        public boolean f(int i2) {
            if (i2 == 0) {
                return this.n;
            }
            if (i2 != 1) {
                return false;
            }
            return this.o;
        }

        /* access modifiers changed from: package-private */
        public void g() {
            this.p = false;
        }

        /* access modifiers changed from: package-private */
        public void h() {
            this.m = false;
        }

        public void i(int i2) {
            this.l = null;
            this.k = null;
            this.f = i2;
        }

        public void j(Behavior behavior) {
            Behavior behavior2 = this.a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.onDetachedFromLayoutParams();
                }
                this.a = behavior;
                this.r = null;
                this.b = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void k(boolean z) {
            this.p = z;
        }

        /* access modifiers changed from: package-private */
        public void l(int i2, boolean z) {
            if (i2 == 0) {
                this.n = z;
            } else if (i2 == 1) {
                this.o = z;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v12, resolved type: java.lang.Class<?> */
        /* JADX WARN: Multi-variable type inference failed */
        e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Behavior behavior;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d2.b);
            this.c = obtainStyledAttributes.getInteger(0, 0);
            this.f = obtainStyledAttributes.getResourceId(1, -1);
            this.d = obtainStyledAttributes.getInteger(2, 0);
            this.e = obtainStyledAttributes.getInteger(6, -1);
            this.g = obtainStyledAttributes.getInt(5, 0);
            this.h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.D;
                if (TextUtils.isEmpty(string)) {
                    behavior = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.D;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = CoordinatorLayout.F;
                        Map<String, Constructor<Behavior>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<Behavior> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.E);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        behavior = constructor.newInstance(context, attributeSet);
                    } catch (Exception e2) {
                        throw new RuntimeException(je.x0("Could not inflate Behavior subclass ", string), e2);
                    }
                }
                this.a = behavior;
            }
            obtainStyledAttributes.recycle();
            Behavior behavior2 = this.a;
            if (behavior2 != null) {
                behavior2.onAttachedToLayoutParams(this);
            }
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
