package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.spotify.mediaitem.a;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.b;
import com.spotify.music.C0707R;

/* renamed from: ke1  reason: default package */
public class ke1 implements nd1 {
    private final ajf<ui1> a;

    public ke1(ajf<ui1> ajf) {
        this.a = ajf;
    }

    public static MediaBrowserItem c(Context context) {
        a aVar = new a();
        aVar.f(1);
        Bundle b = aVar.b();
        b bVar = new b("com.spotify.your-library");
        bVar.c(MediaBrowserItem.ActionType.BROWSABLE);
        bVar.r(context.getString(C0707R.string.collection_title_your_library));
        bVar.j(gf0.g(context, C0707R.drawable.ic_eis_your_library));
        bVar.d(true);
        bVar.i(b);
        return bVar.a();
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return "com.spotify.your-library".equals(browserParams.h());
    }
}
