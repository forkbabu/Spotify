package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.mobile.android.service.media.browser.s;
import com.spotify.music.libs.collection.model.c;
import io.reactivex.z;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: hh1  reason: default package */
public class hh1 implements qh1 {
    private final Context a;
    private final q9a b;
    private final o c;

    hh1(Context context, q9a q9a, o oVar) {
        this.a = context;
        this.b = q9a;
        this.c = oVar;
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        String h = browserParams.h();
        p9a b2 = this.b.b(h);
        b2.b().d(true);
        b2.b().e(true ^ browserParams.n());
        return b2.a().N0(1).B0().A(new nf1(this, h, browserParams));
    }

    public /* synthetic */ List c(String str, BrowserParams browserParams, c cVar) {
        LinkedList linkedList = new LinkedList();
        for (com.spotify.playlist.models.o oVar : cVar.getItems()) {
            linkedList.add(this.c.i(oVar, str));
        }
        if (!linkedList.isEmpty() && BrowserParams.q(browserParams.j())) {
            linkedList.addFirst(s.a(this.a, str));
        }
        return linkedList;
    }
}
