package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.performancesdk.timekeeper.l;
import com.spotify.remoteconfig.wc;
import kotlin.jvm.internal.h;

/* renamed from: cma  reason: default package */
public final class cma implements d {
    private final l a;
    private final wc b;

    public cma(l lVar, wc wcVar) {
        h.e(lVar, "timeReporter");
        h.e(wcVar, "perfTrackingProperties");
        this.a = lVar;
        this.b = wcVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        l lVar = this.a;
        if (lVar instanceof uwd) {
            ((uwd) lVar).d(this.b.e());
            ((uwd) this.a).c(true);
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        l lVar = this.a;
        if (lVar instanceof uwd) {
            ((uwd) lVar).c(false);
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "time-keeper";
    }
}
