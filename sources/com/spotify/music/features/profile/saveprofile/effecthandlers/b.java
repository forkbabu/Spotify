package com.spotify.music.features.profile.saveprofile.effecthandlers;

import com.spotify.http.u;
import com.spotify.music.features.profile.saveprofile.domain.n;
import com.spotify.music.features.profile.saveprofile.domain.o;
import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ u a;

    public /* synthetic */ b(u uVar) {
        this.a = uVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        n.f fVar = (n.f) obj;
        return ((b0) this.a.c(b0.class)).a(fVar.b(), fVar.a()).g(s.i0(new o.g(true))).r0(d.a);
    }
}
