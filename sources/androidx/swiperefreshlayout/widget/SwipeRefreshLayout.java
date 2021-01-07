package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

public class SwipeRefreshLayout extends ViewGroup implements k4, g4 {
    private static final String S = SwipeRefreshLayout.class.getSimpleName();
    private static final int[] T = {16842766};
    private final DecelerateInterpolator A;
    a B;
    private int C = -1;
    protected int D;
    protected int E;
    int F;
    int G;
    d H;
    private Animation I;
    private Animation J;
    private Animation K;
    private Animation L;
    boolean M;
    private int N;
    private g O;
    private Animation.AnimationListener P = new a();
    private final Animation Q = new e();
    private final Animation R = new f();
    private View a;
    h b;
    boolean c = false;
    private int f;
    private float n = -1.0f;
    private float o;
    private final l4 p;
    private final h4 q;
    private final int[] r = new int[2];
    private final int[] s = new int[2];
    private boolean t;
    private int u;
    int v;
    private float w;
    private float x;
    private boolean y;
    private int z = -1;

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            h hVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.c) {
                swipeRefreshLayout.H.setAlpha(BitmapRenderer.ALPHA_VISIBLE);
                SwipeRefreshLayout.this.H.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.M && (hVar = swipeRefreshLayout2.b) != null) {
                    hVar.a();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.v = swipeRefreshLayout3.B.getTop();
                return;
            }
            swipeRefreshLayout.h();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends Animation {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            d dVar = SwipeRefreshLayout.this.H;
            int i = this.a;
            dVar.setAlpha((int) ((((float) (this.b - i)) * f) + ((float) i)));
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements Animation.AnimationListener {
        d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout.this.getClass();
            SwipeRefreshLayout.this.l(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class e extends Animation {
        e() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.getClass();
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int abs = swipeRefreshLayout.F - Math.abs(swipeRefreshLayout.E);
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i = swipeRefreshLayout2.D;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i + ((int) (((float) (abs - i)) * f))) - swipeRefreshLayout2.B.getTop());
            SwipeRefreshLayout.this.H.c(1.0f - f);
        }
    }

    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.f(f);
        }
    }

    public interface g {
        boolean a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    public interface h {
        void a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = ViewConfiguration.get(context).getScaledTouchSlop();
        this.u = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.A = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.N = (int) (displayMetrics.density * 40.0f);
        this.B = new a(getContext(), -328966);
        d dVar = new d(getContext());
        this.H = dVar;
        dVar.h(1);
        this.B.setImageDrawable(this.H);
        this.B.setVisibility(8);
        addView(this.B);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.F = i;
        this.n = (float) i;
        this.p = new l4();
        this.q = new h4(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.N;
        this.v = i2;
        this.E = i2;
        f(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void b() {
        if (this.a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.B)) {
                    this.a = childAt;
                    return;
                }
            }
        }
    }

    private void c(float f2) {
        if (f2 > this.n) {
            i(true, true);
            return;
        }
        this.c = false;
        this.H.g(0.0f, 0.0f);
        d dVar = new d();
        this.D = this.v;
        this.R.reset();
        this.R.setDuration(200);
        this.R.setInterpolator(this.A);
        if (dVar != null) {
            this.B.a(dVar);
        }
        this.B.clearAnimation();
        this.B.startAnimation(this.R);
        this.H.b(false);
    }

    private boolean d(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    private void e(float f2) {
        this.H.b(true);
        float min = Math.min(1.0f, Math.abs(f2 / this.n));
        double d2 = (double) min;
        Double.isNaN(d2);
        float max = (((float) Math.max(d2 - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.n;
        int i = this.G;
        if (i <= 0) {
            i = this.F;
        }
        float f3 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f4 = ((float) (max2 - pow)) * 2.0f;
        int i2 = this.E + ((int) ((f3 * min) + (f3 * f4 * 2.0f)));
        if (this.B.getVisibility() != 0) {
            this.B.setVisibility(0);
        }
        this.B.setScaleX(1.0f);
        this.B.setScaleY(1.0f);
        if (f2 < this.n) {
            if (this.H.getAlpha() > 76 && !d(this.K)) {
                this.K = j(this.H.getAlpha(), 76);
            }
        } else if (this.H.getAlpha() < 255 && !d(this.L)) {
            this.L = j(this.H.getAlpha(), BitmapRenderer.ALPHA_VISIBLE);
        }
        this.H.g(0.0f, Math.min(0.8f, max * 0.8f));
        this.H.c(Math.min(1.0f, max));
        d dVar = this.H;
        dVar.e(((f4 * 2.0f) + ((max * 0.4f) - 16.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.v);
    }

    private void g(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.z) {
            this.z = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void i(boolean z2, boolean z3) {
        if (this.c != z2) {
            this.M = z3;
            b();
            this.c = z2;
            if (z2) {
                int i = this.v;
                Animation.AnimationListener animationListener = this.P;
                this.D = i;
                this.Q.reset();
                this.Q.setDuration(200);
                this.Q.setInterpolator(this.A);
                if (animationListener != null) {
                    this.B.a(animationListener);
                }
                this.B.clearAnimation();
                this.B.startAnimation(this.Q);
                return;
            }
            l(this.P);
        }
    }

    private Animation j(int i, int i2) {
        c cVar = new c(i, i2);
        cVar.setDuration(300);
        this.B.a(null);
        this.B.clearAnimation();
        this.B.startAnimation(cVar);
        return cVar;
    }

    private void k(float f2) {
        float f3 = this.x;
        int i = this.f;
        if (f2 - f3 > ((float) i) && !this.y) {
            this.w = f3 + ((float) i);
            this.y = true;
            this.H.setAlpha(76);
        }
    }

    private void setColorViewAlpha(int i) {
        this.B.getBackground().setAlpha(i);
        this.H.setAlpha(i);
    }

    public boolean a() {
        g gVar = this.O;
        if (gVar != null) {
            return gVar.a(this, this.a);
        }
        View view = this.a;
        if (!(view instanceof ListView)) {
            return view.canScrollVertically(-1);
        }
        ListView listView = (ListView) view;
        if (Build.VERSION.SDK_INT >= 19) {
            return listView.canScrollList(-1);
        }
        if (listView.getChildCount() != 0) {
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int top = listView.getChildAt(0).getTop();
            if (firstVisiblePosition > 0 || top < listView.getListPaddingTop()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.q.a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.q.b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.q.c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.q.e(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: package-private */
    public void f(float f2) {
        int i = this.D;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.E - i)) * f2))) - this.B.getTop());
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.C;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.p.a();
    }

    public int getProgressCircleDiameter() {
        return this.N;
    }

    public int getProgressViewEndOffset() {
        return this.F;
    }

    public int getProgressViewStartOffset() {
        return this.E;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.B.clearAnimation();
        this.H.stop();
        this.B.setVisibility(8);
        setColorViewAlpha(BitmapRenderer.ALPHA_VISIBLE);
        setTargetOffsetTopAndBottom(this.E - this.v);
        this.v = this.B.getTop();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.q.h(0);
    }

    @Override // android.view.View, defpackage.g4
    public boolean isNestedScrollingEnabled() {
        return this.q.i();
    }

    /* access modifiers changed from: package-private */
    public void l(Animation.AnimationListener animationListener) {
        b bVar = new b();
        this.J = bVar;
        bVar.setDuration(150);
        this.B.a(animationListener);
        this.B.clearAnimation();
        this.B.startAnimation(this.J);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.c || this.t) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.z;
                    if (i == -1) {
                        Log.e(S, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    k(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        g(motionEvent);
                    }
                }
            }
            this.y = false;
            this.z = -1;
        } else {
            setTargetOffsetTopAndBottom(this.E - this.B.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.z = pointerId;
            this.y = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.x = motionEvent.getY(findPointerIndex2);
        }
        return this.y;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.a == null) {
                b();
            }
            View view = this.a;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.B.getMeasuredWidth();
                int measuredHeight2 = this.B.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.v;
                this.B.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a == null) {
            b();
        }
        View view = this.a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.B.measure(View.MeasureSpec.makeMeasureSpec(this.N, 1073741824), View.MeasureSpec.makeMeasureSpec(this.N, 1073741824));
            this.C = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.B) {
                    this.C = i3;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return dispatchNestedFling(f2, f3, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f2 = this.o;
            if (f2 > 0.0f) {
                float f3 = (float) i2;
                if (f3 > f2) {
                    iArr[1] = i2 - ((int) f2);
                    this.o = 0.0f;
                } else {
                    this.o = f2 - f3;
                    iArr[1] = i2;
                }
                e(this.o);
            }
        }
        int[] iArr2 = this.r;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.s);
        int i5 = i4 + this.s[1];
        if (i5 < 0 && !a()) {
            float abs = this.o + ((float) Math.abs(i5));
            this.o = abs;
            e(abs);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.p.c(view, view2, i);
        startNestedScroll(i & 2);
        this.o = 0.0f;
        this.t = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.c && (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, defpackage.k4
    public void onStopNestedScroll(View view) {
        this.p.d(0);
        this.t = false;
        float f2 = this.o;
        if (f2 > 0.0f) {
            c(f2);
            this.o = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        String str = S;
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.c || this.t) {
            return false;
        }
        if (actionMasked == 0) {
            this.z = motionEvent.getPointerId(0);
            this.y = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.z);
            if (findPointerIndex < 0) {
                Log.e(str, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.y) {
                this.y = false;
                c((motionEvent.getY(findPointerIndex) - this.w) * 0.5f);
            }
            this.z = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.z);
            if (findPointerIndex2 < 0) {
                Log.e(str, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            k(y2);
            if (this.y) {
                float f2 = (y2 - this.w) * 0.5f;
                if (f2 <= 0.0f) {
                    return false;
                }
                e(f2);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(str, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.z = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                g(motionEvent);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.a instanceof AbsListView)) {
            View view = this.a;
            if (view == null || q4.x(view)) {
                super.requestDisallowInterceptTouchEvent(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f2) {
        this.B.setScaleX(f2);
        this.B.setScaleY(f2);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        this.H.d(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = androidx.core.content.a.b(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.n = (float) i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!z2) {
            h();
        }
    }

    @Override // android.view.View, defpackage.g4
    public void setNestedScrollingEnabled(boolean z2) {
        this.q.j(z2);
    }

    public void setOnChildScrollUpCallback(g gVar) {
        this.O = gVar;
    }

    public void setOnRefreshListener(h hVar) {
        this.b = hVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.B.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.a.b(getContext(), i));
    }

    public void setRefreshing(boolean z2) {
        if (!z2 || this.c == z2) {
            i(z2, false);
            return;
        }
        this.c = z2;
        setTargetOffsetTopAndBottom((this.F + this.E) - this.v);
        this.M = false;
        Animation.AnimationListener animationListener = this.P;
        this.B.setVisibility(0);
        this.H.setAlpha(BitmapRenderer.ALPHA_VISIBLE);
        e eVar = new e(this);
        this.I = eVar;
        eVar.setDuration((long) this.u);
        if (animationListener != null) {
            this.B.a(animationListener);
        }
        this.B.clearAnimation();
        this.B.startAnimation(this.I);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.N = (int) (displayMetrics.density * 56.0f);
            } else {
                this.N = (int) (displayMetrics.density * 40.0f);
            }
            this.B.setImageDrawable(null);
            this.H.h(i);
            this.B.setImageDrawable(this.H);
        }
    }

    public void setSlingshotDistance(int i) {
        this.G = i;
    }

    /* access modifiers changed from: package-private */
    public void setTargetOffsetTopAndBottom(int i) {
        this.B.bringToFront();
        q4.A(this.B, i);
        this.v = this.B.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.q.k(i, 0);
    }

    @Override // android.view.View, defpackage.g4
    public void stopNestedScroll() {
        this.q.l(0);
    }
}
