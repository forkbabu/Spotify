package defpackage;

import android.content.Context;

/* renamed from: ela  reason: default package */
public final class ela implements fjf<dla> {
    private final wlf<Context> a;

    public ela(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dla(this.a.get());
    }
}
