package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.a;
import java.util.concurrent.Executor;

public class p {
    private final Executor a;
    private final nh b;
    private final r c;
    private final a d;

    p(Executor executor, nh nhVar, r rVar, a aVar) {
        this.a = executor;
        this.b = nhVar;
        this.c = rVar;
        this.d = aVar;
    }

    static /* synthetic */ Object b(p pVar) {
        for (tg tgVar : pVar.b.P()) {
            pVar.c.a(tgVar, 1);
        }
        return null;
    }

    public void a() {
        this.a.execute(n.a(this));
    }
}
