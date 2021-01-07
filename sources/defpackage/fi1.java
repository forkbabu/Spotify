package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.model.a;
import com.spotify.mobile.android.service.media.browser.loaders.browse.model.b;
import com.spotify.mobile.android.service.media.browser.loaders.browse.model.c;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.t;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: fi1  reason: default package */
public class fi1 implements qh1 {
    private final ii1 a;
    private final tj1 b;
    private final t c;
    private final mj1 d;
    private final pj1<List<b>> e;
    private final rj1 f;

    fi1(tj1 tj1, ii1 ii1, t tVar, mj1 mj1, pj1<List<b>> pj1, rj1 rj1) {
        this.a = ii1;
        this.b = tj1;
        this.c = tVar;
        this.d = mj1;
        this.e = pj1;
        this.f = rj1;
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        this.a.getClass();
        String[] split = browserParams.h().split(":");
        Assertion.k(split.length == 4, "The identifier [%s] should be a spaces identifier", browserParams.h());
        String format = String.format("%s%s", "spotify:space_item:", split[2]);
        BrowserParams.a r = browserParams.r();
        r.i(format);
        r.f(true);
        BrowserParams build = r.build();
        this.a.getClass();
        String[] split2 = browserParams.h().split(":");
        Assertion.k(split2.length == 4, "The identifier [%s] should be a spaces identifier", browserParams.h());
        String str = split2[3];
        z<b91> b2 = this.b.b(build);
        mj1 mj1 = this.d;
        mj1.getClass();
        return b2.A(new sg1(mj1)).f(this.e).A(new hg1(this, str));
    }

    public List c(String str, u3 u3Var) {
        List list;
        F f2 = u3Var.a;
        f2.getClass();
        F<b> f3 = f2;
        S s = u3Var.b;
        s.getClass();
        S s2 = s;
        ArrayList arrayList = new ArrayList(f3.size());
        for (b bVar : f3) {
            if (str.equals(bVar.getKey())) {
                if (bVar instanceof c) {
                    c cVar = (c) bVar;
                    if (cVar.a() == null) {
                        list = Collections.emptyList();
                    } else {
                        ArrayList arrayList2 = new ArrayList(cVar.a().size());
                        for (xj1 xj1 : cVar.a()) {
                            MediaBrowserItem b2 = this.f.b(xj1, s2, this.c);
                            if (b2 != null) {
                                arrayList2.add(b2);
                            }
                        }
                        list = arrayList2;
                    }
                    arrayList.addAll(list);
                } else if (bVar instanceof a) {
                    a aVar = (a) bVar;
                    MediaBrowserItem b3 = aVar.a() != null ? this.f.b(aVar.a(), s2, this.c) : null;
                    if (b3 != null) {
                        arrayList.add(b3);
                    }
                }
            }
        }
        return arrayList;
    }
}
