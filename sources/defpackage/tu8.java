package defpackage;

import com.spotify.music.connection.l;
import com.spotify.music.libs.search.trending.TrendingSearchConfig;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.k;
import io.reactivex.s;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: tu8  reason: default package */
public class tu8 implements k<b91, b91> {
    private final l a;
    private final TrendingSearchConfig b;
    private final bu8 c;

    tu8(l lVar, TrendingSearchConfig trendingSearchConfig, bu8 bu8) {
        this.a = lVar;
        this.b = trendingSearchConfig;
        this.c = bu8;
    }

    public static b91 b(b91 b91, b91 b912) {
        boolean z;
        if (b912 != null && !b912.body().isEmpty()) {
            Iterator<? extends s81> it = b912.body().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s81 s81 = (s81) it.next();
                if ("mo-trending-searches-source".equals(s81.id()) && !s81.children().isEmpty()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return b91;
        }
        if (b91 != null) {
            int i = t71.c;
            if (!"hubs/placeholder".equals(b91.id())) {
                ArrayList arrayList = new ArrayList(b91.body());
                arrayList.addAll(0, b912.body());
                return b91.toBuilder().e(arrayList).g();
            }
        }
        return z81.i().k("search-history").a(b912.body()).g();
    }

    /* Return type fixed from 'tpf' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.g] */
    @Override // io.reactivex.k
    public tpf<b91> a(g<b91> gVar) {
        return this.b.c() ? s.m(this.a.a(), je.Z(gVar, gVar), this.c.a().E(iu8.a).P(), ju8.a).Y0(BackpressureStrategy.BUFFER) : gVar;
    }
}
