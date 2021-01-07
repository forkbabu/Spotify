package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.x;

/* renamed from: m55  reason: default package */
public final class m55 implements fjf<Boolean> {
    private final wlf<Context> a;

    public m55(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(!x.g(this.a.get()));
    }
}
