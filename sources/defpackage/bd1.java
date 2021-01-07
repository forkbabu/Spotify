package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.spotify.mediaitem.a;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.b;
import com.spotify.mobile.android.util.d0;
import com.spotify.music.C0707R;
import java.util.Locale;

/* renamed from: bd1  reason: default package */
public class bd1 implements nd1 {
    private final ajf<dh1> a;

    public bd1(ajf<dh1> ajf) {
        this.a = ajf;
    }

    public static MediaBrowserItem c(Context context) {
        a aVar = new a();
        aVar.f(1);
        aVar.e(2);
        Bundle b = aVar.b();
        b bVar = new b("com.spotify.browse");
        bVar.r(d0.b(context.getString(C0707R.string.browse_title), Locale.getDefault()));
        bVar.j(gf0.g(context, C0707R.drawable.ic_eis_browse));
        bVar.c(MediaBrowserItem.ActionType.BROWSABLE);
        bVar.i(b);
        return bVar.a();
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return "com.spotify.browse".equals(browserParams.h());
    }
}
