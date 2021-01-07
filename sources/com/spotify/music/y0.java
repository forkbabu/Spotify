package com.spotify.music;

import com.google.common.collect.ImmutableSet;
import com.spotify.connect.snacks.ConnectSnacksPlugin;
import com.spotify.music.carmode.navigation.o;
import com.spotify.music.features.carmode.optin.k;
import com.spotify.music.mainactivity.j;
import com.spotify.music.premiummini.PremiumMiniPlugin;
import java.util.Set;

/* access modifiers changed from: package-private */
public class y0 {
    private final Set<ahb> a;

    y0(j jVar, ck2 ck2, d9b d9b, ljb ljb, hv5 hv5, d90 d90, f28 f28, k kVar, d0 d0Var, o oVar, cy8 cy8, w5a w5a, ConnectSnacksPlugin connectSnacksPlugin, c9c c9c, PremiumMiniPlugin premiumMiniPlugin, bld bld) {
        this.a = ImmutableSet.of((d90) jVar, (d90) ck2, (d90) d9b, (d90) ljb, (d90) hv5, d90, (d90[]) new ahb[]{f28, kVar, d0Var, oVar, cy8, w5a, connectSnacksPlugin, c9c, premiumMiniPlugin, bld});
    }

    /* access modifiers changed from: package-private */
    public Set<ahb> a() {
        return this.a;
    }
}
