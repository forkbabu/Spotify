package com.spotify.music.features.podcast.entity.di;

import com.spotify.music.features.podcast.entity.loadedpage.data.a;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import kotlin.jvm.internal.h;

public abstract class n0 {
    public static final PageLoaderView.a<a> a(zac zac, c.a aVar, ij9 ij9, t47 t47) {
        h.e(zac, "factory");
        h.e(aVar, "viewUriProvider");
        h.e(ij9, "pageViewObservable");
        h.e(t47, "loadedPageElementFactory");
        PageLoaderView.a<a> b = zac.b(aVar.getViewUri(), ij9);
        h.d(b, "factory.createViewBuilde…wUri, pageViewObservable)");
        b.e(new l0(t47));
        b.g(m0.a);
        h.d(b, "builder\n                …      )\n                }");
        return b;
    }
}
