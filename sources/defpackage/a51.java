package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.b;

/* renamed from: a51  reason: default package */
public class a51 implements b {
    private final z41 a;

    public a51(z41 z41) {
        this.a = z41;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void a() {
        this.a.e();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void c() {
        this.a.f();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public String name() {
        return "JumpstartLauncher";
    }
}
