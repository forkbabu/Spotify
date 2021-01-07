package defpackage;

import android.content.Context;

/* renamed from: mk2  reason: default package */
public final class mk2 implements fjf<lk2> {
    private final wlf<Context> a;
    private final wlf<vk2> b;

    public mk2(wlf<Context> wlf, wlf<vk2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lk2(this.a.get(), this.b.get());
    }
}
