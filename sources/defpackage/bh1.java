package defpackage;

import com.spotify.mediaitem.PlayOriginReferrer;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.m;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.mobile.android.util.t;
import com.spotify.remoteconfig.x4;
import io.reactivex.d0;
import io.reactivex.z;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: bh1  reason: default package */
public class bh1 implements qh1 {
    private final vj1 a;
    private final lj1 b;
    private final t c;
    private final m d;
    private final vxd e;
    private final x4 f;
    private final o g;
    private final aqe h;
    private final SimpleDateFormat i = new SimpleDateFormat("yyyy-MM-dd'T'HH:00:00", Locale.getDefault());

    public bh1(vj1 vj1, lj1 lj1, t tVar, aqe aqe, m mVar, vxd vxd, x4 x4Var, o oVar) {
        this.a = vj1;
        this.b = lj1;
        this.c = tVar;
        this.d = mVar;
        this.e = vxd;
        this.f = x4Var;
        this.g = oVar;
        this.h = aqe;
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> a(BrowserParams browserParams, Map<String, String> map) {
        String str = map.get("country_code");
        String str2 = map.get("type");
        if (str == null || str2 == null) {
            return z.q(new IllegalStateException());
        }
        boolean equals = str2.equals("premium");
        Map<String, String> b2 = ph1.b(this.c, this.i, this.h, str);
        return this.d.a().s(new jf1(this, browserParams.h().replace("spotify:genre:", ""), b2, browserParams, equals));
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        return z.q(new UnsupportedOperationException());
    }

    public d0 c(String str, Map map, BrowserParams browserParams, boolean z, Map map2) {
        z<HubsJsonViewModel> zVar;
        if (this.f.b()) {
            zVar = this.b.c(str, map, map2, browserParams.g(), browserParams.e(), browserParams.j(), browserParams.k().d(), browserParams.i().d());
        } else {
            zVar = this.a.d(str, map, map2);
        }
        return zVar.A(new if1(this, browserParams, z));
    }

    public List d(BrowserParams browserParams, boolean z, HubsJsonViewModel hubsJsonViewModel) {
        ArrayList arrayList = new ArrayList(hubsJsonViewModel.body().size());
        for (HubsImmutableComponentModel hubsImmutableComponentModel : hubsJsonViewModel.body()) {
            MediaBrowserItem g2 = this.g.g(hubsImmutableComponentModel, null, this.f.a() && browserParams.l(), z, this.e, null, PlayOriginReferrer.BROWSE);
            if (g2 != null) {
                arrayList.add(g2);
            }
        }
        return arrayList;
    }
}
