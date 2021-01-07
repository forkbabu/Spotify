package com.spotify.music.features.playlistentity;

import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

class m implements l {
    private final PublishSubject<Boolean> a = PublishSubject.h1();
    private final PublishSubject<Boolean> b = PublishSubject.h1();

    m() {
    }

    @Override // com.spotify.music.features.playlistentity.l
    public void a() {
        this.a.onNext(Boolean.TRUE);
    }

    @Override // com.spotify.music.features.playlistentity.l
    public void b() {
        this.b.onNext(Boolean.TRUE);
    }

    @Override // com.spotify.music.features.playlistentity.l
    public s<Boolean> c() {
        return this.a;
    }

    @Override // com.spotify.music.features.playlistentity.l
    public s<Boolean> d() {
        return this.b;
    }
}
