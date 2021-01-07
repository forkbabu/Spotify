package com.spotify.music.nowplaying.drivingmode.view.connectionlabel;

import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.e;
import io.reactivex.functions.f;

public final /* synthetic */ class c implements f {
    public final /* synthetic */ e a;
    public final /* synthetic */ e.b b;

    public /* synthetic */ c(e eVar, e.b bVar) {
        this.a = eVar;
        this.b = bVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        e eVar = this.a;
        eVar.f.remove(this.b);
    }
}
