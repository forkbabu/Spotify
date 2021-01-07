package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: uea  reason: default package */
public final class uea implements tea {
    private final g<PlayerState> a;

    /* renamed from: uea$a */
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
            return com.spotify.paste.widgets.b.e(playerState2);
        }
    }

    /* renamed from: uea$b */
    static final class b<T> implements io.reactivex.functions.g<Throwable> {
        public static final b a = new b();

        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Logger.e(th, "Couldn't get current track uri.", new Object[0]);
        }
    }

    public uea(g<PlayerState> gVar) {
        h.e(gVar, "playerStateFlowable");
        this.a = gVar;
    }

    @Override // defpackage.tea
    public z<String> a() {
        z<R> m = this.a.h0(1).O(a.a).a0().m(b.a);
        h.d(m, "playerStateFlowable\n    …rack uri.\")\n            }");
        return m;
    }
}
