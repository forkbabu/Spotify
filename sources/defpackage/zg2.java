package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.superbird.remoteconfig.model.RemoteConfigAppProtocol;
import defpackage.cf2;
import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: zg2  reason: default package */
public final class zg2 implements com.spotify.music.appprotocol.api.a {
    private final dld a;

    /* access modifiers changed from: package-private */
    /* renamed from: zg2$a */
    public static final class a<T, R> implements l<Map<String, ? extends Object>, RemoteConfigAppProtocol.RemoteConfigs> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public RemoteConfigAppProtocol.RemoteConfigs apply(Map<String, ? extends Object> map) {
            Map<String, ? extends Object> map2 = map;
            h.e(map2, "remoteConfigs");
            return new RemoteConfigAppProtocol.RemoteConfigs(map2);
        }
    }

    /* renamed from: zg2$b */
    static final class b<A extends JacksonModel, R extends JacksonModel> implements cf2.c<AppProtocolBase.Empty, RemoteConfigAppProtocol.RemoteConfigs> {
        final /* synthetic */ zg2 a;

        b(zg2 zg2) {
            this.a = zg2;
        }

        /* Return type fixed from 'io.reactivex.s' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.mobile.android.cosmos.JacksonModel] */
        @Override // defpackage.cf2.c
        public s<RemoteConfigAppProtocol.RemoteConfigs> a(AppProtocolBase.Empty empty) {
            return this.a.b();
        }
    }

    public zg2(dld dld) {
        h.e(dld, "mRemoteConfigManager");
        this.a = dld;
    }

    @Override // com.spotify.music.appprotocol.api.a
    public void a(qg0<bf2<?, ?>> qg0) {
        h.e(qg0, "addEndpoint");
        cf2 b2 = cf2.b(AppProtocolBase.Empty.class, RemoteConfigAppProtocol.RemoteConfigs.class);
        b2.d("com.spotify.superbird.remote_configuration");
        b2.c(0);
        b2.e(new b(this));
        qg0.accept(b2.a());
    }

    public final s<RemoteConfigAppProtocol.RemoteConfigs> b() {
        s<R> j0 = this.a.a().P().j0(a.a);
        h.d(j0, "mRemoteConfigManager\n   …oteConfigs)\n            }");
        return j0;
    }
}
