package defpackage;

import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.model.a;
import com.spotify.mobile.android.service.media.browser.loaders.browse.model.b;
import com.spotify.mobile.android.service.media.browser.loaders.browse.model.c;
import com.spotify.mobile.android.util.t;
import com.spotify.music.C0707R;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: bi1  reason: default package */
public class bi1 implements qh1 {
    private final Context a;
    private final tj1 b;
    private final mj1 c;
    private final t d;
    private final pj1<List<b>> e;
    private final rj1 f;

    public bi1(Context context, tj1 tj1, mj1 mj1, t tVar, pj1<List<b>> pj1, rj1 rj1) {
        this.a = context;
        this.b = tj1;
        this.c = mj1;
        this.d = tVar;
        this.e = pj1;
        this.f = rj1;
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        tj1 tj1 = this.b;
        String format = String.format("%s%s", "spotify:space_item:", "partner-recommendations");
        BrowserParams.a r = browserParams.r();
        r.i(format);
        z<b91> b2 = tj1.b(r.build());
        mj1 mj1 = this.c;
        mj1.getClass();
        return b2.A(new sg1(mj1)).f(this.e).A(new fg1(this, browserParams));
    }

    public List c(BrowserParams browserParams, u3 u3Var) {
        MediaBrowserItem b2;
        String h = browserParams.h();
        F f2 = u3Var.a;
        f2.getClass();
        F<b> f3 = f2;
        S s = u3Var.b;
        s.getClass();
        S s2 = s;
        ArrayList arrayList = new ArrayList(f3.size());
        for (b bVar : f3) {
            MediaBrowserItem mediaBrowserItem = null;
            if (bVar instanceof c) {
                c cVar = (c) bVar;
                MediaBrowserItem a2 = cVar.getKey() != null ? rj1.a(this.a, cVar, Uri.parse(mi1.c(cVar.getKey(), h))) : null;
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            if (bVar instanceof a) {
                a aVar = (a) bVar;
                if (!(aVar.a() == null || aVar.getKey() == null || (b2 = this.f.b(aVar.a(), s2, this.d)) == null || b2.h() == null)) {
                    com.spotify.mobile.android.service.media.browser.loaders.browse.b bVar2 = new com.spotify.mobile.android.service.media.browser.loaders.browse.b(Uri.parse(mi1.c(aVar.getKey(), h)));
                    bVar2.r(aVar.b());
                    bVar2.c(MediaBrowserItem.ActionType.BROWSABLE);
                    bVar2.j(gf0.g(this.a, C0707R.drawable.ic_eis_browse));
                    mediaBrowserItem = bVar2.a();
                }
                if (mediaBrowserItem != null) {
                    arrayList.add(mediaBrowserItem);
                }
            }
        }
        return arrayList;
    }
}
