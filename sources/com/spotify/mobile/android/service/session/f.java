package com.spotify.mobile.android.service.session;

import com.google.common.base.Optional;
import io.reactivex.s;

public class f {
    private final cqe a;
    private final s<ServerTime> b;

    f(h hVar, cqe cqe) {
        this.b = hVar.a().E().v0(1).h1();
        this.a = cqe;
    }

    public /* synthetic */ Optional a(long j, long j2) {
        if (j > 0) {
            return Optional.of(Long.valueOf(((this.a.d() - j2) / 1000) + j));
        }
        return Optional.absent();
    }

    public s<e> b() {
        return this.b.j0(new b(this));
    }
}
