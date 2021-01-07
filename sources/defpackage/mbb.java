package defpackage;

import com.spotify.remoteconfig.AndroidLibsYourEpisodesFlagsProperties;
import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: mbb  reason: default package */
public final class mbb implements lbb {
    private final AndroidLibsYourEpisodesFlagsProperties a;
    private final txc b;

    /* renamed from: mbb$a */
    static final class a<T, R> implements l<Map<String, ? extends String>, Boolean> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Boolean apply(Map<String, ? extends String> map) {
            Map<String, ? extends String> map2 = map;
            h.e(map2, "it");
            return Boolean.valueOf(uxc.c(map2));
        }
    }

    public mbb(AndroidLibsYourEpisodesFlagsProperties androidLibsYourEpisodesFlagsProperties, txc txc) {
        h.e(androidLibsYourEpisodesFlagsProperties, "properties");
        h.e(txc, "productState");
        this.a = androidLibsYourEpisodesFlagsProperties;
        this.b = txc;
    }

    @Override // defpackage.lbb
    public boolean a() {
        return this.a.f() == AndroidLibsYourEpisodesFlagsProperties.EnableYourEpisodes.ENABLED;
    }

    @Override // defpackage.lbb
    public s<Boolean> b() {
        AndroidLibsYourEpisodesFlagsProperties.EnableContextDownload b2 = this.a.b();
        if (b2 != null) {
            int ordinal = b2.ordinal();
            if (ordinal == 1) {
                s<Boolean> i0 = s.i0(Boolean.TRUE);
                h.d(i0, "Observable.just(ENABLED)");
                return i0;
            } else if (ordinal == 2) {
                s<R> E = this.b.b().j0(a.a).E();
                h.d(E, "productState.productStat… }.distinctUntilChanged()");
                return E;
            }
        }
        s<Boolean> i02 = s.i0(Boolean.FALSE);
        h.d(i02, "Observable.just(DISABLED)");
        return i02;
    }

    @Override // defpackage.lbb
    public boolean c() {
        return a() && this.a.a();
    }

    @Override // defpackage.lbb
    public boolean d() {
        return a() && this.a.d();
    }

    @Override // defpackage.lbb
    public boolean e() {
        return a() && this.a.e();
    }
}
