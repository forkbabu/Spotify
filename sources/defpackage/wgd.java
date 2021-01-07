package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.music.spotlets.scannables.view.ScannablesOnboardingActivity;
import com.spotify.music.spotlets.scannables.view.e;

/* renamed from: wgd  reason: default package */
public class wgd implements vgd {
    private e a;
    private final w52 b;
    private final igd c;

    wgd(igd igd, w52 w52) {
        this.b = w52;
        this.c = igd;
    }

    public void a(Activity activity) {
        if (this.b.f(activity, "android.permission.CAMERA")) {
            ((ScannablesOnboardingActivity) this.a).U0(-1);
        } else {
            this.b.c(activity, "android.permission.CAMERA");
        }
    }

    public void b(int i, int i2, Intent intent) {
        if (i != 4660) {
            return;
        }
        if (this.b.b(intent).b("android.permission.CAMERA")) {
            this.c.a();
            this.c.g(true);
            ((ScannablesOnboardingActivity) this.a).U0(-1);
            return;
        }
        this.c.b();
        this.c.g(false);
    }

    public void c(int i) {
        if (i == -1) {
            this.c.f();
            this.c.i(true);
            return;
        }
        this.c.e();
    }

    public void d() {
        ((ScannablesOnboardingActivity) this.a).U0(0);
    }

    public void e(e eVar) {
        this.a = eVar;
    }
}
