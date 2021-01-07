package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.spotify.music.nowplaying.drivingmode.view.pivot.l;
import com.spotify.player.model.ContextIndex;
import io.reactivex.functions.c;
import java.util.concurrent.atomic.AtomicInteger;

public final /* synthetic */ class f implements c {
    public final /* synthetic */ AtomicInteger a;

    public /* synthetic */ f(AtomicInteger atomicInteger) {
        this.a = atomicInteger;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        AtomicInteger atomicInteger = this.a;
        r0 r0Var = (r0) obj;
        s81 s81 = (s81) obj2;
        a91 target = s81.target();
        String uri = target != null ? target.uri() : null;
        x81 main = s81.images().main();
        String uri2 = main != null ? main.uri() : "";
        String id = s81.id();
        l.a a2 = l.a();
        a2.c(uri2);
        a2.i(new cfc(uri));
        a2.h(id);
        a2.b(Integer.toString(atomicInteger.getAndIncrement()));
        a2.g(ContextIndex.create(0, 0));
        a2.d(0);
        a2.a(s81.text().title());
        a2.j(r0Var.c());
        a2.f(r0Var.b());
        a2.e(r0Var.a());
        return a2.build();
    }
}
