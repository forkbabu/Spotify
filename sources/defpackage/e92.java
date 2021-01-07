package defpackage;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;

/* renamed from: e92  reason: default package */
public class e92 {
    private final kd0 a;

    public e92(kd0 kd0) {
        this.a = kd0;
    }

    public void a(String str) {
        Logger.g("Start Waze featrue by %s", str);
        this.a.c(new Intent(str));
    }

    public void b() {
        Logger.g("Stop Waze feature", new Object[0]);
        this.a.c(new Intent("com.spotify.music.internal.waze.STOP"));
    }
}
