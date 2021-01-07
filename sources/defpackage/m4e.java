package defpackage;

import android.content.Context;
import defpackage.l4e;

/* renamed from: m4e  reason: default package */
public final class m4e implements fjf<l4e.a> {
    private final wlf<Context> a;

    public m4e(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l4e.a(this.a.get());
    }
}
