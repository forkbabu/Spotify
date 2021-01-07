package com.spotify.music.features.freetierartist.discographysortandfilter;

import android.widget.LinearLayout;
import kotlin.jvm.internal.h;

public final class b implements a {
    private final d a;

    public b(d dVar) {
        h.e(dVar, "discographyFilterRepository");
        this.a = dVar;
    }

    @Override // com.spotify.music.features.freetierartist.discographysortandfilter.a
    public void a(LinearLayout linearLayout) {
        h.e(linearLayout, "parentView");
        this.a.b("");
    }

    @Override // com.spotify.music.features.freetierartist.discographysortandfilter.a
    public void b(LinearLayout linearLayout, int i, String str) {
        h.e(linearLayout, "parentView");
        d dVar = this.a;
        if (str == null) {
            str = "";
        }
        dVar.b(str);
    }
}
