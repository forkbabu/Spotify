package com.spotify.music.lyrics.share.selection.presenter.controller;

import io.reactivex.functions.g;

final class b<T> implements g<Integer> {
    final /* synthetic */ com.spotify.music.lyrics.core.experience.contract.b a;

    b(com.spotify.music.lyrics.core.experience.contract.b bVar) {
        this.a = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Integer num) {
        this.a.b(num.intValue());
    }
}
