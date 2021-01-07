package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;

/* renamed from: nwc  reason: default package */
public class nwc implements d {
    private final jwc a;

    public nwc(jwc jwc) {
        this.a = jwc;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.b(false);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.b(true);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "PreloadAdjustTracker";
    }
}
