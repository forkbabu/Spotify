package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.f0;

public final class d {
    private final Set<f0> a = new LinkedHashSet();

    public synchronized void a(f0 f0Var) {
        this.a.remove(f0Var);
    }

    public synchronized void b(f0 f0Var) {
        this.a.add(f0Var);
    }

    public synchronized boolean c(f0 f0Var) {
        return this.a.contains(f0Var);
    }
}
