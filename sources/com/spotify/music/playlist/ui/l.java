package com.spotify.music.playlist.ui;

import android.view.View;

public final /* synthetic */ class l implements View.OnClickListener {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ View.OnLongClickListener c;
    public final /* synthetic */ int f;
    public final /* synthetic */ com.spotify.playlist.models.l n;

    public /* synthetic */ l(m0 m0Var, boolean z, View.OnLongClickListener onLongClickListener, int i, com.spotify.playlist.models.l lVar) {
        this.a = m0Var;
        this.b = z;
        this.c = onLongClickListener;
        this.f = i;
        this.n = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.h(this.b, this.c, this.f, this.n, view);
    }
}
