package com.spotify.mobius;

import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class e0<M, F> {
    protected e0() {
    }

    public static <M, F> e0<M, F> a(Set<? extends F> set) {
        return new f(null, z42.v(set));
    }

    public static <M, F> e0<M, F> f(M m) {
        return new f(m, Collections.emptySet());
    }

    public static <M, F> e0<M, F> g(M m, Set<? extends F> set) {
        return new f(m, z42.v(set));
    }

    public static <M, F> e0<M, F> h() {
        return new f(null, Collections.emptySet());
    }

    public abstract Set<F> b();

    public final boolean c() {
        return d() != null;
    }

    /* access modifiers changed from: protected */
    public abstract M d();

    public M e() {
        if (c()) {
            return d();
        }
        throw new NoSuchElementException("there is no model in this Next<>");
    }
}
