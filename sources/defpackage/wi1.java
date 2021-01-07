package defpackage;

import android.content.Context;
import com.spotify.mediaitem.PlayOriginReferrer;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.music.libs.podcast.loader.h;
import com.spotify.music.libs.podcast.loader.i;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.playlist.models.Episode;
import defpackage.ff0;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* renamed from: wi1  reason: default package */
public class wi1 implements qh1 {
    private final o a;
    private final cf0 b;
    private final Context c;
    private final s<String> d;
    private final i e;

    public wi1(Context context, s<String> sVar, i iVar, o oVar, cf0 cf0) {
        this.c = context;
        this.d = sVar;
        this.e = iVar;
        this.a = oVar;
        this.b = cf0;
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        return this.d.J0(new ng1(this)).B0().A(new mg1(this));
    }

    public /* synthetic */ String c(ff0 ff0, Episode episode) {
        return this.b.b(this.c.getResources(), ff0);
    }

    public v d(String str) {
        h hVar = new h(this.e, str, false);
        hVar.b().g(false, true, false);
        return hVar.a();
    }

    public List e(com.spotify.playlist.models.i iVar) {
        Episode[] episodeArr = (Episode[]) iVar.getItems().toArray(new Episode[0]);
        ArrayList arrayList = new ArrayList(episodeArr.length);
        for (Episode episode : episodeArr) {
            o oVar = this.a;
            String cVar = ViewUris.w1.toString();
            ff0.a a2 = ff0.a();
            a2.d(episode.j());
            a2.g(episode.x());
            a2.c(episode.E());
            a2.e(new Date(((long) episode.u()) * 1000));
            a2.b(false);
            arrayList.add(oVar.e(episode, cVar, new lg1(this, a2.a()), PlayOriginReferrer.LIBRARY));
        }
        return arrayList;
    }
}
