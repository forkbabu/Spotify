package androidx.navigation;

import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* access modifiers changed from: package-private */
public class j extends e0 {
    private static final g0.b d = new a();
    private final HashMap<UUID, h0> c = new HashMap<>();

    class a implements g0.b {
        a() {
        }

        @Override // androidx.lifecycle.g0.b
        public <T extends e0> T a(Class<T> cls) {
            return new j();
        }
    }

    j() {
    }

    static j h(h0 h0Var) {
        return (j) new g0(h0Var, d).a(j.class);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.e0
    public void e() {
        for (h0 h0Var : this.c.values()) {
            h0Var.a();
        }
        this.c.clear();
    }

    /* access modifiers changed from: package-private */
    public void g(UUID uuid) {
        h0 remove = this.c.remove(uuid);
        if (remove != null) {
            remove.a();
        }
    }

    /* access modifiers changed from: package-private */
    public h0 i(UUID uuid) {
        h0 h0Var = this.c.get(uuid);
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0();
        this.c.put(uuid, h0Var2);
        return h0Var2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<UUID> it = this.c.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
