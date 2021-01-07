package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mediaitem.PlayOriginReferrer;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.music.libs.collection.model.d;
import com.spotify.playlist.models.a;
import com.spotify.remoteconfig.x4;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: qi1  reason: default package */
public class qi1 implements qh1 {
    private static final Policy d;
    private final t9a a;
    private final x4 b;
    private final o c;

    static {
        ListPolicy listPolicy = new ListPolicy();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        builder.mo51put("link", bool);
        builder.mo51put("name", bool);
        builder.mo51put("covers", bool);
        builder.mo51put("offline", bool);
        builder.mo51put("playable", bool);
        listPolicy.setListAttributes(builder.build());
        listPolicy.setArtistAttributes(Collections.singletonMap("name", bool));
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        d = new Policy(decorationPolicy);
    }

    public qi1(t9a t9a, x4 x4Var, o oVar) {
        this.a = t9a;
        this.b = x4Var;
        this.c = oVar;
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> a(BrowserParams browserParams, Map<String, String> map) {
        String str = map.get("type");
        if (str == null) {
            return z.q(new IllegalStateException());
        }
        boolean equals = str.equals("premium");
        s9a b2 = this.a.b();
        b2.a().d(false, !browserParams.n(), false);
        return b2.d(d).T().A(new jg1(this, equals, browserParams));
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        return z.q(new UnsupportedOperationException());
    }

    public /* synthetic */ List c(boolean z, BrowserParams browserParams, d dVar) {
        boolean z2 = this.b.a() && z && browserParams.l();
        List<a> items = dVar.getItems();
        ArrayList arrayList = new ArrayList(items.size());
        for (a aVar : items) {
            arrayList.add(this.c.a(aVar, z2, PlayOriginReferrer.LIBRARY));
        }
        return arrayList;
    }
}
