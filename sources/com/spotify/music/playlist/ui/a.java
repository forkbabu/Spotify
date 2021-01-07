package com.spotify.music.playlist.ui;

import android.view.View;

public final /* synthetic */ class a implements View.OnLongClickListener {
    public final /* synthetic */ x a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(x xVar, Object obj) {
        this.a = xVar;
        this.b = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.a.f(this.b, view);
        return true;
    }
}
