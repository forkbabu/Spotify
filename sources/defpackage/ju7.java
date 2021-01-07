package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;

/* renamed from: ju7  reason: default package */
public class ju7 implements d {
    private final gu7 a;

    public ju7(gu7 gu7) {
        this.a = gu7;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.a(true);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.a(false);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "SaveProfilePlugin";
    }
}
