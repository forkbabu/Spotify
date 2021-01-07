package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.i0;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public class v {
    private final n a;
    private final Fragment b;
    private int c = -1;

    v(n nVar, Fragment fragment) {
        this.a = nVar;
        this.b = fragment;
    }

    private Bundle n() {
        Bundle bundle = new Bundle();
        Fragment fragment = this.b;
        fragment.N3(bundle);
        fragment.d0.d(bundle);
        Parcelable G0 = fragment.C.G0();
        if (G0 != null) {
            bundle.putParcelable("android:support:fragments", G0);
        }
        this.a.j(this.b, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.b.P != null) {
            q();
        }
        if (this.b.c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.b.c);
        }
        if (!this.b.R) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.b.R);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (o.k0(3)) {
            StringBuilder V0 = je.V0("moveto ACTIVITY_CREATED: ");
            V0.append(this.b);
            V0.toString();
        }
        Fragment fragment = this.b;
        fragment.S3(fragment.b);
        n nVar = this.a;
        Fragment fragment2 = this.b;
        nVar.a(fragment2, fragment2.b, false);
    }

    /* access modifiers changed from: package-private */
    public void b(l<?> lVar, o oVar, Fragment fragment) {
        Fragment fragment2 = this.b;
        fragment2.B = lVar;
        fragment2.D = fragment;
        fragment2.A = oVar;
        this.a.g(fragment2, lVar.d(), false);
        this.b.T3();
        Fragment fragment3 = this.b;
        Fragment fragment4 = fragment3.D;
        if (fragment4 == null) {
            lVar.f(fragment3);
        } else {
            fragment4.q3();
        }
        this.a.b(this.b, lVar.d(), false);
    }

    /* access modifiers changed from: package-private */
    public int c() {
        int i = this.c;
        Fragment fragment = this.b;
        if (fragment.v) {
            if (fragment.w) {
                i = Math.max(i, 1);
            } else if (i < 2) {
                i = Math.min(i, fragment.a);
            } else {
                i = Math.min(i, 1);
            }
        }
        if (!this.b.t) {
            i = Math.min(i, 1);
        }
        Fragment fragment2 = this.b;
        if (fragment2.u) {
            if (fragment2.h3()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, -1);
            }
        }
        Fragment fragment3 = this.b;
        if (fragment3.Q && fragment3.a < 3) {
            i = Math.min(i, 2);
        }
        int ordinal = this.b.Y.ordinal();
        if (ordinal == 2) {
            return Math.min(i, 1);
        }
        if (ordinal == 3) {
            return Math.min(i, 3);
        }
        if (ordinal != 4) {
            return Math.min(i, -1);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (o.k0(3)) {
            StringBuilder V0 = je.V0("moveto CREATED: ");
            V0.append(this.b);
            V0.toString();
        }
        Fragment fragment = this.b;
        if (!fragment.X) {
            this.a.h(fragment, fragment.b, false);
            Fragment fragment2 = this.b;
            fragment2.U3(fragment2.b);
            n nVar = this.a;
            Fragment fragment3 = this.b;
            nVar.c(fragment3, fragment3.b, false);
            return;
        }
        fragment.n4(fragment.b);
        this.b.a = 1;
    }

    /* access modifiers changed from: package-private */
    public void e(i iVar) {
        String str;
        if (!this.b.v) {
            if (o.k0(3)) {
                StringBuilder V0 = je.V0("moveto CREATE_VIEW: ");
                V0.append(this.b);
                V0.toString();
            }
            ViewGroup viewGroup = null;
            Fragment fragment = this.b;
            ViewGroup viewGroup2 = fragment.O;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = fragment.F;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) iVar.a(i);
                        if (viewGroup == null) {
                            Fragment fragment2 = this.b;
                            if (!fragment2.x) {
                                try {
                                    str = fragment2.R2().getResourceName(this.b.F);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                StringBuilder V02 = je.V0("No view found for id 0x");
                                V02.append(Integer.toHexString(this.b.F));
                                V02.append(" (");
                                V02.append(str);
                                V02.append(") for fragment ");
                                V02.append(this.b);
                                throw new IllegalArgumentException(V02.toString());
                            }
                        }
                    } else {
                        StringBuilder V03 = je.V0("Cannot create fragment ");
                        V03.append(this.b);
                        V03.append(" for a container view with no id");
                        throw new IllegalArgumentException(V03.toString());
                    }
                }
            }
            Fragment fragment3 = this.b;
            fragment3.O = viewGroup;
            fragment3.V3(fragment3.Z3(fragment3.b), viewGroup, this.b.b);
            View view = this.b.P;
            if (view != null) {
                boolean z = false;
                view.setSaveFromParentEnabled(false);
                Fragment fragment4 = this.b;
                fragment4.P.setTag(C0707R.id.fragment_container_view_tag, fragment4);
                if (viewGroup != null) {
                    viewGroup.addView(this.b.P);
                }
                Fragment fragment5 = this.b;
                if (fragment5.H) {
                    fragment5.P.setVisibility(8);
                }
                q4.F(this.b.P);
                Fragment fragment6 = this.b;
                fragment6.Q3(fragment6.P, fragment6.b);
                n nVar = this.a;
                Fragment fragment7 = this.b;
                nVar.m(fragment7, fragment7.P, fragment7.b, false);
                Fragment fragment8 = this.b;
                if (fragment8.P.getVisibility() == 0 && this.b.O != null) {
                    z = true;
                }
                fragment8.T = z;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f(l<?> lVar, s sVar) {
        if (o.k0(3)) {
            StringBuilder V0 = je.V0("movefrom CREATED: ");
            V0.append(this.b);
            V0.toString();
        }
        Fragment fragment = this.b;
        boolean z = true;
        boolean z2 = fragment.u && !fragment.h3();
        if (z2 || sVar.p(this.b)) {
            if (lVar instanceof i0) {
                z = sVar.n();
            } else if (lVar.d() instanceof Activity) {
                z = true ^ ((Activity) lVar.d()).isChangingConfigurations();
            }
            if (z2 || z) {
                sVar.h(this.b);
            }
            this.b.W3();
            this.a.d(this.b, false);
            return;
        }
        this.b.a = 0;
    }

    /* access modifiers changed from: package-private */
    public void g(s sVar) {
        if (o.k0(3)) {
            StringBuilder V0 = je.V0("movefrom ATTACHED: ");
            V0.append(this.b);
            V0.toString();
        }
        this.b.Y3();
        boolean z = false;
        this.a.e(this.b, false);
        Fragment fragment = this.b;
        fragment.a = -1;
        fragment.B = null;
        fragment.D = null;
        fragment.A = null;
        if (fragment.u && !fragment.h3()) {
            z = true;
        }
        if (z || sVar.p(this.b)) {
            if (o.k0(3)) {
                StringBuilder V02 = je.V0("initState called for fragment: ");
                V02.append(this.b);
                V02.toString();
            }
            this.b.d3();
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Fragment fragment = this.b;
        if (fragment.v && fragment.w && !fragment.y) {
            if (o.k0(3)) {
                StringBuilder V0 = je.V0("moveto CREATE_VIEW: ");
                V0.append(this.b);
                V0.toString();
            }
            Fragment fragment2 = this.b;
            fragment2.V3(fragment2.Z3(fragment2.b), null, this.b.b);
            View view = this.b.P;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.b;
                fragment3.P.setTag(C0707R.id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.b;
                if (fragment4.H) {
                    fragment4.P.setVisibility(8);
                }
                Fragment fragment5 = this.b;
                fragment5.Q3(fragment5.P, fragment5.b);
                n nVar = this.a;
                Fragment fragment6 = this.b;
                nVar.m(fragment6, fragment6.P, fragment6.b, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment i() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (o.k0(3)) {
            StringBuilder V0 = je.V0("movefrom RESUMED: ");
            V0.append(this.b);
            V0.toString();
        }
        this.b.b4();
        this.a.f(this.b, false);
    }

    /* access modifiers changed from: package-private */
    public void k(ClassLoader classLoader) {
        Bundle bundle = this.b.b;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.b;
            fragment.c = fragment.b.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.b;
            fragment2.q = fragment2.b.getString("android:target_state");
            Fragment fragment3 = this.b;
            if (fragment3.q != null) {
                fragment3.r = fragment3.b.getInt("android:target_req_state", 0);
            }
            Fragment fragment4 = this.b;
            Boolean bool = fragment4.f;
            if (bool != null) {
                fragment4.R = bool.booleanValue();
                this.b.f = null;
            } else {
                fragment4.R = fragment4.b.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment5 = this.b;
            if (!fragment5.R) {
                fragment5.Q = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        if (o.k0(3)) {
            StringBuilder V0 = je.V0("moveto RESTORE_VIEW_STATE: ");
            V0.append(this.b);
            V0.toString();
        }
        Fragment fragment = this.b;
        if (fragment.P != null) {
            fragment.o4(fragment.b);
        }
        this.b.b = null;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        if (o.k0(3)) {
            StringBuilder V0 = je.V0("moveto RESUMED: ");
            V0.append(this.b);
            V0.toString();
        }
        this.b.e4();
        this.a.i(this.b, false);
        Fragment fragment = this.b;
        fragment.b = null;
        fragment.c = null;
    }

    /* access modifiers changed from: package-private */
    public Fragment.e o() {
        Bundle n;
        if (this.b.a <= -1 || (n = n()) == null) {
            return null;
        }
        return new Fragment.e(n);
    }

    /* access modifiers changed from: package-private */
    public u p() {
        u uVar = new u(this.b);
        Fragment fragment = this.b;
        if (fragment.a <= -1 || uVar.v != null) {
            uVar.v = fragment.b;
        } else {
            Bundle n = n();
            uVar.v = n;
            if (this.b.q != null) {
                if (n == null) {
                    uVar.v = new Bundle();
                }
                uVar.v.putString("android:target_state", this.b.q);
                int i = this.b.r;
                if (i != 0) {
                    uVar.v.putInt("android:target_req_state", i);
                }
            }
        }
        return uVar;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        if (this.b.P != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.b.P.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.b.c = sparseArray;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r(int i) {
        this.c = i;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (o.k0(3)) {
            StringBuilder V0 = je.V0("moveto STARTED: ");
            V0.append(this.b);
            V0.toString();
        }
        this.b.f4();
        this.a.k(this.b, false);
    }

    /* access modifiers changed from: package-private */
    public void t() {
        if (o.k0(3)) {
            StringBuilder V0 = je.V0("movefrom STARTED: ");
            V0.append(this.b);
            V0.toString();
        }
        this.b.g4();
        this.a.l(this.b, false);
    }

    v(n nVar, ClassLoader classLoader, k kVar, u uVar) {
        this.a = nVar;
        Fragment a2 = kVar.a(classLoader, uVar.a);
        this.b = a2;
        Bundle bundle = uVar.s;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.r4(uVar.s);
        a2.n = uVar.b;
        a2.v = uVar.c;
        a2.x = true;
        a2.E = uVar.f;
        a2.F = uVar.n;
        a2.G = uVar.o;
        a2.J = uVar.p;
        a2.u = uVar.q;
        a2.I = uVar.r;
        a2.H = uVar.t;
        a2.Y = Lifecycle.State.values()[uVar.u];
        Bundle bundle2 = uVar.v;
        if (bundle2 != null) {
            a2.b = bundle2;
        } else {
            a2.b = new Bundle();
        }
        if (o.k0(2)) {
            String str = "Instantiated fragment " + a2;
        }
    }

    v(n nVar, Fragment fragment, u uVar) {
        this.a = nVar;
        this.b = fragment;
        fragment.c = null;
        fragment.z = 0;
        fragment.w = false;
        fragment.t = false;
        Fragment fragment2 = fragment.p;
        fragment.q = fragment2 != null ? fragment2.n : null;
        fragment.p = null;
        Bundle bundle = uVar.v;
        if (bundle != null) {
            fragment.b = bundle;
        } else {
            fragment.b = new Bundle();
        }
    }
}
