package com.spotify.music.features.yourepisodes.view;

import com.spotify.mobile.android.ui.view.y;
import com.spotify.music.features.yourepisodes.a0;
import kotlin.jvm.internal.h;

public final class v implements u {
    private final y a;
    private final a0 b;

    public v(y yVar, a0 a0Var) {
        h.e(yVar, "removeDownloadConfirmationDialog");
        h.e(a0Var, "logger");
        this.a = yVar;
        this.b = a0Var;
    }

    @Override // com.spotify.music.features.yourepisodes.view.u
    public t a(o oVar, a aVar) {
        h.e(oVar, "viewBinder");
        h.e(aVar, "headerViewBinder");
        return new x(oVar, aVar, this.a, this.b);
    }
}
