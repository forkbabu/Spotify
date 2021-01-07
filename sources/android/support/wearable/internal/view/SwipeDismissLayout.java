package android.support.wearable.internal.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;

@Deprecated
public class SwipeDismissLayout extends FrameLayout {
    private float A = 0.33f;
    private int a;
    private int b;
    private float c;
    private int f;
    private float n;
    private float o;
    private boolean p;
    private boolean q;
    private boolean r = true;
    private boolean s;
    private boolean t;
    private VelocityTracker u;
    private float v;
    private b w;
    private a x;
    private c y;
    private float z;

    public interface a {
        void a(SwipeDismissLayout swipeDismissLayout);
    }

    public interface b {
        boolean a(float f, float f2);
    }

    public interface c {
        void a(SwipeDismissLayout swipeDismissLayout, float f, float f2);

        void b(SwipeDismissLayout swipeDismissLayout);
    }

    public SwipeDismissLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    private void b(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.a = viewConfiguration.getScaledTouchSlop();
        this.b = viewConfiguration.getScaledMinimumFlingVelocity();
        this.c = ((float) Resources.getSystem().getDisplayMetrics().widthPixels) * 0.1f;
        setSwipeable(true);
    }

    private void c() {
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.u = null;
        this.v = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.q = false;
        this.s = false;
        this.t = false;
        this.r = true;
    }

    private void d(MotionEvent motionEvent) {
        if (!this.q) {
            float rawX = motionEvent.getRawX() - this.n;
            float rawY = motionEvent.getRawY() - this.o;
            float f2 = (rawY * rawY) + (rawX * rawX);
            int i = this.a;
            boolean z2 = false;
            if (f2 > ((float) (i * i))) {
                if (this.r && Math.abs(rawY) < Math.abs(rawX) && rawX > 0.0f) {
                    z2 = true;
                }
                this.q = z2;
                this.r = z2;
            }
        }
    }

    private void setProgress(float f2) {
        this.v = f2;
        c cVar = this.y;
        if (cVar != null && f2 >= 0.0f) {
            cVar.a(this, f2 / ((float) getWidth()), f2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(View view, boolean z2, float f2, float f3, float f4) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                float f5 = f3 + ((float) scrollX);
                if (f5 >= ((float) childAt.getLeft()) && f5 < ((float) childAt.getRight())) {
                    float f6 = f4 + ((float) scrollY);
                    if (f6 >= ((float) childAt.getTop()) && f6 < ((float) childAt.getBottom()) && a(childAt, true, f2, f5 - ((float) childAt.getLeft()), f6 - ((float) childAt.getTop()))) {
                        return true;
                    }
                }
            }
        }
        if (!z2 || !view.canScrollHorizontally((int) (-f2))) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return i < 0 && this.p && getVisibility() == 0;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.p) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(this.v, 0.0f);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            this.f = motionEvent.getPointerId(motionEvent.getActionIndex());
                        } else if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.f) {
                                this.f = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            }
                        }
                    }
                } else if (this.u != null && !this.t) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f);
                    if (findPointerIndex == -1) {
                        Log.e("SwipeDismissLayout", "Invalid pointer index: ignoring.");
                        this.t = true;
                    } else {
                        float rawX = motionEvent.getRawX() - this.n;
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        if (rawX == 0.0f || this.n < this.c || !a(this, false, rawX, x2, y2)) {
                            d(motionEvent);
                        } else {
                            this.t = true;
                        }
                    }
                }
            }
            c();
        } else {
            c();
            this.n = motionEvent.getRawX();
            this.o = motionEvent.getRawY();
            this.f = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.u = obtain;
            obtain.addMovement(motionEvent);
        }
        b bVar = this.w;
        if (bVar != null) {
            bVar.a(this.n, this.o);
        }
        if (this.t || !this.q) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar;
        if (!this.p) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.u == null) {
            return super.onTouchEvent(motionEvent);
        }
        b bVar = this.w;
        if (bVar != null) {
            bVar.a(this.n, this.o);
        }
        motionEvent.offsetLocation(this.v, 0.0f);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            float rawX = motionEvent.getRawX() - this.n;
            this.u.addMovement(motionEvent);
            this.u.computeCurrentVelocity(Constants.ONE_SECOND);
            if (!this.s && ((rawX > ((float) getWidth()) * this.A && motionEvent.getRawX() >= this.z) || this.u.getXVelocity() >= ((float) this.b))) {
                this.s = true;
            }
            if (this.s && this.q && this.u.getXVelocity() < ((float) (-this.b))) {
                this.s = false;
            }
            if (this.s) {
                a aVar = this.x;
                if (aVar != null) {
                    aVar.a(this);
                }
            } else if (this.q && (cVar = this.y) != null) {
                cVar.b(this);
            }
            c();
        } else if (actionMasked == 2) {
            this.u.addMovement(motionEvent);
            this.z = motionEvent.getRawX();
            d(motionEvent);
            if (this.q) {
                setProgress(motionEvent.getRawX() - this.n);
            }
        } else if (actionMasked == 3) {
            c cVar2 = this.y;
            if (cVar2 != null) {
                cVar2.b(this);
            }
            c();
        }
        return true;
    }

    public void setDismissMinDragWidthRatio(float f2) {
        this.A = f2;
    }

    public void setOnDismissedListener(a aVar) {
        this.x = aVar;
    }

    public void setOnPreSwipeListener(b bVar) {
        this.w = bVar;
    }

    public void setOnSwipeProgressChangedListener(c cVar) {
        this.y = cVar;
    }

    public void setSwipeable(boolean z2) {
        this.p = z2;
    }

    public SwipeDismissLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context);
    }
}
