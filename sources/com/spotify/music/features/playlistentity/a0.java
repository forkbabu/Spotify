package com.spotify.music.features.playlistentity;

import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

class a0 implements z {
    private final PublishSubject<Boolean> a = PublishSubject.h1();

    a0() {
    }

    @Override // com.spotify.music.features.playlistentity.z
    public void a(boolean z) {
        this.a.onNext(Boolean.valueOf(z));
    }

    @Override // com.spotify.music.features.playlistentity.z
    public s<Boolean> b() {
        return this.a;
    }
}
