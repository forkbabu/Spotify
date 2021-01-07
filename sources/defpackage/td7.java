package defpackage;

import android.content.Context;

/* renamed from: td7  reason: default package */
public final class td7 implements fjf<sd7> {
    private final wlf<Context> a;

    public td7(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sd7(this.a.get());
    }
}
