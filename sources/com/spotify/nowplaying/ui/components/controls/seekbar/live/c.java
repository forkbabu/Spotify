package com.spotify.nowplaying.ui.components.controls.seekbar.live;

import com.spotify.player.model.ContextTrack;
import com.spotify.rxjava2.p;
import io.reactivex.g;

public class c {
    private final g<ContextTrack> a;
    private final p b = new p();

    public c(g<ContextTrack> gVar) {
        this.a = gVar;
    }

    public void a(e eVar) {
        p pVar = this.b;
        g<R> O = this.a.O(b.a);
        eVar.getClass();
        pVar.b(O.subscribe(new a(eVar)));
    }

    public void b() {
        this.b.a();
    }
}
