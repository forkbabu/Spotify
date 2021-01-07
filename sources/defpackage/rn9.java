package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.q;
import io.reactivex.d0;
import io.reactivex.z;
import java.util.List;
import java.util.Map;

/* renamed from: rn9  reason: default package */
public class rn9 implements qh1 {
    private final q a;
    private final ki1 b;

    public rn9(q qVar, ki1 ki1) {
        this.a = qVar;
        this.b = ki1;
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        return this.a.b(browserParams).s(new on9(this, browserParams));
    }

    public d0 c(BrowserParams browserParams, List list) {
        if (!browserParams.n() && !list.isEmpty()) {
            return z.z(list);
        }
        ki1 ki1 = this.b;
        BrowserParams.a r = browserParams.r();
        r.c("");
        r.b("wake2");
        return ki1.b(r.build());
    }
}
