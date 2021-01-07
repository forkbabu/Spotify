package com.spotify.mobile.android.service;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.plugininterfaces.c;
import com.spotify.music.features.pushnotifications.r0;
import java.util.Set;

public class r {
    private final Set<c> a;

    public r(oi2 oi2, ut9 ut9, tb1 tb1, r0 r0Var, yba yba) {
        this.a = ImmutableSet.of((yba) oi2, (yba) ut9, (yba) tb1, (yba) r0Var, yba);
    }

    public Set<c> a() {
        return this.a;
    }
}
