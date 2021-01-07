package com.spotify.music.features.search.mobius;

import com.google.common.base.Optional;
import com.spotify.libs.search.history.SearchHistoryItem;
import defpackage.x98;

class y0 implements x {
    final /* synthetic */ da2 a;
    final /* synthetic */ x0 b;

    y0(x0 x0Var, da2 da2) {
        this.b = x0Var;
        this.a = da2;
    }

    @Override // com.spotify.music.features.search.mobius.x
    public void a(x98 x98, SearchHistoryItem searchHistoryItem) {
        zya g = zya.g(eza.a(x98.e().or((Optional<String>) ""), searchHistoryItem, this.b.o.b()));
        b0 b0Var = this.b.f;
        x98.a f = x98.f();
        f.d(this.b.o.c());
        b0Var.b(g, f.build());
        this.a.accept(g);
    }

    @Override // com.spotify.music.features.search.mobius.x
    public void b(String str, int i) {
        zya f = zya.f(str, i);
        this.b.f.a(f);
        this.a.accept(f);
    }

    @Override // com.spotify.music.features.search.mobius.x
    public void c(x98 x98) {
        zya a2 = zya.a();
        this.b.f.b(a2, x98);
        this.a.accept(a2);
    }
}
