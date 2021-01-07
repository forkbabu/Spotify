package com.spotify.music.libs.podcast.download;

import com.spotify.playlist.endpoints.p;
import io.reactivex.s;

public class d0 {
    private final g0 a;
    private final p b;

    public d0(g0 g0Var, p pVar) {
        this.a = g0Var;
        this.b = pVar;
    }

    public s<c0> a(String str) {
        return s.n(this.a.a(), this.b.a(str).P(), q.a);
    }
}
