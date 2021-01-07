package defpackage;

import android.content.Context;

/* renamed from: mqb  reason: default package */
public final class mqb implements fjf<lqb> {
    private final wlf<Context> a;

    public mqb(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lqb(this.a);
    }
}
