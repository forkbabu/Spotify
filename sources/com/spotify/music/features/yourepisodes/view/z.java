package com.spotify.music.features.yourepisodes.view;

import com.spotify.mobile.android.ui.view.y;
import com.spotify.music.features.yourepisodes.domain.HeaderAction;
import com.spotify.music.features.yourepisodes.domain.j;

/* access modifiers changed from: package-private */
public final class z implements y.b {
    final /* synthetic */ x a;

    z(x xVar) {
        this.a = xVar;
    }

    @Override // com.spotify.mobile.android.ui.view.y.b
    public final void a() {
        this.a.n.d();
        x.b(this.a).accept(new j.b(HeaderAction.REMOVE_DOWNLOADS));
    }
}
