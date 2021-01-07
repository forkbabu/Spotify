package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import com.google.protobuf.u;
import com.spotify.contexts.MonotonicClock;

/* access modifiers changed from: package-private */
/* renamed from: jk0  reason: default package */
public class jk0 implements fk0 {
    private final lk0 a;
    private final kk0 b;

    jk0(lk0 lk0, kk0 kk0) {
        this.a = lk0;
        this.b = kk0;
    }

    @Override // defpackage.fk0
    public u c() {
        MonotonicClock.b l = MonotonicClock.l();
        l.m((long) this.b.a());
        this.a.getClass();
        l.n(SystemClock.elapsedRealtime());
        return l.build();
    }

    @Override // defpackage.fk0
    public /* synthetic */ Pair e() {
        return ek0.a(this);
    }

    @Override // defpackage.fk0
    public String f() {
        return "context_monotonic_clock";
    }
}
