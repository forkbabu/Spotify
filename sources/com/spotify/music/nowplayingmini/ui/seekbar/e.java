package com.spotify.music.nowplayingmini.ui.seekbar;

import com.spotify.nowplaying.ui.components.controls.seekbar.g;
import com.spotify.nowplaying.ui.components.controls.seekbar.h;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;

public class e implements g.a {
    private final d a;
    private final io.reactivex.g<PlayerState> b;
    private final io.reactivex.g<dqd> c;
    private final h d;
    private final q e = new q();
    private int f;
    private boolean g;
    private String h;
    private g i;

    public e(d dVar, io.reactivex.g<PlayerState> gVar, io.reactivex.g<dqd> gVar2, h hVar) {
        this.a = dVar;
        this.b = gVar;
        this.c = gVar2;
        this.d = hVar;
    }

    public static void c(e eVar, PlayerState playerState) {
        eVar.getClass();
        eVar.h = playerState.track().get().uri();
        boolean isEmpty = playerState.restrictions().disallowSeekingReasons().isEmpty();
        if (eVar.g && !isEmpty) {
            eVar.i.u();
        }
        eVar.i.setSeekingEnabled(isEmpty);
    }

    public static void d(e eVar, dqd dqd) {
        if (!eVar.g) {
            eVar.f = (int) dqd.b();
            eVar.i.setDuration((int) dqd.a());
            eVar.i.setPosition(eVar.f);
            eVar.i.setPositionText(eVar.f);
        }
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g.a
    public void a() {
        this.i.setPositionText(this.f);
        this.g = false;
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.g.a
    public void b(int i2, boolean z) {
        this.g = z;
        if (!z) {
            this.d.q(this.h, i2);
            this.e.a(this.a.a(c.g((long) i2)).subscribe(a.a, c.a));
        }
        this.i.setPositionText(i2);
    }

    public void e(g gVar) {
        gVar.getClass();
        this.i = gVar;
        gVar.setListener(this);
        this.e.a(this.b.subscribe(new b(this)));
        this.e.a(this.c.subscribe(new d(this)));
    }

    public void f() {
        this.i.setListener(null);
        this.e.c();
    }
}
