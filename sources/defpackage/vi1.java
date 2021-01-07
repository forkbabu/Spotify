package defpackage;

import android.content.Context;

/* renamed from: vi1  reason: default package */
public final class vi1 implements fjf<ui1> {
    private final wlf<Context> a;

    public vi1(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ui1(this.a.get());
    }
}
