package defpackage;

import com.spotify.playlist.models.Episode;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.l;
import io.reactivex.g;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: wo9  reason: default package */
public class wo9 {
    private final hna a;
    private final Episode b;

    /* renamed from: wo9$a */
    static final class a<T, R> implements l<Map<String, Episode>, Episode> {
        final /* synthetic */ wo9 a;
        final /* synthetic */ String b;

        a(wo9 wo9, String str) {
            this.a = wo9;
            this.b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Episode apply(Map<String, Episode> map) {
            Map<String, Episode> map2 = map;
            h.e(map2, "episodeMap");
            Episode episode = map2.get(this.b);
            return episode != null ? episode : this.a.b;
        }
    }

    public wo9(ina ina) {
        h.e(ina, "episodeDecoratorFactory");
        hna b2 = ina.create();
        b2.g(true);
        h.d(b2, "episodeDecoratorFactory.…tPreferCached(true)\n    }");
        this.a = b2;
        Episode build = Episode.a().build();
        h.d(build, "Episode.builder().build()");
        this.b = build;
    }

    public g<Episode> b(String str) {
        h.e(str, "itemUri");
        g<Episode> Y0 = this.a.f(str).j0(new a(this, str)).G0(this.b).s0(this.b).E().Y0(BackpressureStrategy.LATEST);
        h.d(Y0, "episodeDecorator\n       …kpressureStrategy.LATEST)");
        return Y0;
    }
}
