package com.spotify.music.sociallistening.facepile;

import android.view.View;
import kotlin.jvm.internal.h;

final class e implements View.OnClickListener {
    final /* synthetic */ d a;

    e(d dVar) {
        this.a = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h.e(view, "view");
        View.OnClickListener X = this.a.X();
        if (X != null) {
            X.onClick(view);
        }
    }
}
