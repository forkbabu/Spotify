package com.spotify.music.nowplaying.podcast.mixedmedia.segments;

import com.spotify.music.nowplaying.podcast.mixedmedia.model.a;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.g;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class c extends g<com.spotify.music.nowplaying.podcast.mixedmedia.model.c> {
    private final g<com.spotify.music.nowplaying.podcast.mixedmedia.model.c> c;
    private final com.spotify.music.nowplaying.podcast.mixedmedia.api.a f;

    static final class a<T, R> implements l<PlayerState, String> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public String apply(PlayerState playerState) {
            PlayerState playerState2 = playerState;
            h.e(playerState2, "it");
            return iyb.c(playerState2);
        }
    }

    static final class b<T> implements n<String> {
        public static final b a = new b();

        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(String str) {
            String str2 = str;
            h.e(str2, "it");
            return !e.n(str2);
        }
    }

    /* renamed from: com.spotify.music.nowplaying.podcast.mixedmedia.segments.c$c  reason: collision with other inner class name */
    static final class C0314c<T, R> implements l<String, com.spotify.music.nowplaying.podcast.mixedmedia.model.a> {
        public static final C0314c a = new C0314c();

        C0314c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public com.spotify.music.nowplaying.podcast.mixedmedia.model.a apply(String str) {
            String str2 = str;
            h.e(str2, "entityUri");
            com.spotify.music.nowplaying.podcast.mixedmedia.model.a b = a.C0313a.b(com.spotify.music.nowplaying.podcast.mixedmedia.model.a.b, str2, null, 2);
            IllegalStateException illegalStateException = new IllegalStateException("Could not create PodcastSegmentsUri from " + str2 + " - the NPV mode should only be enabled for mixed media episodes");
            h.e(illegalStateException, "ex");
            if (b != null) {
                return b;
            }
            throw illegalStateException;
        }
    }

    static final class d<T, R> implements l<com.spotify.music.nowplaying.podcast.mixedmedia.model.a, tpf<? extends com.spotify.music.nowplaying.podcast.mixedmedia.model.c>> {
        final /* synthetic */ c a;

        d(c cVar) {
            this.a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public tpf<? extends com.spotify.music.nowplaying.podcast.mixedmedia.model.c> apply(com.spotify.music.nowplaying.podcast.mixedmedia.model.a aVar) {
            com.spotify.music.nowplaying.podcast.mixedmedia.model.a aVar2 = aVar;
            h.e(aVar2, "validUri");
            return this.a.f.a(aVar2).N();
        }
    }

    public c(g<PlayerState> gVar, com.spotify.music.nowplaying.podcast.mixedmedia.api.a aVar) {
        h.e(gVar, "playerStateFlowable");
        h.e(aVar, "podcastSegmentsRepository");
        this.f = aVar;
        g<R> Z = gVar.O(a.a).C(b.a).s().O(C0314c.a).F(new d(this)).Z();
        h.c(Z);
        this.c = Z;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.g
    public void d0(upf<? super com.spotify.music.nowplaying.podcast.mixedmedia.model.c> upf) {
        this.c.subscribe(upf);
    }
}
