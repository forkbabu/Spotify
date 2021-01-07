package com.spotify.music.features.podcast.episode.datasource;

import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.podcast.episode.datasource.x;
import io.reactivex.s;

public class a0 {
    private final RxEpisodeDataLoader a;
    private final u b;
    private final ke7 c;
    private final p87 d;
    private final c27 e;

    public a0(RxEpisodeDataLoader rxEpisodeDataLoader, u uVar, ke7 ke7, p87 p87, c27 c27) {
        this.a = rxEpisodeDataLoader;
        this.b = uVar;
        this.c = ke7;
        this.d = p87;
        this.e = c27;
    }

    public s<z> a(String str, boolean z, boolean z2) {
        RxEpisodeDataLoader rxEpisodeDataLoader = this.a;
        rxEpisodeDataLoader.getClass();
        return s.k(s.B(new s(rxEpisodeDataLoader, str, z, z2)), this.b.a(str).P().G0(new x.b()).r0(new e(str)), this.d.a(l0.z(str)).G0(y87.b()).r0(new b(str)), this.c.a(str).G0(qe7.b()).r0(new d(str)), ((d27) this.e).a(str).G0(f27.b()).r0(new l(str)), k.a).E();
    }
}
