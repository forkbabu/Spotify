package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.fragment.app.x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.n;
import com.spotify.music.C0707R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class o {
    private ArrayList<Boolean> A;
    private ArrayList<Fragment> B;
    private ArrayList<i> C;
    private s D;
    private Runnable E = new d();
    private final ArrayList<g> a = new ArrayList<>();
    private boolean b;
    private final w c = new w();
    ArrayList<a> d;
    private ArrayList<Fragment> e;
    private final m f = new m(this);
    private OnBackPressedDispatcher g;
    private final androidx.activity.b h = new a(false);
    private final AtomicInteger i = new AtomicInteger();
    private ArrayList<f> j;
    private ConcurrentHashMap<Fragment, HashSet<androidx.core.os.a>> k = new ConcurrentHashMap<>();
    private final e0.a l = new b();
    private final n m = new n(this);
    int n = -1;
    l<?> o;
    i p;
    private Fragment q;
    Fragment r;
    private k s = null;
    private k t = new c();
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private ArrayList<a> z;

    class a extends androidx.activity.b {
        a(boolean z) {
            super(z);
        }

        @Override // androidx.activity.b
        public void b() {
            o.this.h0();
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements e0.a {
        b() {
        }

        public void a(Fragment fragment, androidx.core.os.a aVar) {
            if (!aVar.b()) {
                o.this.B0(fragment, aVar);
            }
        }
    }

    class c extends k {
        c() {
        }

        @Override // androidx.fragment.app.k
        public Fragment a(ClassLoader classLoader, String str) {
            l<?> lVar = o.this.o;
            Context d = lVar.d();
            lVar.getClass();
            Object obj = Fragment.f0;
            try {
                return (Fragment) k.d(d.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e) {
                throw new Fragment.InstantiationException(je.y0("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
            } catch (IllegalAccessException e2) {
                throw new Fragment.InstantiationException(je.y0("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
            } catch (NoSuchMethodException e3) {
                throw new Fragment.InstantiationException(je.y0("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
            } catch (InvocationTargetException e4) {
                throw new Fragment.InstantiationException(je.y0("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.N(true);
        }
    }

    public static abstract class e {
        public void a(o oVar, Fragment fragment) {
        }

        public void b(o oVar, Fragment fragment, View view, Bundle bundle) {
        }
    }

    public interface f {
        void a();
    }

    /* access modifiers changed from: package-private */
    public interface g {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* access modifiers changed from: private */
    public class h implements g {
        final String a;
        final int b;
        final int c;

        h(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // androidx.fragment.app.o.g
        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = o.this.r;
            if (fragment == null || this.b >= 0 || this.a != null || !fragment.E2().x0()) {
                return o.this.y0(arrayList, arrayList2, this.a, this.b, this.c);
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static class i implements Fragment.d {
        final boolean a;
        final a b;
        private int c;

        i(a aVar, boolean z) {
            this.a = z;
            this.b = aVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            boolean z;
            boolean z2 = this.c > 0;
            for (Fragment fragment : this.b.r.b0()) {
                fragment.A4(null);
                if (z2) {
                    Fragment.c cVar = fragment.S;
                    if (cVar == null) {
                        z = false;
                    } else {
                        z = cVar.l;
                    }
                    if (z) {
                        fragment.J4();
                    }
                }
            }
            a aVar = this.b;
            aVar.r.l(aVar, this.a, !z2, true);
        }

        public boolean b() {
            return this.c == 0;
        }

        public void c() {
            int i = this.c - 1;
            this.c = i;
            if (i == 0) {
                this.b.r.I0();
            }
        }

        public void d() {
            this.c++;
        }
    }

    private void D0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                R(arrayList, arrayList2);
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!arrayList.get(i2).p) {
                        if (i3 != i2) {
                            P(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (arrayList2.get(i2).booleanValue()) {
                            while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                                i3++;
                            }
                        }
                        P(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    P(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* JADX INFO: finally extract failed */
    private void G(int i2) {
        try {
            this.b = true;
            this.c.d(i2);
            r0(i2, false);
            this.b = false;
            N(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    private void I() {
        if (this.y) {
            this.y = false;
            P0();
        }
    }

    private void K() {
        if (!this.k.isEmpty()) {
            for (Fragment fragment : this.k.keySet()) {
                j(fragment);
                s0(fragment, fragment.U2());
            }
        }
    }

    private void M(boolean z2) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.o == null) {
            if (this.x) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.o.e().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (z2 || !o0()) {
            if (this.z == null) {
                this.z = new ArrayList<>();
                this.A = new ArrayList<>();
            }
            this.b = true;
            try {
                R(null, null);
            } finally {
                this.b = false;
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void N0(Fragment fragment) {
        ViewGroup Z = Z(fragment);
        if (Z != null) {
            if (Z.getTag(C0707R.id.visible_removing_fragment_view_tag) == null) {
                Z.setTag(C0707R.id.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) Z.getTag(C0707R.id.visible_removing_fragment_view_tag)).y4(fragment.O2());
        }
    }

    private void P(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList<Boolean> arrayList3 = arrayList2;
        boolean z3 = arrayList.get(i2).p;
        ArrayList<Fragment> arrayList4 = this.B;
        if (arrayList4 == null) {
            this.B = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.B.addAll(this.c.m());
        Fragment fragment = this.r;
        int i9 = i2;
        boolean z4 = false;
        while (true) {
            int i10 = 1;
            if (i9 < i3) {
                a aVar = arrayList.get(i9);
                int i11 = 3;
                if (!arrayList3.get(i9).booleanValue()) {
                    ArrayList<Fragment> arrayList5 = this.B;
                    int i12 = 0;
                    while (i12 < aVar.a.size()) {
                        x.a aVar2 = aVar.a.get(i12);
                        int i13 = aVar2.a;
                        if (i13 != i10) {
                            if (i13 == 2) {
                                Fragment fragment2 = aVar2.b;
                                int i14 = fragment2.F;
                                int size = arrayList5.size() - 1;
                                boolean z5 = false;
                                while (size >= 0) {
                                    Fragment fragment3 = arrayList5.get(size);
                                    if (fragment3.F != i14) {
                                        i8 = i14;
                                    } else if (fragment3 == fragment2) {
                                        i8 = i14;
                                        z5 = true;
                                    } else {
                                        if (fragment3 == fragment) {
                                            i8 = i14;
                                            aVar.a.add(i12, new x.a(9, fragment3));
                                            i12++;
                                            fragment = null;
                                        } else {
                                            i8 = i14;
                                        }
                                        x.a aVar3 = new x.a(3, fragment3);
                                        aVar3.c = aVar2.c;
                                        aVar3.e = aVar2.e;
                                        aVar3.d = aVar2.d;
                                        aVar3.f = aVar2.f;
                                        aVar.a.add(i12, aVar3);
                                        arrayList5.remove(fragment3);
                                        i12++;
                                    }
                                    size--;
                                    i14 = i8;
                                }
                                if (z5) {
                                    aVar.a.remove(i12);
                                    i12--;
                                } else {
                                    i7 = 1;
                                    aVar2.a = 1;
                                    arrayList5.add(fragment2);
                                    i12 += i7;
                                    i11 = 3;
                                    i10 = 1;
                                }
                            } else if (i13 == i11 || i13 == 6) {
                                arrayList5.remove(aVar2.b);
                                Fragment fragment4 = aVar2.b;
                                if (fragment4 == fragment) {
                                    aVar.a.add(i12, new x.a(9, fragment4));
                                    i12++;
                                    fragment = null;
                                }
                            } else if (i13 != 7) {
                                if (i13 == 8) {
                                    aVar.a.add(i12, new x.a(9, fragment));
                                    i12++;
                                    fragment = aVar2.b;
                                }
                            }
                            i7 = 1;
                            i12 += i7;
                            i11 = 3;
                            i10 = 1;
                        }
                        i7 = 1;
                        arrayList5.add(aVar2.b);
                        i12 += i7;
                        i11 = 3;
                        i10 = 1;
                    }
                } else {
                    ArrayList<Fragment> arrayList6 = this.B;
                    for (int size2 = aVar.a.size() - 1; size2 >= 0; size2--) {
                        x.a aVar4 = aVar.a.get(size2);
                        int i15 = aVar4.a;
                        if (i15 != 1) {
                            if (i15 != 3) {
                                switch (i15) {
                                    case 8:
                                        fragment = null;
                                        break;
                                    case 9:
                                        fragment = aVar4.b;
                                        break;
                                    case 10:
                                        aVar4.h = aVar4.g;
                                        break;
                                }
                            }
                            arrayList6.add(aVar4.b);
                        }
                        arrayList6.remove(aVar4.b);
                    }
                }
                z4 = z4 || aVar.g;
                i9++;
                arrayList3 = arrayList2;
            } else {
                this.B.clear();
                if (!z3) {
                    z2 = true;
                    i4 = -1;
                    e0.o(this, arrayList, arrayList2, i2, i3, false, this.l);
                } else {
                    z2 = true;
                    i4 = -1;
                }
                int i16 = i2;
                while (i16 < i3) {
                    a aVar5 = arrayList.get(i16);
                    if (arrayList2.get(i16).booleanValue()) {
                        aVar5.y(i4);
                        aVar5.C(i16 == i3 + -1);
                    } else {
                        int i17 = z2 ? 1 : 0;
                        int i18 = z2 ? 1 : 0;
                        int i19 = z2 ? 1 : 0;
                        aVar5.y(i17);
                        aVar5.B();
                    }
                    i16++;
                }
                if (z3) {
                    o1<Fragment> o1Var = new o1<>();
                    a(o1Var);
                    i5 = i2;
                    int i20 = i3;
                    for (int i21 = i3 - 1; i21 >= i5; i21--) {
                        a aVar6 = arrayList.get(i21);
                        boolean booleanValue = arrayList2.get(i21).booleanValue();
                        if (aVar6.G() && !aVar6.E(arrayList, i21 + 1, i3)) {
                            if (this.C == null) {
                                this.C = new ArrayList<>();
                            }
                            i iVar = new i(aVar6, booleanValue);
                            this.C.add(iVar);
                            aVar6.H(iVar);
                            if (booleanValue) {
                                aVar6.B();
                            } else {
                                aVar6.C(false);
                            }
                            i20--;
                            if (i21 != i20) {
                                arrayList.remove(i21);
                                arrayList.add(i20, aVar6);
                            }
                            a(o1Var);
                        }
                    }
                    int size3 = o1Var.size();
                    for (int i22 = 0; i22 < size3; i22++) {
                        Fragment i23 = o1Var.i(i22);
                        if (!i23.t) {
                            View m4 = i23.m4();
                            i23.V = m4.getAlpha();
                            m4.setAlpha(0.0f);
                        }
                    }
                    i6 = i20;
                } else {
                    i5 = i2;
                    i6 = i3;
                }
                if (i6 != i5 && z3) {
                    e0.o(this, arrayList, arrayList2, i2, i6, true, this.l);
                    r0(this.n, z2);
                }
                while (i5 < i3) {
                    a aVar7 = arrayList.get(i5);
                    if (arrayList2.get(i5).booleanValue() && aVar7.t >= 0) {
                        aVar7.t = i4;
                    }
                    if (aVar7.q != null) {
                        for (int i24 = 0; i24 < aVar7.q.size(); i24++) {
                            aVar7.q.get(i24).run();
                        }
                        aVar7.q = null;
                    }
                    i5++;
                }
                if (z4 && this.j != null) {
                    for (int i25 = 0; i25 < this.j.size(); i25++) {
                        this.j.get(i25).a();
                    }
                    return;
                }
                return;
            }
        }
    }

    private void P0() {
        Iterator it = ((ArrayList) this.c.k()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                u0(fragment);
            }
        }
    }

    private void Q0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new t3("FragmentManager"));
        l<?> lVar = this.o;
        if (lVar != null) {
            try {
                lVar.g("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            try {
                J("  ", null, printWriter, new String[0]);
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
            }
        }
        throw runtimeException;
    }

    private void R(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<i> arrayList3 = this.C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            i iVar = this.C.get(i2);
            if (arrayList != null && !iVar.a && (indexOf2 = arrayList.indexOf(iVar.b)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.C.remove(i2);
                i2--;
                size--;
                a aVar = iVar.b;
                aVar.r.l(aVar, iVar.a, false, false);
            } else if (iVar.b() || (arrayList != null && iVar.b.E(arrayList, 0, arrayList.size()))) {
                this.C.remove(i2);
                i2--;
                size--;
                if (arrayList == null || iVar.a || (indexOf = arrayList.indexOf(iVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                    iVar.a();
                } else {
                    a aVar2 = iVar.b;
                    aVar2.r.l(aVar2, iVar.a, false, false);
                }
            }
            i2++;
        }
    }

    private void S0() {
        boolean z2;
        synchronized (this.a) {
            z2 = true;
            if (!this.a.isEmpty()) {
                this.h.f(true);
                return;
            }
        }
        androidx.activity.b bVar = this.h;
        if (X() <= 0 || !n0(this.q)) {
            z2 = false;
        }
        bVar.f(z2);
    }

    private void W() {
        if (this.C != null) {
            while (!this.C.isEmpty()) {
                this.C.remove(0).a();
            }
        }
    }

    private ViewGroup Z(Fragment fragment) {
        if (fragment.F > 0 && this.p.b()) {
            View a2 = this.p.a(fragment.F);
            if (a2 instanceof ViewGroup) {
                return (ViewGroup) a2;
            }
        }
        return null;
    }

    private void a(o1<Fragment> o1Var) {
        int i2 = this.n;
        if (i2 >= 1) {
            int min = Math.min(i2, 3);
            for (Fragment fragment : this.c.m()) {
                if (fragment.a < min) {
                    s0(fragment, min);
                    if (fragment.P != null && !fragment.H && fragment.T) {
                        o1Var.add(fragment);
                    }
                }
            }
        }
    }

    private void j(Fragment fragment) {
        HashSet<androidx.core.os.a> hashSet = this.k.get(fragment);
        if (hashSet != null) {
            Iterator<androidx.core.os.a> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            m(fragment);
            this.k.remove(fragment);
        }
    }

    private void k() {
        this.b = false;
        this.A.clear();
        this.z.clear();
    }

    static boolean k0(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    private boolean l0(Fragment fragment) {
        boolean z2;
        if (fragment.L && fragment.M) {
            return true;
        }
        o oVar = fragment.C;
        Iterator it = ((ArrayList) oVar.c.k()).iterator();
        boolean z3 = false;
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z3 = oVar.l0(fragment2);
                continue;
            }
            if (z3) {
                z2 = true;
                break;
            }
        }
        if (z2) {
            return true;
        }
        return false;
    }

    private void m(Fragment fragment) {
        fragment.X3();
        this.m.n(fragment, false);
        fragment.O = null;
        fragment.P = null;
        fragment.a0 = null;
        fragment.b0.n(null);
        fragment.w = false;
    }

    private void z(Fragment fragment) {
        if (fragment != null && fragment.equals(S(fragment.n))) {
            fragment.d4();
        }
    }

    /* access modifiers changed from: package-private */
    public void A() {
        G(3);
    }

    public void A0(e eVar, boolean z2) {
        this.m.o(eVar, z2);
    }

    /* access modifiers changed from: package-private */
    public void B(boolean z2) {
        for (Fragment fragment : this.c.m()) {
            if (fragment != null) {
                fragment.I3();
                fragment.C.B(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void B0(Fragment fragment, androidx.core.os.a aVar) {
        HashSet<androidx.core.os.a> hashSet = this.k.get(fragment);
        if (hashSet != null && hashSet.remove(aVar) && hashSet.isEmpty()) {
            this.k.remove(fragment);
            if (fragment.a < 3) {
                m(fragment);
                s0(fragment, fragment.U2());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean C(Menu menu) {
        boolean z2 = false;
        if (this.n < 1) {
            return false;
        }
        for (Fragment fragment : this.c.m()) {
            if (fragment != null && fragment.c4(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public void C0(Fragment fragment) {
        if (k0(2)) {
            String str = "remove: " + fragment + " nesting=" + fragment.z;
        }
        boolean z2 = !fragment.h3();
        if (!fragment.I || z2) {
            this.c.p(fragment);
            if (l0(fragment)) {
                this.u = true;
            }
            fragment.u = true;
            N0(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void D() {
        S0();
        z(this.r);
    }

    /* access modifiers changed from: package-private */
    public void E() {
        this.v = false;
        this.w = false;
        G(4);
    }

    /* access modifiers changed from: package-private */
    public void E0(Fragment fragment) {
        if (o0()) {
            k0(2);
        } else if (this.D.o(fragment) && k0(2)) {
            String str = "Updating retained Fragments: Removed " + fragment;
        }
    }

    /* access modifiers changed from: package-private */
    public void F() {
        this.v = false;
        this.w = false;
        G(3);
    }

    /* access modifiers changed from: package-private */
    public void F0(Parcelable parcelable) {
        v vVar;
        if (parcelable != null) {
            r rVar = (r) parcelable;
            if (rVar.a != null) {
                this.c.q();
                Iterator<u> it = rVar.a.iterator();
                while (it.hasNext()) {
                    u next = it.next();
                    if (next != null) {
                        Fragment i2 = this.D.i(next.b);
                        if (i2 != null) {
                            if (k0(2)) {
                                String str = "restoreSaveState: re-attaching retained " + i2;
                            }
                            vVar = new v(this.m, i2, next);
                        } else {
                            vVar = new v(this.m, this.o.d().getClassLoader(), a0(), next);
                        }
                        Fragment i3 = vVar.i();
                        i3.A = this;
                        if (k0(2)) {
                            StringBuilder V0 = je.V0("restoreSaveState: active (");
                            V0.append(i3.n);
                            V0.append("): ");
                            V0.append(i3);
                            V0.toString();
                        }
                        vVar.k(this.o.d().getClassLoader());
                        this.c.n(vVar);
                        vVar.r(this.n);
                    }
                }
                for (Fragment fragment : this.D.l()) {
                    if (!this.c.c(fragment.n)) {
                        if (k0(2)) {
                            String str2 = "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + rVar.a;
                        }
                        s0(fragment, 1);
                        fragment.u = true;
                        s0(fragment, -1);
                    }
                }
                this.c.r(rVar.b);
                if (rVar.c != null) {
                    this.d = new ArrayList<>(rVar.c.length);
                    int i4 = 0;
                    while (true) {
                        b[] bVarArr = rVar.c;
                        if (i4 >= bVarArr.length) {
                            break;
                        }
                        b bVar = bVarArr[i4];
                        bVar.getClass();
                        a aVar = new a(this);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            int[] iArr = bVar.a;
                            if (i5 >= iArr.length) {
                                break;
                            }
                            x.a aVar2 = new x.a();
                            int i7 = i5 + 1;
                            aVar2.a = iArr[i5];
                            if (k0(2)) {
                                String str3 = "Instantiate " + aVar + " op #" + i6 + " base fragment #" + bVar.a[i7];
                            }
                            String str4 = bVar.b.get(i6);
                            if (str4 != null) {
                                aVar2.b = S(str4);
                            } else {
                                aVar2.b = null;
                            }
                            aVar2.g = Lifecycle.State.values()[bVar.c[i6]];
                            aVar2.h = Lifecycle.State.values()[bVar.f[i6]];
                            int[] iArr2 = bVar.a;
                            int i8 = i7 + 1;
                            int i9 = iArr2[i7];
                            aVar2.c = i9;
                            int i10 = i8 + 1;
                            int i11 = iArr2[i8];
                            aVar2.d = i11;
                            int i12 = i10 + 1;
                            int i13 = iArr2[i10];
                            aVar2.e = i13;
                            int i14 = iArr2[i12];
                            aVar2.f = i14;
                            aVar.b = i9;
                            aVar.c = i11;
                            aVar.d = i13;
                            aVar.e = i14;
                            aVar.e(aVar2);
                            i6++;
                            i5 = i12 + 1;
                        }
                        aVar.f = bVar.n;
                        aVar.i = bVar.o;
                        aVar.t = bVar.p;
                        aVar.g = true;
                        aVar.j = bVar.q;
                        aVar.k = bVar.r;
                        aVar.l = bVar.s;
                        aVar.m = bVar.t;
                        aVar.n = bVar.u;
                        aVar.o = bVar.v;
                        aVar.p = bVar.w;
                        aVar.y(1);
                        if (k0(2)) {
                            StringBuilder W0 = je.W0("restoreAllState: back stack #", i4, " (index ");
                            W0.append(aVar.t);
                            W0.append("): ");
                            W0.append(aVar);
                            W0.toString();
                            PrintWriter printWriter = new PrintWriter(new t3("FragmentManager"));
                            aVar.A("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.d.add(aVar);
                        i4++;
                    }
                } else {
                    this.d = null;
                }
                this.i.set(rVar.f);
                String str5 = rVar.n;
                if (str5 != null) {
                    Fragment S = S(str5);
                    this.r = S;
                    z(S);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Parcelable G0() {
        int size;
        W();
        K();
        N(true);
        this.v = true;
        ArrayList<u> s2 = this.c.s();
        b[] bVarArr = null;
        if (s2.isEmpty()) {
            k0(2);
            return null;
        }
        ArrayList<String> t2 = this.c.t();
        ArrayList<a> arrayList = this.d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new b[size];
            for (int i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new b(this.d.get(i2));
                if (k0(2)) {
                    StringBuilder W0 = je.W0("saveAllState: adding back stack #", i2, ": ");
                    W0.append(this.d.get(i2));
                    W0.toString();
                }
            }
        }
        r rVar = new r();
        rVar.a = s2;
        rVar.b = t2;
        rVar.c = bVarArr;
        rVar.f = this.i.get();
        Fragment fragment = this.r;
        if (fragment != null) {
            rVar.n = fragment.n;
        }
        return rVar;
    }

    /* access modifiers changed from: package-private */
    public void H() {
        this.w = true;
        G(2);
    }

    public Fragment.e H0(Fragment fragment) {
        v l2 = this.c.l(fragment.n);
        if (l2 != null && l2.i().equals(fragment)) {
            return l2.o();
        }
        Q0(new IllegalStateException(je.u0("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void I0() {
        synchronized (this.a) {
            ArrayList<i> arrayList = this.C;
            boolean z2 = false;
            boolean z3 = arrayList != null && !arrayList.isEmpty();
            if (this.a.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.o.e().removeCallbacks(this.E);
                this.o.e().post(this.E);
                S0();
            }
        }
    }

    public void J(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String x0 = je.x0(str, "    ");
        this.c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.e.get(i2).toString());
            }
        }
        ArrayList<a> arrayList2 = this.d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.A(x0, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            int size3 = this.a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(this.a.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.p);
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.v);
        printWriter.print(" mStopped=");
        printWriter.print(this.w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.x);
        if (this.u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.u);
        }
    }

    /* access modifiers changed from: package-private */
    public void J0(Fragment fragment, boolean z2) {
        ViewGroup Z = Z(fragment);
        if (Z != null && (Z instanceof FragmentContainerView)) {
            ((FragmentContainerView) Z).setDrawDisappearingViewsLast(!z2);
        }
    }

    public void K0(k kVar) {
        this.s = kVar;
    }

    /* access modifiers changed from: package-private */
    public void L(g gVar, boolean z2) {
        if (!z2) {
            if (this.o == null) {
                if (this.x) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (o0()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            if (this.o != null) {
                this.a.add(gVar);
                I0();
            } else if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void L0(Fragment fragment, Lifecycle.State state) {
        if (!fragment.equals(S(fragment.n)) || !(fragment.B == null || fragment.A == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.Y = state;
    }

    /* access modifiers changed from: package-private */
    public void M0(Fragment fragment) {
        if (fragment == null || (fragment.equals(S(fragment.n)) && (fragment.B == null || fragment.A == this))) {
            Fragment fragment2 = this.r;
            this.r = fragment;
            z(fragment2);
            z(this.r);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public boolean N(boolean z2) {
        boolean z3;
        M(z2);
        boolean z4 = false;
        while (true) {
            ArrayList<a> arrayList = this.z;
            ArrayList<Boolean> arrayList2 = this.A;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z3 = false;
                } else {
                    int size = this.a.size();
                    z3 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        z3 |= this.a.get(i2).a(arrayList, arrayList2);
                    }
                    this.a.clear();
                    this.o.e().removeCallbacks(this.E);
                }
            }
            if (z3) {
                this.b = true;
                try {
                    D0(this.z, this.A);
                    k();
                    z4 = true;
                } catch (Throwable th) {
                    k();
                    throw th;
                }
            } else {
                S0();
                I();
                this.c.b();
                return z4;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void O(g gVar, boolean z2) {
        if (!z2 || (this.o != null && !this.x)) {
            M(z2);
            ((a) gVar).a(this.z, this.A);
            this.b = true;
            try {
                D0(this.z, this.A);
                k();
                S0();
                I();
                this.c.b();
            } catch (Throwable th) {
                k();
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void O0(Fragment fragment) {
        if (k0(2)) {
            String str = "show: " + fragment;
        }
        if (fragment.H) {
            fragment.H = false;
            fragment.U = !fragment.U;
        }
    }

    public boolean Q() {
        boolean N = N(true);
        W();
        return N;
    }

    public void R0(e eVar) {
        this.m.p(eVar);
    }

    /* access modifiers changed from: package-private */
    public Fragment S(String str) {
        return this.c.f(str);
    }

    public Fragment T(int i2) {
        return this.c.g(i2);
    }

    public Fragment U(String str) {
        return this.c.h(str);
    }

    /* access modifiers changed from: package-private */
    public Fragment V(String str) {
        return this.c.i(str);
    }

    public int X() {
        ArrayList<a> arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public Fragment Y(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment f2 = this.c.f(string);
        if (f2 != null) {
            return f2;
        }
        Q0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        throw null;
    }

    public k a0() {
        k kVar = this.s;
        if (kVar != null) {
            return kVar;
        }
        Fragment fragment = this.q;
        if (fragment != null) {
            return fragment.A.a0();
        }
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public void b(Fragment fragment, androidx.core.os.a aVar) {
        if (this.k.get(fragment) == null) {
            this.k.put(fragment, new HashSet<>());
        }
        this.k.get(fragment).add(aVar);
    }

    public List<Fragment> b0() {
        return this.c.m();
    }

    /* access modifiers changed from: package-private */
    public void c(Fragment fragment) {
        if (k0(2)) {
            String str = "add: " + fragment;
        }
        p0(fragment);
        if (!fragment.I) {
            this.c.a(fragment);
            fragment.u = false;
            if (fragment.P == null) {
                fragment.U = false;
            }
            if (l0(fragment)) {
                this.u = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 c0() {
        return this.f;
    }

    public void d(f fVar) {
        if (this.j == null) {
            this.j = new ArrayList<>();
        }
        this.j.add(fVar);
    }

    /* access modifiers changed from: package-private */
    public n d0() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public void e(Fragment fragment) {
        if (o0()) {
            k0(2);
        } else if (this.D.g(fragment) && k0(2)) {
            String str = "Updating retained Fragments: Added " + fragment;
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment e0() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.i.getAndIncrement();
    }

    public Fragment f0() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public void g(l<?> lVar, i iVar, Fragment fragment) {
        if (this.o == null) {
            this.o = lVar;
            this.p = iVar;
            this.q = fragment;
            if (fragment != null) {
                S0();
            }
            if (lVar instanceof androidx.activity.c) {
                androidx.activity.c cVar = (androidx.activity.c) lVar;
                OnBackPressedDispatcher S0 = cVar.S0();
                this.g = S0;
                n nVar = cVar;
                if (fragment != null) {
                    nVar = fragment;
                }
                S0.b(nVar, this.h);
            }
            if (fragment != null) {
                this.D = fragment.A.D.j(fragment);
            } else if (lVar instanceof i0) {
                this.D = s.k(((i0) lVar).Z());
            } else {
                this.D = new s(false);
            }
        } else {
            throw new IllegalStateException("Already attached");
        }
    }

    /* access modifiers changed from: package-private */
    public h0 g0(Fragment fragment) {
        return this.D.m(fragment);
    }

    /* access modifiers changed from: package-private */
    public void h(Fragment fragment) {
        if (k0(2)) {
            String str = "attach: " + fragment;
        }
        if (fragment.I) {
            fragment.I = false;
            if (!fragment.t) {
                this.c.a(fragment);
                if (k0(2)) {
                    String str2 = "add from attach: " + fragment;
                }
                if (l0(fragment)) {
                    this.u = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h0() {
        N(true);
        if (this.h.c()) {
            x0();
        } else {
            this.g.d();
        }
    }

    public x i() {
        return new a(this);
    }

    /* access modifiers changed from: package-private */
    public void i0(Fragment fragment) {
        if (k0(2)) {
            String str = "hide: " + fragment;
        }
        if (!fragment.H) {
            fragment.H = true;
            fragment.U = true ^ fragment.U;
            N0(fragment);
        }
    }

    public boolean j0() {
        return this.x;
    }

    /* access modifiers changed from: package-private */
    public void l(a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.C(z4);
        } else {
            aVar.B();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            e0.o(this, arrayList, arrayList2, 0, 1, true, this.l);
        }
        if (z4) {
            r0(this.n, true);
        }
        Iterator it = ((ArrayList) this.c.k()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.P != null && fragment.T && aVar.D(fragment.F)) {
                float f2 = fragment.V;
                if (f2 > 0.0f) {
                    fragment.P.setAlpha(f2);
                }
                if (z4) {
                    fragment.V = 0.0f;
                } else {
                    fragment.V = -1.0f;
                    fragment.T = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean m0(Fragment fragment) {
        o oVar;
        if (fragment == null) {
            return true;
        }
        if (!fragment.M || ((oVar = fragment.A) != null && !oVar.m0(fragment.D))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void n(Fragment fragment) {
        if (k0(2)) {
            String str = "detach: " + fragment;
        }
        if (!fragment.I) {
            fragment.I = true;
            if (fragment.t) {
                if (k0(2)) {
                    String str2 = "remove from detach: " + fragment;
                }
                this.c.p(fragment);
                if (l0(fragment)) {
                    this.u = true;
                }
                N0(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean n0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        o oVar = fragment.A;
        if (!fragment.equals(oVar.r) || !n0(oVar.q)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.v = false;
        this.w = false;
        G(2);
    }

    public boolean o0() {
        return this.v || this.w;
    }

    /* access modifiers changed from: package-private */
    public void p(Configuration configuration) {
        for (Fragment fragment : this.c.m()) {
            if (fragment != null) {
                fragment.onConfigurationChanged(configuration);
                fragment.C.p(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p0(Fragment fragment) {
        if (!this.c.c(fragment.n)) {
            v vVar = new v(this.m, fragment);
            vVar.k(this.o.d().getClassLoader());
            this.c.n(vVar);
            if (fragment.K) {
                if (fragment.J) {
                    e(fragment);
                } else {
                    E0(fragment);
                }
                fragment.K = false;
            }
            vVar.r(this.n);
            if (k0(2)) {
                String str = "Added fragment to active set " + fragment;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean q(MenuItem menuItem) {
        boolean z2;
        if (this.n < 1) {
            return false;
        }
        for (Fragment fragment : this.c.m()) {
            if (fragment != null) {
                if (fragment.H || (!fragment.r3() && !fragment.C.q(menuItem))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void q0(Fragment fragment) {
        Animator animator;
        ViewGroup viewGroup;
        int indexOfChild;
        int indexOfChild2;
        if (this.c.c(fragment.n)) {
            s0(fragment, this.n);
            if (fragment.P != null) {
                Fragment j2 = this.c.j(fragment);
                if (j2 != null && (indexOfChild2 = viewGroup.indexOfChild(fragment.P)) < (indexOfChild = (viewGroup = fragment.O).indexOfChild(j2.P))) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.P, indexOfChild);
                }
                if (fragment.T && fragment.O != null) {
                    float f2 = fragment.V;
                    if (f2 > 0.0f) {
                        fragment.P.setAlpha(f2);
                    }
                    fragment.V = 0.0f;
                    fragment.T = false;
                    g b2 = l0.b(this.o.d(), this.p, fragment, true);
                    if (b2 != null) {
                        Animation animation = b2.a;
                        if (animation != null) {
                            fragment.P.startAnimation(animation);
                        } else {
                            b2.b.setTarget(fragment.P);
                            b2.b.start();
                        }
                    }
                }
            }
            if (fragment.U) {
                if (fragment.P != null) {
                    g b3 = l0.b(this.o.d(), this.p, fragment, !fragment.H);
                    if (b3 == null || (animator = b3.b) == null) {
                        if (b3 != null) {
                            fragment.P.startAnimation(b3.a);
                            b3.a.start();
                        }
                        fragment.P.setVisibility((!fragment.H || fragment.g3()) ? 0 : 8);
                        if (fragment.g3()) {
                            fragment.v4(false);
                        }
                    } else {
                        animator.setTarget(fragment.P);
                        if (!fragment.H) {
                            fragment.P.setVisibility(0);
                        } else if (fragment.g3()) {
                            fragment.v4(false);
                        } else {
                            ViewGroup viewGroup2 = fragment.O;
                            View view = fragment.P;
                            viewGroup2.startViewTransition(view);
                            b3.b.addListener(new p(this, viewGroup2, view, fragment));
                        }
                        b3.b.start();
                    }
                }
                if (fragment.t && l0(fragment)) {
                    this.u = true;
                }
                fragment.U = false;
                fragment.B3();
            }
        } else if (k0(3)) {
            String str = "Ignoring moving " + fragment + " to state " + this.n + "since it is not added to " + this;
        }
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.v = false;
        this.w = false;
        G(1);
    }

    /* access modifiers changed from: package-private */
    public void r0(int i2, boolean z2) {
        l<?> lVar;
        if (this.o == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.n) {
            this.n = i2;
            for (Fragment fragment : this.c.m()) {
                q0(fragment);
            }
            Iterator it = ((ArrayList) this.c.k()).iterator();
            while (it.hasNext()) {
                Fragment fragment2 = (Fragment) it.next();
                if (fragment2 != null && !fragment2.T) {
                    q0(fragment2);
                }
            }
            P0();
            if (this.u && (lVar = this.o) != null && this.n == 4) {
                lVar.n();
                this.u = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s(Menu menu, MenuInflater menuInflater) {
        boolean z2;
        boolean z3;
        if (this.n < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z4 = false;
        for (Fragment fragment : this.c.m()) {
            if (fragment != null && m0(fragment)) {
                if (!fragment.H) {
                    if (!fragment.L || !fragment.M) {
                        z3 = false;
                    } else {
                        fragment.v3(menu, menuInflater);
                        z3 = true;
                    }
                    z2 = z3 | fragment.C.s(menu, menuInflater);
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    z4 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment2 = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z4;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r1 != 3) goto L_0x0267;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s0(androidx.fragment.app.Fragment r17, int r18) {
        /*
        // Method dump skipped, instructions count: 663
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o.s0(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: package-private */
    public void t() {
        this.x = true;
        N(true);
        K();
        G(-1);
        this.o = null;
        this.p = null;
        this.q = null;
        if (this.g != null) {
            this.h.d();
            this.g = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void t0() {
        if (this.o != null) {
            this.v = false;
            this.w = false;
            for (Fragment fragment : this.c.m()) {
                if (fragment != null) {
                    fragment.C.t0();
                }
            }
        }
    }

    public String toString() {
        StringBuilder T0 = je.T0(128, "FragmentManager{");
        T0.append(Integer.toHexString(System.identityHashCode(this)));
        T0.append(" in ");
        Fragment fragment = this.q;
        if (fragment != null) {
            T0.append(fragment.getClass().getSimpleName());
            T0.append("{");
            T0.append(Integer.toHexString(System.identityHashCode(this.q)));
            T0.append("}");
        } else {
            l<?> lVar = this.o;
            if (lVar != null) {
                T0.append(lVar.getClass().getSimpleName());
                T0.append("{");
                T0.append(Integer.toHexString(System.identityHashCode(this.o)));
                T0.append("}");
            } else {
                T0.append("null");
            }
        }
        T0.append("}}");
        return T0.toString();
    }

    /* access modifiers changed from: package-private */
    public void u() {
        G(1);
    }

    /* access modifiers changed from: package-private */
    public void u0(Fragment fragment) {
        if (!fragment.Q) {
            return;
        }
        if (this.b) {
            this.y = true;
            return;
        }
        fragment.Q = false;
        s0(fragment, this.n);
    }

    /* access modifiers changed from: package-private */
    public void v() {
        for (Fragment fragment : this.c.m()) {
            if (fragment != null) {
                fragment.a4();
            }
        }
    }

    public void v0() {
        L(new h(null, -1, 0), false);
    }

    /* access modifiers changed from: package-private */
    public void w(boolean z2) {
        for (Fragment fragment : this.c.m()) {
            if (fragment != null) {
                fragment.E3();
                fragment.C.w(z2);
            }
        }
    }

    public void w0(String str, int i2) {
        L(new h(str, -1, i2), false);
    }

    /* access modifiers changed from: package-private */
    public boolean x(MenuItem menuItem) {
        if (this.n < 1) {
            return false;
        }
        for (Fragment fragment : this.c.m()) {
            if (fragment != null) {
                if (!fragment.H && ((fragment.L && fragment.M && fragment.F3()) || fragment.C.x(menuItem))) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean x0() {
        N(false);
        M(true);
        Fragment fragment = this.r;
        if (fragment != null && fragment.E2().x0()) {
            return true;
        }
        boolean y0 = y0(this.z, this.A, null, -1, 0);
        if (y0) {
            this.b = true;
            try {
                D0(this.z, this.A);
            } finally {
                k();
            }
        }
        S0();
        I();
        this.c.b();
        return y0;
    }

    /* access modifiers changed from: package-private */
    public void y(Menu menu) {
        if (this.n >= 1) {
            for (Fragment fragment : this.c.m()) {
                if (fragment != null && !fragment.H) {
                    if (fragment.L && fragment.M) {
                        fragment.G3();
                    }
                    fragment.C.y(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean y0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        Boolean bool = Boolean.TRUE;
        ArrayList<a> arrayList3 = this.d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.d.remove(size));
            arrayList2.add(bool);
        } else {
            int i4 = -1;
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.d.get(size2);
                    if ((str != null && str.equals(aVar.i)) || (i2 >= 0 && i2 == aVar.t)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.d.get(size2);
                        if ((str == null || !str.equals(aVar2.i)) && (i2 < 0 || i2 != aVar2.t)) {
                            break;
                        }
                    }
                }
                i4 = size2;
            }
            if (i4 == this.d.size() - 1) {
                return false;
            }
            for (int size3 = this.d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.d.remove(size3));
                arrayList2.add(bool);
            }
        }
        return true;
    }

    public void z0(Bundle bundle, String str, Fragment fragment) {
        if (fragment.A == this) {
            bundle.putString(str, fragment.n);
        } else {
            Q0(new IllegalStateException(je.u0("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }
}
