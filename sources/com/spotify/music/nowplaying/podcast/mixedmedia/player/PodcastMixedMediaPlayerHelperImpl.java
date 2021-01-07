package com.spotify.music.nowplaying.podcast.mixedmedia.player;

import com.google.common.base.Optional;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.i;
import com.spotify.player.model.PlayerState;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.g;
import io.reactivex.internal.operators.maybe.MaybeFlatMapSingle;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class PodcastMixedMediaPlayerHelperImpl implements a {
    private final g<PlayerState> a;
    private final com.spotify.player.controls.d b;
    private final i c;

    /* access modifiers changed from: private */
    public static final class a {
        private final String a;
        private final boolean b;
        private final boolean c;

        public a(String str, boolean z, boolean z2) {
            h.e(str, "currentEpisodeUri");
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public final boolean a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.b;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (hashCode + i2) * 31;
            boolean z2 = this.c;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            return i5 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("LocalPlayerState(currentEpisodeUri=");
            V0.append(this.a);
            V0.append(", isActuallyPlaying=");
            V0.append(this.b);
            V0.append(", isCurrentEpisodeActuallyPlaying=");
            return je.P0(V0, this.c, ")");
        }
    }

    static final class b<T> implements n<Optional<a>> {
        public static final b a = new b();

        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(Optional<a> optional) {
            Optional<a> optional2 = optional;
            h.e(optional2, "it");
            return optional2.isPresent();
        }
    }

    static final class c<T, R> implements l<Optional<a>, a> {
        public static final c a = new c();

        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public a apply(Optional<a> optional) {
            Optional<a> optional2 = optional;
            h.e(optional2, "it");
            return optional2.get();
        }
    }

    static final class d<T, R> implements l<a, d0<? extends zwd>> {
        final /* synthetic */ PodcastMixedMediaPlayerHelperImpl a;
        final /* synthetic */ long b;

        d(PodcastMixedMediaPlayerHelperImpl podcastMixedMediaPlayerHelperImpl, long j) {
            this.a = podcastMixedMediaPlayerHelperImpl;
            this.b = j;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends zwd> apply(a aVar) {
            a aVar2 = aVar;
            h.e(aVar2, "localPlayerState");
            return PodcastMixedMediaPlayerHelperImpl.d(this.a, aVar2, this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements io.reactivex.functions.g<io.reactivex.disposables.b> {
        final /* synthetic */ i a;
        final /* synthetic */ long b;

        e(i iVar, PodcastMixedMediaPlayerHelperImpl podcastMixedMediaPlayerHelperImpl, long j) {
            this.a = iVar;
            this.b = j;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(io.reactivex.disposables.b bVar) {
            this.a.i(Long.valueOf(this.b));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements io.reactivex.functions.a {
        final /* synthetic */ i a;

        f(i iVar) {
            this.a = iVar;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            this.a.i(null);
        }
    }

    public PodcastMixedMediaPlayerHelperImpl(g<PlayerState> gVar, com.spotify.player.controls.d dVar, i iVar) {
        h.e(gVar, "playerStateFlowable");
        h.e(dVar, "playerControls");
        h.e(iVar, "positionState");
        this.a = gVar;
        this.b = dVar;
        this.c = iVar;
    }

    public static final z d(PodcastMixedMediaPlayerHelperImpl podcastMixedMediaPlayerHelperImpl, a aVar, long j) {
        podcastMixedMediaPlayerHelperImpl.getClass();
        if (aVar.a()) {
            return podcastMixedMediaPlayerHelperImpl.e(j);
        }
        z<R> s = podcastMixedMediaPlayerHelperImpl.e(j).s(new b(podcastMixedMediaPlayerHelperImpl));
        h.d(s, "seekTo(seekTime).flatMap…          }\n            }");
        return s;
    }

    private final z<zwd> e(long j) {
        i iVar = this.c;
        z<zwd> l = this.b.a(com.spotify.player.controls.c.g(j)).o(new e(iVar, this, j)).l(new f(iVar));
        h.d(l, "with(positionState) {\n  …sition = null }\n        }");
        return l;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.player.a
    public z<zwd> a() {
        z<zwd> a2 = this.b.a(com.spotify.player.controls.c.c());
        h.d(a2, "playerControls\n        .…erControlCommand.pause())");
        return a2;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.player.a
    public z<zwd> b() {
        z<zwd> a2 = this.b.a(com.spotify.player.controls.c.e());
        h.d(a2, "playerControls\n        .…rControlCommand.resume())");
        return a2;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.player.a
    public z<zwd> c(com.spotify.music.nowplaying.podcast.mixedmedia.model.a aVar, long j) {
        h.e(aVar, "episodeUri");
        MaybeFlatMapSingle maybeFlatMapSingle = new MaybeFlatMapSingle(this.a.E().A(new c(new PodcastMixedMediaPlayerHelperImpl$playOrSeekTo$1(this))).r(b.a).l(c.a), new d(this, j));
        h.d(maybeFlatMapSingle, "playerStateFlowable\n    …e\n            )\n        }");
        return maybeFlatMapSingle;
    }
}
