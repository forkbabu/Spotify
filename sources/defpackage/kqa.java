package defpackage;

import android.content.Context;

/* renamed from: kqa  reason: default package */
public final class kqa implements fjf<jqa> {
    private final wlf<Context> a;

    public kqa(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jqa(this.a.get());
    }
}
