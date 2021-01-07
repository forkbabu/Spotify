package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class a extends x implements o.g {
    final o r;
    boolean s;
    int t;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    a(androidx.fragment.app.o r3) {
        /*
            r2 = this;
            androidx.fragment.app.k r0 = r3.a0()
            androidx.fragment.app.l<?> r1 = r3.o
            if (r1 == 0) goto L_0x0011
            android.content.Context r1 = r1.d()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            r2.<init>(r0, r1)
            r0 = -1
            r2.t = r0
            r2.r = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.<init>(androidx.fragment.app.o):void");
    }

    private static boolean F(x.a aVar) {
        boolean z;
        Fragment fragment = aVar.b;
        if (fragment == null || !fragment.t || fragment.P == null || fragment.I || fragment.H) {
            return false;
        }
        Fragment.c cVar = fragment.S;
        if (cVar == null) {
            z = false;
        } else {
            z = cVar.l;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public void A(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (!(this.b == 0 && this.c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (!(this.d == 0 && this.e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (!(this.j == 0 && this.k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (!(this.l == 0 && this.m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        if (!this.a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                x.a aVar = this.a.get(i);
                switch (aVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder V0 = je.V0("cmd=");
                        V0.append(aVar.a);
                        str2 = V0.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.b);
                if (z) {
                    if (!(aVar.c == 0 && aVar.d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.d));
                    }
                    if (aVar.e != 0 || aVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void B() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            x.a aVar = this.a.get(i);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.z4(this.f);
            }
            switch (aVar.a) {
                case 1:
                    fragment.y4(aVar.c);
                    this.r.J0(fragment, false);
                    this.r.c(fragment);
                    break;
                case 2:
                default:
                    StringBuilder V0 = je.V0("Unknown cmd: ");
                    V0.append(aVar.a);
                    throw new IllegalArgumentException(V0.toString());
                case 3:
                    fragment.y4(aVar.d);
                    this.r.C0(fragment);
                    break;
                case 4:
                    fragment.y4(aVar.d);
                    this.r.i0(fragment);
                    break;
                case 5:
                    fragment.y4(aVar.c);
                    this.r.J0(fragment, false);
                    this.r.O0(fragment);
                    break;
                case 6:
                    fragment.y4(aVar.d);
                    this.r.n(fragment);
                    break;
                case 7:
                    fragment.y4(aVar.c);
                    this.r.J0(fragment, false);
                    this.r.h(fragment);
                    break;
                case 8:
                    this.r.M0(fragment);
                    break;
                case 9:
                    this.r.M0(null);
                    break;
                case 10:
                    this.r.L0(fragment, aVar.h);
                    break;
            }
            if (!(this.p || aVar.a == 1 || fragment == null)) {
                this.r.q0(fragment);
            }
        }
        if (!this.p) {
            o oVar = this.r;
            oVar.r0(oVar.n, true);
        }
    }

    /* access modifiers changed from: package-private */
    public void C(boolean z) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            x.a aVar = this.a.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                int i = this.f;
                int i2 = 8194;
                if (i != 4097) {
                    i2 = i != 4099 ? i != 8194 ? 0 : 4097 : 4099;
                }
                fragment.z4(i2);
            }
            switch (aVar.a) {
                case 1:
                    fragment.y4(aVar.f);
                    this.r.J0(fragment, true);
                    this.r.C0(fragment);
                    break;
                case 2:
                default:
                    StringBuilder V0 = je.V0("Unknown cmd: ");
                    V0.append(aVar.a);
                    throw new IllegalArgumentException(V0.toString());
                case 3:
                    fragment.y4(aVar.e);
                    this.r.c(fragment);
                    break;
                case 4:
                    fragment.y4(aVar.e);
                    this.r.O0(fragment);
                    break;
                case 5:
                    fragment.y4(aVar.f);
                    this.r.J0(fragment, true);
                    this.r.i0(fragment);
                    break;
                case 6:
                    fragment.y4(aVar.e);
                    this.r.h(fragment);
                    break;
                case 7:
                    fragment.y4(aVar.f);
                    this.r.J0(fragment, true);
                    this.r.n(fragment);
                    break;
                case 8:
                    this.r.M0(null);
                    break;
                case 9:
                    this.r.M0(fragment);
                    break;
                case 10:
                    this.r.L0(fragment, aVar.g);
                    break;
            }
            if (!(this.p || aVar.a == 3 || fragment == null)) {
                this.r.q0(fragment);
            }
        }
        if (!this.p && z) {
            o oVar = this.r;
            oVar.r0(oVar.n, true);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean D(int i) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.a.get(i2).b;
            int i3 = fragment != null ? fragment.F : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean E(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.a.get(i4).b;
            int i5 = fragment != null ? fragment.F : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.a.get(i7).b;
                        if ((fragment2 != null ? fragment2.F : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        for (int i = 0; i < this.a.size(); i++) {
            if (F(this.a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void H(Fragment.d dVar) {
        for (int i = 0; i < this.a.size(); i++) {
            x.a aVar = this.a.get(i);
            if (F(aVar)) {
                aVar.b.A4(dVar);
            }
        }
    }

    @Override // androidx.fragment.app.o.g
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (o.k0(2)) {
            String str = "Run: " + this;
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        o oVar = this.r;
        if (oVar.d == null) {
            oVar.d = new ArrayList<>();
        }
        oVar.d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.x
    public int i() {
        return z(false);
    }

    @Override // androidx.fragment.app.x
    public int j() {
        return z(true);
    }

    @Override // androidx.fragment.app.x
    public void k() {
        m();
        this.r.O(this, false);
    }

    @Override // androidx.fragment.app.x
    public x l(Fragment fragment) {
        o oVar = fragment.A;
        if (oVar == null || oVar == this.r) {
            e(new x.a(6, fragment));
            return this;
        }
        StringBuilder V0 = je.V0("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        V0.append(fragment.toString());
        V0.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(V0.toString());
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.fragment.app.x
    public void n(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder V0 = je.V0("Fragment ");
            V0.append(cls.getCanonicalName());
            V0.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(V0.toString());
        }
        if (str != null) {
            String str2 = fragment.G;
            if (str2 == null || str.equals(str2)) {
                fragment.G = str;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                throw new IllegalStateException(je.J0(sb, fragment.G, " now ", str));
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.E;
                if (i3 == 0 || i3 == i) {
                    fragment.E = i;
                    fragment.F = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.E + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        e(new x.a(i2, fragment));
        fragment.A = this.r;
    }

    @Override // androidx.fragment.app.x
    public boolean o() {
        return this.a.isEmpty();
    }

    @Override // androidx.fragment.app.x
    public x p(Fragment fragment) {
        o oVar = fragment.A;
        if (oVar == null || oVar == this.r) {
            e(new x.a(3, fragment));
            return this;
        }
        StringBuilder V0 = je.V0("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        V0.append(fragment.toString());
        V0.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(V0.toString());
    }

    public String toString() {
        StringBuilder T0 = je.T0(128, "BackStackEntry{");
        T0.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            T0.append(" #");
            T0.append(this.t);
        }
        if (this.i != null) {
            T0.append(" ");
            T0.append(this.i);
        }
        T0.append("}");
        return T0.toString();
    }

    @Override // androidx.fragment.app.x
    public x u(Fragment fragment, Lifecycle.State state) {
        if (fragment.A == this.r) {
            Lifecycle.State state2 = Lifecycle.State.CREATED;
            if (state.compareTo(state2) >= 0) {
                e(new x.a(10, fragment, state));
                return this;
            }
            throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + state2);
        }
        StringBuilder V0 = je.V0("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
        V0.append(this.r);
        throw new IllegalArgumentException(V0.toString());
    }

    @Override // androidx.fragment.app.x
    public x v(Fragment fragment) {
        o oVar = fragment.A;
        if (oVar == null || oVar == this.r) {
            e(new x.a(8, fragment));
            return this;
        }
        StringBuilder V0 = je.V0("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
        V0.append(fragment.toString());
        V0.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(V0.toString());
    }

    /* access modifiers changed from: package-private */
    public void y(int i) {
        if (this.g) {
            if (o.k0(2)) {
                String str = "Bump nesting in " + this + " by " + i;
            }
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                x.a aVar = this.a.get(i2);
                Fragment fragment = aVar.b;
                if (fragment != null) {
                    fragment.z += i;
                    if (o.k0(2)) {
                        StringBuilder V0 = je.V0("Bump nesting of ");
                        V0.append(aVar.b);
                        V0.append(" to ");
                        V0.append(aVar.b.z);
                        V0.toString();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int z(boolean z) {
        if (!this.s) {
            if (o.k0(2)) {
                String str = "Commit: " + this;
                PrintWriter printWriter = new PrintWriter(new t3("FragmentManager"));
                A("  ", printWriter, true);
                printWriter.close();
            }
            this.s = true;
            if (this.g) {
                this.t = this.r.f();
            } else {
                this.t = -1;
            }
            this.r.L(this, z);
            return this.t;
        }
        throw new IllegalStateException("commit already called");
    }
}
