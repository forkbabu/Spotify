package com.spotify.music.newplaying.scroll.widgets.storylines;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class s implements l {
    public final /* synthetic */ StorylinesWidgetPresenter a;

    public /* synthetic */ s(StorylinesWidgetPresenter storylinesWidgetPresenter) {
        this.a = storylinesWidgetPresenter;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return StorylinesWidgetPresenter.f(this.a, (PlayerState) obj);
    }
}
