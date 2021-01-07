package com.spotify.music.homecomponents.singleitem;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ String a;
    public final /* synthetic */ j b;

    public /* synthetic */ a(String str, j jVar) {
        this.a = str;
        this.b = jVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        String str = this.a;
        j jVar = this.b;
        if (ar9.b((PlayerState) obj, str)) {
            jVar.p();
            jVar.g0();
            return;
        }
        jVar.x();
        jVar.s1();
    }
}
