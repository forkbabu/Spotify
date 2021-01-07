package com.spotify.mobius;

import java.util.Collections;
import java.util.Set;

public abstract class s<M, F> {
    public static <M, F> s<M, F> b(M m) {
        return new e(m, Collections.emptySet());
    }

    public static <M, F> s<M, F> c(M m, Set<F> set) {
        return new e(m, set);
    }

    public abstract Set<F> a();

    public abstract M d();
}
