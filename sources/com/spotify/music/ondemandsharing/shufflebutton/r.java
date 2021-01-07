package com.spotify.music.ondemandsharing.shufflebutton;

import com.spotify.player.model.PlayerState;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.y;

public class r {
    private final g<PlayerState> a;
    private final y b;
    private b c;

    public r(g<PlayerState> gVar, y yVar) {
        this.a = gVar;
        this.b = yVar;
    }

    public void a(q qVar) {
        this.c = this.a.Q(this.b).subscribe(new f(qVar), g.a);
    }

    public void b() {
        this.c.dispose();
    }
}
