package defpackage;

import android.content.Context;
import com.spotify.libs.album.AlbumDisc;
import com.spotify.libs.album.AlbumRelease;
import com.spotify.libs.album.a;
import com.spotify.libs.album.c;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.mobile.android.service.media.browser.s;
import com.spotify.mobile.android.util.l0;
import io.reactivex.z;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: tg1  reason: default package */
public class tg1 implements qh1 {
    private final Context a;
    private final a b;
    private final o c;

    tg1(Context context, a aVar, o oVar) {
        this.a = context;
        this.b = aVar;
        this.c = oVar;
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        String h = browserParams.h();
        return this.b.a(l0.z(h).i()).A(new bf1(this, h, browserParams));
    }

    public List c(String str, BrowserParams browserParams, AlbumRelease albumRelease) {
        boolean q = BrowserParams.q(browserParams.j());
        LinkedList linkedList = new LinkedList();
        for (AlbumDisc albumDisc : albumRelease.getDiscs()) {
            for (c cVar : albumDisc.getTracks()) {
                if (cVar.f()) {
                    linkedList.add(this.c.b(cVar, str, albumRelease.getCover()));
                }
            }
        }
        if (!linkedList.isEmpty() && q) {
            linkedList.addFirst(s.a(this.a, str));
        }
        return linkedList;
    }
}
