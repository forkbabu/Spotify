package defpackage;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.spoton.SpotOnAction;
import com.spotify.music.features.spoton.SpotOnPlaybackManager;
import com.spotify.music.features.spoton.q;
import defpackage.yda;
import io.reactivex.e;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;

/* renamed from: ge5  reason: default package */
public class ge5 implements w<me5, Void> {
    private final y a;
    private final SpotOnPlaybackManager b;
    private final vd5 c;

    /* renamed from: ge5$b */
    public static class b {
        private final y a;
        private final q b;
        private final vd5 c;
        private final Context d;
        private final uk8 e;
        private final cte f;
        private final yk8 g;

        public b(q qVar, y yVar, vd5 vd5, Context context, uk8 uk8, cte cte, yk8 yk8) {
            this.a = yVar;
            this.b = qVar;
            this.c = vd5;
            this.d = context;
            this.e = uk8;
            this.f = cte;
            this.g = yk8;
        }

        public ge5 a() {
            return new ge5(this.b.b(kfd.n1, this.d, this.e, this.f, this.g, SpotOnPlaybackManager.OnboardingMode.NONE, SpotOnPlaybackManager.TtsMode.NONE), this.a, this.c, null);
        }
    }

    ge5(SpotOnPlaybackManager spotOnPlaybackManager, y yVar, vd5 vd5, a aVar) {
        this.a = yVar;
        this.b = spotOnPlaybackManager;
        this.c = vd5;
    }

    public v a(me5 me5) {
        io.reactivex.a aVar;
        if (this.b.c()) {
            aVar = io.reactivex.internal.operators.completable.b.a;
        } else {
            SpotOnPlaybackManager spotOnPlaybackManager = this.b;
            yda.b bVar = new yda.b("SpotifyGo");
            bVar.s("bluetooth");
            bVar.l("headphones");
            bVar.q("spotify_go");
            me5.getClass();
            ne5 ne5 = (ne5) me5;
            bVar.m(ne5.b());
            bVar.n(ne5.a());
            bVar.o(ne5.d());
            aVar = spotOnPlaybackManager.m(bVar.k());
        }
        return aVar.d(io.reactivex.a.n(new fe5(this, me5))).g(o.a);
    }

    @Override // io.reactivex.w
    public v<Void> apply(s<me5> sVar) {
        s<R> W = sVar.W(new ce5(this), false, Integer.MAX_VALUE);
        SpotOnPlaybackManager spotOnPlaybackManager = this.b;
        spotOnPlaybackManager.getClass();
        return W.I(new be5(spotOnPlaybackManager));
    }

    public e b(me5 me5) {
        me5.getClass();
        Logger.g("Go: Received playback command: %s", 1);
        io.reactivex.a A = this.b.b(SpotOnAction.PLAY).A(this.a);
        vd5 vd5 = this.c;
        if (vd5 != null) {
            return io.reactivex.a.Q(vd5.a(A)).p(de5.a).C(ee5.a);
        }
        throw new NullPointerException("transformer is null");
    }
}
