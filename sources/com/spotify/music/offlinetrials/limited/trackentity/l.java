package com.spotify.music.offlinetrials.limited.trackentity;

import com.spotify.playlist.models.offline.a;
import io.reactivex.f;
import io.reactivex.t;

public class l {
    private final String a;
    private final d9c b;
    private f<a> c;

    l(d9c d9c, String str) {
        this.a = str;
        this.b = d9c;
    }

    public /* synthetic */ void a(t tVar) {
        this.c = tVar;
        tVar.onNext(a.f.a);
    }

    public void b() {
        this.b.c(this.a, this.c);
    }

    public void c() {
        this.b.d(this.a, this.c);
    }
}
