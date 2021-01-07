package defpackage;

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

/* renamed from: di1  reason: default package */
public class di1 implements qh1 {
    private final tj1 a;
    private final jj1 b;
    private final mj1 c;
    private final t d;
    private final pj1<List<b>> e;
    private final oj1<List<b>> f;
    private final rj1 g;

    public di1(tj1 tj1, jj1 jj1, mj1 mj1, t tVar, pj1<List<b>> pj1, oj1<List<b>> oj1, rj1 rj1) {
        this.a = tj1;
        this.b = jj1;
        this.c = mj1;
        this.d = tVar;
        this.e = pj1;
        this.f = oj1;
        this.g = rj1;
    }

    private static BrowserParams c(BrowserParams browserParams) {
        String format = String.format("%s%s", "spotify:space_item:", "partner-recommendations");
        BrowserParams.a r = browserParams.r();
        r.i(format);
        return r.build();
    }

    public static List d(di1 di1, u3 u3Var) {
        di1.getClass();
        F f2 = u3Var.a;
        f2.getClass();
        F<b> f3 = f2;
        S s = u3Var.b;
        s.getClass();
        S s2 = s;
        ArrayList arrayList = new ArrayList(f3.size());
        for (b bVar : f3) {
            if (bVar instanceof c) {
                c cVar = (c) bVar;
                ArrayList arrayList2 = new ArrayList(5);
                if (cVar.a() != null) {
                    for (xj1 xj1 : cVar.a()) {
                        MediaBrowserItem b2 = di1.g.b(xj1, s2, di1.d);
                        if (b2 != null) {
                            arrayList2.add(b2);
                        }
                    }
                }
                arrayList.addAll(arrayList2);
            }
            if (bVar instanceof a) {
                a aVar = (a) bVar;
                MediaBrowserItem b3 = aVar.a() != null ? di1.g.b(aVar.a(), s2, di1.d) : null;
                if (b3 != null) {
                    arrayList.add(b3);
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        z<b91> zVar;
        Object obj;
        if (browserParams.m()) {
            zVar = this.a.b(c(browserParams));
        } else {
            zVar = this.b.a(c(browserParams));
        }
        mj1 mj1 = this.c;
        mj1.getClass();
        z A = zVar.A(new sg1(mj1));
        if (browserParams.m()) {
            obj = this.e;
        } else {
            obj = this.f;
        }
        return A.f(obj).A(new gg1(this));
    }
}
