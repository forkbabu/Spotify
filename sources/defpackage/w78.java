package defpackage;

import com.spotify.music.features.search.SearchDrillDownFragment;
import com.spotify.music.features.search.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;

/* renamed from: w78  reason: default package */
public final class w78 {
    public static PageLoaderView.a<b91> a(zac zac, c.a aVar, ij9 ij9, d dVar) {
        PageLoaderView.a<b91> b = zac.b(((SearchDrillDownFragment) aVar).getViewUri(), ij9);
        b.e(new h78(dVar));
        b.g(e78.a);
        return b;
    }
}
