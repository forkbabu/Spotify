package defpackage;

import android.content.Context;
import com.spotify.mobile.android.recentlyplayed.a;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.remoteconfig.x4;
import io.reactivex.z;
import java.util.List;
import java.util.Map;

/* renamed from: xh1  reason: default package */
public class xh1 implements qh1 {
    private final Context a;
    private final a b;
    private final x4 c;
    private final c4e d;

    public xh1(Context context, a aVar, x4 x4Var, c4e c4e) {
        this.a = context;
        this.b = aVar;
        this.c = x4Var;
        this.d = c4e;
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> a(BrowserParams browserParams, Map<String, String> map) {
        String str = map.get("type");
        if (str == null) {
            return z.q(new IllegalStateException());
        }
        return this.b.a().B0().A(new xf1(this, browserParams, str.equals("premium")));
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        return z.q(new UnsupportedOperationException());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List c(com.spotify.mobile.android.service.media.browser.BrowserParams r16, boolean r17, com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems r18) {
        /*
        // Method dump skipped, instructions count: 264
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xh1.c(com.spotify.mobile.android.service.media.browser.BrowserParams, boolean, com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems):java.util.List");
    }
}
