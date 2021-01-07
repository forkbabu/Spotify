package com.spotify.mobile.android.service;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.media.l2;
import com.spotify.mobile.android.service.plugininterfaces.b;
import com.spotify.mobile.android.util.r0;
import com.spotify.music.features.voice.z;
import com.spotify.music.libs.audio.focus.w;
import com.spotify.music.libs.performance.tracking.n;
import com.spotify.music.spotlets.radio.service.f0;
import java.util.Set;

public class i {
    private final Set<b> a;

    i(pn1 pn1, n nVar, cw8 cw8, sha sha, w wVar, z zVar, l2 l2Var, f0 f0Var, ut9 ut9, ke5 ke5, r0 r0Var, wv9 wv9, hn1 hn1, aia aia, a51 a51, d4a d4a, ja1 ja1, bx9 bx9) {
        this.a = ImmutableSet.of((z) pn1, (z) nVar, (z) cw8, (z) sha, (z) wVar, zVar, (z[]) new b[]{l2Var, f0Var, ut9, ke5, r0Var, wv9, hn1, aia, a51, d4a, ja1, bx9});
    }

    public Set<b> a() {
        return this.a;
    }
}
