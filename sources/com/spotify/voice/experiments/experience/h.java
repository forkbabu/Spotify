package com.spotify.voice.experiments.experience;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public final class h implements fjf<Set<String>> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final h a = new h();
    }

    public static h a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        ImmutableSet<String> immutableSet = f.a;
        yif.g(immutableSet, "Cannot return null from a non-@Nullable @Provides method");
        return immutableSet;
    }
}
