package com.spotify.music.features.profile.saveprofile.effecthandlers;

import com.spotify.http.u;
import com.spotify.music.features.profile.saveprofile.domain.n;
import com.spotify.music.features.profile.saveprofile.domain.o;
import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class i implements l {
    public final /* synthetic */ u a;

    public /* synthetic */ i(u uVar) {
        this.a = uVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((b0) this.a.c(b0.class)).b(((n.d) obj).a()).g(s.i0(new o.d(true))).r0(j.a);
    }
}
