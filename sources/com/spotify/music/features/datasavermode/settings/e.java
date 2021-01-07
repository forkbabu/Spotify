package com.spotify.music.features.datasavermode.settings;

import com.spotify.music.libs.viewuri.c;

public class e {
    private final jz1 a;
    private final cqe b;
    private final c c;

    e(jz1 jz1, cqe cqe, c cVar) {
        jz1.getClass();
        this.a = jz1;
        cqe.getClass();
        this.b = cqe;
        cVar.getClass();
        this.c = cVar;
    }

    public void a(boolean z) {
        StringBuilder V0 = je.V0("data-saver-mode-");
        V0.append(z ? "opt-in" : "opt-out");
        this.a.a(new fa1(null, "datasavermode/settings", this.c.toString(), null, -1, null, "hit", V0.toString(), (double) this.b.d()));
    }
}
