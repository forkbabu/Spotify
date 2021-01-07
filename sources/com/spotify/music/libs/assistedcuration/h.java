package com.spotify.music.libs.assistedcuration;

import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.loggers.InteractionLogger;

public class h {
    private final jz1 a;
    private final c b;
    private final cqe c;

    public h(jz1 jz1, c cVar, cqe cqe) {
        this.a = jz1;
        this.b = cVar;
        this.c = cqe;
    }

    public InteractionLogger a(a aVar) {
        return new InteractionLogger(this.a, this.b, aVar, this.c);
    }
}
