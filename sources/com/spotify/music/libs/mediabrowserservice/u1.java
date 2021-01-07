package com.spotify.music.libs.mediabrowserservice;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.player.model.PlayOrigin;

public interface u1 {
    public static final ImmutableSet<Long> a = ImmutableSet.of(4L, 2L, 1L, 1024L, 2048L, 32L, (long[]) new Long[]{16L, 4096L, 256L, 262144L});
    public static final PlayOrigin b = PlayOrigin.builder(kfd.B0.getName()).referrerIdentifier(bu9.q.getName()).build();

    n2 a(String str, v1 v1Var, RootHintsParams rootHintsParams);

    String b();

    yda c(String str);

    boolean d(String str);
}
