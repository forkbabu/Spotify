package com.spotify.player.extras.transformers;

import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.k;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

public final class PlayerStateTransformers {

    static final class a<Upstream, Downstream> implements k<PlayerState, Optional<String>> {
        public static final a a = new a();

        /* renamed from: com.spotify.player.extras.transformers.PlayerStateTransformers$a$a  reason: collision with other inner class name */
        static final class C0366a<T, R> implements l<Optional<ContextTrack>, Optional<String>> {
            public static final C0366a a = new C0366a();

            C0366a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.l
            public Optional<String> apply(Optional<ContextTrack> optional) {
                Optional<ContextTrack> optional2 = optional;
                h.e(optional2, "it");
                ContextTrack orNull = optional2.orNull();
                return Optional.fromNullable(orNull != null ? orNull.uri() : null);
            }
        }

        a() {
        }

        @Override // io.reactivex.k
        public final tpf<Optional<String>> a(g<PlayerState> gVar) {
            h.e(gVar, "playerState");
            return gVar.l(PlayerStateTransformers$currentTrack$1.a).O(C0366a.a).s();
        }
    }

    static final class b<Upstream, Downstream> implements k<PlayerState, Boolean> {
        public static final b a = new b();

        static final class a<T, R> implements l<PlayerState, Boolean> {
            public static final a a = new a();

            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.l
            public Boolean apply(PlayerState playerState) {
                PlayerState playerState2 = playerState;
                h.e(playerState2, "it");
                return Boolean.valueOf(playerState2.isPlaying() && !playerState2.isPaused());
            }
        }

        b() {
        }

        @Override // io.reactivex.k
        public final tpf<Boolean> a(g<PlayerState> gVar) {
            h.e(gVar, "playerState");
            return gVar.O(a.a).s();
        }
    }

    static final class c<Upstream, Downstream> implements k<PlayerState, Optional<Long>> {
        final /* synthetic */ long a;
        final /* synthetic */ y b;
        final /* synthetic */ cqe c;

        static final class a<T, R> implements l<PlayerState, tpf<? extends Optional<Long>>> {
            final /* synthetic */ c a;

            a(c cVar) {
                this.a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.l
            public tpf<? extends Optional<Long>> apply(PlayerState playerState) {
                PlayerState playerState2 = playerState;
                h.e(playerState2, "it");
                c cVar = this.a;
                long j = cVar.a;
                y yVar = cVar.b;
                cqe cqe = cVar.c;
                if (!playerState2.isPlaying() || playerState2.isPaused()) {
                    g N = g.N(playerState2.position(cqe.d()));
                    h.d(N, "Flowable.just(state.posi…ock.currentTimeMillis()))");
                    return N;
                }
                g<R> O = g.i(g.N(playerState2), g.M(0, j, TimeUnit.MILLISECONDS, yVar), b.a).O(new c(cqe));
                h.d(O, "Flowable\n            .co…ck.currentTimeMillis()) }");
                return O;
            }
        }

        c(long j, y yVar, cqe cqe) {
            this.a = j;
            this.b = yVar;
            this.c = cqe;
        }

        @Override // io.reactivex.k
        public final tpf<Optional<Long>> a(g<PlayerState> gVar) {
            h.e(gVar, "playerState");
            return gVar.f0(new a(this)).s();
        }
    }

    public static final k<PlayerState, String> a() {
        return PlayerStateTransformers$contextUri$1.a;
    }

    public static final k<PlayerState, Optional<ContextTrack>> b() {
        return PlayerStateTransformers$currentTrack$1.a;
    }

    public static final k<PlayerState, Optional<String>> c() {
        return a.a;
    }

    public static final k<PlayerState, Optional<Long>> d() {
        return PlayerStateTransformers$duration$1.a;
    }

    public static final k<PlayerState, Boolean> e() {
        return b.a;
    }

    public static final k<PlayerState, Optional<Long>> f(long j, y yVar, cqe cqe) {
        h.e(yVar, "scheduler");
        h.e(cqe, "clock");
        return new c(j, yVar, cqe);
    }

    public static final k<PlayerState, Restrictions> g() {
        return PlayerStateTransformers$restrictions$1.a;
    }
}
