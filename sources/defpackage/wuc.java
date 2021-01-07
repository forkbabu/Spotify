package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.g;

/* renamed from: wuc  reason: default package */
public final class wuc implements fjf<vuc> {
    private final wlf<g<SessionState>> a;
    private final wlf<bqa> b;

    public wuc(wlf<g<SessionState>> wlf, wlf<bqa> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vuc(this.a.get(), this.b.get());
    }
}
