package com.spotify.music.libs.carmodeengine.util;

import io.reactivex.s;

public class k0 implements j0 {
    private final s<d7a> a;
    private final s<Boolean> b;

    public k0(s<d7a> sVar, c6a c6a) {
        this.a = sVar;
        this.b = c6a.e();
    }

    @Override // com.spotify.music.libs.carmodeengine.util.j0
    public s<Boolean> a() {
        return s.n(this.a, this.b, q.a);
    }
}
