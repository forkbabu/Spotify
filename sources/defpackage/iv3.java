package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;

/* renamed from: iv3  reason: default package */
public class iv3 implements d {
    private final hv3 a;

    public iv3(hv3 hv3) {
        this.a = hv3;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.e();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.d();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "ExternalAccessoryConnectorPlugin";
    }
}
