package androidx.fragment.app;

import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i;
import androidx.lifecycle.i0;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.u;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.UUID;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, n, i0, i, androidx.savedstate.b {
    static final Object f0 = new Object();
    o A;
    l<?> B;
    o C;
    Fragment D;
    int E;
    int F;
    String G;
    boolean H;
    boolean I;
    boolean J;
    boolean K;
    boolean L;
    boolean M;
    private boolean N;
    ViewGroup O;
    View P;
    boolean Q;
    boolean R;
    c S;
    boolean T;
    boolean U;
    float V;
    LayoutInflater W;
    boolean X;
    Lifecycle.State Y;
    o Z;
    int a;
    k0 a0;
    Bundle b;
    u<n> b0;
    SparseArray<Parcelable> c;
    private g0.b c0;
    androidx.savedstate.a d0;
    private int e0;
    Boolean f;
    String n;
    Bundle o;
    Fragment p;
    String q;
    int r;
    private Boolean s;
    boolean t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    int z;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.y2();
        }
    }

    class b extends i {
        b() {
        }

        @Override // androidx.fragment.app.i
        public View a(int i) {
            View view = Fragment.this.P;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.i
        public boolean b() {
            return Fragment.this.P != null;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {
        View a;
        Animator b;
        int c;
        int d;
        int e;
        Object f = null;
        Object g;
        Object h;
        Object i;
        Object j;
        Object k;
        boolean l;
        d m;
        boolean n;

        c() {
            Object obj = Fragment.f0;
            this.g = obj;
            this.h = null;
            this.i = obj;
            this.j = null;
            this.k = obj;
        }
    }

    /* access modifiers changed from: package-private */
    public interface d {
    }

    public Fragment() {
        this.a = -1;
        this.n = UUID.randomUUID().toString();
        this.q = null;
        this.s = null;
        this.C = new q();
        this.M = true;
        this.R = true;
        this.Y = Lifecycle.State.RESUMED;
        this.b0 = new u<>();
        c3();
    }

    private c A2() {
        if (this.S == null) {
            this.S = new c();
        }
        return this.S;
    }

    private void c3() {
        this.Z = new o(this);
        this.d0 = androidx.savedstate.a.a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.Z.a(new l() {
                /* class androidx.fragment.app.Fragment.AnonymousClass2 */

                @Override // androidx.lifecycle.l
                public void p(n nVar, Lifecycle.Event event) {
                    View view;
                    if (event == Lifecycle.Event.ON_STOP && (view = Fragment.this.P) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
    }

    @Override // androidx.lifecycle.n
    public Lifecycle A() {
        return this.Z;
    }

    public LayoutInflater A3(Bundle bundle) {
        return N2();
    }

    /* access modifiers changed from: package-private */
    public void A4(d dVar) {
        A2();
        c cVar = this.S;
        d dVar2 = cVar.m;
        if (dVar != dVar2) {
            if (dVar == null || dVar2 == null) {
                if (cVar.l) {
                    cVar.m = dVar;
                }
                if (dVar != null) {
                    ((o.i) dVar).d();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public final c B2() {
        l<?> lVar = this.B;
        if (lVar == null) {
            return null;
        }
        return (c) lVar.c();
    }

    public void B3() {
    }

    public void B4(boolean z2) {
        this.J = z2;
        o oVar = this.A;
        if (oVar == null) {
            this.K = true;
        } else if (z2) {
            oVar.e(this);
        } else {
            oVar.E0(this);
        }
    }

    /* access modifiers changed from: package-private */
    public View C2() {
        c cVar = this.S;
        if (cVar == null) {
            return null;
        }
        return cVar.a;
    }

    @Deprecated
    public void C3() {
        this.N = true;
    }

    public void C4(Object obj) {
        A2().j = obj;
    }

    public final Bundle D2() {
        return this.o;
    }

    public void D3(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.N = true;
        l<?> lVar = this.B;
        if ((lVar == null ? null : lVar.c()) != null) {
            this.N = false;
            C3();
        }
    }

    /* access modifiers changed from: package-private */
    public void D4(int i) {
        A2().c = i;
    }

    public final o E2() {
        if (this.B != null) {
            return this.C;
        }
        throw new IllegalStateException(je.u0("Fragment ", this, " has not been attached yet."));
    }

    public void E3() {
    }

    public void E4(Fragment fragment, int i) {
        o oVar = this.A;
        o oVar2 = fragment != null ? fragment.A : null;
        if (oVar == null || oVar2 == null || oVar == oVar2) {
            for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.Y2()) {
                if (fragment2 == this) {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.q = null;
                this.p = null;
            } else if (this.A == null || fragment.A == null) {
                this.q = null;
                this.p = fragment;
            } else {
                this.q = fragment.n;
                this.p = null;
            }
            this.r = i;
            return;
        }
        throw new IllegalArgumentException(je.u0("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
    }

    public Context F2() {
        l<?> lVar = this.B;
        if (lVar == null) {
            return null;
        }
        return lVar.d();
    }

    public boolean F3() {
        return false;
    }

    @Deprecated
    public void F4(boolean z2) {
        if (!this.R && z2 && this.a < 3 && this.A != null && e3() && this.X) {
            this.A.u0(this);
        }
        this.R = z2;
        this.Q = this.a < 3 && !z2;
        if (this.b != null) {
            this.f = Boolean.valueOf(z2);
        }
    }

    public Object G2() {
        c cVar = this.S;
        if (cVar == null) {
            return null;
        }
        return cVar.f;
    }

    public void G3() {
    }

    public void G4(Intent intent, Bundle bundle) {
        l<?> lVar = this.B;
        if (lVar != null) {
            lVar.l(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException(je.u0("Fragment ", this, " not attached to Activity"));
    }

    /* access modifiers changed from: package-private */
    public void H2() {
        c cVar = this.S;
        if (cVar != null) {
            cVar.getClass();
        }
    }

    public void H3() {
        this.N = true;
    }

    public void H4(Intent intent, int i, Bundle bundle) {
        l<?> lVar = this.B;
        if (lVar != null) {
            lVar.l(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException(je.u0("Fragment ", this, " not attached to Activity"));
    }

    public Object I2() {
        c cVar = this.S;
        if (cVar == null) {
            return null;
        }
        return cVar.h;
    }

    public void I3() {
    }

    public void I4(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        l<?> lVar = this.B;
        if (lVar != null) {
            lVar.m(this, intentSender, i, null, i2, i3, i4, null);
            return;
        }
        throw new IllegalStateException(je.u0("Fragment ", this, " not attached to Activity"));
    }

    /* access modifiers changed from: package-private */
    public void J2() {
        c cVar = this.S;
        if (cVar != null) {
            cVar.getClass();
        }
    }

    public void J3(Menu menu) {
    }

    public void J4() {
        o oVar = this.A;
        if (oVar == null || oVar.o == null) {
            A2().l = false;
        } else if (Looper.myLooper() != this.A.o.e().getLooper()) {
            this.A.o.e().postAtFrontOfQueue(new a());
        } else {
            y2();
        }
    }

    @Deprecated
    public final o K2() {
        return this.A;
    }

    public void K3(boolean z2) {
    }

    public final int L2() {
        return this.E;
    }

    public void L3(int i, String[] strArr, int[] iArr) {
    }

    public final LayoutInflater M2() {
        LayoutInflater layoutInflater = this.W;
        return layoutInflater == null ? Z3(null) : layoutInflater;
    }

    public void M3() {
        this.N = true;
    }

    @Deprecated
    public LayoutInflater N2() {
        l<?> lVar = this.B;
        if (lVar != null) {
            LayoutInflater i = lVar.i();
            e4.c(i, this.C.c0());
            return i;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void N3(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public int O2() {
        c cVar = this.S;
        if (cVar == null) {
            return 0;
        }
        return cVar.d;
    }

    public void O3() {
        this.N = true;
    }

    public final Fragment P2() {
        return this.D;
    }

    public void P3() {
        this.N = true;
    }

    public final o Q2() {
        o oVar = this.A;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException(je.u0("Fragment ", this, " not associated with a fragment manager."));
    }

    public void Q3(View view, Bundle bundle) {
    }

    public final Resources R2() {
        return l4().getResources();
    }

    public void R3(Bundle bundle) {
        this.N = true;
    }

    public final boolean S2() {
        return this.J;
    }

    /* access modifiers changed from: package-private */
    public void S3(Bundle bundle) {
        this.C.t0();
        this.a = 2;
        this.N = false;
        m3(bundle);
        if (this.N) {
            this.C.o();
            return;
        }
        throw new SuperNotCalledException(je.u0("Fragment ", this, " did not call through to super.onActivityCreated()"));
    }

    public Object T2() {
        c cVar = this.S;
        if (cVar == null) {
            return null;
        }
        return cVar.j;
    }

    /* access modifiers changed from: package-private */
    public void T3() {
        this.C.g(this.B, new b(), this);
        this.a = 0;
        this.N = false;
        p3(this.B.d());
        if (!this.N) {
            throw new SuperNotCalledException(je.u0("Fragment ", this, " did not call through to super.onAttach()"));
        }
    }

    /* access modifiers changed from: package-private */
    public int U2() {
        c cVar = this.S;
        if (cVar == null) {
            return 0;
        }
        return cVar.c;
    }

    /* access modifiers changed from: package-private */
    public void U3(Bundle bundle) {
        this.C.t0();
        this.a = 1;
        this.N = false;
        this.d0.c(bundle);
        s3(bundle);
        this.X = true;
        if (this.N) {
            this.Z.f(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new SuperNotCalledException(je.u0("Fragment ", this, " did not call through to super.onCreate()"));
    }

    public final String V2(int i) {
        return R2().getString(i);
    }

    /* access modifiers changed from: package-private */
    public void V3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.C.t0();
        this.y = true;
        this.a0 = new k0();
        View w3 = w3(layoutInflater, viewGroup, bundle);
        this.P = w3;
        if (w3 != null) {
            this.a0.b();
            this.b0.n(this.a0);
        } else if (!this.a0.c()) {
            this.a0 = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final String W2(int i, Object... objArr) {
        return R2().getString(i, objArr);
    }

    /* access modifiers changed from: package-private */
    public void W3() {
        this.C.t();
        this.Z.f(Lifecycle.Event.ON_DESTROY);
        this.a = 0;
        this.N = false;
        this.X = false;
        x3();
        if (!this.N) {
            throw new SuperNotCalledException(je.u0("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public final String X2() {
        return this.G;
    }

    /* access modifiers changed from: package-private */
    public void X3() {
        this.C.u();
        if (this.P != null) {
            this.a0.a(Lifecycle.Event.ON_DESTROY);
        }
        this.a = 1;
        this.N = false;
        y3();
        if (this.N) {
            c6.c(this).e();
            this.y = false;
            return;
        }
        throw new SuperNotCalledException(je.u0("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public final Fragment Y2() {
        String str;
        Fragment fragment = this.p;
        if (fragment != null) {
            return fragment;
        }
        o oVar = this.A;
        if (oVar == null || (str = this.q) == null) {
            return null;
        }
        return oVar.S(str);
    }

    /* access modifiers changed from: package-private */
    public void Y3() {
        this.a = -1;
        this.N = false;
        z3();
        this.W = null;
        if (!this.N) {
            throw new SuperNotCalledException(je.u0("Fragment ", this, " did not call through to super.onDetach()"));
        } else if (!this.C.j0()) {
            this.C.t();
            this.C = new q();
        }
    }

    @Override // androidx.lifecycle.i0
    public h0 Z() {
        o oVar = this.A;
        if (oVar != null) {
            return oVar.g0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final int Z2() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater Z3(Bundle bundle) {
        LayoutInflater A3 = A3(bundle);
        this.W = A3;
        return A3;
    }

    public View a3() {
        return this.P;
    }

    /* access modifiers changed from: package-private */
    public void a4() {
        onLowMemory();
        this.C.v();
    }

    public n b3() {
        k0 k0Var = this.a0;
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public void b4() {
        this.C.A();
        if (this.P != null) {
            this.a0.a(Lifecycle.Event.ON_PAUSE);
        }
        this.Z.f(Lifecycle.Event.ON_PAUSE);
        this.a = 3;
        this.N = false;
        H3();
        if (!this.N) {
            throw new SuperNotCalledException(je.u0("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c4(Menu menu) {
        boolean z2 = false;
        if (this.H) {
            return false;
        }
        if (this.L && this.M) {
            z2 = true;
            J3(menu);
        }
        return z2 | this.C.C(menu);
    }

    /* access modifiers changed from: package-private */
    public void d3() {
        c3();
        this.n = UUID.randomUUID().toString();
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.z = 0;
        this.A = null;
        this.C = new q();
        this.B = null;
        this.E = 0;
        this.F = 0;
        this.G = null;
        this.H = false;
        this.I = false;
    }

    /* access modifiers changed from: package-private */
    public void d4() {
        boolean n0 = this.A.n0(this);
        Boolean bool = this.s;
        if (bool == null || bool.booleanValue() != n0) {
            this.s = Boolean.valueOf(n0);
            K3(n0);
            this.C.D();
        }
    }

    public final boolean e3() {
        return this.B != null && this.t;
    }

    /* access modifiers changed from: package-private */
    public void e4() {
        this.C.t0();
        this.C.N(true);
        this.a = 4;
        this.N = false;
        M3();
        if (this.N) {
            androidx.lifecycle.o oVar = this.Z;
            Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
            oVar.f(event);
            if (this.P != null) {
                this.a0.a(event);
            }
            this.C.E();
            return;
        }
        throw new SuperNotCalledException(je.u0("Fragment ", this, " did not call through to super.onResume()"));
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final boolean f3() {
        return this.I;
    }

    /* access modifiers changed from: package-private */
    public void f4() {
        this.C.t0();
        this.C.N(true);
        this.a = 3;
        this.N = false;
        O3();
        if (this.N) {
            androidx.lifecycle.o oVar = this.Z;
            Lifecycle.Event event = Lifecycle.Event.ON_START;
            oVar.f(event);
            if (this.P != null) {
                this.a0.a(event);
            }
            this.C.F();
            return;
        }
        throw new SuperNotCalledException(je.u0("Fragment ", this, " did not call through to super.onStart()"));
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry g0() {
        return this.d0.b();
    }

    /* access modifiers changed from: package-private */
    public boolean g3() {
        c cVar = this.S;
        if (cVar == null) {
            return false;
        }
        return cVar.n;
    }

    /* access modifiers changed from: package-private */
    public void g4() {
        this.C.H();
        if (this.P != null) {
            this.a0.a(Lifecycle.Event.ON_STOP);
        }
        this.Z.f(Lifecycle.Event.ON_STOP);
        this.a = 2;
        this.N = false;
        P3();
        if (!this.N) {
            throw new SuperNotCalledException(je.u0("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean h3() {
        return this.z > 0;
    }

    public void h4() {
        A2().l = true;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean i3() {
        return this.u;
    }

    public final void i4(String[] strArr, int i) {
        l<?> lVar = this.B;
        if (lVar != null) {
            lVar.j(this, strArr, i);
            return;
        }
        throw new IllegalStateException(je.u0("Fragment ", this, " not attached to Activity"));
    }

    /* access modifiers changed from: package-private */
    public final boolean j3() {
        Fragment fragment = this.D;
        return fragment != null && (fragment.u || fragment.j3());
    }

    public final c j4() {
        c B2 = B2();
        if (B2 != null) {
            return B2;
        }
        throw new IllegalStateException(je.u0("Fragment ", this, " not attached to an activity."));
    }

    public final boolean k3() {
        return this.a >= 4;
    }

    public final Bundle k4() {
        Bundle bundle = this.o;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(je.u0("Fragment ", this, " does not have any arguments."));
    }

    @Override // androidx.lifecycle.i
    public g0.b l1() {
        if (this.A != null) {
            if (this.c0 == null) {
                this.c0 = new b0(j4().getApplication(), this, this.o);
            }
            return this.c0;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final boolean l3() {
        View view;
        return e3() && !this.H && (view = this.P) != null && view.getWindowToken() != null && this.P.getVisibility() == 0;
    }

    public final Context l4() {
        Context F2 = F2();
        if (F2 != null) {
            return F2;
        }
        throw new IllegalStateException(je.u0("Fragment ", this, " not attached to a context."));
    }

    public void m3(Bundle bundle) {
        this.N = true;
    }

    public final View m4() {
        View view = this.P;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(je.u0("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void n3(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    public void n4(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.C.F0(parcelable);
            this.C.r();
        }
    }

    @Deprecated
    public void o3() {
        this.N = true;
    }

    /* access modifiers changed from: package-private */
    public final void o4(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.c;
        if (sparseArray != null) {
            this.P.restoreHierarchyState(sparseArray);
            this.c = null;
        }
        this.N = false;
        R3(bundle);
        if (!this.N) {
            throw new SuperNotCalledException(je.u0("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        } else if (this.P != null) {
            this.a0.a(Lifecycle.Event.ON_CREATE);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.N = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        j4().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.N = true;
    }

    public void p3(Context context) {
        this.N = true;
        l<?> lVar = this.B;
        if ((lVar == null ? null : lVar.c()) != null) {
            this.N = false;
            o3();
        }
    }

    /* access modifiers changed from: package-private */
    public void p4(View view) {
        A2().a = view;
    }

    public void q3() {
    }

    /* access modifiers changed from: package-private */
    public void q4(Animator animator) {
        A2().b = animator;
    }

    public boolean r3() {
        return false;
    }

    public void r4(Bundle bundle) {
        boolean z2;
        o oVar = this.A;
        if (oVar != null) {
            if (oVar == null) {
                z2 = false;
            } else {
                z2 = oVar.o0();
            }
            if (z2) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.o = bundle;
    }

    public void s3(Bundle bundle) {
        Parcelable parcelable;
        boolean z2 = true;
        this.N = true;
        if (!(bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null)) {
            this.C.F0(parcelable);
            this.C.r();
        }
        o oVar = this.C;
        if (oVar.n < 1) {
            z2 = false;
        }
        if (!z2) {
            oVar.r();
        }
    }

    public void s4(Object obj) {
        A2().f = obj;
    }

    public void startActivityForResult(Intent intent, int i) {
        H4(intent, i, null);
    }

    public Animation t3() {
        return null;
    }

    public void t4(Object obj) {
        A2().h = obj;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.n);
        sb.append(")");
        if (this.E != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.E));
        }
        if (this.G != null) {
            sb.append(" ");
            sb.append(this.G);
        }
        sb.append('}');
        return sb.toString();
    }

    public Animator u3() {
        return null;
    }

    public void u4(boolean z2) {
        if (this.L != z2) {
            this.L = z2;
            if (e3() && !this.H) {
                this.B.n();
            }
        }
    }

    public void v3(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    public void v4(boolean z2) {
        A2().n = z2;
    }

    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.e0;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void w4(e eVar) {
        Bundle bundle;
        if (this.A == null) {
            if (eVar == null || (bundle = eVar.a) == null) {
                bundle = null;
            }
            this.b = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void x3() {
        this.N = true;
    }

    public void x4(boolean z2) {
        if (this.M != z2) {
            this.M = z2;
            if (this.L && e3() && !this.H) {
                this.B.n();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void y2() {
        c cVar = this.S;
        Object obj = null;
        if (cVar != null) {
            cVar.l = false;
            Object obj2 = cVar.m;
            cVar.m = null;
            obj = obj2;
        }
        if (obj != null) {
            ((o.i) obj).c();
        }
    }

    public void y3() {
        this.N = true;
    }

    /* access modifiers changed from: package-private */
    public void y4(int i) {
        if (this.S != null || i != 0) {
            A2().d = i;
        }
    }

    public void z2(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.E));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.F));
        printWriter.print(" mTag=");
        printWriter.println(this.G);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mWho=");
        printWriter.print(this.n);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.z);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.t);
        printWriter.print(" mRemoving=");
        printWriter.print(this.u);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.v);
        printWriter.print(" mInLayout=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.H);
        printWriter.print(" mDetached=");
        printWriter.print(this.I);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.M);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.L);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.J);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.R);
        if (this.A != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.A);
        }
        if (this.B != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.B);
        }
        if (this.D != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.D);
        }
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.o);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.b);
        }
        if (this.c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.c);
        }
        Fragment Y2 = Y2();
        if (Y2 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(Y2);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.r);
        }
        if (O2() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(O2());
        }
        if (this.O != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.O);
        }
        if (this.P != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.P);
        }
        if (C2() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(C2());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(U2());
        }
        if (F2() != null) {
            c6.c(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.C + ":");
        this.C.J(je.x0(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public void z3() {
        this.N = true;
    }

    /* access modifiers changed from: package-private */
    public void z4(int i) {
        if (this.S != null || i != 0) {
            A2();
            this.S.e = i;
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        final Bundle a;

        static class a implements Parcelable.ClassLoaderCreator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new e[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }
        }

        e(Bundle bundle) {
            this.a = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.a);
        }

        e(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.a = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }
    }

    public Fragment(int i) {
        this();
        this.e0 = i;
    }
}
