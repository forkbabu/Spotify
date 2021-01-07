package com.spotify.music.features.freetierartist.datasource;

import com.google.common.base.Optional;
import com.spotify.playlist.models.b;
import io.reactivex.s;

public class y {
    private final o75 a;
    private final x9a b;

    public y(o75 o75, x9a x9a) {
        this.a = o75;
        this.b = x9a;
    }

    public s<b91> a(String str) {
        w9a b2 = this.b.b(str);
        w9a b3 = this.b.b(str);
        b3.e(true);
        return s.n(b2.b(), b3.c(), new g(this));
    }

    public b91 b(li0 li0, li0 li02) {
        return this.a.a(new li0(li0.c() || li02.c(), li0.a(), li02.e(), li02.d(), li02.b()));
    }

    public s<Optional<b>> c(String str) {
        return this.b.b(str).b().j0(o.a).G0((R) Optional.absent()).W(f.a, false, Integer.MAX_VALUE);
    }
}
