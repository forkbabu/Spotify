package defpackage;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import defpackage.sx9;

/* renamed from: nx9  reason: default package */
public class nx9 implements sx9.a {
    private final xw9 a;
    private final dx9 b;
    private final yw9 c;
    private final sx9 d;
    private final zw9 e;

    public nx9(xw9 xw9, dx9 dx9, yw9 yw9, sx9 sx9, zw9 zw9) {
        this.d = sx9;
        xw9.getClass();
        this.a = xw9;
        dx9.getClass();
        this.b = dx9;
        this.c = yw9;
        this.e = zw9;
        sx9.c(this);
    }

    private void e(boolean z) {
        if (this.c.a()) {
            this.b.getClass();
            FirebaseCrashlytics instance = FirebaseCrashlytics.getInstance();
            instance.setUserId(this.d.a());
            if (!z) {
                instance.setCustomKey("uptime", Long.toString(this.e.h()));
                instance.setCustomKey("local_playback", this.e.d());
                instance.setCustomKey("remote_playback", this.e.e());
                instance.setCustomKey("foreground", this.e.c());
                instance.setCustomKey("spotify_service_started", this.e.g());
                instance.setCustomKey("spotify_service_bound", this.e.f());
                instance.setCustomKey("car_detected", this.e.j());
                instance.setCustomKey("headset_connected", this.e.k());
                instance.setCustomKey("bluetooth_connected", this.e.i());
                instance.setCustomKey("core_state", this.e.b());
            }
            this.a.b(instance, z);
        }
    }

    public void a() {
        e(false);
    }

    public void b() {
        e(true);
    }

    public void c() {
        this.d.e();
    }

    public void d() {
        this.d.f();
    }
}
