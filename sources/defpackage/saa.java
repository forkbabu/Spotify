package defpackage;

import android.content.Context;

/* renamed from: saa  reason: default package */
public final class saa implements fjf<raa> {
    private final wlf<Context> a;

    public saa(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new raa(this.a.get());
    }
}
