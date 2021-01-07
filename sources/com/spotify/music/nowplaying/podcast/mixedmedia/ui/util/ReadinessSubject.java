package com.spotify.music.nowplaying.podcast.mixedmedia.ui.util;

import io.reactivex.disposables.b;
import java.lang.Enum;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class ReadinessSubject<E extends Enum<E>> implements a<E>, b {
    private final Triple<a<E>, b, c> a;
    private final /* synthetic */ a<E> b;
    private final /* synthetic */ b c;

    public ReadinessSubject(E[] eArr, cmf<f> cmf) {
        h.e(eArr, "keys");
        h.e(cmf, "onReady");
        Pair pair = new Pair(new CompositeBooleanSubject(eArr), new c(cmf));
        Object c2 = pair.c();
        b subscribe = ((CompositeBooleanSubject) pair.c()).b().subscribe(new d(new ReadinessSubject$1$1((c) pair.d())));
        h.d(subscribe, "first.observable.subscribe(second::invoke)");
        Triple<a<E>, b, c> triple = new Triple<>(c2, subscribe, pair.d());
        this.b = triple.a();
        this.c = triple.b();
        this.a = triple;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.util.a
    public void a(E e, boolean z) {
        h.e(e, "key");
        this.b.a(e, z);
    }

    public final boolean b() {
        return this.a.c().d();
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return this.c.d();
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        this.c.dispose();
    }
}
