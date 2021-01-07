package com.spotify.music.libs.podcast.download;

import com.spotify.music.settings.a;
import io.reactivex.s;

public class g0 {
    private final a a;
    private final v b;

    public g0(a aVar, v vVar) {
        this.b = vVar;
        this.a = aVar;
    }

    public s<Boolean> a() {
        return s.n(this.b.a().E(), this.a.a().j0(t.a).E(), r.a);
    }
}
