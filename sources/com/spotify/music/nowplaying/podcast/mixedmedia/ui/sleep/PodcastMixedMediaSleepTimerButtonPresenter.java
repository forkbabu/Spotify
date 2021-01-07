package com.spotify.music.nowplaying.podcast.mixedmedia.ui.sleep;

import com.spotify.music.nowplaying.podcast.sleeptimer.g;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.s;
import io.reactivex.y;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class PodcastMixedMediaSleepTimerButtonPresenter implements g.a {
    private final q a = new q();
    private final s<Boolean> b;
    private g c;
    private String d;
    private final io.reactivex.g<String> e;
    private final com.spotify.music.nowplaying.podcast.sleeptimer.d f;
    private final c2c g;
    private final p0c h;

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

    static final class c<T, R> implements l<String, String> {
        final /* synthetic */ PodcastMixedMediaSleepTimerButtonPresenter a;

        c(PodcastMixedMediaSleepTimerButtonPresenter podcastMixedMediaSleepTimerButtonPresenter) {
            this.a = podcastMixedMediaSleepTimerButtonPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public String apply(String str) {
            String str2 = str;
            h.e(str2, "it");
            if (((Boolean) this.a.h.invoke(str2)).booleanValue()) {
                return str2;
            }
            throw new IllegalStateException("Could not create PodcastSegmentsUri from " + str2 + " - the NPV mode should only be enabled for mixed media episodes");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements io.reactivex.functions.g<String> {
        final /* synthetic */ PodcastMixedMediaSleepTimerButtonPresenter a;

        d(PodcastMixedMediaSleepTimerButtonPresenter podcastMixedMediaSleepTimerButtonPresenter) {
            this.a = podcastMixedMediaSleepTimerButtonPresenter;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(String str) {
            this.a.d = str.toString();
        }
    }

    public PodcastMixedMediaSleepTimerButtonPresenter(io.reactivex.g<PlayerState> gVar, com.spotify.music.sleeptimer.n nVar, com.spotify.music.nowplaying.podcast.sleeptimer.d dVar, c2c c2c, y yVar, p0c p0c) {
        h.e(gVar, "playerStateFlowable");
        h.e(nVar, "sleepTimerController");
        h.e(dVar, "logger");
        h.e(c2c, "navigator");
        h.e(yVar, "mainScheduler");
        h.e(p0c, "episodeUriValidator");
        this.f = dVar;
        this.g = c2c;
        this.h = p0c;
        this.b = nVar.f().o0(yVar);
        io.reactivex.g<R> O = gVar.O(a.a).C(b.a).s().O(new c(this));
        h.d(O, "playerStateFlowable\n    …)\n            }\n        }");
        this.e = O;
    }

    @Override // com.spotify.music.nowplaying.podcast.sleeptimer.g.a
    public void a() {
        String str = this.d;
        if (str != null) {
            this.f.f(str);
            this.g.a(str);
        }
    }

    public final void d(g gVar) {
        h.e(gVar, "sleepTimerButtonViewBinder");
        this.c = gVar;
        gVar.setListener(this);
        s<Boolean> sVar = this.b;
        g gVar2 = this.c;
        if (gVar2 != null) {
            this.a.a(sVar.subscribe(new a(new PodcastMixedMediaSleepTimerButtonPresenter$onViewAvailable$1(gVar2))));
            this.a.a(this.e.subscribe(new d(this)));
            return;
        }
        h.k("viewBinder");
        throw null;
    }

    public final void e() {
        g gVar = this.c;
        if (gVar != null) {
            gVar.setListener(null);
            this.a.c();
            return;
        }
        h.k("viewBinder");
        throw null;
    }
}
