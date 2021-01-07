package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.spotify.libs.instrumentation.performance.r;
import com.spotify.performancesdk.timekeeper.m;
import defpackage.ui0;
import kotlin.jvm.internal.h;

/* renamed from: vi0  reason: default package */
public final class vi0 implements fjf<fre> {
    private final wlf<r> a;
    private final wlf<m> b;

    public vi0(wlf<r> wlf, wlf<m> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        r rVar = this.a.get();
        m mVar = this.b.get();
        ui0.a aVar = ui0.a;
        h.e(rVar, "viewLoadPublisher");
        h.e(mVar, "monotonicClock");
        return new fre(rVar, mVar, new Handler(Looper.getMainLooper()));
    }
}
