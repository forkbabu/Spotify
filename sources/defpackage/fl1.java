package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;

/* renamed from: fl1  reason: default package */
public class fl1 implements d {
    private final cea a;
    private final lea b;

    public fl1(cea cea, lea lea) {
        this.a = cea;
        this.b = lea;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.h();
        this.b.start();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.i();
        this.b.stop();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "ExternalAccessoryLogging";
    }
}
