package defpackage;

import android.content.Context;

/* renamed from: xfc  reason: default package */
public final class xfc implements fjf<wfc> {
    private final wlf<Context> a;

    public xfc(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wfc(this.a.get());
    }
}
