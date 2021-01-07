package com.spotify.music.libs.yourepisodes.views.tooltip;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.mobile.android.spotlets.tooltip.a;
import com.spotify.mobile.android.spotlets.tooltip.c;
import kotlin.jvm.internal.h;

public final class g implements f {
    private final lbb a;
    private final k b;
    private final a c;
    private final n d;

    public g(lbb lbb, k kVar, a aVar, n nVar) {
        h.e(lbb, "flags");
        h.e(kVar, "prefs");
        h.e(aVar, "builderFactory");
        h.e(nVar, "scrollViewObservableFactory");
        this.a = lbb;
        this.b = kVar;
        this.c = aVar;
        this.d = nVar;
    }

    @Override // com.spotify.music.libs.yourepisodes.views.tooltip.f
    public boolean a() {
        return this.a.e() && !this.b.b();
    }

    @Override // com.spotify.music.libs.yourepisodes.views.tooltip.f
    public void b(View view, AppBarLayout appBarLayout) {
        h.e(view, "anchor");
        h.e(appBarLayout, "header");
        c a2 = this.d.a(appBarLayout);
        a.C0193a a3 = this.c.a();
        a3.a(a2);
        a3.c(view);
        this.b.a();
    }
}
