package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.remoteconfig.AndroidGoogleClockProperties;
import io.reactivex.z;
import java.util.List;
import java.util.Map;

/* renamed from: pn9  reason: default package */
public class pn9 implements qh1 {
    private final AndroidGoogleClockProperties a;
    private final fi1 b;

    public pn9(AndroidGoogleClockProperties androidGoogleClockProperties, fi1 fi1) {
        this.a = androidGoogleClockProperties;
        this.b = fi1;
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        if (this.a.a() != AndroidGoogleClockProperties.GoogleClockTestContent.CURATED_WAKE) {
            return this.b.b(browserParams);
        }
        fi1 fi1 = this.b;
        BrowserParams.a r = browserParams.r();
        r.b("wake2");
        return fi1.b(r.build());
    }
}
