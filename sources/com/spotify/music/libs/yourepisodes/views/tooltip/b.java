package com.spotify.music.libs.yourepisodes.views.tooltip;

import android.app.Activity;
import com.spotify.mobile.android.spotlets.tooltip.a;
import kotlin.jvm.internal.h;

public final class b implements a {
    private final Activity a;
    private final a b;
    private final d c;

    public b(Activity activity, a aVar, d dVar) {
        h.e(activity, "activity");
        h.e(aVar, "tooltipManager");
        h.e(dVar, "configuration");
        this.a = activity;
        this.b = aVar;
        this.c = dVar;
    }

    @Override // com.spotify.music.libs.yourepisodes.views.tooltip.a
    public a.C0193a a() {
        a.C0193a a2 = this.b.a(this.a);
        a2.b(this.c);
        h.d(a2, "tooltipManager.buildTool…figuration(configuration)");
        return a2;
    }
}
