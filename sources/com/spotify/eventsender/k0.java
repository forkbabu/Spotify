package com.spotify.eventsender;

import com.google.common.collect.ImmutableSet;
import com.spotify.eventsender.x;
import java.util.Set;

public abstract class k0 {

    public static abstract class a {
        public abstract k0 a();

        public abstract a b(Set<Integer> set);

        public abstract a c(boolean z);
    }

    public static a a() {
        x.b bVar = new x.b();
        bVar.b(ImmutableSet.of());
        bVar.c(false);
        return bVar;
    }

    public abstract Set<Integer> b();

    public abstract boolean c();
}
