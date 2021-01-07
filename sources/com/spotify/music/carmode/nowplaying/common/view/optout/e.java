package com.spotify.music.carmode.nowplaying.common.view.optout;

import com.spotify.music.carmode.nowplaying.common.view.optout.g;
import com.spotify.music.libs.carmodeengine.util.y;
import com.spotify.rxjava2.p;

public class e implements g.a {
    private final to2 a;
    private final h b;
    private final y c;
    private final io.reactivex.y d;
    private final p e = new p();
    private g f;

    public e(to2 to2, h hVar, y yVar, io.reactivex.y yVar2) {
        this.a = to2;
        this.b = hVar;
        this.c = yVar;
        this.d = yVar2;
    }

    public static void a(e eVar, Boolean bool) {
        if (eVar.f == null) {
            return;
        }
        if (bool.booleanValue()) {
            ((CarModeOptOutButton) eVar.f).setVisibility(8);
        } else {
            ((CarModeOptOutButton) eVar.f).setVisibility(0);
        }
    }

    public void b() {
        this.a.f();
        this.b.a();
    }

    public void c(g gVar) {
        this.f = gVar;
        gVar.setListener(this);
        this.e.b(this.c.c().o0(this.d).subscribe(new b(this)));
    }

    public void d() {
        this.e.a();
    }
}
