package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.z;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: nq5  reason: default package */
public class nq5 implements qh1 {
    private final g<PlayerState> a;

    public nq5(g<PlayerState> gVar) {
        this.a = gVar;
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        return this.a.C(kq5.a).h0(1).j0(5, TimeUnit.SECONDS).a0().A(jq5.a);
    }
}
