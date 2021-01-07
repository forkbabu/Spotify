package com.spotify.music.libs.collection.service;

import android.view.View;

public final /* synthetic */ class j implements View.OnClickListener {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ j(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.run();
    }
}
