package android.support.wearable.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

@Deprecated
public class GridViewPager extends ViewGroup {
    private static final int[] V = {16842931};
    private static final Interpolator W = new b();
    private static final Interpolator a0 = new DecelerateInterpolator(2.5f);
    private float A;
    private float B;
    private float C;
    private int D;
    private int E;
    private VelocityTracker F;
    private final int G;
    private final int H;
    private final int I;
    private final int J;
    private boolean K;
    private boolean L;
    private e M;
    private d N;
    private int O;
    private int P;
    private final SparseIntArray Q;
    private final BackgroundController R;
    private WindowInsets S;
    private View.OnApplyWindowInsetsListener T;
    private boolean U;
    private boolean a;
    private int b;
    private final Runnable c;
    private final Point f;
    private final Point n;
    private final t1<Point, c> o;
    private final t1<Point, c> p;
    private final Rect q;
    private final Rect r;
    private final Scroller s;
    private boolean t;
    private int u;
    private boolean v;
    private boolean w;
    private final int x;
    private final int y;
    private float z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public boolean a;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, GridViewPager.V);
            obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int a;
        int b;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }

        SavedState(Parcel parcel, a aVar) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GridViewPager.this.setScrollState(0);
            GridViewPager.this.getClass();
        }
    }

    /* access modifiers changed from: private */
    public static final class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            double exp = Math.exp((double) (f * 2.0f * 4.0f));
            return 0.25f * ((float) ((exp - 1.0d) / (exp + 1.0d)));
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {
        int a;
        int b;

        c() {
        }

        public String toString() {
            int i = this.a;
            int i2 = this.b;
            StringBuilder sb = new StringBuilder("null".length() + 27);
            sb.append(i);
            sb.append(",");
            sb.append(i2);
            sb.append(" => ");
            sb.append("null");
            return sb.toString();
        }
    }

    public interface d {
    }

    public interface e {
        void a(int i);

        void b(int i, int i2, float f, float f2, int i3, int i4);
    }

    public GridViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void c(boolean z2) {
        boolean z3 = this.O == 2;
        if (z3) {
            this.s.abortAnimation();
            int g = g(this.n.y);
            int scrollY = getScrollY();
            int currX = this.s.getCurrX();
            int currY = this.s.getCurrY();
            if (!(g == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        if (!z3) {
            return;
        }
        if (z2) {
            Runnable runnable = this.c;
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            postOnAnimation(runnable);
            return;
        }
        this.c.run();
    }

    private int d(int i) {
        return getPaddingLeft() + ((getContentWidth() + 0) * i);
    }

    private int e(int i) {
        return getPaddingTop() + ((getContentHeight() + 0) * i);
    }

    private static String f(int i) {
        int i2 = (i * 2) + 3;
        StringBuilder sb = new StringBuilder(i2 * 2);
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(' ');
            sb.append(' ');
        }
        return sb.toString();
    }

    private int g(int i) {
        return this.Q.get(i, 0);
    }

    private int getContentHeight() {
        return getMeasuredHeight() - (getPaddingBottom() + getPaddingTop());
    }

    private int getContentWidth() {
        return getMeasuredWidth() - (getPaddingRight() + getPaddingLeft());
    }

    private float h(float f2) {
        int contentWidth = getContentWidth() + 0;
        if (contentWidth != 0) {
            return f2 / ((float) contentWidth);
        }
        Log.e("GridViewPager", "getXIndex() called with zero width.");
        return 0.0f;
    }

    private float i(float f2) {
        int contentHeight = getContentHeight() + 0;
        if (contentHeight != 0) {
            return f2 / ((float) contentHeight);
        }
        Log.e("GridViewPager", "getYIndex() called with zero height.");
        return 0.0f;
    }

    private boolean j(MotionEvent motionEvent) {
        if (this.v) {
            return false;
        }
        this.E = motionEvent.getPointerId(0);
        this.C = motionEvent.getX();
        this.B = motionEvent.getY();
        this.D = getScrollY();
        this.z = this.C;
        this.A = this.B;
        this.w = true;
        VelocityTracker obtain = VelocityTracker.obtain();
        this.F = obtain;
        obtain.addMovement(motionEvent);
        this.s.computeScrollOffset();
        int i = this.O;
        if (((i == 2 || i == 3) && this.P == 0 && Math.abs(this.s.getFinalX() - this.s.getCurrX()) > this.J) || (this.P == 1 && Math.abs(this.s.getFinalY() - this.s.getCurrY()) > this.J)) {
            this.s.abortAnimation();
            this.v = true;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            setScrollState(1);
        } else {
            c(false);
            this.v = false;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:92:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean k(android.view.MotionEvent r18) {
        /*
        // Method dump skipped, instructions count: 546
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.view.GridViewPager.k(android.view.MotionEvent):boolean");
    }

    private c l(View view) {
        for (int i = 0; i < this.o.size(); i++) {
            if (this.o.m(i) != null) {
                throw null;
            }
        }
        return null;
    }

    private c m() {
        return n(g((int) i((float) getScrollY())), getScrollY());
    }

    private c n(int i, int i2) {
        int i3 = (int) i((float) i2);
        int h = (int) h((float) i);
        this.f.set(h, i3);
        c cVar = this.o.get(this.f);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        cVar2.a = h;
        cVar2.b = i3;
        return cVar2;
    }

    private void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.E) {
            int i = actionIndex == 0 ? 1 : 0;
            this.z = motionEvent.getX(i);
            this.A = motionEvent.getY(i);
            this.E = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.F;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean r(int i, int i2) {
        if (this.o.size() == 0) {
            this.L = false;
            p(0, 0, 0.0f, 0.0f, 0, 0);
            if (this.L) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        c m = m();
        int d2 = d(m.a);
        int e2 = e(m.b);
        int paddingLeft = (getPaddingLeft() + i) - d2;
        int paddingTop = (getPaddingTop() + i2) - e2;
        float h = h((float) paddingLeft);
        float i3 = i((float) paddingTop);
        this.L = false;
        p(m.a, m.b, h, i3, paddingLeft, paddingTop);
        if (this.L) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void s(int i, int i2, boolean z2, int i3, boolean z3) {
        this.f.set(i, i2);
        c cVar = this.o.get(this.f);
        if (cVar != null) {
            d(cVar.a);
            getPaddingLeft();
            e(cVar.b);
            getPaddingTop();
        }
        throw null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setScrollState(int i) {
        if (this.O != i) {
            this.O = i;
            e eVar = this.M;
            if (eVar != null) {
                eVar.a(i);
            }
            BackgroundController backgroundController = this.R;
            if (backgroundController != null) {
                backgroundController.a(i);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        l(view);
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        if (this.t) {
            layoutParams2.a = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
        WindowInsets windowInsets = this.S;
        if (windowInsets != null) {
            view.onApplyWindowInsets(windowInsets);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        getVisibility();
        return false;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        getVisibility();
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.s.isFinished() || !this.s.computeScrollOffset()) {
            c(true);
            return;
        }
        if (this.O == 3) {
            this.s.abortAnimation();
        } else {
            int g = g(this.n.y);
            int scrollY = getScrollY();
            int currX = this.s.getCurrX();
            int currY = this.s.getCurrY();
            if (!(g == currX && scrollY == currY)) {
                scrollTo(currX, currY);
                if (!r(currX, currY)) {
                    this.s.abortAnimation();
                    scrollTo(0, 0);
                }
            }
        }
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        postInvalidateOnAnimation();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public void debug(int i) {
        super.debug(i);
        String valueOf = String.valueOf(f(i));
        String valueOf2 = String.valueOf(this.n);
        valueOf.length();
        valueOf2.length();
        String.valueOf(f(i)).length();
        "null".length();
        String.valueOf(f(i)).length();
        String.valueOf(f(i)).length();
        int size = this.o.size();
        if (size != 0) {
            String.valueOf(f(i)).concat("mItems={");
        }
        for (int i2 = 0; i2 < size; i2++) {
            String valueOf3 = String.valueOf(f(i + 1));
            String valueOf4 = String.valueOf(this.o.i(i2));
            String valueOf5 = String.valueOf(this.o.m(i2));
            valueOf3.length();
            valueOf4.length();
            valueOf5.length();
        }
        if (size != 0) {
            String.valueOf(f(i)).concat("}");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = onApplyWindowInsets(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.T;
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(this, onApplyWindowInsets);
        }
        return this.a ? onApplyWindowInsets.consumeSystemWindowInsets() : onApplyWindowInsets;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
        /*
            r3 = this;
            boolean r0 = super.dispatchKeyEvent(r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0031
            int r4 = r4.getKeyCode()
            r0 = 62
            if (r4 == r0) goto L_0x0029
            r0 = 19
            if (r4 == r0) goto L_0x0020
            r0 = 21
            if (r4 == r0) goto L_0x0019
            goto L_0x0027
        L_0x0019:
            android.graphics.Point r4 = r3.n
            int r4 = r4.x
            if (r4 <= 0) goto L_0x0027
            goto L_0x002c
        L_0x0020:
            android.graphics.Point r4 = r3.n
            int r4 = r4.y
            if (r4 <= 0) goto L_0x0027
            goto L_0x002c
        L_0x0027:
            r4 = 0
            goto L_0x002d
        L_0x0029:
            r3.debug(r2)
        L_0x002c:
            r4 = 1
        L_0x002d:
            if (r4 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.wearable.view.GridViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
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

    public e getAdapter() {
        return null;
    }

    public Point getCurrentItem() {
        return new Point(this.n);
    }

    public int getOffscreenPageCount() {
        return this.u;
    }

    public int getPageColumnMargin() {
        return 0;
    }

    public int getPageRowMargin() {
        return 0;
    }

    public void o(View view, LayoutParams layoutParams) {
        int contentWidth = getContentWidth();
        int contentHeight = getContentHeight();
        int i = 1073741824;
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).width == -2 ? 0 : 1073741824;
        if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
            i = 0;
        }
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(contentWidth, i2), ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(contentHeight, i), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchApplyWindowInsets(windowInsets);
        }
        this.S = windowInsets;
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        getParent().requestFitSystemWindows();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.c);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & BitmapRenderer.ALPHA_VISIBLE;
        if (action == 3 || action == 1) {
            this.v = false;
            this.w = false;
            this.E = -1;
            VelocityTracker velocityTracker = this.F;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.F = null;
            }
            return false;
        }
        if (action != 0) {
            if (this.v) {
                return true;
            }
            if (!this.w) {
                return false;
            }
        }
        if (action == 0) {
            j(motionEvent);
        } else if (action == 2) {
            k(motionEvent);
        } else if (action == 6) {
            q(motionEvent);
        }
        return this.v;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((LayoutParams) childAt.getLayoutParams()) == null) {
                String.valueOf(childAt).length();
            } else {
                l(childAt);
                String.valueOf(childAt).length();
            }
        }
        if (!this.K || this.o.isEmpty()) {
            this.K = false;
            return;
        }
        Point point = this.n;
        s(point.x, point.y, false, 0, false);
        throw null;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        LayoutParams layoutParams;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        this.t = true;
        this.t = false;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!(childAt.getVisibility() == 8 || (layoutParams = (LayoutParams) childAt.getLayoutParams()) == null)) {
                o(childAt, layoutParams);
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.b;
        boolean z2 = true;
        if (i < 0 || i > -1) {
            z2 = false;
        }
        if (!z2) {
            this.n.set(0, 0);
            scrollTo(0, 0);
            return;
        }
        throw null;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Point point = this.n;
        savedState.a = point.x;
        savedState.b = point.y;
        return savedState;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.o.isEmpty()) {
            return;
        }
        if (i3 <= 0 || i4 <= 0) {
            c orDefault = this.o.getOrDefault(this.n, null);
            if (orDefault != null) {
                int d2 = d(orDefault.a) - getPaddingLeft();
                int e2 = e(orDefault.b) - getPaddingTop();
                if (d2 != g(orDefault.b) || e2 != getScrollY()) {
                    c(false);
                    scrollTo(d2, e2);
                    return;
                }
                return;
            }
            return;
        }
        int g = (int) ((((float) g(this.n.y)) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + 0))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + 0)));
        int scrollY = (int) ((((float) getScrollY()) / ((float) (((i4 - getPaddingTop()) - getPaddingBottom()) + 0))) * ((float) (((i2 - getPaddingTop()) - getPaddingBottom()) + 0)));
        scrollTo(g, scrollY);
        if (!this.s.isFinished()) {
            c orDefault2 = this.o.getOrDefault(this.n, null);
            this.s.startScroll(g, scrollY, d(orDefault2.a) - getPaddingLeft(), e(orDefault2.b) - getPaddingTop(), this.s.getDuration() - this.s.timePassed());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void p(int i, int i2, float f2, float f3, int i3, int i4) {
        this.L = true;
        e eVar = this.M;
        if (eVar != null) {
            eVar.b(i2, i, f3, f2, i4, i3);
        }
        BackgroundController backgroundController = this.R;
        if (backgroundController != null) {
            backgroundController.b(i2, i, f3, f2, i4, i3);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        l(view);
        if (this.t) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewParent, android.view.View
    public void requestFitSystemWindows() {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (this.O == 2 && this.P == 1) {
            i = g(this.n.y);
        }
        super.scrollTo(0, i2);
        int i3 = this.n.y;
        if (this.Q.get(i3, 0) != i) {
            int childCount = getChildCount();
            this.Q.get(i3, 0);
            for (int i4 = 0; i4 < childCount; i4++) {
                l(getChildAt(i4));
            }
            this.Q.put(i3, i);
        }
    }

    public void setAdapter(e eVar) {
        this.n.set(0, 0);
        if (this.v) {
            cancelPendingInputEvents();
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(4098);
            dispatchTouchEvent(obtain);
            obtain.recycle();
        }
        if (eVar != null) {
            this.U = true;
        } else {
            this.U = false;
        }
    }

    public void setConsumeWindowInsets(boolean z2) {
        this.a = z2;
    }

    public void setOffscreenPageCount(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.u) {
            this.u = i;
        }
    }

    public void setOnAdapterChangeListener(d dVar) {
        this.N = dVar;
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.T = onApplyWindowInsetsListener;
    }

    public void setOnPageChangeListener(e eVar) {
        this.M = eVar;
    }

    public void setSlideAnimationDuration(int i) {
        this.b = i;
    }

    public GridViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        this.b = 300;
        this.c = new a();
        this.u = 1;
        this.E = -1;
        this.F = null;
        this.K = true;
        this.O = 0;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f2 = context.getResources().getDisplayMetrics().density;
        int i2 = u4.b;
        int scaledPagingTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.x = scaledPagingTouchSlop;
        this.y = scaledPagingTouchSlop * scaledPagingTouchSlop;
        this.G = viewConfiguration.getScaledMinimumFlingVelocity();
        this.H = (int) (40.0f * f2);
        this.I = (int) (200.0f * f2);
        this.J = (int) (f2 * 2.0f);
        this.n = new Point();
        this.o = new t1<>();
        this.p = new t1<>();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Scroller(context, a0, true);
        this.f = new Point();
        setOverScrollMode(1);
        this.Q = new SparseIntArray();
        BackgroundController backgroundController = new BackgroundController();
        this.R = backgroundController;
        backgroundController.c(this);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
