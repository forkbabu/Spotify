package com.spotify.nowplaying.ui.components.controls.seekbar.live;

import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ e a;

    public /* synthetic */ a(e eVar) {
        this.a = eVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.setVisible(((Boolean) obj).booleanValue());
    }
}
