package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.b;
import com.spotify.music.C0707R;

/* renamed from: ud1  reason: default package */
public class ud1 implements nd1 {
    private final ajf<xh1> a;

    public ud1(ajf<xh1> ajf) {
        this.a = ajf;
    }

    public static MediaBrowserItem c(Context context) {
        b bVar = new b("com.spotify.recently-played");
        bVar.r(context.getString(C0707R.string.collection_start_recently_played_title_short));
        bVar.c(MediaBrowserItem.ActionType.BROWSABLE);
        bVar.j(gf0.g(context, C0707R.drawable.ic_eis_recently_played));
        return bVar.a();
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return "com.spotify.recently-played".equals(browserParams.h());
    }
}
