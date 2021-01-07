package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.q;
import io.reactivex.d0;
import io.reactivex.z;
import java.util.List;
import java.util.Map;

/* renamed from: co9  reason: default package */
public class co9 implements qh1 {
    private final q a;
    private final ao9 b;

    public co9(q qVar, ao9 ao9) {
        this.a = qVar;
        this.b = ao9;
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        return this.a.b(browserParams).s(new yn9(this, browserParams));
    }

    public d0 c(BrowserParams browserParams, List list) {
        if (browserParams.n() || list.isEmpty()) {
            return this.b.b(browserParams);
        }
        return z.z(list);
    }
}
