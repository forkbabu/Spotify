package com.spotify.music.features.podcast.entity.find;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.n;
import com.spotify.pageloader.PageLoaderView;
import kotlin.jvm.internal.h;

public final class c {
    private final cbc<o37> a;
    private final PageLoaderView.a<o37> b;

    public c(cbc<o37> cbc, PageLoaderView.a<o37> aVar) {
        h.e(cbc, "pageLoaderScope");
        h.e(aVar, "pageLoaderViewBuilder");
        this.a = cbc;
        this.b = aVar;
    }

    public View a(Context context, n nVar) {
        h.e(context, "context");
        h.e(nVar, "lifecycleOwner");
        PageLoaderView<o37> a2 = this.b.a(context);
        a2.j0(nVar, this.a.get());
        h.d(a2, "pageLoaderViewBuilder.cr…derScope.get())\n        }");
        return a2;
    }
}
