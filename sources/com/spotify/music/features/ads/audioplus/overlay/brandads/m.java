package com.spotify.music.features.ads.audioplus.overlay.brandads;

import com.squareup.picasso.g;

class m implements g {
    final /* synthetic */ l a;

    m(l lVar) {
        this.a = lVar;
    }

    @Override // com.squareup.picasso.g
    public void onError(Exception exc) {
        l lVar = this.a;
        lVar.v.c(lVar.t);
    }

    @Override // com.squareup.picasso.g
    public void onSuccess() {
        this.a.v.d();
    }
}
