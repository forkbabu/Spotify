package com.spotify.music.features.yourlibraryx.event;

import com.spotify.music.features.yourlibraryx.dataloading.YourLibraryProfileDataLoader;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class YourLibraryXEventSources {
    private final b a;
    private final s<Boolean> b;
    private final g<PlayerState> c;
    private final YourLibraryProfileDataLoader d;

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements l<PlayerState, String> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public String apply(PlayerState playerState) {
            PlayerState playerState2 = playerState;
            h.e(playerState2, "it");
            return playerState2.contextUri();
        }
    }

    public YourLibraryXEventSources(b bVar, s<Boolean> sVar, g<PlayerState> gVar, YourLibraryProfileDataLoader yourLibraryProfileDataLoader) {
        h.e(bVar, "eventSubject");
        h.e(sVar, "onDemandEnabled");
        h.e(gVar, "playerState");
        h.e(yourLibraryProfileDataLoader, "profileDataLoader");
        this.a = bVar;
        this.b = sVar;
        this.c = gVar;
        this.d = yourLibraryProfileDataLoader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.spotify.music.features.yourlibraryx.event.a] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.spotify.music.features.yourlibraryx.event.a] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.spotify.music.features.yourlibraryx.event.a] */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x001f: APUT  
      (r0v1 io.reactivex.v[])
      (1 ??[boolean, int, float, short, byte, char])
      (wrap: io.reactivex.s<R> : 0x001a: INVOKE  (r1v3 io.reactivex.s<R>) = 
      (r1v2 io.reactivex.s<java.lang.Boolean>)
      (wrap: io.reactivex.functions.l<? super java.lang.Boolean, ? extends R> : 0x0018: CHECK_CAST (r2v3 io.reactivex.functions.l<? super java.lang.Boolean, ? extends R>) = (io.reactivex.functions.l) (r2v2 com.spotify.music.features.yourlibraryx.event.YourLibraryXEventSources$eventSource$1))
     type: VIRTUAL call: io.reactivex.s.j0(io.reactivex.functions.l):io.reactivex.s)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobius.q<com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent> a() {
        /*
            r5 = this;
            r0 = 4
            io.reactivex.v[] r0 = new io.reactivex.v[r0]
            com.spotify.music.features.yourlibraryx.event.b r1 = r5.a
            io.reactivex.s r1 = com.spotify.mobius.rx2.i.g(r1)
            r2 = 0
            r0[r2] = r1
            io.reactivex.s<java.lang.Boolean> r1 = r5.b
            com.spotify.music.features.yourlibraryx.event.YourLibraryXEventSources$eventSource$1 r2 = com.spotify.music.features.yourlibraryx.event.YourLibraryXEventSources$eventSource$1.a
            if (r2 == 0) goto L_0x0018
            com.spotify.music.features.yourlibraryx.event.a r3 = new com.spotify.music.features.yourlibraryx.event.a
            r3.<init>(r2)
            r2 = r3
        L_0x0018:
            io.reactivex.functions.l r2 = (io.reactivex.functions.l) r2
            io.reactivex.s r1 = r1.j0(r2)
            r2 = 1
            r0[r2] = r1
            r1 = 2
            io.reactivex.g<com.spotify.player.model.PlayerState> r2 = r5.c
            com.spotify.music.features.yourlibraryx.event.YourLibraryXEventSources$a r3 = com.spotify.music.features.yourlibraryx.event.YourLibraryXEventSources.a.a
            io.reactivex.g r2 = r2.O(r3)
            io.reactivex.internal.operators.observable.v r3 = new io.reactivex.internal.operators.observable.v
            r3.<init>(r2)
            io.reactivex.s r2 = r3.E()
            com.spotify.music.features.yourlibraryx.event.YourLibraryXEventSources$eventSource$3 r3 = com.spotify.music.features.yourlibraryx.event.YourLibraryXEventSources$eventSource$3.a
            if (r3 == 0) goto L_0x003d
            com.spotify.music.features.yourlibraryx.event.a r4 = new com.spotify.music.features.yourlibraryx.event.a
            r4.<init>(r3)
            r3 = r4
        L_0x003d:
            io.reactivex.functions.l r3 = (io.reactivex.functions.l) r3
            io.reactivex.s r2 = r2.j0(r3)
            r0[r1] = r2
            r1 = 3
            com.spotify.music.features.yourlibraryx.dataloading.YourLibraryProfileDataLoader r2 = r5.d
            io.reactivex.g r2 = r2.c()
            r2.getClass()
            io.reactivex.internal.operators.observable.v r3 = new io.reactivex.internal.operators.observable.v
            r3.<init>(r2)
            com.spotify.music.features.yourlibraryx.event.YourLibraryXEventSources$eventSource$4 r2 = com.spotify.music.features.yourlibraryx.event.YourLibraryXEventSources$eventSource$4.a
            if (r2 == 0) goto L_0x005e
            com.spotify.music.features.yourlibraryx.event.a r4 = new com.spotify.music.features.yourlibraryx.event.a
            r4.<init>(r2)
            r2 = r4
        L_0x005e:
            io.reactivex.functions.l r2 = (io.reactivex.functions.l) r2
            io.reactivex.s r2 = r3.j0(r2)
            r0[r1] = r2
            com.spotify.mobius.q r0 = com.spotify.mobius.rx2.i.a(r0)
            java.lang.String r1 = "RxEventSources.fromObser…ileDataUpdated)\n        )"
            kotlin.jvm.internal.h.d(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.yourlibraryx.event.YourLibraryXEventSources.a():com.spotify.mobius.q");
    }
}
