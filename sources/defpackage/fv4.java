package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;

/* renamed from: fv4  reason: default package */
public class fv4 implements d {
    private final ev4 a;

    public fv4(ev4 ev4) {
        this.a = ev4;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.b();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.c();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "DataSaverModeObserver";
    }
}
