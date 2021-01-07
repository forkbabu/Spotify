package com.spotify.music.features.search.mobius;

import com.spotify.music.libs.search.view.l;

public final /* synthetic */ class m implements l.b {
    public final /* synthetic */ da2 a;

    public /* synthetic */ m(da2 da2) {
        this.a = da2;
    }

    @Override // com.spotify.music.libs.search.view.l.b
    public /* synthetic */ void L(boolean z) {
        com.spotify.music.libs.search.view.m.b(this, z);
    }

    @Override // com.spotify.music.libs.search.view.l.b
    public /* synthetic */ void f(String str) {
        com.spotify.music.libs.search.view.m.c(this, str);
    }

    @Override // com.spotify.music.libs.search.view.l.b
    public /* synthetic */ void n() {
        com.spotify.music.libs.search.view.m.a(this);
    }

    @Override // com.spotify.music.libs.search.view.l.b
    public final void r(String str) {
        this.a.accept(zya.e(str));
    }
}
