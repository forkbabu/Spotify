package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.common.collect.Collections2;
import com.spotify.mediaitem.a;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.b;
import com.spotify.mobile.android.util.d0;
import com.spotify.music.C0707R;
import io.reactivex.z;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: xg1  reason: default package */
public class xg1 implements qh1 {
    private final Context a;
    private final w b;

    public xg1(Context context, w wVar) {
        this.a = context;
        this.b = wVar;
    }

    private List<MediaBrowserItem> c() {
        Context context = this.a;
        b bVar = new b("com.spotify.androidauto.home");
        bVar.r(d0.b(context.getString(C0707R.string.start_page_title), Locale.getDefault()));
        bVar.j(gf0.g(context, C0707R.drawable.ic_eis_home));
        bVar.c(MediaBrowserItem.ActionType.BROWSABLE);
        return Collections2.newArrayList(bVar.a(), ud1.c(this.a), bd1.c(this.a), ke1.c(this.a));
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        if (browserParams.m()) {
            return this.b.a("type").j0(new af1("premium")).N0(1).B0().s(new ff1(this, browserParams));
        }
        return z.q(new IllegalArgumentException("The user is not logged in"));
    }

    public io.reactivex.d0 d(BrowserParams browserParams, Boolean bool) {
        List<MediaBrowserItem> list;
        if (!bool.booleanValue()) {
            return z.z(c());
        }
        if (browserParams.n()) {
            list = c();
        } else {
            Context context = this.a;
            a aVar = new a();
            aVar.f(1);
            Bundle b2 = aVar.b();
            b bVar = new b("com.spotify.your-library");
            bVar.c(MediaBrowserItem.ActionType.BROWSABLE);
            bVar.r(context.getString(C0707R.string.collection_title_your_library_offline));
            bVar.j(gf0.g(context, C0707R.drawable.ic_eis_your_library));
            bVar.d(true);
            bVar.i(b2);
            list = Collections.singletonList(bVar.a());
        }
        return z.z(list);
    }
}
