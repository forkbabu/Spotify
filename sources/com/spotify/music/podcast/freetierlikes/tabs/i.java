package com.spotify.music.podcast.freetierlikes.tabs;

import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.p2;

public class i {
    private final cqe a;
    private final jz1 b;
    private final a c;
    private final c d;
    private final ere e;

    public i(cqe cqe, jz1 jz1, a aVar, c cVar, ere ere) {
        this.a = cqe;
        this.b = jz1;
        this.c = aVar;
        this.d = cVar;
        this.e = ere;
    }

    public void a(String str) {
        this.b.a(new fa1(null, this.c.path(), this.d.toString(), "", -1, str, InteractionLogger.InteractionType.HIT.toString(), "navigate-to-browse-podcast", (double) this.a.d()));
        this.e.a(new p2(this.d.toString()).b().a(str));
    }
}
