package com.spotify.music.podcast.player.trailer.impl;

import com.google.common.base.Optional;
import com.spotify.music.podcast.player.trailer.impl.i;
import com.spotify.music.podcast.player.trailer.impl.j;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

public final class PlayerApiPodcastTrailerPlayer implements snc {
    private final io.reactivex.disposables.a a = new io.reactivex.disposables.a();
    private final io.reactivex.subjects.a<tnc> b;
    private ContextTrack c;
    private final io.reactivex.g<PlayerState> d;
    private final i e;
    private final cqe f;
    private final String g;
    private final k h;

    private static abstract class a {

        /* renamed from: com.spotify.music.podcast.player.trailer.impl.PlayerApiPodcastTrailerPlayer$a$a  reason: collision with other inner class name */
        public static final class C0328a extends a {
            private final PlayerState a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0328a(PlayerState playerState) {
                super(null);
                kotlin.jvm.internal.h.e(playerState, "playerState");
                this.a = playerState;
            }

            public final PlayerState a() {
                return this.a;
            }
        }

        public static final class b extends a {
            private final Context a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Context context) {
                super(null);
                kotlin.jvm.internal.h.e(context, "playerContext");
                this.a = context;
            }

            public final Context a() {
                return this.a;
            }
        }

        private a() {
        }

        public a(kotlin.jvm.internal.f fVar) {
        }
    }

    /* access modifiers changed from: private */
    public static final class b {
        private final i.a a;
        private final j b;

        public b(i.a aVar, j jVar) {
            kotlin.jvm.internal.h.e(aVar, "composerResult");
            kotlin.jvm.internal.h.e(jVar, "playerAction");
            this.a = aVar;
            this.b = jVar;
        }

        public final i.a a() {
            return this.a;
        }

        public final j b() {
            return this.b;
        }
    }

    static final class c<T1, T2> implements io.reactivex.functions.d<tnc, tnc> {
        public static final c a = new c();

        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.d
        public boolean a(tnc tnc, tnc tnc2) {
            tnc tnc3 = tnc;
            tnc tnc4 = tnc2;
            kotlin.jvm.internal.h.e(tnc3, "state");
            kotlin.jvm.internal.h.e(tnc4, "otherState");
            return tnc3.a() == tnc4.a() && tnc3.b() == tnc4.b();
        }
    }

    static final class d<T, R> implements l<PlayerState, tnc> {
        final /* synthetic */ PlayerApiPodcastTrailerPlayer a;

        d(PlayerApiPodcastTrailerPlayer playerApiPodcastTrailerPlayer) {
            this.a = playerApiPodcastTrailerPlayer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public tnc apply(PlayerState playerState) {
            PlayerState playerState2 = playerState;
            kotlin.jvm.internal.h.e(playerState2, "playerState");
            return PlayerApiPodcastTrailerPlayer.h(this.a, playerState2);
        }
    }

    static final class e<T, R> implements l<PlayerState, a> {
        final /* synthetic */ PlayerApiPodcastTrailerPlayer a;
        final /* synthetic */ ContextTrack b;

        e(PlayerApiPodcastTrailerPlayer playerApiPodcastTrailerPlayer, ContextTrack contextTrack) {
            this.a = playerApiPodcastTrailerPlayer;
            this.b = contextTrack;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public a apply(PlayerState playerState) {
            PlayerState playerState2 = playerState;
            kotlin.jvm.internal.h.e(playerState2, "playerState");
            return PlayerApiPodcastTrailerPlayer.d(this.a, playerState2, this.b);
        }
    }

    static final class f<T, R> implements l<a, j> {
        final /* synthetic */ PlayerApiPodcastTrailerPlayer a;
        final /* synthetic */ ContextTrack b;

        f(PlayerApiPodcastTrailerPlayer playerApiPodcastTrailerPlayer, ContextTrack contextTrack) {
            this.a = playerApiPodcastTrailerPlayer;
            this.b = contextTrack;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public j apply(a aVar) {
            a aVar2 = aVar;
            kotlin.jvm.internal.h.e(aVar2, "currentPlayback");
            PlayerApiPodcastTrailerPlayer playerApiPodcastTrailerPlayer = this.a;
            ContextTrack contextTrack = this.b;
            playerApiPodcastTrailerPlayer.getClass();
            if (aVar2 instanceof a.b) {
                String uri = contextTrack.uri();
                kotlin.jvm.internal.h.d(uri, "trailerTrack.uri()");
                return new j.b(uri, ((a.b) aVar2).a());
            } else if (aVar2 instanceof a.C0328a) {
                PlayerState a2 = ((a.C0328a) aVar2).a();
                Optional<ContextTrack> track = a2.track();
                kotlin.jvm.internal.h.d(track, "track()");
                String uri2 = contextTrack.uri();
                kotlin.jvm.internal.h.d(uri2, "trailerTrack.uri()");
                ContextTrack orNull = track.orNull();
                String str = null;
                if (kotlin.jvm.internal.h.a(uri2, orNull != null ? orNull.uri() : null)) {
                    String uri3 = contextTrack.uri();
                    kotlin.jvm.internal.h.d(uri3, "trailerTrack.uri()");
                    return new j.d(uri3);
                }
                String uri4 = contextTrack.uri();
                ContextTrack contextTrack2 = a2.nextTracks().size() > 0 ? a2.nextTracks().get(0) : null;
                if (contextTrack2 != null) {
                    str = contextTrack2.uri();
                }
                if (!kotlin.jvm.internal.h.a(uri4, str)) {
                    return new j.c(contextTrack);
                }
                String uri5 = contextTrack.uri();
                kotlin.jvm.internal.h.d(uri5, "trailerTrack.uri()");
                return new j.e(uri5);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    static final class g<T, R> implements l<j, d0<? extends b>> {
        final /* synthetic */ PlayerApiPodcastTrailerPlayer a;

        g(PlayerApiPodcastTrailerPlayer playerApiPodcastTrailerPlayer) {
            this.a = playerApiPodcastTrailerPlayer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends b> apply(j jVar) {
            j jVar2 = jVar;
            kotlin.jvm.internal.h.e(jVar2, "playerAction");
            return PlayerApiPodcastTrailerPlayer.e(this.a, jVar2);
        }
    }

    static final class h<T, R> implements l<b, j> {
        final /* synthetic */ PlayerApiPodcastTrailerPlayer a;

        h(PlayerApiPodcastTrailerPlayer playerApiPodcastTrailerPlayer) {
            this.a = playerApiPodcastTrailerPlayer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public j apply(b bVar) {
            b bVar2 = bVar;
            kotlin.jvm.internal.h.e(bVar2, "queueCompositionResult");
            this.a.getClass();
            if (bVar2.a() instanceof i.a.C0329a) {
                return new j.a("Failure when modifying the queue.");
            }
            return bVar2.b();
        }
    }

    static final class i<T> implements io.reactivex.functions.g<j> {
        final /* synthetic */ PlayerApiPodcastTrailerPlayer a;

        i(PlayerApiPodcastTrailerPlayer playerApiPodcastTrailerPlayer) {
            this.a = playerApiPodcastTrailerPlayer;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(j jVar) {
            j jVar2 = jVar;
            PlayerApiPodcastTrailerPlayer playerApiPodcastTrailerPlayer = this.a;
            kotlin.jvm.internal.h.d(jVar2, "action");
            PlayerApiPodcastTrailerPlayer.g(playerApiPodcastTrailerPlayer, jVar2);
        }
    }

    public PlayerApiPodcastTrailerPlayer(io.reactivex.g<PlayerState> gVar, i iVar, cqe cqe, String str, k kVar) {
        kotlin.jvm.internal.h.e(gVar, "playerStateSource");
        kotlin.jvm.internal.h.e(iVar, "queueComposer");
        kotlin.jvm.internal.h.e(cqe, "clock");
        kotlin.jvm.internal.h.e(str, "showUri");
        kotlin.jvm.internal.h.e(kVar, "trailerPlayerActionPerformer");
        this.d = gVar;
        this.e = iVar;
        this.f = cqe;
        this.g = str;
        this.h = kVar;
        io.reactivex.subjects.a<tnc> i1 = io.reactivex.subjects.a.i1(tnc.d);
        kotlin.jvm.internal.h.d(i1, "BehaviorSubject.createDe…ailerPlayerState.STOPPED)");
        this.b = i1;
    }

    public static final a d(PlayerApiPodcastTrailerPlayer playerApiPodcastTrailerPlayer, PlayerState playerState, ContextTrack contextTrack) {
        playerApiPodcastTrailerPlayer.getClass();
        if (playerState.isPlaying()) {
            String contextUri = playerState.contextUri();
            kotlin.jvm.internal.h.d(contextUri, "contextUri()");
            if (!(contextUri.length() == 0)) {
                return new a.C0328a(playerState);
            }
        }
        Context build = Context.builder(playerApiPodcastTrailerPlayer.g).pages(kotlin.collections.d.t(ContextPage.builder().tracks(kotlin.collections.d.t(contextTrack)).build())).build();
        kotlin.jvm.internal.h.d(build, "Context\n                …                 .build()");
        return new a.b(build);
    }

    public static final z e(PlayerApiPodcastTrailerPlayer playerApiPodcastTrailerPlayer, j jVar) {
        playerApiPodcastTrailerPlayer.getClass();
        if (jVar instanceof j.c) {
            z R = z.R(playerApiPodcastTrailerPlayer.e.a(((j.c) jVar).a()), z.z(jVar), a.a);
            kotlin.jvm.internal.h.d(R, "Single.zip(\n            …item) }\n                )");
            return R;
        }
        z z = z.z(new b(i.a.b.a, jVar));
        kotlin.jvm.internal.h.d(z, "Single.just(\n           …      )\n                )");
        return z;
    }

    public static final void f(PlayerApiPodcastTrailerPlayer playerApiPodcastTrailerPlayer, tnc tnc) {
        playerApiPodcastTrailerPlayer.getClass();
        if (!kotlin.jvm.internal.h.a(tnc, tnc.e)) {
            playerApiPodcastTrailerPlayer.b.onNext(tnc);
        }
    }

    public static final void g(PlayerApiPodcastTrailerPlayer playerApiPodcastTrailerPlayer, j jVar) {
        playerApiPodcastTrailerPlayer.a.b(playerApiPodcastTrailerPlayer.h.a(jVar).subscribe());
    }

    public static final tnc h(PlayerApiPodcastTrailerPlayer playerApiPodcastTrailerPlayer, PlayerState playerState) {
        tnc tnc = tnc.e;
        ContextTrack contextTrack = playerApiPodcastTrailerPlayer.c;
        if (contextTrack == null) {
            return tnc;
        }
        String uri = contextTrack.uri();
        kotlin.jvm.internal.h.d(uri, "currentTrailer.uri()");
        boolean z = true;
        if (!kotlin.jvm.internal.h.a(playerState, PlayerState.EMPTY)) {
            Optional<ContextTrack> track = playerState.track();
            kotlin.jvm.internal.h.d(track, "track()");
            if (track.isPresent() && !(!kotlin.jvm.internal.h.a(uri, playerState.track().get().uri())) && playerState.isPlaying() && !playerState.isPaused()) {
                z = false;
            }
        }
        if (z) {
            return tnc.d;
        }
        Long orNull = playerState.duration().orNull();
        if (orNull == null) {
            return tnc;
        }
        kotlin.jvm.internal.h.d(orNull, "duration().orNull()\n    …tTrailerPlayerState.EMPTY");
        long longValue = orNull.longValue();
        Long orNull2 = playerState.positionAsOfTimestamp().orNull();
        if (orNull2 == null) {
            return tnc;
        }
        kotlin.jvm.internal.h.d(orNull2, "positionAsOfTimestamp().…tTrailerPlayerState.EMPTY");
        return new tnc(longValue, orNull2.longValue(), playerApiPodcastTrailerPlayer.f.a());
    }

    @Override // defpackage.snc
    public void a() {
        ContextTrack contextTrack = this.c;
        if (contextTrack != null) {
            this.a.b(this.d.D(PlayerState.EMPTY).A(new e(this, contextTrack)).A(new f(this, contextTrack)).s(new g(this)).A(new h(this)).subscribe(new i(this)));
        }
    }

    @Override // defpackage.snc
    public void b(vnc vnc) {
        kotlin.jvm.internal.h.e(vnc, "model");
        ContextTrack contextTrack = this.c;
        if (contextTrack == null || !kotlin.jvm.internal.h.a(vnc.a(), contextTrack.uri())) {
            this.c = ContextTrack.builder(vnc.a()).metadata(kotlin.collections.d.y(new Pair("media.start_position", String.valueOf(0)), new Pair("type", "1"))).build();
        }
    }

    @Override // defpackage.snc
    public s<tnc> c() {
        s<tnc> F = this.b.F(c.a);
        kotlin.jvm.internal.h.d(F, "trailerPlayerStateSubjec…te.position\n            }");
        return F;
    }

    @Override // defpackage.snc
    public void onStart() {
        this.a.b(this.d.s().O(new d(this)).subscribe(new b(new PlayerApiPodcastTrailerPlayer$onStart$2(this))));
    }

    @Override // defpackage.snc
    public void onStop() {
        this.a.f();
    }
}
