package com.spotify.music.features.payfail;

import io.reactivex.functions.g;

public final /* synthetic */ class m implements g {
    public final /* synthetic */ y a;
    public final /* synthetic */ r b;

    public /* synthetic */ m(y yVar, r rVar) {
        this.a = yVar;
        this.b = rVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.j(this.b, (BannerModel) obj);
    }
}
