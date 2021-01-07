package com.spotify.music.podcast.freetierlikes.tabs.di;

import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import defpackage.llc;
import kotlin.jvm.internal.h;

public final class s implements fjf<PageLoaderView.a<wjc>> {
    private final wlf<zac> a;
    private final wlf<c.a> b;
    private final wlf<com.spotify.mobile.android.ui.fragments.s> c;
    private final wlf<llc.a> d;

    public s(wlf<zac> wlf, wlf<c.a> wlf2, wlf<com.spotify.mobile.android.ui.fragments.s> wlf3, wlf<llc.a> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        zac zac = this.a.get();
        c.a aVar = this.b.get();
        com.spotify.mobile.android.ui.fragments.s sVar = this.c.get();
        llc.a aVar2 = this.d.get();
        h.e(zac, "factory");
        h.e(aVar, "viewUriProvider");
        h.e(sVar, "fragmentIdentifier");
        h.e(aVar2, "loadedPageFactory");
        PageLoaderView.a b2 = zac.b(aVar.getViewUri(), sVar.u0());
        b2.e(new q(new PodcastTabPageLoaderModule$Companion$providePageLoaderView$1(aVar2)));
        h.d(b2, "factory.createViewBuilde…oadedPageFactory::create)");
        return b2;
    }
}
