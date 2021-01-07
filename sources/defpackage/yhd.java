package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.zero.tracker.eventsender.f;

/* renamed from: yhd  reason: default package */
public class yhd implements d {
    private final xhd a;
    private final f b;

    public yhd(xhd xhd, f fVar) {
        this.a = xhd;
        this.b = fVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.b();
        this.b.a();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.e();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "UserTracker";
    }
}
