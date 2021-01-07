package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;

/* renamed from: b92  reason: default package */
public class b92 implements d {
    private final a92 a;

    public b92(a92 a92) {
        this.a = a92;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.c();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.a();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "WazeInterAppConnection";
    }
}
