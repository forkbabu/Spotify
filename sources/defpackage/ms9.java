package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;

/* renamed from: ms9  reason: default package */
public final class ms9 implements fjf<WifiManager> {
    private final wlf<Context> a;

    public ms9(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        WifiManager wifiManager = (WifiManager) this.a.get().getApplicationContext().getSystemService("wifi");
        yif.g(wifiManager, "Cannot return null from a non-@Nullable @Provides method");
        return wifiManager;
    }
}
