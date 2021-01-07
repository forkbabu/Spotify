package com.spotify.music.carmode.nowplaying.common.view.voicebutton;

import com.spotify.music.carmode.nowplaying.common.view.voicebutton.e;
import com.spotify.music.libs.carmodeengine.util.y;
import com.spotify.music.navigation.t;
import com.spotify.rxjava2.p;
import io.reactivex.s;

public class c implements e.a {
    private final uo2 a;
    private final t b;
    private final y c;
    private final s<Boolean> d;
    private final p e = new p();
    private final io.reactivex.y f;
    private e g;

    public c(uo2 uo2, t tVar, y yVar, s<Boolean> sVar, io.reactivex.y yVar2) {
        this.a = uo2;
        this.b = tVar;
        this.c = yVar;
        this.d = sVar;
        this.f = yVar2;
    }

    public static void a(c cVar, boolean z) {
        cVar.g.setEnabled(z);
    }

    public void b(e eVar) {
        this.g = eVar;
        eVar.setListener(this);
        if (this.c.b()) {
            ((CarModeVoiceSearchButton) eVar).setVisibility(0);
        } else {
            ((CarModeVoiceSearchButton) eVar).setVisibility(8);
        }
        this.e.b(this.d.o0(this.f).subscribe(new b(this)));
    }

    public void c() {
        this.e.a();
    }

    public void d() {
        this.a.e();
        this.b.d("spotify:voice");
    }
}
