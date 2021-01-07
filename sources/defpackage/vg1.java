package defpackage;

import com.spotify.mediaitem.PlayOriginReferrer;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.m;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.mobile.android.util.t;
import com.spotify.music.libs.external_integration.instrumentation.Page;
import com.spotify.music.libs.external_integration.instrumentation.d;
import com.spotify.music.libs.external_integration.instrumentation.e;
import com.spotify.remoteconfig.x4;
import io.reactivex.d0;
import io.reactivex.z;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: vg1  reason: default package */
public class vg1 implements qh1 {
    private final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'HH:00:00", Locale.getDefault());
    private final vj1 b;
    private final lj1 c;
    private final t d;
    private final m e;
    private final o f;
    private final vxd g;
    private final x4 h;
    private final d i;
    private final aqe j;

    public vg1(vj1 vj1, lj1 lj1, t tVar, aqe aqe, m mVar, vxd vxd, x4 x4Var, o oVar, d dVar) {
        this.b = vj1;
        this.c = lj1;
        this.d = tVar;
        this.e = mVar;
        this.f = oVar;
        this.g = vxd;
        this.h = x4Var;
        this.j = aqe;
        this.i = dVar;
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> a(BrowserParams browserParams, Map<String, String> map) {
        String str = map.get("country_code");
        String str2 = map.get("type");
        if (str == null || str2 == null) {
            return z.q(new IllegalStateException());
        }
        boolean equals = str2.equals("premium");
        return this.e.a().s(new df1(this, ph1.b(this.d, this.a, this.j, str), browserParams, equals)).j(new ef1(this, browserParams));
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        return z.q(new UnsupportedOperationException());
    }

    public d0 c(Map map, BrowserParams browserParams, boolean z, Map map2) {
        z<HubsJsonViewModel> zVar;
        if (this.h.b()) {
            zVar = this.c.d(map, map2, browserParams.g(), browserParams.e(), browserParams.j(), browserParams.k().d(), browserParams.i().d());
        } else {
            zVar = this.b.a(map, map2);
        }
        return zVar.A(new cf1(this, browserParams, z));
    }

    public void d(BrowserParams browserParams, List list) {
        String h2 = browserParams.h();
        e.a a2 = e.a();
        a2.d(Page.ANDROID_AUTO_HOME);
        a2.b(h2);
        this.i.a(a2.build());
    }

    public List e(BrowserParams browserParams, boolean z, HubsJsonViewModel hubsJsonViewModel) {
        ArrayList arrayList = new ArrayList(hubsJsonViewModel.body().size());
        int i2 = 0;
        boolean z2 = this.h.a() && browserParams.l();
        for (HubsImmutableComponentModel hubsImmutableComponentModel : hubsJsonViewModel.body()) {
            for (s81 s81 : hubsImmutableComponentModel.children()) {
                o oVar = this.f;
                String title = hubsImmutableComponentModel.text().title();
                vxd vxd = this.g;
                String id = s81.id();
                int i3 = i2 + 1;
                e.a a2 = e.a();
                a2.d(Page.ANDROID_AUTO_HOME);
                a2.b(id);
                a2.c(Integer.valueOf(i2));
                MediaBrowserItem g2 = oVar.g(s81, title, z2, z, vxd, a2.build(), PlayOriginReferrer.HOME);
                if (g2 != null) {
                    arrayList.add(g2);
                }
                i2 = i3;
            }
        }
        return arrayList;
    }
}
