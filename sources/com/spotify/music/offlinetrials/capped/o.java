package com.spotify.music.offlinetrials.capped;

import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.ImpressionLogger;

public class o {
    private final a a;
    private final jz1 b;
    private final cqe c;

    public o(a aVar, jz1 jz1, cqe cqe) {
        this.a = aVar;
        this.b = jz1;
        this.c = cqe;
    }

    public void a() {
        this.b.a(new ga1(null, this.a.path(), ViewUris.Z.toString(), null, -1, null, "hit", "dismiss", (double) this.c.d(), null));
    }

    public void b() {
        this.b.a(new da1(null, this.a.path(), ViewUris.Z.toString(), null, -1, null, ImpressionLogger.ImpressionType.DIALOG.toString(), ImpressionLogger.RenderType.DIALOG.toString(), (double) this.c.d()));
    }
}
