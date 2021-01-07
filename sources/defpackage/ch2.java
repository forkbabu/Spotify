package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.superbird.setup.model.SetupAppProtocol$State;
import defpackage.cf2;
import io.reactivex.l;
import io.reactivex.s;
import io.reactivex.v;
import kotlin.jvm.internal.h;

/* renamed from: ch2  reason: default package */
public final class ch2 implements com.spotify.music.appprotocol.api.a {
    private final ekd a;
    private final l<String> b;

    /* access modifiers changed from: package-private */
    /* renamed from: ch2$a */
    public static final class a<T, R> implements io.reactivex.functions.l<String, v<? extends SetupAppProtocol$State>> {
        final /* synthetic */ ch2 a;

        a(ch2 ch2) {
            this.a = ch2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends SetupAppProtocol$State> apply(String str) {
            String str2 = str;
            h.e(str2, "it");
            return s.i0(SetupAppProtocol$State.create(this.a.a.b(str2)));
        }
    }

    /* renamed from: ch2$b */
    static final class b<A extends JacksonModel, R extends JacksonModel> implements cf2.c<AppProtocolBase.Empty, SetupAppProtocol$State> {
        final /* synthetic */ ch2 a;

        b(ch2 ch2) {
            this.a = ch2;
        }

        /* Return type fixed from 'io.reactivex.s' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.mobile.android.cosmos.JacksonModel] */
        @Override // defpackage.cf2.c
        public s<SetupAppProtocol$State> a(AppProtocolBase.Empty empty) {
            return this.a.c();
        }
    }

    public ch2(ekd ekd, l<String> lVar) {
        h.e(ekd, "sharedPrefs");
        h.e(lVar, "superbirdSerial");
        this.a = ekd;
        this.b = lVar;
    }

    @Override // com.spotify.music.appprotocol.api.a
    public void a(qg0<bf2<?, ?>> qg0) {
        h.e(qg0, "addEndpoint");
        cf2 b2 = cf2.b(AppProtocolBase.Empty.class, SetupAppProtocol$State.class);
        b2.d("com.spotify.superbird.setup");
        b2.c(0);
        b2.e(new b(this));
        qg0.accept(b2.a());
    }

    public final s<SetupAppProtocol$State> c() {
        s<R> i = this.b.i(new a(this));
        h.d(i, "superbirdSerial.flatMapO…etedSetup(it)))\n        }");
        return i;
    }
}
