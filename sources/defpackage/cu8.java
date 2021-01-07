package defpackage;

import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.music.libs.search.trending.TrendingSearchConfig;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: cu8  reason: default package */
public class cu8 implements bu8 {
    private final l<b91, b91> a;
    private final yt8 b;
    private final eu8 c;
    private final String d;
    private final l<b91, b91> e;
    private final y f;
    private final TrendingSearchConfig g;

    public cu8(eu8 eu8, String str, l<b91, b91> lVar, l<b91, b91> lVar2, yt8 yt8, y yVar, TrendingSearchConfig trendingSearchConfig) {
        this.a = lVar;
        this.e = lVar2;
        this.f = yVar;
        this.d = str;
        this.g = trendingSearchConfig;
        this.b = yt8;
        this.c = eu8;
    }

    @Override // defpackage.bu8
    public z<b91> a() {
        z<HubsJsonViewModel> zVar;
        if (this.g.c()) {
            zVar = this.c.b(this.d);
        } else {
            zVar = this.c.a(this.d);
        }
        s j0 = zVar.H(this.f).P().h(b91.class).j0(this.a).j0(this.e);
        yt8 yt8 = this.b;
        yt8.getClass();
        return j0.N(new au8(yt8)).B0();
    }
}
