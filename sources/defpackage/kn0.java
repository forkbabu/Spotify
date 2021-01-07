package defpackage;

import com.google.common.base.Optional;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.v;

/* renamed from: kn0  reason: default package */
public final class kn0 implements v {
    public static final b f = new b(null);
    private final wlf<String> a;
    private final wlf<String> b;
    private final wlf<String> c = c.a;
    private final wlf<String> d;
    private final wlf<String> e;

    /* renamed from: kn0$a */
    /* compiled from: java-style lambda group */
    static final class a<T> implements wlf<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public final String get() {
            int i = this.a;
            if (i == 0) {
                return (String) ((Optional) ((wlf) this.b).get()).orNull();
            }
            if (i == 1) {
                return (String) ((Optional) ((wlf) this.b).get()).orNull();
            }
            throw null;
        }
    }

    /* renamed from: kn0$b */
    public static final class b {
        public b(f fVar) {
        }

        public static final void a(b bVar, v.a aVar, a0.a aVar2, String str, wlf wlf) {
            String str2;
            if (((fof) aVar).i().c(str) == null && (str2 = (String) wlf.get()) != null) {
                aVar2.a(str, str2);
            }
        }
    }

    /* renamed from: kn0$c */
    static final class c<T> implements wlf<String> {
        public static final c a = new c();

        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.wlf
        public /* bridge */ /* synthetic */ String get() {
            return "Android";
        }
    }

    public kn0(wlf<String> wlf, wlf<String> wlf2, wlf<Optional<String>> wlf3, wlf<Optional<String>> wlf4) {
        h.e(wlf, "userAgentProvider");
        h.e(wlf2, "acceptLanguageProvider");
        h.e(wlf3, "spotifyAppVersionProvider");
        h.e(wlf4, "clientIdProvider");
        this.d = wlf;
        this.e = wlf2;
        this.a = new a(1, wlf3);
        this.b = new a(0, wlf4);
    }

    @Override // okhttp3.v
    public d0 a(v.a aVar) {
        h.e(aVar, "chain");
        fof fof = (fof) aVar;
        a0.a h = fof.i().h();
        b bVar = f;
        h.d(h, "requestBuilder");
        b.a(bVar, aVar, h, "Accept-Language", this.e);
        b.a(bVar, aVar, h, "User-Agent", this.d);
        b.a(bVar, aVar, h, "Spotify-App-Version", this.a);
        b.a(bVar, aVar, h, "X-Client-Id", this.b);
        b.a(bVar, aVar, h, "App-Platform", this.c);
        return fof.f(h.b());
    }
}
