package defpackage;

import com.spotify.pses.v1.proto.Origin;

/* renamed from: yx0  reason: default package */
public class yx0 {
    private boolean a;
    private boolean b;

    /* access modifiers changed from: package-private */
    public Origin a() {
        Origin origin;
        if (!this.b) {
            origin = Origin.APP_LAUNCH;
        } else if (this.a) {
            origin = Origin.MANUAL_LOGOUT;
        } else {
            origin = Origin.FORCED_LOGOUT;
        }
        this.a = false;
        this.b = false;
        return origin;
    }

    public void b() {
        this.a = true;
    }

    public void c() {
        this.b = true;
    }
}
