package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.superbird.tipsandtricks.model.TipsAndTricksAppProtocol;
import defpackage.cf2;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: kh2  reason: default package */
public final class kh2 implements com.spotify.music.appprotocol.api.a {
    private final vpe a;

    /* renamed from: kh2$a */
    static final class a<A extends JacksonModel, R extends JacksonModel> implements cf2.c<AppProtocolBase.Empty, TipsAndTricksAppProtocol.DeviceTipsAndTricks> {
        final /* synthetic */ kh2 a;

        a(kh2 kh2) {
            this.a = kh2;
        }

        /* Return type fixed from 'io.reactivex.s' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.mobile.android.cosmos.JacksonModel] */
        @Override // defpackage.cf2.c
        public s<TipsAndTricksAppProtocol.DeviceTipsAndTricks> a(AppProtocolBase.Empty empty) {
            return kh2.b(this.a);
        }
    }

    public kh2(vpe vpe) {
        h.e(vpe, "tipsAndTricksManager");
        this.a = vpe;
    }

    public static final s b(kh2 kh2) {
        s<R> j0 = kh2.a.a().P().j0(jh2.a);
        h.d(j0, "tipsAndTricksManager\n   …cks(it)\n                }");
        return j0;
    }

    @Override // com.spotify.music.appprotocol.api.a
    public void a(qg0<bf2<?, ?>> qg0) {
        h.e(qg0, "addEndpoint");
        cf2 b = cf2.b(AppProtocolBase.Empty.class, TipsAndTricksAppProtocol.DeviceTipsAndTricks.class);
        b.d("com.spotify.superbird.tipsandtricks.get_tips_and_tricks");
        b.c(0);
        b.e(new a(this));
        qg0.accept(b.a());
    }
}
