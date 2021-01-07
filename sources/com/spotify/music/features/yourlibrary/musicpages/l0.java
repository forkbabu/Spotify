package com.spotify.music.features.yourlibrary.musicpages;

import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.k1;
import defpackage.mpd;

public final /* synthetic */ class l0 implements k1.d {
    public final /* synthetic */ da2 a;

    public /* synthetic */ l0(da2 da2) {
        this.a = da2;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.k1.d
    public final void a(mpd.b bVar) {
        this.a.accept(s0.A(bVar.d(), Boolean.valueOf(!bVar.a())));
    }
}
