package com.spotify.music.podcast.freetierlikes.tabs;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

public final class m implements l {
    private final ih0 a;
    private final lbb b;

    static final class a<T, R> implements l<Throwable, Integer> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Integer apply(Throwable th) {
            Logger.e(th, "Failed to subscribe to Your Episodes", new Object[0]);
            return 0;
        }
    }

    public m(ih0 ih0, lbb lbb) {
        h.e(ih0, "listenLaterEndpoint");
        h.e(lbb, "yourEpisodesFlags");
        this.a = ih0;
        this.b = lbb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.spotify.music.podcast.freetierlikes.tabs.n] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.spotify.music.podcast.freetierlikes.tabs.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.reactivex.s<java.lang.Integer> a() {
        /*
            r4 = this;
            lbb r0 = r4.b
            boolean r0 = r0.a()
            r1 = 0
            if (r0 == 0) goto L_0x003b
            jh0 r0 = new jh0
            r2 = 500(0x1f4, float:7.0E-43)
            gh0 r3 = new gh0
            r3.<init>(r1, r1)
            r0.<init>(r2, r3)
            ih0 r1 = r4.a
            io.reactivex.s r0 = r1.d(r0)
            kotlin.reflect.g r1 = com.spotify.music.podcast.freetierlikes.tabs.YourEpisodesCountDataSourceImpl$observeYourEpisodesCount$1.a
            if (r1 == 0) goto L_0x0025
            com.spotify.music.podcast.freetierlikes.tabs.n r2 = new com.spotify.music.podcast.freetierlikes.tabs.n
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            io.reactivex.functions.l r1 = (io.reactivex.functions.l) r1
            io.reactivex.s r0 = r0.j0(r1)
            com.spotify.music.podcast.freetierlikes.tabs.m$a r1 = com.spotify.music.podcast.freetierlikes.tabs.m.a.a
            io.reactivex.s r0 = r0.r0(r1)
            io.reactivex.s r0 = r0.E()
            java.lang.String r1 = "listenLaterEndpoint\n    …  .distinctUntilChanged()"
            kotlin.jvm.internal.h.d(r0, r1)
            goto L_0x0048
        L_0x003b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            io.reactivex.s r0 = io.reactivex.s.i0(r0)
            java.lang.String r1 = "Observable.just(0)"
            kotlin.jvm.internal.h.d(r0, r1)
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.podcast.freetierlikes.tabs.m.a():io.reactivex.s");
    }
}
