package defpackage;

import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.model.a;
import com.spotify.mobile.android.service.media.browser.loaders.browse.model.b;
import com.spotify.mobile.android.service.media.browser.loaders.browse.model.c;
import com.spotify.mobile.android.util.t;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: mi1  reason: default package */
public class mi1 implements qh1 {
    private final Context a;
    private final tj1 b;
    private final mj1 c;
    private final t d;
    private final pj1<List<b>> e;
    private final rj1 f;

    mi1(Context context, tj1 tj1, mj1 mj1, t tVar, pj1<List<b>> pj1, rj1 rj1) {
        this.a = context;
        this.b = tj1;
        this.c = mj1;
        this.d = tVar;
        this.e = pj1;
        this.f = rj1;
    }

    public static String c(String str, String str2) {
        return String.format("%s:%s", str2, str);
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        z<b91> b2 = this.b.b(browserParams);
        mj1 mj1 = this.c;
        mj1.getClass();
        return b2.A(new sg1(mj1)).f(this.e).A(new ig1(this, browserParams));
    }

    public List d(BrowserParams browserParams, u3 u3Var) {
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
                MediaBrowserItem a2 = cVar.getKey() != null ? rj1.a(this.a, cVar, Uri.parse(c(cVar.getKey(), h))) : null;
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            if (bVar instanceof a) {
                a aVar = (a) bVar;
                if (aVar.a() != null) {
                    mediaBrowserItem = this.f.b(aVar.a(), s2, this.d);
                }
                if (mediaBrowserItem != null) {
                    arrayList.add(mediaBrowserItem);
                }
            }
        }
        return arrayList;
    }
}
