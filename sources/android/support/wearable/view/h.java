package android.support.wearable.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.Constants;

/* access modifiers changed from: package-private */
public class h {
    private float a = 0.0f;
    private float b = (0.0f * 0.0f);
    private float c = 180.0f;
    private float d = ((float) Math.toRadians((double) 180.0f));
    private float e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;
    private float j;
    private RecyclerView k;
    VelocityTracker l;

    h() {
    }

    private static float d(float f2) {
        double d2 = (double) f2;
        if (d2 < -3.141592653589793d) {
            Double.isNaN(d2);
            f2 = (float) (d2 + 6.283185307179586d);
        }
        double d3 = (double) f2;
        if (d3 <= 3.141592653589793d) {
            return f2;
        }
        Double.isNaN(d3);
        return (float) (d3 - 6.283185307179586d);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.k = null;
    }

    public float b() {
        return 1.0f - this.a;
    }

    public float c() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public boolean e(MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - this.e;
        float rawY = motionEvent.getRawY() - this.e;
        float f2 = (rawY * rawY) + (rawX * rawX);
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        this.l.addMovement(obtain);
        obtain.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.h = false;
                this.i = false;
                this.l.computeCurrentVelocity(Constants.ONE_SECOND, (float) this.k.getMaxFlingVelocity());
                int yVelocity = (int) this.l.getYVelocity();
                if (motionEvent.getX() < this.e * 1.5f) {
                    yVelocity = -yVelocity;
                }
                this.l.clear();
                if (Math.abs(yVelocity) > this.k.getMinFlingVelocity()) {
                    return this.k.U(0, (int) (((float) yVelocity) * 1.5f));
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 3 && this.h) {
                    this.h = false;
                    this.i = false;
                    this.k.invalidate();
                    return true;
                }
            } else if (this.i) {
                int round = Math.round(d(((float) Math.atan2((double) rawY, (double) rawX)) - this.j) * this.g);
                if (round != 0) {
                    this.k.scrollBy(0, round);
                    float f3 = this.j + (((float) round) / this.g);
                    this.j = f3;
                    this.j = d(f3);
                }
                return true;
            } else if (this.h) {
                float rawX2 = motionEvent.getRawX() - this.e;
                float rawY2 = motionEvent.getRawY() - this.e;
                float hypot = (float) Math.hypot((double) rawX2, (double) rawY2);
                float f4 = rawY2 / hypot;
                this.i = true;
                this.k.invalidate();
                this.j = (float) Math.atan2((double) f4, (double) (rawX2 / hypot));
                return true;
            } else if (f2 / this.f > this.b) {
                this.h = true;
                return true;
            }
        } else if (f2 / this.f > this.b) {
            this.h = true;
            return true;
        }
        return false;
    }

    public void f(float f2) {
        float f3 = 1.0f - f2;
        this.a = f3;
        this.b = f3 * f3;
    }

    /* access modifiers changed from: package-private */
    public void g(RecyclerView recyclerView) {
        this.k = recyclerView;
        Point point = new Point();
        this.k.getDisplay().getSize(point);
        float max = ((float) Math.max(point.x, point.y)) / 2.0f;
        this.e = max;
        this.f = max * max;
        this.g = ((float) point.y) / this.d;
        this.l = VelocityTracker.obtain();
    }

    public void h(float f2) {
        this.c = f2;
        this.d = (float) Math.toRadians((double) f2);
    }
}
