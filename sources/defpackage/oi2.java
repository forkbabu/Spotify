package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.c;
import com.spotify.mobile.android.service.plugininterfaces.d;

/* renamed from: oi2  reason: default package */
public class oi2 implements d, c {
    private final ni2 a;

    oi2(ni2 ni2) {
        this.a = ni2;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.c
    public void b() {
        this.a.a();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.start();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.stop();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "AppShortcutUpdater";
    }
}
