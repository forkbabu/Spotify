package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import com.squareup.picasso.g;

class b implements g {
    final /* synthetic */ com.spotify.music.canvas.model.b a;
    final /* synthetic */ c b;

    b(c cVar, com.spotify.music.canvas.model.b bVar) {
        this.b = cVar;
        this.a = bVar;
    }

    @Override // com.squareup.picasso.g
    public void onError(Exception exc) {
        this.b.D.c(this.a, "CANVAS_IMAGE_LOAD_ERROR", "Loading canvas image failed");
    }

    @Override // com.squareup.picasso.g
    public void onSuccess() {
        this.b.D.a(this.a);
        this.b.E.d(this.a.h());
    }
}
