package defpackage;

import android.content.Context;

/* renamed from: r79  reason: default package */
public final class r79 implements fjf<q79> {
    private final wlf<Context> a;

    public r79(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q79(this.a.get());
    }
}
