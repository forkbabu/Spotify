package com.spotify.music.playlist.extender;

import android.content.Context;
import android.view.View;

public final /* synthetic */ class k implements View.OnLongClickListener {
    public final /* synthetic */ d0 a;
    public final /* synthetic */ Context b;

    public /* synthetic */ k(d0 d0Var, Context context) {
        this.a = d0Var;
        this.b = context;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return this.a.e0(this.b, view);
    }
}
