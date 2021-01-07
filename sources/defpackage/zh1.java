package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.model.b;
import com.spotify.mobile.android.util.t;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: zh1  reason: default package */
public class zh1 implements qh1 {
    private final tj1 a;
    private final mj1 b;
    private final t c;
    private final pj1<List<b>> d;
    private final rj1 e;
    private final qd1 f;
    private final rc1 g;

    public zh1(tj1 tj1, mj1 mj1, t tVar, pj1<List<b>> pj1, rj1 rj1, qd1 qd1, rc1 rc1) {
        this.a = tj1;
        this.b = mj1;
        this.c = tVar;
        this.d = pj1;
        this.e = rj1;
        this.f = qd1;
        this.g = rc1;
    }

    public static List d(zh1 zh1, u3 u3Var) {
        zh1.getClass();
        F<xj1> f2 = u3Var.a;
        f2.getClass();
        S s = u3Var.b;
        s.getClass();
        S s2 = s;
        ArrayList arrayList = new ArrayList(10);
        for (xj1 xj1 : f2) {
            MediaBrowserItem b2 = zh1.e.b(xj1, s2, zh1.c);
            if (b2 != null) {
                arrayList.add(b2);
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
        tj1 tj1 = this.a;
        String format = String.format("%s%s", "spotify:space_item:", "partner-recommendations");
        BrowserParams.a r = browserParams.r();
        r.i(format);
        z<b91> b2 = tj1.b(r.build());
        mj1 mj1 = this.b;
        mj1.getClass();
        return b2.A(new sg1(mj1)).f(this.d).A(new zf1(browserParams)).A(new dg1(this)).s(new yf1(this, browserParams));
    }

    public v c(BrowserParams browserParams, MediaBrowserItem mediaBrowserItem) {
        qh1 qh1;
        String e2 = mediaBrowserItem.e();
        BrowserParams.a r = browserParams.r();
        r.i(e2);
        BrowserParams build = r.build();
        if (this.f.b(build)) {
            qh1 = this.f.a();
        } else {
            qh1 = this.g.b(build) ? this.g.a() : null;
        }
        if (qh1 != null) {
            return qh1.b(build).A(bg1.a).P();
        }
        Logger.b("*** Can't find loader for %s", e2);
        return s.i0(new ArrayList(0));
    }
}
