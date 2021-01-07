package androidx.core.widget;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class a implements View.OnTouchListener {
    private static final int z = ViewConfiguration.getTapTimeout();
    final C0030a a;
    private final Interpolator b = new AccelerateInterpolator();
    final View c;
    private Runnable f;
    private float[] n = {0.0f, 0.0f};
    private float[] o = {Float.MAX_VALUE, Float.MAX_VALUE};
    private int p;
    private int q;
    private float[] r = {0.0f, 0.0f};
    private float[] s = {0.0f, 0.0f};
    private float[] t = {Float.MAX_VALUE, Float.MAX_VALUE};
    private boolean u;
    boolean v;
    boolean w;
    boolean x;
    private boolean y;

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    public static class C0030a {
        private int a;
        private int b;
        private float c;
        private float d;
        private long e = Long.MIN_VALUE;
        private long f = 0;
        private int g = 0;
        private int h = 0;
        private long i = -1;
        private float j;
        private int k;

        C0030a() {
        }

        private float e(long j2) {
            long j3 = this.e;
            if (j2 < j3) {
                return 0.0f;
            }
            long j4 = this.i;
            if (j4 < 0 || j2 < j4) {
                return a.c(((float) (j2 - j3)) / ((float) this.a), 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.j;
            return (f2 * a.c(((float) (j2 - j4)) / ((float) this.k), 0.0f, 1.0f)) + (1.0f - f2);
        }

        public void a() {
            if (this.f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float e2 = e(currentAnimationTimeMillis);
                this.f = currentAnimationTimeMillis;
                float f2 = ((float) (currentAnimationTimeMillis - this.f)) * ((e2 * 4.0f) + (-4.0f * e2 * e2));
                this.g = (int) (this.c * f2);
                this.h = (int) (f2 * this.d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.g;
        }

        public int c() {
            return this.h;
        }

        public int d() {
            float f2 = this.c;
            return (int) (f2 / Math.abs(f2));
        }

        public int f() {
            float f2 = this.d;
            return (int) (f2 / Math.abs(f2));
        }

        public boolean g() {
            return this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long) this.k);
        }

        public void h() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i2 = (int) (currentAnimationTimeMillis - this.e);
            int i3 = this.b;
            if (i2 > i3) {
                i2 = i3;
            } else if (i2 < 0) {
                i2 = 0;
            }
            this.k = i2;
            this.j = e(currentAnimationTimeMillis);
            this.i = currentAnimationTimeMillis;
        }

        public void i(int i2) {
            this.b = i2;
        }

        public void j(int i2) {
            this.a = i2;
        }

        public void k(float f2, float f3) {
            this.c = f2;
            this.d = f3;
        }

        public void l() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.e = currentAnimationTimeMillis;
            this.i = -1;
            this.f = currentAnimationTimeMillis;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }

    /* access modifiers changed from: private */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.x) {
                if (aVar.v) {
                    aVar.v = false;
                    aVar.a.l();
                }
                C0030a aVar2 = a.this.a;
                if (aVar2.g() || !a.this.g()) {
                    a.this.x = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.w) {
                    aVar3.w = false;
                    aVar3.getClass();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    aVar3.c.onTouchEvent(obtain);
                    obtain.recycle();
                }
                aVar2.a();
                a.this.e(aVar2.b(), aVar2.c());
                View view = a.this.c;
                int i = q4.g;
                int i2 = Build.VERSION.SDK_INT;
                view.postOnAnimation(this);
            }
        }
    }

    public a(View view) {
        C0030a aVar = new C0030a();
        this.a = aVar;
        this.c = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.t;
        float f3 = ((float) ((int) ((1575.0f * f2) + 0.5f))) / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float[] fArr2 = this.s;
        float f4 = ((float) ((int) ((f2 * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f4;
        fArr2[1] = f4;
        this.p = 1;
        float[] fArr3 = this.o;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.n;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.r;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.q = z;
        aVar.j(500);
        aVar.i(500);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float b(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.n
            r0 = r0[r4]
            float[] r1 = r3.o
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = c(r0, r2, r1)
            float r1 = r3.d(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.d(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0026
            android.view.animation.Interpolator r6 = r3.b
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x0030
        L_0x0026:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0039
            android.view.animation.Interpolator r6 = r3.b
            float r5 = r6.getInterpolation(r5)
        L_0x0030:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = c(r5, r6, r0)
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003f
            return r2
        L_0x003f:
            float[] r6 = r3.r
            r6 = r6[r4]
            float[] r0 = r3.s
            r0 = r0[r4]
            float[] r1 = r3.t
            r4 = r1[r4]
            float r6 = r6 * r7
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0058
            float r5 = r5 * r6
            float r4 = c(r5, r0, r4)
            return r4
        L_0x0058:
            float r5 = -r5
            float r5 = r5 * r6
            float r4 = c(r5, r0, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.b(int, float, float, float):float");
    }

    static float c(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    private float d(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i = this.p;
        if (i == 0 || i == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.x && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    public abstract boolean a(int i);

    public abstract void e(int i, int i2);

    public a f(boolean z2) {
        if (this.y && !z2) {
            if (this.v) {
                this.x = false;
            } else {
                this.a.h();
            }
        }
        this.y = z2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        C0030a aVar = this.a;
        int f2 = aVar.f();
        aVar.d();
        return f2 != 0 && a(f2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x008a;
     */
    @Override // android.view.View.OnTouchListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.y
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x0024
            if (r0 == r2) goto L_0x0017
            r3 = 2
            if (r0 == r3) goto L_0x0028
            r6 = 3
            if (r0 == r6) goto L_0x0017
            goto L_0x008a
        L_0x0017:
            boolean r6 = r5.v
            if (r6 == 0) goto L_0x001e
            r5.x = r1
            goto L_0x008a
        L_0x001e:
            androidx.core.widget.a$a r6 = r5.a
            r6.h()
            goto L_0x008a
        L_0x0024:
            r5.w = r2
            r5.u = r1
        L_0x0028:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.b(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.b(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.a
            r7.k(r0, r6)
            boolean r6 = r5.x
            if (r6 != 0) goto L_0x008a
            boolean r6 = r5.g()
            if (r6 == 0) goto L_0x008a
            java.lang.Runnable r6 = r5.f
            if (r6 != 0) goto L_0x006a
            androidx.core.widget.a$b r6 = new androidx.core.widget.a$b
            r6.<init>()
            r5.f = r6
        L_0x006a:
            r5.x = r2
            r5.v = r2
            boolean r6 = r5.u
            if (r6 != 0) goto L_0x0083
            int r6 = r5.q
            if (r6 <= 0) goto L_0x0083
            android.view.View r7 = r5.c
            java.lang.Runnable r0 = r5.f
            long r3 = (long) r6
            int r6 = defpackage.q4.g
            int r6 = android.os.Build.VERSION.SDK_INT
            r7.postOnAnimationDelayed(r0, r3)
            goto L_0x0088
        L_0x0083:
            java.lang.Runnable r6 = r5.f
            r6.run()
        L_0x0088:
            r5.u = r2
        L_0x008a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
