package defpackage;

import android.os.Handler;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.libs.connect.n;

/* renamed from: bs0  reason: default package */
public final class bs0 implements fjf<as0> {
    private final wlf<Handler> a;
    private final wlf<FireAndForgetResolver> b;
    private final wlf<n> c;

    public bs0(wlf<Handler> wlf, wlf<FireAndForgetResolver> wlf2, wlf<n> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new as0(this.a.get(), this.b.get(), this.c.get());
    }
}
