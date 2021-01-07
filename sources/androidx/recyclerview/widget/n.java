package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

/* access modifiers changed from: package-private */
public class n extends RecyclerView.l implements RecyclerView.p {
    private static final int[] M = {16842919};
    private static final int[] N = new int[0];
    private int A = 0;
    private RecyclerView B;
    private boolean C = false;
    private boolean D = false;
    private int E = 0;
    private int F = 0;
    private final int[] G = new int[2];
    private final int[] H = new int[2];
    final ValueAnimator I;
    int J;
    private final Runnable K;
    private final RecyclerView.q L;
    private final int a;
    private final int b;
    final StateListDrawable c;
    final Drawable f;
    private final int n;
    private final int o;
    private final StateListDrawable p;
    private final Drawable q;
    private final int r;
    private final int s;
    int t;
    int u;
    float v;
    int w;
    int x;
    float y;
    private int z = 0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n nVar = n.this;
            int i = nVar.J;
            if (i == 1) {
                nVar.I.cancel();
            } else if (i != 2) {
                return;
            }
            nVar.J = 3;
            ValueAnimator valueAnimator = nVar.I;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            nVar.I.setDuration((long) 500);
            nVar.I.start();
        }
    }

    class b extends RecyclerView.q {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void c(RecyclerView recyclerView, int i, int i2) {
            n.this.t(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {
        private boolean a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
            } else if (((Float) n.this.I.getAnimatedValue()).floatValue() == 0.0f) {
                n nVar = n.this;
                nVar.J = 0;
                nVar.r(0);
            } else {
                n nVar2 = n.this;
                nVar2.J = 2;
                nVar2.p();
            }
        }
    }

    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            n.this.c.setAlpha(floatValue);
            n.this.f.setAlpha(floatValue);
            n.this.p();
        }
    }

    n(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.I = ofFloat;
        this.J = 0;
        this.K = new a();
        b bVar = new b();
        this.L = bVar;
        this.c = stateListDrawable;
        this.f = drawable;
        this.p = stateListDrawable2;
        this.q = drawable2;
        this.n = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.o = Math.max(i, drawable.getIntrinsicWidth());
        this.r = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.s = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(BitmapRenderer.ALPHA_VISIBLE);
        drawable.setAlpha(BitmapRenderer.ALPHA_VISIBLE);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.B;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A0(this);
                this.B.C0(this);
                this.B.D0(bVar);
                m();
            }
            this.B = recyclerView;
            recyclerView.k(this, -1);
            this.B.m(this);
            this.B.n(bVar);
        }
    }

    private void m() {
        this.B.removeCallbacks(this.K);
    }

    private int q(float f2, float f3, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f3 - f2) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.E != 0) {
            if (motionEvent.getAction() == 0) {
                boolean o2 = o(motionEvent.getX(), motionEvent.getY());
                boolean n2 = n(motionEvent.getX(), motionEvent.getY());
                if (o2 || n2) {
                    if (n2) {
                        this.F = 1;
                        this.y = (float) ((int) motionEvent.getX());
                    } else if (o2) {
                        this.F = 2;
                        this.v = (float) ((int) motionEvent.getY());
                    }
                    r(2);
                }
            } else if (motionEvent.getAction() == 1 && this.E == 2) {
                this.v = 0.0f;
                this.y = 0.0f;
                r(1);
                this.F = 0;
            } else if (motionEvent.getAction() == 2 && this.E == 2) {
                s();
                if (this.F == 1) {
                    float x2 = motionEvent.getX();
                    int[] iArr = this.H;
                    int i = this.b;
                    iArr[0] = i;
                    iArr[1] = this.z - i;
                    float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x2));
                    if (Math.abs(((float) this.x) - max) >= 2.0f) {
                        int q2 = q(this.y, max, iArr, this.B.computeHorizontalScrollRange(), this.B.computeHorizontalScrollOffset(), this.z);
                        if (q2 != 0) {
                            this.B.scrollBy(q2, 0);
                        }
                        this.y = max;
                    }
                }
                if (this.F == 2) {
                    float y2 = motionEvent.getY();
                    int[] iArr2 = this.G;
                    int i2 = this.b;
                    iArr2[0] = i2;
                    iArr2[1] = this.A - i2;
                    float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y2));
                    if (Math.abs(((float) this.u) - max2) >= 2.0f) {
                        int q3 = q(this.v, max2, iArr2, this.B.computeVerticalScrollRange(), this.B.computeVerticalScrollOffset(), this.A);
                        if (q3 != 0) {
                            this.B.scrollBy(0, q3);
                        }
                        this.v = max2;
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.E;
        if (i == 1) {
            boolean o2 = o(motionEvent.getX(), motionEvent.getY());
            boolean n2 = n(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (o2 || n2)) {
                if (n2) {
                    this.F = 1;
                    this.y = (float) ((int) motionEvent.getX());
                } else if (o2) {
                    this.F = 2;
                    this.v = (float) ((int) motionEvent.getY());
                }
                r(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f(boolean z2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void l(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        if (this.z != this.B.getWidth() || this.A != this.B.getHeight()) {
            this.z = this.B.getWidth();
            this.A = this.B.getHeight();
            r(0);
        } else if (this.J != 0) {
            if (this.C) {
                int i = this.z;
                int i2 = this.n;
                int i3 = i - i2;
                int i4 = this.u;
                int i5 = this.t;
                int i6 = i4 - (i5 / 2);
                this.c.setBounds(0, 0, i2, i5);
                this.f.setBounds(0, 0, this.o, this.A);
                boolean z2 = true;
                if (q4.o(this.B) != 1) {
                    z2 = false;
                }
                if (z2) {
                    this.f.draw(canvas);
                    canvas.translate((float) this.n, (float) i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.c.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate((float) (-this.n), (float) (-i6));
                } else {
                    canvas.translate((float) i3, 0.0f);
                    this.f.draw(canvas);
                    canvas.translate(0.0f, (float) i6);
                    this.c.draw(canvas);
                    canvas.translate((float) (-i3), (float) (-i6));
                }
            }
            if (this.D) {
                int i7 = this.A;
                int i8 = this.r;
                int i9 = i7 - i8;
                int i10 = this.x;
                int i11 = this.w;
                int i12 = i10 - (i11 / 2);
                this.p.setBounds(0, 0, i11, i8);
                this.q.setBounds(0, 0, this.z, this.s);
                canvas.translate(0.0f, (float) i9);
                this.q.draw(canvas);
                canvas.translate((float) i12, 0.0f);
                this.p.draw(canvas);
                canvas.translate((float) (-i12), (float) (-i9));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean n(float f2, float f3) {
        if (f3 >= ((float) (this.A - this.r))) {
            int i = this.x;
            int i2 = this.w;
            if (f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) ((i2 / 2) + i))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean o(float f2, float f3) {
        if (q4.o(this.B) == 1) {
            if (f2 > ((float) (this.n / 2))) {
                return false;
            }
        } else if (f2 < ((float) (this.z - this.n))) {
            return false;
        }
        int i = this.u;
        int i2 = this.t / 2;
        if (f3 < ((float) (i - i2)) || f3 > ((float) (i2 + i))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        this.B.invalidate();
    }

    /* access modifiers changed from: package-private */
    public void r(int i) {
        if (i == 2 && this.E != 2) {
            this.c.setState(M);
            m();
        }
        if (i == 0) {
            this.B.invalidate();
        } else {
            s();
        }
        if (this.E == 2 && i != 2) {
            this.c.setState(N);
            m();
            this.B.postDelayed(this.K, (long) 1200);
        } else if (i == 1) {
            m();
            this.B.postDelayed(this.K, (long) 1500);
        }
        this.E = i;
    }

    public void s() {
        int i = this.J;
        if (i != 0) {
            if (i == 3) {
                this.I.cancel();
            } else {
                return;
            }
        }
        this.J = 1;
        ValueAnimator valueAnimator = this.I;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.I.setDuration(500L);
        this.I.setStartDelay(0);
        this.I.start();
    }

    /* access modifiers changed from: package-private */
    public void t(int i, int i2) {
        int computeVerticalScrollRange = this.B.computeVerticalScrollRange();
        int i3 = this.A;
        this.C = computeVerticalScrollRange - i3 > 0 && i3 >= this.a;
        int computeHorizontalScrollRange = this.B.computeHorizontalScrollRange();
        int i4 = this.z;
        boolean z2 = computeHorizontalScrollRange - i4 > 0 && i4 >= this.a;
        this.D = z2;
        boolean z3 = this.C;
        if (z3 || z2) {
            if (z3) {
                float f2 = (float) i3;
                this.u = (int) ((((f2 / 2.0f) + ((float) i2)) * f2) / ((float) computeVerticalScrollRange));
                this.t = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.D) {
                float f3 = (float) i4;
                this.x = (int) ((((f3 / 2.0f) + ((float) i)) * f3) / ((float) computeHorizontalScrollRange));
                this.w = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.E;
            if (i5 == 0 || i5 == 1) {
                r(1);
            }
        } else if (this.E != 0) {
            r(0);
        }
    }
}
