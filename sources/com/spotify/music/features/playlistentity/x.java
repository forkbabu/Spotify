package com.spotify.music.features.playlistentity;

import com.google.common.base.MoreObjects;
import com.spotify.music.features.playlistentity.w;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

class x implements w {
    private final PublishSubject<w.b> a = PublishSubject.h1();
    private w.a b = f.a;

    x() {
    }

    @Override // com.spotify.music.features.playlistentity.w
    public s<w.b> b() {
        return this.a;
    }

    @Override // com.spotify.music.features.playlistentity.w
    public void c(int i, int i2) {
        this.a.onNext(new w.b(i, i2));
    }

    @Override // com.spotify.music.features.playlistentity.w
    public int d(w.b bVar) {
        int a2 = this.b.a(bVar.b());
        if (a2 == -1) {
            return -1;
        }
        return bVar.a() + a2;
    }

    @Override // com.spotify.music.features.playlistentity.w
    public void e(w.a aVar) {
        this.b = (w.a) MoreObjects.firstNonNull(aVar, e.a);
    }
}
