package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class h0 {
    private final HashMap<String, e0> a = new HashMap<>();

    public final void a() {
        for (e0 e0Var : this.a.values()) {
            e0Var.c();
        }
        this.a.clear();
    }

    /* access modifiers changed from: package-private */
    public final e0 b(String str) {
        return this.a.get(str);
    }

    /* access modifiers changed from: package-private */
    public Set<String> c() {
        return new HashSet(this.a.keySet());
    }

    /* access modifiers changed from: package-private */
    public final void d(String str, e0 e0Var) {
        e0 put = this.a.put(str, e0Var);
        if (put != null) {
            put.e();
        }
    }
}
