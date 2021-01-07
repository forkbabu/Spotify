package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.x;

/* renamed from: fjb  reason: default package */
public final class fjb implements fjf<Boolean> {
    private final wlf<Context> a;

    public fjb(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(!x.g(this.a.get()));
    }
}
