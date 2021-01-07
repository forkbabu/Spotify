package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.Constants;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.List;

public class p extends RecyclerView.l implements RecyclerView.n {
    RecyclerView A;
    final Runnable B = new a();
    VelocityTracker C;
    private List<RecyclerView.b0> D;
    private List<Integer> E;
    private RecyclerView.h F = null;
    View G = null;
    int H = -1;
    c4 I;
    private e J;
    private final RecyclerView.p K = new b();
    private Rect L;
    private long M;
    final List<View> a = new ArrayList();
    private final float[] b = new float[2];
    RecyclerView.b0 c = null;
    float f;
    float n;
    private float o;
    private float p;
    float q;
    float r;
    private float s;
    private float t;
    int u = -1;
    d v;
    private int w = 0;
    int x;
    List<f> y = new ArrayList();
    private int z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVar = p.this;
            if (pVar.c != null && pVar.v()) {
                p pVar2 = p.this;
                RecyclerView.b0 b0Var = pVar2.c;
                if (b0Var != null) {
                    pVar2.t(b0Var);
                }
                p pVar3 = p.this;
                pVar3.A.removeCallbacks(pVar3.B);
                RecyclerView recyclerView = p.this.A;
                int i = q4.g;
                int i2 = Build.VERSION.SDK_INT;
                recyclerView.postOnAnimation(this);
            }
        }
    }

    class b implements RecyclerView.p {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            p.this.I.a(motionEvent);
            VelocityTracker velocityTracker = p.this.C;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (p.this.u != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(p.this.u);
                if (findPointerIndex >= 0) {
                    p.this.n(actionMasked, motionEvent, findPointerIndex);
                }
                p pVar = p.this;
                RecyclerView.b0 b0Var = pVar.c;
                if (b0Var != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = pVar.C;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                p pVar2 = p.this;
                                if (pointerId == pVar2.u) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    pVar2.u = motionEvent.getPointerId(i);
                                    p pVar3 = p.this;
                                    pVar3.y(motionEvent, pVar3.x, actionIndex);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (findPointerIndex >= 0) {
                            pVar.y(motionEvent, pVar.x, findPointerIndex);
                            p.this.t(b0Var);
                            p pVar4 = p.this;
                            pVar4.A.removeCallbacks(pVar4.B);
                            p.this.B.run();
                            p.this.A.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    p.this.w(null, 0);
                    p.this.u = -1;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            p.this.I.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            f fVar = null;
            if (actionMasked == 0) {
                p.this.u = motionEvent.getPointerId(0);
                p.this.f = motionEvent.getX();
                p.this.n = motionEvent.getY();
                p pVar = p.this;
                VelocityTracker velocityTracker = pVar.C;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                pVar.C = VelocityTracker.obtain();
                p pVar2 = p.this;
                if (pVar2.c == null) {
                    if (!pVar2.y.isEmpty()) {
                        View q = pVar2.q(motionEvent);
                        int size = pVar2.y.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            f fVar2 = pVar2.y.get(size);
                            if (fVar2.n.a == q) {
                                fVar = fVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (fVar != null) {
                        p pVar3 = p.this;
                        pVar3.f -= fVar.r;
                        pVar3.n -= fVar.s;
                        pVar3.p(fVar.n, true);
                        if (p.this.a.remove(fVar.n.a)) {
                            p pVar4 = p.this;
                            pVar4.v.b(pVar4.A, fVar.n);
                        }
                        p.this.w(fVar.n, fVar.o);
                        p pVar5 = p.this;
                        pVar5.y(motionEvent, pVar5.x, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                p pVar6 = p.this;
                pVar6.u = -1;
                pVar6.w(null, 0);
            } else {
                int i = p.this.u;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    p.this.n(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker2 = p.this.C;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (p.this.c != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void f(boolean z) {
            if (z) {
                p.this.w(null, 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends f {
        final /* synthetic */ int w;
        final /* synthetic */ RecyclerView.b0 x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(RecyclerView.b0 b0Var, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.b0 b0Var2) {
            super(b0Var, i, i2, f, f2, f3, f4);
            this.w = i3;
            this.x = b0Var2;
        }

        @Override // androidx.recyclerview.widget.p.f, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.u) {
                this.n.e0(true);
            }
            this.u = true;
            if (!this.t) {
                if (this.w <= 0) {
                    p pVar = p.this;
                    pVar.v.b(pVar.A, this.x);
                } else {
                    p.this.a.add(this.x.a);
                    this.q = true;
                    int i = this.w;
                    if (i > 0) {
                        p pVar2 = p.this;
                        pVar2.A.post(new q(pVar2, this, i));
                    }
                }
                p pVar3 = p.this;
                View view = pVar3.G;
                View view2 = this.x.a;
                if (view == view2) {
                    pVar3.u(view2);
                }
            }
        }
    }

    public static abstract class d {
        private static final Interpolator b = new a();
        private static final Interpolator c = new b();
        private int a = -1;

        static class a implements Interpolator {
            a() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        static class b implements Interpolator {
            b() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int d(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (i4 ^ -1);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= -789517 & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        public static int m(int i, int i2) {
            return (i << 16) | (i2 << 8) | ((i2 | i) << 0);
        }

        public boolean a(RecyclerView recyclerView, RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2) {
            return true;
        }

        public void b(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            View view = b0Var.a;
            if (Build.VERSION.SDK_INT >= 21) {
                Object tag = view.getTag(C0707R.id.item_touch_helper_previous_elevation);
                if (tag instanceof Float) {
                    q4.N(view, ((Float) tag).floatValue());
                }
                view.setTag(C0707R.id.item_touch_helper_previous_elevation, null);
            }
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public int c(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (i4 ^ -1);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= -3158065 & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        /* access modifiers changed from: package-private */
        public final int e(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            return c(f(recyclerView, b0Var), q4.o(recyclerView));
        }

        public abstract int f(RecyclerView recyclerView, RecyclerView.b0 b0Var);

        public float g(float f) {
            return f;
        }

        public float h(RecyclerView.b0 b0Var) {
            return 0.5f;
        }

        /* access modifiers changed from: package-private */
        public boolean i(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            return (c(f(recyclerView, b0Var), q4.o(recyclerView)) & 16711680) != 0;
        }

        public int j(RecyclerView recyclerView, int i, int i2, long j) {
            if (this.a == -1) {
                this.a = recyclerView.getResources().getDimensionPixelSize(C0707R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            int i3 = this.a;
            float f = 1.0f;
            float min = Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i)) - 1.0f;
            int signum = (int) (((float) (((int) Math.signum((float) i2)) * i3)) * ((min * min * min * min * min) + 1.0f));
            if (j <= 2000) {
                f = ((float) j) / 2000.0f;
            }
            int i4 = (int) (((float) signum) * f * f * f * f * f);
            if (i4 != 0) {
                return i4;
            }
            if (i2 > 0) {
                return 1;
            }
            return -1;
        }

        public boolean k() {
            return true;
        }

        public boolean l() {
            return true;
        }

        public void n(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var, float f, float f2, int i, boolean z) {
            View view = b0Var.a;
            if (Build.VERSION.SDK_INT >= 21 && z && view.getTag(C0707R.id.item_touch_helper_previous_elevation) == null) {
                Float valueOf = Float.valueOf(q4.k(view));
                int childCount = recyclerView.getChildCount();
                float f3 = 0.0f;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view) {
                        float k = q4.k(childAt);
                        if (k > f3) {
                            f3 = k;
                        }
                    }
                }
                q4.N(view, f3 + 1.0f);
                view.setTag(C0707R.id.item_touch_helper_previous_elevation, valueOf);
            }
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        public abstract boolean o(RecyclerView recyclerView, RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2);

        public void p(RecyclerView.b0 b0Var, int i) {
        }

        public abstract void q(RecyclerView.b0 b0Var, int i);
    }

    private class e extends GestureDetector.SimpleOnGestureListener {
        private boolean a = true;

        e() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View q;
            RecyclerView.b0 a0;
            int i;
            if (this.a && (q = p.this.q(motionEvent)) != null && (a0 = p.this.A.a0(q)) != null) {
                p pVar = p.this;
                if (pVar.v.i(pVar.A, a0) && motionEvent.getPointerId(0) == (i = p.this.u)) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    p pVar2 = p.this;
                    pVar2.f = x;
                    pVar2.n = y;
                    pVar2.r = 0.0f;
                    pVar2.q = 0.0f;
                    if (pVar2.v.l()) {
                        p.this.w(a0, 2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class f implements Animator.AnimatorListener {
        final float a;
        final float b;
        final float c;
        final float f;
        final RecyclerView.b0 n;
        final int o;
        private final ValueAnimator p;
        boolean q;
        float r;
        float s;
        boolean t = false;
        boolean u = false;
        private float v;

        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        f(RecyclerView.b0 b0Var, int i, int i2, float f2, float f3, float f4, float f5) {
            this.o = i2;
            this.n = b0Var;
            this.a = f2;
            this.b = f3;
            this.c = f4;
            this.f = f5;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.p = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(b0Var.a);
            ofFloat.addListener(this);
            this.v = 0.0f;
        }

        public void a() {
            this.p.cancel();
        }

        public void b(long j) {
            this.p.setDuration(j);
        }

        public void c(float f2) {
            this.v = f2;
        }

        public void d() {
            this.n.e0(false);
            this.p.start();
        }

        public void e() {
            float f2 = this.a;
            float f3 = this.c;
            if (f2 == f3) {
                this.r = this.n.a.getTranslationX();
            } else {
                this.r = je.a(f3, f2, this.v, f2);
            }
            float f4 = this.b;
            float f5 = this.f;
            if (f4 == f5) {
                this.s = this.n.a.getTranslationY();
            } else {
                this.s = je.a(f5, f4, this.v, f4);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.v = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.u) {
                this.n.e0(true);
            }
            this.u = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static abstract class g extends d {
        private int d;

        public g(int i, int i2) {
            this.d = i;
        }

        @Override // androidx.recyclerview.widget.p.d
        public int f(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            return d.m(this.d, r(recyclerView, b0Var));
        }

        public abstract int r(RecyclerView recyclerView, RecyclerView.b0 b0Var);
    }

    public interface h {
        void i(View view, View view2, int i, int i2);
    }

    public p(d dVar) {
        this.v = dVar;
    }

    private int m(RecyclerView.b0 b0Var, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = 4;
        int i3 = this.q > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.C;
        if (velocityTracker != null && this.u > -1) {
            d dVar = this.v;
            float f2 = this.p;
            dVar.getClass();
            velocityTracker.computeCurrentVelocity(Constants.ONE_SECOND, f2);
            float xVelocity = this.C.getXVelocity(this.u);
            float yVelocity = this.C.getYVelocity(this.u);
            if (xVelocity > 0.0f) {
                i2 = 8;
            }
            float abs = Math.abs(xVelocity);
            if ((i2 & i) != 0 && i3 == i2 && abs >= this.v.g(this.o) && abs > Math.abs(yVelocity)) {
                return i2;
            }
        }
        float h2 = this.v.h(b0Var) * ((float) this.A.getWidth());
        if ((i & i3) == 0 || Math.abs(this.q) <= h2) {
            return 0;
        }
        return i3;
    }

    private int o(RecyclerView.b0 b0Var, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = 1;
        int i3 = this.r > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.C;
        if (velocityTracker != null && this.u > -1) {
            d dVar = this.v;
            float f2 = this.p;
            dVar.getClass();
            velocityTracker.computeCurrentVelocity(Constants.ONE_SECOND, f2);
            float xVelocity = this.C.getXVelocity(this.u);
            float yVelocity = this.C.getYVelocity(this.u);
            if (yVelocity > 0.0f) {
                i2 = 2;
            }
            float abs = Math.abs(yVelocity);
            if ((i2 & i) != 0 && i2 == i3 && abs >= this.v.g(this.o) && abs > Math.abs(xVelocity)) {
                return i2;
            }
        }
        float h2 = this.v.h(b0Var) * ((float) this.A.getHeight());
        if ((i & i3) == 0 || Math.abs(this.r) <= h2) {
            return 0;
        }
        return i3;
    }

    private void r(float[] fArr) {
        if ((this.x & 12) != 0) {
            fArr[0] = (this.s + this.q) - ((float) this.c.a.getLeft());
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.x & 3) != 0) {
            fArr[1] = (this.t + this.r) - ((float) this.c.a.getTop());
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    private static boolean s(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void b(View view) {
        u(view);
        RecyclerView.b0 a0 = this.A.a0(view);
        if (a0 != null) {
            RecyclerView.b0 b0Var = this.c;
            if (b0Var == null || a0 != b0Var) {
                p(a0, false);
                if (this.a.remove(a0.a)) {
                    this.v.b(this.A, a0);
                    return;
                }
                return;
            }
            w(null, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void d(View view) {
    }

    public void g(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.A;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A0(this);
                this.A.C0(this.K);
                this.A.B0(this);
                for (int size = this.y.size() - 1; size >= 0; size--) {
                    this.v.b(this.A, this.y.get(0).n);
                }
                this.y.clear();
                this.G = null;
                this.H = -1;
                VelocityTracker velocityTracker = this.C;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.C = null;
                }
                e eVar = this.J;
                if (eVar != null) {
                    eVar.a();
                    this.J = null;
                }
                if (this.I != null) {
                    this.I = null;
                }
            }
            this.A = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.o = resources.getDimension(C0707R.dimen.item_touch_helper_swipe_escape_velocity);
                this.p = resources.getDimension(C0707R.dimen.item_touch_helper_swipe_escape_max_velocity);
                this.z = ViewConfiguration.get(this.A.getContext()).getScaledTouchSlop();
                this.A.k(this, -1);
                this.A.m(this.K);
                this.A.l(this);
                this.J = new e();
                this.I = new c4(this.A.getContext(), this.J);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        float f2;
        float f3;
        this.H = -1;
        if (this.c != null) {
            r(this.b);
            float[] fArr = this.b;
            float f4 = fArr[0];
            f2 = fArr[1];
            f3 = f4;
        } else {
            f3 = 0.0f;
            f2 = 0.0f;
        }
        d dVar = this.v;
        RecyclerView.b0 b0Var = this.c;
        List<f> list = this.y;
        int i = this.w;
        dVar.getClass();
        int i2 = 0;
        for (int size = list.size(); i2 < size; size = size) {
            f fVar = list.get(i2);
            fVar.e();
            int save = canvas.save();
            dVar.n(canvas, recyclerView, fVar.n, fVar.r, fVar.s, fVar.o, false);
            canvas.restoreToCount(save);
            i2++;
        }
        if (b0Var != null) {
            int save2 = canvas.save();
            dVar.n(canvas, recyclerView, b0Var, f3, f2, i, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void l(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        boolean z2 = false;
        if (this.c != null) {
            r(this.b);
            float[] fArr = this.b;
            float f2 = fArr[0];
            float f3 = fArr[1];
        }
        d dVar = this.v;
        RecyclerView.b0 b0Var = this.c;
        List<f> list = this.y;
        dVar.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int save = canvas.save();
            View view = list.get(i).n.a;
            canvas.restoreToCount(save);
        }
        if (b0Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            f fVar = list.get(i2);
            boolean z3 = fVar.u;
            if (z3 && !fVar.q) {
                list.remove(i2);
            } else if (!z3) {
                z2 = true;
            }
        }
        if (z2) {
            recyclerView.invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public void n(int i, MotionEvent motionEvent, int i2) {
        int e2;
        View q2;
        if (this.c == null && i == 2 && this.w != 2 && this.v.k() && this.A.getScrollState() != 1) {
            RecyclerView.m layoutManager = this.A.getLayoutManager();
            int i3 = this.u;
            RecyclerView.b0 b0Var = null;
            if (i3 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i3);
                float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f);
                float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.n);
                float f2 = (float) this.z;
                if ((abs >= f2 || abs2 >= f2) && ((abs <= abs2 || !layoutManager.B()) && ((abs2 <= abs || !layoutManager.C()) && (q2 = q(motionEvent)) != null))) {
                    b0Var = this.A.a0(q2);
                }
            }
            if (b0Var != null && (e2 = (this.v.e(this.A, b0Var) & 65280) >> 8) != 0) {
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f3 = x2 - this.f;
                float f4 = y2 - this.n;
                float abs3 = Math.abs(f3);
                float abs4 = Math.abs(f4);
                float f5 = (float) this.z;
                if (abs3 >= f5 || abs4 >= f5) {
                    if (abs3 > abs4) {
                        if (f3 < 0.0f && (e2 & 4) == 0) {
                            return;
                        }
                        if (f3 > 0.0f && (e2 & 8) == 0) {
                            return;
                        }
                    } else if (f4 < 0.0f && (e2 & 1) == 0) {
                        return;
                    } else {
                        if (f4 > 0.0f && (e2 & 2) == 0) {
                            return;
                        }
                    }
                    this.r = 0.0f;
                    this.q = 0.0f;
                    this.u = motionEvent.getPointerId(0);
                    w(b0Var, 1);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p(RecyclerView.b0 b0Var, boolean z2) {
        for (int size = this.y.size() - 1; size >= 0; size--) {
            f fVar = this.y.get(size);
            if (fVar.n == b0Var) {
                fVar.t |= z2;
                if (!fVar.u) {
                    fVar.a();
                }
                this.y.remove(size);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public View q(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        RecyclerView.b0 b0Var = this.c;
        if (b0Var != null) {
            View view = b0Var.a;
            if (s(view, x2, y2, this.s + this.q, this.t + this.r)) {
                return view;
            }
        }
        for (int size = this.y.size() - 1; size >= 0; size--) {
            f fVar = this.y.get(size);
            View view2 = fVar.n.a;
            if (s(view2, x2, y2, fVar.r, fVar.s)) {
                return view2;
            }
        }
        return this.A.M(x2, y2);
    }

    /* access modifiers changed from: package-private */
    public void t(RecyclerView.b0 b0Var) {
        List<RecyclerView.b0> list;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i;
        int i2;
        if (!this.A.isLayoutRequested() && this.w == 2) {
            this.v.getClass();
            int i3 = (int) (this.s + this.q);
            int i4 = (int) (this.t + this.r);
            if (((float) Math.abs(i4 - b0Var.a.getTop())) >= ((float) b0Var.a.getHeight()) * 0.5f || ((float) Math.abs(i3 - b0Var.a.getLeft())) >= ((float) b0Var.a.getWidth()) * 0.5f) {
                List<RecyclerView.b0> list2 = this.D;
                if (list2 == null) {
                    this.D = new ArrayList();
                    this.E = new ArrayList();
                } else {
                    list2.clear();
                    this.E.clear();
                }
                this.v.getClass();
                int round = Math.round(this.s + this.q) - 0;
                int round2 = Math.round(this.t + this.r) - 0;
                int width = b0Var.a.getWidth() + round + 0;
                int height = b0Var.a.getHeight() + round2 + 0;
                int i5 = (round + width) / 2;
                int i6 = (round2 + height) / 2;
                RecyclerView.m layoutManager = this.A.getLayoutManager();
                int W = layoutManager.W();
                int i7 = 0;
                while (i7 < W) {
                    View V = layoutManager.V(i7);
                    if (V != b0Var.a && V.getBottom() >= round2 && V.getTop() <= height && V.getRight() >= round && V.getLeft() <= width) {
                        RecyclerView.b0 a0 = this.A.a0(V);
                        i2 = round;
                        i = round2;
                        if (this.v.a(this.A, this.c, a0)) {
                            int abs5 = Math.abs(i5 - ((V.getRight() + V.getLeft()) / 2));
                            int abs6 = Math.abs(i6 - ((V.getBottom() + V.getTop()) / 2));
                            int i8 = (abs6 * abs6) + (abs5 * abs5);
                            int i9 = 0;
                            int i10 = 0;
                            for (int size = this.D.size(); i10 < size && i8 > this.E.get(i10).intValue(); size = size) {
                                i9++;
                                i10++;
                            }
                            this.D.add(i9, a0);
                            this.E.add(i9, Integer.valueOf(i8));
                        }
                    } else {
                        i2 = round;
                        i = round2;
                    }
                    i7++;
                    round = i2;
                    round2 = i;
                }
                List<RecyclerView.b0> list3 = this.D;
                if (list3.size() != 0) {
                    this.v.getClass();
                    int width2 = b0Var.a.getWidth() + i3;
                    int height2 = b0Var.a.getHeight() + i4;
                    int left2 = i3 - b0Var.a.getLeft();
                    int top2 = i4 - b0Var.a.getTop();
                    int size2 = list3.size();
                    RecyclerView.b0 b0Var2 = null;
                    int i11 = 0;
                    int i12 = -1;
                    while (i11 < size2) {
                        RecyclerView.b0 b0Var3 = list3.get(i11);
                        if (left2 <= 0 || (right = b0Var3.a.getRight() - width2) >= 0) {
                            list = list3;
                        } else {
                            list = list3;
                            if (b0Var3.a.getRight() > b0Var.a.getRight() && (abs4 = Math.abs(right)) > i12) {
                                i12 = abs4;
                                b0Var2 = b0Var3;
                            }
                        }
                        if (left2 < 0 && (left = b0Var3.a.getLeft() - i3) > 0 && b0Var3.a.getLeft() < b0Var.a.getLeft() && (abs3 = Math.abs(left)) > i12) {
                            i12 = abs3;
                            b0Var2 = b0Var3;
                        }
                        if (top2 < 0 && (top = b0Var3.a.getTop() - i4) > 0 && b0Var3.a.getTop() < b0Var.a.getTop() && (abs2 = Math.abs(top)) > i12) {
                            i12 = abs2;
                            b0Var2 = b0Var3;
                        }
                        if (top2 > 0 && (bottom = b0Var3.a.getBottom() - height2) < 0 && b0Var3.a.getBottom() > b0Var.a.getBottom() && (abs = Math.abs(bottom)) > i12) {
                            i12 = abs;
                            b0Var2 = b0Var3;
                        }
                        i11++;
                        list3 = list;
                    }
                    if (b0Var2 == null) {
                        this.D.clear();
                        this.E.clear();
                        return;
                    }
                    int w2 = b0Var2.w();
                    b0Var.w();
                    if (this.v.o(this.A, b0Var, b0Var2)) {
                        d dVar = this.v;
                        RecyclerView recyclerView = this.A;
                        dVar.getClass();
                        RecyclerView.m layoutManager2 = recyclerView.getLayoutManager();
                        if (layoutManager2 instanceof h) {
                            ((h) layoutManager2).i(b0Var.a, b0Var2.a, i3, i4);
                            return;
                        }
                        if (layoutManager2.B()) {
                            if (layoutManager2.b0(b0Var2.a) <= recyclerView.getPaddingLeft()) {
                                recyclerView.I0(w2);
                            }
                            if (layoutManager2.d0(b0Var2.a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                recyclerView.I0(w2);
                            }
                        }
                        if (layoutManager2.C()) {
                            if (layoutManager2.e0(b0Var2.a) <= recyclerView.getPaddingTop()) {
                                recyclerView.I0(w2);
                            }
                            if (layoutManager2.a0(b0Var2.a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                recyclerView.I0(w2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void u(View view) {
        if (view == this.G) {
            this.G = null;
            if (this.F != null) {
                this.A.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean v() {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.p.v():boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ad, code lost:
        if (r2 > 0) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void w(androidx.recyclerview.widget.RecyclerView.b0 r22, int r23) {
        /*
        // Method dump skipped, instructions count: 488
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.p.w(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    public void x(RecyclerView.b0 b0Var) {
        if (!this.v.i(this.A, b0Var)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
        } else if (b0Var.a.getParent() != this.A) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            VelocityTracker velocityTracker = this.C;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.C = VelocityTracker.obtain();
            this.r = 0.0f;
            this.q = 0.0f;
            w(b0Var, 2);
        }
    }

    /* access modifiers changed from: package-private */
    public void y(MotionEvent motionEvent, int i, int i2) {
        float x2 = motionEvent.getX(i2);
        float y2 = motionEvent.getY(i2);
        float f2 = x2 - this.f;
        this.q = f2;
        this.r = y2 - this.n;
        if ((i & 4) == 0) {
            this.q = Math.max(0.0f, f2);
        }
        if ((i & 8) == 0) {
            this.q = Math.min(0.0f, this.q);
        }
        if ((i & 1) == 0) {
            this.r = Math.max(0.0f, this.r);
        }
        if ((i & 2) == 0) {
            this.r = Math.min(0.0f, this.r);
        }
    }
}
