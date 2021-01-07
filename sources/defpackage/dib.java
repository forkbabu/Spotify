package defpackage;

import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.y;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: dib  reason: default package */
public class dib {
    public static final a d = new a(null);
    private final g<PlayerState> a;
    private final y b;
    private final q c;

    /* renamed from: dib$a */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* renamed from: dib$b */
    static final class b<T> implements io.reactivex.functions.g<PlayerState> {
        final /* synthetic */ cib a;
        final /* synthetic */ String b;

        b(cib cib, String str) {
            this.a = cib;
            this.b = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(PlayerState playerState) {
            PlayerState playerState2 = playerState;
            h.e(playerState2, "playerState");
            this.a.setPlaybackState(h.a(playerState2.contextUri(), this.b) && playerState2.isPlaying() && !playerState2.isPaused());
        }
    }

    /* renamed from: dib$c */
    static final class c<T> implements io.reactivex.functions.g<Throwable> {
        final /* synthetic */ cib a;

        c(cib cib) {
            this.a = cib;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            this.a.setPlaybackState(false);
        }
    }

    public dib(g<PlayerState> gVar, y yVar, q qVar) {
        h.e(gVar, "playerStateFlowable");
        h.e(yVar, "mainScheduler");
        h.e(qVar, "disposable");
        this.a = gVar;
        this.b = yVar;
        this.c = qVar;
    }

    public void a(cib cib, String str) {
        h.e(cib, "view");
        h.e(str, "contextUri");
        this.c.a(this.a.Q(this.b).subscribe(new b(cib, str), new c(cib)));
    }
}
