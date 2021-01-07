package com.spotify.nowplaying.ui.components.controls.previous;

import com.spotify.player.model.Restrictions;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ e a;

    public /* synthetic */ b(e eVar) {
        this.a = eVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        e.b(this.a, (Restrictions) obj);
    }
}
