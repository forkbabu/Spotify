package com.spotify.performancesdk.timekeeper;

import java.util.HashSet;
import kotlin.jvm.internal.h;

public final class TimeKeeperImpl implements h {
    private volatile l a;
    private final HashSet<k> b;
    private final g c;

    public TimeKeeperImpl(g gVar, int i) {
        e eVar = (i & 1) != 0 ? new e(null, 1) : null;
        h.e(eVar, "synchronizer");
        this.c = eVar;
        this.b = new HashSet<>(50);
    }

    public static final void b(TimeKeeperImpl timeKeeperImpl) {
        l lVar = timeKeeperImpl.a;
        if (lVar != null) {
            for (T t : timeKeeperImpl.b) {
                if (t instanceof i) {
                    lVar.b(t);
                } else if (t instanceof j) {
                    lVar.a(t);
                }
            }
            timeKeeperImpl.b.clear();
        }
    }

    @Override // com.spotify.performancesdk.timekeeper.h
    public void a(l lVar) {
        this.a = lVar;
        this.c.a(new TimeKeeperImpl$setTimeReporter$1(this));
    }
}
