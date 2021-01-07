package defpackage;

import com.spotify.music.features.podcast.entity.find.loaded.g;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import kotlin.jvm.internal.h;

/* renamed from: q37  reason: default package */
public abstract class q37 {
    public static final PageLoaderView.a<o37> a(zac zac, c.a aVar, ij9 ij9, g.a aVar2) {
        h.e(zac, "factory");
        h.e(aVar, "viewUriProvider");
        h.e(ij9, "pageViewObservable");
        h.e(aVar2, "loadedPageElementFactory");
        PageLoaderView.a<o37> b = zac.b(aVar.getViewUri(), ij9);
        b.e(new p37(aVar2));
        h.d(b, "factory.createViewBuilde…data) }\n                }");
        return b;
    }
}
