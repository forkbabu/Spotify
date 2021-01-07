package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.freetierartist.discographysortandfilter.DiscographyFilterTransformer;
import com.spotify.music.features.freetierartist.discographysortandfilter.sort.SortCriteriaTransformer;
import com.spotify.remoteconfig.t5;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import java.util.Map;

/* renamed from: g75  reason: default package */
public class g75 {
    private final wlf<h81> a;
    private final rf3 b;
    private final e75 c;
    private final DiscographyFilterTransformer d;
    private final SortCriteriaTransformer e;
    private final t5 f;
    private final boolean g;

    public g75(rf3 rf3, e75 e75, wlf<h81> wlf, boolean z, DiscographyFilterTransformer discographyFilterTransformer, SortCriteriaTransformer sortCriteriaTransformer, t5 t5Var) {
        this.a = wlf;
        this.g = z;
        this.b = rf3;
        this.c = e75;
        this.d = discographyFilterTransformer;
        this.e = sortCriteriaTransformer;
        this.f = t5Var;
    }

    public s<b91> a(String str) {
        if (this.g) {
            return new v(this.a.get().a()).q(this.d).q(this.e);
        }
        l0 z = l0.z(str);
        MoreObjects.checkArgument(z.q() == LinkType.ARTIST_RELEASES);
        s<b91> h = new v(this.b.a()).W(new a75(this, z.i()), false, Integer.MAX_VALUE).h(b91.class);
        return this.f.a() ? h.q(this.d).q(this.e) : h;
    }

    public /* synthetic */ io.reactivex.v b(String str, Map map) {
        return this.c.a(str, map).P();
    }
}
