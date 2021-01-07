package com.spotify.music.playlist.ui;

import android.view.View;
import com.spotify.playlist.models.l;

public final /* synthetic */ class p implements View.OnClickListener {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ l c;

    public /* synthetic */ p(m0 m0Var, int i, l lVar) {
        this.a = m0Var;
        this.b = i;
        this.c = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.q(this.b, this.c, view);
    }
}
