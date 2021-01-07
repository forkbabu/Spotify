package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.remoteconfig.ek;
import kotlin.jvm.internal.h;

/* renamed from: tp1  reason: default package */
public final class tp1 implements d {
    private final mp1 a;
    private final pp1 b;
    private final ek c;

    public tp1(mp1 mp1, pp1 pp1, ek ekVar) {
        h.e(mp1, "inAppMessageManager");
        h.e(pp1, "localNotificationManager");
        h.e(ekVar, "skipLimitPivotToOnDemandProperties");
        this.a = mp1;
        this.b = pp1;
        this.c = ekVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        if (this.c.b()) {
            this.a.e();
            this.b.getClass();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        if (this.c.b()) {
            this.a.f();
            this.b.a();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "SkipLimitReachedPlugin";
    }
}
