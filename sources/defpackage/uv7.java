package defpackage;

import android.content.Context;
import androidx.core.app.q;

/* renamed from: uv7  reason: default package */
public final class uv7 implements fjf<q> {
    private final wlf<Context> a;

    public uv7(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return q.e(this.a.get());
    }
}
