package defpackage;

import android.view.View;
import com.spotify.music.features.followfeed.hubs.components.a;
import com.spotify.music.features.followfeed.hubs.components.c;
import com.spotify.music.features.followfeed.hubs.components.g;
import com.spotify.music.features.followfeed.hubs.components.i;
import com.spotify.music.features.followfeed.hubs.components.k;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: w15  reason: default package */
public final class w15 implements v51, u51 {
    private final List<String> a;
    private final Map<String, s51<? extends View>> b;

    public w15(k kVar, c cVar, g gVar, a aVar, i iVar) {
        h.e(kVar, "staticReleaseComponentBinder");
        h.e(cVar, "expandableReleaseComponentBinder");
        h.e(gVar, "followRecsComponentBinder");
        h.e(aVar, "automatedMessagingComponentBinder");
        h.e(iVar, "loadingIndicatorComponentBinder");
        Map<String, s51<? extends View>> y = d.y(new Pair("feed:staticReleaseItem", kVar), new Pair("feed:expandableReleaseItem", cVar), new Pair("feed:followRecs", gVar), new Pair("feed:automatedMessagingItem", aVar), new Pair("feed:loadingIndicator", iVar));
        this.b = y;
        this.a = d.Q(y.keySet());
    }

    @Override // defpackage.u51
    public s51<?> a(int i) {
        int i2 = i - 1;
        int size = this.a.size();
        if (i2 >= 0 && size > i2) {
            return this.b.get(this.a.get(i2));
        }
        return null;
    }

    @Override // defpackage.v51
    public int d(s81 s81) {
        h.e(s81, "model");
        return this.a.indexOf(s81.componentId().id()) + 1;
    }
}
