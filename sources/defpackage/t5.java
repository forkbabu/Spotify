package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import defpackage.r5;

/* renamed from: t5  reason: default package */
public final class t5 extends r5<t5> {
    private u5 t = null;
    private float u = Float.MAX_VALUE;

    public <K> t5(K k, s5<K> s5Var) {
        super(k, s5Var);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.r5
    public boolean i(long j) {
        if (this.u != Float.MAX_VALUE) {
            this.t.a();
            long j2 = j / 2;
            r5.j g = this.t.g((double) this.b, (double) this.a, j2);
            this.t.d(this.u);
            this.u = Float.MAX_VALUE;
            r5.j g2 = this.t.g((double) g.a, (double) g.b, j2);
            this.b = g2.a;
            this.a = g2.b;
        } else {
            r5.j g3 = this.t.g((double) this.b, (double) this.a, j);
            this.b = g3.a;
            this.a = g3.b;
        }
        float max = Math.max(this.b, this.g);
        this.b = max;
        float min = Math.min(max, this.f);
        this.b = min;
        if (!this.t.b(min, this.a)) {
            return false;
        }
        this.b = this.t.a();
        this.a = 0.0f;
        return true;
    }

    public void j(float f) {
        if (this.e) {
            this.u = f;
            return;
        }
        if (this.t == null) {
            this.t = new u5(f);
        }
        this.t.d(f);
        u5 u5Var = this.t;
        if (u5Var != null) {
            double a = (double) u5Var.a();
            if (a > ((double) this.f)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (a >= ((double) this.g)) {
                this.t.f((double) c());
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    boolean z = this.e;
                    if (!z && !z) {
                        this.e = true;
                        float a2 = this.d.a(this.c);
                        this.b = a2;
                        if (a2 > this.f || a2 < this.g) {
                            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                        }
                        q5.c().a(this, 0);
                        return;
                    }
                    return;
                }
                throw new AndroidRuntimeException("Animations may only be started on the main thread");
            } else {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    public t5 k(u5 u5Var) {
        this.t = u5Var;
        return this;
    }
}
