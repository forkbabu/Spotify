package com.spotify.music.playlist.ui;

import android.view.View;
import com.spotify.playlist.models.l;

public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ l c;
    public final /* synthetic */ boolean f;

    public /* synthetic */ s(m0 m0Var, int i, l lVar, boolean z) {
        this.a = m0Var;
        this.b = i;
        this.c = lVar;
        this.f = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.i(this.b, this.c, this.f, view);
    }
}
