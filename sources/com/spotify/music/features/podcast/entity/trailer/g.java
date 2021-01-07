package com.spotify.music.features.podcast.entity.trailer;

import com.spotify.music.podcast.ui.trailer.d;
import com.spotify.music.podcast.ui.trailer.e;
import io.reactivex.functions.l;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class g implements d.b {
    private final snc a;

    static final class a<T, R> implements l<tnc, e> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public e apply(tnc tnc) {
            tnc tnc2 = tnc;
            h.e(tnc2, "state");
            e.a a2 = e.a();
            a2.position(Long.valueOf(tnc2.b()));
            a2.b(Long.valueOf(tnc2.a()));
            a2.a(Long.valueOf(tnc2.c()));
            return a2.build();
        }
    }

    public g(snc snc) {
        h.e(snc, "trailerPlayer");
        this.a = snc;
    }

    @Override // com.spotify.music.podcast.ui.trailer.d.b
    public s<e> a() {
        s<R> j0 = this.a.c().j0(a.a);
        h.d(j0, "trailerPlayer.observeTra…   .build()\n            }");
        return j0;
    }
}
