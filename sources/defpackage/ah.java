package defpackage;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.p;

/* renamed from: ah  reason: default package */
public final class ah implements fjf<yg> {
    private final wlf<ti> a;
    private final wlf<ti> b;
    private final wlf<ih> c;
    private final wlf<l> d;
    private final wlf<p> e;

    public ah(wlf<ti> wlf, wlf<ti> wlf2, wlf<ih> wlf3, wlf<l> wlf4, wlf<p> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yg(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
