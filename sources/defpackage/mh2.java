package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.superbird.tts.model.TtsAppProtocol;
import defpackage.cf2;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: mh2  reason: default package */
public final class mh2 implements com.spotify.music.appprotocol.api.a {
    private final xld a;

    /* renamed from: mh2$a */
    static final class a<A extends JacksonModel, R extends JacksonModel> implements cf2.c<TtsAppProtocol.Tts, AppProtocolBase.Empty> {
        final /* synthetic */ mh2 a;

        a(mh2 mh2) {
            this.a = mh2;
        }

        /* Return type fixed from 'io.reactivex.s' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.mobile.android.cosmos.JacksonModel] */
        @Override // defpackage.cf2.c
        public s<AppProtocolBase.Empty> a(TtsAppProtocol.Tts tts) {
            TtsAppProtocol.Tts tts2 = tts;
            mh2 mh2 = this.a;
            h.d(tts2, "it");
            return mh2.b(tts2);
        }
    }

    public mh2(xld xld) {
        h.e(xld, "superbirdTtsPlayer");
        this.a = xld;
    }

    @Override // com.spotify.music.appprotocol.api.a
    public void a(qg0<bf2<?, ?>> qg0) {
        h.e(qg0, "addEndpoint");
        cf2 b = cf2.b(TtsAppProtocol.Tts.class, AppProtocolBase.Empty.class);
        oh2 oh2 = oh2.b;
        b.d(oh2.a());
        b.c(0);
        b.e(new a(this));
        qg0.accept(b.a());
    }

    public final s<AppProtocolBase.Empty> b(TtsAppProtocol.Tts tts) {
        h.e(tts, "tts");
        if (tts.getUtterance() != null) {
            s<AppProtocolBase.Empty> g = this.a.i(tts.getUtterance()).g(s.i0(AppProtocolBase.a));
            h.d(g, "superbirdTtsPlayer\n     …t(AppProtocolBase.EMPTY))");
            return g;
        } else if (tts.getFile() != null) {
            xld xld = this.a;
            String file = tts.getFile();
            xld.getClass();
            s<AppProtocolBase.Empty> g2 = xld.a(String.format("%s%s", "https://misc.scdn.co/tts/", file)).g(s.i0(AppProtocolBase.a));
            h.d(g2, "superbirdTtsPlayer\n     …t(AppProtocolBase.EMPTY))");
            return g2;
        } else {
            s<AppProtocolBase.Empty> i0 = s.i0(AppProtocolBase.a);
            h.d(i0, "Observable.just(AppProtocolBase.EMPTY)");
            return i0;
        }
    }
}
