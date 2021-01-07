package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.b;
import com.spotify.music.C0707R;
import io.reactivex.d0;
import io.reactivex.z;
import java.util.List;
import java.util.Map;

/* renamed from: jh1  reason: default package */
public class jh1 implements qh1 {
    private final od1 a;
    private final ki1 b;
    private final Context c;

    public jh1(od1 od1, ki1 ki1, Context context) {
        this.a = od1;
        this.b = ki1;
        this.c = context;
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        return this.a.a().b(browserParams).s(new of1(this, browserParams));
    }

    public d0 c(BrowserParams browserParams, List list) {
        if (browserParams.n() || list.isEmpty()) {
            return this.b.b(browserParams);
        }
        od1 od1 = this.a;
        Context context = this.c;
        od1.getClass();
        b bVar = new b(Uri.parse("com.spotify.offline"));
        bVar.r(context.getString(C0707R.string.collection_title_your_library_offline));
        bVar.c(MediaBrowserItem.ActionType.BROWSABLE);
        bVar.j(gf0.g(context, C0707R.drawable.ic_eis_browse));
        return z.z(ImmutableList.of(bVar.a()));
    }
}
