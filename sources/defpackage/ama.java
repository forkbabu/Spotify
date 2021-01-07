package defpackage;

import com.spotify.performancesdk.timekeeper.h;
import com.spotify.performancesdk.timekeeper.l;

/* renamed from: ama  reason: default package */
public final class ama implements zla {
    private final h a;
    private final l b;

    public ama(h hVar, l lVar) {
        kotlin.jvm.internal.h.e(hVar, "timeKeeper");
        kotlin.jvm.internal.h.e(lVar, "timeReporter");
        this.a = hVar;
        this.b = lVar;
    }

    @Override // defpackage.zla
    public void a() {
        this.a.a(null);
    }

    @Override // defpackage.zla
    public void b() {
        this.a.a(this.b);
    }
}
