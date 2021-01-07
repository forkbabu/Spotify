package defpackage;

import android.os.Bundle;

/* renamed from: b34  reason: default package */
public final class b34 implements fjf<a34> {
    private final wlf<Bundle> a;

    public b34(wlf<Bundle> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a34(this.a.get());
    }
}
