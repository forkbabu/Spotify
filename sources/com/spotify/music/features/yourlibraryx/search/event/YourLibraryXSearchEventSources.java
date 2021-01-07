package com.spotify.music.features.yourlibraryx.search.event;

import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import io.reactivex.g;
import java.util.List;
import kotlin.jvm.internal.h;

public final class YourLibraryXSearchEventSources {
    private final com.spotify.music.features.yourlibraryx.event.b a;
    private final g<PlayerState> b;
    private final com.spotify.music.features.yourlibraryx.recentsearch.a c;

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

    /* access modifiers changed from: package-private */
    public static final class b<T, R> implements l<List<? extends String>, YourLibraryXEvent> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public YourLibraryXEvent apply(List<? extends String> list) {
            List<? extends String> list2 = list;
            h.e(list2, "it");
            return new YourLibraryXEvent.t(list2);
        }
    }

    public YourLibraryXSearchEventSources(com.spotify.music.features.yourlibraryx.event.b bVar, g<PlayerState> gVar, com.spotify.music.features.yourlibraryx.recentsearch.a aVar) {
        h.e(bVar, "eventSubject");
        h.e(gVar, "playerState");
        h.e(aVar, "recentSearches");
        this.a = bVar;
        this.b = gVar;
        this.c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.spotify.music.features.yourlibraryx.search.event.a] */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x002e: APUT  
      (r0v1 io.reactivex.v[])
      (1 ??[boolean, int, float, short, byte, char])
      (wrap: io.reactivex.s : 0x0029: INVOKE  (r1v5 io.reactivex.s) = 
      (r1v4 io.reactivex.s)
      (wrap: io.reactivex.functions.l : 0x0027: CHECK_CAST (r2v5 io.reactivex.functions.l) = (io.reactivex.functions.l) (r2v4 com.spotify.music.features.yourlibraryx.search.event.YourLibraryXSearchEventSources$eventSource$2))
     type: VIRTUAL call: io.reactivex.s.j0(io.reactivex.functions.l):io.reactivex.s)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.spotify.mobius.q<com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent> a() {
        /*
            r4 = this;
            r0 = 3
            io.reactivex.v[] r0 = new io.reactivex.v[r0]
            com.spotify.music.features.yourlibraryx.event.b r1 = r4.a
            io.reactivex.s r1 = com.spotify.mobius.rx2.i.g(r1)
            r2 = 0
            r0[r2] = r1
            io.reactivex.g<com.spotify.player.model.PlayerState> r1 = r4.b
            com.spotify.music.features.yourlibraryx.search.event.YourLibraryXSearchEventSources$a r2 = com.spotify.music.features.yourlibraryx.search.event.YourLibraryXSearchEventSources.a.a
            io.reactivex.g r1 = r1.O(r2)
            io.reactivex.internal.operators.observable.v r2 = new io.reactivex.internal.operators.observable.v
            r2.<init>(r1)
            io.reactivex.s r1 = r2.E()
            com.spotify.music.features.yourlibraryx.search.event.YourLibraryXSearchEventSources$eventSource$2 r2 = com.spotify.music.features.yourlibraryx.search.event.YourLibraryXSearchEventSources$eventSource$2.a
            if (r2 == 0) goto L_0x0027
            com.spotify.music.features.yourlibraryx.search.event.a r3 = new com.spotify.music.features.yourlibraryx.search.event.a
            r3.<init>(r2)
            r2 = r3
        L_0x0027:
            io.reactivex.functions.l r2 = (io.reactivex.functions.l) r2
            io.reactivex.s r1 = r1.j0(r2)
            r2 = 1
            r0[r2] = r1
            r1 = 2
            com.spotify.music.features.yourlibraryx.recentsearch.a r2 = r4.c
            io.reactivex.s r2 = r2.c()
            com.spotify.music.features.yourlibraryx.search.event.YourLibraryXSearchEventSources$b r3 = com.spotify.music.features.yourlibraryx.search.event.YourLibraryXSearchEventSources.b.a
            io.reactivex.s r2 = r2.j0(r3)
            r0[r1] = r2
            com.spotify.mobius.q r0 = com.spotify.mobius.rx2.i.a(r0)
            java.lang.String r1 = "RxEventSources.fromObser…sUpdated(it) },\n        )"
            kotlin.jvm.internal.h.d(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.yourlibraryx.search.event.YourLibraryXSearchEventSources.a():com.spotify.mobius.q");
    }
}
