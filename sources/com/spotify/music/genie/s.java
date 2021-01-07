package com.spotify.music.genie;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.d0;
import io.reactivex.e0;
import io.reactivex.g;
import io.reactivex.z;

public class s implements e0<Wish, Wish> {
    private final g<SessionState> a;

    public s(g<SessionState> gVar) {
        this.a = gVar;
    }

    @Override // io.reactivex.e0
    public d0<Wish> a(z<Wish> zVar) {
        return this.a.E().A(l.a).t(k.a).h(zVar).D(j.a);
    }
}
