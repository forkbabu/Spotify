package defpackage;

import android.view.Choreographer;
import com.airbnb.lottie.c;
import com.airbnb.lottie.d;

/* renamed from: be  reason: default package */
public class be extends xd implements Choreographer.FrameCallback {
    private float c = 1.0f;
    private boolean f = false;
    private long n = 0;
    private float o = 0.0f;
    private int p = 0;
    private float q = -2.14748365E9f;
    private float r = 2.14748365E9f;
    private d s;
    protected boolean t = false;

    private boolean q() {
        return this.c < 0.0f;
    }

    public void A(int i) {
        z((float) i, (float) ((int) this.r));
    }

    public void B(float f2) {
        this.c = f2;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        b();
        u();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        t();
        d dVar = this.s;
        if (dVar != null && this.t) {
            long j2 = this.n;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float h = ((float) j3) / ((1.0E9f / dVar.h()) / Math.abs(this.c));
            float f2 = this.o;
            if (q()) {
                h = -h;
            }
            float f3 = f2 + h;
            this.o = f3;
            float o2 = o();
            float n2 = n();
            int i = de.b;
            boolean z = !(f3 >= o2 && f3 <= n2);
            this.o = de.b(this.o, o(), n());
            this.n = j;
            f();
            if (z) {
                if (getRepeatCount() == -1 || this.p < getRepeatCount()) {
                    d();
                    this.p++;
                    if (getRepeatMode() == 2) {
                        this.f = !this.f;
                        this.c = -this.c;
                    } else {
                        this.o = q() ? n() : o();
                    }
                    this.n = j;
                } else {
                    this.o = this.c < 0.0f ? o() : n();
                    u();
                    c(q());
                }
            }
            if (this.s != null) {
                float f4 = this.o;
                if (f4 < this.q || f4 > this.r) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.q), Float.valueOf(this.r), Float.valueOf(this.o)));
                }
            }
            c.a("LottieValueAnimator#doFrame");
        }
    }

    public void g() {
        this.s = null;
        this.q = -2.14748365E9f;
        this.r = 2.14748365E9f;
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float o2;
        float n2;
        float o3;
        if (this.s == null) {
            return 0.0f;
        }
        if (q()) {
            o2 = n() - this.o;
            n2 = n();
            o3 = o();
        } else {
            o2 = this.o - o();
            n2 = n();
            o3 = o();
        }
        return o2 / (n2 - o3);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(k());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        d dVar = this.s;
        if (dVar == null) {
            return 0;
        }
        return (long) dVar.d();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.t;
    }

    public void j() {
        u();
        c(q());
    }

    public float k() {
        d dVar = this.s;
        if (dVar == null) {
            return 0.0f;
        }
        return (this.o - dVar.o()) / (this.s.f() - this.s.o());
    }

    public float m() {
        return this.o;
    }

    public float n() {
        d dVar = this.s;
        if (dVar == null) {
            return 0.0f;
        }
        float f2 = this.r;
        return f2 == 2.14748365E9f ? dVar.f() : f2;
    }

    public float o() {
        d dVar = this.s;
        if (dVar == null) {
            return 0.0f;
        }
        float f2 = this.q;
        return f2 == -2.14748365E9f ? dVar.o() : f2;
    }

    public float p() {
        return this.c;
    }

    public void r() {
        u();
    }

    public void s() {
        this.t = true;
        e(q());
        x((float) ((int) (q() ? n() : o())));
        this.n = 0;
        this.p = 0;
        t();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f) {
            this.f = false;
            this.c = -this.c;
        }
    }

    /* access modifiers changed from: protected */
    public void t() {
        if (this.t) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void u() {
        Choreographer.getInstance().removeFrameCallback(this);
        this.t = false;
    }

    public void v() {
        this.t = true;
        t();
        this.n = 0;
        if (q() && this.o == o()) {
            this.o = n();
        } else if (!q() && this.o == n()) {
            this.o = o();
        }
    }

    public void w(d dVar) {
        boolean z = this.s == null;
        this.s = dVar;
        if (z) {
            z((float) ((int) Math.max(this.q, dVar.o())), (float) ((int) Math.min(this.r, dVar.f())));
        } else {
            z((float) ((int) dVar.o()), (float) ((int) dVar.f()));
        }
        float f2 = this.o;
        this.o = 0.0f;
        x((float) ((int) f2));
        f();
    }

    public void x(float f2) {
        if (this.o != f2) {
            this.o = de.b(f2, o(), n());
            this.n = 0;
            f();
        }
    }

    public void y(float f2) {
        z(this.q, f2);
    }

    public void z(float f2, float f3) {
        if (f2 <= f3) {
            d dVar = this.s;
            float o2 = dVar == null ? -3.4028235E38f : dVar.o();
            d dVar2 = this.s;
            float f4 = dVar2 == null ? Float.MAX_VALUE : dVar2.f();
            this.q = de.b(f2, o2, f4);
            this.r = de.b(f3, o2, f4);
            x((float) ((int) de.b(this.o, f2, f3)));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f2), Float.valueOf(f3)));
    }
}
