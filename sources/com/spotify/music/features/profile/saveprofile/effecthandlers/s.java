package com.spotify.music.features.profile.saveprofile.effecthandlers;

import com.spotify.music.features.profile.saveprofile.domain.n;
import com.spotify.music.features.profile.saveprofile.domain.o;
import io.reactivex.functions.l;

public final /* synthetic */ class s implements l {
    public final /* synthetic */ bqa a;

    public /* synthetic */ s(bqa bqa) {
        this.a = bqa;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        n.e eVar = (n.e) obj;
        return this.a.b(eVar.b(), eVar.a()).g(io.reactivex.s.i0(new o.f(true))).r0(l.a);
    }
}
