package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;
import kotlin.jvm.internal.h;

/* renamed from: ffd  reason: default package */
public final class ffd implements d {
    private final ajf<efd> a;
    private final ajf<xad> b;
    private final ajf<lad> c;
    private final ajf<cfd> f;

    public ffd(ajf<efd> ajf, ajf<xad> ajf2, ajf<lad> ajf3, ajf<cfd> ajf4) {
        h.e(ajf, "socialListeningLifecycle");
        h.e(ajf2, "socialListeningNotifications");
        h.e(ajf3, "nearbyManager");
        h.e(ajf4, "socialListeningProperties");
        this.a = ajf;
        this.b = ajf2;
        this.c = ajf3;
        this.f = ajf4;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.get().start();
        this.b.get().start();
        if (this.f.get().g()) {
            this.c.get().start();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        if (this.f.get().g()) {
            this.c.get().stop();
        }
        this.b.get().stop();
        this.a.get().stop();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "SocialListeningPlugin";
    }
}
