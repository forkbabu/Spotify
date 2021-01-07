package defpackage;

import com.google.protobuf.u;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.performancesdk.timekeeper.i;
import com.spotify.performancesdk.timekeeper.j;
import com.spotify.performancesdk.timekeeper.l;
import kotlin.jvm.internal.h;

/* renamed from: uwd  reason: default package */
public final class uwd implements l {
    private boolean a;
    private boolean b = true;
    private final gl0<u> c;

    public uwd(gl0<u> gl0) {
        h.e(gl0, "eventPublisher");
        this.c = gl0;
    }

    @Override // com.spotify.performancesdk.timekeeper.l
    public void a(j jVar) {
        h.e(jVar, AppProtocol.LogMessage.SEVERITY_ERROR);
        if (this.b) {
            vwd.b(jVar);
            throw null;
        }
    }

    @Override // com.spotify.performancesdk.timekeeper.l
    public void b(i iVar) {
        h.e(iVar, "timeMeasurement");
        if (this.b) {
            if (this.a) {
                vwd.a(iVar);
                throw null;
            } else {
                vwd.c(iVar);
                throw null;
            }
        }
    }

    public final void c(boolean z) {
        this.a = z;
    }

    public final void d(boolean z) {
        this.b = z;
    }
}
