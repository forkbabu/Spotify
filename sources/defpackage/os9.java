package defpackage;

import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;

/* renamed from: os9  reason: default package */
public final class os9 implements fjf<ns9> {
    private final wlf<ws9> a;
    private final wlf<rt9> b;
    private final wlf<WifiManager> c;
    private final wlf<ConnectivityManager> d;

    public os9(wlf<ws9> wlf, wlf<rt9> wlf2, wlf<WifiManager> wlf3, wlf<ConnectivityManager> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ns9(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
