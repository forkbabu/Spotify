package com.spotify.music.features.playlistentity;

import io.reactivex.s;
import io.reactivex.subjects.a;

class d0 implements c0 {
    private final a<Integer> a = a.h1();

    d0() {
    }

    @Override // com.spotify.music.features.playlistentity.c0
    public void a(int i) {
        this.a.onNext(Integer.valueOf(i));
    }

    @Override // com.spotify.music.features.playlistentity.c0
    public s<Integer> b() {
        return this.a.E();
    }
}
