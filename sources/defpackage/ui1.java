package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.spotify.mobile.android.converter.ConvertProductValueException;
import com.spotify.mobile.android.converter.a;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.b;
import com.spotify.music.C0707R;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: ui1  reason: default package */
public class ui1 implements qh1 {
    private final Context a;

    public ui1(Context context) {
        this.a = context;
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> a(BrowserParams browserParams, Map<String, String> map) {
        Boolean bool;
        try {
            bool = Boolean.valueOf(a.a(map.get("shows-collection")));
        } catch (ConvertProductValueException unused) {
            bool = Boolean.FALSE;
        }
        ArrayList arrayList = new ArrayList(6);
        Context context = this.a;
        com.spotify.mediaitem.a aVar = new com.spotify.mediaitem.a();
        aVar.f(1);
        Bundle b = aVar.b();
        b bVar = new b("com.spotify.your-playlists");
        MediaBrowserItem.ActionType actionType = MediaBrowserItem.ActionType.BROWSABLE;
        bVar.c(actionType);
        bVar.r(context.getString(C0707R.string.collection_start_playlists_title));
        bVar.j(gf0.g(context, C0707R.drawable.ic_eis_playlists));
        bVar.d(true);
        bVar.i(b);
        arrayList.add(bVar.a());
        Context context2 = this.a;
        com.spotify.mediaitem.a aVar2 = new com.spotify.mediaitem.a();
        aVar2.f(1);
        Bundle b2 = aVar2.b();
        b bVar2 = new b("com.spotify.your-albums");
        bVar2.c(actionType);
        bVar2.r(context2.getString(C0707R.string.collection_start_albums_title));
        bVar2.j(gf0.g(context2, C0707R.drawable.ic_eis_albums));
        bVar2.d(true);
        bVar2.i(b2);
        arrayList.add(bVar2.a());
        Context context3 = this.a;
        com.spotify.mediaitem.a aVar3 = new com.spotify.mediaitem.a();
        aVar3.f(1);
        Bundle b3 = aVar3.b();
        b bVar3 = new b("com.spotify.your-artists");
        bVar3.c(actionType);
        bVar3.r(context3.getString(C0707R.string.collection_start_artists_title));
        bVar3.j(gf0.g(context3, C0707R.drawable.ic_eis_artists));
        bVar3.d(true);
        bVar3.i(b3);
        arrayList.add(bVar3.a());
        if (bool.booleanValue()) {
            Context context4 = this.a;
            com.spotify.mediaitem.a aVar4 = new com.spotify.mediaitem.a();
            aVar4.f(1);
            Bundle b4 = aVar4.b();
            b bVar4 = new b("com.spotify.your-podcasts");
            bVar4.c(actionType);
            bVar4.r(context4.getString(C0707R.string.collection_start_shows_title_podcasts_only));
            bVar4.j(gf0.g(context4, C0707R.drawable.ic_eis_podcasts));
            bVar4.d(true);
            bVar4.i(b4);
            arrayList.add(bVar4.a());
        }
        return z.z(arrayList);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        return z.q(new UnsupportedOperationException());
    }
}
