package com.spotify.music.features.followfeed.persistence;

import kotlin.jvm.internal.h;

public final class d implements c {
    private long a;
    private r25 b;
    private final cqe c;

    public d(cqe cqe) {
        h.e(cqe, "clock");
        this.c = cqe;
    }

    @Override // com.spotify.music.features.followfeed.persistence.c
    public void a(r25 r25) {
        this.a = this.c.d();
        this.b = r25;
    }

    @Override // com.spotify.music.features.followfeed.persistence.c
    public r25 b() {
        if (this.c.d() - this.a < ((long) 120000)) {
            return this.b;
        }
        this.b = null;
        return null;
    }

    @Override // com.spotify.music.features.followfeed.persistence.c
    public void invalidate() {
        this.b = null;
    }
}
