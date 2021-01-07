package com.spotify.music.nowplaying.podcast.mixedmedia.ui.header;

import com.spotify.music.nowplaying.core.navcontext.f;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.util.UtilsKt;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.y;
import kotlin.Pair;
import kotlin.jvm.internal.h;

public final class c {
    private final g<f> a;

    static final class a<T, R> implements l<Pair<? extends f, ? extends com.spotify.music.nowplaying.podcast.mixedmedia.model.c>, f> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public f apply(Pair<? extends f, ? extends com.spotify.music.nowplaying.podcast.mixedmedia.model.c> pair) {
            Pair<? extends f, ? extends com.spotify.music.nowplaying.podcast.mixedmedia.model.c> pair2 = pair;
            h.e(pair2, "<name for destructuring parameter 0>");
            f fVar = (f) pair2.a();
            return new f(new a((com.spotify.music.nowplaying.podcast.mixedmedia.model.c) pair2.b()), b.a, fVar.b(), fVar.a());
        }
    }

    public c(g<com.spotify.music.nowplaying.podcast.mixedmedia.model.c> gVar, g<f> gVar2, y yVar) {
        h.e(gVar, "trackListModelFlowable");
        h.e(gVar2, "navigationContextFlowable");
        h.e(yVar, "mainThread");
        g<f> O = UtilsKt.a(gVar2, gVar).Q(yVar).O(a.a);
        h.d(O, "navigationContextFlowabl…l\n            )\n        }");
        this.a = O;
    }

    public final g<f> a() {
        return this.a;
    }
}
