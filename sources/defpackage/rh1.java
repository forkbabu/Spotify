package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.mediaitem.PlayOriginReferrer;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.k;
import com.spotify.playlist.models.l;
import defpackage.ff0;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* renamed from: rh1  reason: default package */
public class rh1 implements qh1 {
    private final Context a;
    private final d b;
    private final o c;
    private final cf0 d;
    private final d.b e;

    public rh1(Context context, d dVar, o oVar, cf0 cf0) {
        this.a = context;
        this.b = dVar;
        this.c = oVar;
        this.d = cf0;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        ImmutableMap H = je.H(builder, "name", bool, "covers", bool);
        ImmutableMap.Builder builder2 = ImmutableMap.builder();
        builder2.mo51put("link", bool);
        builder2.mo51put("name", bool);
        builder2.mo51put("isExplicit", bool);
        builder2.mo51put("is19PlusOnly", bool);
        builder2.mo51put("isPremiumOnly", bool);
        builder2.mo51put("playable", bool);
        builder2.mo51put("offline", bool);
        builder2.mo51put("covers", bool);
        builder2.mo51put("duration", bool);
        builder2.mo51put("imageUri", bool);
        builder2.mo51put("isNew", bool);
        builder2.mo51put("isPlayed", bool);
        builder2.mo51put("lastPlayedAt", bool);
        builder2.mo51put("timeLeft", bool);
        ImmutableMap H2 = je.H(builder2, "publishDate", bool, "length", bool);
        ListPolicy.a builder3 = ListPolicy.builder();
        builder3.d(H2);
        builder3.b(H);
        builder3.c(ImmutableMap.of("name", bool));
        builder3.a(ImmutableMap.of());
        builder3.g(ImmutableMap.of());
        ListPolicy e2 = builder3.e();
        HeaderPolicy.a builder4 = HeaderPolicy.builder();
        builder4.a(ImmutableMap.of("link", bool));
        HeaderPolicy b2 = builder4.b();
        DecorationPolicy.a builder5 = DecorationPolicy.builder();
        builder5.b(b2);
        builder5.c(e2);
        DecorationPolicy a2 = builder5.a();
        Policy.a builder6 = Policy.builder();
        builder6.b(a2);
        Policy a3 = builder6.a();
        d.b.a b3 = d.b.b();
        b3.c(true);
        b3.j(Boolean.FALSE);
        b3.g(a3);
        this.e = b3.b();
    }

    public static List d(rh1 rh1, k kVar) {
        rh1.getClass();
        ArrayList arrayList = new ArrayList(kVar.getItems().size());
        String uri = kVar.j().getUri();
        for (l lVar : kVar.getItems()) {
            if (lVar.g() != null) {
                arrayList.add(rh1.c.i(lVar.g(), uri));
            } else if (lVar.c() != null) {
                o oVar = rh1.c;
                Episode c2 = lVar.c();
                Episode c3 = lVar.c();
                ff0.a a2 = ff0.a();
                a2.d(c3.j());
                a2.g(c3.x());
                a2.c(c3.E());
                a2.e(new Date(((long) c3.u()) * 1000));
                a2.b(false);
                arrayList.add(oVar.e(c2, uri, new sf1(rh1, a2.a()), PlayOriginReferrer.OTHER));
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
        return this.b.d(browserParams.h(), this.e).A(new tf1(this));
    }

    public /* synthetic */ String c(ff0 ff0, Episode episode) {
        return this.d.b(this.a.getResources(), ff0);
    }
}
