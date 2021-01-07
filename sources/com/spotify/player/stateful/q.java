package com.spotify.player.stateful;

import android.os.Handler;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public class q {
    private final StatefulPlayerSimulator a;
    private final r b;
    private final s c;
    private final y d;

    public q(bxd bxd, g<PlayerState> gVar, y yVar, cqe cqe) {
        StatefulPlayerSimulator statefulPlayerSimulator = new StatefulPlayerSimulator(gVar.Q(yVar), cqe, new t(cqe), new u(cqe), new Handler());
        this.a = statefulPlayerSimulator;
        this.b = new r(bxd.b(), statefulPlayerSimulator);
        this.c = new s(bxd.d(), statefulPlayerSimulator);
        this.d = yVar;
    }

    public d a() {
        return this.b;
    }

    public com.spotify.player.options.d b() {
        return this.c;
    }

    public g<PlayerState> c() {
        return this.a.e().Q(this.d);
    }
}
