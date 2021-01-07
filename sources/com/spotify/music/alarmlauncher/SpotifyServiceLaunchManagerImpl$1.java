package com.spotify.music.alarmlauncher;

import defpackage.enf;
import kotlin.jvm.internal.Lambda;

final class SpotifyServiceLaunchManagerImpl$1 extends Lambda implements rmf<Long, Long, Long> {
    public static final SpotifyServiceLaunchManagerImpl$1 a = new SpotifyServiceLaunchManagerImpl$1();

    SpotifyServiceLaunchManagerImpl$1() {
        super(2);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public Long invoke(Long l, Long l2) {
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        enf.a aVar = enf.b;
        return Long.valueOf(enf.a.e(longValue, longValue2));
    }
}
