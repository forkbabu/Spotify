package defpackage;

import android.content.Context;
import com.google.common.collect.Collections2;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.q;
import io.reactivex.d0;
import io.reactivex.z;
import java.util.List;
import java.util.Map;

/* renamed from: fh1  reason: default package */
public class fh1 implements qh1 {
    private final Context a;
    private final q b;

    public fh1(Context context, q qVar) {
        this.a = context;
        this.b = qVar;
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        return this.b.b(browserParams).s(new mf1(this, browserParams));
    }

    public d0 c(BrowserParams browserParams, List list) {
        if (browserParams.n() || list.isEmpty()) {
            return z.z(Collections2.newArrayList(ud1.c(this.a), ke1.c(this.a), bd1.c(this.a)));
        }
        return z.z(list);
    }
}
