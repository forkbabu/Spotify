package defpackage;

import android.app.Activity;
import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.libs.search.history.SearchHistoryItem;
import com.spotify.libs.search.history.j;
import com.spotify.libs.search.history.k;
import com.spotify.mobile.android.hubframework.defaults.components.custom.a;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentIdentifier;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.player.model.Context;
import com.spotify.ubi.specification.factories.q3;
import defpackage.s81;
import defpackage.wsa;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: u68  reason: default package */
public class u68 implements j, k {
    private final boolean a;
    private final psa b;
    private final q3 c;
    private final Context d;

    public u68(boolean z, psa psa, q3 q3Var, Activity activity) {
        this.a = z;
        this.b = psa;
        this.c = q3Var;
        this.d = activity;
    }

    @Override // com.spotify.libs.search.history.k
    public s81 a(SearchHistoryItem searchHistoryItem, int i, String str, boolean z) {
        o81 o81;
        String componentId = searchHistoryItem.getComponentId();
        HubsGlueRow hubsGlueRow = HubsGlueRow.NORMAL;
        HubsImmutableComponentIdentifier d2 = z81.d((String) x.n(componentId, hubsGlueRow.id()), (String) x.n(searchHistoryItem.getComponentCategory(), hubsGlueRow.category()));
        s81.a c2 = z81.c();
        StringBuilder V0 = je.V0("search-history-");
        V0.append(searchHistoryItem.getTargetUri());
        s81.a t = c2.s(V0.toString()).n(d2).y(z81.h().a(searchHistoryItem.getTitle()).d(searchHistoryItem.getSubtitle())).t(z81.f().g(h71.c(z81.e().g(searchHistoryItem.getImageUri()).c(), searchHistoryItem.getTargetUri())));
        String originUri = searchHistoryItem.getOriginUri();
        if (z && ViewUris.y.a(originUri) && !this.a) {
            originUri.getClass();
            o81 = z81.b().e("play").b("uri", originUri).b("position", Integer.valueOf(i)).c();
        } else {
            o81 = d71.a(str);
        }
        s81.a f = t.f("click", o81).f("rightAccessoryClick", z81.b().e("removeHistoryItem").b("uri", searchHistoryItem.getOriginUri()).b("position", Integer.valueOf(i)).c());
        wsa.a a2 = wsa.a();
        a2.e(this.c.c().c().b().c(Integer.valueOf(i), str).a());
        a2.a(i);
        a2.b(str);
        a2.d(Context.Metadata.SHUFFLE_ALGORITHM_HISTORY);
        s81.a c3 = f.h(pqa.a(a2.build())).d("secondary_icon", SpotifyIconV2.X.toString()).d("accessoryContentDesc", this.d.getString(C0707R.string.recent_search_row_remove_button)).c(a.a(false));
        Iterator it = ((HashSet) this.b.a(searchHistoryItem)).iterator();
        while (it.hasNext()) {
            c3 = ((dsa) it.next()).a(c3);
        }
        return c3.l();
    }

    @Override // com.spotify.libs.search.history.j
    public boolean b(SearchHistoryItem searchHistoryItem) {
        return true;
    }
}
