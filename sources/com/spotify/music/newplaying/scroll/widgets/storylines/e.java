package com.spotify.music.newplaying.scroll.widgets.storylines;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ StorylinesWidgetPresenter a;

    public /* synthetic */ e(StorylinesWidgetPresenter storylinesWidgetPresenter) {
        this.a = storylinesWidgetPresenter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d((PlayerState) obj);
    }
}
