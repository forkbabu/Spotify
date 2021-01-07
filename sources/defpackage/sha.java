package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.b;
import com.spotify.mobile.android.service.plugininterfaces.d;

/* renamed from: sha  reason: default package */
public class sha implements b, d {
    private final rha a;

    public sha(rha rha) {
        this.a = rha;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void a() {
        this.a.e();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void c() {
        this.a.f(false);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.f(true);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public String name() {
        return "AuxStateListenerPlugin";
    }
}
