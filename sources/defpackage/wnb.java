package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.ContextTrack;
import com.spotify.rxjava2.q;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.g;
import kotlin.jvm.internal.h;

/* renamed from: wnb  reason: default package */
public final class wnb implements vnb {
    private final q a = new q();
    private com.spotify.music.newplaying.scroll.widgets.podcastqna.view.a b;
    private final g<ContextTrack> c;

    /* renamed from: wnb$a */
    static final class a<T> implements n<ContextTrack> {
        public static final a a = new a();

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(ContextTrack contextTrack) {
            ContextTrack contextTrack2 = contextTrack;
            h.e(contextTrack2, AppProtocol.TrackData.TYPE_TRACK);
            return kxd.i(contextTrack2);
        }
    }

    /* renamed from: wnb$b */
    static final class b<T, R> implements l<ContextTrack, String> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public String apply(ContextTrack contextTrack) {
            ContextTrack contextTrack2 = contextTrack;
            h.e(contextTrack2, "contextTrack");
            return contextTrack2.uri();
        }
    }

    /* renamed from: wnb$c */
    static final class c<T> implements io.reactivex.functions.g<String> {
        final /* synthetic */ wnb a;

        c(wnb wnb) {
            this.a = wnb;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(String str) {
            String str2 = str;
            com.spotify.music.newplaying.scroll.widgets.podcastqna.view.a aVar = this.a.b;
            if (aVar != null) {
                h.d(str2, "contextTrackUri");
                aVar.a(str2);
            }
        }
    }

    public wnb(g<ContextTrack> gVar) {
        h.e(gVar, "trackFlowable");
        this.c = gVar;
    }

    @Override // defpackage.vnb
    public void a() {
        this.a.c();
    }

    @Override // defpackage.vnb
    public void b(com.spotify.music.newplaying.scroll.widgets.podcastqna.view.a aVar) {
        h.e(aVar, "podcastQnAWidgetViewBinder");
        this.b = aVar;
        this.a.a(this.c.C(a.a).O(b.a).s().subscribe(new c(this)));
    }
}
