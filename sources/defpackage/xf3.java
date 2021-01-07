package defpackage;

import android.content.Context;

/* renamed from: xf3  reason: default package */
public final class xf3 implements fjf<wf3> {
    private final wlf<Context> a;

    public xf3(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wf3(this.a.get());
    }
}
