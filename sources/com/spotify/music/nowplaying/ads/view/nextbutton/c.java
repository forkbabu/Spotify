package com.spotify.music.nowplaying.ads.view.nextbutton;

import com.spotify.nowplaying.ui.components.controls.next.e;
import com.spotify.nowplaying.ui.components.controls.next.i;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;

public class c implements i.a, ys3 {
    private final g<Boolean> a;
    private final g<PlayerState> b;
    private final uec c;
    private final e d;
    private final q e = new q();
    private i f;
    private boolean g;
    private PlayerState h;

    public c(g<Boolean> gVar, g<PlayerState> gVar2, uec uec, e eVar) {
        this.a = gVar;
        this.b = gVar2;
        this.c = uec;
        this.d = eVar;
    }

    public static void c(c cVar, boolean z) {
        cVar.f.setNextEnabled(z);
        cVar.g = z;
    }

    public static void d(c cVar, PlayerState playerState) {
        cVar.h = playerState;
    }

    @Override // defpackage.ys3
    public void a(boolean z) {
        if (z) {
            this.f.setNextVisible(false);
        } else {
            this.f.setNextVisible(true);
        }
    }

    @Override // com.spotify.nowplaying.ui.components.controls.next.i.a
    public void b() {
        String str;
        if (this.g) {
            String uri = this.h.track().get().uri();
            e eVar = this.d;
            PlayerState playerState = this.h;
            if (playerState.nextTracks().isEmpty()) {
                str = "";
            } else {
                str = playerState.nextTracks().get(0).uri();
            }
            eVar.z(uri, str);
            this.e.a(this.c.a().subscribe());
        }
    }

    public void e(i iVar) {
        this.f = iVar;
        iVar.setListener(this);
        this.e.a(this.a.subscribe(new a(this)));
        this.e.a(this.b.subscribe(new b(this)));
    }

    public void f() {
        this.e.c();
        this.f.setListener(null);
    }
}
