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

/* renamed from: dh1  reason: default package */
public class dh1 implements qh1 {
    private final vj1 a;
    private final lj1 b;
    private final x4 c;
    private final t d;
    private final m e;
    private final vxd f;
    private final o g;
    private final aqe h;
    private final SimpleDateFormat i = new SimpleDateFormat("yyyy-MM-dd'T'HH:00:00", Locale.getDefault());

    public dh1(vj1 vj1, lj1 lj1, x4 x4Var, t tVar, aqe aqe, m mVar, vxd vxd, o oVar) {
        this.a = vj1;
        this.b = lj1;
        this.c = x4Var;
        this.d = tVar;
        this.e = mVar;
        this.f = vxd;
        this.g = oVar;
        this.h = aqe;
    }

    public static List c(dh1 dh1, HubsJsonViewModel hubsJsonViewModel) {
        dh1.getClass();
        ArrayList arrayList = new ArrayList(hubsJsonViewModel.body().size());
        for (HubsImmutableComponentModel hubsImmutableComponentModel : hubsJsonViewModel.body()) {
            for (s81 s81 : hubsImmutableComponentModel.children()) {
                MediaBrowserItem g2 = dh1.g.g(s81, null, true, true, dh1.f, null, PlayOriginReferrer.OTHER);
                if (g2 != null) {
                    arrayList.add(g2);
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> a(BrowserParams browserParams, Map<String, String> map) {
        String str = map.get("country_code");
        if (str == null) {
            return z.q(new IllegalStateException());
        }
        return this.e.a().s(new lf1(this, ph1.b(this.d, this.i, this.h, str), browserParams));
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        return z.q(new UnsupportedOperationException());
    }

    public d0 d(Map map, BrowserParams browserParams, Map map2) {
        z<HubsJsonViewModel> zVar;
        if (this.c.b()) {
            zVar = this.b.b(map, map2, browserParams.g(), browserParams.e(), browserParams.j(), browserParams.k().d(), browserParams.i().d());
        } else {
            zVar = this.a.b(map, map2);
        }
        return zVar.A(new kf1(this));
    }
}
