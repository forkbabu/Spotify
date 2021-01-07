package com.spotify.music.nowplaying.musicvideotoggle.widget.previousbutton;

import com.spotify.player.model.Restrictions;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ d a;

    public /* synthetic */ b(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        d.b(this.a, (Restrictions) obj);
    }
}
