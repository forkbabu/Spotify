package defpackage;

import android.content.Context;

/* renamed from: m3d  reason: default package */
public final class m3d implements fjf<l3d> {
    private final wlf<Context> a;

    public m3d(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l3d(this.a.get());
    }
}
