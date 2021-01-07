package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.y;
import kotlin.jvm.internal.h;

/* renamed from: iod  reason: default package */
public final class iod implements d {
    private final q a = new q();
    private final g<PlayerState> b;
    private final god c;
    private final y f;

    /* renamed from: iod$a */
    static final class a<T, R> implements l<PlayerState, Optional<String>> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Optional<String> apply(PlayerState playerState) {
            PlayerState playerState2 = playerState;
            h.e(playerState2, "it");
            return playerState2.playbackId();
        }
    }

    /* renamed from: iod$b */
    static final class b<T> implements io.reactivex.functions.g<Optional<String>> {
        final /* synthetic */ iod a;

        b(iod iod) {
            this.a = iod;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Optional<String> optional) {
            god god = this.a.c;
            String or = optional.or((Optional<String>) "");
            h.d(or, "it.or(\"\")");
            god.a(or);
        }
    }

    public iod(g<PlayerState> gVar, god god, y yVar) {
        h.e(gVar, "playerStateFlowable");
        h.e(god, "latestPlaybackIdentifier");
        h.e(yVar, "mainScheduler");
        this.b = gVar;
        this.c = god;
        this.f = yVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.a(this.b.O(a.a).s().Q(this.f).subscribe(new b(this)));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.c();
        this.c.a("");
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "UserBehaviourEventLogger";
    }
}
