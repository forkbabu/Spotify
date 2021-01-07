package androidx.fragment.app;

import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final class s extends e0 {
    private static final g0.b h = new a();
    private final HashMap<String, Fragment> c = new HashMap<>();
    private final HashMap<String, s> d = new HashMap<>();
    private final HashMap<String, h0> e = new HashMap<>();
    private final boolean f;
    private boolean g = false;

    static class a implements g0.b {
        a() {
        }

        @Override // androidx.lifecycle.g0.b
        public <T extends e0> T a(Class<T> cls) {
            return new s(true);
        }
    }

    s(boolean z) {
        this.f = z;
    }

    static s k(h0 h0Var) {
        return (s) new g0(h0Var, h).a(s.class);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.e0
    public void e() {
        if (o.k0(3)) {
            String str = "onCleared called for " + this;
        }
        this.g = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (!this.c.equals(sVar.c) || !this.d.equals(sVar.d) || !this.e.equals(sVar.e)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean g(Fragment fragment) {
        if (this.c.containsKey(fragment.n)) {
            return false;
        }
        this.c.put(fragment.n, fragment);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void h(Fragment fragment) {
        if (o.k0(3)) {
            String str = "Clearing non-config state for " + fragment;
        }
        s sVar = this.d.get(fragment.n);
        if (sVar != null) {
            sVar.e();
            this.d.remove(fragment.n);
        }
        h0 h0Var = this.e.get(fragment.n);
        if (h0Var != null) {
            h0Var.a();
            this.e.remove(fragment.n);
        }
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        return this.e.hashCode() + ((hashCode + (this.c.hashCode() * 31)) * 31);
    }

    /* access modifiers changed from: package-private */
    public Fragment i(String str) {
        return this.c.get(str);
    }

    /* access modifiers changed from: package-private */
    public s j(Fragment fragment) {
        s sVar = this.d.get(fragment.n);
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this.f);
        this.d.put(fragment.n, sVar2);
        return sVar2;
    }

    /* access modifiers changed from: package-private */
    public Collection<Fragment> l() {
        return this.c.values();
    }

    /* access modifiers changed from: package-private */
    public h0 m(Fragment fragment) {
        h0 h0Var = this.e.get(fragment.n);
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0();
        this.e.put(fragment.n, h0Var2);
        return h0Var2;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public boolean o(Fragment fragment) {
        return this.c.remove(fragment.n) != null;
    }

    /* access modifiers changed from: package-private */
    public boolean p(Fragment fragment) {
        if (this.c.containsKey(fragment.n) && this.f) {
            return this.g;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
