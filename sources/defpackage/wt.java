package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: wt  reason: default package */
final class wt implements vt {
    wt(xt xtVar) {
    }

    @Override // defpackage.vt
    public final ScheduledExecutorService a(int i, int i2) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
