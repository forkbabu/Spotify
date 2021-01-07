package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import io.reactivex.z;
import java.util.List;
import java.util.Map;

/* renamed from: ki1  reason: default package */
public class ki1 implements qh1 {
    private final mi1 a;

    public ki1(mi1 mi1) {
        this.a = mi1;
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        mi1 mi1 = this.a;
        BrowserParams.a r = browserParams.r();
        r.i(String.format("%s%s", "spotify:space_item:", "partner-recommendations"));
        return mi1.b(r.build());
    }
}
