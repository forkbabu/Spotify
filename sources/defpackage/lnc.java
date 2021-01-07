package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.c;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.h;

/* renamed from: lnc  reason: default package */
public final class lnc implements knc {
    private final g<PlayerState> a;
    private final g<Boolean> b;

    /* renamed from: lnc$a */
    static final class a<T1, T2, R> implements c<PlayerState, Boolean, Pair<? extends PlayerState, ? extends Boolean>> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.c
        public Pair<? extends PlayerState, ? extends Boolean> a(PlayerState playerState, Boolean bool) {
            PlayerState playerState2 = playerState;
            boolean booleanValue = bool.booleanValue();
            h.e(playerState2, "playerstate");
            return new Pair<>(playerState2, Boolean.valueOf(booleanValue));
        }
    }

    /* renamed from: lnc$b */
    static final class b<T, R> implements l<Pair<? extends PlayerState, ? extends Boolean>, tpf<? extends PlayerState>> {
        final /* synthetic */ y a;

        b(y yVar) {
            this.a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public tpf<? extends PlayerState> apply(Pair<? extends PlayerState, ? extends Boolean> pair) {
            Pair<? extends PlayerState, ? extends Boolean> pair2 = pair;
            h.e(pair2, "pair");
            boolean booleanValue = ((Boolean) pair2.d()).booleanValue();
            PlayerState playerState = (PlayerState) pair2.c();
            if (booleanValue) {
                return g.i(g.N(playerState), g.M(0, (long) 15, TimeUnit.SECONDS, this.a), mnc.a);
            }
            return g.N(playerState);
        }
    }

    public lnc(g<PlayerState> gVar, g<Boolean> gVar2) {
        h.e(gVar, "playerStateFlowable");
        h.e(gVar2, "isResumedFlowable");
        this.a = gVar;
        this.b = gVar2;
    }

    @Override // defpackage.knc
    public g<PlayerState> a(y yVar) {
        h.e(yVar, "scheduler");
        g<PlayerState> f0 = g.i(this.a, this.b, a.a).f0(new b(yVar));
        h.d(f0, "Flowable.combineLatest(\n…e\n            )\n        }");
        return f0;
    }
}
