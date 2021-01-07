package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.spotify.playlist.models.j;
import io.reactivex.functions.l;

public final /* synthetic */ class z implements l {
    public final /* synthetic */ o0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ z(o0 o0Var, String str) {
        this.a = o0Var;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.f(this.b, (j) obj);
    }
}
