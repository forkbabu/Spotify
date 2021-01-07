package com.spotify.music.features.search.mobius;

import com.google.common.base.Optional;
import defpackage.x98;

public class p implements a71 {
    private final c8b a;
    private final z b;
    private final j81 c;

    public p(c8b c8b, z zVar, j81 j81) {
        c8b.getClass();
        this.a = c8b;
        this.b = zVar;
        this.c = j81;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        this.a.a();
        s81 d = n61.d();
        x98.a a2 = x98.a();
        a2.e(xb8.a(this.c.a(n61)));
        a2.a(rqa.e(d));
        a2.c(Optional.fromNullable(d.logging().string("ui:group")));
        a2.d(Optional.of(rqa.g(d)));
        this.b.c(a2.build());
    }
}
