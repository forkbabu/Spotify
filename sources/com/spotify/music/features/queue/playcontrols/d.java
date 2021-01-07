package com.spotify.music.features.queue.playcontrols;

import android.view.View;

public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ e a;

    public /* synthetic */ d(e eVar) {
        this.a = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e eVar = this.a;
        int i = QueuePlayerControlsView.p;
        eVar.c();
    }
}
