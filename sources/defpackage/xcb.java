package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.lyrics.core.experience.model.b;
import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.v;
import kotlin.jvm.internal.h;

/* renamed from: xcb  reason: default package */
public final class xcb {
    private final tcb a;
    private final g<ContextTrack> b;
    private final xn1<com.spotify.music.lyrics.core.experience.model.b> c;

    /* renamed from: xcb$a */
    static final class a<T, R> implements l<ContextTrack, String> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public String apply(ContextTrack contextTrack) {
            ContextTrack contextTrack2 = contextTrack;
            h.e(contextTrack2, AppProtocol.TrackData.TYPE_TRACK);
            return contextTrack2.uri();
        }
    }

    /* renamed from: xcb$b */
    static final class b<T, R> implements l<ContextTrack, v<? extends com.spotify.music.lyrics.core.experience.model.b>> {
        final /* synthetic */ xcb a;

        b(xcb xcb) {
            this.a = xcb;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends com.spotify.music.lyrics.core.experience.model.b> apply(ContextTrack contextTrack) {
            ContextTrack contextTrack2 = contextTrack;
            h.e(contextTrack2, AppProtocol.TrackData.TYPE_TRACK);
            return xcb.a(this.a, contextTrack2);
        }
    }

    public xcb(tcb tcb, g<ContextTrack> gVar, xn1<com.spotify.music.lyrics.core.experience.model.b> xn1) {
        h.e(tcb, "dataSource");
        h.e(gVar, "trackFlowable");
        h.e(xn1, "deferUntilConnected");
        this.a = tcb;
        this.b = gVar;
        this.c = xn1;
    }

    public static final s a(xcb xcb, ContextTrack contextTrack) {
        xcb.getClass();
        h.e(contextTrack, AppProtocol.TrackData.TYPE_TRACK);
        if (!Boolean.parseBoolean(contextTrack.metadata().get("has_lyrics"))) {
            s i0 = s.i0(b.a.a);
            h.d(i0, "Observable.just(LyricsLoadState.Error)");
            return i0;
        }
        tcb tcb = xcb.a;
        String uri = contextTrack.uri();
        h.d(uri, "track.uri()");
        s<R> G0 = tcb.a(uri, kxd.c(contextTrack)).A(vcb.a).P().q(xcb.c).r0(wcb.a).G0((R) b.c.a);
        h.d(G0, "dataSource\n             …(LyricsLoadState.Loading)");
        return G0;
    }

    public final s<com.spotify.music.lyrics.core.experience.model.b> b() {
        s<com.spotify.music.lyrics.core.experience.model.b> J0 = new io.reactivex.internal.operators.observable.v(this.b.u(a.a)).J0(new b(this));
        h.d(J0, "trackFlowable\n          …adLyricsForTrack(track) }");
        return J0;
    }
}
