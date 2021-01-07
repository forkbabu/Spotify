package com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline;

import com.spotify.music.nowplaying.podcast.mixedmedia.ui.seekbar.timeline.b;
import defpackage.j1c;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;

final class c<T, R> implements l<Throwable, d0<? extends zwd>> {
    final /* synthetic */ b.C0317b a;
    final /* synthetic */ j1c.b.C0628b b;

    c(b.C0317b bVar, j1c.b.C0628b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d0<? extends zwd> apply(Throwable th) {
        Throwable th2 = th;
        h.e(th2, "it");
        StringBuilder V0 = je.V0("Could not seek episode ");
        V0.append(b.a(this.a.a));
        V0.append(" to position: ");
        V0.append(this.b.a());
        V0.append(" ms");
        return z.q(new IllegalStateException(V0.toString(), th2));
    }
}
