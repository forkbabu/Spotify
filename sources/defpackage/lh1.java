package defpackage;

import com.spotify.mediaitem.PlayOriginReferrer;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.playlist.models.f;
import com.spotify.playlist.models.j;
import io.reactivex.s;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: lh1  reason: default package */
public class lh1 implements qh1 {
    private final ki1 a;
    private final s<f> b;
    private final o c;

    public lh1(ki1 ki1, s<f> sVar, o oVar) {
        this.a = ki1;
        this.b = sVar;
        this.c = oVar;
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        if (browserParams.h().endsWith("genie:space")) {
            return this.a.b(browserParams);
        }
        if (browserParams.h().endsWith("genie:offline")) {
            return this.b.j0(new pf1(this)).R((R) Collections.emptyList());
        }
        return z.z(Collections.emptyList());
    }

    public /* synthetic */ List c(f fVar) {
        ArrayList arrayList = new ArrayList(fVar.getUnfilteredLength());
        for (j jVar : fVar.getItems()) {
            arrayList.add(this.c.h(jVar, false, PlayOriginReferrer.OTHER));
        }
        return arrayList;
    }
}
