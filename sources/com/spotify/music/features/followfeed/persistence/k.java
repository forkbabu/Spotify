package com.spotify.music.features.followfeed.persistence;

import com.google.common.base.Optional;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class k {
    private final f a;
    private final f35 b;
    private final y c;
    private final y d;

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements l<Optional<Boolean>, v<? extends Boolean>> {
        final /* synthetic */ k a;

        a(k kVar) {
            this.a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends Boolean> apply(Optional<Boolean> optional) {
            Optional<Boolean> optional2 = optional;
            h.e(optional2, "cachedState");
            if (optional2.isPresent()) {
                return s.i0(optional2.get());
            }
            return this.a.a.a().v(new j(this));
        }
    }

    public k(f fVar, f35 f35, y yVar, y yVar2) {
        h.e(fVar, "newItemsStateCache");
        h.e(f35, "followFeedEndpoint");
        h.e(yVar, "ioScheduler");
        h.e(yVar2, "mainScheduler");
        this.a = fVar;
        this.b = f35;
        this.c = yVar;
        this.d = yVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.spotify.music.features.followfeed.persistence.l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final io.reactivex.s a(com.spotify.music.features.followfeed.persistence.k r4, java.lang.String r5) {
        /*
            f35 r0 = r4.b
            io.reactivex.z r5 = r0.b(r5)
            io.reactivex.y r0 = r4.c
            io.reactivex.z r5 = r5.H(r0)
            kotlin.reflect.g r0 = com.spotify.music.features.followfeed.persistence.FollowFeedNewItemsStateRepository$fetchAndCacheResult$1.a
            if (r0 == 0) goto L_0x0016
            com.spotify.music.features.followfeed.persistence.l r1 = new com.spotify.music.features.followfeed.persistence.l
            r1.<init>(r0)
            r0 = r1
        L_0x0016:
            io.reactivex.functions.l r0 = (io.reactivex.functions.l) r0
            io.reactivex.z r5 = r5.A(r0)
            r0 = 30
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            io.reactivex.y r3 = r4.c
            io.reactivex.z r5 = r5.J(r0, r2, r3)
            com.spotify.music.features.followfeed.persistence.h r0 = com.spotify.music.features.followfeed.persistence.h.a
            io.reactivex.z r5 = r5.D(r0)
            io.reactivex.y r0 = r4.d
            io.reactivex.z r5 = r5.B(r0)
            com.spotify.music.features.followfeed.persistence.i r0 = new com.spotify.music.features.followfeed.persistence.i
            r0.<init>(r4)
            io.reactivex.s r4 = r5.v(r0)
            java.lang.String r5 = "followFeedEndpoint\n     …sNewItems))\n            }"
            kotlin.jvm.internal.h.d(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.followfeed.persistence.k.a(com.spotify.music.features.followfeed.persistence.k, java.lang.String):io.reactivex.s");
    }

    public final s<Boolean> c() {
        s<R> v = this.a.b().v(new a(this));
        h.d(v, "newItemsStateCache\n     …          }\n            }");
        return v;
    }
}
