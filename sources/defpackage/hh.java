package defpackage;

import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;
import com.google.android.datatransport.runtime.synchronization.a;
import java.util.concurrent.Executor;

/* renamed from: hh  reason: default package */
public final class hh implements fjf<gh> {
    private final wlf<Executor> a;
    private final wlf<e> b;
    private final wlf<r> c;
    private final wlf<nh> d;
    private final wlf<a> e;

    public hh(wlf<Executor> wlf, wlf<e> wlf2, wlf<r> wlf3, wlf<nh> wlf4, wlf<a> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gh(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
