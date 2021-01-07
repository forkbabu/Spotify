package com.spotify.music.carmode.nowplaying.def.view.repeat;

import com.spotify.music.libs.carmodeengine.util.y;
import com.spotify.nowplaying.ui.components.repeat.f;

public final class b implements f.a {
    private final e a;
    private final y b;

    public b(e eVar, y yVar) {
        this.a = eVar;
        this.b = yVar;
    }

    public void a() {
        this.a.a();
    }

    @Override // com.spotify.nowplaying.ui.components.repeat.f.a
    public void b() {
        this.a.b();
    }

    public void d(d dVar) {
        this.a.c(dVar);
        if (this.b.b()) {
            ((CarModeRepeatButton) dVar).setVisibility(8);
        } else {
            ((CarModeRepeatButton) dVar).setVisibility(0);
        }
    }
}
