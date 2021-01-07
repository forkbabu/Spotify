package com.spotify.nowplaying.ui.components.controls.seekbackward;

import com.spotify.player.model.Restrictions;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ h a;

    public /* synthetic */ e(h hVar) {
        this.a = hVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        h.b(this.a, (Restrictions) obj);
    }
}
