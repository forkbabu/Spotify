package defpackage;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;

/* renamed from: ky5  reason: default package */
public final class ky5 implements fjf<g<GaiaDevice>> {
    private final wlf<ConnectManager> a;

    public ky5(wlf<ConnectManager> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().p("PlaybackNotificationManager").Y0(BackpressureStrategy.LATEST);
    }
}
