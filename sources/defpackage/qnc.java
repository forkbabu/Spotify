package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import defpackage.onc;
import io.reactivex.functions.h;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: qnc  reason: default package */
public final class qnc implements pnc {
    private final cqe a;
    private final knc b;
    private final g<Boolean> c;
    private final g<Optional<String>> d;

    /* renamed from: qnc$a */
    static final class a<T1, T2, T3, R> implements h<PlayerState, Boolean, Optional<String>, onc> {
        final /* synthetic */ qnc a;

        a(qnc qnc) {
            this.a = qnc;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.h
        public onc a(PlayerState playerState, Boolean bool, Optional<String> optional) {
            String str;
            PlayerState playerState2 = playerState;
            boolean booleanValue = bool.booleanValue();
            Optional<String> optional2 = optional;
            kotlin.jvm.internal.h.e(playerState2, "playerState");
            kotlin.jvm.internal.h.e(optional2, "currentTrackUri");
            if (!optional2.isPresent()) {
                return onc.a.a;
            }
            String str2 = optional2.get();
            kotlin.jvm.internal.h.d(str2, "currentTrackUri.get()");
            String str3 = str2;
            qnc qnc = this.a;
            Optional<ContextTrack> track = playerState2.track();
            kotlin.jvm.internal.h.d(track, "playerState.track()");
            qnc.getClass();
            String str4 = "";
            if (track.isPresent()) {
                String orDefault = track.get().metadata().getOrDefault("context_uri", str4);
                kotlin.jvm.internal.h.d(orDefault, "this.get().metadata().ge…efault(\"context_uri\", \"\")");
                str = orDefault;
            } else {
                str = str4;
            }
            qnc qnc2 = this.a;
            Optional<ContextTrack> track2 = playerState2.track();
            kotlin.jvm.internal.h.d(track2, "playerState.track()");
            qnc2.getClass();
            if (track2.isPresent()) {
                String provider = track2.get().provider();
                kotlin.jvm.internal.h.d(provider, "this.get().provider()");
                str4 = provider;
            }
            String contextUri = playerState2.contextUri();
            kotlin.jvm.internal.h.d(contextUri, "playerState.contextUri()");
            Long or = playerState2.position(this.a.a.d()).or((Optional<Long>) 0L);
            kotlin.jvm.internal.h.d(or, "playerState.position(clo…rrentTimeMillis()).or(0L)");
            long longValue = or.longValue();
            Long or2 = playerState2.duration().or((Optional<Long>) 0L);
            kotlin.jvm.internal.h.d(or2, "playerState.duration().or(0L)");
            return new onc.c(str3, str, str4, contextUri, booleanValue, longValue, or2.longValue());
        }
    }

    /* renamed from: qnc$b */
    static final class b<T, R> implements l<Throwable, onc> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public onc apply(Throwable th) {
            kotlin.jvm.internal.h.e(th, "it");
            return onc.b.a;
        }
    }

    public qnc(cqe cqe, knc knc, g<Boolean> gVar, g<Optional<String>> gVar2) {
        kotlin.jvm.internal.h.e(cqe, "clock");
        kotlin.jvm.internal.h.e(knc, "periodicPlayerStateProvider");
        kotlin.jvm.internal.h.e(gVar, "isResumedFlowable");
        kotlin.jvm.internal.h.e(gVar2, "currentTrackUriFlowable");
        this.a = cqe;
        this.b = knc;
        this.c = gVar;
        this.d = gVar2;
    }

    @Override // defpackage.pnc
    public g<onc> a(y yVar) {
        kotlin.jvm.internal.h.e(yVar, "scheduler");
        g<onc> T = g.j(this.b.a(yVar), this.c, this.d, new a(this)).b0(onc.b.a).s().T(b.a);
        kotlin.jvm.internal.h.d(T, "Flowable.combineLatest(\n…odcastPlayerState.Empty }");
        return T;
    }
}
