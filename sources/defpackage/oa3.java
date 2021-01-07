package defpackage;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.l;

/* renamed from: oa3  reason: default package */
public final class oa3 implements fjf<l.a> {
    private final wlf<ConnectManager> a;

    public oa3(wlf<ConnectManager> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new la3(this.a.get());
    }
}
