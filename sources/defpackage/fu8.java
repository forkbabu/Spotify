package defpackage;

import com.spotify.music.libs.search.trending.TrendingSearchConfig;
import io.reactivex.a;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.z;

/* renamed from: fu8  reason: default package */
public final class fu8 implements fjf<a> {
    private final wlf<TrendingSearchConfig> a;
    private final wlf<bu8> b;
    private final wlf<yt8> c;

    public fu8(wlf<TrendingSearchConfig> wlf, wlf<bu8> wlf2, wlf<yt8> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        bu8 bu8 = this.b.get();
        yt8 yt8 = this.c.get();
        if (this.a.get().c()) {
            z<b91> a2 = bu8.a();
            a2.getClass();
            return a.Q(new g1e(30, 3, 60000).a(new i(a2))).B();
        }
        yt8.b(null);
        return b.a;
    }
}
