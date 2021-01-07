package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.collect.ImmutableMap;
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

/* renamed from: ao9  reason: default package */
public class ao9 implements qh1 {
    private final Context a;
    private final t b;
    private final cj1 c;
    private final Map<String, String> d;
    private final mj1 e;
    private final pj1<List<b>> f;
    private final rj1 g;
    private final dj1 h;

    public ao9(Context context, t tVar, cqe cqe, cj1 cj1, mj1 mj1, pj1<List<b>> pj1, rj1 rj1, String str, dj1 dj1) {
        this.a = context;
        this.b = tVar;
        this.c = cj1;
        this.e = mj1;
        this.f = pj1;
        this.g = rj1;
        this.h = dj1;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("platform", "android");
        builder.mo51put("locale", str);
        builder.mo51put("client-timezone", cqe.f().getID());
        builder.mo51put("show_all_playlist_titles", String.valueOf(true));
        this.d = builder.build();
    }

    public static boolean c(String str) {
        return str.contains("spotify:home-view");
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        if (c(browserParams.h())) {
            ArrayList arrayList = new ArrayList(1);
            for (b bVar : this.h.a()) {
                if ((bVar instanceof c) && bVar.getKey().equals(browserParams.h().split(":")[2])) {
                    c cVar = (c) bVar;
                    String b2 = this.h.b();
                    ArrayList arrayList2 = new ArrayList(10);
                    if (cVar.a() != null) {
                        for (xj1 xj1 : cVar.a()) {
                            MediaBrowserItem b3 = this.g.b(xj1, b2, this.b);
                            if (b3 != null) {
                                arrayList2.add(b3);
                            }
                        }
                    }
                    arrayList.addAll(arrayList2);
                }
            }
            return z.z(arrayList);
        }
        z<U> e2 = this.c.a(this.d).e(b91.class);
        mj1 mj1 = this.e;
        mj1.getClass();
        return e2.A(new zn9(mj1)).f(this.f).A(new xn9(this));
    }

    public List d(u3 u3Var) {
        F f2 = u3Var.a;
        if (f2 != null) {
            this.h.c(f2);
            dj1 dj1 = this.h;
            S s = u3Var.b;
            s.getClass();
            dj1.d(s);
        }
        F f3 = u3Var.a;
        f3.getClass();
        F<b> f4 = f3;
        S s2 = u3Var.b;
        s2.getClass();
        S s3 = s2;
        ArrayList arrayList = new ArrayList(f4.size());
        for (b bVar : f4) {
            MediaBrowserItem mediaBrowserItem = null;
            if (bVar instanceof c) {
                c cVar = (c) bVar;
                MediaBrowserItem a2 = cVar.getKey() != null ? rj1.a(this.a, cVar, Uri.parse(String.format("%s:%s", "spotify:home-view", cVar.getKey()))) : null;
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            if (bVar instanceof a) {
                a aVar = (a) bVar;
                if (aVar.a() != null) {
                    mediaBrowserItem = this.g.b(aVar.a(), s3, this.b);
                }
                if (mediaBrowserItem != null) {
                    arrayList.add(mediaBrowserItem);
                }
            }
        }
        return arrayList.subList(0, 5);
    }
}
