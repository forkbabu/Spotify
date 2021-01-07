package defpackage;

import com.spotify.music.carmode.navigation.domain.p;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: kn2  reason: default package */
public final class kn2 {
    private final g<PlayerState> a;

    /* renamed from: kn2$a */
    static final class a<T, R> implements l<PlayerState, p> {
        final /* synthetic */ kn2 a;

        a(kn2 kn2) {
            this.a = kn2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public p apply(PlayerState playerState) {
            PlayerState playerState2 = playerState;
            h.e(playerState2, "it");
            this.a.getClass();
            ContextTrack orNull = playerState2.track().orNull();
            return p.a(orNull != null ? kxd.f(orNull) : false);
        }
    }

    public kn2(g<PlayerState> gVar) {
        h.e(gVar, "playerStateFlowable");
        this.a = gVar;
    }

    public final s<p> a() {
        v vVar = new v(this.a.O(new a(this)).s());
        h.d(vVar, "playerStateFlowable\n    …          .toObservable()");
        return vVar;
    }
}
