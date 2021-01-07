package defpackage;

import com.spotify.libs.connect.ConnectManager;

/* renamed from: ux8  reason: default package */
public final class ux8 implements fjf<tx8> {
    private final wlf<ConnectManager> a;

    public ux8(wlf<ConnectManager> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tx8(this.a.get());
    }
}
