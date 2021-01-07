package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.i0;
import androidx.recyclerview.widget.j0;
import androidx.recyclerview.widget.o;
import com.spotify.encore.mobile.snackbar.SnackbarUtilsKt;
import com.spotify.music.C0707R;
import defpackage.d5;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements f4 {
    private static final int[] H0 = {16843830};
    static final boolean I0;
    static final boolean J0;
    static final boolean K0 = true;
    static final boolean L0;
    private static final Class<?>[] M0;
    static final Interpolator N0 = new c();
    boolean A;
    private h4 A0;
    boolean B;
    private final int[] B0;
    boolean C;
    private final int[] C0;
    boolean D;
    final int[] D0;
    private int E;
    final List<b0> E0;
    boolean F;
    private Runnable F0;
    boolean G;
    private final j0.b G0;
    private boolean H;
    private int I;
    boolean J;
    private final AccessibilityManager K;
    private List<n> L;
    boolean M;
    boolean N;
    private int O;
    private int P;
    private i Q;
    private EdgeEffect R;
    private EdgeEffect S;
    private EdgeEffect T;
    private EdgeEffect U;
    j V;
    private int W;
    private final u a;
    private int a0;
    final s b;
    private VelocityTracker b0;
    private v c;
    private int c0;
    private int d0;
    private int e0;
    a f;
    private int f0;
    private int g0;
    private o h0;
    private final int i0;
    private final int j0;
    private float k0;
    private float l0;
    private boolean m0;
    f n;
    final a0 n0;
    final j0 o;
    o o0;
    boolean p;
    o.b p0;
    final Runnable q;
    final y q0;
    final Rect r;
    private q r0;
    private final Rect s;
    private List<q> s0;
    final RectF t;
    boolean t0;
    e u;
    boolean u0;
    m v;
    private j.b v0;
    t w;
    boolean w0;
    final ArrayList<l> x;
    c0 x0;
    private final ArrayList<p> y;
    private h y0;
    private p z;
    private final int[] z0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.D && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.A) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.G) {
                    recyclerView2.F = true;
                } else {
                    recyclerView2.w();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class a0 implements Runnable {
        private int a;
        private int b;
        OverScroller c;
        Interpolator f;
        private boolean n = false;
        private boolean o = false;

        a0() {
            Interpolator interpolator = RecyclerView.N0;
            this.f = interpolator;
            this.c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public void a(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.b = 0;
            this.a = 0;
            Interpolator interpolator = this.f;
            Interpolator interpolator2 = RecyclerView.N0;
            if (interpolator != interpolator2) {
                this.f = interpolator2;
                this.c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            b();
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (this.n) {
                this.o = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            recyclerView.postOnAnimation(this);
        }

        public void c(int i, int i2, int i3, Interpolator interpolator) {
            int i4;
            if (i3 == Integer.MIN_VALUE) {
                int abs = Math.abs(i);
                int abs2 = Math.abs(i2);
                boolean z = abs > abs2;
                int sqrt = (int) Math.sqrt((double) 0);
                int sqrt2 = (int) Math.sqrt((double) ((i2 * i2) + (i * i)));
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                int i5 = width / 2;
                float f2 = (float) width;
                float f3 = (float) i5;
                float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f2) - 0.5f) * 0.47123894f))) * f3) + f3;
                if (sqrt > 0) {
                    i4 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
                } else {
                    if (!z) {
                        abs = abs2;
                    }
                    i4 = (int) (((((float) abs) / f2) + 1.0f) * 300.0f);
                }
                i3 = Math.min(i4, (int) SnackbarUtilsKt.SNACKBAR_ACTION_DURATION);
            }
            if (interpolator == null) {
                interpolator = RecyclerView.N0;
            }
            if (this.f != interpolator) {
                this.f = interpolator;
                this.c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.b = 0;
            this.a = 0;
            RecyclerView.this.setScrollState(2);
            this.c.startScroll(0, 0, i, i2, i3);
            if (Build.VERSION.SDK_INT < 23) {
                this.c.computeScrollOffset();
            }
            b();
        }

        public void d() {
            RecyclerView.this.removeCallbacks(this);
            this.c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.v == null) {
                d();
                return;
            }
            this.o = false;
            this.n = true;
            recyclerView.w();
            OverScroller overScroller = this.c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.a;
                int i4 = currY - this.b;
                this.a = currX;
                this.b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.D0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.D(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.D0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.v(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.u != null) {
                    int[] iArr3 = recyclerView3.D0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.H0(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.D0;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    x xVar = recyclerView4.v.p;
                    if (xVar != null && !xVar.e() && xVar.f()) {
                        int c2 = RecyclerView.this.q0.c();
                        if (c2 == 0) {
                            xVar.o();
                        } else if (xVar.d() >= c2) {
                            xVar.m(c2 - 1);
                            xVar.g(i, i2);
                        } else {
                            xVar.g(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.x.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.D0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.E(i, i2, i3, i4, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.D0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.F(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                x xVar2 = RecyclerView.this.v.p;
                if ((xVar2 != null && xVar2.e()) || !z) {
                    b();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    o oVar = recyclerView7.o0;
                    if (oVar != null) {
                        oVar.a(recyclerView7, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.e(i7, currVelocity);
                    }
                    if (RecyclerView.L0) {
                        o.b bVar = RecyclerView.this.p0;
                        int[] iArr7 = bVar.c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.d = 0;
                    }
                }
            }
            x xVar3 = RecyclerView.this.v.p;
            if (xVar3 != null && xVar3.e()) {
                xVar3.g(0, 0);
            }
            this.n = false;
            if (this.o) {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView8 = RecyclerView.this;
                int i8 = q4.g;
                int i9 = Build.VERSION.SDK_INT;
                recyclerView8.postOnAnimation(this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.r(1);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = RecyclerView.this.V;
            if (jVar != null) {
                jVar.s();
            }
            RecyclerView.this.w0 = false;
        }
    }

    public static abstract class b0 {
        private static final List<Object> B = Collections.emptyList();
        RecyclerView A;
        public final View a;
        WeakReference<RecyclerView> b;
        int c = -1;
        int f = -1;
        long n = -1;
        int o = -1;
        int p = -1;
        b0 q = null;
        b0 r = null;
        int s;
        List<Object> t = null;
        List<Object> u = null;
        private int v = 0;
        s w = null;
        boolean x = false;
        private int y = 0;
        int z = -1;

        public b0(View view) {
            if (view != null) {
                this.a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public final int A() {
            int i = this.p;
            return i == -1 ? this.c : i;
        }

        @Deprecated
        public final int B() {
            int i = this.p;
            return i == -1 ? this.c : i;
        }

        /* access modifiers changed from: package-private */
        public List<Object> C() {
            if ((this.s & 1024) != 0) {
                return B;
            }
            List<Object> list = this.t;
            if (list == null || list.size() == 0) {
                return B;
            }
            return this.u;
        }

        /* access modifiers changed from: package-private */
        public boolean D(int i) {
            return (i & this.s) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean E() {
            return (this.a.getParent() == null || this.a.getParent() == this.A) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean G() {
            return (this.s & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean J() {
            return (this.s & 4) != 0;
        }

        public final boolean K() {
            if ((this.s & 16) == 0) {
                View view = this.a;
                int i = q4.g;
                int i2 = Build.VERSION.SDK_INT;
                if (!view.hasTransientState()) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean P() {
            return (this.s & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean S() {
            return this.w != null;
        }

        /* access modifiers changed from: package-private */
        public boolean U() {
            return (this.s & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean V() {
            return (this.s & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public void W(int i, boolean z2) {
            if (this.f == -1) {
                this.f = this.c;
            }
            if (this.p == -1) {
                this.p = this.c;
            }
            if (z2) {
                this.p += i;
            }
            this.c += i;
            if (this.a.getLayoutParams() != null) {
                ((LayoutParams) this.a.getLayoutParams()).c = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void Y(RecyclerView recyclerView) {
            int i = this.z;
            if (i != -1) {
                this.y = i;
            } else {
                this.y = q4.n(this.a);
            }
            recyclerView.K0(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void a0(RecyclerView recyclerView) {
            recyclerView.K0(this, this.y);
            this.y = 0;
        }

        /* access modifiers changed from: package-private */
        public void b0() {
            this.s = 0;
            this.c = -1;
            this.f = -1;
            this.n = -1;
            this.p = -1;
            this.v = 0;
            this.q = null;
            this.r = null;
            List<Object> list = this.t;
            if (list != null) {
                list.clear();
            }
            this.s &= -1025;
            this.y = 0;
            this.z = -1;
            RecyclerView.s(this);
        }

        /* access modifiers changed from: package-private */
        public void d0(int i, int i2) {
            this.s = (i & i2) | (this.s & (i2 ^ -1));
        }

        public final void e0(boolean z2) {
            int i = this.v;
            int i2 = z2 ? i - 1 : i + 1;
            this.v = i2;
            if (i2 < 0) {
                this.v = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z2 && i2 == 1) {
                this.s |= 16;
            } else if (z2 && i2 == 0) {
                this.s &= -17;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean f0() {
            return (this.s & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean g0() {
            return (this.s & 32) != 0;
        }

        /* access modifiers changed from: package-private */
        public void q(Object obj) {
            if (obj == null) {
                t(1024);
            } else if ((1024 & this.s) == 0) {
                if (this.t == null) {
                    ArrayList arrayList = new ArrayList();
                    this.t = arrayList;
                    this.u = Collections.unmodifiableList(arrayList);
                }
                this.t.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void t(int i) {
            this.s = i | this.s;
        }

        public String toString() {
            StringBuilder Z0 = je.Z0(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            Z0.append(Integer.toHexString(hashCode()));
            Z0.append(" position=");
            Z0.append(this.c);
            Z0.append(" id=");
            Z0.append(this.n);
            Z0.append(", oldPos=");
            Z0.append(this.f);
            Z0.append(", pLpos:");
            Z0.append(this.p);
            StringBuilder sb = new StringBuilder(Z0.toString());
            if (S()) {
                sb.append(" scrap ");
                sb.append(this.x ? "[changeScrap]" : "[attachedScrap]");
            }
            if (J()) {
                sb.append(" invalid");
            }
            if (!G()) {
                sb.append(" unbound");
            }
            boolean z2 = false;
            if ((this.s & 2) != 0) {
                sb.append(" update");
            }
            if (P()) {
                sb.append(" removed");
            }
            if (f0()) {
                sb.append(" ignored");
            }
            if (U()) {
                sb.append(" tmpDetached");
            }
            if (!K()) {
                StringBuilder V0 = je.V0(" not recyclable(");
                V0.append(this.v);
                V0.append(")");
                sb.append(V0.toString());
            }
            if ((this.s & 512) != 0 || J()) {
                z2 = true;
            }
            if (z2) {
                sb.append(" undefined adapter position");
            }
            if (this.a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public void u() {
            this.f = -1;
            this.p = -1;
        }

        /* access modifiers changed from: package-private */
        public void v() {
            this.s &= -33;
        }

        public final int w() {
            RecyclerView recyclerView = this.A;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.V(this);
        }

        public final long x() {
            return this.n;
        }

        public final int z() {
            return this.o;
        }
    }

    static class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements j0.b {
        d() {
        }
    }

    public static abstract class e<VH extends b0> {
        private final f a = new f();
        private boolean b = false;

        public final void A(int i) {
            this.a.d(i, 1, null);
        }

        public final void C(int i) {
            this.a.e(i, 1);
        }

        public final void D(int i, int i2) {
            this.a.c(i, i2);
        }

        public final void E(int i, int i2) {
            this.a.d(i, i2, null);
        }

        public final void F(int i, int i2, Object obj) {
            this.a.d(i, i2, obj);
        }

        public final void G(int i, int i2) {
            this.a.e(i, i2);
        }

        public final void H(int i, int i2) {
            this.a.f(i, i2);
        }

        public final void I(int i) {
            this.a.f(i, 1);
        }

        public void J(RecyclerView recyclerView) {
        }

        public abstract void K(VH vh, int i);

        public void L(VH vh, int i, List<Object> list) {
            K(vh, i);
        }

        public abstract VH M(ViewGroup viewGroup, int i);

        public void N(RecyclerView recyclerView) {
        }

        public boolean O(VH vh) {
            return false;
        }

        public void P(VH vh) {
        }

        public void Q(VH vh) {
        }

        public void R(VH vh) {
        }

        public void T(g gVar) {
            this.a.registerObserver(gVar);
        }

        public void U(boolean z) {
            if (!x()) {
                this.b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void W(g gVar) {
            this.a.unregisterObserver(gVar);
        }

        public final void r(VH vh, int i) {
            vh.c = i;
            if (this.b) {
                vh.n = v(i);
            }
            vh.d0(1, 519);
            androidx.core.os.h.a("RV OnBindView");
            L(vh, i, vh.C());
            List<Object> list = vh.t;
            if (list != null) {
                list.clear();
            }
            vh.s &= -1025;
            ViewGroup.LayoutParams layoutParams = vh.a.getLayoutParams();
            if (layoutParams instanceof LayoutParams) {
                ((LayoutParams) layoutParams).c = true;
            }
            androidx.core.os.h.b();
        }

        public final VH s(ViewGroup viewGroup, int i) {
            try {
                androidx.core.os.h.a("RV CreateView");
                VH M = M(viewGroup, i);
                if (M.a.getParent() == null) {
                    M.o = i;
                    return M;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                androidx.core.os.h.b();
            }
        }

        public abstract int u();

        public long v(int i) {
            return -1;
        }

        public int w(int i) {
            return 0;
        }

        public final boolean x() {
            return this.a.a();
        }

        public final boolean y() {
            return this.b;
        }

        public final void z() {
            this.a.b();
        }
    }

    /* access modifiers changed from: package-private */
    public static class f extends Observable<g> {
        f() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).e(i, i2, 1);
            }
        }

        public void d(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).c(i, i2, obj);
            }
        }

        public void e(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).d(i, i2);
            }
        }

        public void f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).f(i, i2);
            }
        }
    }

    public static abstract class g {
        public void a() {
        }

        public void b(int i, int i2) {
        }

        public void c(int i, int i2, Object obj) {
            b(i, i2);
        }

        public void d(int i, int i2) {
        }

        public void e(int i, int i2, int i3) {
        }

        public void f(int i, int i2) {
        }
    }

    public interface h {
    }

    public static class i {
        /* access modifiers changed from: protected */
        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class j {
        private b a = null;
        private ArrayList<a> b = new ArrayList<>();
        private long c = 120;
        private long d = 120;
        private long e = 250;
        private long f = 250;

        public interface a {
            void a();
        }

        /* access modifiers changed from: package-private */
        public interface b {
        }

        public static class c {
            public int a;
            public int b;
        }

        static int e(b0 b0Var) {
            int i = b0Var.s & 14;
            if (b0Var.J()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int i2 = b0Var.f;
            int w = b0Var.w();
            return (i2 == -1 || w == -1 || i2 == w) ? i : i | 2048;
        }

        public abstract boolean a(b0 b0Var, c cVar, c cVar2);

        public abstract boolean b(b0 b0Var, b0 b0Var2, c cVar, c cVar2);

        public abstract boolean c(b0 b0Var, c cVar, c cVar2);

        public abstract boolean d(b0 b0Var, c cVar, c cVar2);

        public abstract boolean f(b0 b0Var);

        public boolean g(b0 b0Var, List<Object> list) {
            return f(b0Var);
        }

        public final void h(b0 b0Var) {
            b bVar = this.a;
            if (bVar != null) {
                k kVar = (k) bVar;
                kVar.getClass();
                boolean z = true;
                b0Var.e0(true);
                if (b0Var.q != null && b0Var.r == null) {
                    b0Var.q = null;
                }
                b0Var.r = null;
                if ((b0Var.s & 16) == 0) {
                    z = false;
                }
                if (!z) {
                    RecyclerView recyclerView = RecyclerView.this;
                    View view = b0Var.a;
                    recyclerView.O0();
                    boolean o = recyclerView.n.o(view);
                    if (o) {
                        b0 b0 = RecyclerView.b0(view);
                        recyclerView.b.q(b0);
                        recyclerView.b.l(b0);
                    }
                    recyclerView.Q0(!o);
                    if (!o && b0Var.U()) {
                        RecyclerView.this.removeDetachedView(b0Var.a, false);
                    }
                }
            }
        }

        public final void i() {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                this.b.get(i).a();
            }
            this.b.clear();
        }

        public abstract void j(b0 b0Var);

        public abstract void k();

        public long l() {
            return this.c;
        }

        public long m() {
            return this.f;
        }

        public long n() {
            return this.e;
        }

        public long o() {
            return this.d;
        }

        public abstract boolean p();

        public final boolean q(a aVar) {
            return p();
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/recyclerview/widget/RecyclerView$y;Landroidx/recyclerview/widget/RecyclerView$b0;ILjava/util/List<Ljava/lang/Object;>;)Landroidx/recyclerview/widget/RecyclerView$j$c; */
        public c r(b0 b0Var) {
            c cVar = new c();
            View view = b0Var.a;
            cVar.a = view.getLeft();
            cVar.b = view.getTop();
            view.getRight();
            view.getBottom();
            return cVar;
        }

        public abstract void s();

        /* access modifiers changed from: package-private */
        public void t(b bVar) {
            this.a = bVar;
        }

        public void u(long j) {
            this.e = j;
        }
    }

    private class k implements j.b {
        k() {
        }
    }

    public static abstract class l {
        public void j(Rect rect, View view, RecyclerView recyclerView, y yVar) {
            ((LayoutParams) view.getLayoutParams()).b();
            rect.set(0, 0, 0, 0);
        }

        public void k(Canvas canvas, RecyclerView recyclerView, y yVar) {
        }

        public void l(Canvas canvas, RecyclerView recyclerView, y yVar) {
        }
    }

    public static abstract class m {
        private int A;
        f a;
        RecyclerView b;
        private final i0.b c;
        private final i0.b f;
        i0 n;
        i0 o;
        x p;
        boolean q = false;
        boolean r = false;
        boolean s = false;
        private boolean t = true;
        private boolean u = true;
        int v;
        boolean w;
        private int x;
        private int y;
        private int z;

        class a implements i0.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.i0.b
            public int a(View view) {
                return m.this.b0(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.i0.b
            public int b() {
                return m.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.i0.b
            public int c() {
                return m.this.v0() - m.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.i0.b
            public View d(int i) {
                f fVar = m.this.a;
                if (fVar != null) {
                    return fVar.d(i);
                }
                return null;
            }

            @Override // androidx.recyclerview.widget.i0.b
            public int e(View view) {
                return m.this.d0(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements i0.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.i0.b
            public int a(View view) {
                return m.this.e0(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.i0.b
            public int b() {
                return m.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.i0.b
            public int c() {
                return m.this.g0() - m.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.i0.b
            public View d(int i) {
                f fVar = m.this.a;
                if (fVar != null) {
                    return fVar.d(i);
                }
                return null;
            }

            @Override // androidx.recyclerview.widget.i0.b
            public int e(View view) {
                return m.this.a0(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
        }

        public static class d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public m() {
            a aVar = new a();
            this.c = aVar;
            b bVar = new b();
            this.f = bVar;
            this.n = new i0(aVar);
            this.o = new i0(bVar);
        }

        private static boolean C0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        public static int E(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int X(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.X(int, int, int, int, boolean):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            if (r3 >= 0) goto L_0x0011;
         */
        @java.lang.Deprecated
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int Y(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L_0x000f
                if (r3 < 0) goto L_0x000d
                goto L_0x0011
            L_0x000d:
                r3 = 0
                goto L_0x0021
            L_0x000f:
                if (r3 < 0) goto L_0x0014
            L_0x0011:
                r2 = 1073741824(0x40000000, float:2.0)
                goto L_0x0021
            L_0x0014:
                r4 = -1
                if (r3 != r4) goto L_0x001b
                r2 = 1073741824(0x40000000, float:2.0)
            L_0x0019:
                r3 = r1
                goto L_0x0021
            L_0x001b:
                r4 = -2
                if (r3 != r4) goto L_0x000d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0019
            L_0x0021:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.Y(int, int, int, boolean):int");
        }

        public static d p0(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i7.a, i, i2);
            dVar.a = obtainStyledAttributes.getInt(0, 1);
            dVar.b = obtainStyledAttributes.getInt(10, 1);
            dVar.c = obtainStyledAttributes.getBoolean(9, false);
            dVar.d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private void x(View view, int i, boolean z2) {
            b0 b0 = RecyclerView.b0(view);
            if (z2 || b0.P()) {
                this.b.o.a(b0);
            } else {
                this.b.o.h(b0);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (b0.g0() || b0.S()) {
                if (b0.S()) {
                    b0.w.q(b0);
                } else {
                    b0.v();
                }
                this.a.b(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.b) {
                int k = this.a.k(view);
                if (i == -1) {
                    i = this.a.e();
                }
                if (k == -1) {
                    StringBuilder V0 = je.V0("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    V0.append(this.b.indexOfChild(view));
                    V0.append(this.b.K());
                    throw new IllegalStateException(V0.toString());
                } else if (k != i) {
                    m mVar = this.b.v;
                    f fVar = mVar.a;
                    View d2 = fVar != null ? fVar.d(k) : null;
                    if (d2 != null) {
                        f fVar2 = mVar.a;
                        if (fVar2 != null) {
                            fVar2.d(k);
                        }
                        mVar.a.c(k);
                        mVar.z(d2, i);
                    } else {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + k + mVar.b.toString());
                    }
                }
            } else {
                this.a.a(view, i, false);
                layoutParams.c = true;
                x xVar = this.p;
                if (xVar != null && xVar.f()) {
                    this.p.h(view);
                }
            }
            if (layoutParams.f) {
                b0.a.invalidate();
                layoutParams.f = false;
            }
        }

        public void A(View view, Rect rect) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.e0(view));
            }
        }

        public boolean A0() {
            return false;
        }

        public void A1(int i, int i2) {
            this.b.setMeasuredDimension(i, i2);
        }

        public boolean B() {
            return false;
        }

        public boolean B0() {
            return this.t;
        }

        public void B1(Rect rect, int i, int i2) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
            int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
            this.b.setMeasuredDimension(E(i, paddingRight, n0()), E(i2, paddingBottom, m0()));
        }

        public boolean C() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void C1(int i, int i2) {
            int W = W();
            if (W == 0) {
                this.b.x(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < W; i7++) {
                View V = V(i7);
                Rect rect = this.b.r;
                RecyclerView.d0(V, rect);
                int i8 = rect.left;
                if (i8 < i3) {
                    i3 = i8;
                }
                int i9 = rect.right;
                if (i9 > i5) {
                    i5 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.b.r.set(i3, i4, i5, i6);
            B1(this.b.r, i, i2);
        }

        public boolean D(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public boolean D0(View view, boolean z2) {
            boolean z3 = this.n.b(view, 24579) && this.o.b(view, 24579);
            return z2 ? z3 : !z3;
        }

        public void D1(boolean z2) {
            this.t = z2;
        }

        public void E0(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).b;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        /* access modifiers changed from: package-private */
        public void E1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.z = 0;
                this.A = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.n;
                this.z = recyclerView.getWidth();
                this.A = recyclerView.getHeight();
            }
            this.x = 1073741824;
            this.y = 1073741824;
        }

        public void F(int i, int i2, y yVar, c cVar) {
        }

        public void F0(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        /* access modifiers changed from: package-private */
        public boolean F1(View view, int i, int i2, LayoutParams layoutParams) {
            return view.isLayoutRequested() || !this.t || !C0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) || !C0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height);
        }

        public void G(int i, c cVar) {
        }

        public void G0(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect e0 = this.b.e0(view);
            int i3 = e0.left + e0.right + i;
            int i4 = e0.top + e0.bottom + i2;
            int X = X(this.z, this.x, getPaddingRight() + getPaddingLeft() + i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            int X2 = X(this.A, this.y, getPaddingBottom() + getPaddingTop() + i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            if (F1(view, X, X2, layoutParams)) {
                view.measure(X, X2);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean G1() {
            return false;
        }

        public int H(y yVar) {
            return 0;
        }

        public void H0(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect e0 = this.b.e0(view);
            int i3 = e0.left + e0.right + i;
            int i4 = e0.top + e0.bottom + i2;
            int X = X(this.z, this.x, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, B());
            int X2 = X(this.A, this.y, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, C());
            if (F1(view, X, X2, layoutParams)) {
                view.measure(X, X2);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean H1(View view, int i, int i2, LayoutParams layoutParams) {
            return !this.t || !C0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) || !C0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height);
        }

        public int I(y yVar) {
            return 0;
        }

        public void I0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int e = recyclerView.n.e();
                for (int i2 = 0; i2 < e; i2++) {
                    recyclerView.n.d(i2).offsetLeftAndRight(i);
                }
            }
        }

        public void I1(RecyclerView recyclerView, y yVar, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int J(y yVar) {
            return 0;
        }

        public void J0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                int e = recyclerView.n.e();
                for (int i2 = 0; i2 < e; i2++) {
                    recyclerView.n.d(i2).offsetTopAndBottom(i);
                }
            }
        }

        public void J1(x xVar) {
            x xVar2 = this.p;
            if (!(xVar2 == null || xVar == xVar2 || !xVar2.f())) {
                this.p.o();
            }
            this.p = xVar;
            xVar.n(this.b, this);
        }

        public int K(y yVar) {
            return 0;
        }

        public void K0(e eVar, e eVar2) {
        }

        public void K1(View view) {
            b0 b0 = RecyclerView.b0(view);
            b0.s &= -129;
            b0.b0();
            b0.t(4);
        }

        public int L(y yVar) {
            return 0;
        }

        /* JADX WARN: Incorrect args count in method signature: (Landroidx/recyclerview/widget/RecyclerView;Ljava/util/ArrayList<Landroid/view/View;>;II)Z */
        public boolean L0() {
            return false;
        }

        public boolean L1() {
            return false;
        }

        public int M(y yVar) {
            return 0;
        }

        public void M0(RecyclerView recyclerView) {
        }

        public void N(s sVar) {
            for (int W = W() - 1; W >= 0; W--) {
                View V = V(W);
                b0 b0 = RecyclerView.b0(V);
                if (!b0.f0()) {
                    if (!b0.J() || b0.P() || this.b.u.y()) {
                        f fVar = this.a;
                        if (fVar != null) {
                            fVar.d(W);
                        }
                        this.a.c(W);
                        sVar.m(V);
                        this.b.o.h(b0);
                    } else {
                        f fVar2 = this.a;
                        if ((fVar2 != null ? fVar2.d(W) : null) != null) {
                            this.a.n(W);
                        }
                        sVar.l(b0);
                    }
                }
            }
        }

        @Deprecated
        public void N0() {
        }

        public void O(View view) {
            int k = this.a.k(view);
            if (k >= 0) {
                this.a.c(k);
            }
        }

        public void O0(RecyclerView recyclerView, s sVar) {
            N0();
        }

        public View P(View view) {
            View N;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (N = recyclerView.N(view)) == null || this.a.c.contains(N)) {
                return null;
            }
            return N;
        }

        public View P0(View view, int i, s sVar, y yVar) {
            return null;
        }

        public View Q(int i) {
            int W = W();
            for (int i2 = 0; i2 < W; i2++) {
                View V = V(i2);
                b0 b0 = RecyclerView.b0(V);
                if (b0 != null && b0.A() == i && !b0.f0() && (this.b.q0.g || !b0.P())) {
                    return V;
                }
            }
            return null;
        }

        public void Q0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            s sVar = recyclerView.b;
            y yVar = recyclerView.q0;
            R0(accessibilityEvent);
        }

        public abstract LayoutParams R();

        public void R0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z2 = true;
                if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                    z2 = false;
                }
                accessibilityEvent.setScrollable(z2);
                e eVar = this.b.u;
                if (eVar != null) {
                    accessibilityEvent.setItemCount(eVar.u());
                }
            }
        }

        public LayoutParams S(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void S0(s sVar, y yVar, d5 d5Var) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                d5Var.a(8192);
                d5Var.n0(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                d5Var.a(4096);
                d5Var.n0(true);
            }
            d5Var.T(d5.b.b(r0(sVar, yVar), Z(sVar, yVar), A0(), s0()));
        }

        public LayoutParams T(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        /* access modifiers changed from: package-private */
        public void T0(View view, d5 d5Var) {
            b0 b0 = RecyclerView.b0(view);
            if (b0 != null && !b0.P() && !this.a.l(b0.a)) {
                RecyclerView recyclerView = this.b;
                U0(recyclerView.b, recyclerView.q0, view, d5Var);
            }
        }

        public int U(View view) {
            return ((LayoutParams) view.getLayoutParams()).b.bottom;
        }

        public void U0(s sVar, y yVar, View view, d5 d5Var) {
            d5Var.U(d5.c.a(C() ? o0(view) : 0, 1, B() ? o0(view) : 0, 1, false, false));
        }

        public View V(int i) {
            f fVar = this.a;
            if (fVar != null) {
                return fVar.d(i);
            }
            return null;
        }

        public View V0() {
            return null;
        }

        public int W() {
            f fVar = this.a;
            if (fVar != null) {
                return fVar.e();
            }
            return 0;
        }

        public void W0(RecyclerView recyclerView, int i, int i2) {
        }

        public void X0(RecyclerView recyclerView) {
        }

        public void Y0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public int Z(s sVar, y yVar) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.u == null || !B()) {
                return 1;
            }
            return this.b.u.u();
        }

        public void Z0(RecyclerView recyclerView, int i, int i2) {
        }

        public int a0(View view) {
            return U(view) + view.getBottom();
        }

        public void a1(RecyclerView recyclerView, int i, int i2) {
        }

        public int b0(View view) {
            return view.getLeft() - l0(view);
        }

        public void b1(RecyclerView recyclerView, int i, int i2, Object obj) {
            a1(recyclerView, i, i2);
        }

        public int c0(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void c1(s sVar, y yVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int d(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int d0(View view) {
            return q0(view) + view.getRight();
        }

        public void d1(y yVar) {
        }

        public int e0(View view) {
            return view.getTop() - t0(view);
        }

        public void e1(s sVar, y yVar, int i, int i2) {
            this.b.x(i, i2);
        }

        public View f0() {
            View focusedChild;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        @Deprecated
        public boolean f1(RecyclerView recyclerView) {
            x xVar = this.p;
            if ((xVar != null && xVar.f()) || recyclerView.k0()) {
                return true;
            }
            return false;
        }

        public int g0() {
            return this.A;
        }

        public boolean g1(RecyclerView recyclerView, View view, View view2) {
            return f1(recyclerView);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return q4.q(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return q4.r(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int h0() {
            return this.y;
        }

        public void h1(Parcelable parcelable) {
        }

        public int i0() {
            RecyclerView recyclerView = this.b;
            e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.u();
            }
            return 0;
        }

        public Parcelable i1() {
            return null;
        }

        public int j0(View view) {
            return RecyclerView.b0(view).o;
        }

        public void j1(int i) {
        }

        public int k0() {
            return q4.o(this.b);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x006d A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean k1(androidx.recyclerview.widget.RecyclerView.s r8, androidx.recyclerview.widget.RecyclerView.y r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x003e
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x006b
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0027
                int r8 = r7.A
                int r11 = r7.getPaddingTop()
                int r8 = r8 - r11
                int r11 = r7.getPaddingBottom()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x0028
            L_0x0027:
                r8 = 0
            L_0x0028:
                androidx.recyclerview.widget.RecyclerView r11 = r7.b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0069
                int r10 = r7.z
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x0066
            L_0x003e:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0051
                int r8 = r7.A
                int r10 = r7.getPaddingTop()
                int r8 = r8 - r10
                int r10 = r7.getPaddingBottom()
                int r8 = r8 - r10
                goto L_0x0052
            L_0x0051:
                r8 = 0
            L_0x0052:
                androidx.recyclerview.widget.RecyclerView r10 = r7.b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0069
                int r10 = r7.z
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
            L_0x0066:
                r3 = r8
                r2 = r10
                goto L_0x006b
            L_0x0069:
                r3 = r8
                r2 = 0
            L_0x006b:
                if (r3 != 0) goto L_0x0070
                if (r2 != 0) goto L_0x0070
                return r9
            L_0x0070:
                androidx.recyclerview.widget.RecyclerView r1 = r7.b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.M0(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.k1(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$y, int, android.os.Bundle):boolean");
        }

        public int l0(View view) {
            return ((LayoutParams) view.getLayoutParams()).b.left;
        }

        public boolean l1() {
            return false;
        }

        public int m0() {
            return q4.p(this.b);
        }

        public void m1() {
            for (int W = W() - 1; W >= 0; W--) {
                this.a.n(W);
            }
        }

        public int n0() {
            RecyclerView recyclerView = this.b;
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            return recyclerView.getMinimumWidth();
        }

        public void n1(s sVar) {
            for (int W = W() - 1; W >= 0; W--) {
                if (!RecyclerView.b0(V(W)).f0()) {
                    q1(W, sVar);
                }
            }
        }

        public int o0(View view) {
            return ((LayoutParams) view.getLayoutParams()).b();
        }

        /* access modifiers changed from: package-private */
        public void o1(s sVar) {
            int size = sVar.a.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = sVar.a.get(i).a;
                b0 b0 = RecyclerView.b0(view);
                if (!b0.f0()) {
                    b0.e0(false);
                    if (b0.U()) {
                        this.b.removeDetachedView(view, false);
                    }
                    j jVar = this.b.V;
                    if (jVar != null) {
                        jVar.j(b0);
                    }
                    b0.e0(true);
                    b0 b02 = RecyclerView.b0(view);
                    b02.w = null;
                    b02.x = false;
                    b02.v();
                    sVar.l(b02);
                }
            }
            sVar.a.clear();
            ArrayList<b0> arrayList = sVar.b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.b.invalidate();
            }
        }

        public void p1(View view, s sVar) {
            this.a.m(view);
            sVar.k(view);
        }

        public int q0(View view) {
            return ((LayoutParams) view.getLayoutParams()).b.right;
        }

        public void q1(int i, s sVar) {
            f fVar = this.a;
            View view = null;
            View d2 = fVar != null ? fVar.d(i) : null;
            f fVar2 = this.a;
            if (fVar2 != null) {
                view = fVar2.d(i);
            }
            if (view != null) {
                this.a.n(i);
            }
            sVar.k(d2);
        }

        public int r0(s sVar, y yVar) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.u == null || !C()) {
                return 1;
            }
            return this.b.u.u();
        }

        public void r1(View view) {
            this.a.m(view);
        }

        public int s0() {
            return 0;
        }

        /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0072: APUT  (r2v1 int[]), (0 ??[int, short, byte, char]), (r5v3 int) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
            if (r1 == false) goto L_0x00bf;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean s1(androidx.recyclerview.widget.RecyclerView r19, android.view.View r20, android.graphics.Rect r21, boolean r22, boolean r23) {
            /*
                r18 = this;
                r0 = r18
                r1 = r21
                r2 = 2
                int[] r2 = new int[r2]
                int r3 = r18.getPaddingLeft()
                int r4 = r18.getPaddingTop()
                int r5 = r0.z
                int r6 = r18.getPaddingRight()
                int r5 = r5 - r6
                int r6 = r0.A
                int r7 = r18.getPaddingBottom()
                int r6 = r6 - r7
                int r7 = r20.getLeft()
                int r8 = r1.left
                int r7 = r7 + r8
                int r8 = r20.getScrollX()
                int r7 = r7 - r8
                int r8 = r20.getTop()
                int r9 = r1.top
                int r8 = r8 + r9
                int r9 = r20.getScrollY()
                int r8 = r8 - r9
                int r9 = r21.width()
                int r9 = r9 + r7
                int r1 = r21.height()
                int r1 = r1 + r8
                int r7 = r7 - r3
                r3 = 0
                int r10 = java.lang.Math.min(r3, r7)
                int r8 = r8 - r4
                int r4 = java.lang.Math.min(r3, r8)
                int r9 = r9 - r5
                int r5 = java.lang.Math.max(r3, r9)
                int r1 = r1 - r6
                int r1 = java.lang.Math.max(r3, r1)
                int r6 = r18.k0()
                r11 = 1
                if (r6 != r11) goto L_0x0063
                if (r5 == 0) goto L_0x005e
                goto L_0x006b
            L_0x005e:
                int r5 = java.lang.Math.max(r10, r9)
                goto L_0x006b
            L_0x0063:
                if (r10 == 0) goto L_0x0066
                goto L_0x006a
            L_0x0066:
                int r10 = java.lang.Math.min(r7, r5)
            L_0x006a:
                r5 = r10
            L_0x006b:
                if (r4 == 0) goto L_0x006e
                goto L_0x0072
            L_0x006e:
                int r4 = java.lang.Math.min(r8, r1)
            L_0x0072:
                r2[r3] = r5
                r2[r11] = r4
                r13 = r2[r3]
                r14 = r2[r11]
                if (r23 == 0) goto L_0x00ba
                android.view.View r1 = r19.getFocusedChild()
                if (r1 != 0) goto L_0x0083
                goto L_0x00b7
            L_0x0083:
                int r2 = r18.getPaddingLeft()
                int r4 = r18.getPaddingTop()
                int r5 = r0.z
                int r6 = r18.getPaddingRight()
                int r5 = r5 - r6
                int r6 = r0.A
                int r7 = r18.getPaddingBottom()
                int r6 = r6 - r7
                androidx.recyclerview.widget.RecyclerView r7 = r0.b
                android.graphics.Rect r7 = r7.r
                androidx.recyclerview.widget.RecyclerView.d0(r1, r7)
                int r1 = r7.left
                int r1 = r1 - r13
                if (r1 >= r5) goto L_0x00b7
                int r1 = r7.right
                int r1 = r1 - r13
                if (r1 <= r2) goto L_0x00b7
                int r1 = r7.top
                int r1 = r1 - r14
                if (r1 >= r6) goto L_0x00b7
                int r1 = r7.bottom
                int r1 = r1 - r14
                if (r1 > r4) goto L_0x00b5
                goto L_0x00b7
            L_0x00b5:
                r1 = 1
                goto L_0x00b8
            L_0x00b7:
                r1 = 0
            L_0x00b8:
                if (r1 == 0) goto L_0x00bf
            L_0x00ba:
                if (r13 != 0) goto L_0x00c0
                if (r14 == 0) goto L_0x00bf
                goto L_0x00c0
            L_0x00bf:
                return r3
            L_0x00c0:
                if (r22 == 0) goto L_0x00c8
                r1 = r19
                r1.scrollBy(r13, r14)
                goto L_0x00d4
            L_0x00c8:
                r1 = r19
                r17 = 0
                r16 = -2147483648(0xffffffff80000000, float:-0.0)
                r15 = 0
                r12 = r19
                r12.M0(r13, r14, r15, r16, r17)
            L_0x00d4:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.s1(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public void t(View view) {
            x(view, -1, true);
        }

        public int t0(View view) {
            return ((LayoutParams) view.getLayoutParams()).b.top;
        }

        public void t1() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void u(View view, int i) {
            x(view, i, true);
        }

        public void u0(View view, boolean z2, Rect rect) {
            Matrix matrix;
            if (z2) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.b.t;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int u1(int i, s sVar, y yVar) {
            return 0;
        }

        public void v(View view) {
            x(view, -1, false);
        }

        public int v0() {
            return this.z;
        }

        public void v1(int i) {
        }

        public void w(View view, int i) {
            x(view, i, false);
        }

        public int w0() {
            return this.x;
        }

        public int w1(int i, s sVar, y yVar) {
            return 0;
        }

        public void x0(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                StringBuilder V0 = je.V0("View should be fully attached to be ignored");
                V0.append(this.b.K());
                throw new IllegalArgumentException(V0.toString());
            }
            b0 b0 = RecyclerView.b0(view);
            b0.t(128);
            this.b.o.i(b0);
        }

        @Deprecated
        public void x1(boolean z2) {
            this.s = z2;
        }

        public void y(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.p(str);
            }
        }

        public boolean y0() {
            return this.s;
        }

        /* access modifiers changed from: package-private */
        public void y1(RecyclerView recyclerView) {
            z1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void z(View view, int i) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            b0 b0 = RecyclerView.b0(view);
            if (b0.P()) {
                this.b.o.a(b0);
            } else {
                this.b.o.h(b0);
            }
            this.a.b(view, i, layoutParams, b0.P());
        }

        public final boolean z0() {
            return this.u;
        }

        /* access modifiers changed from: package-private */
        public void z1(int i, int i2) {
            this.z = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.x = mode;
            if (mode == 0 && !RecyclerView.J0) {
                this.z = 0;
            }
            this.A = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.y = mode2;
            if (mode2 == 0 && !RecyclerView.J0) {
                this.A = 0;
            }
        }
    }

    public interface n {
        void b(View view);

        void d(View view);
    }

    public static abstract class o {
    }

    public interface p {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void f(boolean z);
    }

    public static abstract class q {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void c(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class r {
        SparseArray<a> a = new SparseArray<>();
        private int b = 0;

        /* access modifiers changed from: package-private */
        public static class a {
            final ArrayList<b0> a = new ArrayList<>();
            int b = 5;
            long c = 0;
            long d = 0;

            a() {
            }
        }

        private a e(int i) {
            a aVar = this.a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.b++;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.b--;
        }

        /* access modifiers changed from: package-private */
        public void c(int i, long j) {
            a e = e(i);
            e.d = h(e.d, j);
        }

        /* access modifiers changed from: package-private */
        public void d(int i, long j) {
            a e = e(i);
            e.c = h(e.c, j);
        }

        /* access modifiers changed from: package-private */
        public void f(e eVar, e eVar2, boolean z) {
            if (eVar != null) {
                this.b--;
            }
            if (!z && this.b == 0) {
                for (int i = 0; i < this.a.size(); i++) {
                    this.a.valueAt(i).a.clear();
                }
            }
            if (eVar2 != null) {
                this.b++;
            }
        }

        public void g(b0 b0Var) {
            int i = b0Var.o;
            ArrayList<b0> arrayList = e(i).a;
            if (this.a.get(i).b > arrayList.size()) {
                b0Var.b0();
                arrayList.add(b0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public long h(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return (j2 / 4) + ((j / 4) * 3);
        }

        /* access modifiers changed from: package-private */
        public boolean i(int i, long j, long j2) {
            long j3 = e(i).d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        public boolean j(int i, long j, long j2) {
            long j3 = e(i).c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    public final class s {
        final ArrayList<b0> a;
        ArrayList<b0> b = null;
        final ArrayList<b0> c = new ArrayList<>();
        private final List<b0> d;
        private int e;
        int f;
        r g;

        public s() {
            ArrayList<b0> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        private void h(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    h((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private boolean o(b0 b0Var, int i, int i2, long j) {
            RecyclerView recyclerView = RecyclerView.this;
            b0Var.A = recyclerView;
            int i3 = b0Var.o;
            long nanoTime = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE && !this.g.i(i3, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.u.r(b0Var, i);
            this.g.c(b0Var.o, RecyclerView.this.getNanoTime() - nanoTime);
            if (RecyclerView.this.j0()) {
                View view = b0Var.a;
                if (q4.n(view) == 0) {
                    q4.O(view, 1);
                }
                c0 c0Var = RecyclerView.this.x0;
                if (c0Var != null) {
                    z3 a2 = c0Var.a();
                    if (a2 instanceof c0.a) {
                        ((c0.a) a2).b(view);
                    }
                    q4.I(view, a2);
                }
            }
            if (RecyclerView.this.q0.g) {
                b0Var.p = i2;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public void a(b0 b0Var, boolean z) {
            RecyclerView.s(b0Var);
            View view = b0Var.a;
            c0 c0Var = RecyclerView.this.x0;
            if (c0Var != null) {
                z3 a2 = c0Var.a();
                q4.I(view, a2 instanceof c0.a ? ((c0.a) a2).a(view) : null);
            }
            if (z) {
                t tVar = RecyclerView.this.w;
                if (tVar != null) {
                    tVar.a(b0Var);
                }
                e eVar = RecyclerView.this.u;
                if (eVar != null) {
                    eVar.R(b0Var);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.q0 != null) {
                    recyclerView.o.i(b0Var);
                }
            }
            b0Var.A = null;
            e().g(b0Var);
        }

        public void b(View view, int i) {
            LayoutParams layoutParams;
            b0 b0 = RecyclerView.b0(view);
            if (b0 != null) {
                boolean z = false;
                int f2 = RecyclerView.this.f.f(i, 0);
                if (f2 < 0 || f2 >= RecyclerView.this.u.u()) {
                    StringBuilder X0 = je.X0("Inconsistency detected. Invalid item position ", i, "(offset:", f2, ").state:");
                    X0.append(RecyclerView.this.q0.c());
                    X0.append(RecyclerView.this.K());
                    throw new IndexOutOfBoundsException(X0.toString());
                }
                o(b0, f2, i, Long.MAX_VALUE);
                ViewGroup.LayoutParams layoutParams2 = b0.a.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                    b0.a.setLayoutParams(layoutParams);
                } else if (!RecyclerView.this.checkLayoutParams(layoutParams2)) {
                    layoutParams = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams2);
                    b0.a.setLayoutParams(layoutParams);
                } else {
                    layoutParams = (LayoutParams) layoutParams2;
                }
                layoutParams.c = true;
                layoutParams.a = b0;
                if (b0.a.getParent() == null) {
                    z = true;
                }
                layoutParams.f = z;
                return;
            }
            StringBuilder V0 = je.V0("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter");
            V0.append(RecyclerView.this.K());
            throw new IllegalArgumentException(V0.toString());
        }

        public void c() {
            this.a.clear();
            i();
        }

        public int d(int i) {
            if (i < 0 || i >= RecyclerView.this.q0.c()) {
                StringBuilder W0 = je.W0("invalid position ", i, ". State item count is ");
                W0.append(RecyclerView.this.q0.c());
                W0.append(RecyclerView.this.K());
                throw new IndexOutOfBoundsException(W0.toString());
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.q0.g) {
                return i;
            }
            return recyclerView.f.f(i, 0);
        }

        /* access modifiers changed from: package-private */
        public r e() {
            if (this.g == null) {
                this.g = new r();
            }
            return this.g;
        }

        public List<b0> f() {
            return this.d;
        }

        public View g(int i) {
            return p(i, false, Long.MAX_VALUE).a;
        }

        /* access modifiers changed from: package-private */
        public void i() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                j(size);
            }
            this.c.clear();
            if (RecyclerView.L0) {
                o.b bVar = RecyclerView.this.p0;
                int[] iArr = bVar.c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.d = 0;
            }
        }

        /* access modifiers changed from: package-private */
        public void j(int i) {
            a(this.c.get(i), true);
            this.c.remove(i);
        }

        public void k(View view) {
            b0 b0 = RecyclerView.b0(view);
            if (b0.U()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (b0.S()) {
                b0.w.q(b0);
            } else if (b0.g0()) {
                b0.v();
            }
            l(b0);
            if (RecyclerView.this.V != null && !b0.K()) {
                RecyclerView.this.V.j(b0);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00ac A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:64:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void l(androidx.recyclerview.widget.RecyclerView.b0 r6) {
            /*
            // Method dump skipped, instructions count: 288
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.l(androidx.recyclerview.widget.RecyclerView$b0):void");
        }

        /* access modifiers changed from: package-private */
        public void m(View view) {
            b0 b0 = RecyclerView.b0(view);
            if (!b0.D(12) && b0.V()) {
                j jVar = RecyclerView.this.V;
                if (!(jVar == null || jVar.g(b0, b0.C()))) {
                    if (this.b == null) {
                        this.b = new ArrayList<>();
                    }
                    b0.w = this;
                    b0.x = true;
                    this.b.add(b0);
                    return;
                }
            }
            if (!b0.J() || b0.P() || RecyclerView.this.u.y()) {
                b0.w = this;
                b0.x = false;
                this.a.add(b0);
                return;
            }
            StringBuilder V0 = je.V0("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
            V0.append(RecyclerView.this.K());
            throw new IllegalArgumentException(V0.toString());
        }

        public void n(int i) {
            this.e = i;
            r();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x03f3, code lost:
            if (r5.J() == false) goto L_0x03f6;
         */
        /* JADX WARNING: Removed duplicated region for block: B:215:0x0413  */
        /* JADX WARNING: Removed duplicated region for block: B:216:0x0421  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x008f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.b0 p(int r18, boolean r19, long r20) {
            /*
            // Method dump skipped, instructions count: 1134
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.p(int, boolean, long):androidx.recyclerview.widget.RecyclerView$b0");
        }

        /* access modifiers changed from: package-private */
        public void q(b0 b0Var) {
            if (b0Var.x) {
                this.b.remove(b0Var);
            } else {
                this.a.remove(b0Var);
            }
            b0Var.w = null;
            b0Var.x = false;
            b0Var.v();
        }

        /* access modifiers changed from: package-private */
        public void r() {
            m mVar = RecyclerView.this.v;
            this.f = this.e + (mVar != null ? mVar.v : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
                j(size);
            }
        }
    }

    public interface t {
        void a(b0 b0Var);
    }

    /* access modifiers changed from: private */
    public class u extends g {
        u() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void a() {
            RecyclerView.this.p(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.q0.f = true;
            recyclerView.x0(true);
            if (!RecyclerView.this.f.h()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void c(int i, int i2, Object obj) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f.j(i, i2, obj)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void d(int i, int i2) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f.k(i, i2)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void e(int i, int i2, int i3) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f.l(i, i2, i3)) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void f(int i, int i2) {
            RecyclerView.this.p(null);
            if (RecyclerView.this.f.m(i, i2)) {
                g();
            }
        }

        /* access modifiers changed from: package-private */
        public void g() {
            if (RecyclerView.K0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.B && recyclerView.A) {
                    Runnable runnable = recyclerView.q;
                    int i = q4.g;
                    int i2 = Build.VERSION.SDK_INT;
                    recyclerView.postOnAnimation(runnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.J = true;
            recyclerView2.requestLayout();
        }
    }

    public static class w implements p {
        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void f(boolean z) {
        }
    }

    public static abstract class x {
        private int a = -1;
        private RecyclerView b;
        private m c;
        private boolean d;
        private boolean e;
        private View f;
        private final a g = new a(0, 0);
        private boolean h;

        public static class a {
            private int a;
            private int b;
            private int c;
            private int d = -1;
            private Interpolator e;
            private boolean f = false;
            private int g = 0;

            public a(int i, int i2) {
                this.a = i;
                this.b = i2;
                this.c = Integer.MIN_VALUE;
                this.e = null;
            }

            /* access modifiers changed from: package-private */
            public boolean a() {
                return this.d >= 0;
            }

            public void b(int i) {
                this.d = i;
            }

            /* access modifiers changed from: package-private */
            public void c(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.l0(i);
                    this.f = false;
                } else if (this.f) {
                    Interpolator interpolator = this.e;
                    if (interpolator == null || this.c >= 1) {
                        int i2 = this.c;
                        if (i2 >= 1) {
                            recyclerView.n0.c(this.a, this.b, i2, interpolator);
                            int i3 = this.g + 1;
                            this.g = i3;
                            if (i3 > 10) {
                                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                            }
                            this.f = false;
                            return;
                        }
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else {
                    this.g = 0;
                }
            }

            public void d(int i, int i2, int i3, Interpolator interpolator) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
                this.f = true;
            }
        }

        public interface b {
            PointF b(int i);
        }

        public PointF a(int i) {
            m mVar = this.c;
            if (mVar instanceof b) {
                return ((b) mVar).b(i);
            }
            return null;
        }

        public int b() {
            return this.b.v.W();
        }

        public m c() {
            return this.c;
        }

        public int d() {
            return this.a;
        }

        public boolean e() {
            return this.d;
        }

        public boolean f() {
            return this.e;
        }

        /* access modifiers changed from: package-private */
        public void g(int i, int i2) {
            PointF a2;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                o();
            }
            if (this.d && this.f == null && this.c != null && (a2 = a(this.a)) != null) {
                float f2 = a2.x;
                if (!(f2 == 0.0f && a2.y == 0.0f)) {
                    recyclerView.H0((int) Math.signum(f2), (int) Math.signum(a2.y), null);
                }
            }
            this.d = false;
            View view = this.f;
            if (view != null) {
                if (this.b.Z(view) == this.a) {
                    l(this.f, recyclerView.q0, this.g);
                    this.g.c(recyclerView);
                    o();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                i(i, i2, recyclerView.q0, this.g);
                boolean a3 = this.g.a();
                this.g.c(recyclerView);
                if (a3 && this.e) {
                    this.d = true;
                    recyclerView.n0.b();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void h(View view) {
            if (this.b.Z(view) == this.a) {
                this.f = view;
            }
        }

        /* access modifiers changed from: protected */
        public abstract void i(int i, int i2, y yVar, a aVar);

        /* access modifiers changed from: protected */
        public abstract void j();

        /* access modifiers changed from: protected */
        public abstract void k();

        /* access modifiers changed from: protected */
        public abstract void l(View view, y yVar, a aVar);

        public void m(int i) {
            this.a = i;
        }

        /* access modifiers changed from: package-private */
        public void n(RecyclerView recyclerView, m mVar) {
            recyclerView.n0.d();
            if (this.h) {
                getClass().getSimpleName();
                getClass().getSimpleName();
            }
            this.b = recyclerView;
            this.c = mVar;
            int i = this.a;
            if (i != -1) {
                recyclerView.q0.a = i;
                this.e = true;
                this.d = true;
                this.f = recyclerView.v.Q(i);
                j();
                this.b.n0.b();
                this.h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        public final void o() {
            if (this.e) {
                this.e = false;
                k();
                this.b.q0.a = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                m mVar = this.c;
                if (mVar.p == this) {
                    mVar.p = null;
                }
                this.c = null;
                this.b = null;
            }
        }
    }

    public static class y {
        int a = -1;
        int b = 0;
        int c = 0;
        int d = 1;
        int e = 0;
        boolean f = false;
        boolean g = false;
        boolean h = false;
        boolean i = false;
        boolean j = false;
        boolean k = false;
        int l;
        long m;
        int n;
        int o;

        /* access modifiers changed from: package-private */
        public void a(int i2) {
            if ((this.d & i2) == 0) {
                StringBuilder V0 = je.V0("Layout state should be one of ");
                V0.append(Integer.toBinaryString(i2));
                V0.append(" but it is ");
                V0.append(Integer.toBinaryString(this.d));
                throw new IllegalStateException(V0.toString());
            }
        }

        public boolean b() {
            return this.f;
        }

        public int c() {
            return this.g ? this.b - this.c : this.e;
        }

        public int d() {
            return this.o;
        }

        public boolean e() {
            return this.g;
        }

        public String toString() {
            StringBuilder V0 = je.V0("State{mTargetPosition=");
            V0.append(this.a);
            V0.append(", mData=");
            V0.append((Object) null);
            V0.append(", mItemCount=");
            V0.append(this.e);
            V0.append(", mIsMeasuring=");
            V0.append(this.i);
            V0.append(", mPreviousLayoutItemCount=");
            V0.append(this.b);
            V0.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            V0.append(this.c);
            V0.append(", mStructureChanged=");
            V0.append(this.f);
            V0.append(", mInPreLayout=");
            V0.append(this.g);
            V0.append(", mRunSimpleAnimations=");
            V0.append(this.j);
            V0.append(", mRunPredictiveAnimations=");
            return je.O0(V0, this.k, '}');
        }
    }

    public static abstract class z {
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        I0 = i2 == 18 || i2 == 19 || i2 == 20;
        J0 = i2 >= 23;
        L0 = i2 >= 21;
        Class<?> cls = Integer.TYPE;
        M0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.recyclerViewStyle);
    }

    private void B() {
        int i2;
        View N2;
        this.q0.a(1);
        L(this.q0);
        this.q0.i = false;
        O0();
        j0 j0Var = this.o;
        j0Var.a.clear();
        j0Var.b.c();
        q0();
        w0();
        View focusedChild = (!this.m0 || !hasFocus() || this.u == null) ? null : getFocusedChild();
        b0 a02 = (focusedChild == null || (N2 = N(focusedChild)) == null) ? null : a0(N2);
        long j2 = -1;
        if (a02 == null) {
            y yVar = this.q0;
            yVar.m = -1;
            yVar.l = -1;
            yVar.n = -1;
        } else {
            y yVar2 = this.q0;
            if (this.u.y()) {
                j2 = a02.n;
            }
            yVar2.m = j2;
            y yVar3 = this.q0;
            if (this.M) {
                i2 = -1;
            } else if (a02.P()) {
                i2 = a02.f;
            } else {
                i2 = a02.w();
            }
            yVar3.l = i2;
            y yVar4 = this.q0;
            View view = a02.a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            yVar4.n = id;
        }
        y yVar5 = this.q0;
        yVar5.h = yVar5.j && this.u0;
        this.u0 = false;
        this.t0 = false;
        yVar5.g = yVar5.k;
        yVar5.e = this.u.u();
        P(this.z0);
        if (this.q0.j) {
            int e2 = this.n.e();
            for (int i3 = 0; i3 < e2; i3++) {
                b0 b02 = b0(this.n.d(i3));
                if (!b02.f0() && (!b02.J() || this.u.y())) {
                    j jVar = this.V;
                    j.e(b02);
                    b02.C();
                    this.o.c(b02, jVar.r(b02));
                    if (this.q0.h && b02.V() && !b02.P() && !b02.f0() && !b02.J()) {
                        this.o.b.o(W(b02), b02);
                    }
                }
            }
        }
        if (this.q0.k) {
            int h2 = this.n.h();
            for (int i4 = 0; i4 < h2; i4++) {
                b0 b03 = b0(this.n.g(i4));
                if (!b03.f0() && b03.f == -1) {
                    b03.f = b03.c;
                }
            }
            y yVar6 = this.q0;
            boolean z2 = yVar6.f;
            yVar6.f = false;
            this.v.c1(this.b, yVar6);
            this.q0.f = z2;
            for (int i5 = 0; i5 < this.n.e(); i5++) {
                b0 b04 = b0(this.n.d(i5));
                if (!b04.f0()) {
                    j0.a orDefault = this.o.a.getOrDefault(b04, null);
                    if (!((orDefault == null || (orDefault.a & 4) == 0) ? false : true)) {
                        j.e(b04);
                        boolean D2 = b04.D(8192);
                        j jVar2 = this.V;
                        b04.C();
                        j.c r2 = jVar2.r(b04);
                        if (D2) {
                            y0(b04, r2);
                        } else {
                            j0 j0Var2 = this.o;
                            j0.a orDefault2 = j0Var2.a.getOrDefault(b04, null);
                            if (orDefault2 == null) {
                                orDefault2 = j0.a.a();
                                j0Var2.a.put(b04, orDefault2);
                            }
                            orDefault2.a |= 2;
                            orDefault2.b = r2;
                        }
                    }
                }
            }
            t();
        } else {
            t();
        }
        r0(true);
        Q0(false);
        this.q0.d = 2;
    }

    private void C() {
        O0();
        q0();
        this.q0.a(6);
        this.f.c();
        this.q0.e = this.u.u();
        y yVar = this.q0;
        yVar.c = 0;
        yVar.g = false;
        this.v.c1(this.b, yVar);
        y yVar2 = this.q0;
        yVar2.f = false;
        this.c = null;
        yVar2.j = yVar2.j && this.V != null;
        yVar2.d = 4;
        r0(true);
        Q0(false);
    }

    private void E0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.r.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.c) {
                Rect rect = layoutParams2.b;
                Rect rect2 = this.r;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.r);
            offsetRectIntoDescendantCoords(view, this.r);
        }
        this.v.s1(this, view, this.r, !this.D, view2 == null);
    }

    private void F0() {
        VelocityTracker velocityTracker = this.b0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        r(0);
        EdgeEffect edgeEffect = this.R;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.R.isFinished();
        }
        EdgeEffect edgeEffect2 = this.S;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.S.isFinished();
        }
        EdgeEffect edgeEffect3 = this.T;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.T.isFinished();
        }
        EdgeEffect edgeEffect4 = this.U;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.U.isFinished();
        }
        if (z2) {
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            postInvalidateOnAnimation();
        }
    }

    private void J0(e eVar, boolean z2, boolean z3) {
        e eVar2 = this.u;
        if (eVar2 != null) {
            eVar2.W(this.a);
            this.u.N(this);
        }
        if (!z2 || z3) {
            z0();
        }
        this.f.r();
        e eVar3 = this.u;
        this.u = eVar;
        if (eVar != null) {
            eVar.T(this.a);
            eVar.J(this);
        }
        m mVar = this.v;
        if (mVar != null) {
            mVar.K0(eVar3, this.u);
        }
        s sVar = this.b;
        e eVar4 = this.u;
        sVar.c();
        sVar.e().f(eVar3, eVar4, z2);
        this.q0.f = true;
    }

    private boolean O(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.y.size();
        for (int i2 = 0; i2 < size; i2++) {
            p pVar = this.y.get(i2);
            if (pVar.c(this, motionEvent) && action != 3) {
                this.z = pVar;
                return true;
            }
        }
        return false;
    }

    private void P(int[] iArr) {
        int e2 = this.n.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < e2; i4++) {
            b0 b02 = b0(this.n.d(i4));
            if (!b02.f0()) {
                int A2 = b02.A();
                if (A2 < i2) {
                    i2 = A2;
                }
                if (A2 > i3) {
                    i3 = A2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    static RecyclerView Q(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView Q2 = Q(viewGroup.getChildAt(i2));
            if (Q2 != null) {
                return Q2;
            }
        }
        return null;
    }

    static b0 b0(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).a;
    }

    static void d0(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private h4 getScrollingChildHelper() {
        if (this.A0 == null) {
            this.A0 = new h4(this);
        }
        return this.A0;
    }

    private void j(b0 b0Var) {
        View view = b0Var.a;
        boolean z2 = view.getParent() == this;
        this.b.q(a0(view));
        if (b0Var.U()) {
            this.n.b(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.n.a(view, -1, true);
        } else {
            this.n.i(view);
        }
    }

    private void q() {
        F0();
        setScrollState(0);
    }

    static void s(b0 b0Var) {
        WeakReference<RecyclerView> weakReference = b0Var.b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView != b0Var.a) {
                    ViewParent parent = recyclerView.getParent();
                    recyclerView = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            b0Var.b = null;
        }
    }

    private void s0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.a0) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.a0 = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.e0 = x2;
            this.c0 = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.f0 = y2;
            this.d0 = y2;
        }
    }

    private void w0() {
        boolean z2;
        if (this.M) {
            this.f.r();
            if (this.N) {
                this.v.X0(this);
            }
        }
        boolean z3 = false;
        if (this.V != null && this.v.L1()) {
            this.f.o();
        } else {
            this.f.c();
        }
        boolean z4 = this.t0 || this.u0;
        this.q0.j = this.D && this.V != null && ((z2 = this.M) || z4 || this.v.q) && (!z2 || this.u.y());
        y yVar = this.q0;
        if (yVar.j && z4 && !this.M) {
            if (this.V != null && this.v.L1()) {
                z3 = true;
            }
        }
        yVar.k = z3;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0353, code lost:
        if (r17.n.l(getFocusedChild()) == false) goto L_0x0425;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03e9, code lost:
        r5 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A() {
        /*
        // Method dump skipped, instructions count: 1070
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A():void");
    }

    public void A0(l lVar) {
        m mVar = this.v;
        if (mVar != null) {
            mVar.y("Cannot remove item decoration during a scroll  or layout");
        }
        this.x.remove(lVar);
        if (this.x.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m0();
        requestLayout();
    }

    public void B0(n nVar) {
        List<n> list = this.L;
        if (list != null) {
            list.remove(nVar);
        }
    }

    public void C0(p pVar) {
        this.y.remove(pVar);
        if (this.z == pVar) {
            this.z = null;
        }
    }

    public boolean D(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, null, i4);
    }

    public void D0(q qVar) {
        List<q> list = this.s0;
        if (list != null) {
            list.remove(qVar);
        }
    }

    public final void E(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().d(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    /* access modifiers changed from: package-private */
    public void F(int i2, int i3) {
        this.P++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        u0(i2, i3);
        q qVar = this.r0;
        if (qVar != null) {
            qVar.c(this, i2, i3);
        }
        List<q> list = this.s0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.s0.get(size).c(this, i2, i3);
            }
        }
        this.P--;
    }

    /* access modifiers changed from: package-private */
    public void G() {
        if (this.U == null) {
            EdgeEffect a2 = this.Q.a(this);
            this.U = a2;
            if (this.p) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean G0(int r18, int r19, android.view.MotionEvent r20) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.G0(int, int, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public void H() {
        if (this.R == null) {
            EdgeEffect a2 = this.Q.a(this);
            this.R = a2;
            if (this.p) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void H0(int i2, int i3, int[] iArr) {
        b0 b0Var;
        O0();
        q0();
        androidx.core.os.h.a("RV Scroll");
        L(this.q0);
        int u1 = i2 != 0 ? this.v.u1(i2, this.b, this.q0) : 0;
        int w1 = i3 != 0 ? this.v.w1(i3, this.b, this.q0) : 0;
        androidx.core.os.h.b();
        int e2 = this.n.e();
        for (int i4 = 0; i4 < e2; i4++) {
            View d2 = this.n.d(i4);
            b0 a02 = a0(d2);
            if (!(a02 == null || (b0Var = a02.r) == null)) {
                View view = b0Var.a;
                int left = d2.getLeft();
                int top = d2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        r0(true);
        Q0(false);
        if (iArr != null) {
            iArr[0] = u1;
            iArr[1] = w1;
        }
    }

    /* access modifiers changed from: package-private */
    public void I() {
        if (this.T == null) {
            EdgeEffect a2 = this.Q.a(this);
            this.T = a2;
            if (this.p) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void I0(int i2) {
        if (!this.G) {
            R0();
            m mVar = this.v;
            if (mVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            mVar.v1(i2);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    public void J() {
        if (this.S == null) {
            EdgeEffect a2 = this.Q.a(this);
            this.S = a2;
            if (this.p) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public String K() {
        StringBuilder V0 = je.V0(" ");
        V0.append(super.toString());
        V0.append(", adapter:");
        V0.append(this.u);
        V0.append(", layout:");
        V0.append(this.v);
        V0.append(", context:");
        V0.append(getContext());
        return V0.toString();
    }

    /* access modifiers changed from: package-private */
    public boolean K0(b0 b0Var, int i2) {
        if (k0()) {
            b0Var.z = i2;
            this.E0.add(b0Var);
            return false;
        }
        q4.O(b0Var.a, i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void L(y yVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.n0.c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            yVar.getClass();
            yVar.o = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        yVar.getClass();
        yVar.o = 0;
    }

    public void L0(int i2, int i3, Interpolator interpolator) {
        M0(i2, i3, interpolator, Integer.MIN_VALUE, false);
    }

    public View M(float f2, float f3) {
        for (int e2 = this.n.e() - 1; e2 >= 0; e2--) {
            View d2 = this.n.d(e2);
            float translationX = d2.getTranslationX();
            float translationY = d2.getTranslationY();
            if (f2 >= ((float) d2.getLeft()) + translationX && f2 <= ((float) d2.getRight()) + translationX && f3 >= ((float) d2.getTop()) + translationY && f3 <= ((float) d2.getBottom()) + translationY) {
                return d2;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void M0(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        m mVar = this.v;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.G) {
            int i5 = 0;
            if (!mVar.B()) {
                i2 = 0;
            }
            if (!this.v.C()) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                if (i4 == Integer.MIN_VALUE || i4 > 0) {
                    if (z2) {
                        if (i2 != 0) {
                            i5 = 1;
                        }
                        if (i3 != 0) {
                            i5 |= 2;
                        }
                        P0(i5, 1);
                    }
                    this.n0.c(i2, i3, i4, interpolator);
                    return;
                }
                scrollBy(i2, i3);
            }
        }
    }

    public View N(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public void N0(int i2) {
        if (!this.G) {
            m mVar = this.v;
            if (mVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                mVar.I1(this, this.q0, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void O0() {
        int i2 = this.E + 1;
        this.E = i2;
        if (i2 == 1 && !this.G) {
            this.F = false;
        }
    }

    public boolean P0(int i2, int i3) {
        return getScrollingChildHelper().k(i2, i3);
    }

    /* access modifiers changed from: package-private */
    public void Q0(boolean z2) {
        if (this.E < 1) {
            this.E = 1;
        }
        if (!z2 && !this.G) {
            this.F = false;
        }
        if (this.E == 1) {
            if (z2 && this.F && !this.G && this.v != null && this.u != null) {
                A();
            }
            if (!this.G) {
                this.F = false;
            }
        }
        this.E--;
    }

    public b0 R(int i2) {
        b0 b0Var = null;
        if (this.M) {
            return null;
        }
        int h2 = this.n.h();
        for (int i3 = 0; i3 < h2; i3++) {
            b0 b02 = b0(this.n.g(i3));
            if (b02 != null && !b02.P() && V(b02) == i2) {
                if (!this.n.l(b02.a)) {
                    return b02;
                }
                b0Var = b02;
            }
        }
        return b0Var;
    }

    public void R0() {
        x xVar;
        setScrollState(0);
        this.n0.d();
        m mVar = this.v;
        if (mVar != null && (xVar = mVar.p) != null) {
            xVar.o();
        }
    }

    public b0 S(int i2) {
        return T(i2, false);
    }

    public void S0(e eVar, boolean z2) {
        setLayoutFrozen(false);
        J0(eVar, true, z2);
        x0(true);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public b0 T(int i2, boolean z2) {
        int h2 = this.n.h();
        b0 b0Var = null;
        for (int i3 = 0; i3 < h2; i3++) {
            b0 b02 = b0(this.n.g(i3));
            if (b02 != null && !b02.P()) {
                if (z2) {
                    if (b02.c != i2) {
                        continue;
                    }
                } else if (b02.A() != i2) {
                    continue;
                }
                if (!this.n.l(b02.a)) {
                    return b02;
                }
                b0Var = b02;
            }
        }
        return b0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0098 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean U(int r10, int r11) {
        /*
            r9 = this;
            androidx.recyclerview.widget.RecyclerView$m r0 = r9.v
            r1 = 0
            if (r0 != 0) goto L_0x000d
            java.lang.String r10 = "RecyclerView"
            java.lang.String r11 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r10, r11)
            return r1
        L_0x000d:
            boolean r2 = r9.G
            if (r2 == 0) goto L_0x0012
            return r1
        L_0x0012:
            boolean r0 = r0.B()
            androidx.recyclerview.widget.RecyclerView$m r2 = r9.v
            boolean r2 = r2.C()
            if (r0 == 0) goto L_0x0026
            int r3 = java.lang.Math.abs(r10)
            int r4 = r9.i0
            if (r3 >= r4) goto L_0x0027
        L_0x0026:
            r10 = 0
        L_0x0027:
            if (r2 == 0) goto L_0x0031
            int r3 = java.lang.Math.abs(r11)
            int r4 = r9.i0
            if (r3 >= r4) goto L_0x0032
        L_0x0031:
            r11 = 0
        L_0x0032:
            if (r10 != 0) goto L_0x0037
            if (r11 != 0) goto L_0x0037
            return r1
        L_0x0037:
            float r3 = (float) r10
            float r4 = (float) r11
            boolean r5 = r9.dispatchNestedPreFling(r3, r4)
            if (r5 != 0) goto L_0x00c1
            r5 = 1
            if (r0 != 0) goto L_0x0047
            if (r2 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r6 = 0
            goto L_0x0048
        L_0x0047:
            r6 = 1
        L_0x0048:
            r9.dispatchNestedFling(r3, r4, r6)
            androidx.recyclerview.widget.RecyclerView$o r3 = r9.h0
            if (r3 == 0) goto L_0x0099
            androidx.recyclerview.widget.f0 r3 = (androidx.recyclerview.widget.f0) r3
            androidx.recyclerview.widget.RecyclerView r4 = r3.a
            androidx.recyclerview.widget.RecyclerView$m r4 = r4.getLayoutManager()
            if (r4 != 0) goto L_0x005a
            goto L_0x0095
        L_0x005a:
            androidx.recyclerview.widget.RecyclerView r7 = r3.a
            androidx.recyclerview.widget.RecyclerView$e r7 = r7.getAdapter()
            if (r7 != 0) goto L_0x0063
            goto L_0x0095
        L_0x0063:
            androidx.recyclerview.widget.RecyclerView r7 = r3.a
            int r7 = r7.getMinFlingVelocity()
            int r8 = java.lang.Math.abs(r11)
            if (r8 > r7) goto L_0x0075
            int r8 = java.lang.Math.abs(r10)
            if (r8 <= r7) goto L_0x0095
        L_0x0075:
            boolean r7 = r4 instanceof androidx.recyclerview.widget.RecyclerView.x.b
            if (r7 != 0) goto L_0x007a
            goto L_0x0088
        L_0x007a:
            androidx.recyclerview.widget.t r7 = r3.e(r4)
            if (r7 != 0) goto L_0x0081
            goto L_0x0088
        L_0x0081:
            int r3 = r3.g(r4, r10, r11)
            r8 = -1
            if (r3 != r8) goto L_0x008a
        L_0x0088:
            r3 = 0
            goto L_0x0091
        L_0x008a:
            r7.m(r3)
            r4.J1(r7)
            r3 = 1
        L_0x0091:
            if (r3 == 0) goto L_0x0095
            r3 = 1
            goto L_0x0096
        L_0x0095:
            r3 = 0
        L_0x0096:
            if (r3 == 0) goto L_0x0099
            return r5
        L_0x0099:
            if (r6 == 0) goto L_0x00c1
            if (r0 == 0) goto L_0x009e
            r1 = 1
        L_0x009e:
            if (r2 == 0) goto L_0x00a2
            r1 = r1 | 2
        L_0x00a2:
            r9.P0(r1, r5)
            int r0 = r9.j0
            int r1 = -r0
            int r10 = java.lang.Math.min(r10, r0)
            int r10 = java.lang.Math.max(r1, r10)
            int r0 = r9.j0
            int r1 = -r0
            int r11 = java.lang.Math.min(r11, r0)
            int r11 = java.lang.Math.max(r1, r11)
            androidx.recyclerview.widget.RecyclerView$a0 r0 = r9.n0
            r0.a(r10, r11)
            return r5
        L_0x00c1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.U(int, int):boolean");
    }

    /* access modifiers changed from: package-private */
    public int V(b0 b0Var) {
        if (!b0Var.D(524) && b0Var.G()) {
            a aVar = this.f;
            int i2 = b0Var.c;
            int size = aVar.b.size();
            for (int i3 = 0; i3 < size; i3++) {
                a.b bVar = aVar.b.get(i3);
                int i4 = bVar.a;
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = bVar.b;
                        if (i5 <= i2) {
                            int i6 = bVar.d;
                            if (i5 + i6 <= i2) {
                                i2 -= i6;
                            }
                        } else {
                            continue;
                        }
                    } else if (i4 == 8) {
                        int i7 = bVar.b;
                        if (i7 == i2) {
                            i2 = bVar.d;
                        } else {
                            if (i7 < i2) {
                                i2--;
                            }
                            if (bVar.d <= i2) {
                                i2++;
                            }
                        }
                    }
                } else if (bVar.b <= i2) {
                    i2 += bVar.d;
                }
            }
            return i2;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public long W(b0 b0Var) {
        if (this.u.y()) {
            return b0Var.n;
        }
        return (long) b0Var.c;
    }

    public int X(View view) {
        b0 b02 = b0(view);
        if (b02 != null) {
            return b02.w();
        }
        return -1;
    }

    public long Y(View view) {
        b0 b02;
        e eVar = this.u;
        if (eVar == null || !eVar.y() || (b02 = b0(view)) == null) {
            return -1;
        }
        return b02.n;
    }

    public int Z(View view) {
        b0 b02 = b0(view);
        if (b02 != null) {
            return b02.A();
        }
        return -1;
    }

    public b0 a0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return b0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        m mVar = this.v;
        if (mVar == null || !mVar.L0()) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public void c0(View view, Rect rect) {
        d0(view, rect);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.v.D((LayoutParams) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        m mVar = this.v;
        if (mVar != null && mVar.B()) {
            return this.v.H(this.q0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        m mVar = this.v;
        if (mVar != null && mVar.B()) {
            return this.v.I(this.q0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        m mVar = this.v;
        if (mVar != null && mVar.B()) {
            return this.v.J(this.q0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        m mVar = this.v;
        if (mVar != null && mVar.C()) {
            return this.v.K(this.q0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        m mVar = this.v;
        if (mVar != null && mVar.C()) {
            return this.v.L(this.q0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        m mVar = this.v;
        if (mVar != null && mVar.C()) {
            return this.v.M(this.q0);
        }
        return 0;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().e(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.x.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.x.get(i2).l(canvas, this, this.q0);
        }
        EdgeEffect edgeEffect = this.R;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.p ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.R;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.S;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.p) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.S;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.T;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.p ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.T;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.U;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.p) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.U;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.V == null || this.x.size() <= 0 || !this.V.p()) {
            z4 = z2;
        }
        if (z4) {
            int i3 = q4.g;
            int i4 = Build.VERSION.SDK_INT;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* access modifiers changed from: package-private */
    public void e(int i2, int i3) {
        if (i2 < 0) {
            H();
            if (this.R.isFinished()) {
                this.R.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            I();
            if (this.T.isFinished()) {
                this.T.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            J();
            if (this.S.isFinished()) {
                this.S.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            G();
            if (this.U.isFinished()) {
                this.U.onAbsorb(i3);
            }
        }
        if (i2 != 0 || i3 != 0) {
            int i4 = q4.g;
            int i5 = Build.VERSION.SDK_INT;
            postInvalidateOnAnimation();
        }
    }

    /* access modifiers changed from: package-private */
    public Rect e0(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.c) {
            return layoutParams.b;
        }
        if (this.q0.g && (layoutParams.c() || layoutParams.a.J())) {
            return layoutParams.b;
        }
        Rect rect = layoutParams.b;
        rect.set(0, 0, 0, 0);
        int size = this.x.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.r.set(0, 0, 0, 0);
            this.x.get(i2).j(this.r, view, this, this.q0);
            int i3 = rect.left;
            Rect rect2 = this.r;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.c = false;
        return rect;
    }

    public l f0(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            return this.x.get(i2);
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x016f, code lost:
        if (r11 > 0) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0193, code lost:
        if (r4 > 0) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0196, code lost:
        if (r11 < 0) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0199, code lost:
        if (r4 < 0) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01a2, code lost:
        if ((r4 * r6) < 0) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01ab, code lost:
        if ((r4 * r6) > 0) goto L_0x0173;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007b  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r17, int r18) {
        /*
        // Method dump skipped, instructions count: 438
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public boolean g0() {
        return !this.D || this.M || this.f.h();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m mVar = this.v;
        if (mVar != null) {
            return mVar.R();
        }
        StringBuilder V0 = je.V0("RecyclerView has no LayoutManager");
        V0.append(K());
        throw new IllegalStateException(V0.toString());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        m mVar = this.v;
        if (mVar != null) {
            return mVar.S(getContext(), attributeSet);
        }
        StringBuilder V0 = je.V0("RecyclerView has no LayoutManager");
        V0.append(K());
        throw new IllegalStateException(V0.toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public e getAdapter() {
        return this.u;
    }

    @Override // android.view.View
    public int getBaseline() {
        m mVar = this.v;
        if (mVar == null) {
            return super.getBaseline();
        }
        mVar.getClass();
        return -1;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        h hVar = this.y0;
        if (hVar == null) {
            return super.getChildDrawingOrder(i2, i3);
        }
        r rVar = (r) hVar;
        p pVar = rVar.a;
        View view = pVar.G;
        if (view == null) {
            return i3;
        }
        int i4 = pVar.H;
        if (i4 == -1) {
            i4 = pVar.A.indexOfChild(view);
            rVar.a.H = i4;
        }
        if (i3 == i2 - 1) {
            return i4;
        }
        return i3 < i4 ? i3 : i3 + 1;
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.p;
    }

    public c0 getCompatAccessibilityDelegate() {
        return this.x0;
    }

    public i getEdgeEffectFactory() {
        return this.Q;
    }

    public j getItemAnimator() {
        return this.V;
    }

    public int getItemDecorationCount() {
        return this.x.size();
    }

    public m getLayoutManager() {
        return this.v;
    }

    public int getMaxFlingVelocity() {
        return this.j0;
    }

    public int getMinFlingVelocity() {
        return this.i0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (L0) {
            return System.nanoTime();
        }
        return 0;
    }

    public o getOnFlingListener() {
        return this.h0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.m0;
    }

    public r getRecycledViewPool() {
        return this.b.e();
    }

    public int getScrollState() {
        return this.W;
    }

    /* access modifiers changed from: package-private */
    public void h0() {
        this.U = null;
        this.S = null;
        this.T = null;
        this.R = null;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().h(0);
    }

    public void i0() {
        if (this.x.size() != 0) {
            m mVar = this.v;
            if (mVar != null) {
                mVar.y("Cannot invalidate item decorations during a scroll or layout");
            }
            m0();
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.A;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.G;
    }

    @Override // android.view.View, defpackage.g4
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().i();
    }

    /* access modifiers changed from: package-private */
    public boolean j0() {
        AccessibilityManager accessibilityManager = this.K;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void k(l lVar, int i2) {
        m mVar = this.v;
        if (mVar != null) {
            mVar.y("Cannot add item decoration during a scroll  or layout");
        }
        if (this.x.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.x.add(lVar);
        } else {
            this.x.add(i2, lVar);
        }
        m0();
        requestLayout();
    }

    public boolean k0() {
        return this.O > 0;
    }

    public void l(n nVar) {
        if (this.L == null) {
            this.L = new ArrayList();
        }
        this.L.add(nVar);
    }

    /* access modifiers changed from: package-private */
    public void l0(int i2) {
        if (this.v != null) {
            setScrollState(2);
            this.v.v1(i2);
            awakenScrollBars();
        }
    }

    public void m(p pVar) {
        this.y.add(pVar);
    }

    /* access modifiers changed from: package-private */
    public void m0() {
        int h2 = this.n.h();
        for (int i2 = 0; i2 < h2; i2++) {
            ((LayoutParams) this.n.g(i2).getLayoutParams()).c = true;
        }
        s sVar = this.b;
        int size = sVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            LayoutParams layoutParams = (LayoutParams) sVar.c.get(i3).a.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.c = true;
            }
        }
    }

    public void n(q qVar) {
        if (this.s0 == null) {
            this.s0 = new ArrayList();
        }
        this.s0.add(qVar);
    }

    /* access modifiers changed from: package-private */
    public void n0(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int h2 = this.n.h();
        for (int i5 = 0; i5 < h2; i5++) {
            b0 b02 = b0(this.n.g(i5));
            if (b02 != null && !b02.f0()) {
                int i6 = b02.c;
                if (i6 >= i4) {
                    b02.W(-i3, z2);
                    this.q0.f = true;
                } else if (i6 >= i2) {
                    b02.t(8);
                    b02.W(-i3, z2);
                    b02.c = i2 - 1;
                    this.q0.f = true;
                }
            }
        }
        s sVar = this.b;
        int size = sVar.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                b0 b0Var = sVar.c.get(size);
                if (b0Var != null) {
                    int i7 = b0Var.c;
                    if (i7 >= i4) {
                        b0Var.W(-i3, z2);
                    } else if (i7 >= i2) {
                        b0Var.t(8);
                        sVar.j(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(b0 b0Var, j.c cVar, j.c cVar2) {
        j(b0Var);
        b0Var.e0(false);
        if (this.V.c(b0Var, cVar, cVar2)) {
            v0();
        }
    }

    public void o0() {
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Display display;
        super.onAttachedToWindow();
        this.O = 0;
        this.A = true;
        this.D = this.D && !isLayoutRequested();
        m mVar = this.v;
        if (mVar != null) {
            mVar.r = true;
            mVar.M0(this);
        }
        this.w0 = false;
        if (L0) {
            ThreadLocal<o> threadLocal = o.n;
            o oVar = threadLocal.get();
            this.o0 = oVar;
            if (oVar == null) {
                this.o0 = new o();
                int i2 = q4.g;
                if (Build.VERSION.SDK_INT >= 17) {
                    display = getDisplay();
                } else {
                    display = q4.v(this) ? ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay() : null;
                }
                float f2 = 60.0f;
                if (!isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                o oVar2 = this.o0;
                oVar2.c = (long) (1.0E9f / f2);
                threadLocal.set(oVar2);
            }
            this.o0.a.add(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        o oVar;
        super.onDetachedFromWindow();
        j jVar = this.V;
        if (jVar != null) {
            jVar.k();
        }
        R0();
        this.A = false;
        m mVar = this.v;
        if (mVar != null) {
            s sVar = this.b;
            mVar.r = false;
            mVar.O0(this, sVar);
        }
        this.E0.clear();
        removeCallbacks(this.F0);
        this.o.getClass();
        do {
        } while (j0.a.d.a() != null);
        if (L0 && (oVar = this.o0) != null) {
            oVar.a.remove(this);
            this.o0 = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.x.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.x.get(i2).k(canvas, this, this.q0);
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.v != null && !this.G && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.v.C() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.v.B()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (!(f3 == 0.0f && f2 == 0.0f)) {
                        G0((int) (f2 * this.k0), (int) (f3 * this.l0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.v.C()) {
                        f3 = -axisValue;
                    } else if (this.v.B()) {
                        f2 = axisValue;
                        f3 = 0.0f;
                        G0((int) (f2 * this.k0), (int) (f3 * this.l0), motionEvent);
                    }
                }
                f3 = 0.0f;
            }
            f2 = 0.0f;
            G0((int) (f2 * this.k0), (int) (f3 * this.l0), motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.G) {
            return false;
        }
        this.z = null;
        if (O(motionEvent)) {
            q();
            return true;
        }
        m mVar = this.v;
        if (mVar == null) {
            return false;
        }
        boolean B2 = mVar.B();
        boolean C2 = this.v.C();
        if (this.b0 == null) {
            this.b0 = VelocityTracker.obtain();
        }
        this.b0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.H) {
                this.H = false;
            }
            this.a0 = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.e0 = x2;
            this.c0 = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f0 = y2;
            this.d0 = y2;
            if (this.W == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                r(1);
            }
            int[] iArr = this.C0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (C2) {
                boolean z3 = B2 ? 1 : 0;
                char c2 = B2 ? 1 : 0;
                B2 = z3 | true;
            }
            int i2 = B2 ? 1 : 0;
            int i3 = B2 ? 1 : 0;
            int i4 = B2 ? 1 : 0;
            P0(i2, 0);
        } else if (actionMasked == 1) {
            this.b0.clear();
            r(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.a0);
            if (findPointerIndex < 0) {
                StringBuilder V0 = je.V0("Error processing scroll; pointer index for id ");
                V0.append(this.a0);
                V0.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", V0.toString());
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.W != 1) {
                int i5 = x3 - this.c0;
                int i6 = y3 - this.d0;
                if (!B2 || Math.abs(i5) <= this.g0) {
                    z2 = false;
                } else {
                    this.e0 = x3;
                    z2 = true;
                }
                if (C2 && Math.abs(i6) > this.g0) {
                    this.f0 = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            q();
        } else if (actionMasked == 5) {
            this.a0 = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.e0 = x4;
            this.c0 = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f0 = y4;
            this.d0 = y4;
        } else if (actionMasked == 6) {
            s0(motionEvent);
        }
        if (this.W == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        androidx.core.os.h.a("RV OnLayout");
        A();
        androidx.core.os.h.b();
        this.D = true;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        m mVar = this.v;
        if (mVar == null) {
            x(i2, i3);
            return;
        }
        boolean z2 = false;
        if (mVar.y0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.v.e1(this.b, this.q0, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (!z2 && this.u != null) {
                if (this.q0.d == 1) {
                    B();
                }
                this.v.z1(i2, i3);
                this.q0.i = true;
                C();
                this.v.C1(i2, i3);
                if (this.v.G1()) {
                    this.v.z1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.q0.i = true;
                    C();
                    this.v.C1(i2, i3);
                }
            }
        } else if (this.B) {
            this.v.e1(this.b, this.q0, i2, i3);
        } else {
            if (this.J) {
                O0();
                q0();
                w0();
                r0(true);
                y yVar = this.q0;
                if (yVar.k) {
                    yVar.g = true;
                } else {
                    this.f.c();
                    this.q0.g = false;
                }
                this.J = false;
                Q0(false);
            } else if (this.q0.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            e eVar = this.u;
            if (eVar != null) {
                this.q0.e = eVar.u();
            } else {
                this.q0.e = 0;
            }
            O0();
            this.v.e1(this.b, this.q0, i2, i3);
            Q0(false);
            this.q0.g = false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (k0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof v)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v vVar = (v) parcelable;
        this.c = vVar;
        super.onRestoreInstanceState(vVar.a());
        m mVar = this.v;
        if (mVar != null && (parcelable2 = this.c.c) != null) {
            mVar.h1(parcelable2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        v vVar = new v(super.onSaveInstanceState());
        v vVar2 = this.c;
        if (vVar2 != null) {
            vVar.c = vVar2.c;
        } else {
            m mVar = this.v;
            if (mVar != null) {
                vVar.c = mVar.i1();
            } else {
                vVar.c = null;
            }
        }
        return vVar;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            h0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0110  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
        // Method dump skipped, instructions count: 504
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public void p(String str) {
        if (k0()) {
            if (str == null) {
                StringBuilder V0 = je.V0("Cannot call this method while RecyclerView is computing a layout or scrolling");
                V0.append(K());
                throw new IllegalStateException(V0.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.P > 0) {
            StringBuilder V02 = je.V0("");
            V02.append(K());
            new IllegalStateException(V02.toString());
        }
    }

    public void p0() {
    }

    /* access modifiers changed from: package-private */
    public void q0() {
        this.O++;
    }

    @Override // defpackage.f4
    public void r(int i2) {
        getScrollingChildHelper().l(i2);
    }

    /* access modifiers changed from: package-private */
    public void r0(boolean z2) {
        int i2;
        boolean z3 = true;
        int i3 = this.O - 1;
        this.O = i3;
        if (i3 < 1) {
            this.O = 0;
            if (z2) {
                int i4 = this.I;
                this.I = 0;
                if (i4 != 0) {
                    AccessibilityManager accessibilityManager = this.K;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z3 = false;
                    }
                    if (z3) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        if (Build.VERSION.SDK_INT >= 19) {
                            obtain.setContentChangeTypes(i4);
                        }
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.E0.size() - 1; size >= 0; size--) {
                    b0 b0Var = this.E0.get(size);
                    if (b0Var.a.getParent() == this && !b0Var.f0() && (i2 = b0Var.z) != -1) {
                        q4.O(b0Var.a, i2);
                        b0Var.z = -1;
                    }
                }
                this.E0.clear();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        b0 b02 = b0(view);
        if (b02 != null) {
            if (b02.U()) {
                b02.s &= -257;
            } else if (!b02.f0()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + b02 + K());
            }
        }
        view.clearAnimation();
        z(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.v.g1(this, view, view2) && view2 != null) {
            E0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.v.s1(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.y.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.y.get(i2).f(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.ViewParent, android.view.View
    public void requestLayout() {
        if (this.E != 0 || this.G) {
            this.F = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        m mVar = this.v;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.G) {
            boolean B2 = mVar.B();
            boolean C2 = this.v.C();
            if (B2 || C2) {
                if (!B2) {
                    i2 = 0;
                }
                if (!C2) {
                    i3 = 0;
                }
                G0(i2, i3, null);
            }
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i2 = 0;
        if (k0()) {
            int contentChangeTypes = (accessibilityEvent == null || Build.VERSION.SDK_INT < 19) ? 0 : accessibilityEvent.getContentChangeTypes();
            if (contentChangeTypes != 0) {
                i2 = contentChangeTypes;
            }
            this.I |= i2;
            i2 = 1;
        }
        if (i2 == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(c0 c0Var) {
        this.x0 = c0Var;
        q4.I(this, c0Var);
    }

    public void setAdapter(e eVar) {
        setLayoutFrozen(false);
        J0(eVar, false, true);
        x0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(h hVar) {
        if (hVar != this.y0) {
            this.y0 = hVar;
            setChildrenDrawingOrderEnabled(hVar != null);
        }
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.p) {
            h0();
        }
        this.p = z2;
        super.setClipToPadding(z2);
        if (this.D) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(i iVar) {
        iVar.getClass();
        this.Q = iVar;
        h0();
    }

    public void setHasFixedSize(boolean z2) {
        this.B = z2;
    }

    public void setItemAnimator(j jVar) {
        j jVar2 = this.V;
        if (jVar2 != null) {
            jVar2.k();
            this.V.t(null);
        }
        this.V = jVar;
        if (jVar != null) {
            jVar.t(this.v0);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.b.n(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(m mVar) {
        if (mVar != this.v) {
            R0();
            if (this.v != null) {
                j jVar = this.V;
                if (jVar != null) {
                    jVar.k();
                }
                this.v.n1(this.b);
                this.v.o1(this.b);
                this.b.c();
                if (this.A) {
                    m mVar2 = this.v;
                    s sVar = this.b;
                    mVar2.r = false;
                    mVar2.O0(this, sVar);
                }
                this.v.E1(null);
                this.v = null;
            } else {
                this.b.c();
            }
            f fVar = this.n;
            f.a aVar = fVar.b;
            aVar.a = 0;
            f.a aVar2 = aVar.b;
            if (aVar2 != null) {
                aVar2.g();
            }
            int size = fVar.c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                a0 a0Var = (a0) fVar.a;
                a0Var.getClass();
                b0 b02 = b0(fVar.c.get(size));
                if (b02 != null) {
                    b02.a0(a0Var.a);
                }
                fVar.c.remove(size);
            }
            a0 a0Var2 = (a0) fVar.a;
            int b2 = a0Var2.b();
            for (int i2 = 0; i2 < b2; i2++) {
                View a2 = a0Var2.a(i2);
                a0Var2.a.z(a2);
                a2.clearAnimation();
            }
            a0Var2.a.removeAllViews();
            this.v = mVar;
            if (mVar != null) {
                if (mVar.b == null) {
                    mVar.E1(this);
                    if (this.A) {
                        m mVar3 = this.v;
                        mVar3.r = true;
                        mVar3.M0(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + mVar + " is already attached to a RecyclerView:" + mVar.b.K());
                }
            }
            this.b.r();
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View, defpackage.g4
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().j(z2);
    }

    public void setOnFlingListener(o oVar) {
        this.h0 = oVar;
    }

    @Deprecated
    public void setOnScrollListener(q qVar) {
        this.r0 = qVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.m0 = z2;
    }

    public void setRecycledViewPool(r rVar) {
        s sVar = this.b;
        r rVar2 = sVar.g;
        if (rVar2 != null) {
            rVar2.b();
        }
        sVar.g = rVar;
        if (rVar != null && RecyclerView.this.getAdapter() != null) {
            sVar.g.a();
        }
    }

    public void setRecyclerListener(t tVar) {
        this.w = tVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i2) {
        x xVar;
        if (i2 != this.W) {
            this.W = i2;
            if (i2 != 2) {
                this.n0.d();
                m mVar = this.v;
                if (!(mVar == null || (xVar = mVar.p) == null)) {
                    xVar.o();
                }
            }
            m mVar2 = this.v;
            if (mVar2 != null) {
                mVar2.j1(i2);
            }
            t0(i2);
            q qVar = this.r0;
            if (qVar != null) {
                qVar.a(this, i2);
            }
            List<q> list = this.s0;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        this.s0.get(size).a(this, i2);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 1) {
            this.g0 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.g0 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(z zVar) {
        this.b.getClass();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().k(i2, 0);
    }

    @Override // android.view.View, defpackage.g4
    public void stopNestedScroll() {
        getScrollingChildHelper().l(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.G) {
            p("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.G = false;
                if (!(!this.F || this.v == null || this.u == null)) {
                    requestLayout();
                }
                this.F = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.G = true;
            this.H = true;
            R0();
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        int h2 = this.n.h();
        for (int i2 = 0; i2 < h2; i2++) {
            b0 b02 = b0(this.n.g(i2));
            if (!b02.f0()) {
                b02.u();
            }
        }
        s sVar = this.b;
        int size = sVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            sVar.c.get(i3).u();
        }
        int size2 = sVar.a.size();
        for (int i4 = 0; i4 < size2; i4++) {
            sVar.a.get(i4).u();
        }
        ArrayList<b0> arrayList = sVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                sVar.b.get(i5).u();
            }
        }
    }

    public void t0(int i2) {
    }

    public void u() {
        List<q> list = this.s0;
        if (list != null) {
            list.clear();
        }
    }

    public void u0(int i2, int i3) {
    }

    /* access modifiers changed from: package-private */
    public void v(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.R;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.R.onRelease();
            z2 = this.R.isFinished();
        }
        EdgeEffect edgeEffect2 = this.T;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.T.onRelease();
            z2 |= this.T.isFinished();
        }
        EdgeEffect edgeEffect3 = this.S;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.S.onRelease();
            z2 |= this.S.isFinished();
        }
        EdgeEffect edgeEffect4 = this.U;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.U.onRelease();
            z2 |= this.U.isFinished();
        }
        if (z2) {
            int i4 = q4.g;
            int i5 = Build.VERSION.SDK_INT;
            postInvalidateOnAnimation();
        }
    }

    /* access modifiers changed from: package-private */
    public void v0() {
        if (!this.w0 && this.A) {
            Runnable runnable = this.F0;
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            postOnAnimation(runnable);
            this.w0 = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void w() {
        if (!this.D || this.M) {
            androidx.core.os.h.a("RV FullInvalidate");
            A();
            androidx.core.os.h.b();
        } else if (this.f.h()) {
            if (this.f.g(4) && !this.f.g(11)) {
                androidx.core.os.h.a("RV PartialInvalidate");
                O0();
                q0();
                this.f.o();
                if (!this.F) {
                    int e2 = this.n.e();
                    boolean z2 = false;
                    int i2 = 0;
                    while (true) {
                        if (i2 < e2) {
                            b0 b02 = b0(this.n.d(i2));
                            if (b02 != null && !b02.f0() && b02.V()) {
                                z2 = true;
                                break;
                            }
                            i2++;
                        } else {
                            break;
                        }
                    }
                    if (z2) {
                        A();
                    } else {
                        this.f.b();
                    }
                }
                Q0(true);
                r0(true);
                androidx.core.os.h.b();
            } else if (this.f.h()) {
                androidx.core.os.h.a("RV FullInvalidate");
                A();
                androidx.core.os.h.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void x(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int i4 = q4.g;
        int i5 = Build.VERSION.SDK_INT;
        setMeasuredDimension(m.E(i2, paddingRight, getMinimumWidth()), m.E(i3, getPaddingBottom() + getPaddingTop(), q4.p(this)));
    }

    /* access modifiers changed from: package-private */
    public void x0(boolean z2) {
        this.N = z2 | this.N;
        this.M = true;
        int h2 = this.n.h();
        for (int i2 = 0; i2 < h2; i2++) {
            b0 b02 = b0(this.n.g(i2));
            if (b02 != null && !b02.f0()) {
                b02.t(6);
            }
        }
        m0();
        s sVar = this.b;
        int size = sVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            b0 b0Var = sVar.c.get(i3);
            if (b0Var != null) {
                b0Var.t(6);
                b0Var.q(null);
            }
        }
        e eVar = RecyclerView.this.u;
        if (eVar == null || !eVar.y()) {
            sVar.i();
        }
    }

    /* access modifiers changed from: package-private */
    public void y(View view) {
        b0 b02 = b0(view);
        o0();
        e eVar = this.u;
        if (!(eVar == null || b02 == null)) {
            eVar.P(b02);
        }
        List<n> list = this.L;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.L.get(size).d(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void y0(b0 b0Var, j.c cVar) {
        b0Var.d0(0, 8192);
        if (this.q0.h && b0Var.V() && !b0Var.P() && !b0Var.f0()) {
            this.o.b.o(W(b0Var), b0Var);
        }
        this.o.c(b0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    public void z(View view) {
        b0 b02 = b0(view);
        p0();
        e eVar = this.u;
        if (!(eVar == null || b02 == null)) {
            eVar.Q(b02);
        }
        List<n> list = this.L;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.L.get(size).b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void z0() {
        j jVar = this.V;
        if (jVar != null) {
            jVar.k();
        }
        m mVar = this.v;
        if (mVar != null) {
            mVar.n1(this.b);
            this.v.o1(this.b);
        }
        this.b.c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        char c2;
        ClassLoader classLoader;
        Object[] objArr;
        Constructor<? extends U> constructor;
        this.a = new u();
        this.b = new s();
        this.o = new j0();
        this.q = new a();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new RectF();
        this.x = new ArrayList<>();
        this.y = new ArrayList<>();
        this.E = 0;
        this.M = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new i();
        this.V = new g();
        this.W = 0;
        this.a0 = -1;
        this.k0 = Float.MIN_VALUE;
        this.l0 = Float.MIN_VALUE;
        boolean z2 = true;
        this.m0 = true;
        this.n0 = new a0();
        this.p0 = L0 ? new o.b() : null;
        this.q0 = new y();
        this.t0 = false;
        this.u0 = false;
        this.v0 = new k();
        this.w0 = false;
        this.z0 = new int[2];
        this.B0 = new int[2];
        this.C0 = new int[2];
        this.D0 = new int[2];
        this.E0 = new ArrayList();
        this.F0 = new b();
        this.G0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.g0 = viewConfiguration.getScaledTouchSlop();
        this.k0 = u4.b(viewConfiguration, context);
        this.l0 = u4.c(viewConfiguration, context);
        this.i0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.j0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.V.t(this.v0);
        this.f = new a(new b0(this));
        this.n = new f(new a0(this));
        int i4 = q4.g;
        int i5 = Build.VERSION.SDK_INT;
        if ((i5 >= 26 ? getImportantForAutofill() : 0) == 0 && i5 >= 26) {
            setImportantForAutofill(8);
        }
        if (q4.n(this) == 0) {
            q4.O(this, 1);
        }
        this.K = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new c0(this));
        int[] iArr = i7.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        if (i5 >= 29) {
            i3 = 8;
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        } else {
            i3 = 8;
        }
        String string = obtainStyledAttributes.getString(i3);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.p = obtainStyledAttributes.getBoolean(1, true);
        boolean z3 = obtainStyledAttributes.getBoolean(3, false);
        this.C = z3;
        if (z3) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                StringBuilder V0 = je.V0("Trying to set fast scroller without both required drawables.");
                V0.append(K());
                throw new IllegalArgumentException(V0.toString());
            }
            Resources resources = getContext().getResources();
            c2 = 2;
            new n(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0707R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(C0707R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(C0707R.dimen.fastscroll_margin));
        } else {
            c2 = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(m.class);
                    try {
                        constructor = asSubclass.getConstructor(M0);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c2] = Integer.valueOf(i2);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e3);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((m) constructor.newInstance(objArr));
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e7);
                } catch (ClassCastException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e8);
                }
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 21) {
            int[] iArr2 = H0;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
            if (i6 >= 29) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i2, 0);
            }
            z2 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z2);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        b0 a;
        final Rect b = new Rect();
        boolean c = true;
        boolean f = false;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int a() {
            return this.a.w();
        }

        public int b() {
            return this.a.A();
        }

        public boolean c() {
            return this.a.V();
        }

        public boolean e() {
            return this.a.P();
        }

        public boolean f() {
            return this.a.J();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
        }
    }

    public static class v extends l5 {
        public static final Parcelable.Creator<v> CREATOR = new a();
        Parcelable c;

        static class a implements Parcelable.ClassLoaderCreator<v> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public v createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new v(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new v[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new v(parcel, null);
            }
        }

        v(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readParcelable(classLoader == null ? m.class.getClassLoader() : classLoader);
        }

        @Override // defpackage.l5, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, 0);
        }

        v(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m mVar = this.v;
        if (mVar != null) {
            return mVar.T(layoutParams);
        }
        StringBuilder V0 = je.V0("RecyclerView has no LayoutManager");
        V0.append(K());
        throw new IllegalStateException(V0.toString());
    }
}
