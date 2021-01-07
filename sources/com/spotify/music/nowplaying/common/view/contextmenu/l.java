package com.spotify.music.nowplaying.common.view.contextmenu;

import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.nowplaying.common.view.contextmenu.n;
import com.spotify.music.nowplaying.common.view.share.c;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.disposables.a;
import io.reactivex.g;

public class l implements n.a {
    private final g<PlayerState> a;
    private final g<o> b;
    private final p c;
    private final c d;
    private final lqd e;
    private final a f = new a();
    private o g;
    private PlayerState h;
    private n i;

    public l(g<PlayerState> gVar, g<o> gVar2, p pVar, c cVar, lqd lqd) {
        this.a = gVar;
        this.b = gVar2;
        this.c = pVar;
        this.d = cVar;
        this.e = lqd;
    }

    public static void b(l lVar, o oVar) {
        lVar.g = oVar;
    }

    public static void c(l lVar, PlayerState playerState) {
        lVar.getClass();
        ContextTrack contextTrack = playerState.track().get();
        boolean z = true;
        lVar.i.setVisible(!InterruptionUtil.isInterruptionUri(contextTrack.uri()));
        n nVar = lVar.i;
        LinkType q = l0.z(contextTrack.uri()).q();
        if (!(q == LinkType.TRACK || q == LinkType.SHOW_EPISODE)) {
            z = false;
        }
        nVar.setEnabled(z);
        lVar.h = playerState;
    }

    @Override // com.spotify.music.nowplaying.common.view.contextmenu.n.a
    public void a() {
        this.e.r();
        this.c.b(new k(this.h.track().get().uri(), this.h.contextUri(), this.h), this.g, this.d.apply(this.h));
    }

    public void d(n nVar) {
        nVar.getClass();
        this.i = nVar;
        nVar.setListener(this);
        this.f.b(this.a.subscribe(new c(this)));
        this.f.b(this.b.subscribe(new b(this)));
    }

    public void e() {
        this.i.setListener(null);
        this.f.f();
    }
}
