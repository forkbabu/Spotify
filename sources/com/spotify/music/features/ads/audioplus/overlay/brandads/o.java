package com.spotify.music.features.ads.audioplus.overlay.brandads;

import com.squareup.picasso.g;

class o implements g {
    final /* synthetic */ n a;

    o(n nVar) {
        this.a = nVar;
    }

    @Override // com.squareup.picasso.g
    public void onError(Exception exc) {
        n nVar = this.a;
        nVar.v.c(nVar.t);
    }

    @Override // com.squareup.picasso.g
    public void onSuccess() {
        this.a.v.d();
    }
}
