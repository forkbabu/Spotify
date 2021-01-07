package defpackage;

import android.net.Uri;
import com.spotify.image.provider.MediaUriUtil;
import com.spotify.mediaitem.PlayOriginReferrer;
import com.spotify.mediaitem.a;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.b;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.libs.podcast.loader.k;
import com.spotify.music.libs.podcast.loader.t;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.q;
import io.reactivex.s;
import io.reactivex.z;
import java.util.List;
import java.util.Map;

/* renamed from: aj1  reason: default package */
public class aj1 implements qh1 {
    private final o a;
    private final s<String> b;
    private final k c;

    public aj1(s<String> sVar, k kVar, o oVar) {
        this.b = sVar;
        this.a = oVar;
        this.c = kVar;
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        return this.b.j0(new qf1(this)).J0(rg1.a).B0().s(new pg1(this));
    }

    /* access modifiers changed from: package-private */
    public t c(String str) {
        t tVar = new t(this.c, str);
        SortOption sortOption = new SortOption("latestPublishedEpisodeDate", true);
        sortOption.h(true, false);
        tVar.b().e(sortOption);
        tVar.b().b(Show.MediaType.VIDEO);
        return tVar;
    }

    public MediaBrowserItem d(Show show) {
        o oVar = this.a;
        PlayOriginReferrer playOriginReferrer = PlayOriginReferrer.LIBRARY;
        oVar.getClass();
        b bVar = new b(show.getUri());
        bVar.c(MediaBrowserItem.ActionType.BROWSABLE);
        bVar.j(Uri.parse(q.c(show.c(), Covers.Size.NORMAL)));
        bVar.s(MediaUriUtil.Transformation.ROUNDED_CORNER);
        a aVar = new a();
        aVar.f(1);
        aVar.o(playOriginReferrer);
        bVar.i(aVar.b());
        bVar.r(show.h());
        return bVar.a();
    }
}
