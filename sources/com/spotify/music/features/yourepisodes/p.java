package com.spotify.music.features.yourepisodes;

import com.spotify.music.features.yourepisodes.interactor.c;
import com.spotify.music.features.yourepisodes.view.n;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import defpackage.ij9;
import io.reactivex.functions.l;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class p implements fjf<PageLoaderView.a<s<c>>> {
    private final wlf<zac> a;
    private final wlf<c.a> b;
    private final wlf<ij9.b> c;
    private final wlf<l<s<com.spotify.music.features.yourepisodes.interactor.c>, n>> d;

    public p(wlf<zac> wlf, wlf<c.a> wlf2, wlf<ij9.b> wlf3, wlf<l<s<com.spotify.music.features.yourepisodes.interactor.c>, n>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        zac zac = this.a.get();
        c.a aVar = this.b.get();
        ij9.b bVar = this.c.get();
        l<s<com.spotify.music.features.yourepisodes.interactor.c>, n> lVar = this.d.get();
        h.e(zac, "pageLoaderFactory");
        h.e(aVar, "viewUriProvider");
        h.e(bVar, "pageViewObservableProvider");
        h.e(lVar, "pageElementProvider");
        PageLoaderView.a b2 = zac.b(aVar.getViewUri(), bVar.u0());
        b2.e(new l(lVar));
        h.d(b2, "builder.loaded { data ->…entProvider.apply(data) }");
        return b2;
    }
}
