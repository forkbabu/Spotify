package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: yw  reason: default package */
public class yw {
    private long a = 0;
    private long b = 300;
    private TimeInterpolator c = null;
    private int d = 0;
    private int e = 1;

    public yw(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    static yw b(ValueAnimator valueAnimator) {
        long startDelay = valueAnimator.getStartDelay();
        long duration = valueAnimator.getDuration();
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            interpolator = qw.b;
        } else if (interpolator instanceof AccelerateInterpolator) {
            interpolator = qw.c;
        } else if (interpolator instanceof DecelerateInterpolator) {
            interpolator = qw.d;
        }
        yw ywVar = new yw(startDelay, duration, interpolator);
        ywVar.d = valueAnimator.getRepeatCount();
        ywVar.e = valueAnimator.getRepeatMode();
        return ywVar;
    }

    public void a(Animator animator) {
        animator.setStartDelay(this.a);
        animator.setDuration(this.b);
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.d);
            valueAnimator.setRepeatMode(this.e);
        }
    }

    public long c() {
        return this.a;
    }

    public long d() {
        return this.b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : qw.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw)) {
            return false;
        }
        yw ywVar = (yw) obj;
        if (this.a == ywVar.a && this.b == ywVar.b && this.d == ywVar.d && this.e == ywVar.e) {
            return e().getClass().equals(ywVar.e().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((e().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public String toString() {
        StringBuilder S0 = je.S0('\n');
        S0.append(yw.class.getName());
        S0.append('{');
        S0.append(Integer.toHexString(System.identityHashCode(this)));
        S0.append(" delay: ");
        S0.append(this.a);
        S0.append(" duration: ");
        S0.append(this.b);
        S0.append(" interpolator: ");
        S0.append(e().getClass());
        S0.append(" repeatCount: ");
        S0.append(this.d);
        S0.append(" repeatMode: ");
        return je.B0(S0, this.e, "}\n");
    }

    public yw(long j, long j2, TimeInterpolator timeInterpolator) {
        this.a = j;
        this.b = j2;
        this.c = timeInterpolator;
    }
}
