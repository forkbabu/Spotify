package com.spotify.music.podcast.speedcontrol;

import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ SpeedControlInteractor a;

    public /* synthetic */ a(SpeedControlInteractor speedControlInteractor) {
        this.a = speedControlInteractor;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return SpeedControlInteractor.b(this.a, (Integer) obj);
    }
}
