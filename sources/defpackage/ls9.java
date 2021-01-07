package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: ls9  reason: default package */
public final class ls9 implements fjf<ConnectivityManager> {
    private final wlf<Context> a;

    public ls9(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.get().getApplicationContext().getSystemService("connectivity");
        yif.g(connectivityManager, "Cannot return null from a non-@Nullable @Provides method");
        return connectivityManager;
    }
}
