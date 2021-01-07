package defpackage;

import android.content.Context;
import com.spotify.mediaitem.PlayOriginReferrer;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.t;
import com.spotify.music.libs.podcast.loader.m;
import com.spotify.music.libs.podcast.loader.o;
import com.spotify.playlist.models.Episode;
import defpackage.ff0;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* renamed from: th1  reason: default package */
public class th1 implements qh1 {
    private final Context a;
    private final o b;
    private final t c;
    private final com.spotify.mobile.android.service.media.browser.o d;
    private final cf0 e;

    public th1(Context context, o oVar, t tVar, cf0 cf0, com.spotify.mobile.android.service.media.browser.o oVar2) {
        this.a = context;
        this.b = oVar;
        this.c = tVar;
        this.e = cf0;
        this.d = oVar2;
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        m c2 = this.b.c(browserParams.h());
        c2.b().h(0, 30);
        c2.b().f(false, !browserParams.n(), false);
        return this.c.a(browserParams.h()).s(new wf1(c2)).A(new uf1(this, browserParams));
    }

    public /* synthetic */ String c(ff0 ff0, Episode episode) {
        return this.e.b(this.a.getResources(), ff0);
    }

    public List d(BrowserParams browserParams, qyd qyd) {
        ArrayList arrayList = new ArrayList(qyd.getItems().size());
        for (Episode episode : qyd.getItems()) {
            com.spotify.mobile.android.service.media.browser.o oVar = this.d;
            String h = browserParams.h();
            ff0.a a2 = ff0.a();
            a2.d(episode.j());
            a2.g(episode.x());
            a2.c(episode.E());
            a2.e(new Date(((long) episode.u()) * 1000));
            a2.b(false);
            arrayList.add(oVar.e(episode, h, new vf1(this, a2.a()), PlayOriginReferrer.OTHER));
        }
        return arrayList;
    }
}
