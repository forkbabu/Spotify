package com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder;

import android.view.View;
import com.spotify.player.model.ContextTrack;

public final /* synthetic */ class a implements qg0 {
    public final /* synthetic */ n a;
    public final /* synthetic */ ContextTrack b;

    public /* synthetic */ a(n nVar, ContextTrack contextTrack) {
        this.a = nVar;
        this.b = contextTrack;
    }

    @Override // defpackage.qg0
    public final void accept(Object obj) {
        this.a.u0(this.b, (View) obj);
    }
}
