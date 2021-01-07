package com.spotify.music.playlist.ui;

import android.view.View;

public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ View b;

    public /* synthetic */ j(e0 e0Var, View view) {
        this.a = e0Var;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.b);
    }
}
